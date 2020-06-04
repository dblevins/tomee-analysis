package asm.org.apache.wss4j.stax.impl.processor.input;
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
public class DecryptInputProcessor$DeferredAttachmentDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$DeferredAttachment", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$DeferredAttachment", "org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor", "DeferredAttachment", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "encryptedDataType", "Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cipher", "Ljavax/crypto/Cipher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;Ljavax/crypto/Cipher;Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$DeferredAttachment", "encryptedDataType", "Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$DeferredAttachment", "cipher", "Ljavax/crypto/Cipher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$DeferredAttachment", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getEncryptedDataType", "()Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$DeferredAttachment", "encryptedDataType", "Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getCipher", "()Ljavax/crypto/Cipher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$DeferredAttachment", "cipher", "Ljavax/crypto/Cipher;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getInboundSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$DeferredAttachment", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;Ljavax/crypto/Cipher;Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Lorg/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$DeferredAttachment", "<init>", "(Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;Ljavax/crypto/Cipher;Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$DeferredAttachment;)Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$DeferredAttachment", "getEncryptedDataType", "()Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$DeferredAttachment;)Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$DeferredAttachment", "getInboundSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$DeferredAttachment;)Ljavax/crypto/Cipher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/processor/input/DecryptInputProcessor$DeferredAttachment", "getCipher", "()Ljavax/crypto/Cipher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
