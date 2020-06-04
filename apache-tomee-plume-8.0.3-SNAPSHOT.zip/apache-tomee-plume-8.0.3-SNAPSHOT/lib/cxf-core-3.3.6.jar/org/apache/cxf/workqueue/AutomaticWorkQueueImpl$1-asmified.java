package asm.org.apache.cxf.workqueue;
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
public class AutomaticWorkQueueImpl$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$1", null, "java/util/concurrent/ThreadPoolExecutor", null);

classWriter.visitOuterClass("org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "getExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;");

classWriter.visitInnerClass("org/apache/cxf/workqueue/AutomaticWorkQueueImpl$1", null, null, 0);

classWriter.visitInnerClass("org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory", "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "AWQThreadFactory", 0);

classWriter.visitInnerClass("org/apache/cxf/workqueue/AutomaticWorkQueueImpl$WatchDog", "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "WatchDog", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$1", "this$0", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ThreadPoolExecutor", "<init>", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "terminated", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$1", "this$0", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "getThreadFactory", "()Ljava/util/concurrent/ThreadFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory", "shutdown", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/concurrent/ThreadFactory"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$1", "this$0", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "watchDog", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl$WatchDog;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$1", "this$0", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "watchDog", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl$WatchDog;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$WatchDog", "shutdown", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
