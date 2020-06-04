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
public class ElGamalUtilDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/asymmetric/elgamal/ElGamalUtil", null, "java/lang/Object", null);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "generatePublicKeyParameter", "(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", null, new String[] { "java/security/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jce/interfaces/ElGamalPublicKey");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jce/interfaces/ElGamalPublicKey");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ElGamalPublicKeyParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jce/interfaces/ElGamalPublicKey", "getY", "()Ljava/math/BigInteger;", true);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ElGamalParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jce/interfaces/ElGamalPublicKey", "getParameters", "()Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/spec/ElGamalParameterSpec", "getP", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jce/interfaces/ElGamalPublicKey", "getParameters", "()Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/spec/ElGamalParameterSpec", "getG", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ElGamalParameters", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ElGamalPublicKeyParameters", "<init>", "(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/ElGamalParameters;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/crypto/interfaces/DHPublicKey");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/crypto/interfaces/DHPublicKey");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ElGamalPublicKeyParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/crypto/interfaces/DHPublicKey", "getY", "()Ljava/math/BigInteger;", true);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ElGamalParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/crypto/interfaces/DHPublicKey", "getParams", "()Ljavax/crypto/spec/DHParameterSpec;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHParameterSpec", "getP", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/crypto/interfaces/DHPublicKey", "getParams", "()Ljavax/crypto/spec/DHParameterSpec;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHParameterSpec", "getG", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ElGamalParameters", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ElGamalPublicKeyParameters", "<init>", "(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/ElGamalParameters;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidKeyException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("can't identify public key for El Gamal.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidKeyException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "generatePrivateKeyParameter", "(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", null, new String[] { "java/security/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jce/interfaces/ElGamalPrivateKey");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jce/interfaces/ElGamalPrivateKey");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ElGamalPrivateKeyParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jce/interfaces/ElGamalPrivateKey", "getX", "()Ljava/math/BigInteger;", true);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ElGamalParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jce/interfaces/ElGamalPrivateKey", "getParameters", "()Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/spec/ElGamalParameterSpec", "getP", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jce/interfaces/ElGamalPrivateKey", "getParameters", "()Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/spec/ElGamalParameterSpec", "getG", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ElGamalParameters", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ElGamalPrivateKeyParameters", "<init>", "(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/ElGamalParameters;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/crypto/interfaces/DHPrivateKey");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/crypto/interfaces/DHPrivateKey");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ElGamalPrivateKeyParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/crypto/interfaces/DHPrivateKey", "getX", "()Ljava/math/BigInteger;", true);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ElGamalParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/crypto/interfaces/DHPrivateKey", "getParams", "()Ljavax/crypto/spec/DHParameterSpec;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHParameterSpec", "getP", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/crypto/interfaces/DHPrivateKey", "getParams", "()Ljavax/crypto/spec/DHParameterSpec;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHParameterSpec", "getG", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ElGamalParameters", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ElGamalPrivateKeyParameters", "<init>", "(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/ElGamalParameters;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidKeyException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("can't identify private key for El Gamal.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidKeyException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
