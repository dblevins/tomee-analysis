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
public class ActionSourceRuleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "com/sun/faces/facelets/tag/jsf/ActionSourceRule", null, "javax/faces/view/facelets/MetaRule", null);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/jsf/ActionSourceRule$ActionListenerMapper2", "com/sun/faces/facelets/tag/jsf/ActionSourceRule", "ActionListenerMapper2", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/jsf/ActionSourceRule$ActionListenerMapper", "com/sun/faces/facelets/tag/jsf/ActionSourceRule", "ActionListenerMapper", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/jsf/ActionSourceRule$ActionMapper2", "com/sun/faces/facelets/tag/jsf/ActionSourceRule", "ActionMapper2", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/jsf/ActionSourceRule$ActionMapper", "com/sun/faces/facelets/tag/jsf/ActionSourceRule", "ActionMapper", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACTION_SIG", "[Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACTION_LISTENER_SIG", "[Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACTION_LISTENER_ZEROARG_SIG", "[Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Instance", "Lcom/sun/faces/facelets/tag/jsf/ActionSourceRule;", null, null);
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
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/component/ActionSource;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/MetadataTarget", "isTargetInstanceOf", "(Ljava/lang/Class;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn("action");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/component/ActionSource2;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/MetadataTarget", "isTargetInstanceOf", "(Ljava/lang/Class;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/jsf/ActionSourceRule$ActionMapper2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/ActionSourceRule$ActionMapper2", "<init>", "(Ljavax/faces/view/facelets/TagAttribute;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/jsf/ActionSourceRule$ActionMapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/ActionSourceRule$ActionMapper", "<init>", "(Ljavax/faces/view/facelets/TagAttribute;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("actionListener");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/component/ActionSource2;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/MetadataTarget", "isTargetInstanceOf", "(Ljava/lang/Class;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/jsf/ActionSourceRule$ActionListenerMapper2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/ActionSourceRule$ActionListenerMapper2", "<init>", "(Ljavax/faces/view/facelets/TagAttribute;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/jsf/ActionSourceRule$ActionListenerMapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/ActionSourceRule$ActionListenerMapper", "<init>", "(Ljavax/faces/view/facelets/TagAttribute;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/jsf/ActionSourceRule", "ACTION_SIG", "[Ljava/lang/Class;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/event/ActionEvent;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/jsf/ActionSourceRule", "ACTION_LISTENER_SIG", "[Ljava/lang/Class;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/jsf/ActionSourceRule", "ACTION_LISTENER_ZEROARG_SIG", "[Ljava/lang/Class;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/jsf/ActionSourceRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/ActionSourceRule", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/jsf/ActionSourceRule", "Instance", "Lcom/sun/faces/facelets/tag/jsf/ActionSourceRule;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
