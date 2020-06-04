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
public class FaceletViewHandlingStrategy$MethodRetargetHandlerManager$AbstractRetargetHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_ABSTRACT, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$AbstractRetargetHandler", null, "java/lang/Object", new String[] { "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler" });

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "com/sun/faces/application/view/FaceletViewHandlingStrategy", "MethodRetargetHandlerManager", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$AbstractRetargetHandler", "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "AbstractRetargetHandler", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$1", null, null, 0);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler", "com/sun/faces/application/view/FaceletViewHandlingStrategy", "MethodRetargetHandler", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "NO_ARGS", "[Ljava/lang/Class;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$AbstractRetargetHandler", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$AbstractRetargetHandler", "NO_ARGS", "[Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
