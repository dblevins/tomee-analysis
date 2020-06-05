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
public class HttpMessageContextWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", null, "java/lang/Object", new String[] { "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "httpMessageContext", "Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "httpMessageContext", "Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "httpMessageContext", "Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isProtected", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "isProtected", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAuthenticationRequest", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "isAuthenticationRequest", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isRegisterSession", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "isRegisterSession", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRegisterSession", "(Ljava/lang/String;Ljava/util/Set;)V", "(Ljava/lang/String;Ljava/util/Set<Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "setRegisterSession", "(Ljava/lang/String;Ljava/util/Set;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cleanClientSubject", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "cleanClientSubject", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAuthParameters", "()Ljakarta/security/enterprise/authentication/mechanism/http/AuthenticationParameters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "getAuthParameters", "()Ljakarta/security/enterprise/authentication/mechanism/http/AuthenticationParameters;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHandler", "()Ljavax/security/auth/callback/CallbackHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "getHandler", "()Ljavax/security/auth/callback/CallbackHandler;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageInfo", "()Ljakarta/security/auth/message/MessageInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "getMessageInfo", "()Ljakarta/security/auth/message/MessageInfo;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClientSubject", "()Ljavax/security/auth/Subject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "getClientSubject", "()Ljavax/security/auth/Subject;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRequest", "()Ljakarta/servlet/http/HttpServletRequest;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "getRequest", "()Ljakarta/servlet/http/HttpServletRequest;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRequest", "(Ljakarta/servlet/http/HttpServletRequest;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "setRequest", "(Ljakarta/servlet/http/HttpServletRequest;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withRequest", "(Ljakarta/servlet/http/HttpServletRequest;)Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "withRequest", "(Ljakarta/servlet/http/HttpServletRequest;)Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResponse", "()Ljakarta/servlet/http/HttpServletResponse;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "getResponse", "()Ljakarta/servlet/http/HttpServletResponse;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setResponse", "(Ljakarta/servlet/http/HttpServletResponse;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "setResponse", "(Ljakarta/servlet/http/HttpServletResponse;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "redirect", "(Ljava/lang/String;)Ljakarta/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "redirect", "(Ljava/lang/String;)Ljakarta/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "forward", "(Ljava/lang/String;)Ljakarta/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "forward", "(Ljava/lang/String;)Ljakarta/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "responseUnauthorized", "()Ljakarta/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "responseUnauthorized", "()Ljakarta/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "responseNotFound", "()Ljakarta/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "responseNotFound", "()Ljakarta/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notifyContainerAboutLogin", "(Ljava/lang/String;Ljava/util/Set;)Ljakarta/security/enterprise/AuthenticationStatus;", "(Ljava/lang/String;Ljava/util/Set<Ljava/lang/String;>;)Ljakarta/security/enterprise/AuthenticationStatus;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "notifyContainerAboutLogin", "(Ljava/lang/String;Ljava/util/Set;)Ljakarta/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notifyContainerAboutLogin", "(Ljava/security/Principal;Ljava/util/Set;)Ljakarta/security/enterprise/AuthenticationStatus;", "(Ljava/security/Principal;Ljava/util/Set<Ljava/lang/String;>;)Ljakarta/security/enterprise/AuthenticationStatus;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "notifyContainerAboutLogin", "(Ljava/security/Principal;Ljava/util/Set;)Ljakarta/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notifyContainerAboutLogin", "(Ljakarta/security/enterprise/identitystore/CredentialValidationResult;)Ljakarta/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "notifyContainerAboutLogin", "(Ljakarta/security/enterprise/identitystore/CredentialValidationResult;)Ljakarta/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doNothing", "()Ljakarta/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "doNothing", "()Ljakarta/security/enterprise/AuthenticationStatus;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCallerPrincipal", "()Ljava/security/Principal;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "getCallerPrincipal", "()Ljava/security/Principal;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGroups", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContextWrapper", "getWrapped", "()Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", "getGroups", "()Ljava/util/Set;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
