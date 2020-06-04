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
public class HttpMessageContextWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", null, "java/lang/Object", new String[] { "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "httpMessageContext", "Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "httpMessageContext", "Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "httpMessageContext", "Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isProtected", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "isProtected", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAuthenticationRequest", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "isAuthenticationRequest", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isRegisterSession", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "isRegisterSession", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRegisterSession", "(Ljava/lang/String;Ljava/util/Set;)V", "(Ljava/lang/String;Ljava/util/Set<Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "setRegisterSession", "(Ljava/lang/String;Ljava/util/Set;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cleanClientSubject", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "cleanClientSubject", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAuthParameters", "()Ljavax/security/enterprise/authentication/mechanism/http/AuthenticationParameters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "getAuthParameters", "()Ljavax/security/enterprise/authentication/mechanism/http/AuthenticationParameters;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHandler", "()Ljavax/security/auth/callback/CallbackHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "getHandler", "()Ljavax/security/auth/callback/CallbackHandler;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageInfo", "()Ljavax/security/auth/message/MessageInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "getMessageInfo", "()Ljavax/security/auth/message/MessageInfo;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClientSubject", "()Ljavax/security/auth/Subject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "getClientSubject", "()Ljavax/security/auth/Subject;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRequest", "()Ljavax/servlet/http/HttpServletRequest;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "getRequest", "()Ljavax/servlet/http/HttpServletRequest;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRequest", "(Ljavax/servlet/http/HttpServletRequest;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "setRequest", "(Ljavax/servlet/http/HttpServletRequest;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withRequest", "(Ljavax/servlet/http/HttpServletRequest;)Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "withRequest", "(Ljavax/servlet/http/HttpServletRequest;)Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResponse", "()Ljavax/servlet/http/HttpServletResponse;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "getResponse", "()Ljavax/servlet/http/HttpServletResponse;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setResponse", "(Ljavax/servlet/http/HttpServletResponse;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "setResponse", "(Ljavax/servlet/http/HttpServletResponse;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "redirect", "(Ljava/lang/String;)Ljavax/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "redirect", "(Ljava/lang/String;)Ljavax/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "forward", "(Ljava/lang/String;)Ljavax/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "forward", "(Ljava/lang/String;)Ljavax/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "responseUnauthorized", "()Ljavax/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "responseUnauthorized", "()Ljavax/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "responseNotFound", "()Ljavax/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "responseNotFound", "()Ljavax/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notifyContainerAboutLogin", "(Ljava/lang/String;Ljava/util/Set;)Ljavax/security/enterprise/AuthenticationStatus;", "(Ljava/lang/String;Ljava/util/Set<Ljava/lang/String;>;)Ljavax/security/enterprise/AuthenticationStatus;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "notifyContainerAboutLogin", "(Ljava/lang/String;Ljava/util/Set;)Ljavax/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notifyContainerAboutLogin", "(Ljava/security/Principal;Ljava/util/Set;)Ljavax/security/enterprise/AuthenticationStatus;", "(Ljava/security/Principal;Ljava/util/Set<Ljava/lang/String;>;)Ljavax/security/enterprise/AuthenticationStatus;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "notifyContainerAboutLogin", "(Ljava/security/Principal;Ljava/util/Set;)Ljavax/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notifyContainerAboutLogin", "(Ljavax/security/enterprise/identitystore/CredentialValidationResult;)Ljavax/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "notifyContainerAboutLogin", "(Ljavax/security/enterprise/identitystore/CredentialValidationResult;)Ljavax/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doNothing", "()Ljavax/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "doNothing", "()Ljavax/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCallerPrincipal", "()Ljava/security/Principal;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "getCallerPrincipal", "()Ljava/security/Principal;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGroups", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljavax/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/authentication/mechanism/http/HttpMessageContext", "getGroups", "()Ljava/util/Set;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
