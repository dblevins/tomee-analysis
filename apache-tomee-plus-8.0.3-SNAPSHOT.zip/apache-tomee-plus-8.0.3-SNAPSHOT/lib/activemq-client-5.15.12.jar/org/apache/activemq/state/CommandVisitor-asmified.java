package asm.org.apache.activemq.state;
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
public class CommandVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/activemq/state/CommandVisitor", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processAddConnection", "(Lorg/apache/activemq/command/ConnectionInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processAddSession", "(Lorg/apache/activemq/command/SessionInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processAddProducer", "(Lorg/apache/activemq/command/ProducerInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processAddConsumer", "(Lorg/apache/activemq/command/ConsumerInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processRemoveConnection", "(Lorg/apache/activemq/command/ConnectionId;J)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processRemoveSession", "(Lorg/apache/activemq/command/SessionId;J)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processRemoveProducer", "(Lorg/apache/activemq/command/ProducerId;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processRemoveConsumer", "(Lorg/apache/activemq/command/ConsumerId;J)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processAddDestination", "(Lorg/apache/activemq/command/DestinationInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processRemoveDestination", "(Lorg/apache/activemq/command/DestinationInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processRemoveSubscription", "(Lorg/apache/activemq/command/RemoveSubscriptionInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processMessage", "(Lorg/apache/activemq/command/Message;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processMessageAck", "(Lorg/apache/activemq/command/MessageAck;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processMessagePull", "(Lorg/apache/activemq/command/MessagePull;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processBeginTransaction", "(Lorg/apache/activemq/command/TransactionInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processPrepareTransaction", "(Lorg/apache/activemq/command/TransactionInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processCommitTransactionOnePhase", "(Lorg/apache/activemq/command/TransactionInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processCommitTransactionTwoPhase", "(Lorg/apache/activemq/command/TransactionInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processRollbackTransaction", "(Lorg/apache/activemq/command/TransactionInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processWireFormat", "(Lorg/apache/activemq/command/WireFormatInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processKeepAlive", "(Lorg/apache/activemq/command/KeepAliveInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processShutdown", "(Lorg/apache/activemq/command/ShutdownInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processFlush", "(Lorg/apache/activemq/command/FlushCommand;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processBrokerInfo", "(Lorg/apache/activemq/command/BrokerInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processBrokerSubscriptionInfo", "(Lorg/apache/activemq/command/BrokerSubscriptionInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processRecoverTransactions", "(Lorg/apache/activemq/command/TransactionInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processForgetTransaction", "(Lorg/apache/activemq/command/TransactionInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processEndTransaction", "(Lorg/apache/activemq/command/TransactionInfo;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processMessageDispatchNotification", "(Lorg/apache/activemq/command/MessageDispatchNotification;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processProducerAck", "(Lorg/apache/activemq/command/ProducerAck;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processMessageDispatch", "(Lorg/apache/activemq/command/MessageDispatch;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processControlCommand", "(Lorg/apache/activemq/command/ControlCommand;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processConnectionError", "(Lorg/apache/activemq/command/ConnectionError;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processConnectionControl", "(Lorg/apache/activemq/command/ConnectionControl;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processConsumerControl", "(Lorg/apache/activemq/command/ConsumerControl;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
