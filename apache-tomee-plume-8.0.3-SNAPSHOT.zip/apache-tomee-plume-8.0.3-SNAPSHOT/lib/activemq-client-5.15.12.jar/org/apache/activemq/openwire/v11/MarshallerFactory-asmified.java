package asm.org.apache.activemq.openwire.v11;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class MarshallerFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/openwire/v11/MarshallerFactory", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "marshaller", "[Lorg/apache/activemq/openwire/DataStreamMarshaller;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "marshaller", "[Lorg/apache/activemq/openwire/DataStreamMarshaller;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/openwire/DataStreamMarshaller", "getDataStructureType", "()B", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createMarshallerMap", "(Lorg/apache/activemq/openwire/OpenWireFormat;)[Lorg/apache/activemq/openwire/DataStreamMarshaller;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "marshaller", "[Lorg/apache/activemq/openwire/DataStreamMarshaller;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/activemq/openwire/DataStreamMarshaller");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "marshaller", "[Lorg/apache/activemq/openwire/DataStreamMarshaller;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ActiveMQBlobMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ActiveMQBlobMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ActiveMQBytesMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ActiveMQBytesMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ActiveMQMapMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ActiveMQMapMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ActiveMQMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ActiveMQMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ActiveMQObjectMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ActiveMQObjectMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ActiveMQQueueMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ActiveMQQueueMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ActiveMQStreamMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ActiveMQStreamMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ActiveMQTempQueueMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ActiveMQTempQueueMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ActiveMQTempTopicMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ActiveMQTempTopicMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ActiveMQTextMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ActiveMQTextMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ActiveMQTopicMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ActiveMQTopicMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/BrokerIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/BrokerIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/BrokerInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/BrokerInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ConnectionControlMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ConnectionControlMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ConnectionErrorMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ConnectionErrorMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ConnectionIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ConnectionIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ConnectionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ConnectionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ConsumerControlMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ConsumerControlMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ConsumerIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ConsumerIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ConsumerInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ConsumerInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ControlCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ControlCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/DataArrayResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/DataArrayResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/DataResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/DataResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/DestinationInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/DestinationInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/DiscoveryEventMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/DiscoveryEventMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ExceptionResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ExceptionResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/FlushCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/FlushCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/IntegerResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/IntegerResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/JournalQueueAckMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/JournalQueueAckMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/JournalTopicAckMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/JournalTopicAckMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/JournalTraceMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/JournalTraceMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/JournalTransactionMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/JournalTransactionMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/KeepAliveInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/KeepAliveInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/LastPartialCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/LastPartialCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/LocalTransactionIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/LocalTransactionIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/MessageAckMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/MessageAckMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/MessageDispatchMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/MessageDispatchMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/MessageDispatchNotificationMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/MessageDispatchNotificationMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/MessageIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/MessageIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/MessagePullMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/MessagePullMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/NetworkBridgeFilterMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/NetworkBridgeFilterMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/PartialCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/PartialCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ProducerAckMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ProducerAckMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ProducerIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ProducerIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ProducerInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ProducerInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/RemoveInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/RemoveInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/RemoveSubscriptionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/RemoveSubscriptionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ReplayCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ReplayCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/SessionIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/SessionIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/SessionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/SessionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/ShutdownInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/ShutdownInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/SubscriptionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/SubscriptionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/TransactionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/TransactionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/WireFormatInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/WireFormatInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v11/XATransactionIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v11/XATransactionIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v11/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}