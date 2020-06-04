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
public class AesCbcContentEncryptionAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/rs/security/jose/jwe/AesCbcContentEncryptionAlgorithm", null, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", null);

classWriter.visitInnerClass("org/apache/cxf/rs/security/jose/jwe/JweException$Error", "org/apache/cxf/rs/security/jose/jwe/JweException", "Error", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "AES_HMAC_MAP", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "AES_CEK_SIZE_MAP", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwe/AesCbcContentEncryptionAlgorithm", "validateCekAlgorithm", "(Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;)Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "<init>", "(Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "([B[BLorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwe/AesCbcContentEncryptionAlgorithm", "validateCekAlgorithm", "(Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;)Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/AbstractContentEncryptionAlgorithm", "<init>", "([B[BLorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
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
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getContentEncryptionKeySize", "(Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwe/AesCbcContentEncryptionAlgorithm", "getAlgorithm", "()Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwe/AesCbcContentEncryptionAlgorithm", "getFullCekKeySize", "(Ljava/lang/String;)I", false);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "getFullCekKeySize", "(Ljava/lang/String;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwe/AesCbcContentEncryptionAlgorithm", "AES_CEK_SIZE_MAP", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "getHMACAlgorithm", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwe/AesCbcContentEncryptionAlgorithm", "AES_HMAC_MAP", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "validateCekAlgorithm", "(Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;)Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwa/AlgorithmUtils", "isAesCbcHmac", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwe/AesCbcContentEncryptionAlgorithm", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("Invalid content encryption algorithm");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "warning", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwe/JweException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwe/JweException$Error", "INVALID_CONTENT_ALGORITHM", "Lorg/apache/cxf/rs/security/jose/jwe/JweException$Error;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/JweException", "<init>", "(Lorg/apache/cxf/rs/security/jose/jwe/JweException$Error;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwe/AesCbcContentEncryptionAlgorithm", "AES_HMAC_MAP", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwe/AesCbcContentEncryptionAlgorithm", "AES_HMAC_MAP", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "A128CBC_HS256", "Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("HmacSHA256");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwe/AesCbcContentEncryptionAlgorithm", "AES_HMAC_MAP", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "A192CBC_HS384", "Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("HmacSHA384");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwe/AesCbcContentEncryptionAlgorithm", "AES_HMAC_MAP", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "A256CBC_HS512", "Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("HmacSHA512");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwe/AesCbcContentEncryptionAlgorithm", "AES_CEK_SIZE_MAP", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwe/AesCbcContentEncryptionAlgorithm", "AES_CEK_SIZE_MAP", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "A128CBC_HS256", "Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwe/AesCbcContentEncryptionAlgorithm", "AES_CEK_SIZE_MAP", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "A192CBC_HS384", "Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwe/AesCbcContentEncryptionAlgorithm", "AES_CEK_SIZE_MAP", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "A256CBC_HS512", "Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
