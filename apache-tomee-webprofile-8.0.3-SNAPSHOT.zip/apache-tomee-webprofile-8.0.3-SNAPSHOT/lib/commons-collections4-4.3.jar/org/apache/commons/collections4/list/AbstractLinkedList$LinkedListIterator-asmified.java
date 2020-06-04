package asm.org.apache.commons.collections4.list;
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
public class AbstractLinkedList$LinkedListIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "<E:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/ListIterator<TE;>;Lorg/apache/commons/collections4/OrderedIterator<TE;>;", "java/lang/Object", new String[] { "java/util/ListIterator", "org/apache/commons/collections4/OrderedIterator" });

classWriter.visitInnerClass("org/apache/commons/collections4/list/AbstractLinkedList$Node", "org/apache/commons/collections4/list/AbstractLinkedList", "Node", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "org/apache/commons/collections4/list/AbstractLinkedList", "LinkedListIterator", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "parent", "Lorg/apache/commons/collections4/list/AbstractLinkedList;", "Lorg/apache/commons/collections4/list/AbstractLinkedList<TE;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node<TE;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "nextIndex", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "current", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node<TE;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "expectedModCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/commons/collections4/list/AbstractLinkedList;I)V", "(Lorg/apache/commons/collections4/list/AbstractLinkedList<TE;>;I)V", new String[] { "java/lang/IndexOutOfBoundsException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "parent", "Lorg/apache/commons/collections4/list/AbstractLinkedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList", "modCount", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "expectedModCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList", "getNode", "(IZ)Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "nextIndex", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "checkModCount", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "parent", "Lorg/apache/commons/collections4/list/AbstractLinkedList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList", "modCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "expectedModCount", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getLastNodeReturned", "()Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;", "()Lorg/apache/commons/collections4/list/AbstractLinkedList$Node<TE;>;", new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "current", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "current", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "parent", "Lorg/apache/commons/collections4/list/AbstractLinkedList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList", "header", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", "()TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "checkModCount", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "hasNext", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("No element at index ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "nextIndex", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(".");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList$Node", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "current", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$Node", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "nextIndex", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "nextIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasPrevious", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$Node", "previous", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "parent", "Lorg/apache/commons/collections4/list/AbstractLinkedList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList", "header", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previous", "()Ljava/lang/Object;", "()TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "checkModCount", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "hasPrevious", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Already at start of list.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$Node", "previous", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList$Node", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "current", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "nextIndex", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "nextIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "nextIndex", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previousIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "nextIndex", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "checkModCount", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "current", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$Node", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "parent", "Lorg/apache/commons/collections4/list/AbstractLinkedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "getLastNodeReturned", "()Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList", "removeNode", "(Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "parent", "Lorg/apache/commons/collections4/list/AbstractLinkedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "getLastNodeReturned", "()Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList", "removeNode", "(Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "nextIndex", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "nextIndex", "I");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "current", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "expectedModCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "expectedModCount", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "set", "(Ljava/lang/Object;)V", "(TE;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "checkModCount", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "getLastNodeReturned", "()Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList$Node", "setValue", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/Object;)V", "(TE;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "checkModCount", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "parent", "Lorg/apache/commons/collections4/list/AbstractLinkedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "next", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/list/AbstractLinkedList", "addNodeBefore", "(Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "current", "Lorg/apache/commons/collections4/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "nextIndex", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "nextIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "expectedModCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/list/AbstractLinkedList$LinkedListIterator", "expectedModCount", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
