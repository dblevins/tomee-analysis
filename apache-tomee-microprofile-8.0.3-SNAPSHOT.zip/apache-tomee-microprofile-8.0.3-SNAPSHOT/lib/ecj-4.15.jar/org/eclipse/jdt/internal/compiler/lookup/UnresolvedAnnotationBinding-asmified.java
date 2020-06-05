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
public class UnresolvedAnnotationBindingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", null, "org/eclipse/jdt/internal/compiler/lookup/AnnotationBinding", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "env", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "typeUnresolved", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;[Lorg/eclipse/jdt/internal/compiler/lookup/ElementValuePair;Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/AnnotationBinding", "<init>", "(Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;[Lorg/eclipse/jdt/internal/compiler/lookup/ElementValuePair;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "typeUnresolved", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "env", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resolve", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label1, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "typeUnresolved", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "env", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/LookupEnvironment", "mayTolerateMissingType", "Z");
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "env", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/LookupEnvironment", "mayTolerateMissingType", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "type", "Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "env", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/lookup/BinaryTypeBinding", "resolveType", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;Z)Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "type", "Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", Opcodes.INTEGER}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "env", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/LookupEnvironment", "mayTolerateMissingType", "Z");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "env", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/LookupEnvironment", "mayTolerateMissingType", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "typeUnresolved", "Z");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotationType", "()Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "resolve", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "type", "Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementValuePairs", "()[Lorg/eclipse/jdt/internal/compiler/lookup/ElementValuePair;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label1, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "env", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "typeUnresolved", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "resolve", "()V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "pairs", "[Lorg/eclipse/jdt/internal/compiler/lookup/ElementValuePair;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "pairs", "[Lorg/eclipse/jdt/internal/compiler/lookup/ElementValuePair;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "type", "Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/ElementValuePair", "getName", "()[C", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding", "getMethods", "([C)[Lorg/eclipse/jdt/internal/compiler/lookup/MethodBinding;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(IF_ICMPNE, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/ElementValuePair", "setMethodBinding", "(Lorg/eclipse/jdt/internal/compiler/lookup/MethodBinding;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/eclipse/jdt/internal/compiler/lookup/ElementValuePair", "[Lorg/eclipse/jdt/internal/compiler/lookup/MethodBinding;"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/ElementValuePair", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "env", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/LookupEnvironment", "mayTolerateMissingType", "Z");
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "env", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/LookupEnvironment", "mayTolerateMissingType", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedReferenceBinding");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedReferenceBinding");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "env", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedReferenceBinding", "resolve", "(Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;Z)Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/ElementValuePair", "setValue", "(Ljava/lang/Object;)V", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "[Ljava/lang/Object;");
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
Label label10 = new Label();
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[Ljava/lang/Object;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedReferenceBinding");
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedReferenceBinding");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "env", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedReferenceBinding", "resolve", "(Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;Z)Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPLT, label10);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", Opcodes.INTEGER, "org/eclipse/jdt/internal/compiler/lookup/ElementValuePair", "[Lorg/eclipse/jdt/internal/compiler/lookup/MethodBinding;", "java/lang/Object", Opcodes.INTEGER}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "env", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/LookupEnvironment", "mayTolerateMissingType", "Z");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "env", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/LookupEnvironment", "mayTolerateMissingType", "Z");
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitIincInsn(1, -1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitJumpInsn(IFGE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "env", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/UnresolvedAnnotationBinding", "pairs", "[Lorg/eclipse/jdt/internal/compiler/lookup/ElementValuePair;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}