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
public class Deserializers$MapLinksDeserializerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$MapLinksDeserializer", "Lorg/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$BaseDeserializer<Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/links/Link;>;>;", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$BaseDeserializer", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/enterprise/inject/Vetoed;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$MapLinksDeserializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers", "MapLinksDeserializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$BaseDeserializer", "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers", "BaseDeserializer", ACC_PROTECTED | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/geronimo/microprofile/openapi/impl/model/LinkImpl;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers", "access$000", "(Ljava/lang/Class;)Ljava/lang/reflect/Type;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/openapi/impl/model/codec/Deserializers$BaseDeserializer", "<init>", "(Ljava/lang/reflect/Type;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
