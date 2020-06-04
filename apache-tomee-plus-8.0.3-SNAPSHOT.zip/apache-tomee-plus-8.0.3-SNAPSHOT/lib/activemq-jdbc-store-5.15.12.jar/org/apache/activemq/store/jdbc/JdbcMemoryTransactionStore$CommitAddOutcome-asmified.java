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
public class JdbcMemoryTransactionStore$CommitAddOutcomeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", null, "java/lang/Object", new String[] { "org/apache/activemq/store/memory/MemoryTransactionStore$AddMessageCommand" });

classWriter.visitInnerClass("org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore", "CommitAddOutcome", 0);

classWriter.visitInnerClass("org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/memory/MemoryTransactionStore$AddMessageCommand", "org/apache/activemq/store/memory/MemoryTransactionStore", "AddMessageCommand", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/activemq/store/IndexListener$MessageContext", "org/apache/activemq/store/IndexListener", "MessageContext", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "message", "Lorg/apache/activemq/command/Message;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "jdbcMessageStore", "Lorg/apache/activemq/store/jdbc/JDBCMessageStore;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/jdbc/JdbcMemoryTransactionStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/store/jdbc/JdbcMemoryTransactionStore;Lorg/apache/activemq/store/jdbc/JDBCMessageStore;Lorg/apache/activemq/command/Message;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "this$0", "Lorg/apache/activemq/store/jdbc/JdbcMemoryTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "jdbcMessageStore", "Lorg/apache/activemq/store/jdbc/JDBCMessageStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/store/jdbc/JdbcMemoryTransactionStore;Lorg/apache/activemq/store/memory/MemoryTransactionStore$AddMessageCommand;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/memory/MemoryTransactionStore$AddMessageCommand", "getMessageStore", "()Lorg/apache/activemq/store/MessageStore;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/jdbc/JDBCMessageStore");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/memory/MemoryTransactionStore$AddMessageCommand", "getMessage", "()Lorg/apache/activemq/command/Message;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "<init>", "(Lorg/apache/activemq/store/jdbc/JdbcMemoryTransactionStore;Lorg/apache/activemq/store/jdbc/JDBCMessageStore;Lorg/apache/activemq/command/Message;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessage", "()Lorg/apache/activemq/command/Message;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageStore", "()Lorg/apache/activemq/store/MessageStore;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "jdbcMessageStore", "Lorg/apache/activemq/store/jdbc/JDBCMessageStore;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "(Lorg/apache/activemq/broker/ConnectionContext;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "this$0", "Lorg/apache/activemq/store/jdbc/JdbcMemoryTransactionStore;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore", "access$000", "(Lorg/apache/activemq/store/jdbc/JdbcMemoryTransactionStore;)Lorg/apache/activemq/store/PersistenceAdapter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/jdbc/JDBCPersistenceAdapter");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/MessageId", "getEntryLocator", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Long");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/jdbc/JDBCPersistenceAdapter", "getTransactionContext", "(Lorg/apache/activemq/broker/ConnectionContext;)Lorg/apache/activemq/store/jdbc/TransactionContext;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "jdbcMessageStore", "Lorg/apache/activemq/store/jdbc/JDBCMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCMessageStore", "pendingAdditions", "Ljava/util/LinkedList;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/jdbc/JDBCPersistenceAdapter", "getNextSequenceId", "()J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/MessageId", "setEntryLocator", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome$1", "<init>", "(Lorg/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/jdbc/TransactionContext", "onCompletion", "(Ljava/lang/Runnable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "jdbcMessageStore", "Lorg/apache/activemq/store/jdbc/JDBCMessageStore;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/jdbc/JDBCMessageStore", "getIndexListener", "()Lorg/apache/activemq/store/IndexListener;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "jdbcMessageStore", "Lorg/apache/activemq/store/jdbc/JDBCMessageStore;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/jdbc/JDBCMessageStore", "getIndexListener", "()Lorg/apache/activemq/store/IndexListener;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/IndexListener$MessageContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/IndexListener$MessageContext", "<init>", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;Ljava/lang/Runnable;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/IndexListener", "onAdd", "(Lorg/apache/activemq/store/IndexListener$MessageContext;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "org/apache/activemq/broker/ConnectionContext", "org/apache/activemq/store/jdbc/JDBCPersistenceAdapter", "java/lang/Long", "org/apache/activemq/store/jdbc/TransactionContext", "java/lang/Object"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/jdbc/JDBCPersistenceAdapter", "commitAdd", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/MessageId;J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "jdbcMessageStore", "Lorg/apache/activemq/store/jdbc/JDBCMessageStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/MessageId", "getEntryLocator", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Long");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getPriority", "()B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/jdbc/JDBCMessageStore", "onAdd", "(Lorg/apache/activemq/command/Message;JB)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMessageStore", "(Lorg/apache/activemq/store/MessageStore;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/jdbc/JDBCMessageStore");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "jdbcMessageStore", "Lorg/apache/activemq/store/jdbc/JDBCMessageStore;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
