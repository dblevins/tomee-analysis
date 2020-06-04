package asm.org.apache.myfaces.view.facelets.tag.composite;
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
public class ClientBehaviorRedirectBehaviorAttachedObjectHandlerWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/view/facelets/tag/composite/ClientBehaviorRedirectBehaviorAttachedObjectHandlerWrapper", "Ljava/lang/Object;Ljakarta/faces/view/BehaviorHolderAttachedObjectHandler;Ljakarta/faces/FacesWrapper<Ljakarta/faces/view/BehaviorHolderAttachedObjectHandler;>;", "java/lang/Object", new String[] { "jakarta/faces/view/BehaviorHolderAttachedObjectHandler", "jakarta/faces/FacesWrapper" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_delegate", "Ljakarta/faces/view/BehaviorHolderAttachedObjectHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_eventName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/faces/view/BehaviorHolderAttachedObjectHandler;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/tag/composite/ClientBehaviorRedirectBehaviorAttachedObjectHandlerWrapper", "_delegate", "Ljakarta/faces/view/BehaviorHolderAttachedObjectHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/tag/composite/ClientBehaviorRedirectBehaviorAttachedObjectHandlerWrapper", "_eventName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "applyAttachedObject", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/composite/ClientBehaviorRedirectBehaviorAttachedObjectHandlerWrapper", "_delegate", "Ljakarta/faces/view/BehaviorHolderAttachedObjectHandler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/view/BehaviorHolderAttachedObjectHandler", "applyAttachedObject", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEventName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/composite/ClientBehaviorRedirectBehaviorAttachedObjectHandlerWrapper", "_eventName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrappedEventName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/composite/ClientBehaviorRedirectBehaviorAttachedObjectHandlerWrapper", "_delegate", "Ljakarta/faces/view/BehaviorHolderAttachedObjectHandler;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/myfaces/view/facelets/tag/composite/ClientBehaviorRedirectBehaviorAttachedObjectHandlerWrapper");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/composite/ClientBehaviorRedirectBehaviorAttachedObjectHandlerWrapper", "_delegate", "Ljakarta/faces/view/BehaviorHolderAttachedObjectHandler;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/view/facelets/tag/composite/ClientBehaviorRedirectBehaviorAttachedObjectHandlerWrapper");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/composite/ClientBehaviorRedirectBehaviorAttachedObjectHandlerWrapper", "getWrappedEventName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/composite/ClientBehaviorRedirectBehaviorAttachedObjectHandlerWrapper", "_delegate", "Ljakarta/faces/view/BehaviorHolderAttachedObjectHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/view/BehaviorHolderAttachedObjectHandler", "getEventName", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFor", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/composite/ClientBehaviorRedirectBehaviorAttachedObjectHandlerWrapper", "_delegate", "Ljakarta/faces/view/BehaviorHolderAttachedObjectHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/view/BehaviorHolderAttachedObjectHandler", "getFor", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrapped", "()Ljakarta/faces/view/BehaviorHolderAttachedObjectHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/composite/ClientBehaviorRedirectBehaviorAttachedObjectHandlerWrapper", "_delegate", "Ljakarta/faces/view/BehaviorHolderAttachedObjectHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getWrapped", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/composite/ClientBehaviorRedirectBehaviorAttachedObjectHandlerWrapper", "getWrapped", "()Ljakarta/faces/view/BehaviorHolderAttachedObjectHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
