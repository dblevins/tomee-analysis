package asm.org.apache.cxf.rt.security.saml.interceptor;
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
public class WSS4JBasicAuthValidatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SAML_ROLE_ATTRIBUTENAME_DEFAULT", "Ljava/lang/String;", null, "http://schemas.xmlsoap.org/ws/2005/05/identity/claims/role");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "validator", "Lorg/apache/wss4j/dom/validate/Validator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "callbackHandler", "Ljavax/security/auth/callback/CallbackHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "validate", "(Lorg/apache/cxf/message/Message;)V", null, new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/configuration/security/AuthorizationPolicy;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "get", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/configuration/security/AuthorizationPolicy");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/AuthorizationPolicy", "getUserName", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/AuthorizationPolicy", "getPassword", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/configuration/security/AuthorizationPolicy"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/AuthorizationPolicy", "getUserName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("No user name and/or password is available, name: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "warning", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/SecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/SecurityException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator", "convertPolicyToToken", "(Lorg/apache/cxf/configuration/security/AuthorizationPolicy;)Lorg/apache/wss4j/dom/message/token/UsernameToken;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/dom/validate/Credential");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/validate/Credential", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/validate/Credential", "setUsernametoken", "(Lorg/apache/wss4j/dom/message/token/UsernameToken;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/dom/handler/RequestData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/handler/RequestData", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "setMsgContext", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator", "callbackHandler", "Ljavax/security/auth/callback/CallbackHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "setCallbackHandler", "(Ljavax/security/auth/callback/CallbackHandler;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator", "getValidator", "()Lorg/apache/wss4j/dom/validate/Validator;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/dom/validate/Validator", "validate", "(Lorg/apache/wss4j/dom/validate/Credential;Lorg/apache/wss4j/dom/handler/RequestData;)Lorg/apache/wss4j/dom/validate/Credential;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/validate/Credential", "getPrincipal", "()Ljava/security/Principal;", false);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator", "createSecurityContext", "(Lorg/apache/cxf/message/Message;Lorg/apache/wss4j/dom/validate/Credential;)Lorg/apache/cxf/security/SecurityContext;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator", "org/apache/cxf/message/Message", "org/apache/cxf/configuration/security/AuthorizationPolicy", "org/apache/wss4j/dom/message/token/UsernameToken", "org/apache/wss4j/dom/validate/Credential", "org/apache/wss4j/dom/handler/RequestData", "org/apache/cxf/security/SecurityContext"}, 0, new Object[] {});
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/principal/WSUsernameTokenPrincipalImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/AuthorizationPolicy", "getUserName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/principal/WSUsernameTokenPrincipalImpl", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/common/principal/WSUsernameTokenPrincipalImpl");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/AuthorizationPolicy", "getPassword", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/principal/WSUsernameTokenPrincipalImpl", "setPassword", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator", "createSecurityContext", "(Ljava/security/Principal;)Lorg/apache/cxf/security/SecurityContext;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/security/SecurityContext;"));
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "put", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "convertPolicyToToken", "(Lorg/apache/cxf/configuration/security/AuthorizationPolicy;)Lorg/apache/wss4j/dom/message/token/UsernameToken;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/helpers/DOMUtils", "getEmptyDocument", "()Lorg/w3c/dom/Document;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/dom/message/token/UsernameToken");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/message/token/UsernameToken", "<init>", "(ZLorg/w3c/dom/Document;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/AuthorizationPolicy", "getUserName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/UsernameToken", "setName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/AuthorizationPolicy", "getPassword", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/UsernameToken", "setPassword", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createSecurityContext", "(Ljava/security/Principal;)Lorg/apache/cxf/security/SecurityContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator$1", "<init>", "(Lorg/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator;Ljava/security/Principal;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createSecurityContext", "(Lorg/apache/cxf/message/Message;Lorg/apache/wss4j/dom/validate/Credential;)Lorg/apache/cxf/security/SecurityContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/validate/Credential", "getTransformedToken", "()Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/validate/Credential", "getSamlAssertion", "()Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/wss4j/common/saml/SamlAssertionWrapper"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitLdcInsn("security.saml-role-attributename");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rt/security/utils/SecurityUtils", "getSecurityPropertyValue", "(Ljava/lang/String;Lorg/apache/cxf/message/Message;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/05/identity/claims/role");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rt/security/saml/utils/SAMLUtils", "getClaims", "(Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;)Lorg/apache/cxf/rt/security/claims/ClaimCollection;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rt/security/saml/utils/SAMLUtils", "parseRolesFromClaims", "(Lorg/apache/cxf/rt/security/claims/ClaimCollection;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rt/security/saml/claims/SAMLSecurityContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/validate/Credential", "getPrincipal", "()Ljava/security/Principal;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rt/security/saml/claims/SAMLSecurityContext", "<init>", "(Ljava/security/Principal;Ljava/util/Set;Lorg/apache/cxf/rt/security/claims/ClaimCollection;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rt/security/saml/utils/SAMLUtils", "getIssuer", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rt/security/saml/claims/SAMLSecurityContext", "setIssuer", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rt/security/saml/utils/SAMLUtils", "getAssertionElement", "(Ljava/lang/Object;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rt/security/saml/claims/SAMLSecurityContext", "setAssertionElement", "(Lorg/w3c/dom/Element;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/validate/Credential", "getPrincipal", "()Ljava/security/Principal;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator", "createSecurityContext", "(Ljava/security/Principal;)Lorg/apache/cxf/security/SecurityContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValidator", "()Lorg/apache/wss4j/dom/validate/Validator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator", "validator", "Lorg/apache/wss4j/dom/validate/Validator;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator", "validator", "Lorg/apache/wss4j/dom/validate/Validator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/dom/validate/UsernameTokenValidator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/validate/UsernameTokenValidator", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValidator", "(Lorg/apache/wss4j/dom/validate/Validator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator", "validator", "Lorg/apache/wss4j/dom/validate/Validator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCallbackHandler", "()Ljavax/security/auth/callback/CallbackHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator", "callbackHandler", "Ljavax/security/auth/callback/CallbackHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCallbackHandler", "(Ljavax/security/auth/callback/CallbackHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator", "callbackHandler", "Ljavax/security/auth/callback/CallbackHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/logging/LogUtils", "getL7dLogger", "(Ljava/lang/Class;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rt/security/saml/interceptor/WSS4JBasicAuthValidator", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
