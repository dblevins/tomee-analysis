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
public class DirectKeyJweDecryptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/rs/security/jose/jwe/DirectKeyJweDecryption", null, "org/apache/cxf/rs/security/jose/jwe/JweDecryption", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Lorg/apache/cxf/rs/security/jose/jwe/ContentDecryptionProvider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwe/DirectKeyDecryptionAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/DirectKeyDecryptionAlgorithm", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/JweDecryption", "<init>", "(Lorg/apache/cxf/rs/security/jose/jwe/KeyDecryptionProvider;Lorg/apache/cxf/rs/security/jose/jwe/ContentDecryptionProvider;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "([BLorg/apache/cxf/rs/security/jose/jwe/ContentDecryptionProvider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwe/DirectKeyDecryptionAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/DirectKeyDecryptionAlgorithm", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwe/JweDecryption", "<init>", "(Lorg/apache/cxf/rs/security/jose/jwe/KeyDecryptionProvider;Lorg/apache/cxf/rs/security/jose/jwe/ContentDecryptionProvider;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
