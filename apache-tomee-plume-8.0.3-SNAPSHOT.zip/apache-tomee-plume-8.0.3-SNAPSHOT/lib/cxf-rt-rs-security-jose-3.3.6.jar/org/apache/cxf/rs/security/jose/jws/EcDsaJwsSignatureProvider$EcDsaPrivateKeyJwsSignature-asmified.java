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
public class EcDsaJwsSignatureProvider$EcDsaPrivateKeyJwsSignatureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/rs/security/jose/jws/EcDsaJwsSignatureProvider$EcDsaPrivateKeyJwsSignature", null, "org/apache/cxf/rs/security/jose/jws/PrivateKeyJwsSignatureProvider$PrivateKeyJwsSignature", null);

classWriter.visitInnerClass("org/apache/cxf/rs/security/jose/jws/EcDsaJwsSignatureProvider$EcDsaPrivateKeyJwsSignature", "org/apache/cxf/rs/security/jose/jws/EcDsaJwsSignatureProvider", "EcDsaPrivateKeyJwsSignature", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/rs/security/jose/jws/PrivateKeyJwsSignatureProvider$PrivateKeyJwsSignature", "org/apache/cxf/rs/security/jose/jws/PrivateKeyJwsSignatureProvider", "PrivateKeyJwsSignature", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "outLen", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/security/Signature;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/PrivateKeyJwsSignatureProvider$PrivateKeyJwsSignature", "<init>", "(Ljava/security/Signature;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jws/EcDsaJwsSignatureProvider$EcDsaPrivateKeyJwsSignature", "outLen", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sign", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/PrivateKeyJwsSignatureProvider$PrivateKeyJwsSignature", "sign", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jws/EcDsaJwsSignatureProvider$EcDsaPrivateKeyJwsSignature", "outLen", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jws/EcDsaJwsSignatureProvider", "access$000", "(I[B)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
