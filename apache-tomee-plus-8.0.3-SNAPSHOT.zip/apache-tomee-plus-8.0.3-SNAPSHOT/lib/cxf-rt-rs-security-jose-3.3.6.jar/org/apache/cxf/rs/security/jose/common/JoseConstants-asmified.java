package asm.org.apache.cxf.rs.security.jose.common;
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
public class JoseConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/rs/security/jose/common/JoseConstants", null, "org/apache/cxf/rt/security/rs/RSSecurityConstants", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HEADER_TYPE", "Ljava/lang/String;", null, "typ");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HEADER_ALGORITHM", "Ljava/lang/String;", null, "alg");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HEADER_CONTENT_TYPE", "Ljava/lang/String;", null, "cty");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HEADER_CRITICAL", "Ljava/lang/String;", null, "crit");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HEADER_KEY_ID", "Ljava/lang/String;", null, "kid");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HEADER_X509_URL", "Ljava/lang/String;", null, "x5u");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HEADER_X509_CHAIN", "Ljava/lang/String;", null, "x5c");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HEADER_X509_THUMBPRINT", "Ljava/lang/String;", null, "x5t");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HEADER_X509_THUMBPRINT_SHA256", "Ljava/lang/String;", null, "x5t#S256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HEADER_JSON_WEB_KEY", "Ljava/lang/String;", null, "jwk");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HEADER_JSON_WEB_KEY_SET", "Ljava/lang/String;", null, "jku");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JWE_HEADER_KEY_ENC_ALGORITHM", "Ljava/lang/String;", null, "alg");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JWE_HEADER_CONTENT_ENC_ALGORITHM", "Ljava/lang/String;", null, "enc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JWE_HEADER_ZIP_ALGORITHM", "Ljava/lang/String;", null, "zip");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JWE_DEFLATE_ZIP_ALGORITHM", "Ljava/lang/String;", null, "DEF");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JWS_HEADER_B64_STATUS_HEADER", "Ljava/lang/String;", null, "b64");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_JWT", "Ljava/lang/String;", null, "JWT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_JOSE", "Ljava/lang/String;", null, "JOSE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_JOSE_JSON", "Ljava/lang/String;", null, "JOSE+JSON");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MEDIA_TYPE_JOSE", "Ljava/lang/String;", null, "application/jose");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MEDIA_TYPE_JOSE_JSON", "Ljava/lang/String;", null, "application/jose+json");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JOSE_CONTEXT_PROPERTY", "Ljava/lang/String;", null, "org.apache.cxf.jose.context");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_KEY_STORE_ALIASES", "Ljava/lang/String;", null, "rs.security.keystore.aliases");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_ACCEPT_PUBLIC_KEY", "Ljava/lang/String;", null, "rs.security.accept.public.key");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_KEY_STORE_JWKSET", "Ljava/lang/String;", null, "rs.security.keystore.jwkset");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_KEY_STORE_JWKKEY", "Ljava/lang/String;", null, "rs.security.keystore.jwkkey");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_SIGNATURE_KEY_PSWD_PROVIDER", "Ljava/lang/String;", null, "rs.security.signature.key.password.provider");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_EC_CURVE", "Ljava/lang/String;", null, "rs.security.elliptic.curve");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_SIGNATURE_INCLUDE_PUBLIC_KEY", "Ljava/lang/String;", null, "rs.security.signature.include.public.key");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_SIGNATURE_INCLUDE_CERT", "Ljava/lang/String;", null, "rs.security.signature.include.cert");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_SIGNATURE_INCLUDE_KEY_ID", "Ljava/lang/String;", null, "rs.security.signature.include.key.id");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_SIGNATURE_INCLUDE_CERT_SHA1", "Ljava/lang/String;", null, "rs.security.signature.include.cert.sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_SIGNATURE_INCLUDE_CERT_SHA256", "Ljava/lang/String;", null, "rs.security.signature.include.cert.sha256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_DECRYPTION_KEY_PSWD_PROVIDER", "Ljava/lang/String;", null, "rs.security.decryption.key.password.provider");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_ENCRYPTION_CONTENT_ALGORITHM", "Ljava/lang/String;", null, "rs.security.encryption.content.algorithm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_ENCRYPTION_KEY_ALGORITHM", "Ljava/lang/String;", null, "rs.security.encryption.key.algorithm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_ENCRYPTION_ZIP_ALGORITHM", "Ljava/lang/String;", null, "rs.security.encryption.zip.algorithm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_ENCRYPTION_OUT_PROPS", "Ljava/lang/String;", null, "rs.security.encryption.out.properties");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_ENCRYPTION_IN_PROPS", "Ljava/lang/String;", null, "rs.security.encryption.in.properties");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_ENCRYPTION_PROPS", "Ljava/lang/String;", null, "rs.security.encryption.properties");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_ENCRYPTION_INCLUDE_PUBLIC_KEY", "Ljava/lang/String;", null, "rs.security.encryption.include.public.key");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_ENCRYPTION_INCLUDE_CERT", "Ljava/lang/String;", null, "rs.security.encryption.include.cert");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_ENCRYPTION_INCLUDE_KEY_ID", "Ljava/lang/String;", null, "rs.security.encryption.include.key.id");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_ENCRYPTION_INCLUDE_CERT_SHA1", "Ljava/lang/String;", null, "rs.security.encryption.include.cert.sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_ENCRYPTION_INCLUDE_CERT_SHA256", "Ljava/lang/String;", null, "rs.security.encryption.include.cert.sha256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSSEC_ENCRYPTION_PBES2_COUNT", "Ljava/lang/String;", null, "rs.security.encryption.pbes2.count");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENABLE_UNSIGNED_JWT_PRINCIPAL", "Ljava/lang/String;", null, "rs.security.enable.unsigned-jwt.principal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JOSE_DEBUG", "Ljava/lang/String;", null, "jose.debug");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rt/security/rs/RSSecurityConstants", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
