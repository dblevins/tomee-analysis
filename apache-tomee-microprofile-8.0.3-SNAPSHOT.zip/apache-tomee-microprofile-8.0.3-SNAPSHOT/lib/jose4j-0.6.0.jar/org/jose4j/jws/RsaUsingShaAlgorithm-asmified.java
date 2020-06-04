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
public class RsaUsingShaAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jose4j/jws/RsaUsingShaAlgorithm", null, "org/jose4j/jws/BaseSignatureAlgorithm", new String[] { "org/jose4j/jws/JsonWebSignatureAlgorithm" });

classWriter.visitInnerClass("org/jose4j/jws/RsaUsingShaAlgorithm$RsaSha512", "org/jose4j/jws/RsaUsingShaAlgorithm", "RsaSha512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/RsaUsingShaAlgorithm$RsaSha384", "org/jose4j/jws/RsaUsingShaAlgorithm", "RsaSha384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/RsaUsingShaAlgorithm$RsaSha256", "org/jose4j/jws/RsaUsingShaAlgorithm", "RsaSha256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/RsaUsingShaAlgorithm$RsaPssSha512", "org/jose4j/jws/RsaUsingShaAlgorithm", "RsaPssSha512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/RsaUsingShaAlgorithm$RsaPssSha384", "org/jose4j/jws/RsaUsingShaAlgorithm", "RsaPssSha384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/RsaUsingShaAlgorithm$RsaPssSha256", "org/jose4j/jws/RsaUsingShaAlgorithm", "RsaPssSha256", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TRAILER", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MGF1", "Ljava/lang/String;", null, "MGF1");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("RSA");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/BaseSignatureAlgorithm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validatePublicKey", "(Ljava/security/PublicKey;)V", null, new String[] { "org/jose4j/lang/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwx/KeyValidationSupport", "checkRsaKeySize", "(Ljava/security/Key;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validatePrivateKey", "(Ljava/security/PrivateKey;)V", null, new String[] { "org/jose4j/lang/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwx/KeyValidationSupport", "checkRsaKeySize", "(Ljava/security/Key;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
