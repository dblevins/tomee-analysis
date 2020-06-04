package asm.org.jose4j.jws;
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
public class RsaUsingShaAlgorithm$RsaPssSha512Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jose4j/jws/RsaUsingShaAlgorithm$RsaPssSha512", null, "org/jose4j/jws/RsaUsingShaAlgorithm", null);

classWriter.visitInnerClass("org/jose4j/jws/RsaUsingShaAlgorithm$RsaPssSha512", "org/jose4j/jws/RsaUsingShaAlgorithm", "RsaPssSha512", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("PS512");
methodVisitor.visitLdcInsn("SHA512withRSAandMGF1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/RsaUsingShaAlgorithm", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/security/spec/MGF1ParameterSpec", "SHA512", "Ljava/security/spec/MGF1ParameterSpec;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/security/spec/PSSParameterSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/MGF1ParameterSpec", "getDigestAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("MGF1");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/spec/PSSParameterSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;II)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jws/RsaUsingShaAlgorithm$RsaPssSha512", "setAlgorithmParameterSpec", "(Ljava/security/spec/AlgorithmParameterSpec;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
