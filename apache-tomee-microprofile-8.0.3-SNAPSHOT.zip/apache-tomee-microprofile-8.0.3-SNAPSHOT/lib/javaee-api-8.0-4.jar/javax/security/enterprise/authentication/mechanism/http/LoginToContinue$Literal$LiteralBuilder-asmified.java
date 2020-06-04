package asm.javax.security.enterprise.authentication.mechanism.http;
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
public class LoginToContinue$Literal$LiteralBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder", null, "java/lang/Object", null);

classWriter.visitInnerClass("javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal", "javax/security/enterprise/authentication/mechanism/http/LoginToContinue", "Literal", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder", "javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal", "LiteralBuilder", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "loginPage", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "useForwardToLogin", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "useForwardToLoginExpression", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "errorPage", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("/login");
methodVisitor.visitFieldInsn(PUTFIELD, "javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder", "loginPage", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder", "useForwardToLogin", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("/login-error");
methodVisitor.visitFieldInsn(PUTFIELD, "javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder", "errorPage", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "loginPage", "(Ljava/lang/String;)Ljavax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder", "loginPage", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "useForwardToLogin", "(Z)Ljavax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder", "useForwardToLogin", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "useForwardToLoginExpression", "(Ljava/lang/String;)Ljavax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder", "useForwardToLoginExpression", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "errorPage", "(Ljava/lang/String;)Ljavax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder", "errorPage", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "()Ljavax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder", "loginPage", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder", "useForwardToLogin", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder", "useForwardToLoginExpression", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal$LiteralBuilder", "errorPage", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/security/enterprise/authentication/mechanism/http/LoginToContinue$Literal", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
