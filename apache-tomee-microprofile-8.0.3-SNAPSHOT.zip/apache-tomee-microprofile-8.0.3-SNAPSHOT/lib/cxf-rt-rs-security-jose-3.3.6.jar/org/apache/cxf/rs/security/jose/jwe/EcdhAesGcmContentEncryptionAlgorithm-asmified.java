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
public class EcdhAesGcmContentEncryptionAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/rs/security/jose/jwe/EcdhAesGcmContentEncryptionAlgorithm", null, "org/apache/cxf/rs/security/jose/jwe/AesGcmContentEncryptionAlgorithm", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "helper", "Lorg/apache/cxf/rs/security/jose/jwe/EcdhHelper;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/AesGcmContentEncryptionAlgorithm", "<init>", "(Lorg/apache/cxf/rs/security/jose/jwa/ContentAlgorithm;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwe/EcdhHelper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/ContentAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/EcdhHelper", "<init>", "(Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwe/EcdhAesGcmContentEncryptionAlgorithm", "helper", "Lorg/apache/cxf/rs/security/jose/jwe/EcdhHelper;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContentEncryptionKey", "(Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/EcdhAesGcmContentEncryptionAlgorithm", "helper", "Lorg/apache/cxf/rs/security/jose/jwe/EcdhHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwe/EcdhHelper", "getDerivedKey", "(Lorg/apache/cxf/rs/security/jose/jwe/JweHeaders;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
