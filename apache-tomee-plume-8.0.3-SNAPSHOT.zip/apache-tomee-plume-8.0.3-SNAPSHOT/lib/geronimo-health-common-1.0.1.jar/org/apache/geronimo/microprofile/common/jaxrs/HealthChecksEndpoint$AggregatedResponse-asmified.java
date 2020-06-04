package asm.org.apache.geronimo.microprofile.common.jaxrs;
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
public class HealthChecksEndpoint$AggregatedResponseDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/microprofile/common/jaxrs/HealthChecksEndpoint$AggregatedResponse", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/microprofile/health/HealthCheckResponse$State", "org/eclipse/microprofile/health/HealthCheckResponse", "State", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/common/jaxrs/HealthChecksEndpoint$AggregatedResponse", "org/apache/geronimo/microprofile/common/jaxrs/HealthChecksEndpoint", "AggregatedResponse", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/common/jaxrs/HealthChecksEndpoint$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "status", "Lorg/eclipse/microprofile/health/HealthCheckResponse$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "checks", "Ljava/util/Collection;", "Ljava/util/Collection<Lorg/eclipse/microprofile/health/HealthCheckResponse;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/eclipse/microprofile/health/HealthCheckResponse$State;Ljava/util/Collection;)V", "(Lorg/eclipse/microprofile/health/HealthCheckResponse$State;Ljava/util/Collection<Lorg/eclipse/microprofile/health/HealthCheckResponse;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/common/jaxrs/HealthChecksEndpoint$AggregatedResponse", "status", "Lorg/eclipse/microprofile/health/HealthCheckResponse$State;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/common/jaxrs/HealthChecksEndpoint$AggregatedResponse", "checks", "Ljava/util/Collection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStatus", "()Lorg/eclipse/microprofile/health/HealthCheckResponse$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/common/jaxrs/HealthChecksEndpoint$AggregatedResponse", "status", "Lorg/eclipse/microprofile/health/HealthCheckResponse$State;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "getOutcome", "()Lorg/eclipse/microprofile/health/HealthCheckResponse$State;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/common/jaxrs/HealthChecksEndpoint$AggregatedResponse", "status", "Lorg/eclipse/microprofile/health/HealthCheckResponse$State;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getChecks", "()Ljava/util/Collection;", "()Ljava/util/Collection<Lorg/eclipse/microprofile/health/HealthCheckResponse;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/common/jaxrs/HealthChecksEndpoint$AggregatedResponse", "checks", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/eclipse/microprofile/health/HealthCheckResponse$State;Ljava/util/Collection;Lorg/apache/geronimo/microprofile/common/jaxrs/HealthChecksEndpoint$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/common/jaxrs/HealthChecksEndpoint$AggregatedResponse", "<init>", "(Lorg/eclipse/microprofile/health/HealthCheckResponse$State;Ljava/util/Collection;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
