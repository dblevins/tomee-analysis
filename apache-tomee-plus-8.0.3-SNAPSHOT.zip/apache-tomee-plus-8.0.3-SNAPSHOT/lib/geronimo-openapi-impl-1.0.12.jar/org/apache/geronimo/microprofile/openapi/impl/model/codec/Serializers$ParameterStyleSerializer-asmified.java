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
public class Serializers$ParameterStyleSerializerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers$ParameterStyleSerializer", "Lorg/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers$EnumSerializer<Lorg/eclipse/microprofile/openapi/models/parameters/Parameter$Style;>;Ljakarta/json/bind/adapter/JsonbAdapter<Lorg/eclipse/microprofile/openapi/models/parameters/Parameter$Style;Ljava/lang/String;>;", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers$EnumSerializer", new String[] { "jakarta/json/bind/adapter/JsonbAdapter" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/enterprise/inject/Vetoed;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers$ParameterStyleSerializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers", "ParameterStyleSerializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers$EnumSerializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers", "EnumSerializer", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/eclipse/microprofile/openapi/models/parameters/Parameter$Style", "org/eclipse/microprofile/openapi/models/parameters/Parameter", "Style", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/parameters/Parameter$Style;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/openapi/impl/model/codec/Serializers$EnumSerializer", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
