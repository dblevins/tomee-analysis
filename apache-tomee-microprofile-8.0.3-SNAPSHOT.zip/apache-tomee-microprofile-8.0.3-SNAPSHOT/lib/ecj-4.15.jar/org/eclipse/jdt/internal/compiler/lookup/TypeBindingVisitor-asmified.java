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
public class TypeBindingVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "visitedCache", "Lorg/eclipse/jdt/internal/compiler/util/SimpleLookupTable;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visitedCache", "Lorg/eclipse/jdt/internal/compiler/util/SimpleLookupTable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/ArrayBinding;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeVariableBinding;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/WildcardBinding;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/ParameterizedTypeBinding;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/IntersectionTypeBinding18;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/RawTypeBinding;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/PolyTypeBinding;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor;[Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", false);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IF_ICMPLT, label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visitedCache", "Lorg/eclipse/jdt/internal/compiler/util/SimpleLookupTable;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visitedCache", "Lorg/eclipse/jdt/internal/compiler/util/SimpleLookupTable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visitedCache", "Lorg/eclipse/jdt/internal/compiler/util/SimpleLookupTable;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/jdt/internal/compiler/util/SimpleLookupTable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "kind", "()I", false);
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
methodVisitor.visitLookupSwitchInsn(label12, new int[] { 4, 68, 132, 260, 516, 1028, 2052, 4100, 8196, 32772, 65540 }, new Label[] { label3, label4, label5, label6, label7, label8, label3, label9, label7, label10, label11 });
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/TypeVariableBinding");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeVariableBinding;)Z", false);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/TypeVariableBinding", "firstBound", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/TypeVariableBinding", "superclass", "Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/TypeVariableBinding", "superInterfaces", "[Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor;[Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;)V", false);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/ParameterizedTypeBinding");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/ParameterizedTypeBinding;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/ParameterizedTypeBinding", "enclosingType", "()Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/ParameterizedTypeBinding", "arguments", "[Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor;[Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", false);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/ArrayBinding");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/ArrayBinding;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/ArrayBinding", "leafComponentType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", false);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/WildcardBinding");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/WildcardBinding;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/WildcardBinding", "boundKind", "I");
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/WildcardBinding", "bound", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/WildcardBinding", "otherBounds", "[Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor;[Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", false);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/RawTypeBinding");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/RawTypeBinding;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding", "enclosingType", "()Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding", "typeVariables", "()[Lorg/eclipse/jdt/internal/compiler/lookup/TypeVariableBinding;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor;[Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;)V", false);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/IntersectionTypeBinding18");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/IntersectionTypeBinding18;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/IntersectionTypeBinding18", "intersectingTypes", "[Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor;[Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;)V", false);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/PolyTypeBinding");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/PolyTypeBinding;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/InternalError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unexpected binding type");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/InternalError", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor;[Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBindingVisitor;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", false);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IF_ICMPLT, label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
