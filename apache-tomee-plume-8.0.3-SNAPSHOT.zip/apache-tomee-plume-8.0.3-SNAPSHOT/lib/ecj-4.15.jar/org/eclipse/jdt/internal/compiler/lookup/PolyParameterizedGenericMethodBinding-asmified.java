package asm.org.eclipse.jdt.internal.compiler.lookup;
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
public class PolyParameterizedGenericMethodBindingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/jdt/internal/compiler/lookup/PolyParameterizedGenericMethodBinding", null, "org/eclipse/jdt/internal/compiler/lookup/ParameterizedGenericMethodBinding", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "wrappedBinding", "Lorg/eclipse/jdt/internal/compiler/lookup/ParameterizedGenericMethodBinding;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/jdt/internal/compiler/lookup/ParameterizedGenericMethodBinding;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/ParameterizedGenericMethodBinding", "originalMethod", "Lorg/eclipse/jdt/internal/compiler/lookup/MethodBinding;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/ParameterizedGenericMethodBinding", "typeArguments", "[Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/ParameterizedGenericMethodBinding", "environment", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/ParameterizedGenericMethodBinding", "inferredWithUncheckedConversion", "Z");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/ParameterizedGenericMethodBinding", "targetType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/ParameterizedGenericMethodBinding", "<init>", "(Lorg/eclipse/jdt/internal/compiler/lookup/MethodBinding;[Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;ZZLorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/PolyParameterizedGenericMethodBinding", "wrappedBinding", "Lorg/eclipse/jdt/internal/compiler/lookup/ParameterizedGenericMethodBinding;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/jdt/internal/compiler/lookup/PolyParameterizedGenericMethodBinding");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/PolyParameterizedGenericMethodBinding");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/PolyParameterizedGenericMethodBinding", "wrappedBinding", "Lorg/eclipse/jdt/internal/compiler/lookup/ParameterizedGenericMethodBinding;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/PolyParameterizedGenericMethodBinding", "wrappedBinding", "Lorg/eclipse/jdt/internal/compiler/lookup/ParameterizedGenericMethodBinding;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/PolyParameterizedGenericMethodBinding", "wrappedBinding", "Lorg/eclipse/jdt/internal/compiler/lookup/ParameterizedGenericMethodBinding;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
