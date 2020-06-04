package asm.org.bouncycastle.jcajce.provider.asymmetric.elgamal;
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
public class KeyPairGeneratorSpiDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", null, "java/security/KeyPairGenerator", null);

{
fieldVisitor = classWriter.visitField(0, "param", "Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "engine", "Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "strength", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "certainty", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "random", "Ljava/security/SecureRandom;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "initialised", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ElGamal");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/KeyPairGenerator", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/generators/ElGamalKeyPairGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/generators/ElGamalKeyPairGenerator", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "engine", "Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "strength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "certainty", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/CryptoServicesRegistrar", "getSecureRandom", "()Ljava/security/SecureRandom;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "random", "Ljava/security/SecureRandom;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "initialised", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(ILjava/security/SecureRandom;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "strength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "random", "Ljava/security/SecureRandom;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V", null, new String[] { "java/security/InvalidAlgorithmParameterException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jce/spec/ElGamalParameterSpec");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/crypto/spec/DHParameterSpec");
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("parameter object not a DHParameterSpec or an ElGamalParameterSpec");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jce/spec/ElGamalParameterSpec");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jce/spec/ElGamalParameterSpec");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ElGamalKeyGenerationParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ElGamalParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/spec/ElGamalParameterSpec", "getP", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/spec/ElGamalParameterSpec", "getG", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ElGamalParameters", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ElGamalKeyGenerationParameters", "<init>", "(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/params/ElGamalParameters;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "param", "Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/crypto/spec/DHParameterSpec");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ElGamalKeyGenerationParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ElGamalParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHParameterSpec", "getP", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHParameterSpec", "getG", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHParameterSpec", "getL", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ElGamalParameters", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ElGamalKeyGenerationParameters", "<init>", "(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/params/ElGamalParameters;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "param", "Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;");
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "engine", "Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "param", "Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/generators/ElGamalKeyPairGenerator", "init", "(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "initialised", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generateKeyPair", "()Ljava/security/KeyPair;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "initialised", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jce/provider/BouncyCastleProvider", "CONFIGURATION", "Lorg/bouncycastle/jcajce/provider/config/ProviderConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "strength", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jcajce/provider/config/ProviderConfiguration", "getDHDefaultParameters", "(I)Ljavax/crypto/spec/DHParameterSpec;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ElGamalKeyGenerationParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "random", "Ljava/security/SecureRandom;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ElGamalParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHParameterSpec", "getP", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHParameterSpec", "getG", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHParameterSpec", "getL", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ElGamalParameters", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ElGamalKeyGenerationParameters", "<init>", "(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/params/ElGamalParameters;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "param", "Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/generators/ElGamalParametersGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/generators/ElGamalParametersGenerator", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "strength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "certainty", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "random", "Ljava/security/SecureRandom;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/generators/ElGamalParametersGenerator", "init", "(IILjava/security/SecureRandom;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ElGamalKeyGenerationParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "random", "Ljava/security/SecureRandom;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/generators/ElGamalParametersGenerator", "generateParameters", "()Lorg/bouncycastle/crypto/params/ElGamalParameters;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ElGamalKeyGenerationParameters", "<init>", "(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/params/ElGamalParameters;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "param", "Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;");
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "engine", "Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "param", "Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/generators/ElGamalKeyPairGenerator", "init", "(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "initialised", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi", "engine", "Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/generators/ElGamalKeyPairGenerator", "generateKeyPair", "()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/AsymmetricCipherKeyPair", "getPublic", "()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ElGamalPublicKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/AsymmetricCipherKeyPair", "getPrivate", "()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ElGamalPrivateKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/security/KeyPair");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/BCElGamalPublicKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/BCElGamalPublicKey", "<init>", "(Lorg/bouncycastle/crypto/params/ElGamalPublicKeyParameters;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/BCElGamalPrivateKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/BCElGamalPrivateKey", "<init>", "(Lorg/bouncycastle/crypto/params/ElGamalPrivateKeyParameters;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/KeyPair", "<init>", "(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
