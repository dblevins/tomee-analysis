package asm.org.apache.geronimo.microprofile.metrics.common;
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
public class RegistryImpl$HolderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/geronimo/microprofile/metrics/common/RegistryImpl$Holder", "<T::Lorg/eclipse/microprofile/metrics/Metric;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/metrics/common/RegistryImpl$Holder", "org/apache/geronimo/microprofile/metrics/common/RegistryImpl", "Holder", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/metrics/common/RegistryImpl$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "metric", "Lorg/eclipse/microprofile/metrics/Metric;", "TT;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "metadata", "Lorg/eclipse/microprofile/metrics/Metadata;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/eclipse/microprofile/metrics/Metric;Lorg/eclipse/microprofile/metrics/Metadata;)V", "(TT;Lorg/eclipse/microprofile/metrics/Metadata;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/metrics/common/RegistryImpl$Holder", "metric", "Lorg/eclipse/microprofile/metrics/Metric;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/metrics/Metadata");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/microprofile/metrics/Metadata", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/microprofile/metrics/Metadata", "getDisplayName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/microprofile/metrics/Metadata", "getDescription", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/microprofile/metrics/Metadata", "getTypeRaw", "()Lorg/eclipse/microprofile/metrics/MetricType;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/microprofile/metrics/Metadata", "getUnit", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/metrics/Metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/microprofile/metrics/MetricType;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/metrics/common/RegistryImpl$Holder", "metadata", "Lorg/eclipse/microprofile/metrics/Metadata;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/RegistryImpl$Holder", "metadata", "Lorg/eclipse/microprofile/metrics/Metadata;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/microprofile/metrics/Metadata", "isReusable", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/microprofile/metrics/Metadata", "setReusable", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/RegistryImpl$Holder", "metadata", "Lorg/eclipse/microprofile/metrics/Metadata;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/microprofile/metrics/Metadata", "getTags", "()Ljava/util/HashMap;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/microprofile/metrics/Metadata", "setTags", "(Ljava/util/HashMap;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/eclipse/microprofile/metrics/Metric;Lorg/eclipse/microprofile/metrics/Metadata;Lorg/apache/geronimo/microprofile/metrics/common/RegistryImpl$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/metrics/common/RegistryImpl$Holder", "<init>", "(Lorg/eclipse/microprofile/metrics/Metric;Lorg/eclipse/microprofile/metrics/Metadata;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/geronimo/microprofile/metrics/common/RegistryImpl$Holder;)Lorg/eclipse/microprofile/metrics/Metadata;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/RegistryImpl$Holder", "metadata", "Lorg/eclipse/microprofile/metrics/Metadata;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/geronimo/microprofile/metrics/common/RegistryImpl$Holder;)Lorg/eclipse/microprofile/metrics/Metric;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/RegistryImpl$Holder", "metric", "Lorg/eclipse/microprofile/metrics/Metric;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
