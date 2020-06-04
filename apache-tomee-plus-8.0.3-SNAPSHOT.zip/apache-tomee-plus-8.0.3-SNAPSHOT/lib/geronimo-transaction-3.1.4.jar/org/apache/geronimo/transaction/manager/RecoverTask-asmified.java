package asm.org.apache.geronimo.transaction.manager;
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
public class RecoverTaskDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/transaction/manager/RecoverTask", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "retryScheduler", "Lorg/apache/geronimo/transaction/manager/RetryScheduler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "namedXAResourceFactory", "Lorg/apache/geronimo/transaction/manager/NamedXAResourceFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "recovery", "Lorg/apache/geronimo/transaction/manager/Recovery;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "recoverableTransactionManager", "Lorg/apache/geronimo/transaction/manager/RecoverableTransactionManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "count", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/geronimo/transaction/manager/RetryScheduler;Lorg/apache/geronimo/transaction/manager/NamedXAResourceFactory;Lorg/apache/geronimo/transaction/manager/Recovery;Lorg/apache/geronimo/transaction/manager/RecoverableTransactionManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/transaction/manager/RecoverTask", "count", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/transaction/manager/RecoverTask", "retryScheduler", "Lorg/apache/geronimo/transaction/manager/RetryScheduler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/transaction/manager/RecoverTask", "namedXAResourceFactory", "Lorg/apache/geronimo/transaction/manager/NamedXAResourceFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/transaction/manager/RecoverTask", "recovery", "Lorg/apache/geronimo/transaction/manager/Recovery;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/transaction/manager/RecoverTask", "recoverableTransactionManager", "Lorg/apache/geronimo/transaction/manager/RecoverableTransactionManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "javax/transaction/xa/XAException");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label6, "javax/transaction/SystemException");
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/RecoverTask", "namedXAResourceFactory", "Lorg/apache/geronimo/transaction/manager/NamedXAResourceFactory;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/NamedXAResourceFactory", "getNamedXAResource", "()Lorg/apache/geronimo/transaction/manager/NamedXAResource;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/RecoverTask", "recovery", "Lorg/apache/geronimo/transaction/manager/Recovery;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/Recovery", "recoverResourceManager", "(Lorg/apache/geronimo/transaction/manager/NamedXAResource;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/RecoverTask", "namedXAResourceFactory", "Lorg/apache/geronimo/transaction/manager/NamedXAResourceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/NamedXAResourceFactory", "returnNamedXAResource", "(Lorg/apache/geronimo/transaction/manager/NamedXAResource;)V", true);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/geronimo/transaction/manager/RecoverTask", "org/apache/geronimo/transaction/manager/NamedXAResource"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/RecoverTask", "namedXAResourceFactory", "Lorg/apache/geronimo/transaction/manager/NamedXAResourceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/NamedXAResourceFactory", "returnNamedXAResource", "(Lorg/apache/geronimo/transaction/manager/NamedXAResource;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/geronimo/transaction/manager/RecoverTask"}, 1, new Object[] {"javax/transaction/xa/XAException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/RecoverTask", "recoverableTransactionManager", "Lorg/apache/geronimo/transaction/manager/RecoverableTransactionManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/RecoverableTransactionManager", "recoveryError", "(Ljava/lang/Exception;)V", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/transaction/SystemException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/RecoverTask", "recoverableTransactionManager", "Lorg/apache/geronimo/transaction/manager/RecoverableTransactionManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/RecoverableTransactionManager", "recoveryError", "(Ljava/lang/Exception;)V", true);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/RecoverTask", "retryScheduler", "Lorg/apache/geronimo/transaction/manager/RetryScheduler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/RecoverTask", "count", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/transaction/manager/RecoverTask", "count", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/RetryScheduler", "retry", "(Ljava/lang/Runnable;I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
