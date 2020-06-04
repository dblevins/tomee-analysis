package asm.org.apache.geronimo.microprofile.metrics.common.jaxrs;
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
public class MetricsEndpoints$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/geronimo/microprofile/metrics/common/jaxrs/MetricsEndpoints$1", null, "org/apache/geronimo/microprofile/metrics/common/jaxrs/SecurityValidator", null);

classWriter.visitOuterClass("org/apache/geronimo/microprofile/metrics/common/jaxrs/MetricsEndpoints", null, null);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/metrics/common/jaxrs/MetricsEndpoints$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/geronimo/microprofile/metrics/common/jaxrs/MetricsEndpoints;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/geronimo/microprofile/metrics/common/jaxrs/MetricsEndpoints;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/metrics/common/jaxrs/MetricsEndpoints$1", "this$0", "Lorg/apache/geronimo/microprofile/metrics/common/jaxrs/MetricsEndpoints;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/metrics/common/jaxrs/SecurityValidator", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/metrics/common/jaxrs/MetricsEndpoints$1", "init", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
