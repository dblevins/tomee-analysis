package asm.org.jose4j.jwe;
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
public class AesGcmKeyEncryptionAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", null, "org/jose4j/jwa/AlgorithmInfo", new String[] { "org/jose4j/jwe/KeyManagementAlgorithm" });

classWriter.visitInnerClass("org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm$Aes256Gcm", "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "Aes256Gcm", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm$Aes192Gcm", "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "Aes192Gcm", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm$Aes128Gcm", "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "Aes128Gcm", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/SimpleAeadCipher$CipherOutput", "org/jose4j/jwe/SimpleAeadCipher", "CipherOutput", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jca/ProviderContext$Context", "org/jose4j/jca/ProviderContext", "Context", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TAG_BYTE_LENGTH", "I", null, new Integer(16));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "IV_BYTE_LENGTH", "I", null, new Integer(12));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "simpleAeadCipher", "Lorg/jose4j/jwe/SimpleAeadCipher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyByteLength", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwa/AlgorithmInfo", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "setAlgorithmIdentifier", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("AES/GCM/NoPadding");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "setJavaAlgorithm", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/keys/KeyPersuasion", "SYMMETRIC", "Lorg/jose4j/keys/KeyPersuasion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "setKeyPersuasion", "(Lorg/jose4j/keys/KeyPersuasion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("oct");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "setKeyType", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/SimpleAeadCipher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "getJavaAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/SimpleAeadCipher", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "simpleAeadCipher", "Lorg/jose4j/jwe/SimpleAeadCipher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "keyByteLength", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "manageForEncrypt", "(Ljava/security/Key;Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;Lorg/jose4j/jwx/Headers;[BLorg/jose4j/jca/ProviderContext;)Lorg/jose4j/jwe/ContentEncryptionKeys;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jca/ProviderContext", "getSecureRandom", "()Ljava/security/SecureRandom;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionKeyDescriptor", "getContentEncryptionKeyByteLength", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/ByteUtil", "randomBytes", "(ILjava/security/SecureRandom;)[B", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/security/SecureRandom"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"[B"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/base64url/Base64Url");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/base64url/Base64Url", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("iv");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/Headers", "getStringHeaderValue", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/ByteUtil", "randomBytes", "(ILjava/security/SecureRandom;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlEncode", "([B)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("iv");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/Headers", "setStringHeaderValue", "(Ljava/lang/String;Ljava/lang/String;)V", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[B", "org/jose4j/base64url/Base64Url", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlDecode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[B"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jca/ProviderContext", "getSuppliedKeyProviderContext", "()Lorg/jose4j/jca/ProviderContext$Context;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jca/ProviderContext$Context", "getCipherProvider", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "simpleAeadCipher", "Lorg/jose4j/jwe/SimpleAeadCipher;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/SimpleAeadCipher", "encrypt", "(Ljava/security/Key;[B[B[BLjava/lang/String;)Lorg/jose4j/jwe/SimpleAeadCipher$CipherOutput;", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/SimpleAeadCipher$CipherOutput", "getCiphertext", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/SimpleAeadCipher$CipherOutput", "getTag", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlEncode", "([B)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 15);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("tag");
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/Headers", "setStringHeaderValue", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/ContentEncryptionKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/ContentEncryptionKeys", "<init>", "([B[B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 16);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "manageForDecrypt", "(Ljava/security/Key;[BLorg/jose4j/jwe/ContentEncryptionKeyDescriptor;Lorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)Ljava/security/Key;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/jose4j/base64url/Base64Url");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/base64url/Base64Url", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("iv");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/Headers", "getStringHeaderValue", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlDecode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("tag");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/Headers", "getStringHeaderValue", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlDecode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jca/ProviderContext", "getSuppliedKeyProviderContext", "()Lorg/jose4j/jca/ProviderContext$Context;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jca/ProviderContext$Context", "getCipherProvider", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "simpleAeadCipher", "Lorg/jose4j/jwe/SimpleAeadCipher;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/SimpleAeadCipher", "decrypt", "(Ljava/security/Key;[B[B[B[BLjava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitTypeInsn(NEW, "javax/crypto/spec/SecretKeySpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionKeyDescriptor", "getContentEncryptionKeyAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/crypto/spec/SecretKeySpec", "<init>", "([BLjava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 13);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateEncryptionKey", "(Ljava/security/Key;Lorg/jose4j/jwe/ContentEncryptionAlgorithm;)V", null, new String[] { "org/jose4j/lang/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "validateKey", "(Ljava/security/Key;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateDecryptionKey", "(Ljava/security/Key;Lorg/jose4j/jwe/ContentEncryptionAlgorithm;)V", null, new String[] { "org/jose4j/lang/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "validateKey", "(Ljava/security/Key;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "validateKey", "(Ljava/security/Key;)V", null, new String[] { "org/jose4j/lang/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "getAlgorithmIdentifier", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "keyByteLength", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwx/KeyValidationSupport", "validateAesWrappingKey", "(Ljava/security/Key;Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAvailable", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "simpleAeadCipher", "Lorg/jose4j/jwe/SimpleAeadCipher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "keyByteLength", "I");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmKeyEncryptionAlgorithm", "getAlgorithmIdentifier", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/SimpleAeadCipher", "isAvailable", "(Lorg/slf4j/Logger;IILjava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
