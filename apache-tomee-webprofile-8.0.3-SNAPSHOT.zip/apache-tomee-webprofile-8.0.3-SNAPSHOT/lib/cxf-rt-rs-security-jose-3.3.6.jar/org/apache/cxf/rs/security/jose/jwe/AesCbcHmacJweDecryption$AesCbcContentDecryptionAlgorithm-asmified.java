package asm.org.apache.cxf.rs.security.jose.jwe;
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
public class AesCbcHmacJweDecryption$AesCbcContentDecryptionAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweDecryption$AesCbcContentDecryptionAlgorithm", null, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionCipherProperties", new String[] { "org/apache/cxf/rs/security/jose/jwe/ContentDecryptionProvider" });

classWriter.visitInnerClass("org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweDecryption$AesCbcContentDecryptionAlgorithm", "org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweDecryption", "AesCbcContentDecryptionAlgorithm", ACC_PRIVATE | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionCipherProperties", "<init>", "(Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAlgorithmParameterSpec", "([B)Ljava/security/spec/AlgorithmParameterSpec;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/crypto/spec/IvParameterSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/crypto/spec/IvParameterSpec", "<init>", "([B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAdditionalAuthenticationData", "(Ljava/lang/String;[B)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncryptedSequence", "(Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;[B[B)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
