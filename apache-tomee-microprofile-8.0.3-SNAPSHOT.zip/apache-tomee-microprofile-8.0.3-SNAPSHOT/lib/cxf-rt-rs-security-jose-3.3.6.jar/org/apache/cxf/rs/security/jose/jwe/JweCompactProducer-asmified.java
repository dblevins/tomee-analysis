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
public class JweCompactProducerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/rs/security/jose/jwe/JweCompactProducer", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "headers", "Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "data", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwe/JweHeaders");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/JweHeaders", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/JweCompactProducer", "<init>", "(Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwe/JweCompactProducer", "headers", "Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwe/JweCompactProducer", "data", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encryptWith", "(Lorg/apache/cxf/rs/security/jose/jwk/JsonWebKey;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/JweCompactProducer", "headers", "Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwe/JweUtils", "createJweEncryptionProvider", "(Lorg/apache/cxf/rs/security/jose/jwk/JsonWebKey;Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;)Lorg/apache/cxf/rs/security/jose/jwe/JweEncryptionProvider;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwe/JweCompactProducer", "encryptWith", "(Lorg/apache/cxf/rs/security/jose/jwe/JweEncryptionProvider;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encryptWith", "(Ljava/security/PublicKey;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/JweCompactProducer", "headers", "Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwe/JweUtils", "createJweEncryptionProvider", "(Ljava/security/PublicKey;Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;)Lorg/apache/cxf/rs/security/jose/jwe/JweEncryptionProvider;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwe/JweCompactProducer", "encryptWith", "(Lorg/apache/cxf/rs/security/jose/jwe/JweEncryptionProvider;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encryptWith", "(Ljavax/crypto/SecretKey;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/JweCompactProducer", "headers", "Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwe/JweUtils", "createJweEncryptionProvider", "(Ljavax/crypto/SecretKey;Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;)Lorg/apache/cxf/rs/security/jose/jwe/JweEncryptionProvider;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwe/JweCompactProducer", "encryptWith", "(Lorg/apache/cxf/rs/security/jose/jwe/JweEncryptionProvider;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encryptWith", "(Lorg/apache/cxf/rs/security/jose/jwe/JweEncryptionProvider;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/JweCompactProducer", "data", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/StringUtils", "toBytesUTF8", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/JweCompactProducer", "headers", "Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/rs/security/jose/jwe/JweEncryptionProvider", "encrypt", "([BLorg/apache/cxf/rs/security/jose/jwe/JweHeaders;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
