package asm.org.eclipse.persistence.internal.jaxb.json.schema.model;
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
public class JsonTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "Ljava/lang/Enum<Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;>;", "java/lang/Enum", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/xml/bind/annotation/XmlEnum;", true);
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OBJECT", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "object");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ARRAY", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "array");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STRING", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "string");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NUMBER", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "number");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INTEGER", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "integer");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BOOLEAN", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "boolean");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BINARYTYPE", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "binary");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENUMTYPE", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "enum");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OBJECT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "OBJECT", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ARRAY");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "ARRAY", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STRING");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "STRING", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NUMBER");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "NUMBER", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INTEGER");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "INTEGER", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BOOLEAN");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "BOOLEAN", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BINARYTYPE");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "BINARYTYPE", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENUMTYPE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "ENUMTYPE", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "OBJECT", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "ARRAY", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "STRING", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "NUMBER", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "INTEGER", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "BOOLEAN", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "BINARYTYPE", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "ENUMTYPE", "Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "ENUM$VALUES", "[Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType", "ENUM$VALUES", "[Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/jaxb/json/schema/model/JsonType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jaxb/json/schema/model/JsonType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
