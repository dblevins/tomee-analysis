package asm.org.eclipse.microprofile.metrics;
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
public class MetricRegistryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/microprofile/metrics/MetricRegistry", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/microprofile/metrics/MetricRegistry$Type", "org/eclipse/microprofile/metrics/MetricRegistry", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "name", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/metrics/MetricRegistry", "append", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"java/lang/String", "[Ljava/lang/String;", "java/lang/StringBuilder", "[Ljava/lang/String;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/metrics/MetricRegistry", "append", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", false);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "append", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "isEmpty", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "length", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "name", "(Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/Class<*>;[Ljava/lang/String;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/metrics/MetricRegistry", "name", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "register", "(Ljava/lang/String;Lorg/eclipse/microprofile/metrics/Metric;)Lorg/eclipse/microprofile/metrics/Metric;", "<T::Lorg/eclipse/microprofile/metrics/Metric;>(Ljava/lang/String;TT;)TT;", new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "register", "(Ljava/lang/String;Lorg/eclipse/microprofile/metrics/Metric;Lorg/eclipse/microprofile/metrics/Metadata;)Lorg/eclipse/microprofile/metrics/Metric;", "<T::Lorg/eclipse/microprofile/metrics/Metric;>(Ljava/lang/String;TT;Lorg/eclipse/microprofile/metrics/Metadata;)TT;", new String[] { "java/lang/IllegalArgumentException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "register", "(Lorg/eclipse/microprofile/metrics/Metadata;Lorg/eclipse/microprofile/metrics/Metric;)Lorg/eclipse/microprofile/metrics/Metric;", "<T::Lorg/eclipse/microprofile/metrics/Metric;>(Lorg/eclipse/microprofile/metrics/Metadata;TT;)TT;", new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "counter", "(Ljava/lang/String;)Lorg/eclipse/microprofile/metrics/Counter;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "counter", "(Lorg/eclipse/microprofile/metrics/Metadata;)Lorg/eclipse/microprofile/metrics/Counter;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "histogram", "(Ljava/lang/String;)Lorg/eclipse/microprofile/metrics/Histogram;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "histogram", "(Lorg/eclipse/microprofile/metrics/Metadata;)Lorg/eclipse/microprofile/metrics/Histogram;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "meter", "(Ljava/lang/String;)Lorg/eclipse/microprofile/metrics/Meter;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "meter", "(Lorg/eclipse/microprofile/metrics/Metadata;)Lorg/eclipse/microprofile/metrics/Meter;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "timer", "(Ljava/lang/String;)Lorg/eclipse/microprofile/metrics/Timer;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "timer", "(Lorg/eclipse/microprofile/metrics/Metadata;)Lorg/eclipse/microprofile/metrics/Timer;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "remove", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeMatching", "(Lorg/eclipse/microprofile/metrics/MetricFilter;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNames", "()Ljava/util/SortedSet;", "()Ljava/util/SortedSet<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getGauges", "()Ljava/util/SortedMap;", "()Ljava/util/SortedMap<Ljava/lang/String;Lorg/eclipse/microprofile/metrics/Gauge;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getGauges", "(Lorg/eclipse/microprofile/metrics/MetricFilter;)Ljava/util/SortedMap;", "(Lorg/eclipse/microprofile/metrics/MetricFilter;)Ljava/util/SortedMap<Ljava/lang/String;Lorg/eclipse/microprofile/metrics/Gauge;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCounters", "()Ljava/util/SortedMap;", "()Ljava/util/SortedMap<Ljava/lang/String;Lorg/eclipse/microprofile/metrics/Counter;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCounters", "(Lorg/eclipse/microprofile/metrics/MetricFilter;)Ljava/util/SortedMap;", "(Lorg/eclipse/microprofile/metrics/MetricFilter;)Ljava/util/SortedMap<Ljava/lang/String;Lorg/eclipse/microprofile/metrics/Counter;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getHistograms", "()Ljava/util/SortedMap;", "()Ljava/util/SortedMap<Ljava/lang/String;Lorg/eclipse/microprofile/metrics/Histogram;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getHistograms", "(Lorg/eclipse/microprofile/metrics/MetricFilter;)Ljava/util/SortedMap;", "(Lorg/eclipse/microprofile/metrics/MetricFilter;)Ljava/util/SortedMap<Ljava/lang/String;Lorg/eclipse/microprofile/metrics/Histogram;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMeters", "()Ljava/util/SortedMap;", "()Ljava/util/SortedMap<Ljava/lang/String;Lorg/eclipse/microprofile/metrics/Meter;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMeters", "(Lorg/eclipse/microprofile/metrics/MetricFilter;)Ljava/util/SortedMap;", "(Lorg/eclipse/microprofile/metrics/MetricFilter;)Ljava/util/SortedMap<Ljava/lang/String;Lorg/eclipse/microprofile/metrics/Meter;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTimers", "()Ljava/util/SortedMap;", "()Ljava/util/SortedMap<Ljava/lang/String;Lorg/eclipse/microprofile/metrics/Timer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTimers", "(Lorg/eclipse/microprofile/metrics/MetricFilter;)Ljava/util/SortedMap;", "(Lorg/eclipse/microprofile/metrics/MetricFilter;)Ljava/util/SortedMap<Ljava/lang/String;Lorg/eclipse/microprofile/metrics/Timer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMetrics", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/microprofile/metrics/Metric;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMetadata", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/microprofile/metrics/Metadata;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
