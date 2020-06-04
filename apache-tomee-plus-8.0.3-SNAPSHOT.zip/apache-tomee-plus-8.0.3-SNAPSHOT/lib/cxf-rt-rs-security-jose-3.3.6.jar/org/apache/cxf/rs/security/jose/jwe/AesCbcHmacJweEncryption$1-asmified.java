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
public class AesCbcHmacJweEncryption$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption$1", null, "java/lang/Object", new String[] { "org/apache/cxf/rs/security/jose/jwe/AuthenticationTagProducer" });

classWriter.visitOuterClass("org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption", "getAuthenticationTagProducer", "(Lorg/apache/cxf/rs/security/jose/jwe/AbstractJweEncryption$JweEncryptionInternal;)Lorg/apache/cxf/rs/security/jose/jwe/AuthenticationTagProducer;");

classWriter.visitInnerClass("org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption$MacState", "org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption", "MacState", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption$1", null, null, 0);

classWriter.visitInnerClass("org/apache/cxf/rs/security/jose/jwe/AbstractJweEncryption$JweEncryptionInternal", "org/apache/cxf/rs/security/jose/jwe/AbstractJweEncryption", "JweEncryptionInternal", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$macState", "Lorg/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption$MacState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption;Lorg/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption$MacState;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption$1", "this$0", "Lorg/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption$1", "val$macState", "Lorg/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption$MacState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "update", "([BII)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption$1", "val$macState", "Lorg/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption$MacState;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption$MacState", "mac", "Ljavax/crypto/Mac;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/Mac", "update", "([BII)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTag", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption$1", "val$macState", "Lorg/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption$MacState;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption", "signAndGetTag", "(Lorg/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption$MacState;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
