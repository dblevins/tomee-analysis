package asm.org.apache.openejb.monitoring;
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
public class StatsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/monitoring/Stats", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visit("append", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "event", "Lorg/apache/openejb/monitoring/Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/Stats", "<init>", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/monitoring/Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/Event", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/monitoring/Stats", "event", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSampleSize", "(I)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "setWindowSize", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSampleSize", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getWindowSize", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPercentile99", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitLdcInsn(new Double("99.0"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getPercentile", "(D)D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPercentile90", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitLdcInsn(new Double("90.0"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getPercentile", "(D)D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPercentile75", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitLdcInsn(new Double("75.0"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getPercentile", "(D)D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPercentile50", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitLdcInsn(new Double("50.0"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getPercentile", "(D)D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPercentile25", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitLdcInsn(new Double("25.0"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getPercentile", "(D)D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPercentile10", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitLdcInsn(new Double("10.0"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getPercentile", "(D)D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPercentile01", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitInsn(DCONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getPercentile", "(D)D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStandardDeviation", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getStandardDeviation", "()D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMean", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getMean", "()D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getVariance", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getVariance", "()D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGeometricMean", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getGeometricMean", "()D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSkewness", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getSkewness", "()D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKurtosis", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getKurtosis", "()D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMax", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getMax", "()D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMin", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getMin", "()D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSum", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getSum", "()D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSumsq", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getSumsq", "()D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sortedValues", "()[D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getSortedValues", "()[D", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "values", "()[D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getValues", "()[D", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "record", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "event", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/Event", "record", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(L2D);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "addValue", "(D)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCount", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "event", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/Event", "get", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLatest", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "event", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/Event", "getLatest", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLatestTime", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/Stats", "event", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/Event", "getLatestTime", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
