package asm.javax.servlet.jsp.jstl.core;
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
public class IteratedExpression$TypesEnumDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "Ljava/lang/Enum<Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "javax/servlet/jsp/jstl/core/IteratedExpression", "TypesEnum", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Undefined", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACollection", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AnIterator", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AnEnumeration", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AMap", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AString", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "$VALUES", "[Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum");
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
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Undefined");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "Undefined", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACollection");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "ACollection", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AnIterator");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "AnIterator", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AnEnumeration");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "AnEnumeration", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AMap");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "AMap", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AString");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "AString", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "Undefined", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "ACollection", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "AnIterator", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "AnEnumeration", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "AMap", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "AString", "Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "$VALUES", "[Ljavax/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
