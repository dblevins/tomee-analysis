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
public class HttpMessageContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isProtected", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isAuthenticationRequest", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isRegisterSession", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setRegisterSession", "(Ljava/lang/String;Ljava/util/Set;)V", "(Ljava/lang/String;Ljava/util/Set<Ljava/lang/String;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cleanClientSubject", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAuthParameters", "()Ljakarta/security/enterprise/authentication/mechanism/http/AuthenticationParameters;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getHandler", "()Ljavax/security/auth/callback/CallbackHandler;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMessageInfo", "()Ljakarta/security/auth/message/MessageInfo;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClientSubject", "()Ljavax/security/auth/Subject;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequest", "()Ljakarta/servlet/http/HttpServletRequest;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setRequest", "(Ljakarta/servlet/http/HttpServletRequest;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "withRequest", "(Ljakarta/servlet/http/HttpServletRequest;)Ljakarta/security/enterprise/authentication/mechanism/http/HttpMessageContext;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getResponse", "()Ljakarta/servlet/http/HttpServletResponse;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setResponse", "(Ljakarta/servlet/http/HttpServletResponse;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "redirect", "(Ljava/lang/String;)Ljakarta/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "forward", "(Ljava/lang/String;)Ljakarta/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "responseUnauthorized", "()Ljakarta/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "responseNotFound", "()Ljakarta/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notifyContainerAboutLogin", "(Ljava/lang/String;Ljava/util/Set;)Ljakarta/security/enterprise/AuthenticationStatus;", "(Ljava/lang/String;Ljava/util/Set<Ljava/lang/String;>;)Ljakarta/security/enterprise/AuthenticationStatus;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notifyContainerAboutLogin", "(Ljava/security/Principal;Ljava/util/Set;)Ljakarta/security/enterprise/AuthenticationStatus;", "(Ljava/security/Principal;Ljava/util/Set<Ljava/lang/String;>;)Ljakarta/security/enterprise/AuthenticationStatus;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notifyContainerAboutLogin", "(Ljakarta/security/enterprise/identitystore/CredentialValidationResult;)Ljakarta/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doNothing", "()Ljakarta/security/enterprise/AuthenticationStatus;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCallerPrincipal", "()Ljava/security/Principal;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getGroups", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
