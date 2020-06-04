package asm.org.bouncycastle.jcajce.provider.asymmetric.ec;
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
public class SignatureSpiDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", null, "org/bouncycastle/jcajce/provider/asymmetric/util/DSABase", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecCVCDSA", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecCVCDSA", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecCVCDSA224", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecCVCDSA224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecCVCDSA256", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecCVCDSA256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecCVCDSA384", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecCVCDSA384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecCVCDSA512", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecCVCDSA512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSA", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDSA", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSA224", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDSA224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSA256", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDSA256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSA384", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDSA384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSA512", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDSA512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSARipeMD160", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDSARipeMD160", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSASha3_224", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDSASha3_224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSASha3_256", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDSASha3_256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSASha3_384", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDSASha3_384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSASha3_512", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDSASha3_512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSAnone", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDSAnone", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDetDSA", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDetDSA", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDetDSA224", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDetDSA224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDetDSA256", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDetDSA256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDetDSA384", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDetDSA384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDetDSA512", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDetDSA512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDetDSASha3_224", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDetDSASha3_224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDetDSASha3_256", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDetDSASha3_256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDetDSASha3_384", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDetDSASha3_384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDetDSASha3_512", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecDetDSASha3_512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecNR", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecNR", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecNR224", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecNR224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecNR256", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecNR256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecNR384", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecNR384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecNR512", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecNR512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecPlainDSARP160", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecPlainDSARP160", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/DSAExt;Lorg/bouncycastle/crypto/signers/DSAEncoding;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/util/DSABase", "<init>", "(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/DSAExt;Lorg/bouncycastle/crypto/signers/DSAEncoding;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineInitVerify", "(Ljava/security/PublicKey;)V", null, new String[] { "java/security/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/ECUtils", "generatePublicKeyParameter", "(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "reset", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "signer", "Lorg/bouncycastle/crypto/DSAExt;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/DSAExt", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineInitSign", "(Ljava/security/PrivateKey;)V", null, new String[] { "java/security/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/util/ECUtil", "generatePrivateKeyParameter", "(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "reset", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "appRandom", "Ljava/security/SecureRandom;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "signer", "Lorg/bouncycastle/crypto/DSAExt;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ParametersWithRandom");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "appRandom", "Ljava/security/SecureRandom;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ParametersWithRandom", "<init>", "(Lorg/bouncycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/DSAExt", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "signer", "Lorg/bouncycastle/crypto/DSAExt;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/DSAExt", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
