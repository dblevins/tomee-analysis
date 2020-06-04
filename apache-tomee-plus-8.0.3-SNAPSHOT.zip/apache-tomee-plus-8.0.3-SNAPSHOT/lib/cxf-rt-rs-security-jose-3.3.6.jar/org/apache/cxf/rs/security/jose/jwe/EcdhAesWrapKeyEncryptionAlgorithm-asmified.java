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
public class EcdhAesWrapKeyEncryptionAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm", null, "java/lang/Object", new String[] { "org/apache/cxf/rs/security/jose/jwe/KeyEncryptionProvider" });

classWriter.visitInnerClass("org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ECDH_AES_MAP", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "keyAlgo", "Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "helper", "Lorg/apache/cxf/rs/security/jose/jwe/EcdhHelper;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/security/interfaces/ECPublicKey;Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("P-256");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm", "<init>", "(Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "A128GCM", "Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm", "<init>", "(Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm", "<init>", "(Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm", "keyAlgo", "Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwe/EcdhHelper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/EcdhHelper", "<init>", "(Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm", "helper", "Lorg/apache/cxf/rs/security/jose/jwe/EcdhHelper;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncryptedContentEncryptionKey", "(Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;[B)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm", "helper", "Lorg/apache/cxf/rs/security/jose/jwe/EcdhHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwe/EcdhHelper", "getDerivedKey", "(Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm", "keyAlgo", "Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm$1", "<init>", "(Lorg/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm;[BLorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/rs/security/jose/jwe/KeyEncryptionProvider", "getEncryptedContentEncryptionKey", "(Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;[B)[B", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAlgorithm", "()Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm", "keyAlgo", "Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm", "ECDH_AES_MAP", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm", "ECDH_AES_MAP", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/KeyAlgorithm", "ECDH_ES_A128KW", "Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/KeyAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/KeyAlgorithm", "A128KW", "Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/KeyAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm", "ECDH_AES_MAP", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/KeyAlgorithm", "ECDH_ES_A192KW", "Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/KeyAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/KeyAlgorithm", "A192KW", "Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/KeyAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwe/EcdhAesWrapKeyEncryptionAlgorithm", "ECDH_AES_MAP", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/KeyAlgorithm", "ECDH_ES_A256KW", "Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/KeyAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/KeyAlgorithm", "A256KW", "Lorg/apache/cxf/rs/security/jose/jwa/KeyAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/KeyAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
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
