package asm.com.sun.faces.application.view;
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
public class FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ActionRegargetHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ActionRegargetHandler", null, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$AbstractRetargetHandler", null);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "com/sun/faces/application/view/FaceletViewHandlingStrategy", "MethodRetargetHandlerManager", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ActionRegargetHandler", "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "ActionRegargetHandler", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$CompCompInterfaceMethodMetadata", "com/sun/faces/application/view/FaceletViewHandlingStrategy", "CompCompInterfaceMethodMetadata", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$1", null, null, 0);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$AbstractRetargetHandler", "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "AbstractRetargetHandler", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ACTION", "Ljava/lang/String;", null, "action");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$AbstractRetargetHandler", "<init>", "(Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "retarget", "(Ljavax/faces/context/FacesContext;Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$CompCompInterfaceMethodMetadata;Ljava/lang/Object;Ljavax/faces/component/UIComponent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/el/ValueExpression");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/el/ValueExpression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "getExpressionString", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getApplication", "()Ljavax/faces/application/Application;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/application/Application", "getExpressionFactory", "()Ljavax/el/ExpressionFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getELContext", "()Ljavax/el/ELContext;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ActionRegargetHandler", "NO_ARGS", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ExpressionFactory", "createMethodExpression", "(Ljavax/el/ELContext;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljavax/el/MethodExpression;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/component/ActionSource2");
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/el/ContextualCompositeMethodExpression");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/el/ValueExpression");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/el/ValueExpression");
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ActionRegargetHandler", "javax/faces/context/FacesContext", "com/sun/faces/application/view/FaceletViewHandlingStrategy$CompCompInterfaceMethodMetadata", "java/lang/Object", "javax/faces/component/UIComponent", "java/lang/String", "javax/el/ExpressionFactory", "javax/el/MethodExpression"}, 3, new Object[] {"javax/faces/component/ActionSource2", label2, label2});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ActionRegargetHandler", "javax/faces/context/FacesContext", "com/sun/faces/application/view/FaceletViewHandlingStrategy$CompCompInterfaceMethodMetadata", "java/lang/Object", "javax/faces/component/UIComponent", "java/lang/String", "javax/el/ExpressionFactory", "javax/el/MethodExpression"}, 4, new Object[] {"javax/faces/component/ActionSource2", label2, label2, "javax/el/ValueExpression"});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/el/ContextualCompositeMethodExpression", "<init>", "(Ljavax/el/ValueExpression;Ljavax/el/MethodExpression;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/ActionSource2", "setActionExpression", "(Ljavax/el/MethodExpression;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttribute", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("action");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ActionRegargetHandler", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
