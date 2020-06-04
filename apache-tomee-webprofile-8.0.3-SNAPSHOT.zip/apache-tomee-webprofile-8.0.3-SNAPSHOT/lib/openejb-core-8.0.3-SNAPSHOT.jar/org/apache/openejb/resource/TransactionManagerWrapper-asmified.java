package asm.org.apache.openejb.resource;
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
public class TransactionManagerWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/resource/TransactionManagerWrapper", null, "java/lang/Object", new String[] { "jakarta/transaction/TransactionManager" });

classWriter.visitInnerClass("org/apache/openejb/resource/TransactionManagerWrapper$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openejb/resource/TransactionManagerWrapper$TransactionWrapper", "org/apache/openejb/resource/TransactionManagerWrapper", "TransactionWrapper", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Ljakarta/transaction/TransactionManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "xaResourceWrapper", "Lorg/apache/openejb/resource/XAResourceWrapper;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/transaction/TransactionManager;Ljava/lang/String;Lorg/apache/openejb/resource/XAResourceWrapper;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "delegate", "Ljakarta/transaction/TransactionManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "xaResourceWrapper", "Lorg/apache/openejb/resource/XAResourceWrapper;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "begin", "()V", null, new String[] { "jakarta/transaction/NotSupportedException", "jakarta/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "delegate", "Ljakarta/transaction/TransactionManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/transaction/TransactionManager", "begin", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commit", "()V", null, new String[] { "jakarta/transaction/HeuristicMixedException", "jakarta/transaction/HeuristicRollbackException", "java/lang/IllegalStateException", "jakarta/transaction/RollbackException", "java/lang/SecurityException", "jakarta/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "delegate", "Ljakarta/transaction/TransactionManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/transaction/TransactionManager", "commit", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStatus", "()I", null, new String[] { "jakarta/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "delegate", "Ljakarta/transaction/TransactionManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/transaction/TransactionManager", "getStatus", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransaction", "()Ljakarta/transaction/Transaction;", null, new String[] { "jakarta/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "delegate", "Ljakarta/transaction/TransactionManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/transaction/TransactionManager", "getTransaction", "()Ljakarta/transaction/Transaction;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"jakarta/transaction/Transaction"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/resource/TransactionManagerWrapper$TransactionWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "delegate", "Ljakarta/transaction/TransactionManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/transaction/TransactionManager", "getTransaction", "()Ljakarta/transaction/Transaction;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "xaResourceWrapper", "Lorg/apache/openejb/resource/XAResourceWrapper;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/TransactionManagerWrapper$TransactionWrapper", "<init>", "(Ljakarta/transaction/Transaction;Ljava/lang/String;Lorg/apache/openejb/resource/XAResourceWrapper;Lorg/apache/openejb/resource/TransactionManagerWrapper$1;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/transaction/Transaction"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resume", "(Ljakarta/transaction/Transaction;)V", null, new String[] { "java/lang/IllegalStateException", "jakarta/transaction/InvalidTransactionException", "jakarta/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "delegate", "Ljakarta/transaction/TransactionManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/resource/TransactionManagerWrapper$TransactionWrapper");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/resource/TransactionManagerWrapper$TransactionWrapper", "access$100", "(Lorg/apache/openejb/resource/TransactionManagerWrapper$TransactionWrapper;)Ljakarta/transaction/Transaction;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/transaction/TransactionManager", "resume", "(Ljakarta/transaction/Transaction;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rollback", "()V", null, new String[] { "java/lang/IllegalStateException", "java/lang/SecurityException", "jakarta/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "delegate", "Ljakarta/transaction/TransactionManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/transaction/TransactionManager", "rollback", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRollbackOnly", "()V", null, new String[] { "java/lang/IllegalStateException", "jakarta/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "delegate", "Ljakarta/transaction/TransactionManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/transaction/TransactionManager", "setRollbackOnly", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTransactionTimeout", "(I)V", null, new String[] { "jakarta/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "delegate", "Ljakarta/transaction/TransactionManager;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/transaction/TransactionManager", "setTransactionTimeout", "(I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "suspend", "()Ljakarta/transaction/Transaction;", null, new String[] { "jakarta/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/resource/TransactionManagerWrapper$TransactionWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "delegate", "Ljakarta/transaction/TransactionManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/transaction/TransactionManager", "suspend", "()Ljakarta/transaction/Transaction;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/TransactionManagerWrapper", "xaResourceWrapper", "Lorg/apache/openejb/resource/XAResourceWrapper;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/TransactionManagerWrapper$TransactionWrapper", "<init>", "(Ljakarta/transaction/Transaction;Ljava/lang/String;Lorg/apache/openejb/resource/XAResourceWrapper;Lorg/apache/openejb/resource/TransactionManagerWrapper$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
