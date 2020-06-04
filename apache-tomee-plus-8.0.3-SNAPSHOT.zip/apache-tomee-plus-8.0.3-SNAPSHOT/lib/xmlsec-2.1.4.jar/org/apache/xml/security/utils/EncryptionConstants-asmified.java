package asm.org.apache.xml.security.utils;
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
public class EncryptionConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/xml/security/utils/EncryptionConstants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_ATT_ALGORITHM", "Ljava/lang/String;", null, "Algorithm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_ATT_ID", "Ljava/lang/String;", null, "Id");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_ATT_TARGET", "Ljava/lang/String;", null, "Target");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_ATT_TYPE", "Ljava/lang/String;", null, "Type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_ATT_URI", "Ljava/lang/String;", null, "URI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_ATT_ENCODING", "Ljava/lang/String;", null, "Encoding");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_ATT_RECIPIENT", "Ljava/lang/String;", null, "Recipient");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_ATT_MIMETYPE", "Ljava/lang/String;", null, "MimeType");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_CARRIEDKEYNAME", "Ljava/lang/String;", null, "CarriedKeyName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_CIPHERDATA", "Ljava/lang/String;", null, "CipherData");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_CIPHERREFERENCE", "Ljava/lang/String;", null, "CipherReference");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_CIPHERVALUE", "Ljava/lang/String;", null, "CipherValue");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_DATAREFERENCE", "Ljava/lang/String;", null, "DataReference");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_ENCRYPTEDDATA", "Ljava/lang/String;", null, "EncryptedData");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_ENCRYPTEDKEY", "Ljava/lang/String;", null, "EncryptedKey");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_ENCRYPTIONMETHOD", "Ljava/lang/String;", null, "EncryptionMethod");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_ENCRYPTIONPROPERTIES", "Ljava/lang/String;", null, "EncryptionProperties");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_ENCRYPTIONPROPERTY", "Ljava/lang/String;", null, "EncryptionProperty");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_KEYREFERENCE", "Ljava/lang/String;", null, "KeyReference");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_KEYSIZE", "Ljava/lang/String;", null, "KeySize");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_OAEPPARAMS", "Ljava/lang/String;", null, "OAEPparams");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_MGF", "Ljava/lang/String;", null, "MGF");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_REFERENCELIST", "Ljava/lang/String;", null, "ReferenceList");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_TRANSFORMS", "Ljava/lang/String;", null, "Transforms");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_AGREEMENTMETHOD", "Ljava/lang/String;", null, "AgreementMethod");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_KA_NONCE", "Ljava/lang/String;", null, "KA-Nonce");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_ORIGINATORKEYINFO", "Ljava/lang/String;", null, "OriginatorKeyInfo");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_TAG_RECIPIENTKEYINFO", "Ljava/lang/String;", null, "RecipientKeyInfo");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCRYPTIONSPECIFICATION_URL", "Ljava/lang/String;", null, "http://www.w3.org/TR/2001/WD-xmlenc-core-20010626/");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EncryptionSpecNS", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EncryptionSpec11NS", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_CONTENT", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#Content");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_ELEMENT", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#Element");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_MEDIATYPE", "Ljava/lang/String;", null, "http://www.isi.edu/in-notes/iana/assignments/media-types/");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_BLOCKCIPHER_TRIPLEDES", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#tripledes-cbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_BLOCKCIPHER_AES128", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#aes128-cbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_BLOCKCIPHER_AES256", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#aes256-cbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_BLOCKCIPHER_AES192", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#aes192-cbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_BLOCKCIPHER_AES128_GCM", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#aes128-gcm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_BLOCKCIPHER_AES192_GCM", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#aes192-gcm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_BLOCKCIPHER_AES256_GCM", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#aes256-gcm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_BLOCKCIPHER_SEED128", "Ljava/lang/String;", null, "http://www.w3.org/2007/05/xmldsig-more#seed128-cbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_BLOCKCIPHER_CAMELLIA128", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#camellia128-cbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_BLOCKCIPHER_CAMELLIA192", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#camellia192-cbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_BLOCKCIPHER_CAMELLIA256", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#camellia256-cbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_KEYTRANSPORT_RSA15", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#rsa-1_5");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_KEYTRANSPORT_RSAOAEP", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_KEYTRANSPORT_RSAOAEP_11", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#rsa-oaep");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_KEYAGREEMENT_DH", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#dh");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_KEYWRAP_TRIPLEDES", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#kw-tripledes");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_KEYWRAP_AES128", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#kw-aes128");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_KEYWRAP_AES256", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#kw-aes256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_KEYWRAP_AES192", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#kw-aes192");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_KEYWRAP_CAMELLIA128", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#kw-camellia128");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_KEYWRAP_CAMELLIA192", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#kw-camellia192");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_KEYWRAP_CAMELLIA256", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmldsig-more#kw-camellia256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_KEYWRAP_SEED128", "Ljava/lang/String;", null, "http://www.w3.org/2007/05/xmldsig-more#kw-seed128");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_AUTHENTICATION_XMLSIGNATURE", "Ljava/lang/String;", null, "http://www.w3.org/TR/2001/CR-xmldsig-core-20010419/");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_C14N_WITHCOMMENTS", "Ljava/lang/String;", null, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_C14N_OMITCOMMENTS", "Ljava/lang/String;", null, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_ENCODING_BASE64", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#base64");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MGF1_SHA1", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#mgf1sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MGF1_SHA224", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#mgf1sha224");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MGF1_SHA256", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#mgf1sha256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MGF1_SHA384", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#mgf1sha384");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MGF1_SHA512", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#mgf1sha512");
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
