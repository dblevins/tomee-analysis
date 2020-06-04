package asm.org.opensaml.saml.common.binding.security.impl;
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
public class BaseSAMLSimpleSignatureSecurityHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", null, "org/opensaml/messaging/handler/AbstractMessageHandler", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "log", "Lorg/slf4j/Logger;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "httpServletRequest", "Ljavax/servlet/http/HttpServletRequest;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NonnullAfterInit;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "peerContext", "Lorg/opensaml/saml/common/messaging/context/SAMLPeerEntityContext;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "samlProtocolContext", "Lorg/opensaml/saml/common/messaging/context/SAMLProtocolContext;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "trustEngine", "Lorg/opensaml/xmlsec/signature/support/SignatureTrustEngine;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/AbstractMessageHandler", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getTrustEngine", "()Lorg/opensaml/xmlsec/signature/support/SignatureTrustEngine;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "trustEngine", "Lorg/opensaml/xmlsec/signature/support/SignatureTrustEngine;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHttpServletRequest", "()Ljavax/servlet/http/HttpServletRequest;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NonnullAfterInit;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "httpServletRequest", "Ljavax/servlet/http/HttpServletRequest;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setHttpServletRequest", "(Ljavax/servlet/http/HttpServletRequest;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("HttpServletRequest cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/servlet/http/HttpServletRequest");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "httpServletRequest", "Ljavax/servlet/http/HttpServletRequest;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doInitialize", "()V", null, new String[] { "net/shibboleth/utilities/java/support/component/ComponentInitializationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/AbstractMessageHandler", "doInitialize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "httpServletRequest", "Ljavax/servlet/http/HttpServletRequest;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/component/ComponentInitializationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HttpServletRequest cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/component/ComponentInitializationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doPreInvoke", "(Lorg/opensaml/messaging/context/MessageContext;)Z", null, new String[] { "org/opensaml/messaging/handler/MessageHandlerException" });
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/AbstractMessageHandler", "doPreInvoke", "(Lorg/opensaml/messaging/context/MessageContext;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/common/messaging/context/SAMLPeerEntityContext;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/MessageContext", "getSubcontext", "(Ljava/lang/Class;)Lorg/opensaml/messaging/context/BaseContext;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/common/messaging/context/SAMLPeerEntityContext");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "peerContext", "Lorg/opensaml/saml/common/messaging/context/SAMLPeerEntityContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "peerContext", "Lorg/opensaml/saml/common/messaging/context/SAMLPeerEntityContext;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "peerContext", "Lorg/opensaml/saml/common/messaging/context/SAMLPeerEntityContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLPeerEntityContext", "getRole", "()Ljavax/xml/namespace/QName;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/handler/MessageHandlerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SAMLPeerEntityContext was missing or unpopulated");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/MessageHandlerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/common/messaging/context/SAMLProtocolContext;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/MessageContext", "getSubcontext", "(Ljava/lang/Class;)Lorg/opensaml/messaging/context/BaseContext;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/common/messaging/context/SAMLProtocolContext");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "samlProtocolContext", "Lorg/opensaml/saml/common/messaging/context/SAMLProtocolContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "samlProtocolContext", "Lorg/opensaml/saml/common/messaging/context/SAMLProtocolContext;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "samlProtocolContext", "Lorg/opensaml/saml/common/messaging/context/SAMLProtocolContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLProtocolContext", "getProtocol", "()Ljava/lang/String;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/handler/MessageHandlerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SAMLProtocolContext was missing or unpopulated");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/MessageHandlerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/xmlsec/context/SecurityParametersContext;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/MessageContext", "getSubcontext", "(Ljava/lang/Class;)Lorg/opensaml/messaging/context/BaseContext;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/context/SecurityParametersContext");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/context/SecurityParametersContext", "getSignatureValidationParameters", "()Lorg/opensaml/xmlsec/SignatureValidationParameters;", false);
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/context/SecurityParametersContext", "getSignatureValidationParameters", "()Lorg/opensaml/xmlsec/SignatureValidationParameters;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/SignatureValidationParameters", "getSignatureTrustEngine", "()Lorg/opensaml/xmlsec/signature/support/SignatureTrustEngine;", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/xmlsec/context/SecurityParametersContext"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/handler/MessageHandlerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No SignatureTrustEngine was available from the MessageContext");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/MessageHandlerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/context/SecurityParametersContext", "getSignatureValidationParameters", "()Lorg/opensaml/xmlsec/SignatureValidationParameters;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/SignatureValidationParameters", "getSignatureTrustEngine", "()Lorg/opensaml/xmlsec/signature/support/SignatureTrustEngine;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "trustEngine", "Lorg/opensaml/xmlsec/signature/support/SignatureTrustEngine;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doInvoke", "(Lorg/opensaml/messaging/context/MessageContext;)V", null, new String[] { "org/opensaml/messaging/handler/MessageHandlerException" });
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Evaluating simple signature rule of type: {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "ruleHandles", "(Lorg/opensaml/messaging/context/MessageContext;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Handler can not handle this request, skipping processing");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getSignature", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[B"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} HTTP request was not signed via simple signature mechanism, skipping");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getSignatureAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Strings", "isNullOrEmpty", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Signature algorithm could not be extracted from request, cannot validate simple signature");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getSignedContent", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[B"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Signed content could not be extracted from HTTP request, cannot validate");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "doEvaluate", "([B[BLjava/lang/String;Lorg/opensaml/messaging/context/MessageContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "doEvaluate", "([B[BLjava/lang/String;Lorg/opensaml/messaging/context/MessageContext;)V", null, new String[] { "org/opensaml/messaging/handler/MessageHandlerException" });
methodVisitor.visitAnnotableParameterCount(4, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(4, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getRequestCredentials", "(Lorg/opensaml/messaging/context/MessageContext;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "peerContext", "Lorg/opensaml/saml/common/messaging/context/SAMLPeerEntityContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLPeerEntityContext", "getEntityId", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Attempting to validate SAML protocol message simple signature using context entityID: {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "buildCriteriaSet", "(Ljava/lang/String;Lorg/opensaml/messaging/context/MessageContext;)Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "validateSignature", "([B[BLjava/lang/String;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;Ljava/util/List;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Validation of request simple signature succeeded");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "peerContext", "Lorg/opensaml/saml/common/messaging/context/SAMLPeerEntityContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLPeerEntityContext", "isAuthenticated", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Authentication via request simple signature succeeded for context issuer entity ID {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "peerContext", "Lorg/opensaml/saml/common/messaging/context/SAMLPeerEntityContext;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLPeerEntityContext", "setAuthenticated", "(Z)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/util/List", "java/lang/String", "net/shibboleth/utilities/java/support/resolver/CriteriaSet"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Validation of request simple signature failed for context issuer: {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/handler/MessageHandlerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Validation of request simple signature failed for context issuer");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/MessageHandlerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "deriveSignerEntityID", "(Lorg/opensaml/messaging/context/MessageContext;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Attempting to validate SAML protocol message simple signature using derived entityID: {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "buildCriteriaSet", "(Ljava/lang/String;Lorg/opensaml/messaging/context/MessageContext;)Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "validateSignature", "([B[BLjava/lang/String;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;Ljava/util/List;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Validation of request simple signature succeeded");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "peerContext", "Lorg/opensaml/saml/common/messaging/context/SAMLPeerEntityContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLPeerEntityContext", "isAuthenticated", "()Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Authentication via request simple signature succeeded for derived issuer {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "peerContext", "Lorg/opensaml/saml/common/messaging/context/SAMLPeerEntityContext;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLPeerEntityContext", "setEntityId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "peerContext", "Lorg/opensaml/saml/common/messaging/context/SAMLPeerEntityContext;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLPeerEntityContext", "setAuthenticated", "(Z)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "net/shibboleth/utilities/java/support/resolver/CriteriaSet"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Validation of request simple signature failed for derived issuer: {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/handler/MessageHandlerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Validation of request simple signature failed for derived issuer");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/MessageHandlerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Neither context nor derived issuer available, cannot attempt SAML simple signature validation");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/handler/MessageHandlerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No message issuer available, cannot attempt simple signature validation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/MessageHandlerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(6, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "validateSignature", "([B[BLjava/lang/String;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;Ljava/util/List;)Z", "([B[BLjava/lang/String;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;Ljava/util/List<Lorg/opensaml/security/credential/Credential;>;)Z", new String[] { "org/opensaml/messaging/handler/MessageHandlerException" });
methodVisitor.visitAnnotableParameterCount(5, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(4, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(5, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(4, "Lnet/shibboleth/utilities/java/support/annotation/constraint/NonnullElements;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/opensaml/security/SecurityException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "org/opensaml/security/SecurityException");
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label2, "org/opensaml/security/SecurityException");
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label7, label8, label2, "org/opensaml/security/SecurityException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getTrustEngine", "()Lorg/opensaml/xmlsec/signature/support/SignatureTrustEngine;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/xmlsec/signature/support/SignatureTrustEngine"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/support/SignatureTrustEngine", "validate", "([B[BLjava/lang/String;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;Lorg/opensaml/security/credential/Credential;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Simple signature validation (with no request-derived credentials) was successful");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Simple signature validation (with no request-derived credentials) failed");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label10 = new Label();
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/security/credential/Credential");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/support/SignatureTrustEngine", "validate", "([B[BLjava/lang/String;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;Lorg/opensaml/security/credential/Credential;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Simple signature validation succeeded with a request-derived credential");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label6);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Signature validation using request-derived credentials failed");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label8);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/opensaml/security/SecurityException"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Error evaluating the request's simple signature using the trust engine");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/handler/MessageHandlerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error during trust engine evaluation of the simple signature");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/MessageHandlerException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(6, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getRequestCredentials", "(Lorg/opensaml/messaging/context/MessageContext;)Ljava/util/List;", "(Lorg/opensaml/messaging/context/MessageContext;)Ljava/util/List<Lorg/opensaml/security/credential/Credential;>;", new String[] { "org/opensaml/messaging/handler/MessageHandlerException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NonnullElements;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getSignature", "()[B", null, new String[] { "org/opensaml/messaging/handler/MessageHandlerException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getHttpServletRequest", "()Ljavax/servlet/http/HttpServletRequest;", false);
methodVisitor.visitLdcInsn("Signature");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getParameter", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Strings", "isNullOrEmpty", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/codec/Base64Support", "decode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getSignatureAlgorithm", "()Ljava/lang/String;", null, new String[] { "org/opensaml/messaging/handler/MessageHandlerException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "getHttpServletRequest", "()Ljavax/servlet/http/HttpServletRequest;", false);
methodVisitor.visitLdcInsn("SigAlg");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getParameter", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "deriveSignerEntityID", "(Lorg/opensaml/messaging/context/MessageContext;)Ljava/lang/String;", null, new String[] { "org/opensaml/messaging/handler/MessageHandlerException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "buildCriteriaSet", "(Ljava/lang/String;Lorg/opensaml/messaging/context/MessageContext;)Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;", null, new String[] { "org/opensaml/messaging/handler/MessageHandlerException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/resolver/CriteriaSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Strings", "isNullOrEmpty", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/criterion/EntityIdCriterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/criterion/EntityIdCriterion", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"net/shibboleth/utilities/java/support/resolver/CriteriaSet"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/criterion/EntityRoleCriterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "peerContext", "Lorg/opensaml/saml/common/messaging/context/SAMLPeerEntityContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLPeerEntityContext", "getRole", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/criterion/EntityRoleCriterion", "<init>", "(Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/criterion/ProtocolCriterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/binding/security/impl/BaseSAMLSimpleSignatureSecurityHandler", "samlProtocolContext", "Lorg/opensaml/saml/common/messaging/context/SAMLProtocolContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLProtocolContext", "getProtocol", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/criterion/ProtocolCriterion", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/criteria/UsageCriterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/security/credential/UsageType", "SIGNING", "Lorg/opensaml/security/credential/UsageType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/criteria/UsageCriterion", "<init>", "(Lorg/opensaml/security/credential/UsageType;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/xmlsec/context/SecurityParametersContext;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/MessageContext", "getSubcontext", "(Ljava/lang/Class;)Lorg/opensaml/messaging/context/BaseContext;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/context/SecurityParametersContext");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/context/SecurityParametersContext", "getSignatureValidationParameters", "()Lorg/opensaml/xmlsec/SignatureValidationParameters;", false);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/signature/support/SignatureValidationParametersCriterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/context/SecurityParametersContext", "getSignatureValidationParameters", "()Lorg/opensaml/xmlsec/SignatureValidationParameters;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/signature/support/SignatureValidationParametersCriterion", "<init>", "(Lorg/opensaml/xmlsec/SignatureValidationParameters;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/xmlsec/context/SecurityParametersContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "getSignedContent", "()[B", null, new String[] { "org/opensaml/messaging/handler/MessageHandlerException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "ruleHandles", "(Lorg/opensaml/messaging/context/MessageContext;)Z", null, new String[] { "org/opensaml/messaging/handler/MessageHandlerException" });
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
