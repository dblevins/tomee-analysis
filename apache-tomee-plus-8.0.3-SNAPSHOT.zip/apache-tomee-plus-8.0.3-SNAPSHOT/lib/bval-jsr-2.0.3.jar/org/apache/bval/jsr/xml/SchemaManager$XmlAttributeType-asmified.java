package asm.org.apache.bval.jsr.xml;
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
public class SchemaManager$XmlAttributeTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "Ljava/lang/Enum<Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "org/apache/bval/jsr/xml/SchemaManager", "XmlAttributeType", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CDATA", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ID", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IDREF", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IDREFS", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NMTOKEN", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NMTOKENS", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENTITY", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENTITIES", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NOTATION", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "$VALUES", "[Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CDATA");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "CDATA", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ID");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "ID", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IDREF");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "IDREF", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IDREFS");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "IDREFS", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NMTOKEN");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "NMTOKEN", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NMTOKENS");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "NMTOKENS", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENTITY");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "ENTITY", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENTITIES");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "ENTITIES", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NOTATION");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "NOTATION", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "CDATA", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "ID", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "IDREF", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "IDREFS", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "NMTOKEN", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "NMTOKENS", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "ENTITY", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "ENTITIES", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "NOTATION", "Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/xml/SchemaManager$XmlAttributeType", "$VALUES", "[Lorg/apache/bval/jsr/xml/SchemaManager$XmlAttributeType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
