package asm.org.opensaml.saml.common.binding.impl;
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
public class SAMLAddAttributeConsumingServiceHandler$AuthnRequestIndexLookupDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/opensaml/saml/common/binding/impl/SAMLAddAttributeConsumingServiceHandler$AuthnRequestIndexLookup", "Ljava/lang/Object;Lcom/google/common/base/Function<Lorg/opensaml/messaging/context/MessageContext;Ljava/lang/Integer;>;", "java/lang/Object", new String[] { "com/google/common/base/Function" });

classWriter.visitInnerClass("org/opensaml/saml/common/binding/impl/SAMLAddAttributeConsumingServiceHandler$AuthnRequestIndexLookup", "org/opensaml/saml/common/binding/impl/SAMLAddAttributeConsumingServiceHandler", "AuthnRequestIndexLookup", ACC_PRIVATE);

classWriter.visitInnerClass("org/opensaml/saml/common/binding/impl/SAMLAddAttributeConsumingServiceHandler$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/opensaml/saml/common/binding/impl/SAMLAddAttributeConsumingServiceHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/opensaml/saml/common/binding/impl/SAMLAddAttributeConsumingServiceHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/common/binding/impl/SAMLAddAttributeConsumingServiceHandler$AuthnRequestIndexLookup", "this$0", "Lorg/opensaml/saml/common/binding/impl/SAMLAddAttributeConsumingServiceHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Lorg/opensaml/messaging/context/MessageContext;)Ljava/lang/Integer;", null, null);
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/MessageContext", "getMessage", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/opensaml/saml/saml2/core/AuthnRequest");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/core/AuthnRequest");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/AuthnRequest", "getAttributeConsumingServiceIndex", "()Ljava/lang/Integer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/messaging/context/MessageContext");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/binding/impl/SAMLAddAttributeConsumingServiceHandler$AuthnRequestIndexLookup", "apply", "(Lorg/opensaml/messaging/context/MessageContext;)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/opensaml/saml/common/binding/impl/SAMLAddAttributeConsumingServiceHandler;Lorg/opensaml/saml/common/binding/impl/SAMLAddAttributeConsumingServiceHandler$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/common/binding/impl/SAMLAddAttributeConsumingServiceHandler$AuthnRequestIndexLookup", "<init>", "(Lorg/opensaml/saml/common/binding/impl/SAMLAddAttributeConsumingServiceHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
