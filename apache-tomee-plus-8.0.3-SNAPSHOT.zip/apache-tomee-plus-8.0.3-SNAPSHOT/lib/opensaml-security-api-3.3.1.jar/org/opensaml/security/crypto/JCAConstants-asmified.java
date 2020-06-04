package asm.org.opensaml.security.crypto;
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
public class JCAConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/opensaml/security/crypto/JCAConstants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_ALGO_RSA", "Ljava/lang/String;", null, "RSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_ALGO_DSA", "Ljava/lang/String;", null, "DSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_ALGO_EC", "Ljava/lang/String;", null, "EC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_ALGO_AES", "Ljava/lang/String;", null, "AES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_ALGO_DES", "Ljava/lang/String;", null, "DES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_ALGO_DESEDE", "Ljava/lang/String;", null, "DESede");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_FORMAT_RAW", "Ljava/lang/String;", null, "RAW");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CIPHER_MODE_ECB", "Ljava/lang/String;", null, "ECB");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CIPHER_MODE_CBC", "Ljava/lang/String;", null, "CBC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CIPHER_MODE_GCM", "Ljava/lang/String;", null, "GCM");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CIPHER_PADDING_NONE", "Ljava/lang/String;", null, "NoPadding");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CIPHER_PADDING_ISO10126", "Ljava/lang/String;", null, "ISO10126Padding");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CIPHER_PADDING_PKCS1", "Ljava/lang/String;", null, "PKCS1Padding");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CIPHER_PADDING_OAEP", "Ljava/lang/String;", null, "OAEPPadding");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEYWRAP_ALGO_DESEDE", "Ljava/lang/String;", null, "DESedeWrap");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEYWRAP_ALGO_AES", "Ljava/lang/String;", null, "AESWrap");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DIGEST_MD5", "Ljava/lang/String;", null, "MD5");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DIGEST_RIPEMD160", "Ljava/lang/String;", null, "RIPEMD160");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DIGEST_SHA1", "Ljava/lang/String;", null, "SHA-1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DIGEST_SHA224", "Ljava/lang/String;", null, "SHA-224");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DIGEST_SHA256", "Ljava/lang/String;", null, "SHA-256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DIGEST_SHA384", "Ljava/lang/String;", null, "SHA-384");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DIGEST_SHA512", "Ljava/lang/String;", null, "SHA-512");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_DSA_SHA1", "Ljava/lang/String;", null, "SHA1withDSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_DSA_SHA224", "Ljava/lang/String;", null, "SHA224withDSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_DSA_SHA256", "Ljava/lang/String;", null, "SHA256withDSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_RSA_MD5", "Ljava/lang/String;", null, "MD5withRSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_RSA_RIPEMD160", "Ljava/lang/String;", null, "RIPEMD160withRSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_RSA_SHA1", "Ljava/lang/String;", null, "SHA1withRSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_RSA_SHA224", "Ljava/lang/String;", null, "SHA224withRSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_RSA_SHA256", "Ljava/lang/String;", null, "SHA256withRSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_RSA_SHA384", "Ljava/lang/String;", null, "SHA384withRSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_RSA_SHA512", "Ljava/lang/String;", null, "SHA512withRSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_ECDSA_SHA1", "Ljava/lang/String;", null, "SHA1withECDSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_ECDSA_SHA224", "Ljava/lang/String;", null, "SHA224withECDSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_ECDSA_SHA256", "Ljava/lang/String;", null, "SHA256withECDSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_ECDSA_SHA384", "Ljava/lang/String;", null, "SHA384withECDSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_ECDSA_SHA512", "Ljava/lang/String;", null, "SHA512withECDSA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HMAC_MD5", "Ljava/lang/String;", null, "HmacMD5");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HMAC_RIPEMD160", "Ljava/lang/String;", null, "HMACRIPEMD160");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HMAC_SHA1", "Ljava/lang/String;", null, "HmacSHA1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HMAC_SHA224", "Ljava/lang/String;", null, "HmacSHA224");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HMAC_SHA256", "Ljava/lang/String;", null, "HmacSHA256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HMAC_SHA384", "Ljava/lang/String;", null, "HmacSHA384");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HMAC_SHA512", "Ljava/lang/String;", null, "HmacSHA512");
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
