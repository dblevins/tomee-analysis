package asm.org.apache.cxf.rs.security.jose.jws;
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
public class PublicKeyJwsSignatureVerifierDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", null, "java/lang/Object", new String[] { "org/apache/cxf/rs/security/jose/jws/JwsSignatureVerifier" });

classWriter.visitInnerClass("org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier$PublicKeyJwsVerificationSignature", "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "PublicKeyJwsVerificationSignature", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/cxf/rs/security/jose/jws/JwsException$Error", "org/apache/cxf/rs/security/jose/jws/JwsException", "Error", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "LOG", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "key", "Ljava/security/PublicKey;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "signatureSpec", "Ljava/security/spec/AlgorithmParameterSpec;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "supportedAlgo", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "cert", "Ljava/security/cert/X509Certificate;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/security/PublicKey;Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "<init>", "(Ljava/security/PublicKey;Ljava/security/spec/AlgorithmParameterSpec;Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/security/PublicKey;Ljava/security/spec/AlgorithmParameterSpec;Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "key", "Ljava/security/PublicKey;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "cert", "Ljava/security/cert/X509Certificate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "signatureSpec", "Ljava/security/spec/AlgorithmParameterSpec;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "supportedAlgo", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jws/JwsUtils", "checkSignatureKeySize", "(Ljava/security/Key;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/security/cert/X509Certificate;Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "<init>", "(Ljava/security/cert/X509Certificate;Ljava/security/spec/AlgorithmParameterSpec;Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/security/cert/X509Certificate;Ljava/security/spec/AlgorithmParameterSpec;Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509Certificate", "getPublicKey", "()Ljava/security/PublicKey;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "key", "Ljava/security/PublicKey;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "java/security/cert/X509Certificate", "java/security/spec/AlgorithmParameterSpec", "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "key", "Ljava/security/PublicKey;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "cert", "Ljava/security/cert/X509Certificate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "signatureSpec", "Ljava/security/spec/AlgorithmParameterSpec;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "supportedAlgo", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "key", "Ljava/security/PublicKey;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jws/JwsUtils", "checkSignatureKeySize", "(Ljava/security/Key;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "verify", "(Lorg/apache/cxf/rs/security/jose/jws/JwsHeaders;Ljava/lang/String;[B)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/StringUtils", "toBytesUTF8", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "key", "Ljava/security/PublicKey;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jws/JwsHeaders", "getSignatureAlgorithm", "()Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "checkAlgorithm", "(Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwa/AlgorithmUtils", "toJavaName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "signatureSpec", "Ljava/security/spec/AlgorithmParameterSpec;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rt/security/crypto/CryptoUtils", "verifySignature", "([B[BLjava/security/PublicKey;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;)Z", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Invalid signature: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "warning", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "INVALID_SIGNATURE", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsException", "<init>", "(Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "checkAlgorithm", "(Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("Signature algorithm is not set");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "warning", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "ALGORITHM_NOT_SET", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsException", "<init>", "(Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "isValidAlgorithmFamily", "(Ljava/lang/String;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "supportedAlgo", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Invalid signature algorithm: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "warning", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "INVALID_ALGORITHM", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsException", "<init>", "(Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "isValidAlgorithmFamily", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwa/AlgorithmUtils", "isRsaSign", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAlgorithm", "()Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "supportedAlgo", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getX509Certificate", "()Ljava/security/cert/X509Certificate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "cert", "Ljava/security/cert/X509Certificate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createJwsVerificationSignature", "(Lorg/apache/cxf/rs/security/jose/jws/JwsHeaders;)Lorg/apache/cxf/rs/security/jose/jws/JwsVerificationSignature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "key", "Ljava/security/PublicKey;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jws/JwsHeaders", "getSignatureAlgorithm", "()Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "checkAlgorithm", "(Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwa/AlgorithmUtils", "toJavaName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "signatureSpec", "Ljava/security/spec/AlgorithmParameterSpec;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rt/security/crypto/CryptoUtils", "getVerificationSignature", "(Ljava/security/PublicKey;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;)Ljava/security/Signature;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier$PublicKeyJwsVerificationSignature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier$PublicKeyJwsVerificationSignature", "<init>", "(Lorg/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier;Ljava/security/Signature;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/logging/LogUtils", "getL7dLogger", "(Ljava/lang/Class;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jws/PublicKeyJwsSignatureVerifier", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
