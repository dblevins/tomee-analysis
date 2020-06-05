package asm.org.apache.activemq.openwire.v4;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/openwire/v4/MarshallerFactory", null, "java/lang/Object", null);

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
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "marshaller", "[Lorg/apache/activemq/openwire/DataStreamMarshaller;");
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "marshaller", "[Lorg/apache/activemq/openwire/DataStreamMarshaller;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/activemq/openwire/DataStreamMarshaller");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "marshaller", "[Lorg/apache/activemq/openwire/DataStreamMarshaller;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ActiveMQBlobMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ActiveMQBlobMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ActiveMQBytesMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ActiveMQBytesMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ActiveMQMapMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ActiveMQMapMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ActiveMQMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ActiveMQMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ActiveMQObjectMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ActiveMQObjectMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ActiveMQQueueMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ActiveMQQueueMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ActiveMQStreamMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ActiveMQStreamMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ActiveMQTempQueueMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ActiveMQTempQueueMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ActiveMQTempTopicMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ActiveMQTempTopicMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ActiveMQTextMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ActiveMQTextMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ActiveMQTopicMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ActiveMQTopicMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/BrokerIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/BrokerIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/BrokerInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/BrokerInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ConnectionControlMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ConnectionControlMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ConnectionErrorMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ConnectionErrorMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ConnectionIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ConnectionIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ConnectionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ConnectionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ConsumerControlMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ConsumerControlMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ConsumerIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ConsumerIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ConsumerInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ConsumerInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ControlCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ControlCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/DataArrayResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/DataArrayResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/DataResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/DataResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/DestinationInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/DestinationInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/DiscoveryEventMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/DiscoveryEventMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ExceptionResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ExceptionResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/FlushCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/FlushCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/IntegerResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/IntegerResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/JournalQueueAckMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/JournalQueueAckMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/JournalTopicAckMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/JournalTopicAckMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/JournalTraceMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/JournalTraceMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/JournalTransactionMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/JournalTransactionMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/KeepAliveInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/KeepAliveInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/LastPartialCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/LastPartialCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/LocalTransactionIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/LocalTransactionIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/MessageAckMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/MessageAckMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/MessageDispatchMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/MessageDispatchMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/MessageDispatchNotificationMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/MessageDispatchNotificationMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/MessageIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/MessageIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/MessagePullMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/MessagePullMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/NetworkBridgeFilterMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/NetworkBridgeFilterMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/PartialCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/PartialCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ProducerAckMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ProducerAckMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ProducerIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ProducerIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ProducerInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ProducerInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/RemoveInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/RemoveInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/RemoveSubscriptionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/RemoveSubscriptionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ReplayCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ReplayCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/SessionIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/SessionIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/SessionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/SessionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/ShutdownInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/ShutdownInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/SubscriptionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/SubscriptionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/TransactionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/TransactionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/WireFormatInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/WireFormatInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v4/XATransactionIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v4/XATransactionIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v4/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}