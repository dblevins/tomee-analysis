package asm.jakarta.faces.component;
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
public class _ValueBindingToValueExpression$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "jakarta/faces/component/_ValueBindingToValueExpression$1", "Ljava/lang/Object;Ljakarta/faces/component/_ValueBindingToValueExpression$Invoker<Ljava/lang/Boolean;>;", "java/lang/Object", new String[] { "jakarta/faces/component/_ValueBindingToValueExpression$Invoker" });

classWriter.visitOuterClass("jakarta/faces/component/_ValueBindingToValueExpression", "isReadOnly", "(Ljakarta/el/ELContext;)Z");

classWriter.visitInnerClass("jakarta/faces/component/_ValueBindingToValueExpression$1", null, null, 0);

classWriter.visitInnerClass("jakarta/faces/component/_ValueBindingToValueExpression$Invoker", "jakarta/faces/component/_ValueBindingToValueExpression", "Invoker", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$context", "Ljakarta/el/ELContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Ljakarta/faces/component/_ValueBindingToValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljakarta/faces/component/_ValueBindingToValueExpression;Ljakarta/el/ELContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/component/_ValueBindingToValueExpression$1", "this$0", "Ljakarta/faces/component/_ValueBindingToValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/component/_ValueBindingToValueExpression$1", "val$context", "Ljakarta/el/ELContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "()Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/_ValueBindingToValueExpression$1", "this$0", "Ljakarta/faces/component/_ValueBindingToValueExpression;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/_ValueBindingToValueExpression", "access$100", "(Ljakarta/faces/component/_ValueBindingToValueExpression;)Ljakarta/faces/el/ValueBinding;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/_ValueBindingToValueExpression$1", "this$0", "Ljakarta/faces/component/_ValueBindingToValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/_ValueBindingToValueExpression$1", "val$context", "Ljakarta/el/ELContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/_ValueBindingToValueExpression", "access$000", "(Ljakarta/faces/component/_ValueBindingToValueExpression;Ljakarta/el/ELContext;)Ljakarta/faces/context/FacesContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/el/ValueBinding", "isReadOnly", "(Ljakarta/faces/context/FacesContext;)Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "invoke", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/_ValueBindingToValueExpression$1", "invoke", "()Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
