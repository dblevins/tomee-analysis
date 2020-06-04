package asm.org.apache.xbean.asm7.tree.analysis;
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

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/xbean/asm7/tree/analysis/SourceInterpreter", "Lorg/apache/xbean/asm7/tree/analysis/Interpreter<Lorg/apache/xbean/asm7/tree/analysis/SourceValue;>;Lorg/apache/xbean/asm7/Opcodes;", "org/apache/xbean/asm7/tree/analysis/Interpreter", new String[] { "org/apache/xbean/asm7/Opcodes" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(458752));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/Interpreter", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xbean/asm7/tree/analysis/SourceInterpreter;"));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/Interpreter", "<init>", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newValue", "(Lorg/apache/xbean/asm7/Type;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/asm7/Type", "VOID_TYPE", "Lorg/apache/xbean/asm7/Type;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/Type", "getSize", "()I", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/SourceValue", "<init>", "(I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/AbstractInsnNode", "getOpcode", "()I", false);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
methodVisitor.visitLookupSwitchInsn(label3, new int[] { 9, 10, 14, 15, 18, 178 }, new Label[] { label0, label0, label0, label0, label1, label2 });
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/LdcInsnNode");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/LdcInsnNode", "cst", "Ljava/lang/Object;");
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
methodVisitor.visitInsn(ICONST_2);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/FieldInsnNode");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/FieldInsnNode", "desc", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/Type", "getType", "(Ljava/lang/String;)Lorg/apache/xbean/asm7/Type;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/Type", "getSize", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label4);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/SourceValue", "<init>", "(ILorg/apache/xbean/asm7/tree/AbstractInsnNode;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copyOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/analysis/SourceValue", "getSize", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/SourceValue", "<init>", "(ILorg/apache/xbean/asm7/tree/AbstractInsnNode;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unaryOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/AbstractInsnNode", "getOpcode", "()I", false);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitLookupSwitchInsn(label2, new int[] { 117, 119, 133, 135, 138, 140, 141, 143, 180 }, new Label[] { label0, label0, label0, label0, label0, label0, label0, label0, label1 });
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/FieldInsnNode");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/FieldInsnNode", "desc", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/Type", "getType", "(Ljava/lang/String;)Lorg/apache/xbean/asm7/Type;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/Type", "getSize", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/SourceValue", "<init>", "(ILorg/apache/xbean/asm7/tree/AbstractInsnNode;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "binaryOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/AbstractInsnNode", "getOpcode", "()I", false);
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitLookupSwitchInsn(label1, new int[] { 47, 49, 97, 99, 101, 103, 105, 107, 109, 111, 113, 115, 121, 123, 125, 127, 129, 131 }, new Label[] { label0, label0, label0, label0, label0, label0, label0, label0, label0, label0, label0, label0, label0, label0, label0, label0, label0, label0 });
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/SourceValue", "<init>", "(ILorg/apache/xbean/asm7/tree/AbstractInsnNode;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ternaryOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/SourceValue", "<init>", "(ILorg/apache/xbean/asm7/tree/AbstractInsnNode;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "naryOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Ljava/util/List;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Ljava/util/List<+Lorg/apache/xbean/asm7/tree/analysis/SourceValue;>;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/AbstractInsnNode", "getOpcode", "()I", false);
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
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 186);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/InvokeDynamicInsnNode");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InvokeDynamicInsnNode", "desc", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/Type", "getReturnType", "(Ljava/lang/String;)Lorg/apache/xbean/asm7/Type;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/Type", "getSize", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/MethodInsnNode");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/MethodInsnNode", "desc", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/Type", "getReturnType", "(Ljava/lang/String;)Lorg/apache/xbean/asm7/Type;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/Type", "getSize", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/SourceValue", "<init>", "(ILorg/apache/xbean/asm7/tree/AbstractInsnNode;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "returnOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "merge", "(Lorg/apache/xbean/asm7/tree/analysis/SourceValue;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/xbean/asm7/tree/analysis/SmallSet");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/xbean/asm7/tree/analysis/SmallSet");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/analysis/SmallSet");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/analysis/SmallSet");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/analysis/SmallSet", "union", "(Lorg/apache/xbean/asm7/tree/analysis/SmallSet;)Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(II)I", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/SourceValue", "<init>", "(ILjava/util/Set;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "size", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/tree/analysis/SourceInterpreter", "containsAll", "(Ljava/util/Set;Ljava/util/Set;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashSet", "addAll", "(Ljava/util/Collection;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashSet", "addAll", "(Ljava/util/Collection;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(II)I", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/SourceValue", "<init>", "(ILjava/util/Set;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
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
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "containsAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "merge", "(Lorg/apache/xbean/asm7/tree/analysis/Value;Lorg/apache/xbean/asm7/tree/analysis/Value;)Lorg/apache/xbean/asm7/tree/analysis/Value;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/analysis/SourceInterpreter", "merge", "(Lorg/apache/xbean/asm7/tree/analysis/SourceValue;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "returnOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/Value;Lorg/apache/xbean/asm7/tree/analysis/Value;)V", null, new String[] { "org/apache/xbean/asm7/tree/analysis/AnalyzerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/analysis/SourceInterpreter", "returnOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "naryOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Ljava/util/List;)Lorg/apache/xbean/asm7/tree/analysis/Value;", null, new String[] { "org/apache/xbean/asm7/tree/analysis/AnalyzerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/analysis/SourceInterpreter", "naryOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Ljava/util/List;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "ternaryOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/Value;Lorg/apache/xbean/asm7/tree/analysis/Value;Lorg/apache/xbean/asm7/tree/analysis/Value;)Lorg/apache/xbean/asm7/tree/analysis/Value;", null, new String[] { "org/apache/xbean/asm7/tree/analysis/AnalyzerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/analysis/SourceInterpreter", "ternaryOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "binaryOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/Value;Lorg/apache/xbean/asm7/tree/analysis/Value;)Lorg/apache/xbean/asm7/tree/analysis/Value;", null, new String[] { "org/apache/xbean/asm7/tree/analysis/AnalyzerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/analysis/SourceInterpreter", "binaryOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "unaryOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/Value;)Lorg/apache/xbean/asm7/tree/analysis/Value;", null, new String[] { "org/apache/xbean/asm7/tree/analysis/AnalyzerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/analysis/SourceInterpreter", "unaryOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "copyOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/Value;)Lorg/apache/xbean/asm7/tree/analysis/Value;", null, new String[] { "org/apache/xbean/asm7/tree/analysis/AnalyzerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/analysis/SourceValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/analysis/SourceInterpreter", "copyOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/SourceValue;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "newOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;)Lorg/apache/xbean/asm7/tree/analysis/Value;", null, new String[] { "org/apache/xbean/asm7/tree/analysis/AnalyzerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/analysis/SourceInterpreter", "newOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "newValue", "(Lorg/apache/xbean/asm7/Type;)Lorg/apache/xbean/asm7/tree/analysis/Value;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/analysis/SourceInterpreter", "newValue", "(Lorg/apache/xbean/asm7/Type;)Lorg/apache/xbean/asm7/tree/analysis/SourceValue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
