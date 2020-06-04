package asm.org.apache.cxf.common.jaxb;
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
public class JAXBUtils$IdentifierTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "Ljava/lang/Enum<Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "org/apache/cxf/common/jaxb/JAXBUtils", "IdentifierType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLASS", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INTERFACE", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GETTER", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SETTER", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VARIABLE", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONSTANT", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "$VALUES", "[Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLASS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "CLASS", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INTERFACE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "INTERFACE", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GETTER");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "GETTER", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SETTER");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "SETTER", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VARIABLE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "VARIABLE", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONSTANT");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "CONSTANT", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "CLASS", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "INTERFACE", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "GETTER", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "SETTER", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "VARIABLE", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "CONSTANT", "Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/common/jaxb/JAXBUtils$IdentifierType", "$VALUES", "[Lorg/apache/cxf/common/jaxb/JAXBUtils$IdentifierType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
