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
public class X509SecurityTokenImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", null, "org/apache/xml/security/stax/impl/securityToken/X509SecurityToken", new String[] { "org/apache/wss4j/stax/securityToken/X509SecurityToken" });

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "TokenType", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "org/apache/xml/security/stax/ext/XMLSecurityConstants", "AlgorithmUsage", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/wss4j/common/crypto/CryptoType$TYPE", "org/apache/wss4j/common/crypto/CryptoType", "TYPE", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "org/apache/wss4j/common/ext/WSSecurityException", "ErrorCode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_TRANSIENT, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
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
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;Lorg/apache/wss4j/stax/ext/WSInboundSecurityContext;Lorg/apache/wss4j/common/crypto/Crypto;Ljavax/security/auth/callback/CallbackHandler;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;Lorg/apache/wss4j/stax/ext/WSSSecurityProperties;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/X509SecurityToken", "<init>", "(Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;Lorg/apache/xml/security/stax/ext/InboundSecurityContext;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "crypto", "Lorg/apache/wss4j/common/crypto/Crypto;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "callbackHandler", "Ljavax/security/auth/callback/CallbackHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "securityProperties", "Lorg/apache/wss4j/stax/ext/WSSSecurityProperties;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getCrypto", "()Lorg/apache/wss4j/common/crypto/Crypto;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "crypto", "Lorg/apache/wss4j/common/crypto/Crypto;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setCrypto", "(Lorg/apache/wss4j/common/crypto/Crypto;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "crypto", "Lorg/apache/wss4j/common/crypto/Crypto;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCallbackHandler", "()Ljavax/security/auth/callback/CallbackHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "callbackHandler", "Ljavax/security/auth/callback/CallbackHandler;");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSPasswordCallback");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "getAlias", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSPasswordCallback", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "getCallbackHandler", "()Ljavax/security/auth/callback/CallbackHandler;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/utils/WSSUtils", "doPasswordCallback", "(Ljavax/security/auth/callback/CallbackHandler;Ljavax/security/auth/callback/Callback;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "getCrypto", "()Lorg/apache/wss4j/common/crypto/Crypto;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "getAlias", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/ext/WSPasswordCallback", "getPassword", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/common/crypto/Crypto", "getPrivateKey", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/PrivateKey;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "java/lang/String", "org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "java/lang/String", "org/apache/wss4j/common/ext/WSPasswordCallback"}, 1, new Object[] {"org/apache/wss4j/common/ext/WSSecurityException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "securityProperties", "Lorg/apache/wss4j/stax/ext/WSSSecurityProperties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/ext/WSSSecurityProperties", "getDecryptionCrypto", "()Lorg/apache/wss4j/common/crypto/Crypto;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "getCrypto", "()Lorg/apache/wss4j/common/crypto/Crypto;", false);
methodVisitor.visitJumpInsn(IF_ACMPEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "getAlias", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/ext/WSPasswordCallback", "getPassword", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/common/crypto/Crypto", "getPrivateKey", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/PrivateKey;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/wss4j/common/ext/WSSecurityException", "org/apache/wss4j/common/crypto/Crypto"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getX509Certificates", "()[Ljava/security/cert/X509Certificate;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/X509SecurityToken", "getX509Certificates", "()[Ljava/security/cert/X509Certificate;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "getAlias", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/crypto/CryptoType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/crypto/CryptoType$TYPE", "ALIAS", "Lorg/apache/wss4j/common/crypto/CryptoType$TYPE;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/crypto/CryptoType", "<init>", "(Lorg/apache/wss4j/common/crypto/CryptoType$TYPE;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/crypto/CryptoType", "setAlias", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "getCrypto", "()Lorg/apache/wss4j/common/crypto/Crypto;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/common/crypto/Crypto", "getX509Certificates", "(Lorg/apache/wss4j/common/crypto/CryptoType;)[Ljava/security/cert/X509Certificate;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "setX509Certificates", "([Ljava/security/cert/X509Certificate;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/X509SecurityToken", "getX509Certificates", "()[Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "verify", "()V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "getX509Certificates", "()[Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "securityProperties", "Lorg/apache/wss4j/stax/ext/WSSSecurityProperties;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "securityProperties", "Lorg/apache/wss4j/stax/ext/WSSSecurityProperties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/ext/WSSSecurityProperties", "isEnableRevocation", "()Z", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "securityProperties", "Lorg/apache/wss4j/stax/ext/WSSSecurityProperties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/ext/WSSSecurityProperties", "getSubjectCertConstraints", "()Ljava/util/Collection;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "securityProperties", "Lorg/apache/wss4j/stax/ext/WSSSecurityProperties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/ext/WSSSecurityProperties", "getIssuerDNConstraints", "()Ljava/util/Collection;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "[Ljava/security/cert/X509Certificate;", Opcodes.INTEGER, "java/util/Collection", "java/util/Collection"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "getCrypto", "()Lorg/apache/wss4j/common/crypto/Crypto;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/common/crypto/Crypto", "verifyTrust", "([Ljava/security/cert/X509Certificate;ZLjava/util/Collection;Ljava/util/Collection;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "matches", "(Ljava/security/cert/X509Certificate;Ljava/util/Collection;)Z", "(Ljava/security/cert/X509Certificate;Ljava/util/Collection<Ljava/util/regex/Pattern;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "isEmpty", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("No Subject DN Certificate Constraints were defined. This could be a security issue");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "isEmpty", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("The certificate is null so no constraints matching was possible");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509Certificate", "getSubjectX500Principal", "()Ljavax/security/auth/x500/X500Principal;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/auth/x500/X500Principal", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/String", Opcodes.INTEGER, "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/regex/Pattern");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Pattern", "matcher", "(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "matches", "()Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Subject DN {} matches with pattern {}");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "getAlias", "()Ljava/lang/String;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrincipal", "()Ljava/security/Principal;", null, new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/xml/security/exceptions/XMLSecurityException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "principal", "Ljava/security/Principal;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "getX509Certificates", "()[Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFLE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509Certificate", "getSubjectX500Principal", "()Ljavax/security/auth/x500/X500Principal;", false);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "principal", "Ljava/security/Principal;");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Ljava/security/cert/X509Certificate;"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/principal/PublicKeyPrincipalImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "getPublicKey", "()Ljava/security/PublicKey;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/principal/PublicKeyPrincipalImpl", "<init>", "(Ljava/security/PublicKey;)V", false);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "principal", "Ljava/security/Principal;");
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl"}, 1, new Object[] {"org/apache/xml/security/exceptions/XMLSecurityException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "INVALID_SECURITY_TOKEN", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException", "<init>", "(Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "principal", "Ljava/security/Principal;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTokenType", "()Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/X509SecurityToken", "getTokenType", "()Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "X509V3Token", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/X509SecurityToken", "getX509Certificates", "()[Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFLE, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509Certificate", "getVersion", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "X509V1Token", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType"}, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/xml/security/exceptions/XMLSecurityException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/impl/securityToken/X509SecurityTokenImpl", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
