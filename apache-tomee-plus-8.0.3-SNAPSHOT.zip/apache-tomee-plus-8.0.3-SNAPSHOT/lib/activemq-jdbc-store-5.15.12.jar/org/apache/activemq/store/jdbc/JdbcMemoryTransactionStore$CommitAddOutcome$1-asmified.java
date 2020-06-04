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
public class JdbcMemoryTransactionStore$CommitAddOutcome$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome$1", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "run", "(Lorg/apache/activemq/broker/ConnectionContext;)V");

classWriter.visitInnerClass("org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore", "CommitAddOutcome", 0);

classWriter.visitInnerClass("org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome$1", "this$1", "Lorg/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome$1", "this$1", "Lorg/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome$1", "this$1", "Lorg/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore$CommitAddOutcome", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/MessageId", "getEntryLocator", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/MessageId", "setFutureOrSequenceLong", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
