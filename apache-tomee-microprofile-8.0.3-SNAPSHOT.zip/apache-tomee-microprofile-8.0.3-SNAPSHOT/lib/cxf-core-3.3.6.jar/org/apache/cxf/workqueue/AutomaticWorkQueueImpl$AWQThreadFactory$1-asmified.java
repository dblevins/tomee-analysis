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
public class AutomaticWorkQueueImpl$AWQThreadFactory$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory$1", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;");

classWriter.visitInnerClass("org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory", "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "AWQThreadFactory", 0);

classWriter.visitInnerClass("org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$r", "Ljava/lang/Runnable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory;Ljava/lang/Runnable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory$1", "this$1", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory$1", "val$r", "Ljava/lang/Runnable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory$1", "this$1", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory", "this$0", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "approxThreadCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "approxThreadCount", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory$1", "val$r", "Ljava/lang/Runnable;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Runnable", "run", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory$1", "this$1", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory", "this$0", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "approxThreadCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "approxThreadCount", "I");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory$1", "this$1", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory", "this$0", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "approxThreadCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "approxThreadCount", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
