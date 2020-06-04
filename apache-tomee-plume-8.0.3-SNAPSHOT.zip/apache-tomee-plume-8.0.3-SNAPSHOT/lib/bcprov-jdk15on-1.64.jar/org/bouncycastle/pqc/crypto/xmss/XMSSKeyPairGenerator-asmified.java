package asm.org.bouncycastle.pqc.crypto.xmss;
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
public class XMSSKeyPairGeneratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/bouncycastle/pqc/crypto/xmss/XMSSKeyPairGenerator", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/pqc/crypto/xmss/OTSHashAddress$Builder", "org/bouncycastle/pqc/crypto/xmss/OTSHashAddress", "Builder", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder", "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters", "Builder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/pqc/crypto/xmss/XMSSPublicKeyParameters$Builder", "org/bouncycastle/pqc/crypto/xmss/XMSSPublicKeyParameters", "Builder", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "params", "Lorg/bouncycastle/pqc/crypto/xmss/XMSSParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "prng", "Ljava/security/SecureRandom;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/xmss/XMSSKeyGenerationParameters");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSKeyGenerationParameters", "getRandom", "()Ljava/security/SecureRandom;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/xmss/XMSSKeyPairGenerator", "prng", "Ljava/security/SecureRandom;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSKeyGenerationParameters", "getParameters", "()Lorg/bouncycastle/pqc/crypto/xmss/XMSSParameters;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/xmss/XMSSKeyPairGenerator", "params", "Lorg/bouncycastle/pqc/crypto/xmss/XMSSParameters;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generateKeyPair", "()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/xmss/XMSSKeyPairGenerator", "params", "Lorg/bouncycastle/pqc/crypto/xmss/XMSSParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/xmss/XMSSKeyPairGenerator", "prng", "Ljava/security/SecureRandom;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/xmss/XMSSKeyPairGenerator", "generatePrivateKey", "(Lorg/bouncycastle/pqc/crypto/xmss/XMSSParameters;Ljava/security/SecureRandom;)Lorg/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters", "getBDSState", "()Lorg/bouncycastle/pqc/crypto/xmss/BDS;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/BDS", "getRoot", "()Lorg/bouncycastle/pqc/crypto/xmss/XMSSNode;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/xmss/XMSSKeyPairGenerator", "params", "Lorg/bouncycastle/pqc/crypto/xmss/XMSSParameters;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder", "<init>", "(Lorg/bouncycastle/pqc/crypto/xmss/XMSSParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters", "getSecretKeySeed", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder", "withSecretKeySeed", "([B)Lorg/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters", "getSecretKeyPRF", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder", "withSecretKeyPRF", "([B)Lorg/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters", "getPublicSeed", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder", "withPublicSeed", "([B)Lorg/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSNode", "getValue", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder", "withRoot", "([B)Lorg/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters", "getBDSState", "()Lorg/bouncycastle/pqc/crypto/xmss/BDS;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder", "withBDSState", "(Lorg/bouncycastle/pqc/crypto/xmss/BDS;)Lorg/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder", "build", "()Lorg/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/xmss/XMSSPublicKeyParameters$Builder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/xmss/XMSSKeyPairGenerator", "params", "Lorg/bouncycastle/pqc/crypto/xmss/XMSSParameters;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPublicKeyParameters$Builder", "<init>", "(Lorg/bouncycastle/pqc/crypto/xmss/XMSSParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSNode", "getValue", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPublicKeyParameters$Builder", "withRoot", "([B)Lorg/bouncycastle/pqc/crypto/xmss/XMSSPublicKeyParameters$Builder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters", "getPublicSeed", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPublicKeyParameters$Builder", "withPublicSeed", "([B)Lorg/bouncycastle/pqc/crypto/xmss/XMSSPublicKeyParameters$Builder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPublicKeyParameters$Builder", "build", "()Lorg/bouncycastle/pqc/crypto/xmss/XMSSPublicKeyParameters;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/AsymmetricCipherKeyPair");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/AsymmetricCipherKeyPair", "<init>", "(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "generatePrivateKey", "(Lorg/bouncycastle/pqc/crypto/xmss/XMSSParameters;Ljava/security/SecureRandom;)Lorg/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSParameters", "getTreeDigestSize", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/SecureRandom", "nextBytes", "([B)V", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/SecureRandom", "nextBytes", "([B)V", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/SecureRandom", "nextBytes", "([B)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder", "<init>", "(Lorg/bouncycastle/pqc/crypto/xmss/XMSSParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder", "withSecretKeySeed", "([B)Lorg/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder", "withSecretKeyPRF", "([B)Lorg/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder", "withPublicSeed", "([B)Lorg/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder;", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/xmss/BDS");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/xmss/OTSHashAddress$Builder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/xmss/OTSHashAddress$Builder", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/OTSHashAddress$Builder", "build", "()Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/xmss/OTSHashAddress");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/xmss/BDS", "<init>", "(Lorg/bouncycastle/pqc/crypto/xmss/XMSSParameters;[B[BLorg/bouncycastle/pqc/crypto/xmss/OTSHashAddress;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder", "withBDSState", "(Lorg/bouncycastle/pqc/crypto/xmss/BDS;)Lorg/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters$Builder", "build", "()Lorg/bouncycastle/pqc/crypto/xmss/XMSSPrivateKeyParameters;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
