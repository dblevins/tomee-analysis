package asm.org.apache.wss4j.common.saml.builder;
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
public class SAML2ConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/wss4j/common/saml/builder/SAML2Constants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMEID_FORMAT_UNSPECIFIED", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMEID_FORMAT_EMAIL_ADDRESS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMEID_FORMAT_X509_SUBJECT_NAME", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMEID_FORMAT_WINDOWS_DQN", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMEID_FORMAT_KERBEROS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMEID_FORMAT_ENTITY", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:nameid-format:entity");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMEID_FORMAT_PERSISTENT", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:nameid-format:persistent");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMEID_FORMAT_TRANSIENT", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:nameid-format:transient");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONF_BEARER", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:cm:bearer");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONF_HOLDER_KEY", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:cm:holder-of-key");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONF_SENDER_VOUCHES", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:cm:sender-vouches");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_INTERNET_PROTOCOL", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:InternetProtocol");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_INTERNET_PROTOCOL_PASSWORD", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:InternetProtocolPassword");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_KERBEROS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:Kerberos");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_MOBILE_ONE_FACTOR_UNREGISTERED", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:MobileOneFactorUnregistered");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_MOBILE_TWO_FACTOR_UNREGISTERED", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:MobileTwoFactorUnregistered");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_MOBILE_ONE_FACTOR_CONTRACT", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:MobileOneFactorContract");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_MOBILE_TWO_FACTOR_CONTRACT", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:MobileTwoFactorContract");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_PASSWORD", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:Password");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_PASSWORD_PROTECTED_TRANSPORT", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:PasswordProtectedTransport");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_PREVIOUS_SESSION", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:PreviousSession");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_X509", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:X509");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_PGP", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:PGP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_SPKI", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:SPKI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_XMLDSIG", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:XMLDSig");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_SMARTCARD", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:Smartcard");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_SMARTCARD_PKI", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:SmartcardPKI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_SOFTWARE_PKI", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:SoftwarePKI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_TELEPHONY", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:Telephony");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_NOMAD_TELEPHONY", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:NomadTelephony");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_PERSONAL_TELEPHONY", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:PersonalTelephony");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_AUTHENTICATED_TELEPHONY", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:AuthenticatedTelephony");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_SECURED_REMOTE_PASSWORD", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:SecureRemotePassword");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_TLS_CLIENT", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:TLSClient");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_TIME_SYNC_TOKEN", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:TimeSyncToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_CONTEXT_CLASS_REF_UNSPECIFIED", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:unspecified");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTRNAME_FORMAT_UNSPECIFIED", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:attrname-format:unspecified");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTRNAME_FORMAT_URI", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:attrname-format:uri");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTRNAME_FORMAT_BASIC", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:attrname-format:basic");
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
