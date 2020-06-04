package asm.org.bouncycastle.pqc.jcajce.provider.newhope;
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
public class NHKeyPairGeneratorSpiDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/pqc/jcajce/provider/newhope/NHKeyPairGeneratorSpi", null, "java/security/KeyPairGenerator", null);

{
fieldVisitor = classWriter.visitField(0, "engine", "Lorg/bouncycastle/pqc/crypto/newhope/NHKeyPairGenerator;", null, null);
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
methodVisitor.visitLdcInsn("NH");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/KeyPairGenerator", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/newhope/NHKeyPairGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/newhope/NHKeyPairGenerator", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/NHKeyPairGeneratorSpi", "engine", "Lorg/bouncycastle/pqc/crypto/newhope/NHKeyPairGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/CryptoServicesRegistrar", "getSecureRandom", "()Ljava/security/SecureRandom;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/NHKeyPairGeneratorSpi", "random", "Ljava/security/SecureRandom;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/NHKeyPairGeneratorSpi", "initialised", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(ILjava/security/SecureRandom;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(SIPUSH, 1024);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("strength must be 1024 bits");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/NHKeyPairGeneratorSpi", "engine", "Lorg/bouncycastle/pqc/crypto/newhope/NHKeyPairGenerator;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/KeyGenerationParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/KeyGenerationParameters", "<init>", "(Ljava/security/SecureRandom;I)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/newhope/NHKeyPairGenerator", "init", "(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/NHKeyPairGeneratorSpi", "initialised", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V", null, new String[] { "java/security/InvalidAlgorithmParameterException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("parameter object not recognised");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generateKeyPair", "()Ljava/security/KeyPair;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/NHKeyPairGeneratorSpi", "initialised", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/NHKeyPairGeneratorSpi", "engine", "Lorg/bouncycastle/pqc/crypto/newhope/NHKeyPairGenerator;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/KeyGenerationParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/NHKeyPairGeneratorSpi", "random", "Ljava/security/SecureRandom;");
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/KeyGenerationParameters", "<init>", "(Ljava/security/SecureRandom;I)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/newhope/NHKeyPairGenerator", "init", "(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/NHKeyPairGeneratorSpi", "initialised", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/NHKeyPairGeneratorSpi", "engine", "Lorg/bouncycastle/pqc/crypto/newhope/NHKeyPairGenerator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/newhope/NHKeyPairGenerator", "generateKeyPair", "()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/AsymmetricCipherKeyPair", "getPublic", "()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/newhope/NHPublicKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/AsymmetricCipherKeyPair", "getPrivate", "()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/newhope/NHPrivateKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/security/KeyPair");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/jcajce/provider/newhope/BCNHPublicKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/jcajce/provider/newhope/BCNHPublicKey", "<init>", "(Lorg/bouncycastle/pqc/crypto/newhope/NHPublicKeyParameters;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/jcajce/provider/newhope/BCNHPrivateKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/jcajce/provider/newhope/BCNHPrivateKey", "<init>", "(Lorg/bouncycastle/pqc/crypto/newhope/NHPrivateKeyParameters;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/KeyPair", "<init>", "(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
