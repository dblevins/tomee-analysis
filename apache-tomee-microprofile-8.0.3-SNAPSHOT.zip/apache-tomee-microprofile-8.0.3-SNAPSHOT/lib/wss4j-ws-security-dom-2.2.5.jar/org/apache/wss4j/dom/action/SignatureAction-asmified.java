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
public class SignatureActionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/dom/action/SignatureAction", null, "java/lang/Object", new String[] { "org/apache/wss4j/dom/action/Action" });

classWriter.visitInnerClass("org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "org/apache/wss4j/common/ext/WSSecurityException", "ErrorCode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

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
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getCallbackHandler", "()Ljavax/security/auth/callback/CallbackHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/WSHandler", "getPasswordCallbackHandler", "(Lorg/apache/wss4j/dom/handler/RequestData;)Ljavax/security/auth/callback/CallbackHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/security/auth/callback/CallbackHandler"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/wss4j/common/SignatureActionToken");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/common/SignatureActionToken");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/wss4j/common/SignatureActionToken"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getSignatureToken", "()Lorg/apache/wss4j/common/SignatureActionToken;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getUser", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/WSHandler", "getPasswordCB", "(Ljava/lang/String;ILjavax/security/auth/callback/CallbackHandler;Lorg/apache/wss4j/dom/handler/RequestData;)Lorg/apache/wss4j/common/ext/WSPasswordCallback;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/dom/message/WSSecSignature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getSecHeader", "()Lorg/apache/wss4j/dom/message/WSSecHeader;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/message/WSSecSignature", "<init>", "(Lorg/apache/wss4j/dom/message/WSSecHeader;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getWssConfig", "()Lorg/apache/wss4j/dom/engine/WSSConfig;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/engine/WSSConfig", "getIdAllocator", "()Lorg/apache/wss4j/dom/WsuIdAllocator;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setIdAllocator", "(Lorg/apache/wss4j/dom/WsuIdAllocator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "isAddInclusivePrefixes", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setAddInclusivePrefixes", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getWsDocInfo", "()Lorg/apache/wss4j/dom/WSDocInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setWsDocInfo", "(Lorg/apache/wss4j/dom/WSDocInfo;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "isExpandXopInclude", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setExpandXopInclude", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getSignatureProvider", "()Ljava/security/Provider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setSignatureProvider", "(Ljava/security/Provider;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getKeyIdentifierId", "()I", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getKeyIdentifierId", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setKeyIdentifierType", "(I)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/wss4j/common/ext/WSPasswordCallback", "org/apache/wss4j/dom/message/WSSecSignature"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getSignatureAlgorithm", "()Ljava/lang/String;", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getSignatureAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setSignatureAlgorithm", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getDigestAlgorithm", "()Ljava/lang/String;", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getDigestAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setDigestAlgo", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getC14nAlgorithm", "()Ljava/lang/String;", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getC14nAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setSigCanonicalization", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "isIncludeToken", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setIncludeSignatureToken", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getUser", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/ext/WSPasswordCallback", "getPassword", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setUserInfo", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "isUseSingleCert", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setUseSingleCertificate", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/ext/WSPasswordCallback", "getKey", "()[B", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/ext/WSPasswordCallback", "getKey", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setSecretKey", "([B)V", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getKey", "()[B", false);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getKey", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setSecretKey", "([B)V", false);
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getUser", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label11);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILURE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitLdcInsn("noSignatureUser");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException", "<init>", "(Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getTokenId", "()Ljava/lang/String;", false);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label13);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getTokenId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setCustomTokenId", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getTokenType", "()Ljava/lang/String;", false);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getTokenType", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setCustomTokenValueType", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getSha1Value", "()Ljava/lang/String;", false);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label15);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getSha1Value", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setEncrKeySha1value", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getKeyInfoElement", "()Lorg/w3c/dom/Element;", false);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label16);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getKeyInfoElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setCustomKeyInfoElement", "(Lorg/w3c/dom/Element;)V", false);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getAttachmentCallbackHandler", "()Ljavax/security/auth/callback/CallbackHandler;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setAttachmentCallbackHandler", "(Ljavax/security/auth/callback/CallbackHandler;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "isStoreBytesInAttachment", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "setStoreBytesInAttachment", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getCrypto", "()Lorg/apache/wss4j/common/crypto/Crypto;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "prepare", "(Lorg/apache/wss4j/common/crypto/Crypto;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getParts", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 10);
Label label17 = new Label();
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/w3c/dom/Element", Opcodes.INTEGER, "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label18);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/common/WSEncryptionPart");
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitLdcInsn("STRTransform");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/WSEncryptionPart", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label19);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/WSEncryptionPart", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label19);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "getSecurityTokenReferenceURI", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/WSEncryptionPart", "setId", "(Ljava/lang/String;)V", false);
Label label20 = new Label();
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/wss4j/common/WSEncryptionPart"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "isAppendSignatureAfterTimestamp", "()Z", false);
Label label21 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label21);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/WSEncryptionPart", "getNamespace", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label21);
methodVisitor.visitLdcInsn("Timestamp");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/WSEncryptionPart", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label21);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getOriginalSignatureActionPosition", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 12);
methodVisitor.visitVarInsn(ILOAD, 12);
Label label22 = new Label();
methodVisitor.visitJumpInsn(IFLE, label22);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getSecHeader", "()Lorg/apache/wss4j/dom/message/WSSecHeader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecHeader", "getSecurityHeaderElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getLastChild", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 15);
Label label23 = new Label();
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_FULL, 16, new Object[] {"org/apache/wss4j/dom/action/SignatureAction", "org/apache/wss4j/dom/handler/WSHandler", "org/apache/wss4j/common/SecurityActionToken", "org/apache/wss4j/dom/handler/RequestData", "javax/security/auth/callback/CallbackHandler", "org/apache/wss4j/common/SignatureActionToken", "org/apache/wss4j/common/ext/WSPasswordCallback", "org/apache/wss4j/dom/message/WSSecSignature", "org/w3c/dom/Element", Opcodes.INTEGER, "java/util/Iterator", "org/apache/wss4j/common/WSEncryptionPart", Opcodes.INTEGER, "org/w3c/dom/Element", "org/w3c/dom/Node", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 14);
Label label24 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label24);
methodVisitor.visitVarInsn(ILOAD, 15);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitJumpInsn(IF_ICMPGE, label24);
Label label25 = new Label();
methodVisitor.visitLabel(label25);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 14);
Label label26 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label26);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeType", "()S", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label26);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getPreviousSibling", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitJumpInsn(GOTO, label25);
methodVisitor.visitLabel(label26);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(15, 1);
methodVisitor.visitJumpInsn(GOTO, label23);
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/w3c/dom/Element");
methodVisitor.visitJumpInsn(IFEQ, label22);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Element");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/apache/wss4j/dom/action/SignatureAction", "org/apache/wss4j/dom/handler/WSHandler", "org/apache/wss4j/common/SecurityActionToken", "org/apache/wss4j/dom/handler/RequestData", "javax/security/auth/callback/CallbackHandler", "org/apache/wss4j/common/SignatureActionToken", "org/apache/wss4j/common/ext/WSPasswordCallback", "org/apache/wss4j/dom/message/WSSecSignature", "org/w3c/dom/Element", Opcodes.INTEGER, "java/util/Iterator", "org/apache/wss4j/common/WSEncryptionPart"}, 0, new Object[] {});
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/WSEncryptionPart", "getNamespace", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label27 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label27);
methodVisitor.visitLdcInsn("BinarySecurityToken");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/WSEncryptionPart", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label27);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label27);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("KeyInfo");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/WSEncryptionPart", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label20);
methodVisitor.visitLdcInsn("http://www.w3.org/2000/09/xmldsig#");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/WSEncryptionPart", "getNamespace", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label20);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/WSEncryptionPart", "getElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label20);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "getKeyInfoElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/WSEncryptionPart", "setElement", "(Lorg/w3c/dom/Element;)V", false);
methodVisitor.visitJumpInsn(GOTO, label18);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label17);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 9);
Label label28 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label28);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "prependBSTElementToHeader", "()V", false);
methodVisitor.visitLabel(label28);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/SignatureActionToken", "getParts", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
Label label29 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label29);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label30 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label30);
methodVisitor.visitLabel(label29);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/List"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getSecHeader", "()Lorg/apache/wss4j/dom/message/WSSecHeader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecHeader", "getSecurityHeaderElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getOwnerDocument", "()Lorg/w3c/dom/Document;", true);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/dom/util/WSSecurityUtil", "getDefaultEncryptionPart", "(Lorg/w3c/dom/Document;)Lorg/apache/wss4j/common/WSEncryptionPart;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label30);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "addReferencesToSign", "(Ljava/util/List;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ILOAD, 9);
Label label31 = new Label();
methodVisitor.visitJumpInsn(IFNE, label31);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "isAppendSignatureAfterTimestamp", "()Z", false);
Label label32 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label32);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitJumpInsn(IFNONNULL, label32);
methodVisitor.visitLabel(label31);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/List"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "computeSignature", "(Ljava/util/List;ZLorg/w3c/dom/Element;)V", false);
Label label33 = new Label();
methodVisitor.visitJumpInsn(GOTO, label33);
methodVisitor.visitLabel(label32);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "computeSignature", "(Ljava/util/List;ZLorg/w3c/dom/Element;)V", false);
methodVisitor.visitLabel(label33);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 9);
Label label34 = new Label();
methodVisitor.visitJumpInsn(IFNE, label34);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "prependBSTElementToHeader", "()V", false);
methodVisitor.visitLabel(label34);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getSignatureValues", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignature", "getSignatureValue", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label35 = new Label();
methodVisitor.visitJumpInsn(GOTO, label35);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/wss4j/dom/action/SignatureAction", "org/apache/wss4j/dom/handler/WSHandler", "org/apache/wss4j/common/SecurityActionToken", "org/apache/wss4j/dom/handler/RequestData", "javax/security/auth/callback/CallbackHandler", "org/apache/wss4j/common/SignatureActionToken", "org/apache/wss4j/common/ext/WSPasswordCallback", "org/apache/wss4j/dom/message/WSSecSignature"}, 1, new Object[] {"org/apache/wss4j/common/ext/WSSecurityException"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILURE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("empty");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("Error during Signature: ");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException", "<init>", "(Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label35);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 16);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}