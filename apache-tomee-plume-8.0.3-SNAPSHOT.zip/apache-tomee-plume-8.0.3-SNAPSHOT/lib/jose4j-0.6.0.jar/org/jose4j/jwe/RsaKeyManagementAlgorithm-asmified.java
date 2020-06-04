package asm.org.jose4j.jwe;
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
public class RsaKeyManagementAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jose4j/jwe/RsaKeyManagementAlgorithm", null, "org/jose4j/jwe/WrappingKeyManagementAlgorithm", new String[] { "org/jose4j/jwe/KeyManagementAlgorithm" });

classWriter.visitInnerClass("org/jose4j/jwe/RsaKeyManagementAlgorithm$Rsa1_5", "org/jose4j/jwe/RsaKeyManagementAlgorithm", "Rsa1_5", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/RsaKeyManagementAlgorithm$RsaOaep256", "org/jose4j/jwe/RsaKeyManagementAlgorithm", "RsaOaep256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/RsaKeyManagementAlgorithm$RsaOaep", "org/jose4j/jwe/RsaKeyManagementAlgorithm", "RsaOaep", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/WrappingKeyManagementAlgorithm", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("RSA");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/RsaKeyManagementAlgorithm", "setKeyType", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/keys/KeyPersuasion", "ASYMMETRIC", "Lorg/jose4j/keys/KeyPersuasion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/RsaKeyManagementAlgorithm", "setKeyPersuasion", "(Lorg/jose4j/keys/KeyPersuasion;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateEncryptionKey", "(Ljava/security/Key;Lorg/jose4j/jwe/ContentEncryptionAlgorithm;)V", null, new String[] { "org/jose4j/lang/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/security/PublicKey;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwx/KeyValidationSupport", "castKey", "(Ljava/security/Key;Ljava/lang/Class;)Ljava/security/Key;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/PublicKey");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwx/KeyValidationSupport", "checkRsaKeySize", "(Ljava/security/Key;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateDecryptionKey", "(Ljava/security/Key;Lorg/jose4j/jwe/ContentEncryptionAlgorithm;)V", null, new String[] { "org/jose4j/lang/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/security/interfaces/RSAPrivateKey;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwx/KeyValidationSupport", "castKey", "(Ljava/security/Key;Ljava/lang/Class;)Ljava/security/Key;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/PrivateKey");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwx/KeyValidationSupport", "checkRsaKeySize", "(Ljava/security/Key;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAvailable", "()Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/jose4j/lang/JoseException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/RsaKeyManagementAlgorithm", "getJavaAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwe/CipherUtil", "getCipher", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/Cipher;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/jose4j/lang/JoseException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
