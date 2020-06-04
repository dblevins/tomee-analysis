package asm.org.apache.safeguard.impl.metrics;
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
public class MicroprofileMetricsImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl", null, "java/lang/Object", new String[] { "org/apache/safeguard/impl/metrics/FaultToleranceMetrics" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/enterprise/inject/Vetoed;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl$1", null, null, 0);

classWriter.visitInnerClass("org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "Counter", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "Histogram", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "registry", "Lorg/eclipse/microprofile/metrics/MetricRegistry;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/microprofile/metrics/MetricRegistry;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl", "registry", "Lorg/eclipse/microprofile/metrics/MetricRegistry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "counter", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl", "registry", "Lorg/eclipse/microprofile/metrics/MetricRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/metrics/Metadata");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/metrics/MetricType", "COUNTER", "Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitLdcInsn("none");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/metrics/Metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/microprofile/metrics/MetricType;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl", "reusable", "(Lorg/eclipse/microprofile/metrics/Metadata;)Lorg/eclipse/microprofile/metrics/Metadata;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/microprofile/metrics/MetricRegistry", "counter", "(Lorg/eclipse/microprofile/metrics/Metadata;)Lorg/eclipse/microprofile/metrics/Counter;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl$1", "<init>", "(Lorg/apache/safeguard/impl/metrics/MicroprofileMetricsImpl;Lorg/eclipse/microprofile/metrics/Counter;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "gauge", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Supplier;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Supplier<Ljava/lang/Long;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl", "registry", "Lorg/eclipse/microprofile/metrics/MetricRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/metrics/Metadata");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/metrics/MetricType", "GAUGE", "Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/metrics/Metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/microprofile/metrics/MetricType;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl", "reusable", "(Lorg/eclipse/microprofile/metrics/Metadata;)Lorg/eclipse/microprofile/metrics/Metadata;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInvokeDynamicInsn("getValue", "(Ljava/util/function/Supplier;)Lorg/eclipse/microprofile/metrics/Gauge;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEINTERFACE, "java/util/function/Supplier", "get", "()Ljava/lang/Object;", true), Type.getType("()Ljava/lang/Long;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/microprofile/metrics/MetricRegistry", "register", "(Lorg/eclipse/microprofile/metrics/Metadata;Lorg/eclipse/microprofile/metrics/Metric;)Lorg/eclipse/microprofile/metrics/Metric;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "histogram", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl", "registry", "Lorg/eclipse/microprofile/metrics/MetricRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/metrics/Metadata");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/metrics/MetricType", "HISTOGRAM", "Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitLdcInsn("none");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/metrics/Metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/microprofile/metrics/MetricType;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl", "reusable", "(Lorg/eclipse/microprofile/metrics/Metadata;)Lorg/eclipse/microprofile/metrics/Metadata;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/microprofile/metrics/MetricRegistry", "histogram", "(Lorg/eclipse/microprofile/metrics/Metadata;)Lorg/eclipse/microprofile/metrics/Histogram;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInvokeDynamicInsn("update", "(Lorg/eclipse/microprofile/metrics/Histogram;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(J)V"), new Handle(Opcodes.H_INVOKEINTERFACE, "org/eclipse/microprofile/metrics/Histogram", "update", "(J)V", true), Type.getType("(J)V")});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "reusable", "(Lorg/eclipse/microprofile/metrics/Metadata;)Lorg/eclipse/microprofile/metrics/Metadata;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/microprofile/metrics/Metadata", "setReusable", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
