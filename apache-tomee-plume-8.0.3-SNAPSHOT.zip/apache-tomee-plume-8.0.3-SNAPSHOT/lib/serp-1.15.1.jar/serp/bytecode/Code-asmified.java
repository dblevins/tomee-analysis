package asm.serp.bytecode;
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
public class CodeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "serp/bytecode/Code", null, "serp/bytecode/Attribute", null);

classWriter.visitInnerClass("serp/bytecode/Code$CodeIterator", "serp/bytecode/Code", "CodeIterator", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_head", "Lserp/bytecode/CodeEntry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_tail", "Lserp/bytecode/CodeEntry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_ci", "Lserp/bytecode/Code$CodeIterator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_maxStack", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_maxLocals", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_size", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_handlers", "Ljava/util/Collection;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_attrs", "Ljava/util/Collection;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_byteIndexesValid", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(ILserp/bytecode/Attributes;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Attribute", "<init>", "(ILserp/bytecode/Attributes;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_maxStack", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_maxLocals", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_size", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_handlers", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_attrs", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/CodeEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/CodeEntry", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/CodeEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/CodeEntry", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/CodeEntry", "prev", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/Code$CodeIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code$CodeIterator", "<init>", "(Lserp/bytecode/Code;Lserp/bytecode/CodeEntry;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/Project");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Project", "<init>", "()V", false);
methodVisitor.visitLdcInsn("");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Project", "loadClass", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Lserp/bytecode/BCClass;", false);
methodVisitor.visitLdcInsn("");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCClass", "declareMethod", "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lserp/bytecode/BCMethod;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "<init>", "(ILserp/bytecode/Attributes;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMethod", "()Lserp/bytecode/BCMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getOwner", "()Lserp/bytecode/Attributes;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/BCMethod");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getAttributesHolder", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_attrs", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxStack", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_maxStack", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxStack", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_maxStack", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxLocals", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_maxLocals", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxLocals", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_maxLocals", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocalsIndex", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getMethod", "()Lserp/bytecode/BCMethod;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCMethod", "isStatic", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getMethod", "()Lserp/bytecode/BCMethod;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCMethod", "getParamNames", "()[Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[Ljava/lang/String;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Long", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Double", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParamsIndex", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getMethod", "()Lserp/bytecode/BCMethod;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCMethod", "isStatic", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getMethod", "()Lserp/bytecode/BCMethod;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCMethod", "getParamNames", "()[Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[Ljava/lang/String;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Long", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Double", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNextLocalsIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "calculateMaxLocals", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getMaxLocals", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "calculateMaxLocals", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getMethod", "()Lserp/bytecode/BCMethod;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCMethod", "getParamNames", "()[Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getMethod", "()Lserp/bytecode/BCMethod;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCMethod", "isStatic", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[Ljava/lang/String;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getLocalsIndex", "(I)I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Long", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Double", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 5);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.TOP, Opcodes.TOP, "serp/bytecode/CodeEntry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(INSTANCEOF, "serp/bytecode/StoreInstruction");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/StoreInstruction");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/StoreInstruction", "getLocal", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/StoreInstruction", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Long", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/StoreInstruction", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Double", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"serp/bytecode/Code", "[Ljava/lang/String;", Opcodes.INTEGER, "serp/bytecode/StoreInstruction", Opcodes.INTEGER, "serp/bytecode/CodeEntry"}, 0, new Object[] {});
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IF_ICMPLE, label5);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"serp/bytecode/Code", "[Ljava/lang/String;", Opcodes.INTEGER, Opcodes.TOP, Opcodes.INTEGER, "serp/bytecode/CodeEntry"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "setMaxLocals", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "calculateMaxStack", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getExceptionHandlers", "()[Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"serp/bytecode/Code", Opcodes.INTEGER, Opcodes.INTEGER, "[Lserp/bytecode/ExceptionHandler;", Opcodes.TOP, "serp/bytecode/CodeEntry"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/Instruction");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "getStackChange", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"serp/bytecode/Code", Opcodes.INTEGER, Opcodes.INTEGER, "[Lserp/bytecode/ExceptionHandler;", "serp/bytecode/Instruction", "serp/bytecode/CodeEntry", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ExceptionHandler", "getTryStart", "()Lserp/bytecode/Instruction;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitIincInsn(1, 1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label5);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "setMaxStack", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExceptionHandlers", "()[Lserp/bytecode/ExceptionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_handlers", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_handlers", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "serp/bytecode/ExceptionHandler");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lserp/bytecode/ExceptionHandler;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Lserp/bytecode/ExceptionHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExceptionHandler", "(Ljava/lang/String;)Lserp/bytecode/ExceptionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getProject", "()Lserp/bytecode/Project;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Project", "getNameCache", "()Lserp/bytecode/NameCache;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/NameCache", "getExternalForm", "(Ljava/lang/String;Z)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getExceptionHandlers", "()[Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.TOP, "[Lserp/bytecode/ExceptionHandler;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ExceptionHandler", "getCatchName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"serp/bytecode/Code", "java/lang/String", "java/lang/String", "[Lserp/bytecode/ExceptionHandler;", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"serp/bytecode/Code", "java/lang/String", Opcodes.TOP, "[Lserp/bytecode/ExceptionHandler;"}, 0, new Object[] {});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExceptionHandler", "(Ljava/lang/Class;)Lserp/bytecode/ExceptionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getExceptionHandler", "(Ljava/lang/String;)Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getExceptionHandler", "(Ljava/lang/String;)Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExceptionHandler", "(Lserp/bytecode/BCClass;)Lserp/bytecode/ExceptionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getExceptionHandler", "(Ljava/lang/String;)Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCClass", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getExceptionHandler", "(Ljava/lang/String;)Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExceptionHandlers", "(Ljava/lang/String;)[Lserp/bytecode/ExceptionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getProject", "()Lserp/bytecode/Project;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Project", "getNameCache", "()Lserp/bytecode/NameCache;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/NameCache", "getExternalForm", "(Ljava/lang/String;Z)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getExceptionHandlers", "()[Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"serp/bytecode/Code", "java/lang/String", "java/util/List", Opcodes.TOP, "[Lserp/bytecode/ExceptionHandler;", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ExceptionHandler", "getCatchName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"serp/bytecode/Code", "java/lang/String", "java/util/List", "java/lang/String", "[Lserp/bytecode/ExceptionHandler;", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"serp/bytecode/Code", "java/lang/String", "java/util/List", Opcodes.TOP, "[Lserp/bytecode/ExceptionHandler;"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "serp/bytecode/ExceptionHandler");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lserp/bytecode/ExceptionHandler;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Lserp/bytecode/ExceptionHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExceptionHandlers", "(Ljava/lang/Class;)[Lserp/bytecode/ExceptionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getExceptionHandlers", "(Ljava/lang/String;)[Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getExceptionHandlers", "(Ljava/lang/String;)[Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExceptionHandlers", "(Lserp/bytecode/BCClass;)[Lserp/bytecode/ExceptionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getExceptionHandlers", "(Ljava/lang/String;)[Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCClass", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getExceptionHandlers", "(Ljava/lang/String;)[Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExceptionHandlers", "([Lserp/bytecode/ExceptionHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "clearExceptionHandlers", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "addExceptionHandler", "(Lserp/bytecode/ExceptionHandler;)Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addExceptionHandler", "(Lserp/bytecode/ExceptionHandler;)Lserp/bytecode/ExceptionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "addExceptionHandler", "()Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ExceptionHandler", "read", "(Lserp/bytecode/ExceptionHandler;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addExceptionHandler", "()Lserp/bytecode/ExceptionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/ExceptionHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ExceptionHandler", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_handlers", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addExceptionHandler", "(Lserp/bytecode/Instruction;Lserp/bytecode/Instruction;Lserp/bytecode/Instruction;Ljava/lang/String;)Lserp/bytecode/ExceptionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "addExceptionHandler", "()Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ExceptionHandler", "setTryStart", "(Lserp/bytecode/Instruction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ExceptionHandler", "setTryEnd", "(Lserp/bytecode/Instruction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ExceptionHandler", "setHandlerStart", "(Lserp/bytecode/Instruction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ExceptionHandler", "setCatch", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addExceptionHandler", "(Lserp/bytecode/Instruction;Lserp/bytecode/Instruction;Lserp/bytecode/Instruction;Ljava/lang/Class;)Lserp/bytecode/ExceptionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "addExceptionHandler", "(Lserp/bytecode/Instruction;Lserp/bytecode/Instruction;Lserp/bytecode/Instruction;Ljava/lang/String;)Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addExceptionHandler", "(Lserp/bytecode/Instruction;Lserp/bytecode/Instruction;Lserp/bytecode/Instruction;Lserp/bytecode/BCClass;)Lserp/bytecode/ExceptionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCClass", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "addExceptionHandler", "(Lserp/bytecode/Instruction;Lserp/bytecode/Instruction;Lserp/bytecode/Instruction;Ljava/lang/String;)Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clearExceptionHandlers", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_handlers", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ExceptionHandler");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "remove", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ExceptionHandler", "invalidate", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeExceptionHandler", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getExceptionHandler", "(Ljava/lang/String;)Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "removeExceptionHandler", "(Lserp/bytecode/ExceptionHandler;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeExceptionHandler", "(Ljava/lang/Class;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "removeExceptionHandler", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "removeExceptionHandler", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeExceptionHandler", "(Lserp/bytecode/BCClass;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "removeExceptionHandler", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCClass", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "removeExceptionHandler", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeExceptionHandler", "(Lserp/bytecode/ExceptionHandler;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_handlers", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "remove", "(Ljava/lang/Object;)Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ExceptionHandler", "invalidate", "()V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_size", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeFirst", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/Code$CodeIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code$CodeIterator", "<init>", "(Lserp/bytecode/Code;Lserp/bytecode/CodeEntry;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterLast", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_size", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/Code$CodeIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code$CodeIterator", "<init>", "(Lserp/bytecode/Code;Lserp/bytecode/CodeEntry;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/Code$CodeIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "prev", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_size", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code$CodeIterator", "<init>", "(Lserp/bytecode/Code;Lserp/bytecode/CodeEntry;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "before", "(Lserp/bytecode/Instruction;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "getCode", "()Lserp/bytecode/Code;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ins.code != this");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/Code$CodeIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Instruction", "prev", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitIntInsn(BIPUSH, -99);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code$CodeIterator", "<init>", "(Lserp/bytecode/Code;Lserp/bytecode/CodeEntry;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "after", "(Lserp/bytecode/Instruction;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "before", "(Lserp/bytecode/Instruction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "next", "()Lserp/bytecode/Instruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code$CodeIterator", "hasNext", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasPrevious", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code$CodeIterator", "hasPrevious", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code$CodeIterator", "next", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/Instruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code$CodeIterator", "nextIndex", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previous", "()Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code$CodeIterator", "previous", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/Instruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previousIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code$CodeIterator", "previousIndex", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "before", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_size", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IndexOutOfBoundsException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IndexOutOfBoundsException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"serp/bytecode/CodeEntry", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/Code$CodeIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code$CodeIterator", "<init>", "(Lserp/bytecode/Code;Lserp/bytecode/CodeEntry;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "after", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "before", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "next", "()Lserp/bytecode/Instruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "searchForward", "(Lserp/bytecode/Instruction;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "hasNext", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "next", "()Lserp/bytecode/Instruction;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "equalsInstruction", "(Lserp/bytecode/Instruction;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "searchBackward", "(Lserp/bytecode/Instruction;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "hasPrevious", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "previous", "()Lserp/bytecode/Instruction;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "equalsInstruction", "(Lserp/bytecode/Instruction;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "getOpcode", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "createInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "read", "(Lserp/bytecode/Instruction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code$CodeIterator", "add", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "set", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "getOpcode", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "createInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "read", "(Lserp/bytecode/Instruction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code$CodeIterator", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "replace", "(Lserp/bytecode/Instruction;Lserp/bytecode/Instruction;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "beforeFirst", "()V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "searchForward", "(Lserp/bytecode/Instruction;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "set", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "replace", "([Lserp/bytecode/Instruction;[Lserp/bytecode/Instruction;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "replace", "(Lserp/bytecode/Instruction;Lserp/bytecode/Instruction;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "replace", "(Lserp/bytecode/Instruction;Lserp/bytecode/Instruction;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code$CodeIterator", "remove", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "classconstant", "()Lserp/bytecode/ClassConstantInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/ClassConstantInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getMethod", "()Lserp/bytecode/BCMethod;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCMethod", "getDeclarer", "()Lserp/bytecode/BCClass;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "nop", "()Lserp/bytecode/Instruction;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ClassConstantInstruction", "<init>", "(Lserp/bytecode/BCClass;Lserp/bytecode/Code;Lserp/bytecode/Instruction;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nop", "()Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "constant", "()Lserp/bytecode/ConstantInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/ConstantInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ConstantInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ConstantInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xload", "()Lserp/bytecode/LoadInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/LoadInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/LoadInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LoadInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iload", "()Lserp/bytecode/LoadInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/LoadInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/LoadInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LoadInstruction", "setType", "(Ljava/lang/Class;)Lserp/bytecode/TypedInstruction;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LoadInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lload", "()Lserp/bytecode/LoadInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/LoadInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/LoadInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Long", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LoadInstruction", "setType", "(Ljava/lang/Class;)Lserp/bytecode/TypedInstruction;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LoadInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fload", "()Lserp/bytecode/LoadInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/LoadInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/LoadInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Float", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LoadInstruction", "setType", "(Ljava/lang/Class;)Lserp/bytecode/TypedInstruction;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LoadInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dload", "()Lserp/bytecode/LoadInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/LoadInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/LoadInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Double", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LoadInstruction", "setType", "(Ljava/lang/Class;)Lserp/bytecode/TypedInstruction;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LoadInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "aload", "()Lserp/bytecode/LoadInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/LoadInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/LoadInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LoadInstruction", "setType", "(Ljava/lang/Class;)Lserp/bytecode/TypedInstruction;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LoadInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xstore", "()Lserp/bytecode/StoreInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/StoreInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/StoreInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/StoreInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "istore", "()Lserp/bytecode/StoreInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/StoreInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/StoreInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/StoreInstruction", "setType", "(Ljava/lang/Class;)Lserp/bytecode/TypedInstruction;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/StoreInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lstore", "()Lserp/bytecode/StoreInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/StoreInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/StoreInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Long", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/StoreInstruction", "setType", "(Ljava/lang/Class;)Lserp/bytecode/TypedInstruction;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/StoreInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fstore", "()Lserp/bytecode/StoreInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/StoreInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/StoreInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Float", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/StoreInstruction", "setType", "(Ljava/lang/Class;)Lserp/bytecode/TypedInstruction;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/StoreInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dstore", "()Lserp/bytecode/StoreInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/StoreInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/StoreInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Double", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/StoreInstruction", "setType", "(Ljava/lang/Class;)Lserp/bytecode/TypedInstruction;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/StoreInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "astore", "()Lserp/bytecode/StoreInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/StoreInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/StoreInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/StoreInstruction", "setType", "(Ljava/lang/Class;)Lserp/bytecode/TypedInstruction;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/StoreInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ret", "()Lserp/bytecode/RetInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 169);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/RetInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iinc", "()Lserp/bytecode/IIncInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 132);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IIncInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "wide", "()Lserp/bytecode/WideInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 196);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/WideInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xaload", "()Lserp/bytecode/ArrayLoadInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/ArrayLoadInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ArrayLoadInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayLoadInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iaload", "()Lserp/bytecode/ArrayLoadInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayLoadInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "laload", "()Lserp/bytecode/ArrayLoadInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayLoadInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "faload", "()Lserp/bytecode/ArrayLoadInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayLoadInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "daload", "()Lserp/bytecode/ArrayLoadInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayLoadInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "aaload", "()Lserp/bytecode/ArrayLoadInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayLoadInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "baload", "()Lserp/bytecode/ArrayLoadInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayLoadInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "caload", "()Lserp/bytecode/ArrayLoadInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayLoadInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "saload", "()Lserp/bytecode/ArrayLoadInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayLoadInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xastore", "()Lserp/bytecode/ArrayStoreInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/ArrayStoreInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ArrayStoreInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayStoreInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iastore", "()Lserp/bytecode/ArrayStoreInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 79);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayStoreInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lastore", "()Lserp/bytecode/ArrayStoreInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayStoreInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fastore", "()Lserp/bytecode/ArrayStoreInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 81);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayStoreInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dastore", "()Lserp/bytecode/ArrayStoreInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 82);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayStoreInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "aastore", "()Lserp/bytecode/ArrayStoreInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 83);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayStoreInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "bastore", "()Lserp/bytecode/ArrayStoreInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 84);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayStoreInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "castore", "()Lserp/bytecode/ArrayStoreInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 85);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayStoreInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sastore", "()Lserp/bytecode/ArrayStoreInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 86);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ArrayStoreInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pop", "()Lserp/bytecode/StackInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 87);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/StackInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pop2", "()Lserp/bytecode/StackInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 88);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/StackInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dup", "()Lserp/bytecode/StackInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 89);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/StackInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dupx1", "()Lserp/bytecode/StackInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 90);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/StackInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dupx2", "()Lserp/bytecode/StackInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 91);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/StackInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dup2", "()Lserp/bytecode/StackInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 92);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/StackInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dup2x1", "()Lserp/bytecode/StackInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/StackInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dup2x2", "()Lserp/bytecode/StackInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 94);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/StackInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "swap", "()Lserp/bytecode/StackInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 95);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/StackInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "math", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/MathInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xadd", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "math", "()Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 96);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/MathInstruction", "setOperation", "(I)Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iadd", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 96);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ladd", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 97);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fadd", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 98);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dadd", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 99);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xsub", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "math", "()Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/MathInstruction", "setOperation", "(I)Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isub", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lsub", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 101);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fsub", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 102);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dsub", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 103);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xmul", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "math", "()Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 104);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/MathInstruction", "setOperation", "(I)Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "imul", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 104);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lmul", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 105);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fmul", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 106);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dmul", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 107);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xdiv", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "math", "()Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 108);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/MathInstruction", "setOperation", "(I)Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "idiv", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 108);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ldiv", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 109);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fdiv", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 110);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ddiv", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 111);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xrem", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "math", "()Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 112);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/MathInstruction", "setOperation", "(I)Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "irem", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 112);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lrem", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 113);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "frem", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 114);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "drem", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xneg", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "math", "()Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 116);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/MathInstruction", "setOperation", "(I)Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ineg", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 116);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lneg", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 117);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fneg", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 118);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dneg", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 119);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xshl", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "math", "()Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 120);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/MathInstruction", "setOperation", "(I)Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ishl", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 120);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lshl", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 121);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xshr", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "math", "()Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 122);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/MathInstruction", "setOperation", "(I)Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ishr", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 122);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lshr", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 123);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xushr", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "math", "()Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 124);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/MathInstruction", "setOperation", "(I)Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iushr", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 124);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lushr", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 125);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xand", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "math", "()Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 126);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/MathInstruction", "setOperation", "(I)Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iand", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 126);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "land", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 127);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xor", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "math", "()Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/MathInstruction", "setOperation", "(I)Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ior", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lor", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 129);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xxor", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "math", "()Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(SIPUSH, 130);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/MathInstruction", "setOperation", "(I)Lserp/bytecode/MathInstruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ixor", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 130);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lxor", "()Lserp/bytecode/MathInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 131);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "convert", "()Lserp/bytecode/ConvertInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/ConvertInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ConvertInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ConvertInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xcmp", "()Lserp/bytecode/CmpInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/CmpInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/CmpInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/CmpInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lcmp", "()Lserp/bytecode/CmpInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 148);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/CmpInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fcmpl", "()Lserp/bytecode/CmpInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 149);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/CmpInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fcmpg", "()Lserp/bytecode/CmpInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 150);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/CmpInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dcmpl", "()Lserp/bytecode/CmpInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 151);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/CmpInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dcmpg", "()Lserp/bytecode/CmpInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 152);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/CmpInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ifeq", "()Lserp/bytecode/IfInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 153);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ifne", "()Lserp/bytecode/IfInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 154);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iflt", "()Lserp/bytecode/IfInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 155);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ifge", "()Lserp/bytecode/IfInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 156);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ifgt", "()Lserp/bytecode/IfInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 157);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ifle", "()Lserp/bytecode/IfInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 158);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ificmpeq", "()Lserp/bytecode/IfInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 159);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ificmpne", "()Lserp/bytecode/IfInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 160);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ificmplt", "()Lserp/bytecode/IfInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 161);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ificmpge", "()Lserp/bytecode/IfInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 162);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ificmpgt", "()Lserp/bytecode/IfInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 163);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ificmple", "()Lserp/bytecode/IfInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 164);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ifacmpeq", "()Lserp/bytecode/IfInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 165);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ifacmpne", "()Lserp/bytecode/IfInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 166);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ifnull", "()Lserp/bytecode/IfInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 198);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ifnonnull", "()Lserp/bytecode/IfInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 199);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "go2", "()Lserp/bytecode/JumpInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 167);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/JumpInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "jsr", "()Lserp/bytecode/JumpInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 168);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/JumpInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "tableswitch", "()Lserp/bytecode/TableSwitchInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 170);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/TableSwitchInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lookupswitch", "()Lserp/bytecode/LookupSwitchInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 171);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LookupSwitchInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xreturn", "()Lserp/bytecode/ReturnInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/ReturnInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ReturnInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ReturnInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "vreturn", "()Lserp/bytecode/ReturnInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 177);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ReturnInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ireturn", "()Lserp/bytecode/ReturnInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 172);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ReturnInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lreturn", "()Lserp/bytecode/ReturnInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 173);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ReturnInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "freturn", "()Lserp/bytecode/ReturnInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 174);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ReturnInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dreturn", "()Lserp/bytecode/ReturnInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 175);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ReturnInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "areturn", "()Lserp/bytecode/ReturnInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 176);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ReturnInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getfield", "()Lserp/bytecode/GetFieldInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 180);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/GetFieldInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getstatic", "()Lserp/bytecode/GetFieldInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 178);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/GetFieldInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "putfield", "()Lserp/bytecode/PutFieldInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 181);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/PutFieldInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "putstatic", "()Lserp/bytecode/PutFieldInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 179);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/PutFieldInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invokevirtual", "()Lserp/bytecode/MethodInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 182);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MethodInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invokespecial", "()Lserp/bytecode/MethodInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 183);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MethodInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invokeinterface", "()Lserp/bytecode/MethodInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 185);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MethodInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invokestatic", "()Lserp/bytecode/MethodInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 184);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MethodInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invokedynamic", "()Lserp/bytecode/MethodInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 186);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MethodInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "anew", "()Lserp/bytecode/ClassInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 187);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ClassInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "anewarray", "()Lserp/bytecode/ClassInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 189);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ClassInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "checkcast", "()Lserp/bytecode/ClassInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 192);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ClassInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isinstance", "()Lserp/bytecode/ClassInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 193);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ClassInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "multianewarray", "()Lserp/bytecode/MultiANewArrayInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 197);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MultiANewArrayInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newarray", "()Lserp/bytecode/NewArrayInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 188);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/NewArrayInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "arraylength", "()Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 190);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "athrow", "()Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 191);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "monitorenter", "()Lserp/bytecode/MonitorEnterInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 194);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MonitorEnterInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "monitorexit", "()Lserp/bytecode/MonitorExitInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 195);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/MonitorExitInstruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInstructions", "()[Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_size", "I");
methodVisitor.visitTypeInsn(ANEWARRAY, "serp/bytecode/Instruction");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lserp/bytecode/Instruction;", Opcodes.INTEGER, "serp/bytecode/CodeEntry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/Instruction");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getLength", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getLastInstruction", "()Lserp/bytecode/Instruction;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "getByteIndex", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "getLength", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, "serp/bytecode/Instruction"}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_handlers", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "size", "()I", true);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getAttributes", "()[Lserp/bytecode/Attribute;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[Lserp/bytecode/Attribute;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Attribute", "getLength", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "acceptVisit", "(Lserp/bytecode/visitor/BCVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/visitor/BCVisitor", "enterCode", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, "serp/bytecode/CodeEntry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/Instruction");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/visitor/BCVisitor", "enterInstruction", "(Lserp/bytecode/Instruction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "acceptVisit", "(Lserp/bytecode/visitor/BCVisitor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/visitor/BCVisitor", "exitInstruction", "(Lserp/bytecode/Instruction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_handlers", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ExceptionHandler");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ExceptionHandler", "acceptVisit", "(Lserp/bytecode/visitor/BCVisitor;)V", false);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "visitAttributes", "(Lserp/bytecode/visitor/BCVisitor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/visitor/BCVisitor", "exitCode", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLineNumberTable", "(Z)Lserp/bytecode/LineNumberTable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("LineNumberTable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getAttribute", "(Ljava/lang/String;)Lserp/bytecode/Attribute;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LineNumberTable");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"serp/bytecode/LineNumberTable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("LineNumberTable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "addAttribute", "(Ljava/lang/String;)Lserp/bytecode/Attribute;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LineNumberTable");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeLineNumberTable", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("LineNumberTable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "removeAttribute", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocalVariableTable", "(Z)Lserp/bytecode/LocalVariableTable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("LocalVariableTable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getAttribute", "(Ljava/lang/String;)Lserp/bytecode/Attribute;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LocalVariableTable");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"serp/bytecode/LocalVariableTable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("LocalVariableTable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "addAttribute", "(Ljava/lang/String;)Lserp/bytecode/Attribute;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LocalVariableTable");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeLocalVariableTables", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("LocalVariableTable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "removeAttribute", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocalVariableTypeTable", "(Z)Lserp/bytecode/LocalVariableTypeTable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("LocalVariableTypeTable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getAttribute", "(Ljava/lang/String;)Lserp/bytecode/Attribute;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LocalVariableTypeTable");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"serp/bytecode/LocalVariableTypeTable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("LocalVariableTypeTable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "addAttribute", "(Ljava/lang/String;)Lserp/bytecode/Attribute;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LocalVariableTypeTable");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeLocalVariableTypeTables", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("LocalVariableTypeTable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "removeAttribute", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "read", "(Lserp/bytecode/Attribute;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/Code");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getMaxStack", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_maxStack", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getMaxLocals", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_maxLocals", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/CodeEntry", "prev", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_size", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_byteIndexesValid", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "beforeFirst", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_handlers", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"serp/bytecode/Code", "serp/bytecode/Attribute", "serp/bytecode/Code", Opcodes.TOP, Opcodes.TOP, "serp/bytecode/CodeEntry"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/Instruction");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "getOpcode", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "createInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "serp/bytecode/Code$CodeIterator", "access$000", "(Lserp/bytecode/Code$CodeIterator;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "serp/bytecode/ConstantInstruction");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "read", "(Lserp/bytecode/Instruction;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"serp/bytecode/Code", "serp/bytecode/Attribute", "serp/bytecode/Code", "serp/bytecode/Instruction", "serp/bytecode/Instruction", "serp/bytecode/CodeEntry"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getExceptionHandlers", "()[Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"serp/bytecode/Code", "serp/bytecode/Attribute", "serp/bytecode/Code", Opcodes.TOP, Opcodes.TOP, "[Lserp/bytecode/ExceptionHandler;", Opcodes.TOP, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "addExceptionHandler", "()Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ExceptionHandler", "read", "(Lserp/bytecode/ExceptionHandler;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ExceptionHandler", "updateTargets", "()V", false);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "updateInstructionPointers", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getAttributes", "()[Lserp/bytecode/Attribute;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "setAttributes", "([Lserp/bytecode/Attribute;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getLocalVariableTable", "(Z)Lserp/bytecode/LocalVariableTable;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LocalVariableTable", "updateTargets", "()V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, "serp/bytecode/LocalVariableTable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getLocalVariableTypeTable", "(Z)Lserp/bytecode/LocalVariableTypeTable;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LocalVariableTypeTable", "updateTargets", "()V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"serp/bytecode/LocalVariableTypeTable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getLineNumberTable", "(Z)Lserp/bytecode/LineNumberTable;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LineNumberTable", "updateTargets", "()V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"serp/bytecode/LineNumberTable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 11);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"serp/bytecode/CodeEntry", "serp/bytecode/CodeEntry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitTypeInsn(INSTANCEOF, "serp/bytecode/ConstantInstruction");
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ConstantInstruction");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/Instruction");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ConstantInstruction", "read", "(Lserp/bytecode/Instruction;)V", false);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "beforeFirst", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "read", "(Ljava/io/DataInput;I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readUnsignedShort", "()I", true);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_maxStack", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readUnsignedShort", "()I", true);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_maxLocals", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readInt", "()I", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "readCode", "(Ljava/io/DataInput;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_handlers", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readUnsignedShort", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.INTEGER, Opcodes.TOP, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "addExceptionHandler", "()Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ExceptionHandler", "read", "(Ljava/io/DataInput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ExceptionHandler", "updateTargets", "()V", false);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "readAttributes", "(Ljava/io/DataInput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getLocalVariableTable", "(Z)Lserp/bytecode/LocalVariableTable;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LocalVariableTable", "updateTargets", "()V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, "serp/bytecode/LocalVariableTable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getLocalVariableTypeTable", "(Z)Lserp/bytecode/LocalVariableTypeTable;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LocalVariableTypeTable", "updateTargets", "()V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"serp/bytecode/LocalVariableTypeTable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getLineNumberTable", "(Z)Lserp/bytecode/LineNumberTable;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LineNumberTable", "updateTargets", "()V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"serp/bytecode/LineNumberTable"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "write", "(Ljava/io/DataOutput;I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_maxStack", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeShort", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_maxLocals", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeShort", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "toByteArray", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeInt", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "write", "([B)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_handlers", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "size", "()I", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeShort", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_handlers", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[B", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/ExceptionHandler");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ExceptionHandler", "write", "(Ljava/io/DataOutput;)V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "writeAttributes", "(Ljava/io/DataOutput;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "readCode", "(Ljava/io/DataInput;I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/CodeEntry", "prev", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_size", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_byteIndexesValid", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "beforeFirst", "()V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readUnsignedByte", "()I", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "createInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "serp/bytecode/Code$CodeIterator", "access$000", "(Lserp/bytecode/Code$CodeIterator;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Instruction", "byteIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "read", "(Ljava/io/DataInput;)V", false);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "getLength", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "updateInstructionPointers", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "beforeFirst", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_byteIndexesValid", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "updateInstructionPointers", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 1);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"serp/bytecode/CodeEntry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "serp/bytecode/InstructionPtr");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/InstructionPtr");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "serp/bytecode/InstructionPtr", "updateTargets", "()V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getByteIndex", "(Lserp/bytecode/Instruction;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_byteIndexesValid", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Instruction", "byteIndex", "I");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Instruction", "byteIndex", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 3);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, "serp/bytecode/CodeEntry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/Instruction");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "getLength", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ins.owner != this");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "invalidateByteIndexes", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_byteIndexesValid", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getInstruction", "(I)Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 3);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, "serp/bytecode/CodeEntry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/Instruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/Instruction");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "getLength", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getFirstInstruction", "()Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/Instruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getLastInstruction", "()Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "prev", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/Instruction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "indexOf", "(Lserp/bytecode/Instruction;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, "serp/bytecode/CodeEntry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ins.code != this");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "writeCode", "(Ljava/io/DataOutput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, "serp/bytecode/CodeEntry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/Instruction");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "getOpcode", "()I", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeByte", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Instruction", "write", "(Ljava/io/DataOutput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "toByteArray", "()[B", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label0, label4, null);
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label7, "java/lang/Exception");
methodVisitor.visitTryCatchBlock(label4, label5, label4, null);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayOutputStream", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/io/DataOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/DataOutputStream", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "writeCode", "(Ljava/io/DataOutput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "toByteArray", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/DataOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"serp/bytecode/Code", "java/io/ByteArrayOutputStream", "java/io/DataOutputStream", "[B"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"serp/bytecode/Code", "java/io/ByteArrayOutputStream", "java/io/DataOutputStream"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/DataOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label6);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"serp/bytecode/Code", "java/io/ByteArrayOutputStream", "java/io/DataOutputStream", Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "fromByteArray", "([B)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label0, label4, null);
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label7, "java/lang/Exception");
methodVisitor.visitTryCatchBlock(label4, label5, label4, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/CodeEntry", "next", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/CodeEntry", "prev", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_size", "I");
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/io/DataInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayInputStream", "<init>", "([B)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/DataInputStream", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "readCode", "(Ljava/io/DataInput;I)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/DataInputStream", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"serp/bytecode/Code", "[B", "java/io/DataInputStream"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/DataInputStream", "close", "()V", false);
methodVisitor.visitLabel(label6);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"serp/bytecode/Code", "[B", "java/io/DataInputStream", Opcodes.TOP, "java/lang/Throwable"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_ci", "Lserp/bytecode/Code$CodeIterator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code$CodeIterator", "add", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "addInstruction", "(I)Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "createInstruction", "(I)Lserp/bytecode/Instruction;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "addInstruction", "(Lserp/bytecode/Instruction;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createInstruction", "(I)Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
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
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
Label label16 = new Label();
Label label17 = new Label();
Label label18 = new Label();
Label label19 = new Label();
Label label20 = new Label();
Label label21 = new Label();
Label label22 = new Label();
Label label23 = new Label();
Label label24 = new Label();
Label label25 = new Label();
Label label26 = new Label();
methodVisitor.visitTableSwitchInsn(0, 201, label26, new Label[] { label0, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label2, label2, label2, label2, label2, label2, label2, label2, label2, label2, label2, label2, label2, label2, label2, label2, label2, label2, label2, label2, label2, label2, label2, label2, label2, label3, label3, label3, label3, label3, label3, label3, label3, label4, label4, label4, label4, label4, label4, label4, label4, label4, label4, label4, label4, label4, label4, label4, label4, label4, label4, label4, label4, label4, label4, label4, label4, label4, label5, label5, label5, label5, label5, label5, label5, label5, label6, label6, label6, label6, label6, label6, label6, label6, label6, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label7, label8, label9, label9, label9, label9, label9, label9, label9, label9, label9, label9, label9, label9, label9, label9, label9, label10, label10, label10, label10, label10, label11, label11, label11, label11, label11, label11, label11, label11, label11, label11, label11, label11, label11, label11, label12, label12, label13, label14, label15, label16, label16, label16, label16, label16, label16, label17, label18, label17, label18, label19, label19, label19, label19, label19, label20, label21, label20, label0, label0, label20, label20, label22, label23, label24, label25, label11, label11, label12, label12 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/Instruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Instruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/ConstantInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ConstantInstruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/LoadInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/LoadInstruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/ArrayLoadInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ArrayLoadInstruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/StoreInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/StoreInstruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/ArrayStoreInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ArrayStoreInstruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/StackInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/StackInstruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/MathInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/MathInstruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/IIncInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/IIncInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/ConvertInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ConvertInstruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/CmpInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/CmpInstruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/IfInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/IfInstruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/GotoInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/GotoInstruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/RetInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/RetInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/TableSwitchInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/TableSwitchInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/LookupSwitchInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/LookupSwitchInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/ReturnInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ReturnInstruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/GetFieldInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/GetFieldInstruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/PutFieldInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/PutFieldInstruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/MethodInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/MethodInstruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/ClassInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ClassInstruction", "<init>", "(Lserp/bytecode/Code;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/NewArrayInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/NewArrayInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/MonitorEnterInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/MonitorEnterInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/MonitorExitInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/MonitorExitInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/WideInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/WideInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label25);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/MultiANewArrayInstruction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/MultiANewArrayInstruction", "<init>", "(Lserp/bytecode/Code;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label26);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Illegal opcode: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "listIterator", "()Ljava/util/ListIterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/Code$CodeIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code$CodeIterator", "<init>", "(Lserp/bytecode/Code;Lserp/bytecode/CodeEntry;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lserp/bytecode/Code;)Lserp/bytecode/CodeEntry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_tail", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lserp/bytecode/Code;)Lserp/bytecode/CodeEntry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_head", "Lserp/bytecode/CodeEntry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lserp/bytecode/Code;Lserp/bytecode/Instruction;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/Code", "indexOf", "(Lserp/bytecode/Instruction;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lserp/bytecode/Code;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_size", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$408", "(Lserp/bytecode/Code;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_size", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_size", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$410", "(Lserp/bytecode/Code;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/Code", "_size", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/Code", "_size", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
