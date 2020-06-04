package asm.org.apache.safeguard.impl.timeout;
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
public class TimeoutInterceptor$ModelDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/safeguard/impl/timeout/TimeoutInterceptor$Model", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "Histogram", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "Counter", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/safeguard/impl/timeout/TimeoutInterceptor$Model", "org/apache/safeguard/impl/timeout/TimeoutInterceptor", "Model", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/timeout/TimeoutInterceptor$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "disabled", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "timeout", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "executionDuration", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "timeouts", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "successes", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(ZJLorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/timeout/TimeoutInterceptor$Model", "disabled", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/timeout/TimeoutInterceptor$Model", "timeout", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/timeout/TimeoutInterceptor$Model", "executionDuration", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/timeout/TimeoutInterceptor$Model", "timeouts", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/timeout/TimeoutInterceptor$Model", "successes", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/safeguard/impl/timeout/TimeoutInterceptor$Model;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/timeout/TimeoutInterceptor$Model", "disabled", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/safeguard/impl/timeout/TimeoutInterceptor$Model;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/timeout/TimeoutInterceptor$Model", "timeout", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/safeguard/impl/timeout/TimeoutInterceptor$Model;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/timeout/TimeoutInterceptor$Model", "successes", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/apache/safeguard/impl/timeout/TimeoutInterceptor$Model;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/timeout/TimeoutInterceptor$Model", "timeouts", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/safeguard/impl/timeout/TimeoutInterceptor$Model;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/timeout/TimeoutInterceptor$Model", "executionDuration", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(ZJLorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;Lorg/apache/safeguard/impl/timeout/TimeoutInterceptor$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/timeout/TimeoutInterceptor$Model", "<init>", "(ZJLorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
