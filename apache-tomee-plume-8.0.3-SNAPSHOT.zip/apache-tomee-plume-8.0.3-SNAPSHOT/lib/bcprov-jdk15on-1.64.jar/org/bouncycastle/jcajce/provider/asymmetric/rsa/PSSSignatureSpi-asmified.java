package asm.org.bouncycastle.jcajce.provider.asymmetric.rsa;
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
public class PSSSignatureSpiDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", null, "java/security/SignatureSpi", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$NullPssDigest", "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "NullPssDigest", ACC_PRIVATE);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$PSSwithRSA", "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "PSSwithRSA", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA1withRSA", "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "SHA1withRSA", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA224withRSA", "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "SHA224withRSA", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA256withRSA", "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "SHA256withRSA", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA384withRSA", "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "SHA384withRSA", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA3_224withRSA", "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "SHA3_224withRSA", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA3_256withRSA", "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "SHA3_256withRSA", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA3_384withRSA", "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "SHA3_384withRSA", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA3_512withRSA", "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "SHA3_512withRSA", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA512_224withRSA", "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "SHA512_224withRSA", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA512_256withRSA", "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "SHA512_256withRSA", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA512withRSA", "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "SHA512withRSA", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$nonePSS", "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "nonePSS", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "helper", "Lorg/bouncycastle/jcajce/util/JcaJceHelper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "engineParams", "Ljava/security/AlgorithmParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "paramSpec", "Ljava/security/spec/PSSParameterSpec;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "originalSpec", "Ljava/security/spec/PSSParameterSpec;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "signer", "Lorg/bouncycastle/crypto/AsymmetricBlockCipher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "contentDigest", "Lorg/bouncycastle/crypto/Digest;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "mgfDigest", "Lorg/bouncycastle/crypto/Digest;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "saltLength", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "trailer", "B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "isRaw", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "key", "Lorg/bouncycastle/crypto/params/RSAKeyParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "pss", "Lorg/bouncycastle/crypto/signers/PSSSigner;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "isInitState", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getTrailer", "(I)B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitIntInsn(BIPUSH, -68);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("unknown trailer field");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setupContentDigest", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "isRaw", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$NullPssDigest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "mgfDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$NullPssDigest", "<init>", "(Lorg/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;Lorg/bouncycastle/crypto/Digest;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "contentDigest", "Lorg/bouncycastle/crypto/Digest;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "mgfDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "contentDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Ljava/security/spec/PSSParameterSpec;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "<init>", "(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Ljava/security/spec/PSSParameterSpec;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Ljava/security/spec/PSSParameterSpec;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/SignatureSpi", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/util/BCJcaJceHelper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/util/BCJcaJceHelper", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "helper", "Lorg/bouncycastle/jcajce/util/JcaJceHelper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "isInitState", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "signer", "Lorg/bouncycastle/crypto/AsymmetricBlockCipher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "originalSpec", "Ljava/security/spec/PSSParameterSpec;");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/security/spec/PSSParameterSpec", "DEFAULT", "Ljava/security/spec/PSSParameterSpec;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "paramSpec", "Ljava/security/spec/PSSParameterSpec;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "paramSpec", "Ljava/security/spec/PSSParameterSpec;");
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "paramSpec", "Ljava/security/spec/PSSParameterSpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/PSSParameterSpec", "getDigestAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/util/DigestFactory", "getDigest", "(Ljava/lang/String;)Lorg/bouncycastle/crypto/Digest;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "mgfDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "paramSpec", "Ljava/security/spec/PSSParameterSpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/PSSParameterSpec", "getSaltLength", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "saltLength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "paramSpec", "Ljava/security/spec/PSSParameterSpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/PSSParameterSpec", "getTrailerField", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "getTrailer", "(I)B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "trailer", "B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "isRaw", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "setupContentDigest", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineInitVerify", "(Ljava/security/PublicKey;)V", null, new String[] { "java/security/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/interfaces/RSAPublicKey");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidKeyException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Supplied key is not a RSAPublicKey instance");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidKeyException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/interfaces/RSAPublicKey");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/rsa/RSAUtil", "generatePublicKeyParameter", "(Ljava/security/interfaces/RSAPublicKey;)Lorg/bouncycastle/crypto/params/RSAKeyParameters;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "key", "Lorg/bouncycastle/crypto/params/RSAKeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/signers/PSSSigner");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "signer", "Lorg/bouncycastle/crypto/AsymmetricBlockCipher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "contentDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "mgfDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "saltLength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "trailer", "B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/signers/PSSSigner", "<init>", "(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/Digest;IB)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "pss", "Lorg/bouncycastle/crypto/signers/PSSSigner;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "pss", "Lorg/bouncycastle/crypto/signers/PSSSigner;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "key", "Lorg/bouncycastle/crypto/params/RSAKeyParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/signers/PSSSigner", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "isInitState", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineInitSign", "(Ljava/security/PrivateKey;Ljava/security/SecureRandom;)V", null, new String[] { "java/security/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/interfaces/RSAPrivateKey");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidKeyException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Supplied key is not a RSAPrivateKey instance");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidKeyException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/interfaces/RSAPrivateKey");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/rsa/RSAUtil", "generatePrivateKeyParameter", "(Ljava/security/interfaces/RSAPrivateKey;)Lorg/bouncycastle/crypto/params/RSAKeyParameters;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "key", "Lorg/bouncycastle/crypto/params/RSAKeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/signers/PSSSigner");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "signer", "Lorg/bouncycastle/crypto/AsymmetricBlockCipher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "contentDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "mgfDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "saltLength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "trailer", "B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/signers/PSSSigner", "<init>", "(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/Digest;IB)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "pss", "Lorg/bouncycastle/crypto/signers/PSSSigner;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "pss", "Lorg/bouncycastle/crypto/signers/PSSSigner;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ParametersWithRandom");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "key", "Lorg/bouncycastle/crypto/params/RSAKeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ParametersWithRandom", "<init>", "(Lorg/bouncycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/signers/PSSSigner", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "isInitState", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineInitSign", "(Ljava/security/PrivateKey;)V", null, new String[] { "java/security/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/interfaces/RSAPrivateKey");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidKeyException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Supplied key is not a RSAPrivateKey instance");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidKeyException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/interfaces/RSAPrivateKey");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/rsa/RSAUtil", "generatePrivateKeyParameter", "(Ljava/security/interfaces/RSAPrivateKey;)Lorg/bouncycastle/crypto/params/RSAKeyParameters;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "key", "Lorg/bouncycastle/crypto/params/RSAKeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/signers/PSSSigner");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "signer", "Lorg/bouncycastle/crypto/AsymmetricBlockCipher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "contentDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "mgfDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "saltLength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "trailer", "B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/signers/PSSSigner", "<init>", "(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/Digest;IB)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "pss", "Lorg/bouncycastle/crypto/signers/PSSSigner;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "pss", "Lorg/bouncycastle/crypto/signers/PSSSigner;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "key", "Lorg/bouncycastle/crypto/params/RSAKeyParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/signers/PSSSigner", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "isInitState", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineUpdate", "(B)V", null, new String[] { "java/security/SignatureException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "pss", "Lorg/bouncycastle/crypto/signers/PSSSigner;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/signers/PSSSigner", "update", "(B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "isInitState", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineUpdate", "([BII)V", null, new String[] { "java/security/SignatureException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "pss", "Lorg/bouncycastle/crypto/signers/PSSSigner;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/signers/PSSSigner", "update", "([BII)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "isInitState", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineSign", "()[B", null, new String[] { "java/security/SignatureException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/bouncycastle/crypto/CryptoException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "isInitState", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "pss", "Lorg/bouncycastle/crypto/signers/PSSSigner;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/signers/PSSSigner", "generateSignature", "()[B", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/security/SignatureException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/CryptoException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/SignatureException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineVerify", "([B)Z", null, new String[] { "java/security/SignatureException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "isInitState", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "pss", "Lorg/bouncycastle/crypto/signers/PSSSigner;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/signers/PSSSigner", "verifySignature", "([B)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineSetParameter", "(Ljava/security/spec/AlgorithmParameterSpec;)V", null, new String[] { "java/security/InvalidAlgorithmParameterException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "originalSpec", "Ljava/security/spec/PSSParameterSpec;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "originalSpec", "Ljava/security/spec/PSSParameterSpec;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "isInitState", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitTypeInsn(NEW, "java/security/ProviderException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("cannot call setParameter in the middle of update");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/ProviderException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/spec/PSSParameterSpec");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/spec/PSSParameterSpec");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "originalSpec", "Ljava/security/spec/PSSParameterSpec;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "originalSpec", "Ljava/security/spec/PSSParameterSpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/PSSParameterSpec", "getDigestAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/PSSParameterSpec", "getDigestAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/util/DigestFactory", "isSameDigest", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("parameter must be using ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "originalSpec", "Ljava/security/spec/PSSParameterSpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/PSSParameterSpec", "getDigestAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/PSSParameterSpec", "getMGFAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("MGF1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/PSSParameterSpec", "getMGFAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers", "id_mgf1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("unknown mask generation function specified");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/PSSParameterSpec", "getMGFParameters", "()Ljava/security/spec/AlgorithmParameterSpec;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/spec/MGF1ParameterSpec");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("unknown MGF parameters");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/PSSParameterSpec", "getMGFParameters", "()Ljava/security/spec/AlgorithmParameterSpec;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/spec/MGF1ParameterSpec");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/MGF1ParameterSpec", "getDigestAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/PSSParameterSpec", "getDigestAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/util/DigestFactory", "isSameDigest", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("digest algorithm for MGF should be the same as for PSS parameters.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/MGF1ParameterSpec", "getDigestAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/util/DigestFactory", "getDigest", "(Ljava/lang/String;)Lorg/bouncycastle/crypto/Digest;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label8);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("no match on MGF digest algorithm: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/MGF1ParameterSpec", "getDigestAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "engineParams", "Ljava/security/AlgorithmParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "paramSpec", "Ljava/security/spec/PSSParameterSpec;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "mgfDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "paramSpec", "Ljava/security/spec/PSSParameterSpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/PSSParameterSpec", "getSaltLength", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "saltLength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "paramSpec", "Ljava/security/spec/PSSParameterSpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/PSSParameterSpec", "getTrailerField", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "getTrailer", "(I)B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "trailer", "B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "setupContentDigest", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "key", "Lorg/bouncycastle/crypto/params/RSAKeyParameters;");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/signers/PSSSigner");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "signer", "Lorg/bouncycastle/crypto/AsymmetricBlockCipher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "contentDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "mgfDigest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "saltLength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "trailer", "B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/signers/PSSSigner", "<init>", "(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/Digest;IB)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "pss", "Lorg/bouncycastle/crypto/signers/PSSSigner;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "key", "Lorg/bouncycastle/crypto/params/RSAKeyParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/RSAKeyParameters", "isPrivate", "()Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "pss", "Lorg/bouncycastle/crypto/signers/PSSSigner;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "key", "Lorg/bouncycastle/crypto/params/RSAKeyParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/signers/PSSSigner", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "pss", "Lorg/bouncycastle/crypto/signers/PSSSigner;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "key", "Lorg/bouncycastle/crypto/params/RSAKeyParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/signers/PSSSigner", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitLabel(label9);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Only PSSParameterSpec supported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineGetParameters", "()Ljava/security/AlgorithmParameters;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "engineParams", "Ljava/security/AlgorithmParameters;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "paramSpec", "Ljava/security/spec/PSSParameterSpec;");
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "helper", "Lorg/bouncycastle/jcajce/util/JcaJceHelper;");
methodVisitor.visitLdcInsn("PSS");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jcajce/util/JcaJceHelper", "createAlgorithmParameters", "(Ljava/lang/String;)Ljava/security/AlgorithmParameters;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "engineParams", "Ljava/security/AlgorithmParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "engineParams", "Ljava/security/AlgorithmParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "paramSpec", "Ljava/security/spec/PSSParameterSpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/AlgorithmParameters", "init", "(Ljava/security/spec/AlgorithmParameterSpec;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "engineParams", "Ljava/security/AlgorithmParameters;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_DEPRECATED, "engineSetParameter", "(Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("engineSetParameter unsupported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineGetParameter", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("engineGetParameter unsupported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
