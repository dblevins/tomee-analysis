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
public class ExponentialtIntervalRetrySchedulerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/transaction/manager/ExponentialtIntervalRetryScheduler", null, "java/lang/Object", new String[] { "org/apache/geronimo/transaction/manager/RetryScheduler" });

classWriter.visitInnerClass("org/apache/geronimo/transaction/manager/ExponentialtIntervalRetryScheduler$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/geronimo/transaction/manager/ExponentialtIntervalRetryScheduler$TaskWrapper", "org/apache/geronimo/transaction/manager/ExponentialtIntervalRetryScheduler", "TaskWrapper", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "timer", "Ljava/util/Timer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "base", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/Timer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RetryTimer");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Timer", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/transaction/manager/ExponentialtIntervalRetryScheduler", "timer", "Ljava/util/Timer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/transaction/manager/ExponentialtIntervalRetryScheduler", "base", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "retry", "(Ljava/lang/Runnable;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(new Double("2.0"));
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(I2D);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "pow", "(DD)D", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "round", "(D)J", false);
methodVisitor.visitLdcInsn(new Long(1000L));
methodVisitor.visitInsn(LMUL);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/ExponentialtIntervalRetryScheduler", "timer", "Ljava/util/Timer;");
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/transaction/manager/ExponentialtIntervalRetryScheduler$TaskWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/transaction/manager/ExponentialtIntervalRetryScheduler$TaskWrapper", "<init>", "(Ljava/lang/Runnable;Lorg/apache/geronimo/transaction/manager/ExponentialtIntervalRetryScheduler$1;)V", false);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Timer", "schedule", "(Ljava/util/TimerTask;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
