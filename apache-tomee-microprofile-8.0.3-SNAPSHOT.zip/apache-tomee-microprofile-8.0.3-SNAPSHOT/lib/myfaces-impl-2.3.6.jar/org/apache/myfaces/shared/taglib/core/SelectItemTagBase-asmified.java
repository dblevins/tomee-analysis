package asm.org.apache.myfaces.shared.taglib.core;
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
public class SelectItemTagBaseDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", null, "org/apache/myfaces/shared/taglib/UIComponentELTagBase", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_itemDisabled", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_itemDescription", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_itemLabel", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_itemValue", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_escape", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_noSelectionOption", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/taglib/UIComponentELTagBase", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getComponentType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("javax.faces.SelectItem");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRendererType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setProperties", "(Ljavax/faces/component/UIComponent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/taglib/UIComponentELTagBase", "setProperties", "(Ljavax/faces/component/UIComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("itemDisabled");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "_itemDisabled", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "setBooleanProperty", "(Ljavax/faces/component/UIComponent;Ljava/lang/String;Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("itemDescription");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "_itemDescription", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "setStringProperty", "(Ljavax/faces/component/UIComponent;Ljava/lang/String;Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("itemLabel");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "_itemLabel", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "setStringProperty", "(Ljavax/faces/component/UIComponent;Ljava/lang/String;Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("itemValue");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "_itemValue", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "setStringProperty", "(Ljavax/faces/component/UIComponent;Ljava/lang/String;Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("itemEscaped");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "_escape", "Ljavax/el/ValueExpression;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "setBooleanProperty", "(Ljavax/faces/component/UIComponent;Ljava/lang/String;Ljavax/el/ValueExpression;Ljava/lang/Boolean;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("noSelectionOption");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "_noSelectionOption", "Ljavax/el/ValueExpression;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "setBooleanProperty", "(Ljavax/faces/component/UIComponent;Ljava/lang/String;Ljavax/el/ValueExpression;Ljava/lang/Boolean;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setItemDisabled", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "_itemDisabled", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setItemDescription", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "_itemDescription", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setItemLabel", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "_itemLabel", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_DEPRECATED, "setItemValue", "(Ljava/lang/String;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "getFacesContext", "()Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getApplication", "()Ljavax/faces/application/Application;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/application/Application", "getExpressionFactory", "()Ljavax/el/ExpressionFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "getFacesContext", "()Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getELContext", "()Ljavax/el/ELContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ExpressionFactory", "createValueExpression", "(Ljavax/el/ELContext;Ljava/lang/String;Ljava/lang/Class;)Ljavax/el/ValueExpression;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "_itemValue", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setItemValue", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "_itemValue", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEscape", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "_escape", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getItemValue", "()Ljavax/el/ValueExpression;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "_itemValue", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNoSelectionOption", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/taglib/core/SelectItemTagBase", "_noSelectionOption", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
