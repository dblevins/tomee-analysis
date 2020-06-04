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
public class SAMLTokenUnsignedActionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/dom/action/SAMLTokenUnsignedAction", null, "java/lang/Object", new String[] { "org/apache/wss4j/dom/action/Action" });

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
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/dom/message/WSSecSAMLToken");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getSecHeader", "()Lorg/apache/wss4j/dom/message/WSSecHeader;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/message/WSSecSAMLToken", "<init>", "(Lorg/apache/wss4j/dom/message/WSSecHeader;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getWssConfig", "()Lorg/apache/wss4j/dom/engine/WSSConfig;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/engine/WSSConfig", "getIdAllocator", "()Lorg/apache/wss4j/dom/WsuIdAllocator;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSAMLToken", "setIdAllocator", "(Lorg/apache/wss4j/dom/WsuIdAllocator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getWsDocInfo", "()Lorg/apache/wss4j/dom/WSDocInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSAMLToken", "setWsDocInfo", "(Lorg/apache/wss4j/dom/WSDocInfo;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "isExpandXopInclude", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSAMLToken", "setExpandXopInclude", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("samlCallbackClass");
methodVisitor.visitLdcInsn("samlCallbackRef");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/WSHandler", "getCallbackHandler", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/wss4j/dom/handler/RequestData;)Ljavax/security/auth/callback/CallbackHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILURE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitLdcInsn("noSAMLCallbackHandler");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException", "<init>", "(Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/wss4j/dom/message/WSSecSAMLToken", "javax/security/auth/callback/CallbackHandler"}, 0, null);
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
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SamlAssertionWrapper", "signAssertion", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/wss4j/common/crypto/Crypto;ZLjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/wss4j/common/saml/SAMLCallback", "org/apache/wss4j/common/saml/SamlAssertionWrapper"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSAMLToken", "build", "(Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SamlAssertionWrapper", "getSignatureValue", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/handler/RequestData", "getSignatureValues", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[B"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 9);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
