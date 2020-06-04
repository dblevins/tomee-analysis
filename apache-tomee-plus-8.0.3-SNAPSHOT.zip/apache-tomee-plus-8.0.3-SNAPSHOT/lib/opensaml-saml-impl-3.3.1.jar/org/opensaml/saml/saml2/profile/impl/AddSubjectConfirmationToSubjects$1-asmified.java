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
public class AddSubjectConfirmationToSubjects$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects$1", "Ljava/lang/Object;Lcom/google/common/base/Function<Lorg/opensaml/profile/context/ProfileRequestContext;Ljava/lang/String;>;", "java/lang/Object", new String[] { "com/google/common/base/Function" });

classWriter.visitOuterClass("org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects", "<init>", "()V");

classWriter.visitInnerClass("org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects$1", "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Lorg/opensaml/profile/context/ProfileRequestContext;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects$1", "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects", "getHttpServletRequest", "()Ljavax/servlet/http/HttpServletRequest;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects$1", "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects", "getHttpServletRequest", "()Ljavax/servlet/http/HttpServletRequest;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getRemoteAddr", "()Ljava/lang/String;", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects$1", "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects", "access$100", "(Lorg/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects;)Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("{} Setting confirmation data Address to {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects$1", "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects", "access$000", "(Lorg/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects$1", "org/opensaml/profile/context/ProfileRequestContext", "java/lang/String"}, 3, new Object[] {"org/slf4j/Logger", "java/lang/String", "java/lang/String"});
methodVisitor.visitLdcInsn("(none)");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects$1", "org/opensaml/profile/context/ProfileRequestContext", "java/lang/String"}, 4, new Object[] {"org/slf4j/Logger", "java/lang/String", "java/lang/String", "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/profile/context/ProfileRequestContext");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/profile/impl/AddSubjectConfirmationToSubjects$1", "apply", "(Lorg/opensaml/profile/context/ProfileRequestContext;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
