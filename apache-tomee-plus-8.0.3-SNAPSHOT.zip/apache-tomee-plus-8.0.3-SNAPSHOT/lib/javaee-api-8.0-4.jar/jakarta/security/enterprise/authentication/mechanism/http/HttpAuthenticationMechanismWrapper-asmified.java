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
public class HttpAuthenticationMechanismWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanismWrapper", null, "java/lang/Object", new String[] { "jakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "httpAuthenticationMechanism", "Ljakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanismWrapper", "httpAuthenticationMechanism", "Ljakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanismWrapper", "httpAuthenticationMechanism", "Ljakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateRequest", "(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;)Ljakarta/security/enterprise/AuthenticationStatus;", null, new String[] { "jakarta/security/enterprise/AuthenticationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanismWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism", "validateRequest", "(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;)Ljakarta/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "secureResponse", "(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;)Ljakarta/security/enterprise/AuthenticationStatus;", null, new String[] { "jakarta/security/enterprise/AuthenticationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanismWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism", "secureResponse", "(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;)Ljakarta/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cleanSubject", "(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanismWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpAuthenticationMechanism", "cleanSubject", "(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
