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
public class AddSubjectConfirmationToSubjects$4Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects$4", "Ljava/lang/Object;Lcom/google/common/base/Function<Lorg/opensaml/profile/context/ProfileRequestContext;Ljava/lang/Long;>;", "java/lang/Object", new String[] { "com/google/common/base/Function" });

classWriter.visitOuterClass("org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects", "<init>", "()V");

classWriter.visitInnerClass("org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects$4", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects$4", "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Lorg/opensaml/profile/context/ProfileRequestContext;)Ljava/lang/Long;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects$4", "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects", "access$100", "(Lorg/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects;)Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("{} Setting confirmation data NotOnOrAfter to 5 minutes from now");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects$4", "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects", "access$800", "(Lorg/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLdcInsn(new Long(300000L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/profile/context/ProfileRequestContext");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects$4", "apply", "(Lorg/opensaml/profile/context/ProfileRequestContext;)Ljava/lang/Long;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
