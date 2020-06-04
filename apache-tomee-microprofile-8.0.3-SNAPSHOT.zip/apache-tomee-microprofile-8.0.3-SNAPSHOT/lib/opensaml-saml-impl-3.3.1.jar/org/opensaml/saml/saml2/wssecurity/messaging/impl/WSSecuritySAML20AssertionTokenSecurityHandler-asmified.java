package asm.org.opensaml.saml.saml2.wssecurity.messaging.impl;
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
public class WSSecuritySAML20AssertionTokenSecurityHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", null, "org/opensaml/messaging/handler/AbstractMessageHandler", null);

classWriter.visitInnerClass("org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/opensaml/soap/wssecurity/messaging/Token$ValidationStatus", "org/opensaml/soap/wssecurity/messaging/Token", "ValidationStatus", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "log", "Lorg/slf4j/Logger;", null, null);
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
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "invalidFatal", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "assertionValidator", "Lorg/opensaml/saml/saml2/assertion/SAML20AssertionValidator;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "assertionValidatorLookup", "Lcom/google/common/base/Function;", "Lcom/google/common/base/Function<Lnet/shibboleth/utilities/java/support/collection/Pair<Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/saml/saml2/core/Assertion;>;Lorg/opensaml/saml/saml2/assertion/SAML20AssertionValidator;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "validationContextBuilder", "Lcom/google/common/base/Function;", "Lcom/google/common/base/Function<Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;Lorg/opensaml/saml/common/assertion/ValidationContext;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NonnullAfterInit;", false);
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
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "setInvalidFatal", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "setValidationContextBuilder", "(Lcom/google/common/base/Function;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValidationContextBuilder", "()Lcom/google/common/base/Function;", "()Lcom/google/common/base/Function<Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;Lorg/opensaml/saml/common/assertion/ValidationContext;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NonnullAfterInit;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "validationContextBuilder", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValidationContextBuilder", "(Lcom/google/common/base/Function;)V", "(Lcom/google/common/base/Function<Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;Lorg/opensaml/saml/common/assertion/ValidationContext;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Validation context builder may not be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/google/common/base/Function");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "validationContextBuilder", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
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
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "httpServletRequest", "Ljavax/servlet/http/HttpServletRequest;");
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
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("HttpServletRequest cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/servlet/http/HttpServletRequest");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "httpServletRequest", "Ljavax/servlet/http/HttpServletRequest;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isInvalidFatal", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "invalidFatal", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInvalidFatal", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "invalidFatal", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAssertionValidator", "()Lorg/opensaml/saml/saml2/assertion/SAML20AssertionValidator;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "assertionValidator", "Lorg/opensaml/saml/saml2/assertion/SAML20AssertionValidator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAssertionValidator", "(Lorg/opensaml/saml/saml2/assertion/SAML20AssertionValidator;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "assertionValidator", "Lorg/opensaml/saml/saml2/assertion/SAML20AssertionValidator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAssertionValidatorLookup", "()Lcom/google/common/base/Function;", "()Lcom/google/common/base/Function<Lnet/shibboleth/utilities/java/support/collection/Pair<Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/saml/saml2/core/Assertion;>;Lorg/opensaml/saml/saml2/assertion/SAML20AssertionValidator;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "assertionValidatorLookup", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAssertionValidatorLookup", "(Lcom/google/common/base/Function;)V", "(Lcom/google/common/base/Function<Lnet/shibboleth/utilities/java/support/collection/Pair<Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/saml/saml2/core/Assertion;>;Lorg/opensaml/saml/saml2/assertion/SAML20AssertionValidator;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "assertionValidatorLookup", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doInitialize", "()V", null, new String[] { "net/shibboleth/utilities/java/support/component/ComponentInitializationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/AbstractMessageHandler", "doInitialize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "getValidationContextBuilder", "()Lcom/google/common/base/Function;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/component/ComponentInitializationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ValidationContext builder cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/component/ComponentInitializationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "getHttpServletRequest", "()Ljavax/servlet/http/HttpServletRequest;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/component/ComponentInitializationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HttpServletRequest cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/component/ComponentInitializationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "getAssertionValidator", "()Lorg/opensaml/saml/saml2/assertion/SAML20AssertionValidator;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "getAssertionValidatorLookup", "()Lcom/google/common/base/Function;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/component/ComponentInitializationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Both Assertion validator and lookup function were null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/component/ComponentInitializationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Assertion validator is null, must be resovleable via the lookup function");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doDestroy", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "httpServletRequest", "Ljavax/servlet/http/HttpServletRequest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/AbstractMessageHandler", "doDestroy", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
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
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/opensaml/saml/common/assertion/AssertionValidationException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/soap/messaging/SOAPMessagingSupport", "isSOAPMessage", "(Lorg/opensaml/messaging/context/MessageContext;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Message context does not contain a SOAP envelope. Skipping rule...");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "resolveAssertions", "(Lorg/opensaml/messaging/context/MessageContext;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/List"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Inbound SOAP envelope contained no Assertion tokens. Skipping further processing");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/soap/wssecurity/messaging/WSSecurityContext;"));
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/MessageContext", "getSubcontext", "(Ljava/lang/Class;Z)Lorg/opensaml/messaging/context/BaseContext;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/soap/wssecurity/messaging/WSSecurityContext");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/opensaml/soap/wssecurity/messaging/WSSecurityContext", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/core/Assertion");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "resolveValidator", "(Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/saml/saml2/core/Assertion;)Lorg/opensaml/saml/saml2/assertion/SAML20AssertionValidator;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("No SAML20AssertionValidator was available, terminating");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/soap/soap11/FaultCode", "SERVER", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn("Internal processing error");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/soap/messaging/SOAPMessagingSupport", "registerSOAP11Fault", "(Lorg/opensaml/messaging/context/MessageContext;Ljavax/xml/namespace/QName;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/handler/MessageHandlerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No SAML20AssertionValidator was available");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/MessageHandlerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/opensaml/saml/saml2/core/Assertion", "org/opensaml/saml/saml2/assertion/SAML20AssertionValidator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "buildValidationContext", "(Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/saml/saml2/core/Assertion;)Lorg/opensaml/saml/common/assertion/ValidationContext;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/assertion/SAML20AssertionValidator", "validate", "(Lorg/opensaml/saml/saml2/core/Assertion;Lorg/opensaml/saml/common/assertion/ValidationContext;)Lorg/opensaml/saml/common/assertion/ValidationResult;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/saml2/wssecurity/SAML20AssertionToken");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/wssecurity/SAML20AssertionToken", "<init>", "(Lorg/opensaml/saml/saml2/core/Assertion;)V", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "processResult", "(Lorg/opensaml/saml/common/assertion/ValidationContext;Lorg/opensaml/saml/common/assertion/ValidationResult;Lorg/opensaml/saml/saml2/wssecurity/SAML20AssertionToken;Lorg/opensaml/messaging/context/MessageContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/wssecurity/messaging/WSSecurityContext", "getTokens", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "org/opensaml/messaging/context/MessageContext", "java/util/List", "org/opensaml/soap/wssecurity/messaging/WSSecurityContext", "java/util/Iterator", "org/opensaml/saml/saml2/core/Assertion", "org/opensaml/saml/saml2/assertion/SAML20AssertionValidator", "org/opensaml/saml/common/assertion/ValidationContext"}, 1, new Object[] {"org/opensaml/saml/common/assertion/AssertionValidationException"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("There was a problem determining Assertion validity: {}");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/assertion/AssertionValidationException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/soap/soap11/FaultCode", "SERVER", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn("Internal security token processing error");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/soap/messaging/SOAPMessagingSupport", "registerSOAP11Fault", "(Lorg/opensaml/messaging/context/MessageContext;Ljavax/xml/namespace/QName;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/handler/MessageHandlerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error determining SAML 2.0 Assertion validity");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/MessageHandlerException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processResult", "(Lorg/opensaml/saml/common/assertion/ValidationContext;Lorg/opensaml/saml/common/assertion/ValidationResult;Lorg/opensaml/saml/saml2/wssecurity/SAML20AssertionToken;Lorg/opensaml/messaging/context/MessageContext;)V", null, new String[] { "org/opensaml/messaging/handler/MessageHandlerException" });
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
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Assertion token validation result was: {}");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/assertion/ValidationContext", "getValidationFailureMessage", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Strings", "isNullOrEmpty", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn("unspecified");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler$1", "$SwitchMap$org$opensaml$saml$common$assertion$ValidationResult", "[I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/assertion/ValidationResult", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTableSwitchInsn(1, 3, label4, new Label[] { label1, label2, label3 });
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/soap/wssecurity/messaging/Token$ValidationStatus", "VALID", "Lorg/opensaml/soap/wssecurity/messaging/Token$ValidationStatus;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/SAML20AssertionToken", "setValidationStatus", "(Lorg/opensaml/soap/wssecurity/messaging/Token$ValidationStatus;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/assertion/ValidationContext", "getDynamicParameters", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("saml2.ConfirmedSubjectConfirmation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/core/SubjectConfirmation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/SAML20AssertionToken", "setSubjectConfirmation", "(Lorg/opensaml/saml/saml2/core/SubjectConfirmation;)V", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Assertion token validation was INVALID.  Reason: {}");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "isInvalidFatal", "()Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/soap/wssecurity/WSSecurityConstants", "SOAP_FAULT_INVALID_SECURITY_TOKEN", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn("The SAML 2.0 Assertion token was invalid");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/soap/messaging/SOAPMessagingSupport", "registerSOAP11Fault", "(Lorg/opensaml/messaging/context/MessageContext;Ljavax/xml/namespace/QName;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/handler/MessageHandlerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Assertion token validation result was INVALID");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/MessageHandlerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/soap/wssecurity/messaging/Token$ValidationStatus", "INVALID", "Lorg/opensaml/soap/wssecurity/messaging/Token$ValidationStatus;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/SAML20AssertionToken", "setValidationStatus", "(Lorg/opensaml/soap/wssecurity/messaging/Token$ValidationStatus;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/assertion/ValidationContext", "getDynamicParameters", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("saml2.ConfirmedSubjectConfirmation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/core/SubjectConfirmation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/SAML20AssertionToken", "setSubjectConfirmation", "(Lorg/opensaml/saml/saml2/core/SubjectConfirmation;)V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Assertion token validation was INDETERMINATE. Reason: {}");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "isInvalidFatal", "()Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/soap/wssecurity/WSSecurityConstants", "SOAP_FAULT_INVALID_SECURITY_TOKEN", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn("The SAML 2.0 Assertion token's validity could not be determined");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/soap/messaging/SOAPMessagingSupport", "registerSOAP11Fault", "(Lorg/opensaml/messaging/context/MessageContext;Ljavax/xml/namespace/QName;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/handler/MessageHandlerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Assertion token validation result was INDETERMINATE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/MessageHandlerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/soap/wssecurity/messaging/Token$ValidationStatus", "INDETERMINATE", "Lorg/opensaml/soap/wssecurity/messaging/Token$ValidationStatus;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/SAML20AssertionToken", "setValidationStatus", "(Lorg/opensaml/soap/wssecurity/messaging/Token$ValidationStatus;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/assertion/ValidationContext", "getDynamicParameters", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("saml2.ConfirmedSubjectConfirmation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/core/SubjectConfirmation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/SAML20AssertionToken", "setSubjectConfirmation", "(Lorg/opensaml/saml/saml2/core/SubjectConfirmation;)V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Assertion validation result indicated an unknown value: {}");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/soap/soap11/FaultCode", "SERVER", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn("Internal processing error");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/soap/messaging/SOAPMessagingSupport", "registerSOAP11Fault", "(Lorg/opensaml/messaging/context/MessageContext;Ljavax/xml/namespace/QName;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Assertion validation result indicated an unknown value: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "resolveValidator", "(Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/saml/saml2/core/Assertion;)Lorg/opensaml/saml/saml2/assertion/SAML20AssertionValidator;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "getAssertionValidatorLookup", "()Lcom/google/common/base/Function;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Attempting to resolve SAML 2 Assertion validator via lookup function");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "getAssertionValidatorLookup", "()Lcom/google/common/base/Function;", false);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/collection/Pair");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/collection/Pair", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/google/common/base/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/assertion/SAML20AssertionValidator");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Resolved SAML 2 Assertion validator via lookup function");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "getAssertionValidator", "()Lorg/opensaml/saml/saml2/assertion/SAML20AssertionValidator;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Resolved locally configured SAML 2 Assertion validator");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "getAssertionValidator", "()Lorg/opensaml/saml/saml2/assertion/SAML20AssertionValidator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("No SAML 2 Assertion validator could be resolved");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "buildValidationContext", "(Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/saml/saml2/core/Assertion;)Lorg/opensaml/saml/common/assertion/ValidationContext;", null, new String[] { "org/opensaml/messaging/handler/MessageHandlerException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "getValidationContextBuilder", "()Lcom/google/common/base/Function;", false);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "getHttpServletRequest", "()Ljavax/servlet/http/HttpServletRequest;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput", "<init>", "(Lorg/opensaml/messaging/context/MessageContext;Ljavax/servlet/http/HttpServletRequest;Lorg/opensaml/saml/saml2/core/Assertion;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/google/common/base/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/common/assertion/ValidationContext");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("ValidationContext produced was null");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/soap/soap11/FaultCode", "SERVER", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn("Internal processing error");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/soap/messaging/SOAPMessagingSupport", "registerSOAP11Fault", "(Lorg/opensaml/messaging/context/MessageContext;Ljavax/xml/namespace/QName;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/handler/MessageHandlerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No ValidationContext was produced");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/MessageHandlerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/saml/common/assertion/ValidationContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "resolveAssertions", "(Lorg/opensaml/messaging/context/MessageContext;)Ljava/util/List;", "(Lorg/opensaml/messaging/context/MessageContext;)Ljava/util/List<Lorg/opensaml/saml/saml2/core/Assertion;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/soap/wssecurity/Security", "ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/soap/messaging/SOAPMessagingSupport", "getInboundHeaderBlock", "(Lorg/opensaml/messaging/context/MessageContext;Ljavax/xml/namespace/QName;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/List"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("No WS-Security Security header found in inbound SOAP message. Skipping further processing.");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/collection/LazyList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/collection/LazyList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"net/shibboleth/utilities/java/support/collection/LazyList", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/xml/XMLObject");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/soap/wssecurity/Security");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/saml2/core/Assertion", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/soap/wssecurity/Security", "getUnknownXMLObjects", "(Ljavax/xml/namespace/QName;)Ljava/util/List;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "org/opensaml/messaging/context/MessageContext", "java/util/List", "net/shibboleth/utilities/java/support/collection/LazyList", "java/util/Iterator", "org/opensaml/core/xml/XMLObject", "org/opensaml/soap/wssecurity/Security", "java/util/List", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/xml/XMLObject");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/core/Assertion");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/collection/LazyList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/opensaml/saml/saml2/wssecurity/messaging/impl/WSSecuritySAML20AssertionTokenSecurityHandler", "org/opensaml/messaging/context/MessageContext", "java/util/List", "net/shibboleth/utilities/java/support/collection/LazyList", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 10);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
