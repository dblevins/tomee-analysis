package asm.org.apache.cxf.rs.security.oauth2.utils;
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
public class OAuthConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/rs/security/oauth2/utils/OAuthConstants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLIENT_ID", "Ljava/lang/String;", null, "client_id");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLIENT_SECRET", "Ljava/lang/String;", null, "client_secret");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLIENT_AUDIENCE", "Ljava/lang/String;", null, "audience");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOURCE_INDICATOR", "Ljava/lang/String;", null, "resource");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NONCE", "Ljava/lang/String;", null, "nonce");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REDIRECT_URI", "Ljava/lang/String;", null, "redirect_uri");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCOPE", "Ljava/lang/String;", null, "scope");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STATE", "Ljava/lang/String;", null, "state");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACCESS_TOKEN", "Ljava/lang/String;", null, "access_token");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACCESS_TOKEN_TYPE", "Ljava/lang/String;", null, "token_type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACCESS_TOKEN_EXPIRES_IN", "Ljava/lang/String;", null, "expires_in");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GRANT_TYPE", "Ljava/lang/String;", null, "grant_type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESPONSE_TYPE", "Ljava/lang/String;", null, "response_type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKEN_RESPONSE_TYPE", "Ljava/lang/String;", null, "token");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFRESH_TOKEN", "Ljava/lang/String;", null, "refresh_token");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESPONSE_MODE", "Ljava/lang/String;", null, "response_mode");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FORM_RESPONSE_MODE", "Ljava/lang/String;", null, "form_post");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKEN_REQUEST_PARAMS", "Ljava/lang/String;", null, "token_request_params");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACCESS_TOKEN_ISSUED_AT", "Ljava/lang/String;", null, "issued_at");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTHORIZATION_CODE_GRANT", "Ljava/lang/String;", null, "authorization_code");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLIENT_CREDENTIALS_GRANT", "Ljava/lang/String;", null, "client_credentials");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IMPLICIT_GRANT", "Ljava/lang/String;", null, "implicit");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOURCE_OWNER_GRANT", "Ljava/lang/String;", null, "password");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFRESH_TOKEN_GRANT", "Ljava/lang/String;", null, "refresh_token");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IMPLICIT_CONFIDENTIAL_GRANT", "Ljava/lang/String;", null, "urn:ietf:params:oauth:grant-type:implicit-confidential");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DIRECT_TOKEN_GRANT", "Ljava/lang/String;", null, "urn:ietf:params:oauth:grant-type:direct-token-grant");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BEARER_TOKEN_TYPE", "Ljava/lang/String;", null, "Bearer");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HAWK_TOKEN_TYPE", "Ljava/lang/String;", null, "hawk");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTHORIZATION_CODE_VERIFIER", "Ljava/lang/String;", null, "code_verifier");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTHORIZATION_CODE_CHALLENGE", "Ljava/lang/String;", null, "code_challenge");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTHORIZATION_CODE_CHALLENGE_METHOD", "Ljava/lang/String;", null, "code_challenge_method");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFRESH_TOKEN_TYPE", "Ljava/lang/String;", null, "refresh");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HAWK_TOKEN_KEY", "Ljava/lang/String;", null, "secret");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HAWK_TOKEN_ALGORITHM", "Ljava/lang/String;", null, "algorithm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HAWK_TOKEN_ID", "Ljava/lang/String;", null, "id");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HAWK_TOKEN_TIMESTAMP", "Ljava/lang/String;", null, "ts");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HAWK_TOKEN_EXTENSION", "Ljava/lang/String;", null, "ext");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HAWK_TOKEN_NONCE", "Ljava/lang/String;", null, "nonce");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HAWK_TOKEN_SIGNATURE", "Ljava/lang/String;", null, "mac");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HMAC_ALGO_SHA_1", "Ljava/lang/String;", null, "hmac-sha-1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HMAC_ALGO_SHA_256", "Ljava/lang/String;", null, "hmac-sha-256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BEARER_AUTHORIZATION_SCHEME", "Ljava/lang/String;", null, "Bearer");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HAWK_AUTHORIZATION_SCHEME", "Ljava/lang/String;", null, "Hawk");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALL_AUTH_SCHEMES", "Ljava/lang/String;", null, "*");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BASIC_SCHEME", "Ljava/lang/String;", null, "Basic");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTHORIZATION_CODE_VALUE", "Ljava/lang/String;", null, "code");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CODE_RESPONSE_TYPE", "Ljava/lang/String;", null, "code");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SESSION_AUTHENTICITY_TOKEN", "Ljava/lang/String;", null, "session_authenticity_token");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SESSION_AUTHENTICITY_TOKEN_PARAM_NAME", "Ljava/lang/String;", null, "session_authenticity_token_param_name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTHORIZATION_DECISION_KEY", "Ljava/lang/String;", null, "oauthDecision");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTHORIZATION_DECISION_ALLOW", "Ljava/lang/String;", null, "allow");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTHORIZATION_DECISION_DENY", "Ljava/lang/String;", null, "deny");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOURCE_OWNER_NAME", "Ljava/lang/String;", null, "username");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOURCE_OWNER_PASSWORD", "Ljava/lang/String;", null, "password");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ERROR_KEY", "Ljava/lang/String;", null, "error");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ERROR_DESCRIPTION_KEY", "Ljava/lang/String;", null, "error_description");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ERROR_URI_KEY", "Ljava/lang/String;", null, "error_uri");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVER_ERROR", "Ljava/lang/String;", null, "server_error");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_REQUEST", "Ljava/lang/String;", null, "invalid_request");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_GRANT", "Ljava/lang/String;", null, "invalid_grant");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNSUPPORTED_GRANT_TYPE", "Ljava/lang/String;", null, "unsupported_grant_type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNSUPPORTED_RESPONSE_TYPE", "Ljava/lang/String;", null, "unsupported_response_type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNAUTHORIZED_CLIENT", "Ljava/lang/String;", null, "unauthorized_client");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_CLIENT", "Ljava/lang/String;", null, "invalid_client");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_SCOPE", "Ljava/lang/String;", null, "invalid_scope");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACCESS_DENIED", "Ljava/lang/String;", null, "access_denied");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKEN_ID", "Ljava/lang/String;", null, "token");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKEN_TYPE_HINT", "Ljava/lang/String;", null, "token_type_hint");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNSUPPORTED_TOKEN_TYPE", "Ljava/lang/String;", null, "unsupported_token_type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKEN_ENDPOINT_AUTH_NONE", "Ljava/lang/String;", null, "none");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKEN_ENDPOINT_AUTH_BASIC", "Ljava/lang/String;", null, "client_secret_basic");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKEN_ENDPOINT_AUTH_POST", "Ljava/lang/String;", null, "client_secret_post");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKEN_ENDPOINT_AUTH_TLS", "Ljava/lang/String;", null, "tls_client_auth");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_CLIENT_AUTH_SUBJECT_DN", "Ljava/lang/String;", null, "tls_client_auth_subject_dn");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_CLIENT_AUTH_ISSUER_DN", "Ljava/lang/String;", null, "tls_client_auth_root_dn");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTHORIZATION_SCHEME_TYPE", "Ljava/lang/String;", null, "authScheme");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTHORIZATION_SCHEME_DATA", "Ljava/lang/String;", null, "authSchemeData");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFRESH_TOKEN_SCOPE", "Ljava/lang/String;", null, "refreshToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLIENT_SECRET_SIGNATURE_ALGORITHM", "Ljava/lang/String;", null, "client.secret.signature.algorithm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLIENT_SECRET_CONTENT_ENCRYPTION_ALGORITHM", "Ljava/lang/String;", null, "client.secret.content.encryption.algorithm");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
