package asm.org.apache.wss4j.stax.securityToken;
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
public class WSSecurityTokenConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", null, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", null);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "TokenUsage", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "TokenType", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKENUSAGE_MAIN_SIGNATURE", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKENUSAGE_MAIN_ENCRYPTION", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKENUSAGE_SUPPORTING_TOKENS", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKENUSAGE_SIGNED_SUPPORTING_TOKENS", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKENUSAGE_ENDORSING_SUPPORTING_TOKENS", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKENUSAGE_SIGNED_ENDORSING_SUPPORTING_TOKENS", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKENUSAGE_SIGNED_ENCRYPTED_SUPPORTING_TOKENS", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKENUSAGE_ENCRYPTED_SUPPORTING_TOKENS", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKENUSAGE_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKENUSAGE_SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEYIDENTIFIER_SECURITY_TOKEN_DIRECT_REFERENCE", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEYIDENTIFIER_THUMBPRINT_IDENTIFIER", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEYIDENTIFIER_ENCRYPTED_KEY_SHA1_IDENTIFIER", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEYIDENTIFIER_KERBEROS_SHA1_IDENTIFIER", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEYIDENTIFIER_EMBEDDED_KEY_IDENTIFIER_REF", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEYIDENTIFIER_USERNAME_TOKEN_REFERENCE", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEYIDENTIFIER_EXTERNAL_REFERENCE", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USERNAME_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECURITY_CONTEXT_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML_10_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML_11_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML_20_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ISSUED_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECURE_CONVERSATION_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTPS_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KERBEROS_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SPNEGO_CONTEXT_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REL_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MainSignature");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "TOKENUSAGE_MAIN_SIGNATURE", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MainEncryption");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "TOKENUSAGE_MAIN_ENCRYPTION", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SupportingTokens");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "TOKENUSAGE_SUPPORTING_TOKENS", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SignedSupportingTokens");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "TOKENUSAGE_SIGNED_SUPPORTING_TOKENS", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EndorsingSupportingTokens");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "TOKENUSAGE_ENDORSING_SUPPORTING_TOKENS", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SignedEndorsingSupportingTokens");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "TOKENUSAGE_SIGNED_ENDORSING_SUPPORTING_TOKENS", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SignedEncryptedSupportingTokens");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "TOKENUSAGE_SIGNED_ENCRYPTED_SUPPORTING_TOKENS", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EncryptedSupportingTokens");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "TOKENUSAGE_ENCRYPTED_SUPPORTING_TOKENS", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EndorsingEncryptedSupportingTokens");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "TOKENUSAGE_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SignedEndorsingEncryptedSupportingTokens");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "TOKENUSAGE_SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SecurityTokenDirectReference");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "KEYIDENTIFIER_SECURITY_TOKEN_DIRECT_REFERENCE", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ThumbprintIdentifier");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "KEYIDENTIFIER_THUMBPRINT_IDENTIFIER", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EncryptedKeySha1Identifier");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "KEYIDENTIFIER_ENCRYPTED_KEY_SHA1_IDENTIFIER", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KerberosSha1Identifier");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "KEYIDENTIFIER_KERBEROS_SHA1_IDENTIFIER", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EmbeddedKeyIdentifierRef");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "KEYIDENTIFIER_EMBEDDED_KEY_IDENTIFIER_REF", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UsernameTokenReference");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "KEYIDENTIFIER_USERNAME_TOKEN_REFERENCE", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ExternalReference");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "KEYIDENTIFIER_EXTERNAL_REFERENCE", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UsernameToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "USERNAME_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SecurityContextToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "SECURITY_CONTEXT_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Saml10Token");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "SAML_10_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Saml11Token");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "SAML_11_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Saml20Token");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "SAML_20_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IssuedToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "ISSUED_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SecureConversationToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "SECURE_CONVERSATION_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HttpsToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "HTTPS_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KerberosToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "KERBEROS_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SpnegoContextToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "SPNEGO_CONTEXT_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RelToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "REL_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
