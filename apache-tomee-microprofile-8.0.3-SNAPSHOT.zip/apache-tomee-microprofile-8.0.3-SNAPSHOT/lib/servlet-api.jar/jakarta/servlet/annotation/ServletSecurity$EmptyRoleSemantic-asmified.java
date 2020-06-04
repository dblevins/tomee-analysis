package asm.jakarta.servlet.annotation;
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
public class ServletSecurity$EmptyRoleSemanticDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic", "Ljava/lang/Enum<Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic", "jakarta/servlet/annotation/ServletSecurity", "EmptyRoleSemantic", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PERMIT", "Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DENY", "Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic", "$VALUES", "[Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic");
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
methodVisitor.visitTypeInsn(NEW, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PERMIT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic", "PERMIT", "Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;");
methodVisitor.visitTypeInsn(NEW, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DENY");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic", "DENY", "Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic", "PERMIT", "Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic", "DENY", "Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic", "$VALUES", "[Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
