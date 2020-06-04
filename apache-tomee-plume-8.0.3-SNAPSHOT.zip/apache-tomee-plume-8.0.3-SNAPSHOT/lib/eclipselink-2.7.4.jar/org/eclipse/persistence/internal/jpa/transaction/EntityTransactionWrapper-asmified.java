package asm.org.eclipse.persistence.internal.jpa.transaction;
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
public class EntityTransactionWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionWrapper", null, "org/eclipse/persistence/internal/jpa/transaction/TransactionWrapperImpl", new String[] { "org/eclipse/persistence/internal/jpa/transaction/TransactionWrapper" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "entityTransaction", "Lorg/eclipse/persistence/internal/jpa/transaction/EntityTransactionImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/transaction/TransactionWrapperImpl", "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "checkForTransaction", "(Z)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionWrapper", "entityTransaction", "Lorg/eclipse/persistence/internal/jpa/transaction/EntityTransactionImpl;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionWrapper", "entityTransaction", "Lorg/eclipse/persistence/internal/jpa/transaction/EntityTransactionImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionImpl", "isActive", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionWrapper", "entityTransaction", "Lorg/eclipse/persistence/internal/jpa/transaction/EntityTransactionImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionWrapper", "throwCheckTransactionFailedException", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntityManager", "()Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionWrapper", "entityManager", "Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransaction", "()Ljavax/persistence/EntityTransaction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionWrapper", "entityTransaction", "Lorg/eclipse/persistence/internal/jpa/transaction/EntityTransactionImpl;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionImpl", "<init>", "(Lorg/eclipse/persistence/internal/jpa/transaction/EntityTransactionWrapper;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionWrapper", "entityTransaction", "Lorg/eclipse/persistence/internal/jpa/transaction/EntityTransactionImpl;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionWrapper", "entityTransaction", "Lorg/eclipse/persistence/internal/jpa/transaction/EntityTransactionImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isJoinedToTransaction", "(Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionWrapper", "entityTransaction", "Lorg/eclipse/persistence/internal/jpa/transaction/EntityTransactionImpl;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionWrapper", "entityTransaction", "Lorg/eclipse/persistence/internal/jpa/transaction/EntityTransactionImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionImpl", "isActive", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRollbackOnlyInternal", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionWrapper", "getTransaction", "()Ljavax/persistence/EntityTransaction;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/EntityTransaction", "isActive", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/transaction/EntityTransactionWrapper", "getTransaction", "()Ljavax/persistence/EntityTransaction;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/EntityTransaction", "setRollbackOnly", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "throwCheckTransactionFailedException", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/persistence/TransactionRequiredException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/TransactionException", "transactionNotActive", "()Lorg/eclipse/persistence/exceptions/TransactionException;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/TransactionException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/persistence/TransactionRequiredException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "registerIfRequired", "(Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/persistence/TransactionRequiredException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("join_trans_called_on_entity_trans");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/persistence/TransactionRequiredException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
