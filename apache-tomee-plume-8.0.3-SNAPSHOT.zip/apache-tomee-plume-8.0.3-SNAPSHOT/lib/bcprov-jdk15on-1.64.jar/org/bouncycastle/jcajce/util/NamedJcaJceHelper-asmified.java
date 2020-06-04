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
public class NamedJcaJceHelperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", null, "java/lang/Object", new String[] { "org/bouncycastle/jcajce/util/JcaJceHelper" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "providerName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCipher", "(Ljava/lang/String;)Ljavax/crypto/Cipher;", null, new String[] { "java/security/NoSuchAlgorithmException", "javax/crypto/NoSuchPaddingException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/crypto/Cipher", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/Cipher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMac", "(Ljava/lang/String;)Ljavax/crypto/Mac;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/crypto/Mac", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/Mac;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createKeyAgreement", "(Ljava/lang/String;)Ljavax/crypto/KeyAgreement;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/crypto/KeyAgreement", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/KeyAgreement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createAlgorithmParameterGenerator", "(Ljava/lang/String;)Ljava/security/AlgorithmParameterGenerator;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AlgorithmParameterGenerator", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameterGenerator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createAlgorithmParameters", "(Ljava/lang/String;)Ljava/security/AlgorithmParameters;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AlgorithmParameters", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createKeyGenerator", "(Ljava/lang/String;)Ljavax/crypto/KeyGenerator;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/crypto/KeyGenerator", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/KeyGenerator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createKeyFactory", "(Ljava/lang/String;)Ljava/security/KeyFactory;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/KeyFactory", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSecretKeyFactory", "(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/crypto/SecretKeyFactory", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createKeyPairGenerator", "(Ljava/lang/String;)Ljava/security/KeyPairGenerator;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/KeyPairGenerator", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPairGenerator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "createDigest", "(Ljava/lang/String;)Ljava/security/MessageDigest;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/MessageDigest", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/MessageDigest;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMessageDigest", "(Ljava/lang/String;)Ljava/security/MessageDigest;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/MessageDigest", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/MessageDigest;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSignature", "(Ljava/lang/String;)Ljava/security/Signature;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/Signature", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/Signature;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCertificateFactory", "(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;", null, new String[] { "java/security/cert/CertificateException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/cert/CertificateFactory", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/CertificateFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSecureRandom", "(Ljava/lang/String;)Ljava/security/SecureRandom;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/SecureRandom", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/SecureRandom;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCertPathBuilder", "(Ljava/lang/String;)Ljava/security/cert/CertPathBuilder;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/cert/CertPathBuilder", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/CertPathBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCertPathValidator", "(Ljava/lang/String;)Ljava/security/cert/CertPathValidator;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/cert/CertPathValidator", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/CertPathValidator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCertStore", "(Ljava/lang/String;Ljava/security/cert/CertStoreParameters;)Ljava/security/cert/CertStore;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/InvalidAlgorithmParameterException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/cert/CertStore", "getInstance", "(Ljava/lang/String;Ljava/security/cert/CertStoreParameters;Ljava/lang/String;)Ljava/security/cert/CertStore;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createExemptionMechanism", "(Ljava/lang/String;)Ljavax/crypto/ExemptionMechanism;", null, new String[] { "java/security/NoSuchAlgorithmException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/crypto/ExemptionMechanism", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/ExemptionMechanism;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createKeyStore", "(Ljava/lang/String;)Ljava/security/KeyStore;", null, new String[] { "java/security/KeyStoreException", "java/security/NoSuchProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/util/NamedJcaJceHelper", "providerName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/KeyStore", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyStore;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
