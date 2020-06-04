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
public class JsonWebEncryptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jose4j/jwe/JsonWebEncryption", null, "org/jose4j/jwx/JsonWebStructure", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPACT_SERIALIZATION_PARTS", "S", null, new Integer(5));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "base64url", "Lorg/jose4j/base64url/Base64Url;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "plaintextCharEncoding", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "plaintext", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "encryptedKey", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "iv", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "ciphertext", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "contentEncryptionKey", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "contentEncryptionAlgorithmConstraints", "Lorg/jose4j/jwa/AlgorithmConstraints;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwx/JsonWebStructure", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/base64url/Base64Url");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/base64url/Base64Url", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/JsonWebEncryption", "base64url", "Lorg/jose4j/base64url/Base64Url;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("UTF-8");
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/JsonWebEncryption", "plaintextCharEncoding", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwa/AlgorithmConstraints", "NO_CONSTRAINTS", "Lorg/jose4j/jwa/AlgorithmConstraints;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/JsonWebEncryption", "contentEncryptionAlgorithmConstraints", "Lorg/jose4j/jwa/AlgorithmConstraints;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPlainTextCharEncoding", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/JsonWebEncryption", "plaintextCharEncoding", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPlaintext", "([B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/JsonWebEncryption", "plaintext", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPlaintext", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "plaintextCharEncoding", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/StringUtil", "getBytesUnchecked", "(Ljava/lang/String;Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/JsonWebEncryption", "plaintext", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPlaintextString", "()Ljava/lang/String;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getPlaintextBytes", "()[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "plaintextCharEncoding", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/StringUtil", "newString", "([BLjava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPlaintextBytes", "()[B", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "plaintext", "[B");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/JsonWebEncryption", "decrypt", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "plaintext", "[B");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPayload", "()Ljava/lang/String;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getPlaintextString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPayload", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "setPlaintext", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEncryptionMethodHeaderParameter", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("enc");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "setHeader", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncryptionMethodHeaderParameter", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("enc");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getHeader", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCompressionAlgorithmHeaderParameter", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("zip");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "setHeader", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCompressionAlgorithmHeaderParameter", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("zip");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getHeader", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enableDefaultCompression", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("DEF");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "setCompressionAlgorithmHeaderParameter", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContentEncryptionAlgorithmConstraints", "(Lorg/jose4j/jwa/AlgorithmConstraints;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/JsonWebEncryption", "contentEncryptionAlgorithmConstraints", "Lorg/jose4j/jwa/AlgorithmConstraints;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContentEncryptionAlgorithm", "()Lorg/jose4j/jwe/ContentEncryptionAlgorithm;", null, new String[] { "org/jose4j/lang/InvalidAlgorithmException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getEncryptionMethodHeaderParameter", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/lang/InvalidAlgorithmException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Content encryption header (enc) not set.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/lang/InvalidAlgorithmException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "contentEncryptionAlgorithmConstraints", "Lorg/jose4j/jwa/AlgorithmConstraints;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmConstraints", "checkConstraint", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwa/AlgorithmFactoryFactory", "getInstance", "()Lorg/jose4j/jwa/AlgorithmFactoryFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactoryFactory", "getJweContentEncryptionAlgorithmFactory", "()Lorg/jose4j/jwa/AlgorithmFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "getAlgorithm", "(Ljava/lang/String;)Lorg/jose4j/jwa/Algorithm;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/jose4j/jwe/ContentEncryptionAlgorithm");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKeyManagementModeAlgorithm", "()Lorg/jose4j/jwe/KeyManagementAlgorithm;", null, new String[] { "org/jose4j/lang/InvalidAlgorithmException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getKeyManagementModeAlgorithm", "(Z)Lorg/jose4j/jwe/KeyManagementAlgorithm;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getKeyManagementModeAlgorithm", "(Z)Lorg/jose4j/jwe/KeyManagementAlgorithm;", null, new String[] { "org/jose4j/lang/InvalidAlgorithmException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getAlgorithmHeaderValue", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/lang/InvalidAlgorithmException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Encryption key management algorithm header (alg) not set.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/lang/InvalidAlgorithmException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getAlgorithmConstraints", "()Lorg/jose4j/jwa/AlgorithmConstraints;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmConstraints", "checkConstraint", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwa/AlgorithmFactoryFactory", "getInstance", "()Lorg/jose4j/jwa/AlgorithmFactoryFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactoryFactory", "getJweKeyManagementAlgorithmFactory", "()Lorg/jose4j/jwa/AlgorithmFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "getAlgorithm", "(Ljava/lang/String;)Lorg/jose4j/jwa/Algorithm;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/jose4j/jwe/KeyManagementAlgorithm");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAlgorithmNoConstraintCheck", "()Lorg/jose4j/jwe/KeyManagementAlgorithm;", null, new String[] { "org/jose4j/lang/InvalidAlgorithmException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getKeyManagementModeAlgorithm", "(Z)Lorg/jose4j/jwe/KeyManagementAlgorithm;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAlgorithm", "()Lorg/jose4j/jwe/KeyManagementAlgorithm;", null, new String[] { "org/jose4j/lang/InvalidAlgorithmException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getKeyManagementModeAlgorithm", "()Lorg/jose4j/jwe/KeyManagementAlgorithm;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setCompactSerializationParts", "([Ljava/lang/String;)V", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/lang/JoseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("A JWE Compact Serialization must have exactly 5 parts separated by period ('.') characters");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/lang/JoseException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "setEncodedHeader", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "base64url", "Lorg/jose4j/base64url/Base64Url;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlDecode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/JsonWebEncryption", "encryptedKey", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "setEncodedIv", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("Encoded JWE Ciphertext");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "checkNotEmptyPart", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "base64url", "Lorg/jose4j/base64url/Base64Url;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlDecode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/JsonWebEncryption", "ciphertext", "[B");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("Encoded JWE Authentication Tag");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "checkNotEmptyPart", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "base64url", "Lorg/jose4j/base64url/Base64Url;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlDecode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "setIntegrity", "([B)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "decrypt", "()V", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getKeyManagementModeAlgorithm", "()Lorg/jose4j/jwe/KeyManagementAlgorithm;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getContentEncryptionAlgorithm", "()Lorg/jose4j/jwe/ContentEncryptionAlgorithm;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/jose4j/jwe/ContentEncryptionAlgorithm", "getContentEncryptionKeyDescriptor", "()Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "isDoKeyValidation", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getKey", "()Ljava/security/Key;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/jose4j/jwe/KeyManagementAlgorithm", "validateDecryptionKey", "(Ljava/security/Key;Lorg/jose4j/jwe/ContentEncryptionAlgorithm;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/jose4j/jwe/KeyManagementAlgorithm", "org/jose4j/jwe/ContentEncryptionAlgorithm", "org/jose4j/jwe/ContentEncryptionKeyDescriptor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "checkCrit", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getKey", "()Ljava/security/Key;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getEncryptedKey", "()[B", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getHeaders", "()Lorg/jose4j/jwx/Headers;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getProviderCtx", "()Lorg/jose4j/jca/ProviderContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/jose4j/jwe/KeyManagementAlgorithm", "manageForDecrypt", "(Ljava/security/Key;[BLorg/jose4j/jwe/ContentEncryptionKeyDescriptor;Lorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)Ljava/security/Key;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/ContentEncryptionParts");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "iv", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "ciphertext", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getIntegrity", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/ContentEncryptionParts", "<init>", "([B[B[B)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getEncodedHeaderAsciiBytesForAdditionalAuthenticatedData", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/Key", "getEncoded", "()[B", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getHeaders", "()Lorg/jose4j/jwx/Headers;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getProviderCtx", "()Lorg/jose4j/jca/ProviderContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/jose4j/jwe/ContentEncryptionAlgorithm", "decrypt", "(Lorg/jose4j/jwe/ContentEncryptionParts;[B[BLorg/jose4j/jwx/Headers;Lorg/jose4j/jca/ProviderContext;)[B", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getHeaders", "()Lorg/jose4j/jwx/Headers;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "decompress", "(Lorg/jose4j/jwx/Headers;[B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "setPlaintext", "([B)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncryptedKey", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "encryptedKey", "[B");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getEncodedHeaderAsciiBytesForAdditionalAuthenticatedData", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getEncodedHeader", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/lang/StringUtil", "getBytesAscii", "(Ljava/lang/String;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "decompress", "(Lorg/jose4j/jwx/Headers;[B)[B", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("zip");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/Headers", "getStringHeaderValue", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwa/AlgorithmFactoryFactory", "getInstance", "()Lorg/jose4j/jwa/AlgorithmFactoryFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactoryFactory", "getCompressionAlgorithmFactory", "()Lorg/jose4j/jwa/AlgorithmFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "getAlgorithm", "(Ljava/lang/String;)Lorg/jose4j/jwa/Algorithm;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/jose4j/zip/CompressionAlgorithm");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/jose4j/zip/CompressionAlgorithm", "decompress", "([B)[B", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "compress", "(Lorg/jose4j/jwx/Headers;[B)[B", null, new String[] { "org/jose4j/lang/InvalidAlgorithmException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("zip");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/Headers", "getStringHeaderValue", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwa/AlgorithmFactoryFactory", "getInstance", "()Lorg/jose4j/jwa/AlgorithmFactoryFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactoryFactory", "getCompressionAlgorithmFactory", "()Lorg/jose4j/jwa/AlgorithmFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmFactory", "getAlgorithm", "(Ljava/lang/String;)Lorg/jose4j/jwa/Algorithm;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/jose4j/zip/CompressionAlgorithm");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/jose4j/zip/CompressionAlgorithm", "compress", "([B)[B", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCompactSerialization", "()Ljava/lang/String;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getKeyManagementModeAlgorithm", "()Lorg/jose4j/jwe/KeyManagementAlgorithm;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getContentEncryptionAlgorithm", "()Lorg/jose4j/jwe/ContentEncryptionAlgorithm;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/jose4j/jwe/ContentEncryptionAlgorithm", "getContentEncryptionKeyDescriptor", "()Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getKey", "()Ljava/security/Key;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "isDoKeyValidation", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getKey", "()Ljava/security/Key;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/jose4j/jwe/KeyManagementAlgorithm", "validateEncryptionKey", "(Ljava/security/Key;Lorg/jose4j/jwe/ContentEncryptionAlgorithm;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/jose4j/jwe/JsonWebEncryption", "org/jose4j/jwe/KeyManagementAlgorithm", "org/jose4j/jwe/ContentEncryptionAlgorithm", "org/jose4j/jwe/ContentEncryptionKeyDescriptor", "java/security/Key"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getHeaders", "()Lorg/jose4j/jwx/Headers;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "contentEncryptionKey", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getProviderCtx", "()Lorg/jose4j/jca/ProviderContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/jose4j/jwe/KeyManagementAlgorithm", "manageForEncrypt", "(Ljava/security/Key;Lorg/jose4j/jwe/ContentEncryptionKeyDescriptor;Lorg/jose4j/jwx/Headers;[BLorg/jose4j/jca/ProviderContext;)Lorg/jose4j/jwe/ContentEncryptionKeys;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionKeys", "getContentEncryptionKey", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "setContentEncryptionKey", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionKeys", "getEncryptedKey", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/JsonWebEncryption", "encryptedKey", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getEncodedHeaderAsciiBytesForAdditionalAuthenticatedData", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionKeys", "getContentEncryptionKey", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "plaintext", "[B");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("The plaintext payload for the JWE has not been set.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/jose4j/jwe/JsonWebEncryption", "org/jose4j/jwe/KeyManagementAlgorithm", "org/jose4j/jwe/ContentEncryptionAlgorithm", "org/jose4j/jwe/ContentEncryptionKeyDescriptor", "java/security/Key", "org/jose4j/jwe/ContentEncryptionKeys", "[B", "[B", "[B"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getHeaders", "()Lorg/jose4j/jwx/Headers;", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "compress", "(Lorg/jose4j/jwx/Headers;[B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getHeaders", "()Lorg/jose4j/jwx/Headers;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getIv", "()[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getProviderCtx", "()Lorg/jose4j/jca/ProviderContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/jose4j/jwe/ContentEncryptionAlgorithm", "encrypt", "([B[B[BLorg/jose4j/jwx/Headers;[BLorg/jose4j/jca/ProviderContext;)Lorg/jose4j/jwe/ContentEncryptionParts;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionParts", "getIv", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "setIv", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionParts", "getCiphertext", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/JsonWebEncryption", "ciphertext", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "base64url", "Lorg/jose4j/base64url/Base64Url;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionParts", "getIv", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlEncode", "([B)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "base64url", "Lorg/jose4j/base64url/Base64Url;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionParts", "getCiphertext", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlEncode", "([B)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "base64url", "Lorg/jose4j/base64url/Base64Url;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionParts", "getAuthenticationTag", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlEncode", "([B)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/ContentEncryptionKeys", "getEncryptedKey", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "base64url", "Lorg/jose4j/base64url/Base64Url;");
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlEncode", "([B)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getEncodedHeader", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwx/CompactSerializer", "serialize", "([Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 15);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContentEncryptionKey", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "contentEncryptionKey", "[B");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContentEncryptionKey", "([B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/JsonWebEncryption", "contentEncryptionKey", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEncodedContentEncryptionKey", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "base64url", "Lorg/jose4j/base64url/Base64Url;");
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/base64url/Base64Url", "decode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "setContentEncryptionKey", "([B)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIv", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "iv", "[B");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIv", "([B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwe/JsonWebEncryption", "iv", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEncodedIv", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwe/JsonWebEncryption", "base64url", "Lorg/jose4j/base64url/Base64Url;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/base64url/Base64Url", "base64UrlDecode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "setIv", "([B)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getAlgorithmNoConstraintCheck", "()Lorg/jose4j/jwa/Algorithm;", null, new String[] { "org/jose4j/lang/InvalidAlgorithmException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getAlgorithmNoConstraintCheck", "()Lorg/jose4j/jwe/KeyManagementAlgorithm;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getAlgorithm", "()Lorg/jose4j/jwa/Algorithm;", null, new String[] { "org/jose4j/lang/InvalidAlgorithmException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/JsonWebEncryption", "getAlgorithm", "()Lorg/jose4j/jwe/KeyManagementAlgorithm;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
