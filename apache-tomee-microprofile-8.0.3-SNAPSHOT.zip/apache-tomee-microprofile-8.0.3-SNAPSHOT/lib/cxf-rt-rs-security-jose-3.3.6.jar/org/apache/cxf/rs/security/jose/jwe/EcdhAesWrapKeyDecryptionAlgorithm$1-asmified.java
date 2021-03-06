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
public class EcdhAesWrapKeyDecryptionAlgorithm$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyDecryptionAlgorithm$1", null, "org/apache/cxf/rs/security/jose/jwe/AesWrapKeyDecryptionAlgorithm", null);

classWriter.visitOuterClass("org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyDecryptionAlgorithm", "getDecryptedContentEncryptionKey", "(Lorg/apache/cxf/rs/security/jose/jwe/JweDecryptionInput;)[B");

classWriter.visitInnerClass("org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyDecryptionAlgorithm$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyDecryptionAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyDecryptionAlgorithm;[BLorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyDecryptionAlgorithm$1", "this$0", "Lorg/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyDecryptionAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/AesWrapKeyDecryptionAlgorithm", "<init>", "([BLorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "isValidAlgorithmFamily", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwa/AlgorithmUtils", "isEcdhEsWrap", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
