package asm.javax.faces.component;
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
public class _ValueBindingToValueExpression$4Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "javax/faces/component/_ValueBindingToValueExpression$4", "Ljava/lang/Object;Ljavax/faces/component/_ValueBindingToValueExpression$Invoker<Ljava/lang/Object;>;", "java/lang/Object", new String[] { "javax/faces/component/_ValueBindingToValueExpression$Invoker" });

classWriter.visitOuterClass("javax/faces/component/_ValueBindingToValueExpression", "setValue", "(Ljavax/el/ELContext;Ljava/lang/Object;)V");

classWriter.visitInnerClass("javax/faces/component/_ValueBindingToValueExpression$4", null, null, 0);

classWriter.visitInnerClass("javax/faces/component/_ValueBindingToValueExpression$Invoker", "javax/faces/component/_ValueBindingToValueExpression", "Invoker", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$context", "Ljavax/el/ELContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$value", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Ljavax/faces/component/_ValueBindingToValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljavax/faces/component/_ValueBindingToValueExpression;Ljavax/el/ELContext;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/faces/component/_ValueBindingToValueExpression$4", "this$0", "Ljavax/faces/component/_ValueBindingToValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/faces/component/_ValueBindingToValueExpression$4", "val$context", "Ljavax/el/ELContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/faces/component/_ValueBindingToValueExpression$4", "val$value", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/component/_ValueBindingToValueExpression$4", "this$0", "Ljavax/faces/component/_ValueBindingToValueExpression;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/_ValueBindingToValueExpression", "access$100", "(Ljavax/faces/component/_ValueBindingToValueExpression;)Ljavax/faces/el/ValueBinding;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/component/_ValueBindingToValueExpression$4", "this$0", "Ljavax/faces/component/_ValueBindingToValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/component/_ValueBindingToValueExpression$4", "val$context", "Ljavax/el/ELContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/_ValueBindingToValueExpression", "access$000", "(Ljavax/faces/component/_ValueBindingToValueExpression;Ljavax/el/ELContext;)Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/component/_ValueBindingToValueExpression$4", "val$value", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/el/ValueBinding", "setValue", "(Ljavax/faces/context/FacesContext;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
