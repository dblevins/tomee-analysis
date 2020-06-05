package asm.org.apache.wss4j.stax.impl.securityToken;
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
public class RsaKeyValueSecurityTokenImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", null, "org/apache/xml/security/stax/impl/securityToken/RsaKeyValueSecurityToken", new String[] { "org/apache/wss4j/stax/securityToken/RsaKeyValueSecurityToken" });

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "org/apache/xml/security/stax/ext/XMLSecurityConstants", "AlgorithmUsage", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "org/apache/wss4j/common/ext/WSSecurityException", "ErrorCode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "callbackHandler", "Ljavax/security/auth/callback/CallbackHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "crypto", "Lorg/apache/wss4j/common/crypto/Crypto;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "securityProperties", "Lorg/apache/wss4j/stax/ext/WSSSecurityProperties;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "principal", "Ljava/security/Principal;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xml/security/binding/xmldsig/RSAKeyValueType;Lorg/apache/wss4j/stax/ext/WSInboundSecurityContext;Lorg/apache/wss4j/common/crypto/Crypto;Ljavax/security/auth/callback/CallbackHandler;Lorg/apache/wss4j/stax/ext/WSSSecurityProperties;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/RsaKeyValueSecurityToken", "<init>", "(Lorg/apache/xml/security/binding/xmldsig/RSAKeyValueType;Lorg/apache/xml/security/stax/ext/InboundSecurityContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", "crypto", "Lorg/apache/wss4j/common/crypto/Crypto;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", "callbackHandler", "Ljavax/security/auth/callback/CallbackHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", "securityProperties", "Lorg/apache/wss4j/stax/ext/WSSSecurityProperties;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "verify", "()V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", "crypto", "Lorg/apache/wss4j/common/crypto/Crypto;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", "getPublicKey", "()Ljava/security/PublicKey;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/common/crypto/Crypto", "verifyTrust", "(Ljava/security/PublicKey;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSubject", "()Ljavax/security/auth/Subject;", null, new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKey", "(Ljava/lang/String;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;Ljava/lang/String;)Ljava/security/Key;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", "getPublicKey", "()Ljava/security/PublicKey;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", "crypto", "Lorg/apache/wss4j/common/crypto/Crypto;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", "callbackHandler", "Ljavax/security/auth/callback/CallbackHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/common/crypto/Crypto", "getPrivateKey", "(Ljava/security/PublicKey;Ljavax/security/auth/callback/CallbackHandler;)Ljava/security/PrivateKey;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", "java/lang/String", "org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "java/lang/String", "java/security/PublicKey"}, 1, new Object[] {"org/apache/wss4j/common/ext/WSSecurityException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", "securityProperties", "Lorg/apache/wss4j/stax/ext/WSSSecurityProperties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/ext/WSSSecurityProperties", "getDecryptionCrypto", "()Lorg/apache/wss4j/common/crypto/Crypto;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", "crypto", "Lorg/apache/wss4j/common/crypto/Crypto;");
methodVisitor.visitJumpInsn(IF_ACMPEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", "callbackHandler", "Ljavax/security/auth/callback/CallbackHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/common/crypto/Crypto", "getPrivateKey", "(Ljava/security/PublicKey;Ljavax/security/auth/callback/CallbackHandler;)Ljava/security/PrivateKey;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/wss4j/common/ext/WSSecurityException", "org/apache/wss4j/common/crypto/Crypto"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrincipal", "()Ljava/security/Principal;", null, new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", "principal", "Ljava/security/Principal;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/principal/PublicKeyPrincipalImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", "getPublicKey", "()Ljava/security/PublicKey;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/principal/PublicKeyPrincipalImpl", "<init>", "(Ljava/security/PublicKey;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", "principal", "Ljava/security/Principal;");
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/xml/security/exceptions/XMLSecurityException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "INVALID_SECURITY_TOKEN", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException", "<init>", "(Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/RsaKeyValueSecurityTokenImpl", "principal", "Ljava/security/Principal;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
