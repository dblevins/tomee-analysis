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
public class NoMetricsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/safeguard/impl/metrics/NoMetrics", null, "java/lang/Object", new String[] { "org/apache/safeguard/impl/metrics/FaultToleranceMetrics" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/enterprise/inject/Vetoed;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/safeguard/impl/metrics/NoMetrics$1", null, null, 0);

classWriter.visitInnerClass("org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "Counter", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "Histogram", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "counter", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/safeguard/impl/metrics/NoMetrics$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/metrics/NoMetrics$1", "<init>", "(Lorg/apache/safeguard/impl/metrics/NoMetrics;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "gauge", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Supplier;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Supplier<Ljava/lang/Long;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "histogram", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInvokeDynamicInsn("update", "()Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(J)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/metrics/NoMetrics", "lambda$histogram$0", "(J)V", false), Type.getType("(J)V")});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$histogram$0", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
