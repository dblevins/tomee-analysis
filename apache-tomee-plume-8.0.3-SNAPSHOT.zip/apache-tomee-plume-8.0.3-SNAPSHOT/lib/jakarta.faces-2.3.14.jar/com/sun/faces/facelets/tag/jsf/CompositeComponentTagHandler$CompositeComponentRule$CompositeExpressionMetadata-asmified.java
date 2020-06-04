package asm.com.sun.faces.facelets.tag.jsf;
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
public class CompositeComponentTagHandler$CompositeComponentRule$CompositeExpressionMetadataDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentRule$CompositeExpressionMetadata", null, "javax/faces/view/facelets/Metadata", null);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentRule", "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler", "CompositeComponentRule", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentRule$CompositeExpressionMetadata", "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentRule", "CompositeExpressionMetadata", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "type", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attr", "Ljavax/faces/view/facelets/TagAttribute;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$assertionsDisabled", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/Class;Ljavax/faces/view/facelets/TagAttribute;)V", "(Ljava/lang/String;Ljava/lang/Class<*>;Ljavax/faces/view/facelets/TagAttribute;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/view/facelets/Metadata", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentRule$CompositeExpressionMetadata", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentRule$CompositeExpressionMetadata", "type", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentRule$CompositeExpressionMetadata", "attr", "Ljavax/faces/view/facelets/TagAttribute;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "applyMetadata", "(Ljavax/faces/view/facelets/FaceletContext;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentRule$CompositeExpressionMetadata", "attr", "Ljavax/faces/view/facelets/TagAttribute;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentRule$CompositeExpressionMetadata", "type", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/TagAttribute", "getValueExpression", "(Ljavax/faces/view/facelets/FaceletContext;Ljava/lang/Class;)Ljavax/el/ValueExpression;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/component/UIComponent");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentRule$CompositeExpressionMetadata", "$assertionsDisabled", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/UIComponent", "isCompositeComponent", "(Ljavax/faces/component/UIComponent;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/AssertionError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AssertionError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/el/ValueExpression", "javax/faces/component/UIComponent"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/UIComponent", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("javax.faces.component.BEANINFO_KEY");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/beans/BeanInfo");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/beans/BeanInfo", "getBeanDescriptor", "()Ljava/beans/BeanDescriptor;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("javax.faces.component.ATTR_NAMES_WITH_DEFAULT_VALUES");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/BeanDescriptor", "getValue", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Collection");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentRule$CompositeExpressionMetadata", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentRule$CompositeExpressionMetadata", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsKey", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentRule$CompositeExpressionMetadata", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentRule$CompositeExpressionMetadata", "javax/faces/view/facelets/FaceletContext", "java/lang/Object", "javax/el/ValueExpression", "javax/faces/component/UIComponent", "java/util/Map", "java/beans/BeanInfo", "java/beans/BeanDescriptor", "java/util/Collection"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentRule$CompositeExpressionMetadata", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/UIComponent", "setValueExpression", "(Ljava/lang/String;Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler;"));
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
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentRule$CompositeExpressionMetadata", "$assertionsDisabled", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
