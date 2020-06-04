package asm.org.apache.wss4j.stax.impl;
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
public class InboundWSSecurityContextImpl$MessageTokensDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl$MessageTokens", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl$MessageTokens", "org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl", "MessageTokens", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(0, "messageSignatureTokens", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent<+Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "messageEncryptionTokens", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent<+Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "supportingTokens", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent<+Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "signedSupportingTokens", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent<+Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "endorsingSupportingTokens", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent<+Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "signedEndorsingSupportingTokens", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent<+Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "signedEncryptedSupportingTokens", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent<+Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "encryptedSupportingTokens", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent<+Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "endorsingEncryptedSupportingTokens", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent<+Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "signedEndorsingEncryptedSupportingTokens", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent<+Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;>;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl$MessageTokens", "messageSignatureTokens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl$MessageTokens", "messageEncryptionTokens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl$MessageTokens", "supportingTokens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl$MessageTokens", "signedSupportingTokens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl$MessageTokens", "endorsingSupportingTokens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl$MessageTokens", "signedEndorsingSupportingTokens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl$MessageTokens", "signedEncryptedSupportingTokens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl$MessageTokens", "encryptedSupportingTokens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl$MessageTokens", "endorsingEncryptedSupportingTokens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl$MessageTokens", "signedEndorsingEncryptedSupportingTokens", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/wss4j/stax/impl/InboundWSSecurityContextImpl$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/InboundWSSecurityContextImpl$MessageTokens", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
