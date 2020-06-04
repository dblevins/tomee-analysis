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
public class FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ValidatorRegargetHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ValidatorRegargetHandler", null, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$AbstractRetargetHandler", null);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "com/sun/faces/application/view/FaceletViewHandlingStrategy", "MethodRetargetHandlerManager", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ValidatorRegargetHandler", "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "ValidatorRegargetHandler", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$CompCompInterfaceMethodMetadata", "com/sun/faces/application/view/FaceletViewHandlingStrategy", "CompCompInterfaceMethodMetadata", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$1", null, null, 0);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$AbstractRetargetHandler", "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "AbstractRetargetHandler", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VALIDATOR", "Ljava/lang/String;", null, "validator");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VALIDATOR_ARGS", "[Ljava/lang/Class;", null, null);
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
methodVisitor.visitTypeInsn(CHECKCAST, "javax/el/ValueExpression");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getApplication", "()Ljavax/faces/application/Application;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/application/Application", "getExpressionFactory", "()Ljavax/el/ExpressionFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getELContext", "()Ljavax/el/ELContext;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "getExpressionString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ValidatorRegargetHandler", "VALIDATOR_ARGS", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ExpressionFactory", "createMethodExpression", "(Ljavax/el/ELContext;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljavax/el/MethodExpression;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/component/EditableValueHolder");
methodVisitor.visitTypeInsn(NEW, "javax/faces/validator/MethodExpressionValidator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/el/ContextualCompositeMethodExpression");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/el/ContextualCompositeMethodExpression", "<init>", "(Ljavax/el/ValueExpression;Ljavax/el/MethodExpression;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/validator/MethodExpressionValidator", "<init>", "(Ljavax/el/MethodExpression;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/EditableValueHolder", "addValidator", "(Ljavax/faces/validator/Validator;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttribute", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("validator");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ValidatorRegargetHandler", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/context/FacesContext;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/component/UIComponent;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ValidatorRegargetHandler", "VALIDATOR_ARGS", "[Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
