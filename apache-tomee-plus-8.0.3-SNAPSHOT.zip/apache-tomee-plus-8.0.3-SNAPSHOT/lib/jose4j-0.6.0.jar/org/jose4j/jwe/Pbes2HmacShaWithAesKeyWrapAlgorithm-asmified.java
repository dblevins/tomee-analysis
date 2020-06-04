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
public class Pbes2HmacShaWithAesKeyWrapAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", null, "org/jose4j/jwa/AlgorithmInfo", new String[] { "org/jose4j/jwe/KeyManagementAlgorithm" });

classWriter.visitInnerClass("org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha512Aes256", "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "HmacSha512Aes256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha384Aes192", "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "HmacSha384Aes192", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha256Aes128", "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "HmacSha256Aes128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jca/ProviderContext$Context", "org/jose4j/jca/ProviderContext", "Context", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ZERO_BYTE", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyWrap", "Lorg/jose4j/jwe/AesKeyWrapManagementAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyWrapKeyDescriptor", "Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "pbkdf2", "Lorg/jose4j/jwe/kdf/PasswordBasedKeyDerivationFunction2;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "defaultIterationCount", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "defaultSaltByteLength", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/jose4j/jwe/AesKeyWrapManagementAlgorithm;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwa/AlgorithmInfo", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(8192L));
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "defaultIterationCount", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "defaultSaltByteLength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "setAlgorithmIdentifier", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("n/a");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "setJavaAlgorithm", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/kdf/PasswordBasedKeyDerivationFunction2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/kdf/PasswordBasedKeyDerivationFunction2", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "pbkdf2", "Lorg/jose4j/jwe/kdf/PasswordBasedKeyDerivationFunction2;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/keys/KeyPersuasion", "SYMMETRIC", "Lorg/jose4j/keys/KeyPersuasion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "setKeyPersuasion", "(Lorg/jose4j/keys/KeyPersuasion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("PBKDF2");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "setKeyType", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "keyWrap", "Lorg/jose4j/jwe/AesKeyWrapManagementAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/ContentEncryptionKeyDescriptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "keyWrap", "Lorg/jose4j/jwe/AesKeyWrapManagementAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesKeyWrapManagementAlgorithm", "getKeyByteLength", "()I", false);
methodVisitor.visitLdcInsn("AES");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/ContentEncryptionKeyDescriptor", "<init>", "(ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "keyWrapKeyDescriptor", "Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "manageForEncrypt", "(Ljava/security/Key;Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;Lorg/jose4j/jwx/Headers;[BLorg/jose4j/jca/ProviderContext;)Lorg/jose4j/jwe/ContentEncryptionKeys;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "deriveForEncrypt", "(Ljava/security/Key;Lorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)Ljava/security/Key;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "keyWrap", "Lorg/jose4j/jwe/AesKeyWrapManagementAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesKeyWrapManagementAlgorithm", "manageForEncrypt", "(Ljava/security/Key;Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;Lorg/jose4j/jwx/Headers;[BLorg/jose4j/jca/ProviderContext;)Lorg/jose4j/jwe/ContentEncryptionKeys;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "deriveForEncrypt", "(Ljava/security/Key;Lorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)Ljava/security/Key;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("p2c");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/Headers", "getLongHeaderValue", "(Ljava/lang/String;)Ljava/lang/Long;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "defaultIterationCount", "J");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("p2c");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/Headers", "setObjectHeaderValue", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Long"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("p2s");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/Headers", "getStringHeaderValue", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/base64url/Base64Url");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/base64url/Base64Url", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "defaultSaltByteLength", "I");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jca/ProviderContext", "getSecureRandom", "()Ljava/security/SecureRandom;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/ByteUtil", "randomBytes", "(ILjava/security/SecureRandom;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlEncode", "([B)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("p2s");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/Headers", "setStringHeaderValue", "(Ljava/lang/String;Ljava/lang/String;)V", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/String", Opcodes.TOP, "org/jose4j/base64url/Base64Url"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlDecode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "java/security/Key", "org/jose4j/jwx/Headers", "org/jose4j/jca/ProviderContext", "java/lang/Long", "java/lang/String", "[B", "org/jose4j/base64url/Base64Url"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "deriveKey", "(Ljava/security/Key;Ljava/lang/Long;[BLorg/jose4j/jca/ProviderContext;)Ljava/security/Key;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "manageForDecrypt", "(Ljava/security/Key;[BLorg/jose4j/jwe/ContentEncryptionKeyDescriptor;Lorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)Ljava/security/Key;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("p2c");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/Headers", "getLongHeaderValue", "(Ljava/lang/String;)Ljava/lang/Long;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("p2s");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/Headers", "getStringHeaderValue", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/base64url/Base64Url");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/base64url/Base64Url", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlDecode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "deriveKey", "(Ljava/security/Key;Ljava/lang/Long;[BLorg/jose4j/jca/ProviderContext;)Ljava/security/Key;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "keyWrap", "Lorg/jose4j/jwe/AesKeyWrapManagementAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesKeyWrapManagementAlgorithm", "manageForDecrypt", "(Ljava/security/Key;[BLorg/jose4j/jwe/ContentEncryptionKeyDescriptor;Lorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)Ljava/security/Key;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "deriveKey", "(Ljava/security/Key;Ljava/lang/Long;[BLorg/jose4j/jca/ProviderContext;)Ljava/security/Key;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[B");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "getAlgorithmIdentifier", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/StringUtil", "getBytesUtf8", "(Ljava/lang/String;)[B", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "ZERO_BYTE", "[B");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/ByteUtil", "concat", "([[B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "keyWrapKeyDescriptor", "Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionKeyDescriptor", "getContentEncryptionKeyByteLength", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jca/ProviderContext", "getSuppliedKeyProviderContext", "()Lorg/jose4j/jca/ProviderContext$Context;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jca/ProviderContext$Context", "getMacProvider", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "pbkdf2", "Lorg/jose4j/jwe/kdf/PasswordBasedKeyDerivationFunction2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/Key", "getEncoded", "()[B", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Long", "intValue", "()I", false);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/kdf/PasswordBasedKeyDerivationFunction2", "derive", "([B[BIILjava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitTypeInsn(NEW, "javax/crypto/spec/SecretKeySpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "keyWrapKeyDescriptor", "Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionKeyDescriptor", "getContentEncryptionKeyAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/crypto/spec/SecretKeySpec", "<init>", "([BLjava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateEncryptionKey", "(Ljava/security/Key;Lorg/jose4j/jwe/ContentEncryptionAlgorithm;)V", null, new String[] { "org/jose4j/lang/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "validateKey", "(Ljava/security/Key;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateDecryptionKey", "(Ljava/security/Key;Lorg/jose4j/jwe/ContentEncryptionAlgorithm;)V", null, new String[] { "org/jose4j/lang/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "validateKey", "(Ljava/security/Key;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateKey", "(Ljava/security/Key;)V", null, new String[] { "org/jose4j/lang/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwx/KeyValidationSupport", "notNull", "(Ljava/security/Key;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAvailable", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "keyWrap", "Lorg/jose4j/jwe/AesKeyWrapManagementAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesKeyWrapManagementAlgorithm", "isAvailable", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultIterationCount", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "defaultIterationCount", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultIterationCount", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "defaultIterationCount", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultSaltByteLength", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "defaultSaltByteLength", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultSaltByteLength", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "defaultSaltByteLength", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "ZERO_BYTE", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
