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
public class CursorableLinkedList$SubCursorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections/list/CursorableLinkedList$SubCursor", null, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", null);

classWriter.visitInnerClass("org/apache/commons/collections/list/AbstractLinkedList$LinkedSubList", "org/apache/commons/collections/list/AbstractLinkedList", "LinkedSubList", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections/list/CursorableLinkedList$SubCursor", "org/apache/commons/collections/list/CursorableLinkedList", "SubCursor", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections/list/CursorableLinkedList$Cursor", "org/apache/commons/collections/list/CursorableLinkedList", "Cursor", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "sub", "Lorg/apache/commons/collections/list/AbstractLinkedList$LinkedSubList;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/commons/collections/list/AbstractLinkedList$LinkedSubList;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList$LinkedSubList", "parent", "Lorg/apache/commons/collections/list/AbstractLinkedList;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections/list/CursorableLinkedList");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList$LinkedSubList", "offset", "I");
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "<init>", "(Lorg/apache/commons/collections/list/CursorableLinkedList;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/CursorableLinkedList$SubCursor", "sub", "Lorg/apache/commons/collections/list/AbstractLinkedList$LinkedSubList;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/list/CursorableLinkedList$SubCursor", "nextIndex", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$SubCursor", "sub", "Lorg/apache/commons/collections/list/AbstractLinkedList$LinkedSubList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList$LinkedSubList", "size", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasPrevious", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/list/CursorableLinkedList$SubCursor", "previousIndex", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLT, label0);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "nextIndex", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$SubCursor", "sub", "Lorg/apache/commons/collections/list/AbstractLinkedList$LinkedSubList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList$LinkedSubList", "offset", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "add", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$SubCursor", "sub", "Lorg/apache/commons/collections/list/AbstractLinkedList$LinkedSubList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$SubCursor", "parent", "Lorg/apache/commons/collections/list/AbstractLinkedList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList", "modCount", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/AbstractLinkedList$LinkedSubList", "expectedModCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$SubCursor", "sub", "Lorg/apache/commons/collections/list/AbstractLinkedList$LinkedSubList;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList$LinkedSubList", "size", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/AbstractLinkedList$LinkedSubList", "size", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/list/CursorableLinkedList$Cursor", "remove", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$SubCursor", "sub", "Lorg/apache/commons/collections/list/AbstractLinkedList$LinkedSubList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$SubCursor", "parent", "Lorg/apache/commons/collections/list/AbstractLinkedList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList", "modCount", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/AbstractLinkedList$LinkedSubList", "expectedModCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/CursorableLinkedList$SubCursor", "sub", "Lorg/apache/commons/collections/list/AbstractLinkedList$LinkedSubList;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/list/AbstractLinkedList$LinkedSubList", "size", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/list/AbstractLinkedList$LinkedSubList", "size", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
