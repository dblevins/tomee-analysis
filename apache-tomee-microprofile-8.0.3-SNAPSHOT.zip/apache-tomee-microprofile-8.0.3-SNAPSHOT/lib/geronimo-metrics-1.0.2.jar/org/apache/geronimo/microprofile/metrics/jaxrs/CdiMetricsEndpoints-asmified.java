package asm.org.apache.geronimo.microprofile.metrics.jaxrs;
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
public class CdiMetricsEndpointsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/microprofile/metrics/jaxrs/CdiMetricsEndpoints", null, "org/apache/geronimo/microprofile/metrics/common/jaxrs/MetricsEndpoints", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/ws/rs/Path;", true);
annotationVisitor0.visit("value", "metrics");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/enterprise/context/ApplicationScoped;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/eclipse/microprofile/metrics/MetricRegistry$Type", "org/eclipse/microprofile/metrics/MetricRegistry", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "baseRegistry", "Lorg/eclipse/microprofile/metrics/MetricRegistry;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/inject/Inject;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/eclipse/microprofile/metrics/annotation/RegistryType;", true);
annotationVisitor0.visitEnum("type", "Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;", "BASE");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "vendorRegistry", "Lorg/eclipse/microprofile/metrics/MetricRegistry;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/inject/Inject;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/eclipse/microprofile/metrics/annotation/RegistryType;", true);
annotationVisitor0.visitEnum("type", "Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;", "VENDOR");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "applicationRegistry", "Lorg/eclipse/microprofile/metrics/MetricRegistry;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/inject/Inject;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/metrics/common/jaxrs/MetricsEndpoints", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "init", "()V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/PostConstruct;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/jaxrs/CdiMetricsEndpoints", "applicationRegistry", "Lorg/eclipse/microprofile/metrics/MetricRegistry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/metrics/jaxrs/CdiMetricsEndpoints", "setApplicationRegistry", "(Lorg/eclipse/microprofile/metrics/MetricRegistry;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/jaxrs/CdiMetricsEndpoints", "baseRegistry", "Lorg/eclipse/microprofile/metrics/MetricRegistry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/metrics/jaxrs/CdiMetricsEndpoints", "setBaseRegistry", "(Lorg/eclipse/microprofile/metrics/MetricRegistry;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/jaxrs/CdiMetricsEndpoints", "vendorRegistry", "Lorg/eclipse/microprofile/metrics/MetricRegistry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/metrics/jaxrs/CdiMetricsEndpoints", "setVendorRegistry", "(Lorg/eclipse/microprofile/metrics/MetricRegistry;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
