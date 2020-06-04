package asm.org.apache.xbean.asm7.tree;
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
public class InsnList$InsnListIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_FINAL | ACC_SUPER, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", null, "java/lang/Object", new String[] { "java/util/ListIterator" });

classWriter.visitInnerClass("org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "org/apache/xbean/asm7/tree/InsnList", "InsnListIterator", ACC_PRIVATE | ACC_FINAL);

{
fieldVisitor = classWriter.visitField(0, "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "remove", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/xbean/asm7/tree/InsnList;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/xbean/asm7/tree/InsnList;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "this$0", "Lorg/apache/xbean/asm7/tree/InsnList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/InsnList", "size", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/InsnList", "getLast", "()Lorg/apache/xbean/asm7/tree/AbstractInsnNode;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/InsnList", "get", "(I)Lorg/apache/xbean/asm7/tree/AbstractInsnNode;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/AbstractInsnNode", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/AbstractInsnNode", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "remove", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "remove", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "remove", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/AbstractInsnNode", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/AbstractInsnNode", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "this$0", "Lorg/apache/xbean/asm7/tree/InsnList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "remove", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/InsnList", "remove", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "remove", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasPrevious", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previous", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/AbstractInsnNode", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "remove", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "this$0", "Lorg/apache/xbean/asm7/tree/InsnList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/InsnList", "size", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "this$0", "Lorg/apache/xbean/asm7/tree/InsnList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList", "cache", "[Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "this$0", "Lorg/apache/xbean/asm7/tree/InsnList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "this$0", "Lorg/apache/xbean/asm7/tree/InsnList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/InsnList", "toArray", "()[Lorg/apache/xbean/asm7/tree/AbstractInsnNode;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList", "cache", "[Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/AbstractInsnNode", "index", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previousIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "this$0", "Lorg/apache/xbean/asm7/tree/InsnList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList", "cache", "[Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "this$0", "Lorg/apache/xbean/asm7/tree/InsnList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "this$0", "Lorg/apache/xbean/asm7/tree/InsnList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/InsnList", "toArray", "()[Lorg/apache/xbean/asm7/tree/AbstractInsnNode;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList", "cache", "[Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/AbstractInsnNode", "index", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "this$0", "Lorg/apache/xbean/asm7/tree/InsnList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/AbstractInsnNode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/InsnList", "insertBefore", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/AbstractInsnNode;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "this$0", "Lorg/apache/xbean/asm7/tree/InsnList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/AbstractInsnNode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/InsnList", "insert", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/AbstractInsnNode;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "this$0", "Lorg/apache/xbean/asm7/tree/InsnList;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/AbstractInsnNode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/InsnList", "add", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/AbstractInsnNode");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "remove", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "set", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "remove", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "this$0", "Lorg/apache/xbean/asm7/tree/InsnList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "remove", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/AbstractInsnNode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/InsnList", "set", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/AbstractInsnNode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "remove", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/AbstractInsnNode");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "previousInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/AbstractInsnNode");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/InsnList$InsnListIterator", "nextInsn", "Lorg/apache/xbean/asm7/tree/AbstractInsnNode;");
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
