package asm.org.bouncycastle.jcajce.provider.asymmetric.dh;
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
public class KeyAgreementSpi$DHwithSHA224CKDFDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi$DHwithSHA224CKDF", null, "org/bouncycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi$DHwithSHA224CKDF", "org/bouncycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi", "DHwithSHA224CKDF", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("DHwithSHA224CKDF");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/agreement/kdf/ConcatenationKDFGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DigestFactory", "createSHA224", "()Lorg/bouncycastle/crypto/Digest;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/agreement/kdf/ConcatenationKDFGenerator", "<init>", "(Lorg/bouncycastle/crypto/Digest;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi", "<init>", "(Ljava/lang/String;Lorg/bouncycastle/crypto/DerivationFunction;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
