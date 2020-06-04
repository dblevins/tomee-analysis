package asm.org.apache.myfaces.view.facelets.tag.ui;
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
public class ParamHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/view/facelets/tag/ui/ParamHandler", null, "javax/faces/view/facelets/TagHandler", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljavax/faces/view/facelets/TagAttribute;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "value", "Ljavax/faces/view/facelets/TagAttribute;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/faces/view/facelets/TagConfig;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/view/facelets/TagHandler", "<init>", "(Ljavax/faces/view/facelets/TagConfig;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("name");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/ui/ParamHandler", "getRequiredAttribute", "(Ljava/lang/String;)Ljavax/faces/view/facelets/TagAttribute;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/tag/ui/ParamHandler", "name", "Ljavax/faces/view/facelets/TagAttribute;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("value");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/ui/ParamHandler", "getRequiredAttribute", "(Ljava/lang/String;)Ljavax/faces/view/facelets/TagAttribute;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/tag/ui/ParamHandler", "value", "Ljavax/faces/view/facelets/TagAttribute;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Ljavax/faces/view/facelets/FaceletContext;Ljavax/faces/component/UIComponent;)V", null, new String[] { "java/io/IOException", "javax/faces/FacesException", "javax/faces/view/facelets/FaceletException", "javax/el/ELException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/ui/ParamHandler", "getName", "(Ljavax/faces/view/facelets/FaceletContext;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/ui/ParamHandler", "getValue", "(Ljavax/faces/view/facelets/FaceletContext;)Ljavax/el/ValueExpression;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/ui/ParamHandler", "apply", "(Ljavax/faces/view/facelets/FaceletContext;Ljavax/faces/component/UIComponent;Ljava/lang/String;Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Ljavax/faces/view/facelets/FaceletContext;Ljavax/faces/component/UIComponent;Ljava/lang/String;Ljavax/el/ValueExpression;)V", null, new String[] { "java/io/IOException", "javax/faces/FacesException", "javax/faces/view/facelets/FaceletException", "javax/el/ELException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/view/facelets/AbstractFaceletContext");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/AbstractFaceletContext", "getTemplateContext", "()Lorg/apache/myfaces/view/facelets/TemplateContext;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/TemplateContext", "setParameter", "(Ljava/lang/String;Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/AbstractFaceletContext", "getTemplateContext", "()Lorg/apache/myfaces/view/facelets/TemplateContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/TemplateContext", "isAllowCacheELExpressions", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "strict", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/AbstractFaceletContext", "getELExpressionCacheMode", "()Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "allowCset", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/AbstractFaceletContext", "getELExpressionCacheMode", "()Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/myfaces/view/facelets/AbstractFaceletContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/AbstractFaceletContext", "getTemplateContext", "()Lorg/apache/myfaces/view/facelets/TemplateContext;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/TemplateContext", "setAllowCacheELExpressions", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Ljavax/faces/view/facelets/FaceletContext;Ljavax/faces/component/UIComponent;Ljava/lang/String;Ljavax/el/ValueExpression;Ljava/lang/String;)V", null, new String[] { "java/io/IOException", "javax/faces/FacesException", "javax/faces/view/facelets/FaceletException", "javax/el/ELException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/view/facelets/AbstractFaceletContext");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "alwaysRecompile", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/AbstractFaceletContext", "getELExpressionCacheMode", "()Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/view/facelets/tag/jsf/ComponentSupport", "getFaceletState", "(Ljavax/faces/view/facelets/FaceletContext;Ljavax/faces/component/UIComponent;Z)Lorg/apache/myfaces/view/facelets/tag/jsf/FaceletState;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/jsf/FaceletState", "putBinding", "(Ljava/lang/String;Ljava/lang/String;Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/el/FaceletStateValueExpression");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/el/FaceletStateValueExpression", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/AbstractFaceletContext", "getTemplateContext", "()Lorg/apache/myfaces/view/facelets/TemplateContext;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/TemplateContext", "setParameter", "(Ljava/lang/String;Ljavax/el/ValueExpression;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/myfaces/view/facelets/AbstractFaceletContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/AbstractFaceletContext", "getTemplateContext", "()Lorg/apache/myfaces/view/facelets/TemplateContext;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/TemplateContext", "setParameter", "(Ljava/lang/String;Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/AbstractFaceletContext", "getTemplateContext", "()Lorg/apache/myfaces/view/facelets/TemplateContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/TemplateContext", "isAllowCacheELExpressions", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "strict", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/AbstractFaceletContext", "getELExpressionCacheMode", "()Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "allowCset", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/AbstractFaceletContext", "getELExpressionCacheMode", "()Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/AbstractFaceletContext", "getTemplateContext", "()Lorg/apache/myfaces/view/facelets/TemplateContext;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/TemplateContext", "setAllowCacheELExpressions", "(Z)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "(Ljavax/faces/view/facelets/FaceletContext;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/ui/ParamHandler", "name", "Ljavax/faces/view/facelets/TagAttribute;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/TagAttribute", "getValue", "(Ljavax/faces/view/facelets/FaceletContext;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "(Ljavax/faces/view/facelets/FaceletContext;)Ljavax/el/ValueExpression;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/ui/ParamHandler", "value", "Ljavax/faces/view/facelets/TagAttribute;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/TagAttribute", "getValueExpression", "(Ljavax/faces/view/facelets/FaceletContext;Ljava/lang/Class;)Ljavax/el/ValueExpression;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
