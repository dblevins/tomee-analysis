package asm.org.apache.myfaces.view.facelets.tag.jsf;
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
public class EditableValueHolderRule$ValidatorExpressionMetadataDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/myfaces/view/facelets/tag/jsf/EditableValueHolderRule$ValidatorExpressionMetadata", null, "javax/faces/view/facelets/Metadata", null);

classWriter.visitInnerClass("org/apache/myfaces/view/facelets/tag/jsf/EditableValueHolderRule$ValidatorExpressionMetadata", "org/apache/myfaces/view/facelets/tag/jsf/EditableValueHolderRule", "ValidatorExpressionMetadata", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "attr", "Ljavax/faces/view/facelets/TagAttribute;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/faces/view/facelets/TagAttribute;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/view/facelets/Metadata", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/tag/jsf/EditableValueHolderRule$ValidatorExpressionMetadata", "attr", "Ljavax/faces/view/facelets/TagAttribute;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "applyMetadata", "(Ljavax/faces/view/facelets/FaceletContext;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/view/facelets/FaceletCompositionContext", "getCurrentInstance", "(Ljavax/faces/view/facelets/FaceletContext;)Lorg/apache/myfaces/view/facelets/FaceletCompositionContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/FaceletCompositionContext", "isUsingPSSOnThisView", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/component/EditableValueHolder");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/tag/jsf/PartialMethodExpressionValidator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/jsf/EditableValueHolderRule$ValidatorExpressionMetadata", "attr", "Ljavax/faces/view/facelets/TagAttribute;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/view/facelets/tag/jsf/EditableValueHolderRule", "access$200", "()[Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/TagAttribute", "getMethodExpression", "(Ljavax/faces/view/facelets/FaceletContext;Ljava/lang/Class;[Ljava/lang/Class;)Ljavax/el/MethodExpression;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/tag/jsf/PartialMethodExpressionValidator", "<init>", "(Ljavax/el/MethodExpression;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/EditableValueHolder", "addValidator", "(Ljavax/faces/validator/Validator;)V", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/component/EditableValueHolder");
methodVisitor.visitTypeInsn(NEW, "javax/faces/validator/MethodExpressionValidator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/jsf/EditableValueHolderRule$ValidatorExpressionMetadata", "attr", "Ljavax/faces/view/facelets/TagAttribute;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/view/facelets/tag/jsf/EditableValueHolderRule", "access$200", "()[Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/TagAttribute", "getMethodExpression", "(Ljavax/faces/view/facelets/FaceletContext;Ljava/lang/Class;[Ljava/lang/Class;)Ljavax/el/MethodExpression;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/validator/MethodExpressionValidator", "<init>", "(Ljavax/el/MethodExpression;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/EditableValueHolder", "addValidator", "(Ljavax/faces/validator/Validator;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
