package asm.org.opensaml.xmlsec.signature.support;
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
public class SignatureConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/opensaml/xmlsec/signature/support/SignatureConstants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLSIG_NS", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLSIG11_NS", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmldsig11#");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLSIG_PREFIX", "Ljava/lang/String;", null, "ds");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLSIG11_PREFIX", "Ljava/lang/String;", null, "ds11");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MORE_ALGO_NS", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_SIGNATURE_DSA", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#dsa-sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_SIGNATURE_DSA_SHA1", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#dsa-sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_SIGNATURE_RSA", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#rsa-sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_SIGNATURE_RSA_SHA1", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#rsa-sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_MAC_HMAC_SHA1", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#hmac-sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_DIGEST_SHA1", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_ENCODING_BASE64", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#base64");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_DSA_KEYVALUE", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#DSAKeyValue");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_RSA_KEYVALUE", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#RSAKeyValue");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_X509DATA", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#X509Data");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_PGPDATA", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#PGPData");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_SPKIDATA", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#SPKIData");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_MGMTDATA", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#MgmtData");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_RAW_X509CERT", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#rawX509Certificate");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_KEYVALUE", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#KeyValue");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_RETRIEVAL_METHOD", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#RetrievalMethod");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_KEYNAME", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#KeyName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_RAW_X509CRL", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#rawX509CRL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_RAW_PGP_KEYPACKET", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#rawPGPKeyPacket");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_RAW_SPKI_SEXP", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#rawSPKISexp");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_PKCS7_SIGNED_DATA", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#PKCS7signedData");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_RAW_PKCS7_SIGNED_DATA", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#rawPKCS7signedData");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_ECKEYVALUE", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmldsig11#ECKeyValue");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_DERENCODEDKEYVALUE", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmldsig11#DEREncodedKeyValue");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_C14N_OMIT_COMMENTS", "Ljava/lang/String;", null, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_C14N_WITH_COMMENTS", "Ljava/lang/String;", null, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_C14N11_OMIT_COMMENTS", "Ljava/lang/String;", null, "http://www.w3.org/2006/12/xml-c14n11");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_C14N11_WITH_COMMENTS", "Ljava/lang/String;", null, "http://www.w3.org/2006/12/xml-c14n11#WithComments");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_C14N_EXCL_OMIT_COMMENTS", "Ljava/lang/String;", null, "http://www.w3.org/2001/10/xml-exc-c14n#");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_C14N_EXCL_WITH_COMMENTS", "Ljava/lang/String;", null, "http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSFORM_ENVELOPED_SIGNATURE", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSFORM_C14N_OMIT_COMMENTS", "Ljava/lang/String;", null, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSFORM_C14N_WITH_COMMENTS", "Ljava/lang/String;", null, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSFORM_C14N11_OMIT_COMMENTS", "Ljava/lang/String;", null, "http://www.w3.org/2006/12/xml-c14n11");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSFORM_C14N11_WITH_COMMENTS", "Ljava/lang/String;", null, "http://www.w3.org/2006/12/xml-c14n11#WithComments");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSFORM_C14N_EXCL_OMIT_COMMENTS", "Ljava/lang/String;", null, "http://www.w3.org/2001/10/xml-exc-c14n#");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSFORM_C14N_EXCL_WITH_COMMENTS", "Ljava/lang/String;", null, "http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSFORM_XSLT", "Ljava/lang/String;", null, "http://www.w3.org/TR/1999/REC-xslt-19991116");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSFORM_XPATH", "Ljava/lang/String;", null, "http://www.w3.org/TR/1999/REC-xpath-19991116");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSFORM_BASE64_DECODE", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#base64");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_SIGNATURE_NOT_RECOMMENDED_RSA_MD5", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#rsa-md5");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_SIGNATURE_RSA_RIPEMD160", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#rsa-ripemd160");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_SIGNATURE_RSA_SHA256", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_SIGNATURE_RSA_SHA224", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha224");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_SIGNATURE_RSA_SHA384", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_SIGNATURE_RSA_SHA512", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_MAC_HMAC_NOT_RECOMMENDED_MD5", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#hmac-md5");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_MAC_HMAC_RIPEMD160", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_MAC_HMAC_SHA224", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#hmac-sha224");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_MAC_HMAC_SHA256", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#hmac-sha256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_MAC_HMAC_SHA384", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#hmac-sha384");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_MAC_HMAC_SHA512", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#hmac-sha512");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_SIGNATURE_ECDSA_SHA1", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_SIGNATURE_ECDSA_SHA224", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha224");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_SIGNATURE_ECDSA_SHA256", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_SIGNATURE_ECDSA_SHA384", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha384");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_SIGNATURE_ECDSA_SHA512", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha512");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_DIGEST_NOT_RECOMMENDED_MD5", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#md5");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_DIGEST_SHA224", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#sha224");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_DIGEST_SHA384", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#sha384");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_SIGNATURE_DSA_SHA256", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmldsig11#dsa-sha256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_DIGEST_SHA256", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#sha256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_DIGEST_SHA512", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#sha512");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_DIGEST_RIPEMD160", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#ripemd160");
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
