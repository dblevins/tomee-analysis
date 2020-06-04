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
public class KeyAgreementSpiDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", null, "org/bouncycastle/jcajce/provider/asymmetric/util/BaseAgreementSpi", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$1", null, null, 0);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$CDHwithSHA1KDFAndSharedInfo", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "CDHwithSHA1KDFAndSharedInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$CDHwithSHA224KDFAndSharedInfo", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "CDHwithSHA224KDFAndSharedInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$CDHwithSHA256KDFAndSharedInfo", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "CDHwithSHA256KDFAndSharedInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$CDHwithSHA384KDFAndSharedInfo", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "CDHwithSHA384KDFAndSharedInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$CDHwithSHA512KDFAndSharedInfo", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "CDHwithSHA512KDFAndSharedInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DH", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DH", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHC", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHUC", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHUC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHUwithSHA1CKDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHUwithSHA1CKDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHUwithSHA1KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHUwithSHA1KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHUwithSHA224CKDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHUwithSHA224CKDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHUwithSHA224KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHUwithSHA224KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHUwithSHA256CKDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHUwithSHA256CKDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHUwithSHA256KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHUwithSHA256KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHUwithSHA384CKDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHUwithSHA384CKDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHUwithSHA384KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHUwithSHA384KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHUwithSHA512CKDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHUwithSHA512CKDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHUwithSHA512KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHUwithSHA512KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHwithSHA1CKDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHwithSHA1CKDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHwithSHA1KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHwithSHA1KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHwithSHA1KDFAndSharedInfo", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHwithSHA1KDFAndSharedInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHwithSHA224KDFAndSharedInfo", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHwithSHA224KDFAndSharedInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHwithSHA256CKDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHwithSHA256CKDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHwithSHA256KDFAndSharedInfo", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHwithSHA256KDFAndSharedInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHwithSHA384CKDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHwithSHA384CKDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHwithSHA384KDFAndSharedInfo", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHwithSHA384KDFAndSharedInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHwithSHA512CKDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHwithSHA512CKDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHwithSHA512KDFAndSharedInfo", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "DHwithSHA512KDFAndSharedInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$ECKAEGwithRIPEMD160KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "ECKAEGwithRIPEMD160KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$ECKAEGwithSHA1KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "ECKAEGwithSHA1KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$ECKAEGwithSHA224KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "ECKAEGwithSHA224KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$ECKAEGwithSHA256KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "ECKAEGwithSHA256KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$ECKAEGwithSHA384KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "ECKAEGwithSHA384KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$ECKAEGwithSHA512KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "ECKAEGwithSHA512KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQV", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQV", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA1CKDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQVwithSHA1CKDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA1KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQVwithSHA1KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA1KDFAndSharedInfo", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQVwithSHA1KDFAndSharedInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA224CKDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQVwithSHA224CKDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA224KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQVwithSHA224KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA224KDFAndSharedInfo", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQVwithSHA224KDFAndSharedInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA256CKDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQVwithSHA256CKDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA256KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQVwithSHA256KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA256KDFAndSharedInfo", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQVwithSHA256KDFAndSharedInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA384CKDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQVwithSHA384CKDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA384KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQVwithSHA384KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA384KDFAndSharedInfo", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQVwithSHA384KDFAndSharedInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA512CKDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQVwithSHA512CKDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA512KDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQVwithSHA512KDF", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA512KDFAndSharedInfo", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQVwithSHA512KDFAndSharedInfo", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "converter", "Lorg/bouncycastle/asn1/x9/X9IntegerConverter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "kaAlgorithm", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parameters", "Lorg/bouncycastle/crypto/params/ECDomainParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "agreement", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "mqvParameters", "Lorg/bouncycastle/jcajce/spec/MQVParameterSpec;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "dheParameters", "Lorg/bouncycastle/jcajce/spec/DHUParameterSpec;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "result", "[B", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;Lorg/bouncycastle/crypto/BasicAgreement;Lorg/bouncycastle/crypto/DerivationFunction;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/util/BaseAgreementSpi", "<init>", "(Ljava/lang/String;Lorg/bouncycastle/crypto/DerivationFunction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "kaAlgorithm", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "agreement", "Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;Lorg/bouncycastle/crypto/agreement/ECDHCUnifiedAgreement;Lorg/bouncycastle/crypto/DerivationFunction;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/util/BaseAgreementSpi", "<init>", "(Ljava/lang/String;Lorg/bouncycastle/crypto/DerivationFunction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "kaAlgorithm", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "agreement", "Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "bigIntToBytes", "(Ljava/math/BigInteger;)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "converter", "Lorg/bouncycastle/asn1/x9/X9IntegerConverter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "converter", "Lorg/bouncycastle/asn1/x9/X9IntegerConverter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "parameters", "Lorg/bouncycastle/crypto/params/ECDomainParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECDomainParameters", "getCurve", "()Lorg/bouncycastle/math/ec/ECCurve;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x9/X9IntegerConverter", "getByteLength", "(Lorg/bouncycastle/math/ec/ECCurve;)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x9/X9IntegerConverter", "integerToBytes", "(Ljava/math/BigInteger;I)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineDoPhase", "(Ljava/security/Key;Z)Ljava/security/Key;", null, new String[] { "java/security/InvalidKeyException", "java/lang/IllegalStateException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "parameters", "Lorg/bouncycastle/crypto/params/ECDomainParameters;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "kaAlgorithm", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" not initialised.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "kaAlgorithm", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" can only be between two parties.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "agreement", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/agreement/ECMQVBasicAgreement");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jce/interfaces/MQVPublicKey");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/PublicKey");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/ECUtils", "generatePublicKeyParameter", "(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPublicKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "mqvParameters", "Lorg/bouncycastle/jcajce/spec/MQVParameterSpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/MQVParameterSpec", "getOtherPartyEphemeralKey", "()Ljava/security/PublicKey;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/ECUtils", "generatePublicKeyParameter", "(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPublicKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/MQVPublicParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/MQVPublicParameters", "<init>", "(Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jce/interfaces/MQVPublicKey");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jce/interfaces/MQVPublicKey", "getStaticKey", "()Ljava/security/PublicKey;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/ECUtils", "generatePublicKeyParameter", "(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPublicKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jce/interfaces/MQVPublicKey", "getEphemeralKey", "()Ljava/security/PublicKey;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/ECUtils", "generatePublicKeyParameter", "(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPublicKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/MQVPublicParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/MQVPublicParameters", "<init>", "(Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "agreement", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/agreement/ECDHCUnifiedAgreement");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/PublicKey");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/ECUtils", "generatePublicKeyParameter", "(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPublicKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "dheParameters", "Lorg/bouncycastle/jcajce/spec/DHUParameterSpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/DHUParameterSpec", "getOtherPartyEphemeralKey", "()Ljava/security/PublicKey;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/ECUtils", "generatePublicKeyParameter", "(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPublicKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ECDHUPublicParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ECDHUPublicParameters", "<init>", "(Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/PublicKey");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidKeyException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "kaAlgorithm", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" key agreement requires ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/bouncycastle/jce/interfaces/ECPublicKey;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "getSimpleName", "(Ljava/lang/Class;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" for doPhase");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidKeyException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/PublicKey");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/ECUtils", "generatePublicKeyParameter", "(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "agreement", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/BasicAgreement");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "agreement", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/BasicAgreement");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/BasicAgreement", "calculateAgreement", "(Lorg/bouncycastle/crypto/CipherParameters;)Ljava/math/BigInteger;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "bigIntToBytes", "(Ljava/math/BigInteger;)[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "result", "[B");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "agreement", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/agreement/ECDHCUnifiedAgreement");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/agreement/ECDHCUnifiedAgreement", "calculateAgreement", "(Lorg/bouncycastle/crypto/CipherParameters;)[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "result", "[B");
methodVisitor.visitLabel(label1);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("calculation failed: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$1", "<init>", "(Lorg/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineInit", "(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V", null, new String[] { "java/security/InvalidKeyException", "java/security/InvalidAlgorithmParameterException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jcajce/spec/MQVParameterSpec");
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jcajce/spec/UserKeyingMaterialSpec");
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jcajce/spec/DHUParameterSpec");
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No algorithm parameters supported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "initFromKey", "(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineInit", "(Ljava/security/Key;Ljava/security/SecureRandom;)V", null, new String[] { "java/security/InvalidKeyException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "initFromKey", "(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidKeyException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/InvalidAlgorithmParameterException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidKeyException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "initFromKey", "(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V", null, new String[] { "java/security/InvalidKeyException", "java/security/InvalidAlgorithmParameterException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "agreement", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/agreement/ECMQVBasicAgreement");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "mqvParameters", "Lorg/bouncycastle/jcajce/spec/MQVParameterSpec;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jce/interfaces/MQVPrivateKey");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jcajce/spec/MQVParameterSpec");
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "kaAlgorithm", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" key agreement requires ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/bouncycastle/jcajce/spec/MQVParameterSpec;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "getSimpleName", "(Ljava/lang/Class;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" for initialisation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jce/interfaces/MQVPrivateKey");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jce/interfaces/MQVPrivateKey");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jce/interfaces/MQVPrivateKey", "getStaticPrivateKey", "()Ljava/security/PrivateKey;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/util/ECUtil", "generatePrivateKeyParameter", "(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPrivateKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jce/interfaces/MQVPrivateKey", "getEphemeralPrivateKey", "()Ljava/security/PrivateKey;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/util/ECUtil", "generatePrivateKeyParameter", "(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPrivateKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jce/interfaces/MQVPrivateKey", "getEphemeralPublicKey", "()Ljava/security/PublicKey;", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jce/interfaces/MQVPrivateKey", "getEphemeralPublicKey", "()Ljava/security/PublicKey;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/ECUtils", "generatePublicKeyParameter", "(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPublicKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jcajce/spec/MQVParameterSpec");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/PrivateKey");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/util/ECUtil", "generatePrivateKeyParameter", "(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPrivateKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/MQVParameterSpec", "getEphemeralPrivateKey", "()Ljava/security/PrivateKey;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/util/ECUtil", "generatePrivateKeyParameter", "(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPrivateKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/MQVParameterSpec", "getEphemeralPublicKey", "()Ljava/security/PublicKey;", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/MQVParameterSpec", "getEphemeralPublicKey", "()Ljava/security/PublicKey;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/ECUtils", "generatePublicKeyParameter", "(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPublicKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "mqvParameters", "Lorg/bouncycastle/jcajce/spec/MQVParameterSpec;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/MQVParameterSpec", "getUserKeyingMaterial", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "ukmParameters", "[B");
methodVisitor.visitLabel(label4);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/MQVPrivateParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/MQVPrivateParameters", "<init>", "(Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECPrivateKeyParameters", "getParameters", "()Lorg/bouncycastle/crypto/params/ECDomainParameters;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "parameters", "Lorg/bouncycastle/crypto/params/ECDomainParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "agreement", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/agreement/ECMQVBasicAgreement");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/agreement/ECMQVBasicAgreement", "init", "(Lorg/bouncycastle/crypto/CipherParameters;)V", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jcajce/spec/DHUParameterSpec");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "agreement", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/agreement/ECDHCUnifiedAgreement");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "kaAlgorithm", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" key agreement cannot be used with ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/bouncycastle/jcajce/spec/DHUParameterSpec;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "getSimpleName", "(Ljava/lang/Class;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jcajce/spec/DHUParameterSpec");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/PrivateKey");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/util/ECUtil", "generatePrivateKeyParameter", "(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPrivateKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/DHUParameterSpec", "getEphemeralPrivateKey", "()Ljava/security/PrivateKey;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/util/ECUtil", "generatePrivateKeyParameter", "(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPrivateKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/DHUParameterSpec", "getEphemeralPublicKey", "()Ljava/security/PublicKey;", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/DHUParameterSpec", "getEphemeralPublicKey", "()Ljava/security/PublicKey;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/ECUtils", "generatePublicKeyParameter", "(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPublicKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "dheParameters", "Lorg/bouncycastle/jcajce/spec/DHUParameterSpec;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/DHUParameterSpec", "getUserKeyingMaterial", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "ukmParameters", "[B");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ECDHUPrivateParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ECDHUPrivateParameters", "<init>", "(Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECPrivateKeyParameters", "getParameters", "()Lorg/bouncycastle/crypto/params/ECDomainParameters;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "parameters", "Lorg/bouncycastle/crypto/params/ECDomainParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "agreement", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/agreement/ECDHCUnifiedAgreement");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/agreement/ECDHCUnifiedAgreement", "init", "(Lorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/PrivateKey");
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNE, label10);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidKeyException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "kaAlgorithm", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" key agreement requires ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/bouncycastle/jce/interfaces/ECPrivateKey;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "getSimpleName", "(Ljava/lang/Class;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" for initialisation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidKeyException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "kdf", "Lorg/bouncycastle/crypto/DerivationFunction;");
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jcajce/spec/UserKeyingMaterialSpec");
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("no KDF specified for UserKeyingMaterialSpec");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/PrivateKey");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/util/ECUtil", "generatePrivateKeyParameter", "(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPrivateKeyParameters");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECPrivateKeyParameters", "getParameters", "()Lorg/bouncycastle/crypto/params/ECDomainParameters;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "parameters", "Lorg/bouncycastle/crypto/params/ECDomainParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jcajce/spec/UserKeyingMaterialSpec");
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jcajce/spec/UserKeyingMaterialSpec");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/spec/UserKeyingMaterialSpec", "getUserKeyingMaterial", "()[B", false);
Label label13 = new Label();
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label12);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label13);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "ukmParameters", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "agreement", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/BasicAgreement");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/BasicAgreement", "init", "(Lorg/bouncycastle/crypto/CipherParameters;)V", true);
methodVisitor.visitLabel(label6);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getSimpleName", "(Ljava/lang/Class;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "lastIndexOf", "(I)I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "calcSecret", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "result", "[B");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Arrays", "clone", "([B)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X9IntegerConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X9IntegerConverter", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "converter", "Lorg/bouncycastle/asn1/x9/X9IntegerConverter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
