package asm.org.bouncycastle.pqc.crypto.mceliece;
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
public class McElieceKobaraImaiCipherDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", null, "java/lang/Object", new String[] { "org/bouncycastle/pqc/crypto/MessageEncryptor" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OID", "Ljava/lang/String;", null, "1.3.6.1.4.1.8301.3.1.3.4.2.3");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_PRNG_NAME", "Ljava/lang/String;", null, "SHA1PRNG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PUBLIC_CONSTANT", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "messDigest", "Lorg/bouncycastle/crypto/Digest;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sr", "Ljava/security/SecureRandom;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "key", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2KeyParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "n", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "k", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "t", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "forEncryption", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "forEncryption", "Z");
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/params/ParametersWithRandom");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ParametersWithRandom");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ParametersWithRandom", "getRandom", "()Ljava/security/SecureRandom;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "sr", "Ljava/security/SecureRandom;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ParametersWithRandom", "getParameters", "()Lorg/bouncycastle/crypto/CipherParameters;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PublicKeyParameters");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "key", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2KeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "key", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2KeyParameters;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PublicKeyParameters");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "initCipherEncrypt", "(Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PublicKeyParameters;)V", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/CryptoServicesRegistrar", "getSecureRandom", "()Ljava/security/SecureRandom;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "sr", "Ljava/security/SecureRandom;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PublicKeyParameters");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "key", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2KeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "key", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2KeyParameters;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PublicKeyParameters");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "initCipherEncrypt", "(Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PublicKeyParameters;)V", false);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "key", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2KeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "key", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2KeyParameters;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "initCipherDecrypt", "(Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKeySize", "(Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2KeyParameters;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PublicKeyParameters");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PublicKeyParameters");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PublicKeyParameters", "getN", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "getN", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("unsupported type");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "initCipherEncrypt", "(Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PublicKeyParameters;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PublicKeyParameters", "getDigest", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/mceliece/Utils", "getDigest", "(Ljava/lang/String;)Lorg/bouncycastle/crypto/Digest;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "messDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PublicKeyParameters", "getN", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "n", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PublicKeyParameters", "getK", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "k", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PublicKeyParameters", "getT", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "t", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "initCipherDecrypt", "(Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "getDigest", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/mceliece/Utils", "getDigest", "(Ljava/lang/String;)Lorg/bouncycastle/crypto/Digest;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "messDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "getN", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "n", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "getK", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "k", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "getT", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "t", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "messageEncrypt", "([B)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "forEncryption", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("cipher initialised for decryption");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "messDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getDigestSize", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "k", "I");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "n", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "t", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/math/linearalgebra/IntegerFunctions", "binomial", "(II)Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "bitLength", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "PUBLIC_CONSTANT", "[B");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "PUBLIC_CONSTANT", "[B");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "PUBLIC_CONSTANT", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "PUBLIC_CONSTANT", "[B");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "sr", "Ljava/security/SecureRandom;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/SecureRandom", "nextBytes", "([B)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/prng/DigestRandomGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/digests/SHA1Digest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/digests/SHA1Digest", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/prng/DigestRandomGenerator", "<init>", "(Lorg/bouncycastle/crypto/Digest;)V", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/prng/DigestRandomGenerator", "addSeedMaterial", "([B)V", false);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/prng/DigestRandomGenerator", "nextBytes", "([B)V", false);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 12);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 12);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFLT, label3);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitInsn(DUP2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitIincInsn(12, -1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "messDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getDigestSize", "()I", true);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "messDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "update", "([BII)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "messDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "doFinal", "([BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 13);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ILOAD, 13);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFLT, label5);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitInsn(DUP2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitIincInsn(13, -1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/math/linearalgebra/ByteUtils", "concatenate", "([B[B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFLE, label6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 15);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 16);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 16);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "k", "I");
methodVisitor.visitVarInsn(ALOAD, 16);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/math/linearalgebra/GF2Vector", "OS2VP", "(I[B)Lorg/bouncycastle/pqc/math/linearalgebra/GF2Vector;", false);
methodVisitor.visitVarInsn(ASTORE, 17);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "n", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "t", "I");
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/mceliece/Conversions", "encode", "(II[B)Lorg/bouncycastle/pqc/math/linearalgebra/GF2Vector;", false);
methodVisitor.visitVarInsn(ASTORE, 18);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "key", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2KeyParameters;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PublicKeyParameters");
methodVisitor.visitVarInsn(ALOAD, 17);
methodVisitor.visitVarInsn(ALOAD, 18);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2Primitives", "encryptionPrimitive", "(Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PublicKeyParameters;Lorg/bouncycastle/pqc/math/linearalgebra/GF2Vector;Lorg/bouncycastle/pqc/math/linearalgebra/GF2Vector;)Lorg/bouncycastle/pqc/math/linearalgebra/GF2Vector;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/math/linearalgebra/GF2Vector", "getEncoded", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 19);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFLE, label7);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/math/linearalgebra/ByteUtils", "concatenate", "([B[B)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 20);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "messageDecrypt", "([B)[B", null, new String[] { "org/bouncycastle/crypto/InvalidCipherTextException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "forEncryption", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("cipher initialised for decryption");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "n", "I");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/InvalidCipherTextException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Bad Padding: Ciphertext too short.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/InvalidCipherTextException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "messDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getDigestSize", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "k", "I");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFLE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/math/linearalgebra/ByteUtils", "split", "([BI)[[B", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "n", "I");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/math/linearalgebra/GF2Vector", "OS2VP", "(I[B)Lorg/bouncycastle/pqc/math/linearalgebra/GF2Vector;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "key", "Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2KeyParameters;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2Primitives", "decryptionPrimitive", "(Lorg/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters;Lorg/bouncycastle/pqc/math/linearalgebra/GF2Vector;)[Lorg/bouncycastle/pqc/math/linearalgebra/GF2Vector;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/math/linearalgebra/GF2Vector", "getEncoded", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label4);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/math/linearalgebra/ByteUtils", "subArray", "([BII)[B", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "n", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "t", "I");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/mceliece/Conversions", "decode", "(IILorg/bouncycastle/pqc/math/linearalgebra/GF2Vector;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/math/linearalgebra/ByteUtils", "concatenate", "([B[B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/math/linearalgebra/ByteUtils", "concatenate", "([B[B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/math/linearalgebra/ByteUtils", "split", "([BI)[[B", false);
methodVisitor.visitVarInsn(ASTORE, 15);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 16);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 17);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "messDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getDigestSize", "()I", true);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 18);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "messDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 17);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 17);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "update", "([BII)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "messDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 18);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "doFinal", "([BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 19);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ILOAD, 19);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFLT, label6);
methodVisitor.visitVarInsn(ALOAD, 18);
methodVisitor.visitVarInsn(ILOAD, 19);
methodVisitor.visitInsn(DUP2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 16);
methodVisitor.visitVarInsn(ILOAD, 19);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitIincInsn(19, -1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/prng/DigestRandomGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/digests/SHA1Digest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/digests/SHA1Digest", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/prng/DigestRandomGenerator", "<init>", "(Lorg/bouncycastle/crypto/Digest;)V", false);
methodVisitor.visitVarInsn(ASTORE, 19);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(ALOAD, 18);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/prng/DigestRandomGenerator", "addSeedMaterial", "([B)V", false);
methodVisitor.visitVarInsn(ILOAD, 14);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 20);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(ALOAD, 20);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/prng/DigestRandomGenerator", "nextBytes", "([B)V", false);
methodVisitor.visitVarInsn(ILOAD, 14);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 21);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ILOAD, 21);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFLT, label8);
methodVisitor.visitVarInsn(ALOAD, 20);
methodVisitor.visitVarInsn(ILOAD, 21);
methodVisitor.visitInsn(DUP2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 17);
methodVisitor.visitVarInsn(ILOAD, 21);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitIincInsn(21, -1);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ALOAD, 20);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ILOAD, 14);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label9);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/InvalidCipherTextException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Bad Padding: invalid ciphertext");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/InvalidCipherTextException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ALOAD, 20);
methodVisitor.visitVarInsn(ILOAD, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "PUBLIC_CONSTANT", "[B");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/math/linearalgebra/ByteUtils", "split", "([BI)[[B", false);
methodVisitor.visitVarInsn(ASTORE, 21);
methodVisitor.visitVarInsn(ALOAD, 21);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 22);
methodVisitor.visitVarInsn(ALOAD, 21);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 23);
methodVisitor.visitVarInsn(ALOAD, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "PUBLIC_CONSTANT", "[B");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/math/linearalgebra/ByteUtils", "equals", "([B[B)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNE, label10);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/InvalidCipherTextException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Bad Padding: invalid ciphertext");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/InvalidCipherTextException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 22);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 24);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("a predetermined public constant");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "()[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/pqc/crypto/mceliece/McElieceKobaraImaiCipher", "PUBLIC_CONSTANT", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
