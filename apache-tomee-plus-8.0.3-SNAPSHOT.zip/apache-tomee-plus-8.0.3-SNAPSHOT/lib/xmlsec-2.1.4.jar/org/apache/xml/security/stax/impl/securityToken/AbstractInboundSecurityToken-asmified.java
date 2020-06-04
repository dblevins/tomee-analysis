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
public class AbstractInboundSecurityTokenDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", null, "org/apache/xml/security/stax/impl/securityToken/AbstractSecurityToken", new String[] { "org/apache/xml/security/stax/securityToken/InboundSecurityToken" });

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "org/apache/xml/security/stax/ext/XMLSecurityConstants", "AlgorithmUsage", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "TokenUsage", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "TokenType", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "invoked", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "inboundSecurityContext", "Lorg/apache/xml/security/stax/ext/InboundSecurityContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "elementPath", "Ljava/util/List;", "Ljava/util/List<Ljavax/xml/namespace/QName;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xmlSecEvent", "Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyIdentifier", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "wrappedTokens", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyWrappingToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "includedInMessage", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xml/security/stax/ext/InboundSecurityContext;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/AbstractSecurityToken", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "invoked", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "wrappedTokens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "includedInMessage", "Z");
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No keyIdentifier specified");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "org/apache/xml/security/stax/ext/InboundSecurityContext", "java/lang/String", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "inboundSecurityContext", "Lorg/apache/xml/security/stax/ext/InboundSecurityContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "keyIdentifier", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "includedInMessage", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "testAndSetInvocation", "()V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "invoked", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("stax.recursiveKeyReference");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "invoked", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "unsetInvocation", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "invoked", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKeyIdentifier", "()Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "keyIdentifier", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementPath", "()Ljava/util/List;", "()Ljava/util/List<Ljavax/xml/namespace/QName;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "elementPath", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setElementPath", "(Ljava/util/List;)V", "(Ljava/util/List<Ljavax/xml/namespace/QName;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableList", "(Ljava/util/List;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "elementPath", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXMLSecEvent", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "xmlSecEvent", "Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setXMLSecEvent", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "xmlSecEvent", "Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getKey", "(Ljava/lang/String;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;Ljava/lang/String;)Ljava/security/Key;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "keyTable", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/Key");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "keyTable", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/Key");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/security/Key"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getSecretKey", "(Ljava/lang/String;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;Ljava/lang/String;)Ljava/security/Key;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("correlationID must not be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "testAndSetInvocation", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "getKey", "(Ljava/lang/String;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;Ljava/lang/String;)Ljava/security/Key;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "inboundSecurityContext", "Lorg/apache/xml/security/stax/ext/InboundSecurityContext;");
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setAlgorithmURI", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setAlgorithmUsage", "(Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setCorrelationID", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "DerivedKeyToken", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "getTokenType", "()Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setDerivedKey", "(Z)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/security/Key", "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/interfaces/RSAKey");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/interfaces/RSAKey");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/interfaces/RSAKey", "getModulus", "()Ljava/math/BigInteger;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "bitLength", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setKeyLength", "(I)V", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/interfaces/DSAKey");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/interfaces/DSAKey");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/interfaces/DSAKey", "getParams", "()Ljava/security/interfaces/DSAParams;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/interfaces/DSAParams", "getP", "()Ljava/math/BigInteger;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "bitLength", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setKeyLength", "(I)V", false);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/interfaces/ECKey");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/interfaces/ECKey");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/interfaces/ECKey", "getParams", "()Ljava/security/spec/ECParameterSpec;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/ECParameterSpec", "getOrder", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "bitLength", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setKeyLength", "(I)V", false);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/crypto/SecretKey");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/Key", "getEncoded", "()[B", true);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setKeyLength", "(I)V", false);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("java.security.UnknownKeyType");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "inboundSecurityContext", "Lorg/apache/xml/security/stax/ext/InboundSecurityContext;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InboundSecurityContext", "registerSecurityEvent", "(Lorg/apache/xml/security/stax/securityEvent/SecurityEvent;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "unsetInvocation", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getPubKey", "(Ljava/lang/String;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;Ljava/lang/String;)Ljava/security/PublicKey;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "getPublicKey", "()Ljava/security/PublicKey;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getPublicKey", "(Ljava/lang/String;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;Ljava/lang/String;)Ljava/security/PublicKey;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("correlationID must not be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "testAndSetInvocation", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "getPubKey", "(Ljava/lang/String;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;Ljava/lang/String;)Ljava/security/PublicKey;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "inboundSecurityContext", "Lorg/apache/xml/security/stax/ext/InboundSecurityContext;");
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setAlgorithmURI", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setAlgorithmUsage", "(Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setCorrelationID", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/interfaces/RSAKey");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/interfaces/RSAKey");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/interfaces/RSAKey", "getModulus", "()Ljava/math/BigInteger;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "bitLength", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setKeyLength", "(I)V", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/security/PublicKey", "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/interfaces/DSAKey");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/interfaces/DSAKey");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/interfaces/DSAKey", "getParams", "()Ljava/security/interfaces/DSAParams;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/interfaces/DSAParams", "getP", "()Ljava/math/BigInteger;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "bitLength", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setKeyLength", "(I)V", false);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/interfaces/ECKey");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/interfaces/ECKey");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/interfaces/ECKey", "getParams", "()Ljava/security/spec/ECParameterSpec;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/ECParameterSpec", "getOrder", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "bitLength", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setKeyLength", "(I)V", false);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("java.security.UnknownKeyType");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "inboundSecurityContext", "Lorg/apache/xml/security/stax/ext/InboundSecurityContext;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InboundSecurityContext", "registerSecurityEvent", "(Lorg/apache/xml/security/stax/securityEvent/SecurityEvent;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "unsetInvocation", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "verify", "()V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrappedTokens", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "wrappedTokens", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableList", "(Ljava/util/List;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addWrappedToken", "(Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "wrappedTokens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addTokenUsage", "(Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "testAndSetInvocation", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "tokenUsages", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "contains", "(Ljava/lang/Object;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "tokenUsages", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "getKeyWrappingToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "getKeyWrappingToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "addTokenUsage", "(Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "unsetInvocation", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKeyWrappingToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "keyWrappingToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setKeyWrappingToken", "(Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "keyWrappingToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isIncludedInMessage", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "includedInMessage", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getKeyWrappingToken", "()Lorg/apache/xml/security/stax/securityToken/SecurityToken;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "getKeyWrappingToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
