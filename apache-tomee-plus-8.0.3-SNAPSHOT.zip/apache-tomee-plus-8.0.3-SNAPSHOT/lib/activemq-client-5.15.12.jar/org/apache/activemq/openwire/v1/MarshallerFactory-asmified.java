package asm.org.apache.activemq.openwire.v1;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/activemq/openwire/v1/MarshallerFactory", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MARSHALLER", "[Lorg/apache/activemq/openwire/DataStreamMarshaller;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "MARSHALLER", "[Lorg/apache/activemq/openwire/DataStreamMarshaller;");
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "MARSHALLER", "[Lorg/apache/activemq/openwire/DataStreamMarshaller;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/activemq/openwire/DataStreamMarshaller");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "MARSHALLER", "[Lorg/apache/activemq/openwire/DataStreamMarshaller;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/LocalTransactionIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/LocalTransactionIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/PartialCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/PartialCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/IntegerResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/IntegerResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ActiveMQQueueMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ActiveMQQueueMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ActiveMQObjectMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ActiveMQObjectMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ConnectionIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ConnectionIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ConnectionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ConnectionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ProducerInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ProducerInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/MessageDispatchNotificationMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/MessageDispatchNotificationMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/SessionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/SessionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/TransactionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/TransactionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ActiveMQStreamMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ActiveMQStreamMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/MessageAckMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/MessageAckMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ProducerIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ProducerIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/MessageIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/MessageIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ActiveMQTempQueueMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ActiveMQTempQueueMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/RemoveSubscriptionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/RemoveSubscriptionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/SessionIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/SessionIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/DataArrayResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/DataArrayResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/JournalQueueAckMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/JournalQueueAckMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ConnectionErrorMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ConnectionErrorMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ConsumerInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ConsumerInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/XATransactionIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/XATransactionIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/JournalTraceMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/JournalTraceMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ConsumerIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ConsumerIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ActiveMQTextMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ActiveMQTextMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/SubscriptionInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/SubscriptionInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/JournalTransactionMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/JournalTransactionMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ControlCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ControlCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/LastPartialCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/LastPartialCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/NetworkBridgeFilterMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/NetworkBridgeFilterMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ActiveMQBytesMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ActiveMQBytesMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/WireFormatInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/WireFormatInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ActiveMQTempTopicMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ActiveMQTempTopicMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/DiscoveryEventMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/DiscoveryEventMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ReplayCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ReplayCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ActiveMQTopicMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ActiveMQTopicMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/BrokerInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/BrokerInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/DestinationInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/DestinationInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ShutdownInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ShutdownInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/DataResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/DataResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ConnectionControlMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ConnectionControlMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/KeepAliveInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/KeepAliveInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/FlushCommandMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/FlushCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ConsumerControlMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ConsumerControlMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/JournalTopicAckMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/JournalTopicAckMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/BrokerIdMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/BrokerIdMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/MessageDispatchMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/MessageDispatchMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ActiveMQMapMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ActiveMQMapMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ActiveMQMessageMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ActiveMQMessageMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/RemoveInfoMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/RemoveInfoMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/v1/ExceptionResponseMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v1/ExceptionResponseMarshaller", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/openwire/v1/MarshallerFactory", "add", "(Lorg/apache/activemq/openwire/DataStreamMarshaller;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
