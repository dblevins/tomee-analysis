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
public class StatsInterceptor$StatsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/monitoring/StatsInterceptor$Stats", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/monitoring/StatsInterceptor$Stats", "org/apache/openejb/monitoring/StatsInterceptor", "Stats", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "count", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "method", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/monitoring/StatsInterceptor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/monitoring/StatsInterceptor;Ljava/lang/reflect/Method;Lorg/apache/openejb/api/Monitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "this$0", "Lorg/apache/openejb/monitoring/StatsInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "count", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/api/Monitor;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/api/Monitor");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/api/Monitor", "sample", "()I", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/openejb/monitoring/StatsInterceptor$Stats", "org/apache/openejb/monitoring/StatsInterceptor", "java/lang/reflect/Method", "org/apache/openejb/api/Monitor", "org/apache/openejb/api/Monitor"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/api/Monitor", "sample", "()I", true);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(SIPUSH, 2000);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitLdcInsn(",");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("(");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getParameterTypes", "()[Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 11);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/apache/openejb/monitoring/StatsInterceptor$Stats", "org/apache/openejb/monitoring/StatsInterceptor", "java/lang/reflect/Method", "org/apache/openejb/api/Monitor", "org/apache/openejb/api/Monitor", Opcodes.INTEGER, "java/lang/String", "java/lang/StringBuilder", "[Ljava/lang/Class;", "[Ljava/lang/Class;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 10);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label4);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn(",");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(11, 1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFLE, label5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "length", "()I", false);
methodVisitor.visitLdcInsn(",");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "length", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "delete", "(II)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn(")");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "method", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 13);
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getWindowSize", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "count", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "get", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "getValues", "()[D", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "record", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "count", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "incrementAndGet", "()J", false);
methodVisitor.visitInsn(POP2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/StatsInterceptor$Stats", "samples", "Lorg/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(L2D);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/SynchronizedDescriptiveStatistics", "addValue", "(D)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
