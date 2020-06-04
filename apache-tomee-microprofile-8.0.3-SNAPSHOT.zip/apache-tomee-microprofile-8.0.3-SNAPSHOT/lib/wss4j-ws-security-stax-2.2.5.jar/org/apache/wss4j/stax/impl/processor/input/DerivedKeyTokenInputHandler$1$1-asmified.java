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
public class DerivedKeyTokenInputHandler$1$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", null, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", null);

classWriter.visitOuterClass("org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", null, null, 0);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", null, null, 0);

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "org/apache/xml/security/stax/ext/XMLSecurityConstants", "AlgorithmUsage", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "TokenType", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "org/apache/wss4j/common/ext/WSSecurityException", "ErrorCode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "referencedSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1;Lorg/apache/xml/security/stax/ext/InboundSecurityContext;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "this$1", "Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "<init>", "(Lorg/apache/xml/security/stax/ext/InboundSecurityContext;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getReferencedSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "referencedSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "referencedSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "this$1", "Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$derivedKeyTokenType", "Lorg/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType", "getSecurityTokenReference", "()Lorg/apache/wss4j/binding/wss10/SecurityTokenReferenceType;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "this$1", "Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$securityProperties", "Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/ext/WSSSecurityProperties");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/ext/WSSSecurityProperties", "getDecryptionCrypto", "()Lorg/apache/wss4j/common/crypto/Crypto;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "this$1", "Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$securityProperties", "Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/ext/WSSSecurityProperties");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/ext/WSSSecurityProperties", "getCallbackHandler", "()Ljavax/security/auth/callback/CallbackHandler;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "this$1", "Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$inputProcessorChain", "Lorg/apache/xml/security/stax/ext/InputProcessorChain;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "getSecurityContext", "()Lorg/apache/xml/security/stax/ext/InboundSecurityContext;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "this$1", "Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$securityProperties", "Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/ext/WSSSecurityProperties");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenFactoryImpl", "getSecurityToken", "(Lorg/apache/wss4j/binding/wss10/SecurityTokenReferenceType;Lorg/apache/wss4j/common/crypto/Crypto;Ljavax/security/auth/callback/CallbackHandler;Lorg/apache/xml/security/stax/ext/InboundSecurityContext;Lorg/apache/wss4j/stax/ext/WSSSecurityProperties;)Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "referencedSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "referencedSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "addWrappedToken", "(Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "referencedSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getKey", "(Ljava/lang/String;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;Ljava/lang/String;)Ljava/security/Key;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "getReferencedSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/wss4j/stax/securityToken/UsernameSecurityToken");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/securityToken/UsernameSecurityToken");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/stax/securityToken/UsernameSecurityToken", "generateDerivedKey", "()[B", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, "org/apache/xml/security/stax/securityToken/InboundSecurityToken"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "getSecretKey", "(Ljava/lang/String;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;Ljava/lang/String;)Ljava/security/Key;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/Key", "getEncoded", "()[B", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "SECURITY_TOKEN_UNAVAILABLE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitLdcInsn("unsupportedKeyId");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException", "<init>", "(Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "java/lang/String", "org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "java/lang/String", "[B", "org/apache/xml/security/stax/securityToken/InboundSecurityToken"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "this$1", "Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$derivedKeyTokenType", "Lorg/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType", "getNonce", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[B"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "INVALID_SECURITY_TOKEN", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitLdcInsn("empty");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("Missing wsc:Nonce value");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException", "<init>", "(Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "this$1", "Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$derivedKeyTokenType", "Lorg/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType", "getAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc/dk/p_sha1");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "this$1", "Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$derivedKeyTokenType", "Lorg/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType", "getLabel", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "this$1", "Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$derivedKeyTokenType", "Lorg/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType", "getLength", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "intValue", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "this$1", "Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$derivedKeyTokenType", "Lorg/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType", "getOffset", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "intValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/common/derivedKey/DerivedKeyUtils", "deriveKey", "(Ljava/lang/String;Ljava/lang/String;I[B[BI)[B", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "Enc", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "equals", "(Ljava/lang/Object;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ENC_KD", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;");
methodVisitor.visitVarInsn(ASTORE, 9);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[B"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SIG_KD", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setAlgorithmURI", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setAlgorithmUsage", "(Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;)V", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setKeyLength", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setCorrelationID", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "this$1", "Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$inputProcessorChain", "Lorg/apache/xml/security/stax/ext/InputProcessorChain;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "getSecurityContext", "()Lorg/apache/xml/security/stax/ext/InboundSecurityContext;", true);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InboundSecurityContext", "registerSecurityEvent", "(Lorg/apache/xml/security/stax/securityEvent/SecurityEvent;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/config/JCEAlgorithmMapper", "getJCEKeyAlgorithmFromURI", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitTypeInsn(NEW, "javax/crypto/spec/SecretKeySpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/crypto/spec/SecretKeySpec", "<init>", "([BLjava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKeyWrappingToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "getReferencedSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTokenType", "()Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "DerivedKeyToken", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getKeyWrappingToken", "()Lorg/apache/xml/security/stax/securityToken/SecurityToken;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "getKeyWrappingToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
