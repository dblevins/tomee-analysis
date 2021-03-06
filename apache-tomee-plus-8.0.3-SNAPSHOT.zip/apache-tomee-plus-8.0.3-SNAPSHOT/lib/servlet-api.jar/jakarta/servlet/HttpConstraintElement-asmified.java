package asm.jakarta.servlet;
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
public class HttpConstraintElementDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/servlet/HttpConstraintElement", null, "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic", "jakarta/servlet/annotation/ServletSecurity", "EmptyRoleSemantic", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("jakarta/servlet/annotation/ServletSecurity$TransportGuarantee", "jakarta/servlet/annotation/ServletSecurity", "TransportGuarantee", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LSTRING_FILE", "Ljava/lang/String;", null, "jakarta.servlet.LocalStrings");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "lStrings", "Ljava/util/ResourceBundle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "emptyRoleSemantic", "Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "transportGuarantee", "Ljakarta/servlet/annotation/ServletSecurity$TransportGuarantee;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "rolesAllowed", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic", "PERMIT", "Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;");
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/HttpConstraintElement", "emptyRoleSemantic", "Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/annotation/ServletSecurity$TransportGuarantee", "NONE", "Ljakarta/servlet/annotation/ServletSecurity$TransportGuarantee;");
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/HttpConstraintElement", "transportGuarantee", "Ljakarta/servlet/annotation/ServletSecurity$TransportGuarantee;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/HttpConstraintElement", "rolesAllowed", "[Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/HttpConstraintElement", "emptyRoleSemantic", "Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/annotation/ServletSecurity$TransportGuarantee", "NONE", "Ljakarta/servlet/annotation/ServletSecurity$TransportGuarantee;");
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/HttpConstraintElement", "transportGuarantee", "Ljakarta/servlet/annotation/ServletSecurity$TransportGuarantee;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/HttpConstraintElement", "rolesAllowed", "[Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "<init>", "(Ljakarta/servlet/annotation/ServletSecurity$TransportGuarantee;[Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic", "PERMIT", "Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;");
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/HttpConstraintElement", "emptyRoleSemantic", "Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/HttpConstraintElement", "transportGuarantee", "Ljakarta/servlet/annotation/ServletSecurity$TransportGuarantee;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/HttpConstraintElement", "rolesAllowed", "[Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "<init>", "(Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;Ljakarta/servlet/annotation/ServletSecurity$TransportGuarantee;[Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic", "DENY", "Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/HttpConstraintElement", "lStrings", "Ljava/util/ResourceBundle;");
methodVisitor.visitLdcInsn("httpConstraintElement.invalidRolesDeny");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ResourceBundle", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"jakarta/servlet/HttpConstraintElement", "jakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic", "jakarta/servlet/annotation/ServletSecurity$TransportGuarantee", "[Ljava/lang/String;"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/HttpConstraintElement", "emptyRoleSemantic", "Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/HttpConstraintElement", "transportGuarantee", "Ljakarta/servlet/annotation/ServletSecurity$TransportGuarantee;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/HttpConstraintElement", "rolesAllowed", "[Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEmptyRoleSemantic", "()Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/HttpConstraintElement", "emptyRoleSemantic", "Ljakarta/servlet/annotation/ServletSecurity$EmptyRoleSemantic;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransportGuarantee", "()Ljakarta/servlet/annotation/ServletSecurity$TransportGuarantee;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/HttpConstraintElement", "transportGuarantee", "Ljakarta/servlet/annotation/ServletSecurity$TransportGuarantee;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRolesAllowed", "()[Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/HttpConstraintElement", "rolesAllowed", "[Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("jakarta.servlet.LocalStrings");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/ResourceBundle", "getBundle", "(Ljava/lang/String;)Ljava/util/ResourceBundle;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/servlet/HttpConstraintElement", "lStrings", "Ljava/util/ResourceBundle;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
