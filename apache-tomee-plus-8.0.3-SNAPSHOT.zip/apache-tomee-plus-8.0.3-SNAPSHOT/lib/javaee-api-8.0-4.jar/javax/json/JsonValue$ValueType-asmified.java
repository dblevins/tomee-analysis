package asm.javax.json;
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
public class JsonValue$ValueTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/json/JsonValue$ValueType", "Ljava/lang/Enum<Ljavax/json/JsonValue$ValueType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("javax/json/JsonValue$ValueType", "javax/json/JsonValue", "ValueType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ARRAY", "Ljavax/json/JsonValue$ValueType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OBJECT", "Ljavax/json/JsonValue$ValueType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STRING", "Ljavax/json/JsonValue$ValueType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NUMBER", "Ljavax/json/JsonValue$ValueType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TRUE", "Ljavax/json/JsonValue$ValueType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FALSE", "Ljavax/json/JsonValue$ValueType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NULL", "Ljavax/json/JsonValue$ValueType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/json/JsonValue$ValueType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/json/JsonValue$ValueType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonValue$ValueType", "$VALUES", "[Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/json/JsonValue$ValueType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/json/JsonValue$ValueType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/json/JsonValue$ValueType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/json/JsonValue$ValueType");
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
methodVisitor.visitTypeInsn(NEW, "javax/json/JsonValue$ValueType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ARRAY");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/json/JsonValue$ValueType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/json/JsonValue$ValueType", "ARRAY", "Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitTypeInsn(NEW, "javax/json/JsonValue$ValueType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OBJECT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/json/JsonValue$ValueType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/json/JsonValue$ValueType", "OBJECT", "Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitTypeInsn(NEW, "javax/json/JsonValue$ValueType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STRING");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/json/JsonValue$ValueType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/json/JsonValue$ValueType", "STRING", "Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitTypeInsn(NEW, "javax/json/JsonValue$ValueType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NUMBER");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/json/JsonValue$ValueType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/json/JsonValue$ValueType", "NUMBER", "Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitTypeInsn(NEW, "javax/json/JsonValue$ValueType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRUE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/json/JsonValue$ValueType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/json/JsonValue$ValueType", "TRUE", "Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitTypeInsn(NEW, "javax/json/JsonValue$ValueType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FALSE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/json/JsonValue$ValueType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/json/JsonValue$ValueType", "FALSE", "Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitTypeInsn(NEW, "javax/json/JsonValue$ValueType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NULL");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/json/JsonValue$ValueType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/json/JsonValue$ValueType", "NULL", "Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/json/JsonValue$ValueType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonValue$ValueType", "ARRAY", "Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonValue$ValueType", "OBJECT", "Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonValue$ValueType", "STRING", "Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonValue$ValueType", "NUMBER", "Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonValue$ValueType", "TRUE", "Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonValue$ValueType", "FALSE", "Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonValue$ValueType", "NULL", "Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/json/JsonValue$ValueType", "$VALUES", "[Ljavax/json/JsonValue$ValueType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
