package asm.org.opensaml.saml.saml2.assertion.impl;
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
public class DelegationRestrictionConditionValidatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/saml/saml2/assertion/impl/DelegationRestrictionConditionValidator", null, "java/lang/Object", new String[] { "org/opensaml/saml/saml2/assertion/ConditionValidator" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/annotation/concurrent/ThreadSafe;", false);
annotationVisitor0.visitEnd();
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getServicedCondition", "()Ljavax/xml/namespace/QName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/ext/saml2delrestrict/DelegationRestrictionType", "TYPE_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validate", "(Lorg/opensaml/saml/saml2/core/Condition;Lorg/opensaml/saml/saml2/core/Assertion;Lorg/opensaml/saml/common/assertion/ValidationContext;)Lorg/opensaml/saml/common/assertion/ValidationResult;", null, new String[] { "org/opensaml/saml/common/assertion/AssertionValidationException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/opensaml/saml/ext/saml2delrestrict/DelegationRestrictionType");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/Condition", "getSchemaType", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/ext/saml2delrestrict/DelegationRestrictionType", "TYPE_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/common/assertion/ValidationResult", "VALID", "Lorg/opensaml/saml/common/assertion/ValidationResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/common/assertion/ValidationResult", "INDETERMINATE", "Lorg/opensaml/saml/common/assertion/ValidationResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
