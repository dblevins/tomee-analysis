package asm.org.eclipse.persistence.internal.libraries.asm.tree.analysis;
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
public class SourceInterpreterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceInterpreter", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Interpreter<Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;>;Lorg/eclipse/persistence/internal/libraries/asm/Opcodes;", "org/eclipse/persistence/internal/libraries/asm/tree/analysis/Interpreter", new String[] { "org/eclipse/persistence/internal/libraries/asm/Opcodes" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(458752));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/Interpreter", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceInterpreter;"));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceInterpreter"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/Interpreter", "<init>", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newValue", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/Type", "VOID_TYPE", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceInterpreter", "org/eclipse/persistence/internal/libraries/asm/Type"}, 2, new Object[] {label0, label0});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/Type", "getSize", "()I", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceInterpreter", "org/eclipse/persistence/internal/libraries/asm/Type"}, 3, new Object[] {label0, label0, Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "<init>", "(I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode", "getOpcode", "()I", false);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
methodVisitor.visitLookupSwitchInsn(label3, new int[] { 9, 10, 14, 15, 18, 178 }, new Label[] { label0, label0, label0, label0, label1, label2 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/LdcInsnNode");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/LdcInsnNode", "cst", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Long");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Double");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, "java/lang/Object"}, 0, null);
methodVisitor.visitInsn(ICONST_2);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/FieldInsnNode");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/FieldInsnNode", "desc", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/libraries/asm/Type", "getType", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/libraries/asm/Type;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/Type", "getSize", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "<init>", "(ILorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copyOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "getSize", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "<init>", "(ILorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unaryOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode", "getOpcode", "()I", false);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitLookupSwitchInsn(label2, new int[] { 117, 119, 133, 135, 138, 140, 141, 143, 180 }, new Label[] { label0, label0, label0, label0, label0, label0, label0, label0, label1 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/FieldInsnNode");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/FieldInsnNode", "desc", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/libraries/asm/Type", "getType", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/libraries/asm/Type;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/Type", "getSize", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "<init>", "(ILorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "binaryOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode", "getOpcode", "()I", false);
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitLookupSwitchInsn(label1, new int[] { 47, 49, 97, 99, 101, 103, 105, 107, 109, 111, 113, 115, 121, 123, 125, 127, 129, 131 }, new Label[] { label0, label0, label0, label0, label0, label0, label0, label0, label0, label0, label0, label0, label0, label0, label0, label0, label0, label0 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "<init>", "(ILorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ternaryOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "<init>", "(ILorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "naryOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Ljava/util/List;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Ljava/util/List<+Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;>;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode", "getOpcode", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 197);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 186);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/InvokeDynamicInsnNode");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/InvokeDynamicInsnNode", "desc", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/libraries/asm/Type", "getReturnType", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/libraries/asm/Type;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/Type", "getSize", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/MethodInsnNode");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/MethodInsnNode", "desc", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/libraries/asm/Type", "getReturnType", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/libraries/asm/Type;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/Type", "getSize", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceInterpreter", "org/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode", "java/util/List", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "<init>", "(ILorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "returnOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "merge", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SmallSet");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SmallSet");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SmallSet");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SmallSet");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SmallSet", "union", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SmallSet;)Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Set"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(II)I", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "<init>", "(ILjava/util/Set;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "size", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceInterpreter", "containsAll", "(Ljava/util/Set;Ljava/util/Set;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashSet", "addAll", "(Ljava/util/Collection;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashSet", "addAll", "(Ljava/util/Collection;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(II)I", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "<init>", "(ILjava/util/Set;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "containsAll", "(Ljava/util/Set;Ljava/util/Set;)Z", "<E:Ljava/lang/Object;>(Ljava/util/Set<TE;>;Ljava/util/Set<TE;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "size", "()I", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "size", "()I", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "containsAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "merge", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceInterpreter", "merge", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "returnOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;)V", null, new String[] { "org/eclipse/persistence/internal/libraries/asm/tree/analysis/AnalyzerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceInterpreter", "returnOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "naryOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Ljava/util/List;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", null, new String[] { "org/eclipse/persistence/internal/libraries/asm/tree/analysis/AnalyzerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceInterpreter", "naryOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Ljava/util/List;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "ternaryOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", null, new String[] { "org/eclipse/persistence/internal/libraries/asm/tree/analysis/AnalyzerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceInterpreter", "ternaryOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "binaryOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", null, new String[] { "org/eclipse/persistence/internal/libraries/asm/tree/analysis/AnalyzerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceInterpreter", "binaryOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "unaryOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", null, new String[] { "org/eclipse/persistence/internal/libraries/asm/tree/analysis/AnalyzerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceInterpreter", "unaryOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "copyOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", null, new String[] { "org/eclipse/persistence/internal/libraries/asm/tree/analysis/AnalyzerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceInterpreter", "copyOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "newOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", null, new String[] { "org/eclipse/persistence/internal/libraries/asm/tree/analysis/AnalyzerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceInterpreter", "newOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "newValue", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceInterpreter", "newValue", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}