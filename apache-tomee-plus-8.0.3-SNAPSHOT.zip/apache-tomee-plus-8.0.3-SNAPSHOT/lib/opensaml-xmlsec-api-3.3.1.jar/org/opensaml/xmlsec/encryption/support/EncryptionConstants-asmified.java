package asm.org.opensaml.xmlsec.encryption.support;
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

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/opensaml/xmlsec/encryption/support/EncryptionConstants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLENC_NS", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLENC_PREFIX", "Ljava/lang/String;", null, "xenc");
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
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_ENCRYPTION_PROPERTIES", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#EncryptionProperties");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_ENCRYPTED_KEY", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#EncryptedKey");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_KEYINFO_DH_KEYVALUE", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#DHKeyValue");
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
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_KEYTRANSPORT_RSA15", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#rsa-1_5");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_KEYTRANSPORT_RSAOAEP", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");
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
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLENC11_NS", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLENC11_PREFIX", "Ljava/lang/String;", null, "xenc11");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_KEYTRANSPORT_RSAOAEP11", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#rsa-oaep");
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
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_MGF1_SHA1", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#mgf1sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_MGF1_SHA224", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#mgf1sha224");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_MGF1_SHA256", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#mgf1sha256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_MGF1_SHA384", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#mgf1sha384");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALGO_ID_MGF1_SHA512", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#mgf1sha512");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_DERIVED_KEY", "Ljava/lang/String;", null, "http://www.w3.org/2009/xmlenc11#DerivedKey");
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
