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
public class _MethodBindingToMethodExpression$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "jakarta/faces/component/_MethodBindingToMethodExpression$1", "Ljava/lang/Object;Ljakarta/faces/component/_MethodBindingToMethodExpression$Invoker<Ljakarta/el/MethodInfo;>;", "java/lang/Object", new String[] { "jakarta/faces/component/_MethodBindingToMethodExpression$Invoker" });

classWriter.visitOuterClass("javax/faces/component/_MethodBindingToMethodExpression", "getMethodInfo", "(Ljakarta/el/ELContext;)Ljakarta/el/MethodInfo;");

classWriter.visitInnerClass("jakarta/faces/component/_MethodBindingToMethodExpression$1", null, null, 0);

classWriter.visitInnerClass("jakarta/faces/component/_MethodBindingToMethodExpression$Invoker", "jakarta/faces/component/_MethodBindingToMethodExpression", "Invoker", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$facesContext", "Ljakarta/faces/context/FacesContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Ljakarta/faces/component/_MethodBindingToMethodExpression;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljakarta/faces/component/_MethodBindingToMethodExpression;Ljakarta/faces/context/FacesContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/component/_MethodBindingToMethodExpression$1", "this$0", "Ljakarta/faces/component/_MethodBindingToMethodExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/component/_MethodBindingToMethodExpression$1", "val$facesContext", "Ljakarta/faces/context/FacesContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "()Ljakarta/el/MethodInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/el/MethodInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/_MethodBindingToMethodExpression$1", "this$0", "Ljakarta/faces/component/_MethodBindingToMethodExpression;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/_MethodBindingToMethodExpression", "access$000", "(Ljakarta/faces/component/_MethodBindingToMethodExpression;)Ljakarta/faces/el/MethodBinding;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/_MethodBindingToMethodExpression$1", "val$facesContext", "Ljakarta/faces/context/FacesContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/el/MethodBinding", "getType", "(Ljakarta/faces/context/FacesContext;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/MethodInfo", "<init>", "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "invoke", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/_MethodBindingToMethodExpression$1", "invoke", "()Ljakarta/el/MethodInfo;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
