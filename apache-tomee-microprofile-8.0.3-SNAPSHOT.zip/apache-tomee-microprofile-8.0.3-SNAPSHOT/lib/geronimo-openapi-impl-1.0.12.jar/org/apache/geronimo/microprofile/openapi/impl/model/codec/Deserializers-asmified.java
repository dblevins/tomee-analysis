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
public class DeserializersDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/enterprise/inject/Vetoed;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$BaseDeserializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers", "BaseDeserializer", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$MapEncodingsDeserializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers", "MapEncodingsDeserializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$MapSecuritySchemesDeserializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers", "MapSecuritySchemesDeserializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$MapSchemasDeserializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers", "MapSchemasDeserializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$MapAPIResponsesDeserializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers", "MapAPIResponsesDeserializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$MapRequestBodiesDeserializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers", "MapRequestBodiesDeserializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$MapParametersDeserializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers", "MapParametersDeserializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$MapExamplesDeserializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers", "MapExamplesDeserializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$MapCallbacksDeserializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers", "MapCallbacksDeserializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$MapLinksDeserializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers", "MapLinksDeserializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$MapHeadersDeserializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers", "MapHeadersDeserializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$1", null, null, ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "mapType", "(Ljava/lang/Class;)Ljava/lang/reflect/Type;", "(Ljava/lang/Class<*>;)Ljava/lang/reflect/Type;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/reflect/Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$1", "<init>", "([Ljava/lang/reflect/Type;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Ljava/lang/Class;)Ljava/lang/reflect/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers", "mapType", "(Ljava/lang/Class;)Ljava/lang/reflect/Type;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
