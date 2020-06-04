package asm.org.apache.activemq.store.jdbc;
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
public class JDBCAdapterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/activemq/store/jdbc/JDBCAdapter", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setStatements", "(Lorg/apache/activemq/store/jdbc/Statements;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doCreateTables", "(Lorg/apache/activemq/store/jdbc/TransactionContext;)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doDropTables", "(Lorg/apache/activemq/store/jdbc/TransactionContext;)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doAddMessage", "(Lorg/apache/activemq/store/jdbc/TransactionContext;JLorg/apache/activemq/command/MessageId;Lorg/apache/activemq/command/ActiveMQDestination;[BJBLorg/apache/activemq/command/XATransactionId;)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doAddMessageReference", "(Lorg/apache/activemq/store/jdbc/TransactionContext;JLorg/apache/activemq/command/MessageId;Lorg/apache/activemq/command/ActiveMQDestination;JLjava/lang/String;)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doGetMessage", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/MessageId;)[B", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doGetMessageById", "(Lorg/apache/activemq/store/jdbc/TransactionContext;J)[B", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doGetMessageReference", "(Lorg/apache/activemq/store/jdbc/TransactionContext;J)Ljava/lang/String;", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doRemoveMessage", "(Lorg/apache/activemq/store/jdbc/TransactionContext;JLorg/apache/activemq/command/XATransactionId;)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doRecover", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/store/jdbc/JDBCMessageRecoveryListener;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doSetLastAck", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/command/XATransactionId;Ljava/lang/String;Ljava/lang/String;JJ)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doRecoverSubscription", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;Ljava/lang/String;Ljava/lang/String;Lorg/apache/activemq/store/jdbc/JDBCMessageRecoveryListener;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doRecoverNextMessages", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;Ljava/lang/String;Ljava/lang/String;JJILorg/apache/activemq/store/jdbc/JDBCMessageRecoveryListener;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doRecoverNextMessagesWithPriority", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;Ljava/lang/String;Ljava/lang/String;JJILorg/apache/activemq/store/jdbc/JDBCMessageRecoveryListener;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doSetSubscriberEntry", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/SubscriptionInfo;ZZ)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doGetSubscriberEntry", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/activemq/command/SubscriptionInfo;", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStoreSequenceId", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/command/MessageId;)[J", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doRemoveAllMessages", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doDeleteSubscription", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doDeleteOldMessages", "(Lorg/apache/activemq/store/jdbc/TransactionContext;)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doGetLastMessageStoreSequenceId", "(Lorg/apache/activemq/store/jdbc/TransactionContext;)J", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doGetDestinations", "(Lorg/apache/activemq/store/jdbc/TransactionContext;)Ljava/util/Set;", "(Lorg/apache/activemq/store/jdbc/TransactionContext;)Ljava/util/Set<Lorg/apache/activemq/command/ActiveMQDestination;>;", new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setUseExternalMessageReferences", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doGetAllSubscriptions", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;)[Lorg/apache/activemq/command/SubscriptionInfo;", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doGetDurableSubscriberMessageCount", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;Ljava/lang/String;Ljava/lang/String;Z)I", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doGetMessageCount", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;)I", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doRecoverNextMessages", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;[JJIZLorg/apache/activemq/store/jdbc/JDBCMessageRecoveryListener;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doGetLastAckedDurableSubscriberMessageId", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;Ljava/lang/String;Ljava/lang/String;)J", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doMessageIdScan", "(Lorg/apache/activemq/store/jdbc/TransactionContext;ILorg/apache/activemq/store/jdbc/JDBCMessageIdScanListener;)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doGetLastProducerSequenceId", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ProducerId;)J", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doSetLastAckWithPriority", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/command/XATransactionId;Ljava/lang/String;Ljava/lang/String;JJ)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMaxRows", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMaxRows", "(I)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doRecordDestination", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doRecoverPreparedOps", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/store/jdbc/JdbcMemoryTransactionStore;)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doCommitAddOp", "(Lorg/apache/activemq/store/jdbc/TransactionContext;JJ)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doClearLastAck", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;BLjava/lang/String;Ljava/lang/String;)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doUpdateMessage", "(Lorg/apache/activemq/store/jdbc/TransactionContext;Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/command/MessageId;[B)V", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "limitQuery", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
