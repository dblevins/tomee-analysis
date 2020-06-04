package asm.org.apache.openejb.resource.quartz;
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
public class QuartzResourceAdapter$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/resource/quartz/QuartzResourceAdapter$1", null, "java/lang/Thread", null);

classWriter.visitOuterClass("org/apache/openejb/resource/quartz/QuartzResourceAdapter", "start", "(Ljakarta/resource/spi/BootstrapContext;)V");

classWriter.visitInnerClass("org/apache/openejb/resource/quartz/QuartzResourceAdapter$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/resource/quartz/QuartzResourceAdapter$1$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$signal", "Ljava/util/concurrent/CountDownLatch;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter;Ljava/lang/String;Ljava/util/concurrent/CountDownLatch;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/quartz/QuartzResourceAdapter$1", "this$0", "Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/quartz/QuartzResourceAdapter$1", "val$signal", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Thread", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Throwable");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/quartz/QuartzResourceAdapter$1", "this$0", "Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/resource/quartz/QuartzResourceAdapter", "access$000", "(Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter;)Ljava/util/concurrent/atomic/AtomicReference;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/StdSchedulerFactory", "getDefaultScheduler", "()Lorg/apache/openejb/quartz/Scheduler;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/quartz/QuartzResourceAdapter$1", "this$0", "Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/resource/quartz/QuartzResourceAdapter", "access$100", "(Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter;)Ljava/util/concurrent/atomic/AtomicReference;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/quartz/QuartzResourceAdapter$1", "this$0", "Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/resource/quartz/QuartzResourceAdapter", "access$000", "(Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter;)Ljava/util/concurrent/atomic/AtomicReference;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/quartz/Scheduler");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/Scheduler", "getListenerManager", "()Lorg/apache/openejb/quartz/ListenerManager;", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/resource/quartz/QuartzResourceAdapter$1$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/quartz/QuartzResourceAdapter$1$1", "<init>", "(Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/ListenerManager", "addSchedulerListener", "(Lorg/apache/openejb/quartz/SchedulerListener;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/quartz/QuartzResourceAdapter$1", "this$0", "Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/resource/quartz/QuartzResourceAdapter", "access$000", "(Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter;)Ljava/util/concurrent/atomic/AtomicReference;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/quartz/Scheduler");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/Scheduler", "start", "()V", true);
methodVisitor.visitLabel(label4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/quartz/QuartzResourceAdapter$1", "this$0", "Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/resource/quartz/QuartzResourceAdapter", "access$100", "(Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter;)Ljava/util/concurrent/atomic/AtomicReference;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/quartz/QuartzResourceAdapter$1", "val$signal", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
