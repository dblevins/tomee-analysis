package asm.org.bouncycastle.pqc.jcajce.provider.mceliece;
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
public class McEliecePKCSCipherSpiDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi", null, "org/bouncycastle/pqc/jcajce/provider/util/AsymmetricBlockCipher", new String[] { "org/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers", "org/bouncycastle/asn1/x509/X509ObjectIdentifiers" });

classWriter.visitInnerClass("org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi$McEliecePKCS", "org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi", "McEliecePKCS", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cipher", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCipher;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCipher;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/jcajce/provider/util/AsymmetricBlockCipher", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi", "cipher", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCipher;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initCipherEncrypt", "(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V", null, new String[] { "java/security/InvalidKeyException", "java/security/InvalidAlgorithmParameterException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/PublicKey");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/jcajce/provider/mceliece/McElieceKeysToParams", "generatePublicKeyParameter", "(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ParametersWithRandom");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ParametersWithRandom", "<init>", "(Lorg/bouncycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi", "cipher", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCipher;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCipher", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi", "cipher", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCipher;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCipher", "maxPlainTextSize", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi", "maxPlainTextSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi", "cipher", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCipher;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCipher", "cipherTextSize", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi", "cipherTextSize", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initCipherDecrypt", "(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V", null, new String[] { "java/security/InvalidKeyException", "java/security/InvalidAlgorithmParameterException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/PrivateKey");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/jcajce/provider/mceliece/McElieceKeysToParams", "generatePrivateKeyParameter", "(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi", "cipher", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCipher;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCipher", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi", "cipher", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCipher;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCipher", "maxPlainTextSize", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi", "maxPlainTextSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi", "cipher", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCipher;");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCipher", "cipherTextSize", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi", "cipherTextSize", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "messageEncrypt", "([B)[B", null, new String[] { "javax/crypto/IllegalBlockSizeException", "javax/crypto/BadPaddingException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi", "cipher", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCipher;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCipher", "messageEncrypt", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "printStackTrace", "()V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "messageDecrypt", "([B)[B", null, new String[] { "javax/crypto/IllegalBlockSizeException", "javax/crypto/BadPaddingException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi", "cipher", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCipher;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCipher", "messageDecrypt", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "printStackTrace", "()V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("McEliecePKCS");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKeySize", "(Ljava/security/Key;)I", null, new String[] { "java/security/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/PublicKey");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/PublicKey");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/jcajce/provider/mceliece/McElieceKeysToParams", "generatePublicKeyParameter", "(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/mceliece/McElieceKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/PrivateKey");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/jcajce/provider/mceliece/McElieceKeysToParams", "generatePrivateKeyParameter", "(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/mceliece/McElieceKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/mceliece/McEliecePKCSCipherSpi", "cipher", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCipher;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCipher", "getKeySize", "(Lorg/bouncycastle/pqc/crypto/mceliece/McElieceKeyParameters;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
