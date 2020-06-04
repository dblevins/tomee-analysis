package asm.org.apache.cxf.rs.security.jose.common;
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
public class JoseConsumerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/rs/security/jose/common/JoseConsumer", null, "org/apache/cxf/rs/security/jose/common/AbstractJoseConsumer", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/common/AbstractJoseConsumer", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getData", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/common/AbstractJoseConsumer", "checkProcessRequirements", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/common/JoseConsumer", "isJweRequired", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwe/JweCompactConsumer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/JweCompactConsumer", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwe/JweCompactConsumer", "getJweHeaders", "()Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/common/JoseConsumer", "getInitializedDecryptionProvider", "(Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;)Lorg/apache/cxf/rs/security/jose/jwe/JweDecryptionProvider;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwt/JwtException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to decrypt JWT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwt/JwtException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/cxf/rs/security/jose/jwe/JweCompactConsumer", "org/apache/cxf/rs/security/jose/jwe/JweDecryptionProvider"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/common/JoseConsumer", "isJwsRequired", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwe/JweCompactConsumer", "getDecryptedContentText", "(Lorg/apache/cxf/rs/security/jose/jwe/JweDecryptionProvider;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/rs/security/jose/jwe/JweDecryptionProvider", "decrypt", "(Ljava/lang/String;)Lorg/apache/cxf/rs/security/jose/jwe/JweDecryptionOutput;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwe/JweDecryptionOutput", "getContentText", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsCompactConsumer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsCompactConsumer", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/common/JoseConsumer", "isJwsRequired", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jws/JwsCompactConsumer", "getJwsHeaders", "()Lorg/apache/cxf/rs/security/jose/jws/JwsHeaders;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/common/JoseConsumer", "getInitializedSignatureVerifier", "(Lorg/apache/cxf/rs/security/jose/jws/JwsHeaders;)Lorg/apache/cxf/rs/security/jose/jws/JwsSignatureVerifier;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwt/JwtException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to validate JWT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwt/JwtException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/cxf/rs/security/jose/jws/JwsCompactConsumer", "org/apache/cxf/rs/security/jose/jws/JwsSignatureVerifier"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jws/JwsCompactConsumer", "verifySignatureWith", "(Lorg/apache/cxf/rs/security/jose/jws/JwsSignatureVerifier;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwt/JwtException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Invalid Signature");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwt/JwtException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jws/JwsCompactConsumer", "getDecodedJwsPayload", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
