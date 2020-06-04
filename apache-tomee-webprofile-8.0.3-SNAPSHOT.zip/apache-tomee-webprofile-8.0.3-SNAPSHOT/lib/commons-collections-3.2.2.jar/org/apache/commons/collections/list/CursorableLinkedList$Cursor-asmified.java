package asm.org.apache.commons.collections.list;
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
public class CursorableLinkedList$CursorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", null, "org/apache/commons/collections/list/AbstractLinkedList$LinkedListIterator", null);

classWriter.visitInnerClass("org/apache/commons/collections/list/CursorableLinkedList$Cursor", "org/apache/commons/collections/list/CursorableLinkedList", "Cursor", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections/list/AbstractLinkedList$Node", "org/apache/commons/collections/list/AbstractLinkedList", "Node", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections/list/AbstractLinkedList$LinkedListIterator", "org/apache/commons/collections/list/AbstractLinkedList", "LinkedListIterator", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "valid", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "nextIndexValid", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "currentRemovedByAnother", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/commons/collections/list/CursorableLinkedList;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/list/AbstractLinkedList$LinkedListIterator", "<init>", "(Lorg/apache/commons/collections/list/AbstractLinkedList;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "valid", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "nextIndexValid", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "currentRemovedByAnother", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "valid", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "current", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "currentRemovedByAnother", "Z");
methodVisitor.visitJumpInsn(IFEQ, label0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "checkModCount", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "parent", "Lorg/apache/commons/collections/list/AbstractLinkedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "getLastNodeReturned", "()Lorg/apache/commons/collections/list/AbstractLinkedList$Node;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/list/AbstractLinkedList", "removeNode", "(Lorg/apache/commons/collections/list/AbstractLinkedList$Node;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "currentRemovedByAnother", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/list/AbstractLinkedList$LinkedListIterator", "add", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "next", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList$Node", "next", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "next", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "nextIndexValid", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "next", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "parent", "Lorg/apache/commons/collections/list/AbstractLinkedList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList", "header", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "parent", "Lorg/apache/commons/collections/list/AbstractLinkedList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/list/AbstractLinkedList", "size", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "nextIndex", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "parent", "Lorg/apache/commons/collections/list/AbstractLinkedList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList", "header", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList$Node", "next", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ASTORE, 2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "next", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label4);
methodVisitor.visitIincInsn(1, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList$Node", "next", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "nextIndex", "I");
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "nextIndexValid", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "nextIndex", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "nodeChanged", "(Lorg/apache/commons/collections/list/AbstractLinkedList$Node;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "nodeRemoved", "(Lorg/apache/commons/collections/list/AbstractLinkedList$Node;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "next", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "current", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList$Node", "next", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "next", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "current", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "currentRemovedByAnother", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "next", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList$Node", "next", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "next", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "currentRemovedByAnother", "Z");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "current", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "current", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "currentRemovedByAnother", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "nextIndex", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "nextIndex", "I");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "nextIndexValid", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "currentRemovedByAnother", "Z");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "nodeInserted", "(Lorg/apache/commons/collections/list/AbstractLinkedList$Node;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList$Node", "previous", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "current", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "next", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "next", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList$Node", "previous", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "next", "Lorg/apache/commons/collections/list/AbstractLinkedList$Node;");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "nextIndexValid", "Z");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "checkModCount", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "valid", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Cursor closed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "valid", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "parent", "Lorg/apache/commons/collections/list/AbstractLinkedList;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections/list/CursorableLinkedList");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/list/CursorableLinkedList", "unregisterCursor", "(Lorg/apache/commons/collections/list/CursorableLinkedList$Cursor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "valid", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
