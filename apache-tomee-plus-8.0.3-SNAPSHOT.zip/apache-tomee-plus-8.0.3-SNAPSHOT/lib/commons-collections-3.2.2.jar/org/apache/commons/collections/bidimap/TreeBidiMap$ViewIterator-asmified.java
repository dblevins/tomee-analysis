package asm.org.apache.commons.collections.bidimap;
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
public class TreeBidiMap$ViewIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_SUPER, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", null, "java/lang/Object", new String[] { "org/apache/commons/collections/OrderedIterator" });

classWriter.visitInnerClass("org/apache/commons/collections/bidimap/TreeBidiMap$Node", "org/apache/commons/collections/bidimap/TreeBidiMap", "Node", ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "org/apache/commons/collections/bidimap/TreeBidiMap", "ViewIterator", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "main", "Lorg/apache/commons/collections/bidimap/TreeBidiMap;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "orderType", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "dataType", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "lastReturnedNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "nextNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "previousNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "expectedModifications", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections/bidimap/TreeBidiMap;II)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "main", "Lorg/apache/commons/collections/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "orderType", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "dataType", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bidimap/TreeBidiMap", "access$1600", "(Lorg/apache/commons/collections/bidimap/TreeBidiMap;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "expectedModifications", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bidimap/TreeBidiMap", "access$1700", "(Lorg/apache/commons/collections/bidimap/TreeBidiMap;)[Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bidimap/TreeBidiMap", "access$1800", "(Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;I)Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "main", "Lorg/apache/commons/collections/bidimap/TreeBidiMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bidimap/TreeBidiMap", "access$1600", "(Lorg/apache/commons/collections/bidimap/TreeBidiMap;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "expectedModifications", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "main", "Lorg/apache/commons/collections/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "orderType", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bidimap/TreeBidiMap", "access$1900", "(Lorg/apache/commons/collections/bidimap/TreeBidiMap;Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;I)Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "doGetData", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasPrevious", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "main", "Lorg/apache/commons/collections/bidimap/TreeBidiMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bidimap/TreeBidiMap", "access$1600", "(Lorg/apache/commons/collections/bidimap/TreeBidiMap;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "expectedModifications", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "main", "Lorg/apache/commons/collections/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "orderType", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bidimap/TreeBidiMap", "access$1900", "(Lorg/apache/commons/collections/bidimap/TreeBidiMap;Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;I)Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "main", "Lorg/apache/commons/collections/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "orderType", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bidimap/TreeBidiMap", "access$2000", "(Lorg/apache/commons/collections/bidimap/TreeBidiMap;Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;I)Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "doGetData", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doGetData", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "dataType", "I");
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTableSwitchInsn(0, 3, label4, new Label[] { label0, label1, label2, label3 });
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bidimap/TreeBidiMap$Node", "getKey", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bidimap/TreeBidiMap$Node", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections/keyvalue/UnmodifiableMapEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bidimap/TreeBidiMap$Node", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bidimap/TreeBidiMap$Node", "getKey", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/keyvalue/UnmodifiableMapEntry", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "main", "Lorg/apache/commons/collections/bidimap/TreeBidiMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bidimap/TreeBidiMap", "access$1600", "(Lorg/apache/commons/collections/bidimap/TreeBidiMap;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "expectedModifications", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "main", "Lorg/apache/commons/collections/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bidimap/TreeBidiMap", "access$2100", "(Lorg/apache/commons/collections/bidimap/TreeBidiMap;Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "expectedModifications", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "expectedModifications", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "main", "Lorg/apache/commons/collections/bidimap/TreeBidiMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bidimap/TreeBidiMap", "access$1700", "(Lorg/apache/commons/collections/bidimap/TreeBidiMap;)[Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "orderType", "I");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "orderType", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bidimap/TreeBidiMap", "access$2200", "(Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;I)Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "main", "Lorg/apache/commons/collections/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "orderType", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bidimap/TreeBidiMap", "access$2000", "(Lorg/apache/commons/collections/bidimap/TreeBidiMap;Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;I)Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections/bidimap/TreeBidiMap$Node;");
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
