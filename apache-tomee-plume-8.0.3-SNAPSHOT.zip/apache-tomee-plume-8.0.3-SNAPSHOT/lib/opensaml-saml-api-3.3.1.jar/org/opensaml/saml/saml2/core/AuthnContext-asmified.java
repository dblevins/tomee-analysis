package asm.org.opensaml.saml.saml2.core;
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
public class AuthnContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/opensaml/saml/saml2/core/AuthnContext", null, "java/lang/Object", new String[] { "org/opensaml/saml/common/SAMLObject" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_ELEMENT_LOCAL_NAME", "Ljava/lang/String;", null, "AuthnContext");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_LOCAL_NAME", "Ljava/lang/String;", null, "AuthnContextType");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_NAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IP_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:InternetProtocol");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IP_PASSWORD_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:InternetProtocolPassword");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KERBEROS_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:Kerberos");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MOFU_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:MobileOneFactorUnregistered");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MTFU_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:MobileTwoFactorUnregistered");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MOFC_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:MobileOneFactorContract");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MTFC_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:MobileTwoFactorContract");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PASSWORD_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:Password");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PPT_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:PasswordProtectedTransport");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PREVIOUS_SESSION_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:PreviousSession");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X509_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:X509");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PGP_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:PGP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SPKI_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:SPKI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_DSIG_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:XMLDSig");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SMARTCARD_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:Smartcard");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SMARTCARD_PKI_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:SmartcardPKI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOFTWARE_PKI_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:SoftwarePKI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TELEPHONY_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:Telephony");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NOMAD_TELEPHONY_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:NomadTelephony");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PERSONAL_TELEPHONY_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:PersonalTelephony");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTHENTICATED_TELEPHONY_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:AuthenticatedTelephony");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SRP_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:SecureRemotePassword");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLS_CLIENT_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:TLSClient");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIME_SYNC_TOKEN_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:TimeSyncToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNSPECIFIED_AUTHN_CTX", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:ac:classes:unspecified");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAuthnContextClassRef", "()Lorg/opensaml/saml/saml2/core/AuthnContextClassRef;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAuthnContextClassRef", "(Lorg/opensaml/saml/saml2/core/AuthnContextClassRef;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAuthContextDecl", "()Lorg/opensaml/saml/saml2/core/AuthnContextDecl;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAuthnContextDecl", "(Lorg/opensaml/saml/saml2/core/AuthnContextDecl;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAuthnContextDeclRef", "()Lorg/opensaml/saml/saml2/core/AuthnContextDeclRef;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAuthnContextDeclRef", "(Lorg/opensaml/saml/saml2/core/AuthnContextDeclRef;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAuthenticatingAuthorities", "()Ljava/util/List;", "()Ljava/util/List<Lorg/opensaml/saml/saml2/core/AuthenticatingAuthority;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("urn:oasis:names:tc:SAML:2.0:assertion");
methodVisitor.visitLdcInsn("AuthnContext");
methodVisitor.visitLdcInsn("saml2");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/saml2/core/AuthnContext", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("urn:oasis:names:tc:SAML:2.0:assertion");
methodVisitor.visitLdcInsn("AuthnContextType");
methodVisitor.visitLdcInsn("saml2");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/saml2/core/AuthnContext", "TYPE_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
