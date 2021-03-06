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
public class AesCbcHmacSha2ContentEncryptionAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", null, "org/jose4j/jwa/AlgorithmInfo", new String[] { "org/jose4j/jwe/ContentEncryptionAlgorithm" });

classWriter.visitInnerClass("org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm$Aes256CbcHmacSha512", "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "Aes256CbcHmacSha512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm$Aes192CbcHmacSha384", "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "Aes192CbcHmacSha384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm$Aes128CbcHmacSha256", "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "Aes128CbcHmacSha256", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IV_BYTE_LENGTH", "I", null, new Integer(16));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "hmacJavaAlgorithm", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "tagTruncationLength", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "contentEncryptionKeyDescriptor", "Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwa/AlgorithmInfo", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "setAlgorithmIdentifier", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/ContentEncryptionKeyDescriptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitLdcInsn("AES");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/ContentEncryptionKeyDescriptor", "<init>", "(ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "contentEncryptionKeyDescriptor", "Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "hmacJavaAlgorithm", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "tagTruncationLength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("AES/CBC/PKCS5Padding");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "setJavaAlgorithm", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/keys/KeyPersuasion", "SYMMETRIC", "Lorg/jose4j/keys/KeyPersuasion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "setKeyPersuasion", "(Lorg/jose4j/keys/KeyPersuasion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("AES");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "setKeyType", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHmacJavaAlgorithm", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "hmacJavaAlgorithm", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTagTruncationLength", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "tagTruncationLength", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContentEncryptionKeyDescriptor", "()Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "contentEncryptionKeyDescriptor", "Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encrypt", "([B[B[BLorg/jose4j/jwx/Headers;[BLorg/jose4j/jca/ProviderContext;)Lorg/jose4j/jwe/ContentEncryptionParts;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jca/ProviderContext", "getSecureRandom", "()Ljava/security/SecureRandom;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwe/InitializationVectorHelp", "iv", "(I[BLjava/security/SecureRandom;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "encrypt", "([B[B[B[BLorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)Lorg/jose4j/jwe/ContentEncryptionParts;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "encrypt", "([B[B[B[BLorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)Lorg/jose4j/jwe/ContentEncryptionParts;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/InvalidKeyException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/security/InvalidAlgorithmParameterException");
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label6, "javax/crypto/IllegalBlockSizeException");
methodVisitor.visitTryCatchBlock(label4, label5, label6, "javax/crypto/BadPaddingException");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/keys/HmacKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/ByteUtil", "leftHalf", "([B)[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/keys/HmacKey", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/keys/AesKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/ByteUtil", "rightHalf", "([B)[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/keys/AesKey", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwe/ContentEncryptionHelp", "getCipherProvider", "(Lorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "getJavaAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwe/CipherUtil", "getCipher", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/Cipher;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitTypeInsn(NEW, "javax/crypto/spec/IvParameterSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/crypto/spec/IvParameterSpec", "<init>", "([B)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/Cipher", "init", "(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "[B", "[B", "[B", "[B", "org/jose4j/jwx/Headers", "org/jose4j/jca/ProviderContext", "java/security/Key", "java/security/Key", "java/lang/String", "javax/crypto/Cipher"}, 1, new Object[] {"java/security/InvalidKeyException"});
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/lang/JoseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Invalid key for ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "getJavaAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/lang/JoseException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/InvalidAlgorithmParameterException"});
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/lang/JoseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/InvalidAlgorithmParameterException", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/lang/JoseException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/Cipher", "doFinal", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitLabel(label5);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/GeneralSecurityException"});
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/lang/JoseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/GeneralSecurityException", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/lang/JoseException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[B"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwe/ContentEncryptionHelp", "getMacProvider", "(Lorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "getHmacJavaAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/mac/MacUtil", "getInitializedMac", "(Ljava/lang/String;Ljava/security/Key;Ljava/lang/String;)Ljavax/crypto/Mac;", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "getAdditionalAuthenticatedDataLengthBytes", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[B");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/ByteUtil", "concat", "([[B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 15);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/Mac", "doFinal", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 16);
methodVisitor.visitVarInsn(ALOAD, 16);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "getTagTruncationLength", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/ByteUtil", "subArray", "([BII)[B", false);
methodVisitor.visitVarInsn(ASTORE, 16);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/ContentEncryptionParts");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/ContentEncryptionParts", "<init>", "([B[B[B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 17);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "decrypt", "(Lorg/jose4j/jwe/ContentEncryptionParts;[B[BLorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)[B", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/InvalidKeyException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/security/InvalidAlgorithmParameterException");
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label6, "javax/crypto/IllegalBlockSizeException");
methodVisitor.visitTryCatchBlock(label4, label5, label6, "javax/crypto/BadPaddingException");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwe/ContentEncryptionHelp", "getCipherProvider", "(Lorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwe/ContentEncryptionHelp", "getMacProvider", "(Lorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionParts", "getIv", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionParts", "getCiphertext", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionParts", "getAuthenticationTag", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "getAdditionalAuthenticatedDataLengthBytes", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[B");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/ByteUtil", "concat", "([[B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/keys/HmacKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/ByteUtil", "leftHalf", "([B)[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/keys/HmacKey", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "getHmacJavaAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/mac/MacUtil", "getInitializedMac", "(Ljava/lang/String;Ljava/security/Key;Ljava/lang/String;)Ljavax/crypto/Mac;", false);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/Mac", "doFinal", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 15);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "getTagTruncationLength", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/ByteUtil", "subArray", "([BII)[B", false);
methodVisitor.visitVarInsn(ASTORE, 15);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/ByteUtil", "secureEquals", "([B[B)Z", false);
methodVisitor.visitVarInsn(ISTORE, 16);
methodVisitor.visitVarInsn(ILOAD, 16);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/base64url/Base64Url");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/base64url/Base64Url", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 17);
methodVisitor.visitVarInsn(ALOAD, 17);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlEncode", "([B)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 18);
methodVisitor.visitVarInsn(ALOAD, 17);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlEncode", "([B)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 19);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/lang/IntegrityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Authentication tag check failed. Message=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 18);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" calculated=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/lang/IntegrityException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 17, new Object[] {"org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "org/jose4j/jwe/ContentEncryptionParts", "[B", "[B", "org/jose4j/jwx/Headers", "org/jose4j/jca/ProviderContext", "java/lang/String", "java/lang/String", "[B", "[B", "[B", "[B", "[B", "java/security/Key", "javax/crypto/Mac", "[B", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitTypeInsn(NEW, "org/jose4j/keys/AesKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/ByteUtil", "rightHalf", "([B)[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/keys/AesKey", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 17);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "getJavaAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwe/CipherUtil", "getCipher", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/Cipher;", false);
methodVisitor.visitVarInsn(ASTORE, 18);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 18);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 17);
methodVisitor.visitTypeInsn(NEW, "javax/crypto/spec/IvParameterSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/crypto/spec/IvParameterSpec", "<init>", "([B)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/Cipher", "init", "(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 19, new Object[] {"org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "org/jose4j/jwe/ContentEncryptionParts", "[B", "[B", "org/jose4j/jwx/Headers", "org/jose4j/jca/ProviderContext", "java/lang/String", "java/lang/String", "[B", "[B", "[B", "[B", "[B", "java/security/Key", "javax/crypto/Mac", "[B", Opcodes.INTEGER, "java/security/Key", "javax/crypto/Cipher"}, 1, new Object[] {"java/security/InvalidKeyException"});
methodVisitor.visitVarInsn(ASTORE, 19);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/lang/JoseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Invalid key for ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "getJavaAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/lang/JoseException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/InvalidAlgorithmParameterException"});
methodVisitor.visitVarInsn(ASTORE, 19);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/lang/JoseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/InvalidAlgorithmParameterException", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/lang/JoseException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 18);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/Cipher", "doFinal", "([B)[B", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/GeneralSecurityException"});
methodVisitor.visitVarInsn(ASTORE, 19);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/lang/JoseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/GeneralSecurityException", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/lang/JoseException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(6, 20);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getAdditionalAuthenticatedDataLengthBytes", "([B)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/ByteUtil", "bitLength", "([B)I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/ByteUtil", "getBytes", "(J)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAvailable", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "getContentEncryptionKeyDescriptor", "()Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionKeyDescriptor", "getContentEncryptionKeyByteLength", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesCbcHmacSha2ContentEncryptionAlgorithm", "getJavaAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwe/CipherStrengthSupport", "isAvailable", "(Ljava/lang/String;I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
