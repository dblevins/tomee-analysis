package asm.org.eclipse.persistence.internal.helper.linkedlist;
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
public class ExposedNodeLinkedListDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", null, "java/lang/Object", new String[] { "java/util/List" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "size", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "<init>", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("toArray");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toArray", "()[Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("toArray");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "set", "(ILjava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("set");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "listIterator", "(I)Ljava/util/ListIterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("listIterator");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "listIterator", "()Ljava/util/ListIterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("listIterator");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("iterator");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "subList", "(II)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("subList");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "retainAll", "(Ljava/util/Collection;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("retainAll");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeAll", "(Ljava/util/Collection;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("removeAll");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "containsAll", "(Ljava/util/Collection;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("containsAll");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addAll", "(Ljava/util/Collection;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("addAll");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addAll", "(ILjava/util/Collection;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("addAll");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("remove");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "addLast", "(Ljava/lang/Object;)Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lastIndexOf", "(Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("lastIndexOf");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(ILjava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("add");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(I)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("remove");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(I)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("get");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "operationNotSupported", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEmpty", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "size", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFirst", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "size", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "contents", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLast", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "size", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "contents", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeFirst", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "size", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "contents", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "remove", "(Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeLast", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "size", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "contents", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "remove", "(Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addFirst", "(Ljava/lang/Object;)Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "addAfter", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;)Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addLast", "(Ljava/lang/Object;)Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "addAfter", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;)Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "contains", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "indexOf", "(Ljava/lang/Object;)I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "size", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "size", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "indexOf", "(Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ASTORE, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "contents", "Ljava/lang/Object;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ASTORE, 3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/helper/linkedlist/LinkedNode"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "contents", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label6);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "addAfter", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;)Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "<init>", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "size", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "contents", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "size", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "size", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "moveFirst", "(Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "size", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "size", "I");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "header", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "next", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "previous", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
