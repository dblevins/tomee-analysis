package asm.org.apache.wss4j.dom.action;
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
public class SAMLTokenSignedActionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/dom/action/SAMLTokenSignedAction", null, "java/lang/Object", new String[] { "org/apache/wss4j/dom/action/Action" });

classWriter.visitInnerClass("org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "org/apache/wss4j/common/ext/WSSecurityException", "ErrorCode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Lorg/apache/wss4j/dom/handler/WSHandler;Lorg/apache/wss4j/common/SecurityActionToken;Lorg/apache/wss4j/dom/handler/RequestData;)V", null, new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/WSHandler", "loadSignatureCrypto", "(Lorg/apache/wss4j/dom/handler/RequestData;)Lorg/apache/wss4j/common/crypto/Crypto;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/wss4j/dom/action/SAMLTokenSignedAction", "org/apache/wss4j/dom/handler/WSHandler", "org/apache/wss4j/common/SecurityActionToken", "org/apache/wss4j/dom/handler/RequestData", "org/apache/wss4j/common/crypto/Crypto"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/dom/action/SAMLTokenSignedAction", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("samlCallbackClass");
methodVisitor.visitLdcInsn("samlCallbackRef");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/WSHandler", "getCallbackHandler", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/wss4j/dom/handler/RequestData;)Ljavax/security/auth/callback/CallbackHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILURE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitLdcInsn("noSAMLCallbackHandler");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException", "<init>", "(Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/security/auth/callback/CallbackHandler"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/saml/SAMLCallback");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/saml/SAMLCallback", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/common/saml/SAMLUtil", "doSAMLCallback", "(Ljavax/security/auth/callback/CallbackHandler;Lorg/apache/wss4j/common/saml/SAMLCallback;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/saml/SamlAssertionWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/saml/SamlAssertionWrapper", "<init>", "(Lorg/apache/wss4j/common/saml/SAMLCallback;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SAMLCallback", "isSignAssertion", "()Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SAMLCallback", "getIssuerKeyName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SAMLCallback", "getIssuerKeyPassword", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SAMLCallback", "getIssuerCrypto", "()Lorg/apache/wss4j/common/crypto/Crypto;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SAMLCallback", "isSendKeyValue", "()Z", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SAMLCallback", "getCanonicalizationAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SAMLCallback", "getSignatureAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SAMLCallback", "getSignatureDigestAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SamlAssertionWrapper", "signAssertion", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/wss4j/common/crypto/Crypto;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/wss4j/common/saml/SAMLCallback", "org/apache/wss4j/common/saml/SamlAssertionWrapper"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/dom/saml/WSSecSignatureSAML");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getSecHeader", "()Lorg/apache/wss4j/dom/message/WSSecHeader;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/saml/WSSecSignatureSAML", "<init>", "(Lorg/apache/wss4j/dom/message/WSSecHeader;)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getWssConfig", "()Lorg/apache/wss4j/dom/engine/WSSConfig;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/engine/WSSConfig", "getIdAllocator", "()Lorg/apache/wss4j/dom/WsuIdAllocator;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/saml/WSSecSignatureSAML", "setIdAllocator", "(Lorg/apache/wss4j/dom/WsuIdAllocator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "isAddInclusivePrefixes", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/saml/WSSecSignatureSAML", "setAddInclusivePrefixes", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getWsDocInfo", "()Lorg/apache/wss4j/dom/WSDocInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/saml/WSSecSignatureSAML", "setWsDocInfo", "(Lorg/apache/wss4j/dom/WSDocInfo;)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "isExpandXopInclude", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/saml/WSSecSignatureSAML", "setExpandXopInclude", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getSignatureProvider", "()Ljava/security/Provider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/saml/WSSecSignatureSAML", "setSignatureProvider", "(Ljava/security/Provider;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/WSHandler", "getPasswordCallbackHandler", "(Lorg/apache/wss4j/dom/handler/RequestData;)Ljavax/security/auth/callback/CallbackHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/wss4j/common/SignatureActionToken");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/common/SignatureActionToken");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/wss4j/dom/saml/WSSecSignatureSAML", "javax/security/auth/callback/CallbackHandler", "org/apache/wss4j/common/SignatureActionToken"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getSignatureToken", "()Lorg/apache/wss4j/common/SignatureActionToken;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getUser", "()Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/WSHandler", "getPasswordCB", "(Ljava/lang/String;ILjavax/security/auth/callback/CallbackHandler;Lorg/apache/wss4j/dom/handler/RequestData;)Lorg/apache/wss4j/common/ext/WSPasswordCallback;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getUser", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/ext/WSPasswordCallback", "getPassword", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/saml/WSSecSignatureSAML", "setUserInfo", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getKeyIdentifierId", "()I", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getKeyIdentifierId", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/saml/WSSecSignatureSAML", "setKeyIdentifierType", "(I)V", false);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/wss4j/common/ext/WSPasswordCallback"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getSignatureAlgorithm", "()Ljava/lang/String;", false);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getSignatureAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/saml/WSSecSignatureSAML", "setSignatureAlgorithm", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getDigestAlgorithm", "()Ljava/lang/String;", false);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label13);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getDigestAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/saml/WSSecSignatureSAML", "setDigestAlgo", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getC14nAlgorithm", "()Ljava/lang/String;", false);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getC14nAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/saml/WSSecSignatureSAML", "setSigCanonicalization", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getKeyInfoElement", "()Lorg/w3c/dom/Element;", false);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label15);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getKeyInfoElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/saml/WSSecSignatureSAML", "setCustomKeyInfoElement", "(Lorg/w3c/dom/Element;)V", false);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getParts", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/saml/WSSecSignatureSAML", "getParts", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getParts", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SAMLCallback", "getIssuerCrypto", "()Lorg/apache/wss4j/common/crypto/Crypto;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SAMLCallback", "getIssuerKeyName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SAMLCallback", "getIssuerKeyPassword", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/saml/WSSecSignatureSAML", "build", "(Lorg/apache/wss4j/common/crypto/Crypto;Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;Lorg/apache/wss4j/common/crypto/Crypto;Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getSignatureValues", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/saml/WSSecSignatureSAML", "getSignatureValue", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SamlAssertionWrapper", "getSignatureValue", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getSignatureValues", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label16 = new Label();
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/wss4j/common/ext/WSSecurityException"});
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILURE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitLdcInsn("empty");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("Error when signing the SAML token: ");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException", "<init>", "(Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 13);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/dom/action/SAMLTokenSignedAction;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/dom/action/SAMLTokenSignedAction", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}