package asm.org.apache.myfaces.view.facelets.tag.composite;
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
public class RetargetMethodExpressionRuleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/myfaces/view/facelets/tag/composite/RetargetMethodExpressionRule", null, "javax/faces/view/facelets/MetaRule", null);

classWriter.visitInnerClass("org/apache/myfaces/view/facelets/tag/composite/RetargetMethodExpressionRule$RetargetValueExpressionMapper", "org/apache/myfaces/view/facelets/tag/composite/RetargetMethodExpressionRule", "RetargetValueExpressionMapper", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSTANCE", "Lorg/apache/myfaces/view/facelets/tag/composite/RetargetMethodExpressionRule;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/view/facelets/MetaRule", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "applyRule", "(Ljava/lang/String;Ljavax/faces/view/facelets/TagAttribute;Ljavax/faces/view/facelets/MetadataTarget;)Ljavax/faces/view/facelets/Metadata;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("action");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn("actionListener");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn("validator");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn("valueChangeListener");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/tag/composite/RetargetMethodExpressionRule$RetargetValueExpressionMapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/tag/composite/RetargetMethodExpressionRule$RetargetValueExpressionMapper", "<init>", "(Ljavax/faces/view/facelets/TagAttribute;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/MetadataTarget", "getProperty", "(Ljava/lang/String;)Ljava/beans/PropertyDescriptor;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("type");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyDescriptor", "getValue", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("method-signature");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyDescriptor", "getValue", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/el/ValueExpression");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/tag/composite/RetargetMethodExpressionRule$RetargetValueExpressionMapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/tag/composite/RetargetMethodExpressionRule$RetargetValueExpressionMapper", "<init>", "(Ljavax/faces/view/facelets/TagAttribute;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/beans/PropertyDescriptor", "javax/el/ValueExpression"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("targetAttributeName");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyDescriptor", "getValue", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/el/ValueExpression");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/tag/composite/RetargetMethodExpressionRule$RetargetValueExpressionMapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/tag/composite/RetargetMethodExpressionRule$RetargetValueExpressionMapper", "<init>", "(Ljavax/faces/view/facelets/TagAttribute;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/el/ValueExpression"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("targets");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyDescriptor", "getValue", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/el/ValueExpression");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/tag/composite/RetargetMethodExpressionRule$RetargetValueExpressionMapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/tag/composite/RetargetMethodExpressionRule$RetargetValueExpressionMapper", "<init>", "(Ljavax/faces/view/facelets/TagAttribute;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/tag/composite/RetargetMethodExpressionRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/tag/composite/RetargetMethodExpressionRule", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/tag/composite/RetargetMethodExpressionRule", "INSTANCE", "Lorg/apache/myfaces/view/facelets/tag/composite/RetargetMethodExpressionRule;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
