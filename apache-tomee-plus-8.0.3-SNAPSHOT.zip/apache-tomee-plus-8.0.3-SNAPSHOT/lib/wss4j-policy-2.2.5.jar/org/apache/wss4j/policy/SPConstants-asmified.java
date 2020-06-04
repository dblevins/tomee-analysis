package asm.org.apache.wss4j.policy;
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
public class SPConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/wss4j/policy/SPConstants", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/wss4j/policy/SPConstants$IncludeTokenType", "org/apache/wss4j/policy/SPConstants", "IncludeTokenType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/wss4j/policy/SPConstants$SPVersion", "org/apache/wss4j/policy/SPConstants", "SPVersion", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ERR_INVALID_POLICY", "Ljava/lang/String;", null, "Invalid Policy");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EMPTY_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_LOCALNAME", "Ljava/lang/String;", null, "Policy");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LAYOUT", "Ljava/lang/String;", null, "Layout");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LAYOUT_STRICT", "Ljava/lang/String;", null, "Strict");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LAYOUT_LAX", "Ljava/lang/String;", null, "Lax");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LAYOUT_LAX_TIMESTAMP_FIRST", "Ljava/lang/String;", null, "LaxTsFirst");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LAYOUT_LAX_TIMESTAMP_LAST", "Ljava/lang/String;", null, "LaxTsLast");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCRYPT_BEFORE_SIGNING", "Ljava/lang/String;", null, "EncryptBeforeSigning");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGN_BEFORE_ENCRYPTING", "Ljava/lang/String;", null, "SignBeforeEncrypting");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCRYPT_SIGNATURE", "Ljava/lang/String;", null, "EncryptSignature");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROTECT_TOKENS", "Ljava/lang/String;", null, "ProtectTokens");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONLY_SIGN_ENTIRE_HEADERS_AND_BODY", "Ljava/lang/String;", null, "OnlySignEntireHeadersAndBody");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCLUDE_TIMESTAMP", "Ljava/lang/String;", null, "IncludeTimestamp");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNED_PARTS", "Ljava/lang/String;", null, "SignedParts");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCRYPTED_PARTS", "Ljava/lang/String;", null, "EncryptedParts");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNED_ELEMENTS", "Ljava/lang/String;", null, "SignedElements");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCRYPTED_ELEMENTS", "Ljava/lang/String;", null, "EncryptedElements");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRED_ELEMENTS", "Ljava/lang/String;", null, "RequiredElements");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONTENT_ENCRYPTED_ELEMENTS", "Ljava/lang/String;", null, "ContentEncryptedElements");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRED_PARTS", "Ljava/lang/String;", null, "RequiredParts");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XPATH_VERSION", "Ljava/lang/String;", null, "XPathVersion");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XPATH_EXPR", "Ljava/lang/String;", null, "XPath");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XPATH2_EXPR", "Ljava/lang/String;", null, "Xpath2");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FILTER", "Ljava/lang/String;", null, "Filter");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X509_TOKEN", "Ljava/lang/String;", null, "X509Token");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSS_X509_V1_TOKEN10", "Ljava/lang/String;", null, "WssX509V1Token10");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSS_X509_V3_TOKEN10", "Ljava/lang/String;", null, "WssX509V3Token10");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSS_X509_PKCS7_TOKEN10", "Ljava/lang/String;", null, "WssX509Pkcs7Token10");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSS_X509_PKI_PATH_V1_TOKEN10", "Ljava/lang/String;", null, "WssX509PkiPathV1Token10");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSS_X509_V1_TOKEN11", "Ljava/lang/String;", null, "WssX509V1Token11");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSS_X509_V3_TOKEN11", "Ljava/lang/String;", null, "WssX509V3Token11");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSS_X509_PKCS7_TOKEN11", "Ljava/lang/String;", null, "WssX509Pkcs7Token11");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSS_X509_PKI_PATH_V1_TOKEN11", "Ljava/lang/String;", null, "WssX509PkiPathV1Token11");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USERNAME_TOKEN", "Ljava/lang/String;", null, "UsernameToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USERNAME_TOKEN10", "Ljava/lang/String;", null, "WssUsernameToken10");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USERNAME_TOKEN11", "Ljava/lang/String;", null, "WssUsernameToken11");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSPORT_TOKEN", "Ljava/lang/String;", null, "TransportToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTPS_TOKEN", "Ljava/lang/String;", null, "HttpsToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KERBEROS_TOKEN", "Ljava/lang/String;", null, "KerberosToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SPNEGO_CONTEXT_TOKEN", "Ljava/lang/String;", null, "SpnegoContextToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_CLIENT_CERTIFICATE", "Ljava/lang/String;", null, "RequireClientCertificate");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_BASIC_AUTHENTICATION", "Ljava/lang/String;", null, "HttpBasicAuthentication");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_DIGEST_AUTHENTICATION", "Ljava/lang/String;", null, "HttpDigestAuthentication");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECURITY_CONTEXT_TOKEN", "Ljava/lang/String;", null, "SecurityContextToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECURE_CONVERSATION_TOKEN", "Ljava/lang/String;", null, "SecureConversationToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML_TOKEN", "Ljava/lang/String;", null, "SamlToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REL_TOKEN", "Ljava/lang/String;", null, "RelToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_VALUE_TOKEN", "Ljava/lang/String;", null, "KeyValueToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSA_KEY_VALUE", "Ljava/lang/String;", null, "RsaKeyValue");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ISSUED_TOKEN", "Ljava/lang/String;", null, "IssuedToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_TOKEN", "Ljava/lang/String;", null, "SignatureToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCRYPTION_TOKEN", "Ljava/lang/String;", null, "EncryptionToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROTECTION_TOKEN", "Ljava/lang/String;", null, "ProtectionToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INITIATOR_TOKEN", "Ljava/lang/String;", null, "InitiatorToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INITIATOR_SIGNATURE_TOKEN", "Ljava/lang/String;", null, "InitiatorSignatureToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INITIATOR_ENCRYPTION_TOKEN", "Ljava/lang/String;", null, "InitiatorEncryptionToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RECIPIENT_TOKEN", "Ljava/lang/String;", null, "RecipientToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RECIPIENT_SIGNATURE_TOKEN", "Ljava/lang/String;", null, "RecipientSignatureToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RECIPIENT_ENCRYPTION_TOKEN", "Ljava/lang/String;", null, "RecipientEncryptionToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUPPORTING_TOKENS", "Ljava/lang/String;", null, "SupportingTokens");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNED_SUPPORTING_TOKENS", "Ljava/lang/String;", null, "SignedSupportingTokens");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENDORSING_SUPPORTING_TOKENS", "Ljava/lang/String;", null, "EndorsingSupportingTokens");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNED_ENDORSING_SUPPORTING_TOKENS", "Ljava/lang/String;", null, "SignedEndorsingSupportingTokens");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCRYPTED_SUPPORTING_TOKENS", "Ljava/lang/String;", null, "EncryptedSupportingTokens");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNED_ENCRYPTED_SUPPORTING_TOKENS", "Ljava/lang/String;", null, "SignedEncryptedSupportingTokens");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENDORSING_ENCRYPTED_SUPPORTING_TOKENS", "Ljava/lang/String;", null, "EndorsingEncryptedSupportingTokens");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS", "Ljava/lang/String;", null, "SignedEndorsingEncryptedSupportingTokens");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGORITHM_SUITE", "Ljava/lang/String;", null, "AlgorithmSuite");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_SUITE_BASIC256", "Ljava/lang/String;", null, "Basic256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_SUITE_BASIC192", "Ljava/lang/String;", null, "Basic192");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_SUITE_BASIC128", "Ljava/lang/String;", null, "Basic128");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_SUITE_TRIPLE_DES", "Ljava/lang/String;", null, "TripleDes");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_SUITE_BASIC256_RSA15", "Ljava/lang/String;", null, "Basic256Rsa15");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_SUITE_BASIC192_RSA15", "Ljava/lang/String;", null, "Basic192Rsa15");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_SUITE_BASIC128_RSA15", "Ljava/lang/String;", null, "Basic128Rsa15");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_SUITE_TRIPLE_DES_RSA15", "Ljava/lang/String;", null, "TripleDesRsa15");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_SUITE_BASIC256_SHA256", "Ljava/lang/String;", null, "Basic256Sha256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_SUITE_BASIC192_SHA256", "Ljava/lang/String;", null, "Basic192Sha256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_SUITE_BASIC128_SHA256", "Ljava/lang/String;", null, "Basic128Sha256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_SUITE_TRIPLE_DES_SHA256", "Ljava/lang/String;", null, "TripleDesSha256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_SUITE_BASIC256_SHA256_RSA15", "Ljava/lang/String;", null, "Basic256Sha256Rsa15");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_SUITE_BASIC192_SHA256_RSA15", "Ljava/lang/String;", null, "Basic192Sha256Rsa15");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_SUITE_BASIC128_SHA256_RSA15", "Ljava/lang/String;", null, "Basic128Sha256Rsa15");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_SUITE_TRIPLE_DES_SHA256_RSA15", "Ljava/lang/String;", null, "TripleDesSha256Rsa15");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HMAC_SHA1", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#hmac-sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSA_SHA1", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#rsa-sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSA_SHA256", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSA_SHA384", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSA_SHA512", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SHA1", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SHA256", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#sha256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SHA512", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#sha512");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AES128", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#aes128-cbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AES192", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#aes192-cbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AES256", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#aes256-cbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRIPLE_DES", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#tripledes-cbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KW_AES128", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#kw-aes128");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KW_AES192", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#kw-aes192");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KW_AES256", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#kw-aes256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KW_TRIPLE_DES", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#kw-tripledes");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KW_RSA_OAEP", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KW_RSA15", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#rsa-1_5");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_SHA1", "Ljava/lang/String;", null, "http://schemas.xmlsoap.org/ws/2005/02/sc/dk/p_sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_SHA1_L128", "Ljava/lang/String;", null, "http://schemas.xmlsoap.org/ws/2005/02/sc/dk/p_sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_SHA1_L192", "Ljava/lang/String;", null, "http://schemas.xmlsoap.org/ws/2005/02/sc/dk/p_sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_SHA1_L256", "Ljava/lang/String;", null, "http://schemas.xmlsoap.org/ws/2005/02/sc/dk/p_sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XPATH", "Ljava/lang/String;", null, "http://www.w3.org/TR/1999/REC-xpath-19991116");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XPATH20", "Ljava/lang/String;", null, "http://www.w3.org/2002/06/xmldsig-filter2");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "C14N", "Ljava/lang/String;", null, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "C14N11", "Ljava/lang/String;", null, "http://www.w3.org/2006/12/xml-c14n11");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EX_C14N", "Ljava/lang/String;", null, "http://www.w3.org/2001/10/xml-exc-c14n#");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SNT", "Ljava/lang/String;", null, "http://www.w3.org/TR/soap12-n11n");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STRT10", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#STR-Transform");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCLUSIVE_C14N", "Ljava/lang/String;", null, "InclusiveC14N");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_NORMALIZATION_10", "Ljava/lang/String;", null, "SoapNormalization10");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STR_TRANSFORM_10", "Ljava/lang/String;", null, "STRTransform10");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XPATH10", "Ljava/lang/String;", null, "XPath10");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XPATH_FILTER20", "Ljava/lang/String;", null, "XPathFilter20");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ABS_XPATH", "Ljava/lang/String;", null, "http://docs.oasis-open.org/...TBD.../AbsXPath");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTR_INCLUDE_TOKEN", "Ljava/lang/String;", null, "IncludeToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCLUDE_TOKEN_NEVER_SUFFIX", "Ljava/lang/String;", null, "/IncludeToken/Never");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCLUDE_TOKEN_ONCE_SUFFIX", "Ljava/lang/String;", null, "/IncludeToken/Once");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCLUDE_TOKEN_ALWAYS_TO_RECIPIENT_SUFFIX", "Ljava/lang/String;", null, "/IncludeToken/AlwaysToRecipient");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCLUDE_TOKEN_ALWAYS_TO_INITIATOR_SUFFIX", "Ljava/lang/String;", null, "/IncludeToken/AlwaysToInitiator");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCLUDE_TOKEN_ALWAYS_SUFFIX", "Ljava/lang/String;", null, "/IncludeToken/Always");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCLUDE_TOKEN_NEVER", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCLUDE_TOKEN_ONCE", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCLUDE_TOKEN_ALWAYS_TO_RECIPIENT", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCLUDE_TOKEN_ALWAYS_TO_INITIATOR", "I", null, new Integer(4));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCLUDE_TOKEN_ALWAYS", "I", null, new Integer(5));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSPORT_BINDING", "Ljava/lang/String;", null, "TransportBinding");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ASYMMETRIC_BINDING", "Ljava/lang/String;", null, "AsymmetricBinding");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SYMMETRIC_BINDING", "Ljava/lang/String;", null, "SymmetricBinding");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_KEY_IDENTIFIER_REFERENCE", "Ljava/lang/String;", null, "RequireKeyIdentifierReference");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_ISSUER_SERIAL_REFERENCE", "Ljava/lang/String;", null, "RequireIssuerSerialReference");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_EMBEDDED_TOKEN_REFERENCE", "Ljava/lang/String;", null, "RequireEmbeddedTokenReference");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_THUMBPRINT_REFERENCE", "Ljava/lang/String;", null, "RequireThumbprintReference");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_SIGNATURE_CONFIRMATION", "Ljava/lang/String;", null, "RequireSignatureConfirmation");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MUST_SUPPORT_REF_KEY_IDENTIFIER", "Ljava/lang/String;", null, "MustSupportRefKeyIdentifier");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MUST_SUPPORT_REF_ISSUER_SERIAL", "Ljava/lang/String;", null, "MustSupportRefIssuerSerial");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MUST_SUPPORT_REF_EXTERNAL_URI", "Ljava/lang/String;", null, "MustSupportRefExternalURI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MUST_SUPPORT_REF_EMBEDDED_TOKEN", "Ljava/lang/String;", null, "MustSupportRefEmbeddedToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MUST_SUPPORT_REF_THUMBPRINT", "Ljava/lang/String;", null, "MustSupportRefThumbprint");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MUST_SUPPORT_REF_ENCRYPTED_KEY", "Ljava/lang/String;", null, "MustSupportRefEncryptedKey");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSS10", "Ljava/lang/String;", null, "Wss10");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSS11", "Ljava/lang/String;", null, "Wss11");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRUST_10", "Ljava/lang/String;", null, "Trust10");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRUST_13", "Ljava/lang/String;", null, "Trust13");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MUST_SUPPORT_CLIENT_CHALLENGE", "Ljava/lang/String;", null, "MustSupportClientChallenge");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MUST_SUPPORT_SERVER_CHALLENGE", "Ljava/lang/String;", null, "MustSupportServerChallenge");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_CLIENT_ENTROPY", "Ljava/lang/String;", null, "RequireClientEntropy");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_SERVER_ENTROPY", "Ljava/lang/String;", null, "RequireServerEntropy");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MUST_SUPPORT_ISSUED_TOKENS", "Ljava/lang/String;", null, "MustSupportIssuedTokens");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_REQUEST_SECURITY_TOKEN_COLLECTION", "Ljava/lang/String;", null, "RequireRequestSecurityTokenCollection");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_APPLIES_TO", "Ljava/lang/String;", null, "RequireAppliesTo");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCOPE_POLICY_15", "Ljava/lang/String;", null, "ScopePolicy15");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MUST_SUPPORT_INTERACTIVE_CHALLENGE", "Ljava/lang/String;", null, "MustSupportInteractiveChallenge");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ISSUER", "Ljava/lang/String;", null, "Issuer");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ISSUER_NAME", "Ljava/lang/String;", null, "IssuerName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLAIMS", "Ljava/lang/String;", null, "Claims");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_DERIVED_KEYS", "Ljava/lang/String;", null, "RequireDerivedKeys");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_IMPLIED_DERIVED_KEYS", "Ljava/lang/String;", null, "RequireImpliedDerivedKeys");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_EXPLICIT_DERIVED_KEYS", "Ljava/lang/String;", null, "RequireExplicitDerivedKeys");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_EXTERNAL_URI_REFERENCE", "Ljava/lang/String;", null, "RequireExternalUriReference");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_EXTERNAL_REFERENCE", "Ljava/lang/String;", null, "RequireExternalReference");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_INTERNAL_REFERENCE", "Ljava/lang/String;", null, "RequireInternalReference");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUEST_SECURITY_TOKEN_TEMPLATE", "Ljava/lang/String;", null, "RequestSecurityTokenTemplate");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SC10_SECURITY_CONTEXT_TOKEN", "Ljava/lang/String;", null, "SC10SecurityContextToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SC13_SECURITY_CONTEXT_TOKEN", "Ljava/lang/String;", null, "SC13SecurityContextToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BOOTSTRAP_POLICY", "Ljava/lang/String;", null, "BootstrapPolicy");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HEADER", "Ljava/lang/String;", null, "Header");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BODY", "Ljava/lang/String;", null, "Body");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTACHMENTS", "Ljava/lang/String;", null, "Attachments");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONTENT_SIGNATURE_TRANSFORM", "Ljava/lang/String;", null, "ContentSignatureTransform");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTACHMENT_COMPLETE_SIGNATURE_TRANSFORM", "Ljava/lang/String;", null, "AttachmentCompleteSignatureTransform");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAME", "Ljava/lang/String;", null, "Name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMESPACE", "Ljava/lang/String;", null, "Namespace");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_PASSWORD", "Ljava/lang/String;", null, "NoPassword");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HASH_PASSWORD", "Ljava/lang/String;", null, "HashPassword");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CREATED", "Ljava/lang/String;", null, "Created");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NONCE", "Ljava/lang/String;", null, "Nonce");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MUST_NOT_SEND_CANCEL", "Ljava/lang/String;", null, "MustNotSendCancel");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MUST_NOT_SEND_AMEND", "Ljava/lang/String;", null, "MustNotSendAmend");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MUST_NOT_SEND_RENEW", "Ljava/lang/String;", null, "MustNotSendRenew");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATT_OPTIONAL", "Ljava/lang/String;", null, "Optional");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATT_IGNORABLE", "Ljava/lang/String;", null, "Ignorable");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInclusionFromAttributeValue", "(Ljava/lang/String;)Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttributeValueFromInclusion", "(Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getIncludeToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getIssuer", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getIssuerName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClaims", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getX509Token", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequireIssuerSerialReference", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequireEmbeddedTokenReference", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequireThumbprintReference", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getHttpsToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUsernameToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCreated", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNonce", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getIssuedToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequireExternalReference", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequireInternalReference", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequestSecurityTokenTemplate", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getKerberosToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSpnegoContextToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSecurityContextToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequireExternalUriReference", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSc13SecurityContextToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSc10SecurityContextToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSecureConversationToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMustNotSendCancel", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMustNotSendAmend", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMustNotSendRenew", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBootstrapPolicy", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSamlToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRelToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequireKeyIdentifierReference", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getKeyValueToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRsaKeyValue", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSignedParts", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSignedElements", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getXPathExpression", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getXPath2Expression", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEncryptedParts", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEncryptedElements", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getContentEncryptedElements", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequiredElements", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequiredParts", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAlgorithmSuite", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLayout", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBody", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttachments", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getContentSignatureTransform", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttachmentCompleteSignatureTransform", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getHeader", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEncryptSignature", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getProtectTokens", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOnlySignEntireHeadersAndBody", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTransportBinding", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSymmetricBinding", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAsymmetricBinding", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEncryptionToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSignatureToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getProtectionToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTransportToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInitiatorToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInitiatorSignatureToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInitiatorEncryptionToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRecipientToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRecipientSignatureToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRecipientEncryptionToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTrust10", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTrust13", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getScopePolicy15", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMustSupportClientChallenge", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMustSupportServerChallenge", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequireClientEntropy", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequireServerEntropy", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMustSupportIssuedTokens", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequireRequestSecurityTokenCollection", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequireAppliesTo", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMustSupportInteractiveChallenge", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getWss10", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMustSupportRefKeyIdentifier", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMustSupportRefIssuerSerial", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMustSupportRefExternalUri", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMustSupportRefEmbeddedToken", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getWss11", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMustSupportRefThumbprint", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMustSupportRefEncryptedKey", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequireSignatureConfirmation", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("");
methodVisitor.visitLdcInsn("");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/SPConstants", "EMPTY_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
