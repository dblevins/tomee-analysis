package asm.org.apache.xbean.recipe;
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
public class ReferenceRecipe$WrapperReferenceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/apache/xbean/recipe/ReferenceRecipe$WrapperReference", null, "org/apache/xbean/recipe/Reference", null);

classWriter.visitInnerClass("org/apache/xbean/recipe/ReferenceRecipe$WrapperReference", "org/apache/xbean/recipe/ReferenceRecipe", "WrapperReference", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xbean/recipe/Reference$Action", "org/apache/xbean/recipe/Reference", "Action", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/xbean/recipe/ReferenceRecipe$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Lorg/apache/xbean/recipe/Reference;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;Lorg/apache/xbean/recipe/Reference;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/recipe/Reference", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/recipe/ReferenceRecipe$WrapperReference", "delegate", "Lorg/apache/xbean/recipe/Reference;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isResolved", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/recipe/ReferenceRecipe$WrapperReference", "delegate", "Lorg/apache/xbean/recipe/Reference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/recipe/Reference", "isResolved", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/recipe/ReferenceRecipe$WrapperReference", "delegate", "Lorg/apache/xbean/recipe/Reference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/recipe/Reference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "set", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/recipe/ReferenceRecipe$WrapperReference", "isResolved", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/recipe/ConstructionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Reference has already been resolved");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/recipe/ConstructionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/recipe/ExecutionContext", "getContext", "()Lorg/apache/xbean/recipe/ExecutionContext;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/recipe/ReferenceRecipe$WrapperReference", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/recipe/ExecutionContext", "addObject", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/recipe/ReferenceRecipe$WrapperReference", "delegate", "Lorg/apache/xbean/recipe/Reference;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/recipe/Reference", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAction", "(Lorg/apache/xbean/recipe/Reference$Action;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/recipe/ReferenceRecipe$WrapperReference", "delegate", "Lorg/apache/xbean/recipe/Reference;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/recipe/Reference", "setAction", "(Lorg/apache/xbean/recipe/Reference$Action;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljava/lang/String;Lorg/apache/xbean/recipe/Reference;Lorg/apache/xbean/recipe/ReferenceRecipe$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/recipe/ReferenceRecipe$WrapperReference", "<init>", "(Ljava/lang/String;Lorg/apache/xbean/recipe/Reference;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
