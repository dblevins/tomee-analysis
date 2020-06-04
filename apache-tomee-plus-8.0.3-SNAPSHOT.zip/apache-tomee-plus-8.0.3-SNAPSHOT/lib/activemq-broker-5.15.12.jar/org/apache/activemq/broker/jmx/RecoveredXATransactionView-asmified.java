package asm.org.apache.activemq.broker.jmx;
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
public class RecoveredXATransactionViewDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/broker/jmx/RecoveredXATransactionView", null, "java/lang/Object", new String[] { "org/apache/activemq/broker/jmx/RecoveredXATransactionViewMBean" });

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/RecoveredXATransactionView$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "transaction", "Lorg/apache/activemq/transaction/XATransaction;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;Lorg/apache/activemq/transaction/XATransaction;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/RecoveredXATransactionView", "transaction", "Lorg/apache/activemq/transaction/XATransaction;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/RecoveredXATransactionView$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/RecoveredXATransactionView$1", "<init>", "(Lorg/apache/activemq/broker/jmx/RecoveredXATransactionView;Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;Lorg/apache/activemq/transaction/XATransaction;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transaction/XATransaction", "addSynchronization", "(Lorg/apache/activemq/transaction/Synchronization;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFormatId", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/RecoveredXATransactionView", "transaction", "Lorg/apache/activemq/transaction/XATransaction;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transaction/XATransaction", "getXid", "()Lorg/apache/activemq/command/XATransactionId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/XATransactionId", "getFormatId", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBranchQualifier", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/RecoveredXATransactionView", "transaction", "Lorg/apache/activemq/transaction/XATransaction;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transaction/XATransaction", "getXid", "()Lorg/apache/activemq/command/XATransactionId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/XATransactionId", "getBranchQualifier", "()[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGlobalTransactionId", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/RecoveredXATransactionView", "transaction", "Lorg/apache/activemq/transaction/XATransaction;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transaction/XATransaction", "getXid", "()Lorg/apache/activemq/command/XATransactionId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/XATransactionId", "getGlobalTransactionId", "()[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "heuristicCommit", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/RecoveredXATransactionView", "transaction", "Lorg/apache/activemq/transaction/XATransaction;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transaction/XATransaction", "commit", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "heuristicRollback", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/RecoveredXATransactionView", "transaction", "Lorg/apache/activemq/transaction/XATransaction;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transaction/XATransaction", "rollback", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
