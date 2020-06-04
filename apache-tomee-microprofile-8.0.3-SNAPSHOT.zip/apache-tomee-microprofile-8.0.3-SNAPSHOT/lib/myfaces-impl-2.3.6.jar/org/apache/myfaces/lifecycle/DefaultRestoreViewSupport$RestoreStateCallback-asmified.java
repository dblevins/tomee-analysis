package asm.org.apache.myfaces.lifecycle;
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
public class DefaultRestoreViewSupport$RestoreStateCallbackDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/myfaces/lifecycle/DefaultRestoreViewSupport$RestoreStateCallback", null, "java/lang/Object", new String[] { "javax/faces/component/visit/VisitCallback" });

classWriter.visitInnerClass("org/apache/myfaces/lifecycle/DefaultRestoreViewSupport$RestoreStateCallback", "org/apache/myfaces/lifecycle/DefaultRestoreViewSupport", "RestoreStateCallback", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/myfaces/lifecycle/DefaultRestoreViewSupport$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "event", "Ljavax/faces/event/PostRestoreStateEvent;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Ljavax/faces/component/visit/VisitContext;Ljavax/faces/component/UIComponent;)Ljavax/faces/component/visit/VisitResult;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/lifecycle/DefaultRestoreViewSupport$RestoreStateCallback", "event", "Ljavax/faces/event/PostRestoreStateEvent;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/faces/event/PostRestoreStateEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/event/PostRestoreStateEvent", "<init>", "(Ljavax/faces/component/UIComponent;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/lifecycle/DefaultRestoreViewSupport$RestoreStateCallback", "event", "Ljavax/faces/event/PostRestoreStateEvent;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/lifecycle/DefaultRestoreViewSupport$RestoreStateCallback", "event", "Ljavax/faces/event/PostRestoreStateEvent;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/event/PostRestoreStateEvent", "setComponent", "(Ljavax/faces/component/UIComponent;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/lifecycle/DefaultRestoreViewSupport$RestoreStateCallback", "event", "Ljavax/faces/event/PostRestoreStateEvent;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/UIComponent", "processEvent", "(Ljavax/faces/event/ComponentSystemEvent;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/visit/VisitResult", "ACCEPT", "Ljavax/faces/component/visit/VisitResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/myfaces/lifecycle/DefaultRestoreViewSupport$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/lifecycle/DefaultRestoreViewSupport$RestoreStateCallback", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
