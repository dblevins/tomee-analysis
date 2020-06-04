package asm.org.apache.geronimo.microprofile.openapi.impl.model.codec;
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
public class SerializersDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/enterprise/inject/Vetoed;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers$ExtensionSerializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers", "ExtensionSerializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers$SchemaTypeSerializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers", "SchemaTypeSerializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers$InSerializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers", "InSerializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers$SecuritySchemeInSerializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers", "SecuritySchemeInSerializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers$SecuritySchemeTypeSerializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers", "SecuritySchemeTypeSerializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers$ParameterStyleSerializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers", "ParameterStyleSerializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers$HeaderStyleSerializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers", "HeaderStyleSerializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers$EncodingStyleSerializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers", "EncodingStyleSerializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers$EnumSerializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers", "EnumSerializer", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers$BigDecimalSerializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers", "BigDecimalSerializer", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
