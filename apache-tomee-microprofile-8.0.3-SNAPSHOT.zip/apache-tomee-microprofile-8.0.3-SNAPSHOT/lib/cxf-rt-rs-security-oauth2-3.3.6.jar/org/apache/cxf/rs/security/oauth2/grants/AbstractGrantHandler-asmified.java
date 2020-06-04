package asm.org.apache.cxf.rs.security.oauth2.grants;
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
public class AbstractGrantHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", null, "java/lang/Object", new String[] { "org/apache/cxf/rs/security/oauth2/provider/AccessTokenGrantHandler" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "LOG", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "supportedGrants", "Ljava/util/List;", "Ljava/util/List<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "dataProvider", "Lorg/apache/cxf/rs/security/oauth2/provider/OAuthDataProvider;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "partialMatchScopeValidation", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "canSupportPublicClients", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonList", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "supportedGrants", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/util/List;)V", "(Ljava/util/List<Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("The list of grant types can not be empty");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "java/util/List"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "supportedGrants", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDataProvider", "(Lorg/apache/cxf/rs/security/oauth2/provider/OAuthDataProvider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "dataProvider", "Lorg/apache/cxf/rs/security/oauth2/provider/OAuthDataProvider;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDataProvider", "()Lorg/apache/cxf/rs/security/oauth2/provider/OAuthDataProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "dataProvider", "Lorg/apache/cxf/rs/security/oauth2/provider/OAuthDataProvider;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSupportedGrantTypes", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "supportedGrants", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableList", "(Ljava/util/List;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getSingleGrantType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "supportedGrants", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitLdcInsn("Request grant type must be specified");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "warning", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "javax/ws/rs/WebApplicationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 500);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/WebApplicationException", "<init>", "(I)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "supportedGrants", "Ljava/util/List;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doCreateAccessToken", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljavax/ws/rs/core/MultivaluedMap;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljavax/ws/rs/core/MultivaluedMap<Ljava/lang/String;Ljava/lang/String;>;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("scope");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/MultivaluedMap", "getFirst", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/oauth2/utils/OAuthUtils", "parseScope", "(Ljava/lang/String;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("audience");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/MultivaluedMap", "getFirst", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "getAudiences", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "doCreateAccessToken", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/util/List;Ljava/util/List;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doCreateAccessToken", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/util/List;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/util/List<Ljava/lang/String;>;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "getSingleGrantType", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "doCreateAccessToken", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/lang/String;Ljava/util/List;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doCreateAccessToken", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/util/List;Ljava/util/List;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "getSingleGrantType", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "doCreateAccessToken", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doCreateAccessToken", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/lang/String;Ljava/util/List;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "doCreateAccessToken", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doCreateAccessToken", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "getPreAuthorizedToken", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/rs/security/oauth2/common/ServerAccessToken"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/oauth2/common/AccessTokenRegistration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/common/AccessTokenRegistration", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/AccessTokenRegistration", "setClient", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/AccessTokenRegistration", "setGrantType", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/AccessTokenRegistration", "setSubject", "(Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/AccessTokenRegistration", "setRequestedScope", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "getApprovedScopes", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/util/List;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/AccessTokenRegistration", "setApprovedScope", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/AccessTokenRegistration", "setAudiences", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "dataProvider", "Lorg/apache/cxf/rs/security/oauth2/provider/OAuthDataProvider;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/rs/security/oauth2/provider/OAuthDataProvider", "createAccessToken", "(Lorg/apache/cxf/rs/security/oauth2/common/AccessTokenRegistration;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getApprovedScopes", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/util/List;)Ljava/util/List;", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/util/List<Ljava/lang/String;>;)Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getPreAuthorizedToken", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/Client", "getRegisteredScopes", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "partialMatchScopeValidation", "Z");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/oauth2/utils/OAuthUtils", "validateScopes", "(Ljava/util/List;Ljava/util/List;Z)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/oauth2/provider/OAuthServiceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/oauth2/common/OAuthError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("invalid_scope");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/common/OAuthError", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/provider/OAuthServiceException", "<init>", "(Lorg/apache/cxf/rs/security/oauth2/common/OAuthError;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/Client", "getRegisteredAudiences", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/oauth2/utils/OAuthUtils", "validateAudiences", "(Ljava/util/List;Ljava/util/List;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/oauth2/provider/OAuthServiceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/oauth2/common/OAuthError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("invalid_grant");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/common/OAuthError", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/provider/OAuthServiceException", "<init>", "(Lorg/apache/cxf/rs/security/oauth2/common/OAuthError;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "dataProvider", "Lorg/apache/cxf/rs/security/oauth2/provider/OAuthDataProvider;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/rs/security/oauth2/provider/OAuthDataProvider", "getPreauthorizedToken", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/util/List;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/lang/String;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPartialMatchScopeValidation", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "partialMatchScopeValidation", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPartialMatchScopeValidation", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "partialMatchScopeValidation", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCanSupportPublicClients", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "canSupportPublicClients", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isCanSupportPublicClients", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "canSupportPublicClients", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getAudiences", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;)Ljava/util/List;", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/Client", "getRegisteredAudiences", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonList", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/Client", "getRegisteredAudiences", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/oauth2/utils/OAuthUtils", "validateAudiences", "(Ljava/util/List;Ljava/util/List;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/oauth2/provider/OAuthServiceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("invalid_grant");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/provider/OAuthServiceException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/List"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/Client", "getRegisteredAudiences", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/logging/LogUtils", "getL7dLogger", "(Ljava/lang/Class;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/oauth2/grants/AbstractGrantHandler", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
