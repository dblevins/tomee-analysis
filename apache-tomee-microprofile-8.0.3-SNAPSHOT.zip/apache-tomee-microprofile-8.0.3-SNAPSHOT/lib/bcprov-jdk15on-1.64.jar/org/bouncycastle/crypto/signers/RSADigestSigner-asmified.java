package asm.org.bouncycastle.crypto.signers;
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
public class RSADigestSignerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/crypto/signers/RSADigestSigner", null, "java/lang/Object", new String[] { "org/bouncycastle/crypto/Signer" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "rsaEngine", "Lorg/bouncycastle/crypto/AsymmetricBlockCipher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "algId", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "digest", "Lorg/bouncycastle/crypto/Digest;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "forSigning", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "oidMap", "Ljava/util/Hashtable;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/crypto/Digest;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getAlgorithmName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/signers/RSADigestSigner", "<init>", "(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/encodings/PKCS1Encoding");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/engines/RSABlindedEngine");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/engines/RSABlindedEngine", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/encodings/PKCS1Encoding", "<init>", "(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "rsaEngine", "Lorg/bouncycastle/crypto/AsymmetricBlockCipher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x509/AlgorithmIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/DERNull", "INSTANCE", "Lorg/bouncycastle/asn1/DERNull;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x509/AlgorithmIdentifier", "<init>", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "algId", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "algId", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "getAlgorithmName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getAlgorithmName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("withRSA");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "forSigning", "Z");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/params/ParametersWithRandom");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ParametersWithRandom");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ParametersWithRandom", "getParameters", "()Lorg/bouncycastle/crypto/CipherParameters;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/AsymmetricKeyParameter");
methodVisitor.visitVarInsn(ASTORE, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/AsymmetricKeyParameter");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/AsymmetricKeyParameter", "isPrivate", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("signing requires private key");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/AsymmetricKeyParameter", "isPrivate", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("verification requires public key");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/signers/RSADigestSigner", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "rsaEngine", "Lorg/bouncycastle/crypto/AsymmetricBlockCipher;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/AsymmetricBlockCipher", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "update", "(B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "update", "(B)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "update", "([BII)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "update", "([BII)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generateSignature", "()[B", null, new String[] { "org/bouncycastle/crypto/CryptoException", "org/bouncycastle/crypto/DataLengthException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "forSigning", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RSADigestSigner not initialised for signature generation.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getDigestSize", "()I", true);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "doFinal", "([BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/signers/RSADigestSigner", "derEncode", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "rsaEngine", "Lorg/bouncycastle/crypto/AsymmetricBlockCipher;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/AsymmetricBlockCipher", "processBlock", "([BII)[B", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/CryptoException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("unable to encode signature: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/IOException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/CryptoException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "verifySignature", "([B)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "forSigning", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RSADigestSigner not initialised for verification");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getDigestSize", "()I", true);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "doFinal", "([BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "rsaEngine", "Lorg/bouncycastle/crypto/AsymmetricBlockCipher;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/AsymmetricBlockCipher", "processBlock", "([BII)[B", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/signers/RSADigestSigner", "derEncode", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Arrays", "constantTimeAreEqual", "([B[B)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISUB);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(DUP2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(DUP2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 8);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label8);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitIincInsn(8, 1);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 8);
Label label9 = new Label();
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label10);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitIincInsn(8, 1);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNE, label11);
methodVisitor.visitInsn(ICONST_1);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label12);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Arrays", "constantTimeAreEqual", "([B[B)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "reset", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "derEncode", "([B)[B", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalArgumentException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "algId", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/DigestInfo", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/DigestInfo;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("malformed DigestInfo for NONEwithRSA hash: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/IllegalArgumentException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x509/DigestInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/RSADigestSigner", "algId", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x509/DigestInfo", "<init>", "(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("DER");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/DigestInfo", "getEncoded", "(Ljava/lang/String;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("RIPEMD128");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "ripemd128", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("RIPEMD160");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "ripemd160", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("RIPEMD256");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "ripemd256", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("SHA-1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x509/X509ObjectIdentifiers", "id_SHA1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("SHA-224");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_sha224", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("SHA-256");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_sha256", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("SHA-384");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_sha384", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("SHA-512");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_sha512", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("SHA-512/224");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_sha512_224", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("SHA-512/256");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_sha512_256", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("SHA3-224");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_sha3_224", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("SHA3-256");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_sha3_256", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("SHA3-384");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_sha3_384", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("SHA3-512");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_sha3_512", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("MD2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers", "md2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("MD4");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers", "md4", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/RSADigestSigner", "oidMap", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("MD5");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers", "md5", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
