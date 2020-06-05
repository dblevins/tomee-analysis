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
public class KeyAgreementSpi$MQVwithSHA224CKDFDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA224CKDF", null, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA224CKDF", "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "MQVwithSHA224CKDF", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ECMQVwithSHA224CKDF");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/agreement/ECMQVBasicAgreement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/agreement/ECMQVBasicAgreement", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/agreement/kdf/ConcatenationKDFGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DigestFactory", "createSHA224", "()Lorg/bouncycastle/crypto/Digest;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/agreement/kdf/ConcatenationKDFGenerator", "<init>", "(Lorg/bouncycastle/crypto/Digest;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi", "<init>", "(Ljava/lang/String;Lorg/bouncycastle/crypto/BasicAgreement;Lorg/bouncycastle/crypto/DerivationFunction;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}