package asm.org.jose4j.jwa;
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
public class AlgorithmFactoryFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jose4j/jwa/AlgorithmFactoryFactory", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/jose4j/jws/HmacUsingShaAlgorithm$HmacSha256", "org/jose4j/jws/HmacUsingShaAlgorithm", "HmacSha256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/HmacUsingShaAlgorithm$HmacSha384", "org/jose4j/jws/HmacUsingShaAlgorithm", "HmacSha384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/HmacUsingShaAlgorithm$HmacSha512", "org/jose4j/jws/HmacUsingShaAlgorithm", "HmacSha512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/EcdsaUsingShaAlgorithm$EcdsaP256UsingSha256", "org/jose4j/jws/EcdsaUsingShaAlgorithm", "EcdsaP256UsingSha256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/EcdsaUsingShaAlgorithm$EcdsaP384UsingSha384", "org/jose4j/jws/EcdsaUsingShaAlgorithm", "EcdsaP384UsingSha384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/EcdsaUsingShaAlgorithm$EcdsaP521UsingSha512", "org/jose4j/jws/EcdsaUsingShaAlgorithm", "EcdsaP521UsingSha512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/RsaUsingShaAlgorithm$RsaSha256", "org/jose4j/jws/RsaUsingShaAlgorithm", "RsaSha256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/RsaUsingShaAlgorithm$RsaSha384", "org/jose4j/jws/RsaUsingShaAlgorithm", "RsaSha384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/RsaUsingShaAlgorithm$RsaSha512", "org/jose4j/jws/RsaUsingShaAlgorithm", "RsaSha512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/RsaUsingShaAlgorithm$RsaPssSha256", "org/jose4j/jws/RsaUsingShaAlgorithm", "RsaPssSha256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/RsaUsingShaAlgorithm$RsaPssSha384", "org/jose4j/jws/RsaUsingShaAlgorithm", "RsaPssSha384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/RsaUsingShaAlgorithm$RsaPssSha512", "org/jose4j/jws/RsaUsingShaAlgorithm", "RsaPssSha512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/RsaKeyManagementAlgorithm$Rsa1_5", "org/jose4j/jwe/RsaKeyManagementAlgorithm", "Rsa1_5", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/RsaKeyManagementAlgorithm$RsaOaep", "org/jose4j/jwe/RsaKeyManagementAlgorithm", "RsaOaep", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/RsaKeyManagementAlgorithm$RsaOaep256", "org/jose4j/jwe/RsaKeyManagementAlgorithm", "RsaOaep256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesKeyWrapManagementAlgorithm$Aes128", "org/jose4j/jwe/AesKeyWrapManagementAlgorithm", "Aes128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesKeyWrapManagementAlgorithm$Aes192", "org/jose4j/jwe/AesKeyWrapManagementAlgorithm", "Aes192", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesKeyWrapManagementAlgorithm$Aes256", "org/jose4j/jwe/AesKeyWrapManagementAlgorithm", "Aes256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/EcdhKeyAgreementWithAesKeyWrapAlgorithm$EcdhKeyAgreementWithAes128KeyWrapAlgorithm", "org/jose4j/jwe/EcdhKeyAgreementWithAesKeyWrapAlgorithm", "EcdhKeyAgreementWithAes128KeyWrapAlgorithm", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/EcdhKeyAgreementWithAesKeyWrapAlgorithm$EcdhKeyAgreementWithAes192KeyWrapAlgorithm", "org/jose4j/jwe/EcdhKeyAgreementWithAesKeyWrapAlgorithm", "EcdhKeyAgreementWithAes192KeyWrapAlgorithm", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/EcdhKeyAgreementWithAesKeyWrapAlgorithm$EcdhKeyAgreementWithAes256KeyWrapAlgorithm", "org/jose4j/jwe/EcdhKeyAgreementWithAesKeyWrapAlgorithm", "EcdhKeyAgreementWithAes256KeyWrapAlgorithm", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha256Aes128", "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "HmacSha256Aes128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha384Aes192", "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "HmacSha384Aes192", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha512Aes256", "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "HmacSha512Aes256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm$Aes128Gcm", "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "Aes128Gcm", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm$Aes192Gcm", "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "Aes192Gcm", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm$Aes256Gcm", "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "Aes256Gcm", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm$Aes128CbcHmacSha256", "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "Aes128CbcHmacSha256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm$Aes192CbcHmacSha384", "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "Aes192CbcHmacSha384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm$Aes256CbcHmacSha512", "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "Aes256CbcHmacSha512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesGcmContentEncryptionAlgorithm$Aes128Gcm", "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "Aes128Gcm", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesGcmContentEncryptionAlgorithm$Aes192Gcm", "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "Aes192Gcm", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesGcmContentEncryptionAlgorithm$Aes256Gcm", "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "Aes256Gcm", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "factoryFactory", "Lorg/jose4j/jwa/AlgorithmFactoryFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;", "Lorg/jose4j/jwa/AlgorithmFactory<Lorg/jose4j/jws/JsonWebSignatureAlgorithm;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;", "Lorg/jose4j/jwa/AlgorithmFactory<Lorg/jose4j/jwe/KeyManagementAlgorithm;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jweContentEncryptionAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;", "Lorg/jose4j/jwa/AlgorithmFactory<Lorg/jose4j/jwe/ContentEncryptionAlgorithm;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "compressionAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;", "Lorg/jose4j/jwa/AlgorithmFactory<Lorg/jose4j/zip/CompressionAlgorithm;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwa/AlgorithmFactoryFactory", "initialize", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "reinitialize", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwa/AlgorithmFactoryFactory", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Reinitializing jose4j...");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwa/AlgorithmFactoryFactory", "initialize", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "initialize", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("java.version");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLdcInsn("java.vendor");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLdcInsn("java.home");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/Security", "getProviders", "()[Ljava/security/Provider;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "toString", "([Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwa/AlgorithmFactoryFactory", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Initializing jose4j (running with Java {} from {} at {} with {} security providers installed)...");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;[Ljava/lang/Object;)V", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwa/AlgorithmFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("alg");
methodVisitor.visitLdcInsn(Type.getType("Lorg/jose4j/jws/JsonWebSignatureAlgorithm;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwa/AlgorithmFactory", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jws/PlaintextNoneAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/PlaintextNoneAlgorithm", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jws/HmacUsingShaAlgorithm$HmacSha256");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/HmacUsingShaAlgorithm$HmacSha256", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jws/HmacUsingShaAlgorithm$HmacSha384");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/HmacUsingShaAlgorithm$HmacSha384", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jws/HmacUsingShaAlgorithm$HmacSha512");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/HmacUsingShaAlgorithm$HmacSha512", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jws/EcdsaUsingShaAlgorithm$EcdsaP256UsingSha256");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/EcdsaUsingShaAlgorithm$EcdsaP256UsingSha256", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jws/EcdsaUsingShaAlgorithm$EcdsaP384UsingSha384");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/EcdsaUsingShaAlgorithm$EcdsaP384UsingSha384", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jws/EcdsaUsingShaAlgorithm$EcdsaP521UsingSha512");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/EcdsaUsingShaAlgorithm$EcdsaP521UsingSha512", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jws/RsaUsingShaAlgorithm$RsaSha256");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/RsaUsingShaAlgorithm$RsaSha256", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jws/RsaUsingShaAlgorithm$RsaSha384");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/RsaUsingShaAlgorithm$RsaSha384", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jws/RsaUsingShaAlgorithm$RsaSha512");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/RsaUsingShaAlgorithm$RsaSha512", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jws/RsaUsingShaAlgorithm$RsaPssSha256");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/RsaUsingShaAlgorithm$RsaPssSha256", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jws/RsaUsingShaAlgorithm$RsaPssSha384");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/RsaUsingShaAlgorithm$RsaPssSha384", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jws/RsaUsingShaAlgorithm$RsaPssSha512");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/RsaUsingShaAlgorithm$RsaPssSha512", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwa/AlgorithmFactoryFactory", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("JWS signature algorithms: {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "getSupportedAlgorithms", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwa/AlgorithmFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("alg");
methodVisitor.visitLdcInsn(Type.getType("Lorg/jose4j/jwe/KeyManagementAlgorithm;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwa/AlgorithmFactory", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/RsaKeyManagementAlgorithm$Rsa1_5");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/RsaKeyManagementAlgorithm$Rsa1_5", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/RsaKeyManagementAlgorithm$RsaOaep");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/RsaKeyManagementAlgorithm$RsaOaep", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/RsaKeyManagementAlgorithm$RsaOaep256");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/RsaKeyManagementAlgorithm$RsaOaep256", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/DirectKeyManagementAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/DirectKeyManagementAlgorithm", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/AesKeyWrapManagementAlgorithm$Aes128");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/AesKeyWrapManagementAlgorithm$Aes128", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/AesKeyWrapManagementAlgorithm$Aes192");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/AesKeyWrapManagementAlgorithm$Aes192", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/AesKeyWrapManagementAlgorithm$Aes256");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/AesKeyWrapManagementAlgorithm$Aes256", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/EcdhKeyAgreementAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/EcdhKeyAgreementAlgorithm", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/EcdhKeyAgreementWithAesKeyWrapAlgorithm$EcdhKeyAgreementWithAes128KeyWrapAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/EcdhKeyAgreementWithAesKeyWrapAlgorithm$EcdhKeyAgreementWithAes128KeyWrapAlgorithm", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/EcdhKeyAgreementWithAesKeyWrapAlgorithm$EcdhKeyAgreementWithAes192KeyWrapAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/EcdhKeyAgreementWithAesKeyWrapAlgorithm$EcdhKeyAgreementWithAes192KeyWrapAlgorithm", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/EcdhKeyAgreementWithAesKeyWrapAlgorithm$EcdhKeyAgreementWithAes256KeyWrapAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/EcdhKeyAgreementWithAesKeyWrapAlgorithm$EcdhKeyAgreementWithAes256KeyWrapAlgorithm", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha256Aes128");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha256Aes128", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha384Aes192");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha384Aes192", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha512Aes256");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha512Aes256", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm$Aes128Gcm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm$Aes128Gcm", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm$Aes192Gcm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm$Aes192Gcm", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm$Aes256Gcm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm$Aes256Gcm", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwa/AlgorithmFactoryFactory", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("JWE key management algorithms: {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "getSupportedAlgorithms", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwa/AlgorithmFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("enc");
methodVisitor.visitLdcInsn(Type.getType("Lorg/jose4j/jwe/ContentEncryptionAlgorithm;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwa/AlgorithmFactory", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweContentEncryptionAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweContentEncryptionAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm$Aes128CbcHmacSha256");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm$Aes128CbcHmacSha256", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweContentEncryptionAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm$Aes192CbcHmacSha384");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm$Aes192CbcHmacSha384", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweContentEncryptionAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm$Aes256CbcHmacSha512");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm$Aes256CbcHmacSha512", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweContentEncryptionAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm$Aes128Gcm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm$Aes128Gcm", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweContentEncryptionAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm$Aes192Gcm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm$Aes192Gcm", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweContentEncryptionAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm$Aes256Gcm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm$Aes256Gcm", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwa/AlgorithmFactoryFactory", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("JWE content encryption algorithms: {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweContentEncryptionAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "getSupportedAlgorithms", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwa/AlgorithmFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("zip");
methodVisitor.visitLdcInsn(Type.getType("Lorg/jose4j/zip/CompressionAlgorithm;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwa/AlgorithmFactory", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "compressionAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "compressionAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/zip/DeflateRFC1951CompressionAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/zip/DeflateRFC1951CompressionAlgorithm", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "registerAlgorithm", "(Lorg/jose4j/jwa/Algorithm;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwa/AlgorithmFactoryFactory", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("JWE compression algorithms: {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "compressionAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "getSupportedAlgorithms", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwa/AlgorithmFactoryFactory", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Initialized jose4j in {}ms");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "()Lorg/jose4j/jwa/AlgorithmFactoryFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwa/AlgorithmFactoryFactory", "factoryFactory", "Lorg/jose4j/jwa/AlgorithmFactoryFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJwsAlgorithmFactory", "()Lorg/jose4j/jwa/AlgorithmFactory;", "()Lorg/jose4j/jwa/AlgorithmFactory<Lorg/jose4j/jws/JsonWebSignatureAlgorithm;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jwsAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJweKeyManagementAlgorithmFactory", "()Lorg/jose4j/jwa/AlgorithmFactory;", "()Lorg/jose4j/jwa/AlgorithmFactory<Lorg/jose4j/jwe/KeyManagementAlgorithm;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweKeyMgmtModeAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJweContentEncryptionAlgorithmFactory", "()Lorg/jose4j/jwa/AlgorithmFactory;", "()Lorg/jose4j/jwa/AlgorithmFactory<Lorg/jose4j/jwe/ContentEncryptionAlgorithm;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "jweContentEncryptionAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCompressionAlgorithmFactory", "()Lorg/jose4j/jwa/AlgorithmFactory;", "()Lorg/jose4j/jwa/AlgorithmFactory<Lorg/jose4j/zip/CompressionAlgorithm;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmFactoryFactory", "compressionAlgorithmFactory", "Lorg/jose4j/jwa/AlgorithmFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/jose4j/jwa/AlgorithmFactoryFactory;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jose4j/jwa/AlgorithmFactoryFactory", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwa/AlgorithmFactoryFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwa/AlgorithmFactoryFactory", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jose4j/jwa/AlgorithmFactoryFactory", "factoryFactory", "Lorg/jose4j/jwa/AlgorithmFactoryFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
