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
public class AesGcmContentEncryptionAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", null, "org/jose4j/jwa/AlgorithmInfo", new String[] { "org/jose4j/jwe/ContentEncryptionAlgorithm" });

classWriter.visitInnerClass("org/jose4j/jwe/AesGcmContentEncryptionAlgorithm$Aes128Gcm", "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "Aes128Gcm", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesGcmContentEncryptionAlgorithm$Aes192Gcm", "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "Aes192Gcm", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesGcmContentEncryptionAlgorithm$Aes256Gcm", "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "Aes256Gcm", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/SimpleAeadCipher$CipherOutput", "org/jose4j/jwe/SimpleAeadCipher", "CipherOutput", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "IV_BYTE_LENGTH", "I", null, new Integer(12));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TAG_BYTE_LENGTH", "I", null, new Integer(16));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "contentEncryptionKeyDescriptor", "Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "simpleAeadCipher", "Lorg/jose4j/jwe/SimpleAeadCipher;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwa/AlgorithmInfo", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "setAlgorithmIdentifier", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("AES/GCM/NoPadding");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "setJavaAlgorithm", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/keys/KeyPersuasion", "SYMMETRIC", "Lorg/jose4j/keys/KeyPersuasion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "setKeyPersuasion", "(Lorg/jose4j/keys/KeyPersuasion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("AES");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "setKeyType", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/ContentEncryptionKeyDescriptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/ByteUtil", "byteLength", "(I)I", false);
methodVisitor.visitLdcInsn("AES");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/ContentEncryptionKeyDescriptor", "<init>", "(ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "contentEncryptionKeyDescriptor", "Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/SimpleAeadCipher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "getJavaAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/SimpleAeadCipher", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "simpleAeadCipher", "Lorg/jose4j/jwe/SimpleAeadCipher;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContentEncryptionKeyDescriptor", "()Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "contentEncryptionKeyDescriptor", "Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encrypt", "([B[B[BLorg/jose4j/jwx/Headers;[BLorg/jose4j/jca/ProviderContext;)Lorg/jose4j/jwe/ContentEncryptionParts;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jca/ProviderContext", "getSecureRandom", "()Ljava/security/SecureRandom;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwe/InitializationVectorHelp", "iv", "(I[BLjava/security/SecureRandom;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwe/ContentEncryptionHelp", "getCipherProvider", "(Lorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "encrypt", "([B[B[B[BLjava/lang/String;)Lorg/jose4j/jwe/ContentEncryptionParts;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encrypt", "([B[B[B[BLjava/lang/String;)Lorg/jose4j/jwe/ContentEncryptionParts;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/jose4j/keys/AesKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/keys/AesKey", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "simpleAeadCipher", "Lorg/jose4j/jwe/SimpleAeadCipher;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/SimpleAeadCipher", "encrypt", "(Ljava/security/Key;[B[B[BLjava/lang/String;)Lorg/jose4j/jwe/SimpleAeadCipher$CipherOutput;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/ContentEncryptionParts");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/SimpleAeadCipher$CipherOutput", "getCiphertext", "()[B", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/SimpleAeadCipher$CipherOutput", "getTag", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/ContentEncryptionParts", "<init>", "([B[B[B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "decrypt", "(Lorg/jose4j/jwe/ContentEncryptionParts;[B[BLorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)[B", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionParts", "getIv", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/keys/AesKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/keys/AesKey", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionParts", "getCiphertext", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionParts", "getAuthenticationTag", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwe/ContentEncryptionHelp", "getCipherProvider", "(Lorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "simpleAeadCipher", "Lorg/jose4j/jwe/SimpleAeadCipher;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/SimpleAeadCipher", "decrypt", "(Ljava/security/Key;[B[B[B[BLjava/lang/String;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAvailable", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "getContentEncryptionKeyDescriptor", "()Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionKeyDescriptor", "getContentEncryptionKeyByteLength", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "simpleAeadCipher", "Lorg/jose4j/jwe/SimpleAeadCipher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesGcmContentEncryptionAlgorithm", "getAlgorithmIdentifier", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/SimpleAeadCipher", "isAvailable", "(Lorg/slf4j/Logger;IILjava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
