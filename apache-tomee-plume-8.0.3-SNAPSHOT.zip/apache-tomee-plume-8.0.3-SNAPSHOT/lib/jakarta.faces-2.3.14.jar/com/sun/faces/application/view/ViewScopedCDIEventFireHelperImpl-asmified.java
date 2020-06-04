package asm.com.sun.faces.application.view;
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
public class ViewScopedCDIEventFireHelperImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/application/view/ViewScopedCDIEventFireHelperImpl", null, "java/lang/Object", new String[] { "java/io/Serializable", "com/sun/faces/application/view/ViewScopedCDIEventFireHelper" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(5777997951420156171L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "viewScopeInitializedEvent", "Ljavax/enterprise/event/Event;", "Ljavax/enterprise/event/Event<Ljavax/faces/component/UIViewRoot;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/inject/Inject;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/enterprise/context/Initialized;", true);
annotationVisitor0.visit("value", Type.getType("Ljavax/faces/view/ViewScoped;"));
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "viewScopeDestroyedEvent", "Ljavax/enterprise/event/Event;", "Ljavax/enterprise/event/Event<Ljavax/faces/component/UIViewRoot;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/inject/Inject;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/enterprise/context/Destroyed;", true);
annotationVisitor0.visit("value", Type.getType("Ljavax/faces/view/ViewScoped;"));
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fireInitializedEvent", "(Ljavax/faces/component/UIViewRoot;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/view/ViewScopedCDIEventFireHelperImpl", "viewScopeInitializedEvent", "Ljavax/enterprise/event/Event;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/event/Event", "fire", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fireDestroyedEvent", "(Ljavax/faces/component/UIViewRoot;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/view/ViewScopedCDIEventFireHelperImpl", "viewScopeDestroyedEvent", "Ljavax/enterprise/event/Event;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/event/Event", "fire", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
