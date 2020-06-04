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
public class HttpAuthenticationMechanismWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "javax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanismWrapper", null, "java/lang/Object", new String[] { "javax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "httpAuthenticationMechanism", "Ljavax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanismWrapper", "httpAuthenticationMechanism", "Ljavax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanismWrapper", "httpAuthenticationMechanism", "Ljavax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateRequest", "(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;)Ljavax/security/enterprise/AuthenticationStatus;", null, new String[] { "javax/security/enterprise/AuthenticationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanismWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism", "validateRequest", "(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;)Ljavax/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "secureResponse", "(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;)Ljavax/security/enterprise/AuthenticationStatus;", null, new String[] { "javax/security/enterprise/AuthenticationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanismWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism", "secureResponse", "(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;)Ljavax/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cleanSubject", "(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanismWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism", "cleanSubject", "(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
