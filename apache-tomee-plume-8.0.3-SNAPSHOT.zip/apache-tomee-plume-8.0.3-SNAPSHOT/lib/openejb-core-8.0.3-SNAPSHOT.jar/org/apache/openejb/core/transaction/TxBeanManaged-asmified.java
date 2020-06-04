package asm.org.apache.openejb.core.transaction;
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
public class TxBeanManagedDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/core/transaction/TxBeanManaged", null, "org/apache/openejb/core/transaction/JtaTransactionPolicy", new String[] { "org/apache/openejb/core/transaction/BeanTransactionPolicy" });

classWriter.visitInnerClass("org/apache/openejb/core/transaction/TxBeanManaged$JtaSuspendedTransaction", "org/apache/openejb/core/transaction/TxBeanManaged", "JtaSuspendedTransaction", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/core/transaction/BeanTransactionPolicy$SuspendedTransaction", "org/apache/openejb/core/transaction/BeanTransactionPolicy", "SuspendedTransaction", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "clientTx", "Ljavax/transaction/Transaction;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/transaction/TransactionManager;)V", null, new String[] { "org/apache/openejb/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/transaction/TransactionType", "BeanManaged", "Lorg/apache/openejb/core/transaction/TransactionType;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/transaction/JtaTransactionPolicy", "<init>", "(Lorg/apache/openejb/core/transaction/TransactionType;Ljavax/transaction/TransactionManager;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/transaction/TxBeanManaged", "suspendTransaction", "()Ljavax/transaction/Transaction;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/transaction/TxBeanManaged", "clientTx", "Ljavax/transaction/Transaction;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNewTransaction", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isClientTransaction", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCurrentTransaction", "()Ljavax/transaction/Transaction;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/SystemException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/transaction/TxBeanManaged", "getTransaction", "()Ljavax/transaction/Transaction;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/SystemException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Exception getting current transaction");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUserTransaction", "()Ljavax/transaction/UserTransaction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/CoreUserTransaction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/TxBeanManaged", "transactionManager", "Ljavax/transaction/TransactionManager;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/CoreUserTransaction", "<init>", "(Ljavax/transaction/TransactionManager;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "suspendUserTransaction", "()Lorg/apache/openejb/core/transaction/BeanTransactionPolicy$SuspendedTransaction;", null, new String[] { "org/apache/openejb/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/transaction/TxBeanManaged", "suspendTransaction", "()Ljavax/transaction/Transaction;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/transaction/Transaction"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/transaction/TxBeanManaged$JtaSuspendedTransaction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/transaction/TxBeanManaged$JtaSuspendedTransaction", "<init>", "(Ljavax/transaction/Transaction;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resumeUserTransaction", "(Lorg/apache/openejb/core/transaction/BeanTransactionPolicy$SuspendedTransaction;)V", null, new String[] { "org/apache/openejb/SystemException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/SystemException");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("suspendedTransaction is null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/core/transaction/TxBeanManaged$JtaSuspendedTransaction");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/transaction/TxBeanManaged$JtaSuspendedTransaction", "access$000", "(Lorg/apache/openejb/core/transaction/TxBeanManaged$JtaSuspendedTransaction;)Ljavax/transaction/Transaction;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/SystemException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Bean transaction has already been resumed or destroyed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/SystemException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/transaction/Transaction"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/transaction/TxBeanManaged", "resumeTransaction", "(Ljavax/transaction/Transaction;)V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/SystemException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/transaction/BeanTransactionPolicy$SuspendedTransaction", "destroy", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commit", "()V", null, new String[] { "org/apache/openejb/ApplicationException", "org/apache/openejb/SystemException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, null);
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label5, null);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/transaction/TxBeanManaged", "getTransaction", "()Ljavax/transaction/Transaction;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitLdcInsn("The EJB started a transaction but did not complete it.");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/transaction/TxBeanManaged", "logger", "Lorg/apache/openejb/util/Logger;");
methodVisitor.visitLdcInsn("The EJB started a transaction but did not complete it.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "error", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/transaction/TxBeanManaged", "rollbackTransaction", "(Ljavax/transaction/Transaction;)V", false);
methodVisitor.visitLabel(label1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openejb/core/transaction/TxBeanManaged", "javax/transaction/Transaction", "java/lang/String"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/ApplicationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/rmi/RemoteException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("The EJB started a transaction but did not complete it.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/rmi/RemoteException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/ApplicationException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/transaction/TxBeanManaged", "fireNonTransactionalCompletion", "()V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/TxBeanManaged", "clientTx", "Ljavax/transaction/Transaction;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/transaction/TxBeanManaged", "resumeTransaction", "(Ljavax/transaction/Transaction;)V", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/openejb/core/transaction/TxBeanManaged"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/TxBeanManaged", "clientTx", "Ljavax/transaction/Transaction;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/transaction/TxBeanManaged", "resumeTransaction", "(Ljavax/transaction/Transaction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
