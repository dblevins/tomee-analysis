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
public class AbstractContentEncryptionAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", null, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionCipherProperties", new String[] { "org/apache/cxf/rs/security/jose/jwe/ContentEncryptionProvider" });

classWriter.visitInnerClass("org/apache/cxf/rs/security/jose/jwe/JweException$Error", "org/apache/cxf/rs/security/jose/jwe/JweException", "Error", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_IV_SIZE", "I", null, new Integer(128));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cek", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "iv", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "providedIvUsageCount", "Ljava/util/concurrent/atomic/AtomicInteger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "generateCekOnce", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionCipherProperties", "<init>", "(Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "generateCekOnce", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "([B[BLorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionCipherProperties", "<init>", "(Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "cek", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "iv", "[B");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicInteger", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "providedIvUsageCount", "Ljava/util/concurrent/atomic/AtomicInteger;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "[B", "[B", "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContentEncryptionKey", "(Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;)[B", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label6, "javax/security/auth/DestroyFailedException");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "cek", "[B");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "getAlgorithm", "()Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "getJavaName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwa/AlgorithmUtils", "stripAlgoProperties", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "getContentEncryptionKeySize", "(Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rt/security/crypto/CryptoUtils", "getSecretKey", "(Ljava/lang/String;I)Ljavax/crypto/SecretKey;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/crypto/SecretKey", "getEncoded", "()[B", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "generateCekOnce", "Z");
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "cek", "[B");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "org/apache/cxf/rs/security/jose/jwe/JweHeaders", "[B", "java/lang/String", "javax/crypto/SecretKey", "java/lang/Object"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/crypto/SecretKey", "destroy", "()V", true);
methodVisitor.visitLabel(label5);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/security/auth/DestroyFailedException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "cek", "[B");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInitVector", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "iv", "[B");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "getIvSize", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rt/security/crypto/CryptoUtils", "generateSecureRandomBytes", "(I)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "iv", "[B");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "providedIvUsageCount", "Ljava/util/concurrent/atomic/AtomicInteger;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicInteger", "addAndGet", "(I)I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("Custom IV is recommended to be used once");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "warning", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwe/JweException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwe/JweException$Error", "CUSTOM_IV_REUSED", "Lorg/apache/cxf/rs/security/jose/jwe/JweException$Error;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/JweException", "<init>", "(Lorg/apache/cxf/rs/security/jose/jwe/JweException$Error;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "iv", "[B");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getContentEncryptionKeySize", "(Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "getAlgorithm", "()Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "getKeySizeBits", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getIvSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
