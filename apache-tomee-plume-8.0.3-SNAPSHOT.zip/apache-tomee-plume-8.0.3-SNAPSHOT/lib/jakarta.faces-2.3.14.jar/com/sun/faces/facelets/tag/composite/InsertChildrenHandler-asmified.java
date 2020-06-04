package asm.com.sun.faces.facelets.tag.composite;
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
public class InsertChildrenHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/facelets/tag/composite/InsertChildrenHandler", null, "com/sun/faces/facelets/tag/TagHandlerImpl", null);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/composite/InsertChildrenHandler$RelocateChildrenListener", "com/sun/faces/facelets/tag/composite/InsertChildrenHandler", "RelocateChildrenListener", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "LOGGER", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "REQUIRED_ATTRIBUTE", "Ljava/lang/String;", null, "required");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "required", "Ljavax/faces/view/facelets/TagAttribute;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/faces/view/facelets/TagConfig;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/TagHandlerImpl", "<init>", "(Ljavax/faces/view/facelets/TagConfig;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "TAGLIB", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/util/FacesLogger", "getLogger", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/composite/InsertChildrenHandler", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("required");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/composite/InsertChildrenHandler", "getAttribute", "(Ljava/lang/String;)Ljavax/faces/view/facelets/TagAttribute;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/composite/InsertChildrenHandler", "required", "Ljavax/faces/view/facelets/TagAttribute;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Ljavax/faces/view/facelets/FaceletContext;Ljavax/faces/component/UIComponent;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/FaceletContext", "getFacesContext", "()Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/UIComponent", "getCurrentCompositeComponent", "(Ljavax/faces/context/FacesContext;)Ljavax/faces/component/UIComponent;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/UIComponent", "getChildCount", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/event/PostAddToViewEvent;"));
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/InsertChildrenHandler$RelocateChildrenListener");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/composite/InsertChildrenHandler", "tag", "Ljavax/faces/view/facelets/Tag;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/Tag", "getLocation", "()Ljavax/faces/view/Location;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/InsertChildrenHandler$RelocateChildrenListener", "<init>", "(Lcom/sun/faces/facelets/tag/composite/InsertChildrenHandler;Ljavax/faces/view/facelets/FaceletContext;Ljavax/faces/component/UIComponent;ILjavax/faces/view/Location;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/UIComponent", "subscribeToEvent", "(Ljava/lang/Class;Ljavax/faces/event/ComponentSystemEventListener;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/faces/component/UIComponent"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lcom/sun/faces/facelets/tag/composite/InsertChildrenHandler;)Ljava/util/logging/Logger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/composite/InsertChildrenHandler", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lcom/sun/faces/facelets/tag/composite/InsertChildrenHandler;)Ljavax/faces/view/facelets/Tag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/composite/InsertChildrenHandler", "tag", "Ljavax/faces/view/facelets/Tag;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lcom/sun/faces/facelets/tag/composite/InsertChildrenHandler;)Ljavax/faces/view/facelets/TagAttribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/composite/InsertChildrenHandler", "required", "Ljavax/faces/view/facelets/TagAttribute;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
