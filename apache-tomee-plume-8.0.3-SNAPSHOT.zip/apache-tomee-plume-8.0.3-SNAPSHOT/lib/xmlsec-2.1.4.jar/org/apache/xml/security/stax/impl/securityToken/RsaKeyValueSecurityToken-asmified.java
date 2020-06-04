package asm.org.apache.xml.security.stax.impl.securityToken;
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
public class RsaKeyValueSecurityTokenDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/xml/security/stax/impl/securityToken/RsaKeyValueSecurityToken", null, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", null);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "TokenType", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "rsaKeyValueType", "Lorg/apache/xml/security/binding/xmldsig/RSAKeyValueType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xml/security/binding/xmldsig/RSAKeyValueType;Lorg/apache/xml/security/stax/ext/InboundSecurityContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/impl/util/IDGenerator", "generateID", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier_KeyValue", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "<init>", "(Lorg/apache/xml/security/stax/ext/InboundSecurityContext;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/securityToken/RsaKeyValueSecurityToken", "rsaKeyValueType", "Lorg/apache/xml/security/binding/xmldsig/RSAKeyValueType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "buildPublicKey", "(Lorg/apache/xml/security/binding/xmldsig/RSAKeyValueType;)Ljava/security/PublicKey;", null, new String[] { "java/security/spec/InvalidKeySpecException", "java/security/NoSuchAlgorithmException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/security/spec/RSAPublicKeySpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/RSAKeyValueType", "getModulus", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(I[B)V", false);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/RSAKeyValueType", "getExponent", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(I[B)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/spec/RSAPublicKeySpec", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLdcInsn("RSA");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/KeyFactory", "getInstance", "(Ljava/lang/String;)Ljava/security/KeyFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/KeyFactory", "generatePublic", "(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPublicKey", "()Ljava/security/PublicKey;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/spec/InvalidKeySpecException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/security/NoSuchAlgorithmException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "getPublicKey", "()Ljava/security/PublicKey;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/RsaKeyValueSecurityToken", "rsaKeyValueType", "Lorg/apache/xml/security/binding/xmldsig/RSAKeyValueType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/RsaKeyValueSecurityToken", "buildPublicKey", "(Lorg/apache/xml/security/binding/xmldsig/RSAKeyValueType;)Ljava/security/PublicKey;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/securityToken/RsaKeyValueSecurityToken", "setPublicKey", "(Ljava/security/PublicKey;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/spec/InvalidKeySpecException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/NoSuchAlgorithmException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "getPublicKey", "()Ljava/security/PublicKey;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAsymmetric", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTokenType", "()Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyValueToken", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
