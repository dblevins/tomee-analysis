package asm.org.apache.commons.dbcp2.managed;
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
public class TransactionContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/dbcp2/managed/TransactionContext", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/commons/dbcp2/managed/TransactionContext$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "transactionRegistry", "Lorg/apache/commons/dbcp2/managed/TransactionRegistry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "transactionRef", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference<Ljakarta/transaction/Transaction;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sharedConnection", "Ljava/sql/Connection;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/dbcp2/managed/TransactionRegistry;Ljakarta/transaction/Transaction;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("transactionRegistry is null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/commons/dbcp2/managed/TransactionContext", "org/apache/commons/dbcp2/managed/TransactionRegistry", "jakarta/transaction/Transaction"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("transaction is null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/dbcp2/managed/TransactionContext", "transactionRegistry", "Lorg/apache/commons/dbcp2/managed/TransactionRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/ref/WeakReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ref/WeakReference", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/dbcp2/managed/TransactionContext", "transactionRef", "Ljava/lang/ref/WeakReference;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSharedConnection", "()Ljava/sql/Connection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/dbcp2/managed/TransactionContext", "sharedConnection", "Ljava/sql/Connection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSharedConnection", "(Ljava/sql/Connection;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/transaction/RollbackException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "jakarta/transaction/SystemException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/dbcp2/managed/TransactionContext", "sharedConnection", "Ljava/sql/Connection;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("A shared connection is already set");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/dbcp2/managed/TransactionContext", "getTransaction", "()Ljakarta/transaction/Transaction;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/dbcp2/managed/TransactionContext", "transactionRegistry", "Lorg/apache/commons/dbcp2/managed/TransactionRegistry;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/dbcp2/managed/TransactionRegistry", "getXAResource", "(Ljava/sql/Connection;)Ljavax/transaction/xa/XAResource;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/transaction/Transaction", "enlistResource", "(Ljavax/transaction/xa/XAResource;)Z", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitTypeInsn(NEW, "java/sql/SQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to enlist connection in transaction: enlistResource returns 'false'.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/sql/SQLException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"jakarta/transaction/Transaction"}, 0, null);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/transaction/RollbackException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/transaction/SystemException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/sql/SQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to enlist connection the transaction");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/sql/SQLException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/dbcp2/managed/TransactionContext", "sharedConnection", "Ljava/sql/Connection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addTransactionContextListener", "(Lorg/apache/commons/dbcp2/managed/TransactionContextListener;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/transaction/RollbackException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/dbcp2/managed/TransactionContext", "getTransaction", "()Ljakarta/transaction/Transaction;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/dbcp2/managed/TransactionContext$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/dbcp2/managed/TransactionContext$1", "<init>", "(Lorg/apache/commons/dbcp2/managed/TransactionContext;Lorg/apache/commons/dbcp2/managed/TransactionContextListener;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/transaction/Transaction", "registerSynchronization", "(Ljakarta/transaction/Synchronization;)V", true);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/transaction/RollbackException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/sql/SQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to register transaction context listener");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/sql/SQLException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isActive", "()Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/transaction/SystemException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "jakarta/transaction/SystemException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/dbcp2/managed/TransactionContext", "transactionRef", "Ljava/lang/ref/WeakReference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ref/WeakReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/transaction/Transaction");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"jakarta/transaction/Transaction"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/transaction/Transaction", "getStatus", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/commons/dbcp2/managed/TransactionContext"}, 1, new Object[] {"jakarta/transaction/SystemException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/sql/SQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to get transaction status");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/sql/SQLException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getTransaction", "()Ljakarta/transaction/Transaction;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/dbcp2/managed/TransactionContext", "transactionRef", "Ljava/lang/ref/WeakReference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ref/WeakReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/transaction/Transaction");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/sql/SQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to enlist connection because the transaction has been garbage collected");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/sql/SQLException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"jakarta/transaction/Transaction"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
