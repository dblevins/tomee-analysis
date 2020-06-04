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
public class AddNameIDToSubjects$AssertionStrategyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects$AssertionStrategy", "Ljava/lang/Object;Lcom/google/common/base/Function<Lorg/opensaml/profile/context/ProfileRequestContext;Ljava/util/List<Lorg/opensaml/saml/saml2/core/Assertion;>;>;", "java/lang/Object", new String[] { "com/google/common/base/Function" });

classWriter.visitInnerClass("org/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects$AssertionStrategy", "org/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects", "AssertionStrategy", ACC_PRIVATE);

classWriter.visitInnerClass("org/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects$AssertionStrategy", "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Lorg/opensaml/profile/context/ProfileRequestContext;)Ljava/util/List;", "(Lorg/opensaml/profile/context/ProfileRequestContext;)Ljava/util/List<Lorg/opensaml/saml/saml2/core/Assertion;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/profile/context/ProfileRequestContext", "getOutboundMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/profile/context/ProfileRequestContext", "getOutboundMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/MessageContext", "getMessage", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects$AssertionStrategy", "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects$AssertionStrategy", "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects", "access$100", "(Lorg/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects;)Lnet/shibboleth/utilities/java/support/security/IdentifierGenerationStrategy;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects$AssertionStrategy", "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects", "access$200", "(Lorg/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/saml/saml2/profile/SAML2ActionSupport", "buildAssertion", "(Lorg/opensaml/profile/action/AbstractProfileAction;Lnet/shibboleth/utilities/java/support/security/IdentifierGenerationStrategy;Ljava/lang/String;)Lorg/opensaml/saml/saml2/core/Assertion;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/profile/context/ProfileRequestContext", "getOutboundMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/MessageContext", "setMessage", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonList", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/opensaml/saml/saml2/core/Assertion");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/core/Assertion");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonList", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/opensaml/saml/saml2/core/Response");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/core/Response");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/Response", "getAssertions", "()Ljava/util/List;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/profile/context/ProfileRequestContext");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects$AssertionStrategy", "apply", "(Lorg/opensaml/profile/context/ProfileRequestContext;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects;Lorg/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects$AssertionStrategy", "<init>", "(Lorg/opensaml/saml/saml2/profile/impl/AddNameIDToSubjects;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
