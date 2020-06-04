package asm.org.opensaml.saml.saml2.profile.impl;
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
public class CopyNameIDFromRequestDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", null, "org/opensaml/profile/action/AbstractProfileAction", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "log", "Lorg/slf4j/Logger;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "subjectBuilder", "Lorg/opensaml/saml/common/SAMLObjectBuilder;", "Lorg/opensaml/saml/common/SAMLObjectBuilder<Lorg/opensaml/saml/saml2/core/Subject;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "nameIdBuilder", "Lorg/opensaml/saml/common/SAMLObjectBuilder;", "Lorg/opensaml/saml/common/SAMLObjectBuilder<Lorg/opensaml/saml/saml2/core/NameID;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "overwriteExisting", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "nameIdentifierContextLookupStrategy", "Lcom/google/common/base/Function;", "Lcom/google/common/base/Function<Lorg/opensaml/profile/context/ProfileRequestContext;Lorg/opensaml/saml/common/messaging/context/SAMLSubjectNameIdentifierContext;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "responseLookupStrategy", "Lcom/google/common/base/Function;", "Lcom/google/common/base/Function<Lorg/opensaml/profile/context/ProfileRequestContext;Lorg/opensaml/saml/saml2/core/Response;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "nameId", "Lorg/opensaml/saml/saml2/core/NameID;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "response", "Lorg/opensaml/saml/saml2/core/Response;", null, null);
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/profile/action/AbstractProfileAction", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/xml/config/XMLObjectProviderRegistrySupport", "getBuilderFactory", "()Lorg/opensaml/core/xml/XMLObjectBuilderFactory;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/saml2/core/Subject", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/XMLObjectBuilderFactory", "getBuilderOrThrow", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/XMLObjectBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/common/SAMLObjectBuilder");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "subjectBuilder", "Lorg/opensaml/saml/common/SAMLObjectBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/xml/config/XMLObjectProviderRegistrySupport", "getBuilderFactory", "()Lorg/opensaml/core/xml/XMLObjectBuilderFactory;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/saml2/core/NameID", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/XMLObjectBuilderFactory", "getBuilderOrThrow", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/XMLObjectBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/common/SAMLObjectBuilder");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "nameIdBuilder", "Lorg/opensaml/saml/common/SAMLObjectBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "overwriteExisting", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/context/navigate/ChildContextLookup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/common/messaging/context/SAMLSubjectNameIdentifierContext;"));
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/context/navigate/ChildContextLookup", "<init>", "(Ljava/lang/Class;Z)V", false);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/profile/context/navigate/InboundMessageContextLookup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/profile/context/navigate/InboundMessageContextLookup", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Functions", "compose", "(Lcom/google/common/base/Function;Lcom/google/common/base/Function;)Lcom/google/common/base/Function;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "nameIdentifierContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/context/navigate/MessageLookup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/saml2/core/Response;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/context/navigate/MessageLookup", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/profile/context/navigate/OutboundMessageContextLookup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/profile/context/navigate/OutboundMessageContextLookup", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Functions", "compose", "(Lcom/google/common/base/Function;Lcom/google/common/base/Function;)Lcom/google/common/base/Function;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "responseLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOverwriteExisting", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "overwriteExisting", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNameIDContextLookupStrategy", "(Lcom/google/common/base/Function;)V", "(Lcom/google/common/base/Function<Lorg/opensaml/profile/context/ProfileRequestContext;Lorg/opensaml/saml/common/messaging/context/SAMLSubjectNameIdentifierContext;>;)V", null);
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
methodVisitor.visitLdcInsn("SAMLSubjectNameIdentifierContext lookup strategy cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/google/common/base/Function");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "nameIdentifierContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setResponseLookupStrategy", "(Lcom/google/common/base/Function;)V", "(Lcom/google/common/base/Function<Lorg/opensaml/profile/context/ProfileRequestContext;Lorg/opensaml/saml/saml2/core/Response;>;)V", null);
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
methodVisitor.visitLdcInsn("Response lookup strategy cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/google/common/base/Function");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "responseLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
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
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Attempting to add NameID to statements in outgoing Response");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "responseLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/google/common/base/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/core/Response");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "response", "Lorg/opensaml/saml/saml2/core/Response;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "response", "Lorg/opensaml/saml/saml2/core/Response;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} No SAML response located");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("InvalidMessageContext");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/profile/action/ActionSupport", "buildEvent", "(Lorg/opensaml/profile/context/ProfileRequestContext;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "response", "Lorg/opensaml/saml/saml2/core/Response;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/Response", "getAssertions", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} No assertions in response message, nothing to do");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "nameIdentifierContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/google/common/base/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/common/messaging/context/SAMLSubjectNameIdentifierContext");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} No SAMLSubjectNameIdentifierContext located");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("InvalidMessageContext");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/profile/action/ActionSupport", "buildEvent", "(Lorg/opensaml/profile/context/ProfileRequestContext;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/saml/common/messaging/context/SAMLSubjectNameIdentifierContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLSubjectNameIdentifierContext", "getSAML2SubjectNameID", "()Lorg/opensaml/saml/saml2/core/NameID;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "nameId", "Lorg/opensaml/saml/saml2/core/NameID;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "nameId", "Lorg/opensaml/saml/saml2/core/NameID;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} No SAMLSubjectNameIdentifierContext located");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("InvalidMessageContext");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/profile/action/ActionSupport", "buildEvent", "(Lorg/opensaml/profile/context/ProfileRequestContext;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/profile/action/AbstractProfileAction", "doPreExecute", "(Lorg/opensaml/profile/context/ProfileRequestContext;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
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
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "response", "Lorg/opensaml/saml/saml2/core/Response;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/Response", "getAssertions", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/core/Assertion");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "getAssertionSubject", "(Lorg/opensaml/saml/saml2/core/Assertion;)Lorg/opensaml/saml/saml2/core/Subject;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/Subject", "getNameID", "()Lorg/opensaml/saml/saml2/core/NameID;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "overwriteExisting", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/opensaml/saml/saml2/core/Assertion", "org/opensaml/saml/saml2/core/Subject", "org/opensaml/saml/saml2/core/NameID"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "cloneNameID", "()Lorg/opensaml/saml/saml2/core/NameID;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/Subject", "setNameID", "(Lorg/opensaml/saml/saml2/core/NameID;)V", true);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFLE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} Added NameID to {} assertion(s)");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "getLogPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getAssertionSubject", "(Lorg/opensaml/saml/saml2/core/Assertion;)Lorg/opensaml/saml/saml2/core/Subject;", null, null);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/Assertion", "getSubject", "()Lorg/opensaml/saml/saml2/core/Subject;", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/Assertion", "getSubject", "()Lorg/opensaml/saml/saml2/core/Subject;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "subjectBuilder", "Lorg/opensaml/saml/common/SAMLObjectBuilder;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/common/SAMLObjectBuilder", "buildObject", "()Lorg/opensaml/saml/common/SAMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/core/Subject");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/Assertion", "setSubject", "(Lorg/opensaml/saml/saml2/core/Subject;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "cloneNameID", "()Lorg/opensaml/saml/saml2/core/NameID;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "nameIdBuilder", "Lorg/opensaml/saml/common/SAMLObjectBuilder;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/common/SAMLObjectBuilder", "buildObject", "()Lorg/opensaml/saml/common/SAMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/core/NameID");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "nameId", "Lorg/opensaml/saml/saml2/core/NameID;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/NameID", "getFormat", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/NameID", "setFormat", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "nameId", "Lorg/opensaml/saml/saml2/core/NameID;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/NameID", "getNameQualifier", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/NameID", "setNameQualifier", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "nameId", "Lorg/opensaml/saml/saml2/core/NameID;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/NameID", "getSPNameQualifier", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/NameID", "setSPNameQualifier", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "nameId", "Lorg/opensaml/saml/saml2/core/NameID;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/NameID", "getSPProvidedID", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/NameID", "setSPProvidedID", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/CopyNameIDFromRequest", "nameId", "Lorg/opensaml/saml/saml2/core/NameID;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/NameID", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/NameID", "setValue", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
