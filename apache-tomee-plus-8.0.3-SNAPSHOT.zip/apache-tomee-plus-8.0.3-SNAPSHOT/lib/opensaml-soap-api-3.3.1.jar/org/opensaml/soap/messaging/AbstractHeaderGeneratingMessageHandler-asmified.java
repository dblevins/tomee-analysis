package asm.org.opensaml.soap.messaging;
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
public class AbstractHeaderGeneratingMessageHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "<MessageType:Ljava/lang/Object;>Lorg/opensaml/messaging/handler/AbstractMessageHandler<TMessageType;>;", "org/opensaml/messaging/handler/AbstractMessageHandler", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "mustUnderstand", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "mustUnderstandStrategy", "Lcom/google/common/base/Predicate;", "Lcom/google/common/base/Predicate<Lorg/opensaml/messaging/context/MessageContext<TMessageType;>;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "effectiveMustUnderstand", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "targetNode", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "targetNodeStrategy", "Lcom/google/common/base/Function;", "Lcom/google/common/base/Function<Lorg/opensaml/messaging/context/MessageContext<TMessageType;>;Ljava/lang/String;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "effectiveTargetNode", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/handler/AbstractMessageHandler", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMustUnderstand", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "mustUnderstand", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMustUnderstandStrategy", "(Lcom/google/common/base/Predicate;)V", "(Lcom/google/common/base/Predicate<Lorg/opensaml/messaging/context/MessageContext<TMessageType;>;>;)V", null);
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
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "mustUnderstandStrategy", "Lcom/google/common/base/Predicate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "isEffectiveMustUnderstand", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "effectiveMustUnderstand", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTargetNode", "(Ljava/lang/String;)V", null, null);
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
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/primitive/StringSupport", "trimOrNull", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "targetNode", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTargetNodeStrategy", "(Lcom/google/common/base/Function;)V", "(Lcom/google/common/base/Function<Lorg/opensaml/messaging/context/MessageContext<TMessageType;>;Ljava/lang/String;>;)V", null);
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
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "targetNodeStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getEffectiveTargetNode", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "effectiveTargetNode", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
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
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "mustUnderstandStrategy", "Lcom/google/common/base/Predicate;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "mustUnderstandStrategy", "Lcom/google/common/base/Predicate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/google/common/base/Predicate", "apply", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "effectiveMustUnderstand", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "mustUnderstand", "Z");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "effectiveMustUnderstand", "Z");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "targetNodeStrategy", "Lcom/google/common/base/Function;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "targetNodeStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/google/common/base/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "effectiveTargetNode", "Ljava/lang/String;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "targetNode", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "effectiveTargetNode", "Ljava/lang/String;");
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "decorateGeneratedHeader", "(Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/core/xml/XMLObject;)V", null, null);
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "isEffectiveMustUnderstand", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/soap/messaging/SOAPMessagingSupport", "addMustUnderstand", "(Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/core/xml/XMLObject;Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "getEffectiveTargetNode", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/messaging/AbstractHeaderGeneratingMessageHandler", "getEffectiveTargetNode", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/soap/messaging/SOAPMessagingSupport", "addTargetNode", "(Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/core/xml/XMLObject;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
