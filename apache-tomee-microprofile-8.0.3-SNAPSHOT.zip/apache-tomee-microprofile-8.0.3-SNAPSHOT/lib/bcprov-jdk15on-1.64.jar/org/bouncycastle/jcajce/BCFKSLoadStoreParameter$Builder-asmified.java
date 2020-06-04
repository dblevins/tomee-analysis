package asm.org.bouncycastle.jcajce;
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
public class BCFKSLoadStoreParameter$BuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", null, "java/lang/Object", null);

classWriter.visitInnerClass("java/security/KeyStore$PasswordProtection", "java/security/KeyStore", "PasswordProtection", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("java/security/KeyStore$ProtectionParameter", "java/security/KeyStore", "ProtectionParameter", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/bouncycastle/crypto/util/PBKDF2Config$Builder", "org/bouncycastle/crypto/util/PBKDF2Config", "Builder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "Builder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "EncryptionAlgorithm", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm", "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "MacAlgorithm", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "SignatureAlgorithm", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/bouncycastle/jcajce/BCFKSLoadStoreParameter$CertChainValidator", "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "CertChainValidator", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/bouncycastle/jcajce/BCFKSLoadStoreParameter$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "out", "Ljava/io/OutputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "in", "Ljava/io/InputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "protectionParameter", "Ljava/security/KeyStore$ProtectionParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "sigKey", "Ljava/security/Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "storeConfig", "Lorg/bouncycastle/crypto/util/PBKDFConfig;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "encAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "macAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sigAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "certs", "[Ljava/security/cert/X509Certificate;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "validator", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$CertChainValidator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "java/io/OutputStream");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/KeyStore$ProtectionParameter");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "<init>", "(Ljava/io/OutputStream;Ljava/security/KeyStore$ProtectionParameter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/io/OutputStream;[C)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "java/security/KeyStore$PasswordProtection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/KeyStore$PasswordProtection", "<init>", "([C)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "<init>", "(Ljava/io/OutputStream;Ljava/security/KeyStore$ProtectionParameter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/io/OutputStream;Ljava/security/KeyStore$ProtectionParameter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/util/PBKDF2Config$Builder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "<init>", "()V", false);
methodVisitor.visitIntInsn(SIPUSH, 16384);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "withIterationCount", "(I)Lorg/bouncycastle/crypto/util/PBKDF2Config$Builder;", false);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "withSaltLength", "(I)Lorg/bouncycastle/crypto/util/PBKDF2Config$Builder;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/util/PBKDF2Config", "PRF_SHA512", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "withPRF", "(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;)Lorg/bouncycastle/crypto/util/PBKDF2Config$Builder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "build", "()Lorg/bouncycastle/crypto/util/PBKDF2Config;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "storeConfig", "Lorg/bouncycastle/crypto/util/PBKDFConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "AES256_CCM", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "encAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm", "HmacSHA512", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "macAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA512withECDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "sigAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "certs", "[Ljava/security/cert/X509Certificate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "in", "Ljava/io/InputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "out", "Ljava/io/OutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "protectionParameter", "Ljava/security/KeyStore$ProtectionParameter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "sigKey", "Ljava/security/Key;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/io/OutputStream;Ljava/security/PrivateKey;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/util/PBKDF2Config$Builder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "<init>", "()V", false);
methodVisitor.visitIntInsn(SIPUSH, 16384);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "withIterationCount", "(I)Lorg/bouncycastle/crypto/util/PBKDF2Config$Builder;", false);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "withSaltLength", "(I)Lorg/bouncycastle/crypto/util/PBKDF2Config$Builder;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/util/PBKDF2Config", "PRF_SHA512", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "withPRF", "(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;)Lorg/bouncycastle/crypto/util/PBKDF2Config$Builder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "build", "()Lorg/bouncycastle/crypto/util/PBKDF2Config;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "storeConfig", "Lorg/bouncycastle/crypto/util/PBKDFConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "AES256_CCM", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "encAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm", "HmacSHA512", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "macAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA512withECDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "sigAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "certs", "[Ljava/security/cert/X509Certificate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "in", "Ljava/io/InputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "out", "Ljava/io/OutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "protectionParameter", "Ljava/security/KeyStore$ProtectionParameter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "sigKey", "Ljava/security/Key;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/io/InputStream;Ljava/security/PublicKey;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/util/PBKDF2Config$Builder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "<init>", "()V", false);
methodVisitor.visitIntInsn(SIPUSH, 16384);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "withIterationCount", "(I)Lorg/bouncycastle/crypto/util/PBKDF2Config$Builder;", false);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "withSaltLength", "(I)Lorg/bouncycastle/crypto/util/PBKDF2Config$Builder;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/util/PBKDF2Config", "PRF_SHA512", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "withPRF", "(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;)Lorg/bouncycastle/crypto/util/PBKDF2Config$Builder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "build", "()Lorg/bouncycastle/crypto/util/PBKDF2Config;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "storeConfig", "Lorg/bouncycastle/crypto/util/PBKDFConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "AES256_CCM", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "encAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm", "HmacSHA512", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "macAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA512withECDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "sigAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "certs", "[Ljava/security/cert/X509Certificate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "in", "Ljava/io/InputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "out", "Ljava/io/OutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "protectionParameter", "Ljava/security/KeyStore$ProtectionParameter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "sigKey", "Ljava/security/Key;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/io/InputStream;Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$CertChainValidator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/util/PBKDF2Config$Builder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "<init>", "()V", false);
methodVisitor.visitIntInsn(SIPUSH, 16384);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "withIterationCount", "(I)Lorg/bouncycastle/crypto/util/PBKDF2Config$Builder;", false);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "withSaltLength", "(I)Lorg/bouncycastle/crypto/util/PBKDF2Config$Builder;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/util/PBKDF2Config", "PRF_SHA512", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "withPRF", "(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;)Lorg/bouncycastle/crypto/util/PBKDF2Config$Builder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "build", "()Lorg/bouncycastle/crypto/util/PBKDF2Config;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "storeConfig", "Lorg/bouncycastle/crypto/util/PBKDFConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "AES256_CCM", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "encAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm", "HmacSHA512", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "macAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA512withECDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "sigAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "certs", "[Ljava/security/cert/X509Certificate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "in", "Ljava/io/InputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "out", "Ljava/io/OutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "protectionParameter", "Ljava/security/KeyStore$ProtectionParameter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "validator", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$CertChainValidator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "sigKey", "Ljava/security/Key;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/io/InputStream;[C)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "java/security/KeyStore$PasswordProtection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/KeyStore$PasswordProtection", "<init>", "([C)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "<init>", "(Ljava/io/InputStream;Ljava/security/KeyStore$ProtectionParameter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/io/InputStream;Ljava/security/KeyStore$ProtectionParameter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/util/PBKDF2Config$Builder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "<init>", "()V", false);
methodVisitor.visitIntInsn(SIPUSH, 16384);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "withIterationCount", "(I)Lorg/bouncycastle/crypto/util/PBKDF2Config$Builder;", false);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "withSaltLength", "(I)Lorg/bouncycastle/crypto/util/PBKDF2Config$Builder;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/util/PBKDF2Config", "PRF_SHA512", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "withPRF", "(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;)Lorg/bouncycastle/crypto/util/PBKDF2Config$Builder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/PBKDF2Config$Builder", "build", "()Lorg/bouncycastle/crypto/util/PBKDF2Config;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "storeConfig", "Lorg/bouncycastle/crypto/util/PBKDFConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "AES256_CCM", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "encAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm", "HmacSHA512", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "macAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA512withECDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "sigAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "certs", "[Ljava/security/cert/X509Certificate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "in", "Ljava/io/InputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "out", "Ljava/io/OutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "protectionParameter", "Ljava/security/KeyStore$ProtectionParameter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "sigKey", "Ljava/security/Key;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withStorePBKDFConfig", "(Lorg/bouncycastle/crypto/util/PBKDFConfig;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "storeConfig", "Lorg/bouncycastle/crypto/util/PBKDFConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withStoreEncryptionAlgorithm", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "encAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withStoreMacAlgorithm", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "macAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withCertificates", "([Ljava/security/cert/X509Certificate;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/security/cert/X509Certificate");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "certs", "[Ljava/security/cert/X509Certificate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withStoreSignatureAlgorithm", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "sigAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "()Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "<init>", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Ljava/io/InputStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "in", "Ljava/io/InputStream;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Ljava/io/OutputStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "out", "Ljava/io/OutputStream;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Ljava/security/KeyStore$ProtectionParameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "protectionParameter", "Ljava/security/KeyStore$ProtectionParameter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Lorg/bouncycastle/crypto/util/PBKDFConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "storeConfig", "Lorg/bouncycastle/crypto/util/PBKDFConfig;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "encAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "macAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "sigAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$800", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Ljava/security/Key;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "sigKey", "Ljava/security/Key;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$900", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)[Ljava/security/cert/X509Certificate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "certs", "[Ljava/security/cert/X509Certificate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1000", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$CertChainValidator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "validator", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$CertChainValidator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
