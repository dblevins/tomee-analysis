package asm.org.opensaml.saml.common.profile.impl;
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
public class PopulateSignatureSigningParametersDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", null, "org/opensaml/profile/action/AbstractConditionalProfileAction", null);

classWriter.visitInnerClass("org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "log", "Lorg/slf4j/Logger;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "securityParametersContextLookupStrategy", "Lcom/google/common/base/Function;", "Lcom/google/common/base/Function<Lorg/opensaml/profile/context/ProfileRequestContext;Lorg/opensaml/xmlsec/context/SecurityParametersContext;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "existingParametersContextLookupStrategy", "Lcom/google/common/base/Function;", "Lcom/google/common/base/Function<Lorg/opensaml/profile/context/ProfileRequestContext;Lorg/opensaml/xmlsec/context/SecurityParametersContext;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "configurationLookupStrategy", "Lcom/google/common/base/Function;", "Lcom/google/common/base/Function<Lorg/opensaml/profile/context/ProfileRequestContext;Ljava/util/List<Lorg/opensaml/xmlsec/SignatureSigningConfiguration;>;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NonnullAfterInit;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "metadataContextLookupStrategy", "Lcom/google/common/base/Function;", "Lcom/google/common/base/Function<Lorg/opensaml/profile/context/ProfileRequestContext;Lorg/opensaml/saml/common/messaging/context/SAMLMetadataContext;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "resolver", "Lorg/opensaml/xmlsec/SignatureSigningParametersResolver;", null, null);
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/profile/action/AbstractConditionalProfileAction", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/context/navigate/ChildContextLookup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/xmlsec/context/SecurityParametersContext;"));
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/context/navigate/ChildContextLookup", "<init>", "(Ljava/lang/Class;Z)V", false);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/profile/context/navigate/OutboundMessageContextLookup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/profile/context/navigate/OutboundMessageContextLookup", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Functions", "compose", "(Lcom/google/common/base/Function;Lcom/google/common/base/Function;)Lcom/google/common/base/Function;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "securityParametersContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/context/navigate/ChildContextLookup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/common/messaging/context/SAMLMetadataContext;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/context/navigate/ChildContextLookup", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/context/navigate/ChildContextLookup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/common/messaging/context/SAMLPeerEntityContext;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/context/navigate/ChildContextLookup", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/profile/context/navigate/OutboundMessageContextLookup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/profile/context/navigate/OutboundMessageContextLookup", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Functions", "compose", "(Lcom/google/common/base/Function;Lcom/google/common/base/Function;)Lcom/google/common/base/Function;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Functions", "compose", "(Lcom/google/common/base/Function;Lcom/google/common/base/Function;)Lcom/google/common/base/Function;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "metadataContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSecurityParametersContextLookupStrategy", "(Lcom/google/common/base/Function;)V", "(Lcom/google/common/base/Function<Lorg/opensaml/profile/context/ProfileRequestContext;Lorg/opensaml/xmlsec/context/SecurityParametersContext;>;)V", null);
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
methodVisitor.visitLdcInsn("SecurityParametersContext lookup strategy cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/google/common/base/Function");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "securityParametersContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExistingParametersContextLookupStrategy", "(Lcom/google/common/base/Function;)V", "(Lcom/google/common/base/Function<Lorg/opensaml/profile/context/ProfileRequestContext;Lorg/opensaml/xmlsec/context/SecurityParametersContext;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "existingParametersContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMetadataContextLookupStrategy", "(Lcom/google/common/base/Function;)V", "(Lcom/google/common/base/Function<Lorg/opensaml/profile/context/ProfileRequestContext;Lorg/opensaml/saml/common/messaging/context/SAMLMetadataContext;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "metadataContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConfigurationLookupStrategy", "(Lcom/google/common/base/Function;)V", "(Lcom/google/common/base/Function<Lorg/opensaml/profile/context/ProfileRequestContext;Ljava/util/List<Lorg/opensaml/xmlsec/SignatureSigningConfiguration;>;>;)V", null);
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
methodVisitor.visitLdcInsn("SignatureSigningConfiguration lookup strategy cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/google/common/base/Function");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "configurationLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSignatureSigningParametersResolver", "(Lorg/opensaml/xmlsec/SignatureSigningParametersResolver;)V", null, null);
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
methodVisitor.visitLdcInsn("SignatureSigningParametersResolver cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/SignatureSigningParametersResolver");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "resolver", "Lorg/opensaml/xmlsec/SignatureSigningParametersResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doInitialize", "()V", null, new String[] { "net/shibboleth/utilities/java/support/component/ComponentInitializationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/profile/action/AbstractConditionalProfileAction", "doInitialize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "resolver", "Lorg/opensaml/xmlsec/SignatureSigningParametersResolver;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/component/ComponentInitializationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SignatureSigningParametersResolver cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/component/ComponentInitializationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "configurationLookupStrategy", "Lcom/google/common/base/Function;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters$1", "<init>", "(Lorg/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "configurationLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doPreExecute", "(Lorg/opensaml/profile/context/ProfileRequestContext;)Z", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/profile/action/AbstractConditionalProfileAction", "doPreExecute", "(Lorg/opensaml/profile/context/ProfileRequestContext;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Signing enabled");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Signing not enabled");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doExecute", "(Lorg/opensaml/profile/context/ProfileRequestContext;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "net/shibboleth/utilities/java/support/resolver/ResolverException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Resolving SignatureSigningParameters for request");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "securityParametersContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/google/common/base/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/context/SecurityParametersContext");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} No SecurityParametersContext returned by lookup strategy");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("InvalidProfileContext");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/profile/action/ActionSupport", "buildEvent", "(Lorg/opensaml/profile/context/ProfileRequestContext;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/xmlsec/context/SecurityParametersContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "existingParametersContextLookupStrategy", "Lcom/google/common/base/Function;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "existingParametersContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/google/common/base/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/context/SecurityParametersContext");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/context/SecurityParametersContext", "getSignatureSigningParameters", "()Lorg/opensaml/xmlsec/SignatureSigningParameters;", false);
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Found existing SecurityParametersContext to copy from");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/context/SecurityParametersContext", "getSignatureSigningParameters", "()Lorg/opensaml/xmlsec/SignatureSigningParameters;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/context/SecurityParametersContext", "setSignatureSigningParameters", "(Lorg/opensaml/xmlsec/SignatureSigningParameters;)Lorg/opensaml/xmlsec/context/SecurityParametersContext;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "configurationLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/google/common/base/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/List"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} No SignatureSigningConfiguration returned by lookup strategy");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("InvalidSecurityConfiguration");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/profile/action/ActionSupport", "buildEvent", "(Lorg/opensaml/profile/context/ProfileRequestContext;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/resolver/CriteriaSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "net/shibboleth/utilities/java/support/resolver/Criterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/criterion/SignatureSigningConfigurationCriterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/criterion/SignatureSigningConfigurationCriterion", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "<init>", "([Lnet/shibboleth/utilities/java/support/resolver/Criterion;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "metadataContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "metadataContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/google/common/base/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/common/messaging/context/SAMLMetadataContext");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLMetadataContext", "getRoleDescriptor", "()Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;", false);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Adding metadata to resolution criteria for signing/digest algorithms");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/criterion/RoleDescriptorCriterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLMetadataContext", "getRoleDescriptor", "()Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/criterion/RoleDescriptorCriterion", "<init>", "(Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"net/shibboleth/utilities/java/support/resolver/CriteriaSet"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "resolver", "Lorg/opensaml/xmlsec/SignatureSigningParametersResolver;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/SignatureSigningParametersResolver", "resolveSingle", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/SignatureSigningParameters");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/context/SecurityParametersContext", "setSignatureSigningParameters", "(Lorg/opensaml/xmlsec/SignatureSigningParameters;)Lorg/opensaml/xmlsec/context/SecurityParametersContext;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} {} SignatureSigningParameters");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitLdcInsn("Resolved");
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "org/opensaml/profile/context/ProfileRequestContext", "org/opensaml/xmlsec/context/SecurityParametersContext", "java/util/List", "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "org/opensaml/xmlsec/SignatureSigningParameters"}, 3, new Object[] {"org/slf4j/Logger", "java/lang/String", "java/lang/String"});
methodVisitor.visitLdcInsn("Failed to resolve");
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "org/opensaml/profile/context/ProfileRequestContext", "org/opensaml/xmlsec/context/SecurityParametersContext", "java/util/List", "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "org/opensaml/xmlsec/SignatureSigningParameters"}, 4, new Object[] {"org/slf4j/Logger", "java/lang/String", "java/lang/String", "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "org/opensaml/profile/context/ProfileRequestContext", "org/opensaml/xmlsec/context/SecurityParametersContext", "java/util/List", "net/shibboleth/utilities/java/support/resolver/CriteriaSet"}, 1, new Object[] {"net/shibboleth/utilities/java/support/resolver/ResolverException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Error resolving SignatureSigningParameters");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/profile/impl/PopulateSignatureSigningParameters", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("InvalidSecurityConfiguration");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/profile/action/ActionSupport", "buildEvent", "(Lorg/opensaml/profile/context/ProfileRequestContext;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
