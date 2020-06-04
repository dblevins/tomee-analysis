package asm.org.apache.cxf.rs.security.oauth2.services;
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
public class AuthorizationCodeGrantServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", null, "org/apache/cxf/rs/security/oauth2/services/RedirectionBasedGrantService", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/ws/rs/Path;", true);
annotationVisitor0.visit("value", "/authorize");
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("javax/ws/rs/core/Response$ResponseBuilder", "javax/ws/rs/core/Response", "ResponseBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "RECOMMENDED_CODE_EXPIRY_TIME_SECS", "J", null, new Long(600L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "canSupportPublicClients", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "canSupportEmptyRedirectForPrivateClients", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "oobDeliverer", "Lorg/apache/cxf/rs/security/oauth2/provider/OOBResponseDeliverer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "codeResponseFilter", "Lorg/apache/cxf/rs/security/oauth2/provider/AuthorizationCodeResponseFilter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("code");
methodVisitor.visitLdcInsn("authorization_code");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/services/RedirectionBasedGrantService", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createAuthorizationData", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljavax/ws/rs/core/MultivaluedMap;Ljava/lang/String;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/util/List;Ljava/util/List;Z)Lorg/apache/cxf/rs/security/oauth2/common/OAuthAuthorizationData;", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljavax/ws/rs/core/MultivaluedMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/util/List<Lorg/apache/cxf/rs/security/oauth2/common/OAuthPermission;>;Ljava/util/List<Lorg/apache/cxf/rs/security/oauth2/common/OAuthPermission;>;Z)Lorg/apache/cxf/rs/security/oauth2/common/OAuthAuthorizationData;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/services/RedirectionBasedGrantService", "createAuthorizationData", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljavax/ws/rs/core/MultivaluedMap;Ljava/lang/String;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/util/List;Ljava/util/List;Z)Lorg/apache/cxf/rs/security/oauth2/common/OAuthAuthorizationData;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "setCodeChallenge", "(Lorg/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState;Ljavax/ws/rs/core/MultivaluedMap;)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "recreateRedirectionStateFromParams", "(Ljavax/ws/rs/core/MultivaluedMap;)Lorg/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState;", "(Ljavax/ws/rs/core/MultivaluedMap<Ljava/lang/String;Ljava/lang/String;>;)Lorg/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/services/RedirectionBasedGrantService", "recreateRedirectionStateFromParams", "(Ljavax/ws/rs/core/MultivaluedMap;)Lorg/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "setCodeChallenge", "(Lorg/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState;Ljavax/ws/rs/core/MultivaluedMap;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "setCodeChallenge", "(Lorg/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState;Ljavax/ws/rs/core/MultivaluedMap;)V", "(Lorg/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState;Ljavax/ws/rs/core/MultivaluedMap<Ljava/lang/String;Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("code_challenge");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/MultivaluedMap", "getFirst", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "setClientCodeChallenge", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createGrant", "(Lorg/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState;Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/util/List;Ljava/util/List;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;)Ljavax/ws/rs/core/Response;", "(Lorg/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState;Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;)Ljavax/ws/rs/core/Response;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/cxf/rs/security/oauth2/provider/OAuthServiceException");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "getGrantRepresentation", "(Lorg/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState;Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/util/List;Ljava/util/List;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;)Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "org/apache/cxf/rs/security/oauth2/common/Client", "java/util/List", "java/util/List", "org/apache/cxf/rs/security/oauth2/common/UserSubject", "org/apache/cxf/rs/security/oauth2/common/ServerAccessToken", "org/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant"}, 1, new Object[] {"org/apache/cxf/rs/security/oauth2/provider/OAuthServiceException"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "getState", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "getRedirectUri", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("access_denied");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "createErrorResponse", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant", "getCode", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant", "getSubject", "()Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "processCodeGrant", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "getRedirectUri", "()Ljava/lang/String;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/oauth2/common/OOBAuthorizationResponse");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/common/OOBAuthorizationResponse", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/Client", "getClientId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OOBAuthorizationResponse", "setClientId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/Client", "getApplicationDescription", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OOBAuthorizationResponse", "setClientDescription", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OOBAuthorizationResponse", "setAuthorizationCode", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/UserSubject", "getLogin", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OOBAuthorizationResponse", "setUserId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant", "getExpiresIn", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OOBAuthorizationResponse", "setExpiresIn", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "deliverOOBResponse", "(Lorg/apache/cxf/rs/security/oauth2/common/OOBAuthorizationResponse;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "isFormResponse", "(Lorg/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/oauth2/common/FormAuthorizationResponse");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/common/FormAuthorizationResponse", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/FormAuthorizationResponse", "setAuthorizationCode", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant", "getExpiresIn", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/FormAuthorizationResponse", "setExpiresIn", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "getState", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/FormAuthorizationResponse", "setState", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "getRedirectUri", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/FormAuthorizationResponse", "setRedirectUri", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "createHtmlResponse", "(Ljava/lang/Object;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "getState", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "getRedirectUri", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "getRedirectUriBuilder", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/ws/rs/core/UriBuilder;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitLdcInsn("code");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/UriBuilder", "queryParam", "(Ljava/lang/String;[Ljava/lang/Object;)Ljavax/ws/rs/core/UriBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/UriBuilder", "build", "([Ljava/lang/Object;)Ljava/net/URI;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/Response", "seeOther", "(Ljava/net/URI;)Ljavax/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/Response$ResponseBuilder", "build", "()Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGrantRepresentation", "(Lorg/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState;Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/util/List;Ljava/util/List;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;)Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;", "(Lorg/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState;Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;)Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "createCodeRegistration", "(Lorg/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState;Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/util/List;Ljava/util/List;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;)Lorg/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "getDataProvider", "()Lorg/apache/cxf/rs/security/oauth2/provider/OAuthDataProvider;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeDataProvider");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeDataProvider", "createCodeGrant", "(Lorg/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration;)Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant", "getExpiresIn", "()J", false);
methodVisitor.visitLdcInsn(new Long(600L));
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("Code expiry time exceeds 10 minutes");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "warning", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration", "org/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createCodeRegistration", "(Lorg/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState;Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/util/List;Ljava/util/List;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;)Lorg/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration;", "(Lorg/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState;Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;)Lorg/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "org/apache/cxf/rs/security/oauth2/common/Client", "java/util/List", "java/util/List", "org/apache/cxf/rs/security/oauth2/common/UserSubject", "org/apache/cxf/rs/security/oauth2/common/ServerAccessToken", "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration"}, 1, new Object[] {"org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "org/apache/cxf/rs/security/oauth2/common/Client", "java/util/List", "java/util/List", "org/apache/cxf/rs/security/oauth2/common/UserSubject", "org/apache/cxf/rs/security/oauth2/common/ServerAccessToken", "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration"}, 2, new Object[] {"org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration", Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration", "setPreauthorizedTokenAvailable", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration", "setClient", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "getRedirectUri", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration", "setRedirectUri", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration", "setRequestedScope", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "getResponseType", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration", "setResponseType", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "getApprovedScope", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration", "setApprovedScope", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration", "setSubject", "(Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "getAudience", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration", "setAudience", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "getNonce", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration", "setNonce", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "getClientCodeChallenge", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration", "setClientCodeChallenge", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/AuthorizationCodeRegistration", "getExtraProperties", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OAuthRedirectionState", "getExtraProperties", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "putAll", "(Ljava/util/Map;)V", true);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processCodeGrant", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "codeResponseFilter", "Lorg/apache/cxf/rs/security/oauth2/provider/AuthorizationCodeResponseFilter;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "codeResponseFilter", "Lorg/apache/cxf/rs/security/oauth2/provider/AuthorizationCodeResponseFilter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/rs/security/oauth2/provider/AuthorizationCodeResponseFilter", "process", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "deliverOOBResponse", "(Lorg/apache/cxf/rs/security/oauth2/common/OOBAuthorizationResponse;)Ljavax/ws/rs/core/Response;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "oobDeliverer", "Lorg/apache/cxf/rs/security/oauth2/provider/OOBResponseDeliverer;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "oobDeliverer", "Lorg/apache/cxf/rs/security/oauth2/provider/OOBResponseDeliverer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/rs/security/oauth2/provider/OOBResponseDeliverer", "deliver", "(Lorg/apache/cxf/rs/security/oauth2/common/OOBAuthorizationResponse;)Ljavax/ws/rs/core/Response;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "createHtmlResponse", "(Ljava/lang/Object;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createErrorResponse", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/ws/rs/core/Response;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitIntInsn(SIPUSH, 401);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/Response", "status", "(I)Ljavax/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/Response$ResponseBuilder", "entity", "(Ljava/lang/Object;)Ljavax/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/Response$ResponseBuilder", "build", "()Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "getRedirectUriBuilder", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/ws/rs/core/UriBuilder;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("error");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/UriBuilder", "queryParam", "(Ljava/lang/String;[Ljava/lang/Object;)Ljavax/ws/rs/core/UriBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/UriBuilder", "build", "([Ljava/lang/Object;)Ljava/net/URI;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/Response", "seeOther", "(Ljava/net/URI;)Ljavax/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/Response$ResponseBuilder", "build", "()Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getRedirectUriBuilder", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/UriBuilder", "fromUri", "(Ljava/lang/String;)Ljavax/ws/rs/core/UriBuilder;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("state");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/UriBuilder", "queryParam", "(Ljava/lang/String;[Ljava/lang/Object;)Ljavax/ws/rs/core/UriBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/ws/rs/core/UriBuilder"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "canSupportPublicClient", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "canSupportPublicClients", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/Client", "isConfidential", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/Client", "getClientSecret", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "canRedirectUriBeEmpty", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/Client", "isConfidential", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "canSupportEmptyRedirectForPrivateClients", "Z");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCanSupportPublicClients", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "canSupportPublicClients", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCodeResponseFilter", "(Lorg/apache/cxf/rs/security/oauth2/provider/AuthorizationCodeResponseFilter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "codeResponseFilter", "Lorg/apache/cxf/rs/security/oauth2/provider/AuthorizationCodeResponseFilter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCanSupportEmptyRedirectForPrivateClients", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/oauth2/services/AuthorizationCodeGrantService", "canSupportEmptyRedirectForPrivateClients", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
