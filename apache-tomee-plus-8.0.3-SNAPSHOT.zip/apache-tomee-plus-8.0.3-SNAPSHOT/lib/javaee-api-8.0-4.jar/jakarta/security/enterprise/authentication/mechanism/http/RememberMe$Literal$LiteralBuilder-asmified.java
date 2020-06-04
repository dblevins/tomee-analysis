package asm.jakarta.security.enterprise.authentication.mechanism.http;
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
public class RememberMe$Literal$LiteralBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", null, "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal", "jakarta/security/enterprise/authentication/mechanism/http/RememberMe", "Literal", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal", "LiteralBuilder", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cookieMaxAgeSeconds", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cookieMaxAgeSecondsExpression", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cookieSecureOnly", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cookieSecureOnlyExpression", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cookieHttpOnly", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cookieHttpOnlyExpression", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cookieName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "isRememberMe", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "isRememberMeExpression", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(86400));
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieMaxAgeSeconds", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieSecureOnly", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieHttpOnly", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("JREMEMBERMEID");
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "isRememberMe", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cookieMaxAgeSeconds", "(I)Ljakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieMaxAgeSeconds", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cookieMaxAgeSecondsExpression", "(Ljava/lang/String;)Ljakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieMaxAgeSecondsExpression", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cookieSecureOnly", "(Z)Ljakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieSecureOnly", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cookieSecureOnlyExpression", "(Ljava/lang/String;)Ljakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieSecureOnlyExpression", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cookieHttpOnly", "(Z)Ljakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieHttpOnly", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cookieHttpOnlyExpression", "(Ljava/lang/String;)Ljakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieHttpOnlyExpression", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cookieName", "(Ljava/lang/String;)Ljakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isRememberMe", "(Z)Ljakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "isRememberMe", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isRememberMeExpression", "(Ljava/lang/String;)Ljakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "isRememberMeExpression", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "()Ljakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieMaxAgeSeconds", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieMaxAgeSecondsExpression", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieSecureOnly", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieSecureOnlyExpression", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieHttpOnly", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieHttpOnlyExpression", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "cookieName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "isRememberMe", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal$LiteralBuilder", "isRememberMeExpression", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/security/enterprise/authentication/mechanism/http/RememberMe$Literal", "<init>", "(ILjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(11, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
