package asm.com.sun.faces.el;
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
public class CompositeComponentAttributesELResolverDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/el/CompositeComponentAttributesELResolver", null, "jakarta/el/ELResolver", null);

classWriter.visitInnerClass("com/sun/faces/el/CompositeComponentAttributesELResolver$ExpressionEvalMap", "com/sun/faces/el/CompositeComponentAttributesELResolver", "ExpressionEvalMap", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/component/CompositeComponentStackManager$StackType", "com/sun/faces/component/CompositeComponentStackManager", "StackType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOGGER", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "COMPOSITE_COMPONENT_ATTRIBUTES_NAME", "Ljava/lang/String;", null, "attrs");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "COMPOSITE_COMPONENT_PARENT_NAME", "Ljava/lang/String;", null, "parent");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "EVAL_MAP_KEY", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$assertionsDisabled", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/ELResolver", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "(Ljakarta/el/ELContext;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("context");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/Util", "notNull", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/faces/component/UIComponent");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/component/UIComponent");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/UIComponent", "isCompositeComponent", "(Ljakarta/faces/component/UIComponent;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLdcInsn("attrs");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/component/UIComponent");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "setPropertyResolved", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/faces/context/FacesContext;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "getContext", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/context/FacesContext");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/el/CompositeComponentAttributesELResolver", "getEvalMapFor", "(Ljakarta/faces/component/UIComponent;Ljakarta/faces/context/FacesContext;)Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitLdcInsn("parent");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/component/UIComponent");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "setPropertyResolved", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/faces/context/FacesContext;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "getContext", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/context/FacesContext");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/component/CompositeComponentStackManager", "getManager", "(Ljakarta/faces/context/FacesContext;)Lcom/sun/faces/component/CompositeComponentStackManager;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/component/CompositeComponentStackManager$StackType", "TreeCreation", "Lcom/sun/faces/component/CompositeComponentStackManager$StackType;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/CompositeComponentStackManager", "getParentCompositeComponent", "(Lcom/sun/faces/component/CompositeComponentStackManager$StackType;Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;)Ljakarta/faces/component/UIComponent;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/component/CompositeComponentStackManager$StackType", "Evaluation", "Lcom/sun/faces/component/CompositeComponentStackManager$StackType;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/CompositeComponentStackManager", "getParentCompositeComponent", "(Lcom/sun/faces/component/CompositeComponentStackManager$StackType;Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;)Ljakarta/faces/component/UIComponent;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"com/sun/faces/el/CompositeComponentAttributesELResolver", "jakarta/el/ELContext", "java/lang/Object", "java/lang/Object", "java/lang/String", "jakarta/faces/component/UIComponent", "jakarta/faces/context/FacesContext", "com/sun/faces/component/CompositeComponentStackManager", "jakarta/faces/component/UIComponent"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"com/sun/faces/el/CompositeComponentAttributesELResolver", "jakarta/el/ELContext", "java/lang/Object", "java/lang/Object"}, 0, new Object[] {});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "(Ljakarta/el/ELContext;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Class;", "(Ljakarta/el/ELContext;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("context");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/Util", "notNull", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "com/sun/faces/el/CompositeComponentAttributesELResolver$ExpressionEvalMap");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/String");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/el/CompositeComponentAttributesELResolver$ExpressionEvalMap");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/el/CompositeComponentAttributesELResolver$ExpressionEvalMap", "getExpression", "(Ljava/lang/String;)Ljakarta/el/ValueExpression;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ValueExpression", "getType", "(Ljakarta/el/ELContext;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"com/sun/faces/el/CompositeComponentAttributesELResolver", "jakarta/el/ELContext", "java/lang/Object", "java/lang/Object", "java/lang/Class", "java/lang/Class", "com/sun/faces/el/CompositeComponentAttributesELResolver$ExpressionEvalMap", "jakarta/el/ValueExpression"}, 0, new Object[] {});
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/faces/context/FacesContext;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "getContext", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/context/FacesContext");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/UIComponent", "getCurrentCompositeComponent", "(Ljakarta/faces/context/FacesContext;)Ljakarta/faces/component/UIComponent;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/UIComponent", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("jakarta.faces.component.BEANINFO_KEY");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/beans/BeanInfo");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/CompositeComponentAttributesELResolver", "$assertionsDisabled", "Z");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitTypeInsn(NEW, "java/lang/AssertionError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AssertionError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"jakarta/faces/context/FacesContext", "jakarta/faces/component/UIComponent", "java/beans/BeanInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/beans/BeanInfo", "getPropertyDescriptors", "()[Ljava/beans/PropertyDescriptor;", true);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitJumpInsn(IF_ACMPEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 13);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 14);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 15, new Object[] {"com/sun/faces/el/CompositeComponentAttributesELResolver", "jakarta/el/ELContext", "java/lang/Object", "java/lang/Object", "java/lang/Class", "java/lang/Class", "com/sun/faces/el/CompositeComponentAttributesELResolver$ExpressionEvalMap", "jakarta/el/ValueExpression", "jakarta/faces/context/FacesContext", "jakarta/faces/component/UIComponent", "java/beans/BeanInfo", "[Ljava/beans/PropertyDescriptor;", "[Ljava/beans/PropertyDescriptor;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 14);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ILOAD, 14);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 15);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyDescriptor", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitLdcInsn("type");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyDescriptor", "getValue", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 16);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 16);
methodVisitor.visitJumpInsn(IF_ACMPEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/CompositeComponentAttributesELResolver", "$assertionsDisabled", "Z");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitVarInsn(ALOAD, 16);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Class");
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitTypeInsn(NEW, "java/lang/AssertionError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AssertionError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/beans/PropertyDescriptor", "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 16);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitIincInsn(14, 1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"com/sun/faces/el/CompositeComponentAttributesELResolver", "jakarta/el/ELContext", "java/lang/Object", "java/lang/Object", "java/lang/Class", "java/lang/Class", "com/sun/faces/el/CompositeComponentAttributesELResolver$ExpressionEvalMap", "jakarta/el/ValueExpression"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "setPropertyResolved", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 17);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValue", "(Ljakarta/el/ELContext;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("context");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/Util", "notNull", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isReadOnly", "(Ljakarta/el/ELContext;Ljava/lang/Object;Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("context");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/Util", "notNull", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFeatureDescriptors", "(Ljakarta/el/ELContext;Ljava/lang/Object;)Ljava/util/Iterator;", "(Ljakarta/el/ELContext;Ljava/lang/Object;)Ljava/util/Iterator<Ljava/beans/FeatureDescriptor;>;", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("context");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/Util", "notNull", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCommonPropertyType", "(Ljakarta/el/ELContext;Ljava/lang/Object;)Ljava/lang/Class;", "(Ljakarta/el/ELContext;Ljava/lang/Object;)Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("context");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/Util", "notNull", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEvalMapFor", "(Ljakarta/faces/component/UIComponent;Ljakarta/faces/context/FacesContext;)Ljava/util/Map;", "(Ljakarta/faces/component/UIComponent;Ljakarta/faces/context/FacesContext;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/CompositeComponentAttributesELResolver", "EVAL_MAP_KEY", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/CompositeComponentAttributesELResolver", "EVAL_MAP_KEY", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/el/CompositeComponentAttributesELResolver$ExpressionEvalMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/el/CompositeComponentAttributesELResolver$ExpressionEvalMap", "<init>", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/util/Map", "java/util/Map", "java/util/Map"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/el/CompositeComponentAttributesELResolver$ExpressionEvalMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/el/CompositeComponentAttributesELResolver$ExpressionEvalMap", "<init>", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/el/CompositeComponentAttributesELResolver$ExpressionEvalMap");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/el/CompositeComponentAttributesELResolver$ExpressionEvalMap", "updateFacesContext", "(Ljakarta/faces/context/FacesContext;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/el/CompositeComponentAttributesELResolver;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "desiredAssertionStatus", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/el/CompositeComponentAttributesELResolver", "$assertionsDisabled", "Z");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "CONTEXT", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/util/FacesLogger", "getLogger", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/el/CompositeComponentAttributesELResolver", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/el/CompositeComponentAttributesELResolver;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("_EVAL_MAP");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/el/CompositeComponentAttributesELResolver", "EVAL_MAP_KEY", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}