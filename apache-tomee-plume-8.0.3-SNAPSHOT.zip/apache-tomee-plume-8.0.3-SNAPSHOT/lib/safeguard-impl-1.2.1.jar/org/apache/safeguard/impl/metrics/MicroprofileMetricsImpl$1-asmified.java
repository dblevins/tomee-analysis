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
public class MicroprofileMetricsImpl$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl$1", null, "java/lang/Object", new String[] { "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter" });

classWriter.visitOuterClass("org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl", "counter", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;");

classWriter.visitInnerClass("org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl$1", null, null, 0);

classWriter.visitInnerClass("org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "Counter", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$delegate", "Lorg/eclipse/microprofile/metrics/Counter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/safeguard/impl/metrics/MicroprofileMetricsImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/safeguard/impl/metrics/MicroprofileMetricsImpl;Lorg/eclipse/microprofile/metrics/Counter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl$1", "this$0", "Lorg/apache/safeguard/impl/metrics/MicroprofileMetricsImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl$1", "val$delegate", "Lorg/eclipse/microprofile/metrics/Counter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "inc", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl$1", "val$delegate", "Lorg/eclipse/microprofile/metrics/Counter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/metrics/Counter", "inc", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dec", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/metrics/MicroprofileMetricsImpl$1", "val$delegate", "Lorg/eclipse/microprofile/metrics/Counter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/metrics/Counter", "dec", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
