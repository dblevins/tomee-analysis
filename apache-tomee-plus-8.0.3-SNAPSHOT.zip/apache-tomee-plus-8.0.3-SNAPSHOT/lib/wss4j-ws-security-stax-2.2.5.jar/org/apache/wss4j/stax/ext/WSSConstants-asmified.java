package asm.org.apache.wss4j.stax.ext;
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
public class WSSConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/stax/ext/WSSConstants", null, "org/apache/xml/security/stax/ext/XMLSecurityConstants", null);

classWriter.visitInnerClass("org/apache/wss4j/stax/ext/WSSConstants$UsernameTokenPasswordType", "org/apache/wss4j/stax/ext/WSSConstants", "UsernameTokenPasswordType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference", "org/apache/wss4j/stax/ext/WSSConstants", "DerivedKeyTokenReference", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "org/apache/xml/security/stax/ext/XMLSecurityConstants", "Action", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "org/apache/xml/security/stax/ext/XMLSecurityConstants", "AlgorithmUsage", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSPORT_SECURITY_ACTIVE", "Ljava/lang/String;", null, "transportSecurityActive");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIMESTAMP_PROCESSED", "Ljava/lang/String;", null, "TimestampProcessed");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROP_ALLOW_RSA15_KEYTRANSPORT_ALGORITHM", "Ljava/lang/String;", null, "secureProcessing.AllowRSA15KeyTransportAlgorithm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROP_ALLOW_USERNAMETOKEN_NOPASSWORD", "Ljava/lang/String;", null, "secureProcessing.AllowUsernameTokenNoPassword");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_WSSE10", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_WSSE11", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_WSU10", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_SOAP11", "Ljava/lang/String;", null, "http://schemas.xmlsoap.org/soap/envelope/");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_SOAP12", "Ljava/lang/String;", null, "http://www.w3.org/2003/05/soap-envelope");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_WST", "Ljava/lang/String;", null, "http://schemas.xmlsoap.org/ws/2005/02/trust");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_WST_05_12", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_WSC_SCT", "Ljava/lang/String;", null, "http://schemas.xmlsoap.org/ws/2005/02/sc/sct");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_SAML", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.0:assertion");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_SAML2", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:assertion");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PREFIX_SOAPENV", "Ljava/lang/String;", null, "soap");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_SOAP_ENVELOPE_LN", "Ljava/lang/String;", null, "Envelope");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_SOAP_HEADER_LN", "Ljava/lang/String;", null, "Header");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_SOAP_BODY_LN", "Ljava/lang/String;", null, "Body");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_SOAP11_ENVELOPE", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_SOAP11_HEADER", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_SOAP11_BODY", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATT_SOAP11_ACTOR", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATT_SOAP11_MUST_UNDERSTAND", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_SOAP12_ENVELOPE", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_SOAP12_HEADER", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_SOAP12_BODY", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATT_SOAP12_ROLE", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATT_SOAP12_MUST_UNDERSTAND", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PREFIX_WSSE", "Ljava/lang/String;", null, "wsse");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PREFIX_WSSE11", "Ljava/lang/String;", null, "wsse11");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSSE_SECURITY", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSSE_SECURITY_TOKEN_REFERENCE", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSSE_REFERENCE", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATT_WSSE_USAGE", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATT_WSSE11_TOKEN_TYPE", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSSE_KEY_IDENTIFIER", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATT_NULL_ENCODING_TYPE", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATT_NULL_VALUE_TYPE", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSSE_BINARY_SECURITY_TOKEN", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PREFIX_WSU", "Ljava/lang/String;", null, "wsu");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATT_WSU_ID", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSSE11_ENCRYPTED_HEADER", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSSE_TRANSFORMATION_PARAMETERS", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSU_TIMESTAMP", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSU_CREATED", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSU_EXPIRES", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS10_SOAPMESSAGE_SECURITY", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS11_SOAPMESSAGE_SECURITY", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_X509TOKEN_PROFILE", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_X509_V3_TYPE", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509v3");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_X509_PKIPATH_V1", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509PKIPathv1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_X509_SKI", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509SubjectKeyIdentifier");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_THUMBPRINT", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#ThumbprintSHA1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_ENCRYPTED_KEY_SHA1", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKeySHA1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAPMESSAGE_NS10_BASE64_ENCODING", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSSE_USERNAME_TOKEN", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSSE_USERNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSSE_PASSWORD", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSSE_NONCE", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSSE11_SALT", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSSE11_ITERATION", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_USERNAMETOKEN_PROFILE11", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_PASSWORD_DIGEST", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_PASSWORD_TEXT", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_USERNAMETOKEN_PROFILE_USERNAME_TOKEN", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#UsernameToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSSE11_SIG_CONF", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATT_NULL_VALUE", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_C14N_EXCL", "Ljava/lang/String;", null, "http://www.w3.org/2001/10/xml-exc-c14n#");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PREFIX_C14N_EXCL", "Ljava/lang/String;", null, "c14nEx");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WST_BINARY_SECRET", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WST0512_BINARY_SECRET", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAPMESSAGE_NS10_STR_TRANSFORM", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#STR-Transform");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SWA_ATTACHMENT_CONTENT_SIG_TRANS", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-SwAProfile-1.1#Attachment-Content-Signature-Transform");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SWA_ATTACHMENT_COMPLETE_SIG_TRANS", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-SwAProfile-1.1#Attachment-Complete-Signature-Transform");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SWA_ATTACHMENT_CIPHERTEXT_TRANS", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-SwAProfile-1.1#Attachment-Ciphertext-Transform");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SWA_ATTACHMENT_ENCRYPTED_DATA_TYPE_CONTENT_ONLY", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-SwAProfile-1.1#Attachment-Content-Only");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SWA_ATTACHMENT_ENCRYPTED_DATA_TYPE_COMPLETE", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-SwAProfile-1.1#Attachment-Complete");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_SAML_ASSERTION", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_SAML2_ASSERTION", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_SAML2_ENCRYPTED_ASSERTION", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_SAML10_TOKEN_PROFILE", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.0");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_SAML11_TOKEN_PROFILE", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_SAML10_TYPE", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.0#SAMLAssertionID");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_SAML20_TYPE", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLID");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_SAML11_TOKEN_PROFILE_TYPE", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLV1.1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_SAML20_TOKEN_PROFILE_TYPE", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLV2.0");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_KERBEROS11_TOKEN_PROFILE", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_GSS_KERBEROS5_AP_REQ", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_GSS_KERBEROS5_AP_REQ1510", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ1510");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_GSS_KERBEROS5_AP_REQ4120", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ4120");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_KERBEROS5_AP_REQ", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#Kerberosv5_AP_REQ");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_KERBEROS5_AP_REQ_SHA1", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#Kerberosv5APREQSHA1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_KERBEROS5_AP_REQ1510", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#Kerberosv5_AP_REQ1510");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_KERBEROS5_AP_REQ4120", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#Kerberosv5_AP_REQ4120");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATT_NULL_ASSERTION_ID", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATT_NULL_ID", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_WSC_05_02", "Ljava/lang/String;", null, "http://schemas.xmlsoap.org/ws/2005/02/sc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_WSC_05_12", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PREFIX_WSC", "Ljava/lang/String;", null, "wsc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0502_SCT", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0512_SCT", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0502_IDENTIFIER", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0512_IDENTIFIER", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0502_DKT", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0512_DKT", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0502_PROPERTIES", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0512_PROPERTIES", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0502_LENGTH", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0512_LENGTH", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0502_GENERATION", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0512_GENERATION", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0502_OFFSET", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0512_OFFSET", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0502_LABEL", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0512_LABEL", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0502_NONCE", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_WSC0512_NONCE", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_SHA_1", "Ljava/lang/String;", null, "http://schemas.xmlsoap.org/ws/2005/02/sc/dk/p_sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_SHA_1_2005_12", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512/dk/p_sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WS_SEC_CONV_DEFAULT_LABEL", "Ljava/lang/String;", null, "WS-SecureConversation");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_WSS_ENC_KEY_VALUE_TYPE", "Ljava/lang/String;", null, "http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKey");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROP_USE_THIS_TOKEN_ID_FOR_KERBEROS", "Ljava/lang/String;", null, "PROP_USE_THIS_TOKEN_ID_FOR_KERBEROS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROP_USE_THIS_TOKEN_ID_FOR_DERIVED_KEY", "Ljava/lang/String;", null, "PROP_USE_THIS_TOKEN_ID_FOR_DERIVED_KEY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROP_USE_THIS_TOKEN_ID_FOR_SECURITYCONTEXTTOKEN", "Ljava/lang/String;", null, "PROP_USE_THIS_TOKEN_ID_FOR_SECURITYCONTEXTTOKEN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROP_USE_THIS_TOKEN_ID_FOR_CUSTOM_TOKEN", "Ljava/lang/String;", null, "PROP_USE_THIS_TOKEN_ID_FOR_CUSTOM_TOKEN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROP_TIMESTAMP_SECURITYEVENT", "Ljava/lang/String;", null, "PROP_TIMESTAMP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROP_ENCRYPTED_DATA_REFS", "Ljava/lang/String;", null, "PROP_ENCRYPTED_DATA_REFS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIMESTAMP", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USERNAMETOKEN", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USERNAMETOKEN_SIGNED", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_CONFIRMATION", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_WITH_DERIVED_KEY", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCRYPT_WITH_DERIVED_KEY", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML_TOKEN_SIGNED", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML_TOKEN_UNSIGNED", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_WITH_KERBEROS_TOKEN", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCRYPT_WITH_KERBEROS_TOKEN", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KERBEROS_TOKEN", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CUSTOM_TOKEN", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMP_KEY", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENC_KD", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIG_KD", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_NORM", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STR_TRANS", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XPATH", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_11_BODY_PATH", "Ljava/util/List;", "Ljava/util/List<Ljavax/xml/namespace/QName;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_11_HEADER_PATH", "Ljava/util/List;", "Ljava/util/List<Ljavax/xml/namespace/QName;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSSE_SECURITY_HEADER_PATH", "Ljava/util/List;", "Ljava/util/List<Ljavax/xml/namespace/QName;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/soap/envelope/");
methodVisitor.visitLdcInsn("Envelope");
methodVisitor.visitLdcInsn("soap");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_SOAP11_ENVELOPE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/soap/envelope/");
methodVisitor.visitLdcInsn("Header");
methodVisitor.visitLdcInsn("soap");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_SOAP11_HEADER", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/soap/envelope/");
methodVisitor.visitLdcInsn("Body");
methodVisitor.visitLdcInsn("soap");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_SOAP11_BODY", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/soap/envelope/");
methodVisitor.visitLdcInsn("actor");
methodVisitor.visitLdcInsn("soap");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ATT_SOAP11_ACTOR", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/soap/envelope/");
methodVisitor.visitLdcInsn("mustUnderstand");
methodVisitor.visitLdcInsn("soap");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ATT_SOAP11_MUST_UNDERSTAND", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2003/05/soap-envelope");
methodVisitor.visitLdcInsn("Envelope");
methodVisitor.visitLdcInsn("soap");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_SOAP12_ENVELOPE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2003/05/soap-envelope");
methodVisitor.visitLdcInsn("Header");
methodVisitor.visitLdcInsn("soap");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_SOAP12_HEADER", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2003/05/soap-envelope");
methodVisitor.visitLdcInsn("Body");
methodVisitor.visitLdcInsn("soap");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_SOAP12_BODY", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2003/05/soap-envelope");
methodVisitor.visitLdcInsn("role");
methodVisitor.visitLdcInsn("soap");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ATT_SOAP12_ROLE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2003/05/soap-envelope");
methodVisitor.visitLdcInsn("mustUnderstand");
methodVisitor.visitLdcInsn("soap");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ATT_SOAP12_MUST_UNDERSTAND", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
methodVisitor.visitLdcInsn("Security");
methodVisitor.visitLdcInsn("wsse");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE_SECURITY", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
methodVisitor.visitLdcInsn("SecurityTokenReference");
methodVisitor.visitLdcInsn("wsse");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE_SECURITY_TOKEN_REFERENCE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
methodVisitor.visitLdcInsn("Reference");
methodVisitor.visitLdcInsn("wsse");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE_REFERENCE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
methodVisitor.visitLdcInsn("Usage");
methodVisitor.visitLdcInsn("wsse");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ATT_WSSE_USAGE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xsd");
methodVisitor.visitLdcInsn("TokenType");
methodVisitor.visitLdcInsn("wsse11");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ATT_WSSE11_TOKEN_TYPE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
methodVisitor.visitLdcInsn("KeyIdentifier");
methodVisitor.visitLdcInsn("wsse");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE_KEY_IDENTIFIER", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn("EncodingType");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ATT_NULL_ENCODING_TYPE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn("ValueType");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ATT_NULL_VALUE_TYPE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
methodVisitor.visitLdcInsn("BinarySecurityToken");
methodVisitor.visitLdcInsn("wsse");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE_BINARY_SECURITY_TOKEN", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
methodVisitor.visitLdcInsn("Id");
methodVisitor.visitLdcInsn("wsu");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ATT_WSU_ID", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xsd");
methodVisitor.visitLdcInsn("EncryptedHeader");
methodVisitor.visitLdcInsn("wsse11");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE11_ENCRYPTED_HEADER", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
methodVisitor.visitLdcInsn("TransformationParameters");
methodVisitor.visitLdcInsn("wsse");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE_TRANSFORMATION_PARAMETERS", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
methodVisitor.visitLdcInsn("Timestamp");
methodVisitor.visitLdcInsn("wsu");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSU_TIMESTAMP", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
methodVisitor.visitLdcInsn("Created");
methodVisitor.visitLdcInsn("wsu");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSU_CREATED", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
methodVisitor.visitLdcInsn("Expires");
methodVisitor.visitLdcInsn("wsu");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSU_EXPIRES", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
methodVisitor.visitLdcInsn("UsernameToken");
methodVisitor.visitLdcInsn("wsse");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE_USERNAME_TOKEN", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
methodVisitor.visitLdcInsn("Username");
methodVisitor.visitLdcInsn("wsse");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE_USERNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
methodVisitor.visitLdcInsn("Password");
methodVisitor.visitLdcInsn("wsse");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE_PASSWORD", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
methodVisitor.visitLdcInsn("Nonce");
methodVisitor.visitLdcInsn("wsse");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE_NONCE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xsd");
methodVisitor.visitLdcInsn("Salt");
methodVisitor.visitLdcInsn("wsse11");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE11_SALT", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xsd");
methodVisitor.visitLdcInsn("Iteration");
methodVisitor.visitLdcInsn("wsse11");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE11_ITERATION", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xsd");
methodVisitor.visitLdcInsn("SignatureConfirmation");
methodVisitor.visitLdcInsn("wsse11");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE11_SIG_CONF", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn("Value");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ATT_NULL_VALUE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/trust");
methodVisitor.visitLdcInsn("BinarySecret");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WST_BINARY_SECRET", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200512");
methodVisitor.visitLdcInsn("BinarySecret");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WST0512_BINARY_SECRET", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("urn:oasis:names:tc:SAML:1.0:assertion");
methodVisitor.visitLdcInsn("Assertion");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_SAML_ASSERTION", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("urn:oasis:names:tc:SAML:2.0:assertion");
methodVisitor.visitLdcInsn("Assertion");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_SAML2_ASSERTION", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("urn:oasis:names:tc:SAML:2.0:assertion");
methodVisitor.visitLdcInsn("EncryptedAssertion");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_SAML2_ENCRYPTED_ASSERTION", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn("AssertionID");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ATT_NULL_ASSERTION_ID", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn("ID");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ATT_NULL_ID", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc");
methodVisitor.visitLdcInsn("SecurityContextToken");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0502_SCT", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512");
methodVisitor.visitLdcInsn("SecurityContextToken");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0512_SCT", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc");
methodVisitor.visitLdcInsn("Identifier");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0502_IDENTIFIER", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512");
methodVisitor.visitLdcInsn("Identifier");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0512_IDENTIFIER", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc");
methodVisitor.visitLdcInsn("DerivedKeyToken");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0502_DKT", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512");
methodVisitor.visitLdcInsn("DerivedKeyToken");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0512_DKT", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc");
methodVisitor.visitLdcInsn("Properties");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0502_PROPERTIES", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512");
methodVisitor.visitLdcInsn("Properties");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0512_PROPERTIES", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc");
methodVisitor.visitLdcInsn("Length");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0502_LENGTH", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512");
methodVisitor.visitLdcInsn("Length");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0512_LENGTH", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc");
methodVisitor.visitLdcInsn("Generation");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0502_GENERATION", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512");
methodVisitor.visitLdcInsn("Generation");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0512_GENERATION", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc");
methodVisitor.visitLdcInsn("Offset");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0502_OFFSET", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512");
methodVisitor.visitLdcInsn("Offset");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0512_OFFSET", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc");
methodVisitor.visitLdcInsn("Label");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0502_LABEL", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512");
methodVisitor.visitLdcInsn("Label");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0512_LABEL", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc");
methodVisitor.visitLdcInsn("Nonce");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0502_NONCE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512");
methodVisitor.visitLdcInsn("Nonce");
methodVisitor.visitLdcInsn("wsc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0512_NONCE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Timestamp");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TIMESTAMP", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UsernameToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "USERNAMETOKEN", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UsernameTokenSignature");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "USERNAMETOKEN_SIGNED", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SignatureConfirmation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SIGNATURE_CONFIRMATION", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SignatureWithDerivedKey");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SIGNATURE_WITH_DERIVED_KEY", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EncryptWithDerivedKey");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ENCRYPT_WITH_DERIVED_KEY", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SAMLTokenSigned");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SAML_TOKEN_SIGNED", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SAMLTokenUnsigned");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SAML_TOKEN_UNSIGNED", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SignatureWithKerberosToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SIGNATURE_WITH_KERBEROS_TOKEN", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EncryptWithKerberosToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ENCRYPT_WITH_KERBEROS_TOKEN", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KerberosToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "KERBEROS_TOKEN", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CustomToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "CUSTOM_TOKEN", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Comp_Key");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "COMP_KEY", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENC_KD");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ENC_KD", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SIG_KD");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SIG_KD", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Soap_Norm");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SOAP_NORM", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STR_Trans");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "STR_TRANS", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XPath");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "XPATH", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;");
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SOAP_11_BODY_PATH", "Ljava/util/List;");
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SOAP_11_HEADER_PATH", "Ljava/util/List;");
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "WSSE_SECURITY_HEADER_PATH", "Ljava/util/List;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SOAP_11_BODY_PATH", "Ljava/util/List;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_SOAP11_ENVELOPE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SOAP_11_BODY_PATH", "Ljava/util/List;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_SOAP11_BODY", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SOAP_11_HEADER_PATH", "Ljava/util/List;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_SOAP11_ENVELOPE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SOAP_11_HEADER_PATH", "Ljava/util/List;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_SOAP11_HEADER", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "WSSE_SECURITY_HEADER_PATH", "Ljava/util/List;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SOAP_11_HEADER_PATH", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "WSSE_SECURITY_HEADER_PATH", "Ljava/util/List;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE_SECURITY", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
