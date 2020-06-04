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
public class SignatureSpi$ecCVCDSA256Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecCVCDSA256", null, "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecCVCDSA256", "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "ecCVCDSA256", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DigestFactory", "createSHA256", "()Lorg/bouncycastle/crypto/Digest;", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/signers/ECDSASigner");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/signers/ECDSASigner", "<init>", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/signers/PlainDSAEncoding", "INSTANCE", "Lorg/bouncycastle/crypto/signers/PlainDSAEncoding;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/ec/SignatureSpi", "<init>", "(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/DSAExt;Lorg/bouncycastle/crypto/signers/DSAEncoding;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
