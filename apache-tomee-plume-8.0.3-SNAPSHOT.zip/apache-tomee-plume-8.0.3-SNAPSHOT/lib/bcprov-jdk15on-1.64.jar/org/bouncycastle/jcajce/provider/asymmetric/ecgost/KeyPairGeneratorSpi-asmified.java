package asm.org.bouncycastle.jcajce.provider.asymmetric.ecgost;
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

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", null, "java/security/KeyPairGenerator", null);

{
fieldVisitor = classWriter.visitField(0, "ecParams", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "engine", "Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "algorithm", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "param", "Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "strength", "I", null, null);
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
methodVisitor.visitLdcInsn("ECGOST3410");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/KeyPairGenerator", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "ecParams", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/generators/ECKeyPairGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/generators/ECKeyPairGenerator", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "engine", "Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ECGOST3410");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "algorithm", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 239);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "strength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "random", "Ljava/security/SecureRandom;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "initialised", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(ILjava/security/SecureRandom;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "strength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "random", "Ljava/security/SecureRandom;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "ecParams", "Ljava/lang/Object;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "ecParams", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/spec/ECGenParameterSpec");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "initialize", "(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("key size not configurable.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("unknown key size.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V", null, new String[] { "java/security/InvalidAlgorithmParameterException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jcajce/spec/GOST3410ParameterSpec");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jcajce/spec/GOST3410ParameterSpec");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "init", "(Lorg/bouncycastle/jcajce/spec/GOST3410ParameterSpec;Ljava/security/SecureRandom;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jce/spec/ECParameterSpec");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jce/spec/ECParameterSpec");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "ecParams", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ECKeyGenerationParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ECDomainParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/spec/ECParameterSpec", "getCurve", "()Lorg/bouncycastle/math/ec/ECCurve;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/spec/ECParameterSpec", "getG", "()Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/spec/ECParameterSpec", "getN", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/spec/ECParameterSpec", "getH", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ECDomainParameters", "<init>", "(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ECKeyGenerationParameters", "<init>", "(Lorg/bouncycastle/crypto/params/ECDomainParameters;Ljava/security/SecureRandom;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "param", "Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "engine", "Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "param", "Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/generators/ECKeyPairGenerator", "init", "(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "initialised", "Z");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/spec/ECParameterSpec");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/spec/ECParameterSpec");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "ecParams", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/ECParameterSpec", "getCurve", "()Ljava/security/spec/EllipticCurve;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/util/EC5Util", "convertCurve", "(Ljava/security/spec/EllipticCurve;)Lorg/bouncycastle/math/ec/ECCurve;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/ECParameterSpec", "getGenerator", "()Ljava/security/spec/ECPoint;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/util/EC5Util", "convertPoint", "(Lorg/bouncycastle/math/ec/ECCurve;Ljava/security/spec/ECPoint;)Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ECKeyGenerationParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ECDomainParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/ECParameterSpec", "getOrder", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/ECParameterSpec", "getCofactor", "()I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/math/BigInteger", "valueOf", "(J)Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ECDomainParameters", "<init>", "(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ECKeyGenerationParameters", "<init>", "(Lorg/bouncycastle/crypto/params/ECDomainParameters;Ljava/security/SecureRandom;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "param", "Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "engine", "Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "param", "Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/generators/ECKeyPairGenerator", "init", "(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "initialised", "Z");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/spec/ECGenParameterSpec");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/spec/ECGenParameterSpec");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/spec/ECGenParameterSpec");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/ECGenParameterSpec", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/spec/ECNamedCurveGenParameterSpec", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/spec/GOST3410ParameterSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/spec/GOST3410ParameterSpec", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "init", "(Lorg/bouncycastle/jcajce/spec/GOST3410ParameterSpec;Ljava/security/SecureRandom;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jce/provider/BouncyCastleProvider", "CONFIGURATION", "Lorg/bouncycastle/jcajce/provider/config/ProviderConfiguration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jcajce/provider/config/ProviderConfiguration", "getEcImplicitlyCa", "()Lorg/bouncycastle/jce/spec/ECParameterSpec;", true);
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jce/provider/BouncyCastleProvider", "CONFIGURATION", "Lorg/bouncycastle/jcajce/provider/config/ProviderConfiguration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jcajce/provider/config/ProviderConfiguration", "getEcImplicitlyCa", "()Lorg/bouncycastle/jce/spec/ECParameterSpec;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "ecParams", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ECKeyGenerationParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ECDomainParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/spec/ECParameterSpec", "getCurve", "()Lorg/bouncycastle/math/ec/ECCurve;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/spec/ECParameterSpec", "getG", "()Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/spec/ECParameterSpec", "getN", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/spec/ECParameterSpec", "getH", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ECDomainParameters", "<init>", "(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ECKeyGenerationParameters", "<init>", "(Lorg/bouncycastle/crypto/params/ECDomainParameters;Ljava/security/SecureRandom;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "param", "Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "engine", "Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "param", "Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/generators/ECKeyPairGenerator", "init", "(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "initialised", "Z");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jce/provider/BouncyCastleProvider", "CONFIGURATION", "Lorg/bouncycastle/jcajce/provider/config/ProviderConfiguration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jcajce/provider/config/ProviderConfiguration", "getEcImplicitlyCa", "()Lorg/bouncycastle/jce/spec/ECParameterSpec;", true);
methodVisitor.visitJumpInsn(IFNONNULL, label9);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("null parameter passed but no implicitCA set");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("parameter object not a ECParameterSpec: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(10, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "init", "(Lorg/bouncycastle/jcajce/spec/GOST3410ParameterSpec;Ljava/security/SecureRandom;)V", null, new String[] { "java/security/InvalidAlgorithmParameterException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/GOST3410ParameterSpec", "getPublicKeyParamSet", "()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/cryptopro/ECGOST3410NamedCurves", "getByOID", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/crypto/params/ECDomainParameters;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("unknown curve: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/GOST3410ParameterSpec", "getPublicKeyParamSet", "()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jce/spec/ECNamedCurveSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/GOST3410ParameterSpec", "getPublicKeyParamSet", "()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/cryptopro/ECGOST3410NamedCurves", "getName", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECDomainParameters", "getCurve", "()Lorg/bouncycastle/math/ec/ECCurve;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECDomainParameters", "getG", "()Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECDomainParameters", "getN", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECDomainParameters", "getH", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECDomainParameters", "getSeed", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/spec/ECNamedCurveSpec", "<init>", "(Ljava/lang/String;Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "ecParams", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ECKeyGenerationParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ECGOST3410Parameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ECNamedDomainParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/GOST3410ParameterSpec", "getPublicKeyParamSet", "()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ECNamedDomainParameters", "<init>", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/GOST3410ParameterSpec", "getPublicKeyParamSet", "()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/GOST3410ParameterSpec", "getDigestParamSet", "()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/GOST3410ParameterSpec", "getEncryptionParamSet", "()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ECGOST3410Parameters", "<init>", "(Lorg/bouncycastle/crypto/params/ECDomainParameters;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ECKeyGenerationParameters", "<init>", "(Lorg/bouncycastle/crypto/params/ECDomainParameters;Ljava/security/SecureRandom;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "param", "Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "engine", "Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "param", "Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/generators/ECKeyPairGenerator", "init", "(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "initialised", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generateKeyPair", "()Ljava/security/KeyPair;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "initialised", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EC Key Pair Generator not initialised");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "engine", "Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/generators/ECKeyPairGenerator", "generateKeyPair", "()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/AsymmetricCipherKeyPair", "getPublic", "()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPublicKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/AsymmetricCipherKeyPair", "getPrivate", "()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPrivateKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "ecParams", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jce/spec/ECParameterSpec");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "ecParams", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jce/spec/ECParameterSpec");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/BCECGOST3410PublicKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "algorithm", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/BCECGOST3410PublicKey", "<init>", "(Ljava/lang/String;Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;Lorg/bouncycastle/jce/spec/ECParameterSpec;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "java/security/KeyPair");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/BCECGOST3410PrivateKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "algorithm", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/BCECGOST3410PrivateKey", "<init>", "(Ljava/lang/String;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost/BCECGOST3410PublicKey;Lorg/bouncycastle/jce/spec/ECParameterSpec;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/KeyPair", "<init>", "(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "ecParams", "Ljava/lang/Object;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitTypeInsn(NEW, "java/security/KeyPair");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/BCECGOST3410PublicKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "algorithm", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/BCECGOST3410PublicKey", "<init>", "(Ljava/lang/String;Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/BCECGOST3410PrivateKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "algorithm", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/BCECGOST3410PrivateKey", "<init>", "(Ljava/lang/String;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/KeyPair", "<init>", "(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "ecParams", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/spec/ECParameterSpec");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/BCECGOST3410PublicKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "algorithm", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/BCECGOST3410PublicKey", "<init>", "(Ljava/lang/String;Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;Ljava/security/spec/ECParameterSpec;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "java/security/KeyPair");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/BCECGOST3410PrivateKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyPairGeneratorSpi", "algorithm", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/ecgost/BCECGOST3410PrivateKey", "<init>", "(Ljava/lang/String;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost/BCECGOST3410PublicKey;Ljava/security/spec/ECParameterSpec;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/KeyPair", "<init>", "(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
