package asm.org.apache.commons.collections;
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

classWriter.visit(V1_3, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections/CursorableLinkedList$Cursor", null, "org/apache/commons/collections/CursorableLinkedList$ListIter", new String[] { "java/util/ListIterator" });

classWriter.visitInnerClass("org/apache/commons/collections/CursorableLinkedList$Cursor", "org/apache/commons/collections/CursorableLinkedList", "Cursor", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/commons/collections/CursorableLinkedList$Listable", "org/apache/commons/collections/CursorableLinkedList", "Listable", ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections/CursorableLinkedList$ListIter", "org/apache/commons/collections/CursorableLinkedList", "ListIter", 0);

{
fieldVisitor = classWriter.visitField(0, "_valid", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/collections/CursorableLinkedList;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections/CursorableLinkedList;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/CursorableLinkedList$ListIter", "<init>", "(Lorg/apache/commons/collections/CursorableLinkedList;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "this$0", "Lorg/apache/commons/collections/CursorableLinkedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_valid", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_valid", "Z");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList", "registerCursor", "(Lorg/apache/commons/collections/CursorableLinkedList$Cursor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previousIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Cursor", "checkForComod", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "this$0", "Lorg/apache/commons/collections/CursorableLinkedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "prev", "()Lorg/apache/commons/collections/CursorableLinkedList$Listable;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "next", "()Lorg/apache/commons/collections/CursorableLinkedList$Listable;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList", "insertListable", "(Lorg/apache/commons/collections/CursorableLinkedList$Listable;Lorg/apache/commons/collections/CursorableLinkedList$Listable;Ljava/lang/Object;)Lorg/apache/commons/collections/CursorableLinkedList$Listable;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "setPrev", "(Lorg/apache/commons/collections/CursorableLinkedList$Listable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "next", "()Lorg/apache/commons/collections/CursorableLinkedList$Listable;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "setNext", "(Lorg/apache/commons/collections/CursorableLinkedList$Listable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_lastReturned", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_nextIndex", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_nextIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_expectedModCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_expectedModCount", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "listableRemoved", "(Lorg/apache/commons/collections/CursorableLinkedList$Listable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "this$0", "Lorg/apache/commons/collections/CursorableLinkedList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList", "_head", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "prev", "()Lorg/apache/commons/collections/CursorableLinkedList$Listable;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "setNext", "(Lorg/apache/commons/collections/CursorableLinkedList$Listable;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "next", "()Lorg/apache/commons/collections/CursorableLinkedList$Listable;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "next", "()Lorg/apache/commons/collections/CursorableLinkedList$Listable;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "setNext", "(Lorg/apache/commons/collections/CursorableLinkedList$Listable;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "this$0", "Lorg/apache/commons/collections/CursorableLinkedList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList", "_head", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "next", "()Lorg/apache/commons/collections/CursorableLinkedList$Listable;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "setPrev", "(Lorg/apache/commons/collections/CursorableLinkedList$Listable;)V", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "prev", "()Lorg/apache/commons/collections/CursorableLinkedList$Listable;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "prev", "()Lorg/apache/commons/collections/CursorableLinkedList$Listable;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "setPrev", "(Lorg/apache/commons/collections/CursorableLinkedList$Listable;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_lastReturned", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_lastReturned", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "listableInserted", "(Lorg/apache/commons/collections/CursorableLinkedList$Listable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "next", "()Lorg/apache/commons/collections/CursorableLinkedList$Listable;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "prev", "()Lorg/apache/commons/collections/CursorableLinkedList$Listable;", false);
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "setNext", "(Lorg/apache/commons/collections/CursorableLinkedList$Listable;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "prev", "()Lorg/apache/commons/collections/CursorableLinkedList$Listable;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "prev", "()Lorg/apache/commons/collections/CursorableLinkedList$Listable;", false);
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "setNext", "(Lorg/apache/commons/collections/CursorableLinkedList$Listable;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "next", "()Lorg/apache/commons/collections/CursorableLinkedList$Listable;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "next", "()Lorg/apache/commons/collections/CursorableLinkedList$Listable;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_cur", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList$Listable", "setPrev", "(Lorg/apache/commons/collections/CursorableLinkedList$Listable;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_lastReturned", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_lastReturned", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "listableChanged", "(Lorg/apache/commons/collections/CursorableLinkedList$Listable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_lastReturned", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_lastReturned", "Lorg/apache/commons/collections/CursorableLinkedList$Listable;");
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "checkForComod", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_valid", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "invalidate", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_valid", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_valid", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "_valid", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/CursorableLinkedList$Cursor", "this$0", "Lorg/apache/commons/collections/CursorableLinkedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/CursorableLinkedList", "unregisterCursor", "(Lorg/apache/commons/collections/CursorableLinkedList$Cursor;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
