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
public class SimpleWorkManager$WorkerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitInnerClass("org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "org/apache/openejb/core/transaction/SimpleWorkManager", "Worker", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "work", "Ljavax/resource/spi/work/Work;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "workListener", "Ljavax/resource/spi/work/WorkListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "startTimeout", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "created", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "started", "Ljava/util/concurrent/CountDownLatch;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "completed", "Ljava/util/concurrent/CountDownLatch;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "startDelay", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "workException", "Ljavax/resource/spi/work/WorkException;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/core/transaction/SimpleWorkManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/core/transaction/SimpleWorkManager;Ljavax/resource/spi/work/Work;Ljavax/resource/spi/work/WorkListener;J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "this$0", "Lorg/apache/openejb/core/transaction/SimpleWorkManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "created", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/CountDownLatch");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/CountDownLatch", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "started", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/CountDownLatch");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/CountDownLatch", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "completed", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "startDelay", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "work", "Ljavax/resource/spi/work/Work;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "workListener", "Ljavax/resource/spi/work/WorkListener;");
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGT, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(9223372036854775807L));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "startTimeout", "J");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "org/apache/openejb/core/transaction/SimpleWorkManager", "javax/resource/spi/work/Work", "javax/resource/spi/work/WorkListener", Opcodes.LONG}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "startTimeout", "J");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, null);
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label2, label4, label3, null);
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label7, null);
Label label8 = new Label();
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label8, label9, label7, null);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "created", "J");
methodVisitor.visitInsn(LSUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "startDelay", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "startDelay", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "startTimeout", "J");
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLE, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/resource/spi/work/WorkRejectedException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Work not started within specified timeout ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "startTimeout", "J");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("ms");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/resource/spi/work/WorkRejectedException", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "workException", "Ljavax/resource/spi/work/WorkException;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "workListener", "Ljavax/resource/spi/work/WorkListener;");
methodVisitor.visitTypeInsn(NEW, "javax/resource/spi/work/WorkEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "work", "Ljavax/resource/spi/work/Work;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "workException", "Ljavax/resource/spi/work/WorkException;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "startTimeout", "J");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/resource/spi/work/WorkEvent", "<init>", "(Ljava/lang/Object;ILjavax/resource/spi/work/Work;Ljavax/resource/spi/work/WorkException;J)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/resource/spi/work/WorkListener", "workRejected", "(Ljavax/resource/spi/work/WorkEvent;)V", true);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "started", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "completed", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "workListener", "Ljavax/resource/spi/work/WorkListener;");
methodVisitor.visitTypeInsn(NEW, "javax/resource/spi/work/WorkEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "this$0", "Lorg/apache/openejb/core/transaction/SimpleWorkManager;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "work", "Ljavax/resource/spi/work/Work;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/resource/spi/work/WorkEvent", "<init>", "(Ljava/lang/Object;ILjavax/resource/spi/work/Work;Ljavax/resource/spi/work/WorkException;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/resource/spi/work/WorkListener", "workStarted", "(Ljavax/resource/spi/work/WorkEvent;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "started", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "workException", "Ljavax/resource/spi/work/WorkException;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "work", "Ljavax/resource/spi/work/Work;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/resource/spi/work/Work", "run", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "workListener", "Ljavax/resource/spi/work/WorkListener;");
methodVisitor.visitTypeInsn(NEW, "javax/resource/spi/work/WorkEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "this$0", "Lorg/apache/openejb/core/transaction/SimpleWorkManager;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "work", "Ljavax/resource/spi/work/Work;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "workException", "Ljavax/resource/spi/work/WorkException;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/resource/spi/work/WorkEvent", "<init>", "(Ljava/lang/Object;ILjavax/resource/spi/work/Work;Ljavax/resource/spi/work/WorkException;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/resource/spi/work/WorkListener", "workCompleted", "(Ljavax/resource/spi/work/WorkEvent;)V", true);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/resource/spi/work/WorkCompletedException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/resource/spi/work/WorkCompletedException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "workException", "Ljavax/resource/spi/work/WorkException;");
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "workListener", "Ljavax/resource/spi/work/WorkListener;");
methodVisitor.visitTypeInsn(NEW, "javax/resource/spi/work/WorkEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "this$0", "Lorg/apache/openejb/core/transaction/SimpleWorkManager;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "work", "Ljavax/resource/spi/work/Work;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "workException", "Ljavax/resource/spi/work/WorkException;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/resource/spi/work/WorkEvent", "<init>", "(Ljava/lang/Object;ILjavax/resource/spi/work/Work;Ljavax/resource/spi/work/WorkException;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/resource/spi/work/WorkListener", "workCompleted", "(Ljavax/resource/spi/work/WorkEvent;)V", true);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "workListener", "Ljavax/resource/spi/work/WorkListener;");
methodVisitor.visitTypeInsn(NEW, "javax/resource/spi/work/WorkEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "this$0", "Lorg/apache/openejb/core/transaction/SimpleWorkManager;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "work", "Ljavax/resource/spi/work/Work;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "workException", "Ljavax/resource/spi/work/WorkException;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/resource/spi/work/WorkEvent", "<init>", "(Ljava/lang/Object;ILjavax/resource/spi/work/Work;Ljavax/resource/spi/work/WorkException;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/resource/spi/work/WorkListener", "workCompleted", "(Ljavax/resource/spi/work/WorkEvent;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "started", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "completed", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "started", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "completed", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStartDelay", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "startDelay", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWorkException", "()Ljavax/resource/spi/work/WorkException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "workException", "Ljavax/resource/spi/work/WorkException;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "waitForStart", "()V", null, new String[] { "java/lang/InterruptedException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "started", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "await", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "waitForCompletion", "()V", null, new String[] { "java/lang/InterruptedException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/SimpleWorkManager$Worker", "completed", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "await", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
