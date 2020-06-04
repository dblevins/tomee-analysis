package asm.org.eclipse.persistence.jaxb.plugins;
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
public class BeanValidationPlugin$VisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "Ljava/lang/Object;Lcom/sun/tools/xjc/model/CPropertyVisitor2<Ljava/lang/Void;Lcom/sun/tools/xjc/outline/ClassOutline;>;", "java/lang/Object", new String[] { "com/sun/tools/xjc/model/CPropertyVisitor2" });

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetCustomization", "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin", "FacetCustomization", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin", "Visitor", ACC_PRIVATE | ACC_FINAL);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "this$0", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lcom/sun/tools/xjc/model/CElementPropertyInfo;Lcom/sun/tools/xjc/outline/ClassOutline;)Ljava/lang/Void;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "this$0", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "detectCustomizations", "(Lcom/sun/tools/xjc/model/CCustomizable;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin", "access$0", "(Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin;Lcom/sun/tools/xjc/model/CElementPropertyInfo;Lcom/sun/tools/xjc/outline/ClassOutline;Ljava/util/List;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lcom/sun/tools/xjc/model/CAttributePropertyInfo;Lcom/sun/tools/xjc/outline/ClassOutline;)Ljava/lang/Void;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "this$0", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "detectCustomizations", "(Lcom/sun/tools/xjc/model/CCustomizable;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin", "access$1", "(Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin;Lcom/sun/tools/xjc/model/CAttributePropertyInfo;Lcom/sun/tools/xjc/outline/ClassOutline;Ljava/util/List;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lcom/sun/tools/xjc/model/CValuePropertyInfo;Lcom/sun/tools/xjc/outline/ClassOutline;)Ljava/lang/Void;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "this$0", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "detectCustomizations", "(Lcom/sun/tools/xjc/model/CCustomizable;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin", "access$2", "(Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin;Lcom/sun/tools/xjc/model/CValuePropertyInfo;Lcom/sun/tools/xjc/outline/ClassOutline;Ljava/util/List;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lcom/sun/tools/xjc/model/CReferencePropertyInfo;Lcom/sun/tools/xjc/outline/ClassOutline;)Ljava/lang/Void;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "detectCustomizations", "(Lcom/sun/tools/xjc/model/CCustomizable;)Ljava/util/List;", "(Lcom/sun/tools/xjc/model/CCustomizable;)Ljava/util/List<Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetCustomization;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/tools/xjc/model/CCustomizable", "getCustomizations", "()Lcom/sun/tools/xjc/model/CCustomizations;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "com/sun/tools/xjc/model/CCustomizable", "java/util/List", "java/util/List", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/tools/xjc/model/CPluginCustomization");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/tools/xjc/model/CPluginCustomization", "markAsAcknowledged", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/tools/xjc/model/CPluginCustomization", "element", "Lorg/w3c/dom/Element;");
methodVisitor.visitLdcInsn("groups");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getAttribute", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/tools/xjc/model/CPluginCustomization", "element", "Lorg/w3c/dom/Element;");
methodVisitor.visitLdcInsn("message");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getAttribute", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/tools/xjc/model/CPluginCustomization", "element", "Lorg/w3c/dom/Element;");
methodVisitor.visitLdcInsn("type");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getAttribute", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DOM attribute \"type\" is required in custom facet declarations.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "com/sun/tools/xjc/model/CCustomizable", "java/util/List", "java/util/List", "com/sun/tools/xjc/model/CPluginCustomization", "java/util/Iterator", "java/lang/String", "java/lang/String", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/tools/xjc/model/CPluginCustomization", "element", "Lorg/w3c/dom/Element;");
methodVisitor.visitLdcInsn("value");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getAttribute", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetCustomization");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetCustomization", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetCustomization;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "com/sun/tools/xjc/model/CCustomizable", "java/util/List", "java/util/List", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "com/sun/tools/xjc/model/CCustomizable", "java/util/List", "java/util/List"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "visit", "(Lcom/sun/tools/xjc/model/CReferencePropertyInfo;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/tools/xjc/outline/ClassOutline");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "visit", "(Lcom/sun/tools/xjc/model/CReferencePropertyInfo;Lcom/sun/tools/xjc/outline/ClassOutline;)Ljava/lang/Void;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "visit", "(Lcom/sun/tools/xjc/model/CValuePropertyInfo;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/tools/xjc/outline/ClassOutline");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "visit", "(Lcom/sun/tools/xjc/model/CValuePropertyInfo;Lcom/sun/tools/xjc/outline/ClassOutline;)Ljava/lang/Void;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "visit", "(Lcom/sun/tools/xjc/model/CAttributePropertyInfo;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/tools/xjc/outline/ClassOutline");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "visit", "(Lcom/sun/tools/xjc/model/CAttributePropertyInfo;Lcom/sun/tools/xjc/outline/ClassOutline;)Ljava/lang/Void;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "visit", "(Lcom/sun/tools/xjc/model/CElementPropertyInfo;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/tools/xjc/outline/ClassOutline");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "visit", "(Lcom/sun/tools/xjc/model/CElementPropertyInfo;Lcom/sun/tools/xjc/outline/ClassOutline;)Ljava/lang/Void;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin;Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$Visitor", "<init>", "(Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
