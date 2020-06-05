package asm.org.apache.activemq.openwire.v6;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/openwire/v6/MarshallerFactory", null, "java/lang/Object", null);

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
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "marshaller", "[Lorg/apache/activemq/openwire/DataStreamMarshaller;");
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "marshaller", "[Lorg/apache/activemq/openwire/DataStreamMarshaller;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/activemq/openwire/DataStreamMarshaller");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "marshaller", "[Lorg/apache/activemq/openwire/DataStreamMarshaller;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ActiveMQBlobMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ActiveMQBlobMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ActiveMQBytesMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ActiveMQBytesMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ActiveMQMapMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ActiveMQMapMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ActiveMQMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ActiveMQMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ActiveMQObjectMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ActiveMQObjectMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ActiveMQQueueMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ActiveMQQueueMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ActiveMQStreamMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ActiveMQStreamMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ActiveMQTempQueueMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ActiveMQTempQueueMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ActiveMQTempTopicMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ActiveMQTempTopicMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ActiveMQTextMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ActiveMQTextMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ActiveMQTopicMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ActiveMQTopicMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/BrokerIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/BrokerIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/BrokerInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/BrokerInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ConnectionControlMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ConnectionControlMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ConnectionErrorMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ConnectionErrorMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ConnectionIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ConnectionIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ConnectionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ConnectionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ConsumerControlMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ConsumerControlMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ConsumerIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ConsumerIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ConsumerInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ConsumerInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ControlCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ControlCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/DataArrayResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/DataArrayResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/DataResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/DataResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/DestinationInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/DestinationInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/DiscoveryEventMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/DiscoveryEventMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ExceptionResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ExceptionResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/FlushCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/FlushCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/IntegerResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/IntegerResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/JournalQueueAckMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/JournalQueueAckMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/JournalTopicAckMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/JournalTopicAckMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/JournalTraceMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/JournalTraceMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/JournalTransactionMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/JournalTransactionMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/KeepAliveInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/KeepAliveInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/LastPartialCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/LastPartialCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/LocalTransactionIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/LocalTransactionIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/MessageAckMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/MessageAckMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/MessageDispatchMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/MessageDispatchMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/MessageDispatchNotificationMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/MessageDispatchNotificationMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/MessageIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/MessageIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/MessagePullMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/MessagePullMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/NetworkBridgeFilterMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/NetworkBridgeFilterMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/PartialCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/PartialCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ProducerAckMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ProducerAckMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ProducerIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ProducerIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ProducerInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ProducerInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/RemoveInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/RemoveInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/RemoveSubscriptionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/RemoveSubscriptionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ReplayCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ReplayCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/SessionIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/SessionIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/SessionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/SessionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/ShutdownInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/ShutdownInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/SubscriptionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/SubscriptionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/TransactionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/TransactionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/WireFormatInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/WireFormatInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v6/XATransactionIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v6/XATransactionIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v6/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}