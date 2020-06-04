package asm.com.sun.faces.lifecycle;
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
public class RestoreViewPhase$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/lifecycle/RestoreViewPhase$1", null, "java/lang/Object", new String[] { "javax/faces/component/visit/VisitCallback" });

classWriter.visitOuterClass("com/sun/faces/lifecycle/RestoreViewPhase", "deliverPostRestoreStateEvent", "(Ljavax/faces/context/FacesContext;)V");

classWriter.visitInnerClass("com/sun/faces/lifecycle/RestoreViewPhase$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$postRestoreStateEvent", "Ljavax/faces/event/PostRestoreStateEvent;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/faces/lifecycle/RestoreViewPhase;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/faces/lifecycle/RestoreViewPhase;Ljavax/faces/event/PostRestoreStateEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/lifecycle/RestoreViewPhase$1", "this$0", "Lcom/sun/faces/lifecycle/RestoreViewPhase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/lifecycle/RestoreViewPhase$1", "val$postRestoreStateEvent", "Ljavax/faces/event/PostRestoreStateEvent;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Ljavax/faces/component/visit/VisitContext;Ljavax/faces/component/UIComponent;)Ljavax/faces/component/visit/VisitResult;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/lifecycle/RestoreViewPhase$1", "val$postRestoreStateEvent", "Ljavax/faces/event/PostRestoreStateEvent;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/event/PostRestoreStateEvent", "setComponent", "(Ljavax/faces/component/UIComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/lifecycle/RestoreViewPhase$1", "val$postRestoreStateEvent", "Ljavax/faces/event/PostRestoreStateEvent;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/UIComponent", "processEvent", "(Ljavax/faces/event/ComponentSystemEvent;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/visit/VisitResult", "ACCEPT", "Ljavax/faces/component/visit/VisitResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
