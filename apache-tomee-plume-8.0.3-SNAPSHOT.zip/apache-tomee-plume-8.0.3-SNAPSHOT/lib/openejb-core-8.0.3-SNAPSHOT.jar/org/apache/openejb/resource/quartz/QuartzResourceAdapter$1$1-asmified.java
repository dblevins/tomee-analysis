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
public class QuartzResourceAdapter$1$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/resource/quartz/QuartzResourceAdapter$1$1", null, "org/apache/openejb/quartz/listeners/SchedulerListenerSupport", null);

classWriter.visitOuterClass("org/apache/openejb/resource/quartz/QuartzResourceAdapter$1", "run", "()V");

classWriter.visitInnerClass("org/apache/openejb/resource/quartz/QuartzResourceAdapter$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/resource/quartz/QuartzResourceAdapter$1$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter$1;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/quartz/QuartzResourceAdapter$1$1", "this$1", "Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter$1;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/listeners/SchedulerListenerSupport", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "schedulerStarted", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/quartz/QuartzResourceAdapter$1$1", "this$1", "Lorg/apache/openejb/resource/quartz/QuartzResourceAdapter$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/quartz/QuartzResourceAdapter$1", "val$signal", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
