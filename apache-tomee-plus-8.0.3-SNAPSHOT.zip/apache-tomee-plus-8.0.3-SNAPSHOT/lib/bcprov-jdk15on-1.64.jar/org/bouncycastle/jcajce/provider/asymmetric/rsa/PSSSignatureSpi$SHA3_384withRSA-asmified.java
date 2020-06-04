package asm.org.bouncycastle.jcajce.provider.asymmetric.rsa;
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
public class PSSSignatureSpi$SHA3_384withRSADump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA3_384withRSA", null, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA3_384withRSA", "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "SHA3_384withRSA", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/engines/RSABlindedEngine");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/engines/RSABlindedEngine", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "java/security/spec/PSSParameterSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SHA3-384");
methodVisitor.visitLdcInsn("MGF1");
methodVisitor.visitTypeInsn(NEW, "java/security/spec/MGF1ParameterSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SHA3-384");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/spec/MGF1ParameterSpec", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/spec/PSSParameterSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;II)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi", "<init>", "(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Ljava/security/spec/PSSParameterSpec;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
