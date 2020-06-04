package asm.org.bouncycastle.jcajce.util;
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
public class JcaJceHelperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/bouncycastle/jcajce/util/JcaJceHelper", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCipher", "(Ljava/lang/String;)Ljavax/crypto/Cipher;", null, new String[] { "java/security/NoSuchAlgorithmException", "javax/crypto/NoSuchPaddingException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createMac", "(Ljava/lang/String;)Ljavax/crypto/Mac;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createKeyAgreement", "(Ljava/lang/String;)Ljavax/crypto/KeyAgreement;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createAlgorithmParameterGenerator", "(Ljava/lang/String;)Ljava/security/AlgorithmParameterGenerator;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createAlgorithmParameters", "(Ljava/lang/String;)Ljava/security/AlgorithmParameters;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createKeyGenerator", "(Ljava/lang/String;)Ljavax/crypto/KeyGenerator;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createKeyFactory", "(Ljava/lang/String;)Ljava/security/KeyFactory;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSecretKeyFactory", "(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createKeyPairGenerator", "(Ljava/lang/String;)Ljava/security/KeyPairGenerator;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "createDigest", "(Ljava/lang/String;)Ljava/security/MessageDigest;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createMessageDigest", "(Ljava/lang/String;)Ljava/security/MessageDigest;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSignature", "(Ljava/lang/String;)Ljava/security/Signature;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCertificateFactory", "(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;", null, new String[] { "java/security/NoSuchProviderException", "java/security/cert/CertificateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSecureRandom", "(Ljava/lang/String;)Ljava/security/SecureRandom;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCertPathBuilder", "(Ljava/lang/String;)Ljava/security/cert/CertPathBuilder;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCertPathValidator", "(Ljava/lang/String;)Ljava/security/cert/CertPathValidator;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCertStore", "(Ljava/lang/String;Ljava/security/cert/CertStoreParameters;)Ljava/security/cert/CertStore;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/InvalidAlgorithmParameterException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createExemptionMechanism", "(Ljava/lang/String;)Ljavax/crypto/ExemptionMechanism;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createKeyStore", "(Ljava/lang/String;)Ljava/security/KeyStore;", null, new String[] { "java/security/KeyStoreException", "java/security/NoSuchProviderException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
