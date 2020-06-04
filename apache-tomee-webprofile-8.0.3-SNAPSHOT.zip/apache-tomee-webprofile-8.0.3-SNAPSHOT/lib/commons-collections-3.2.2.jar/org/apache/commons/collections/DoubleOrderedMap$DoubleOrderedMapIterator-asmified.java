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
public class DoubleOrderedMap$DoubleOrderedMapIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_SUPER | ACC_ABSTRACT, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", null, "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("org/apache/commons/collections/DoubleOrderedMap$Node", "org/apache/commons/collections/DoubleOrderedMap", "Node", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "org/apache/commons/collections/DoubleOrderedMap", "DoubleOrderedMapIterator", ACC_PRIVATE | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "expectedModifications", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "lastReturnedNode", "Lorg/apache/commons/collections/DoubleOrderedMap$Node;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "nextNode", "Lorg/apache/commons/collections/DoubleOrderedMap$Node;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "iteratorType", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/collections/DoubleOrderedMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections/DoubleOrderedMap;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "this$0", "Lorg/apache/commons/collections/DoubleOrderedMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "iteratorType", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/DoubleOrderedMap", "access$2200", "(Lorg/apache/commons/collections/DoubleOrderedMap;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "expectedModifications", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "lastReturnedNode", "Lorg/apache/commons/collections/DoubleOrderedMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/DoubleOrderedMap", "access$2300", "(Lorg/apache/commons/collections/DoubleOrderedMap;)[Lorg/apache/commons/collections/DoubleOrderedMap$Node;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "iteratorType", "I");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "iteratorType", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/DoubleOrderedMap", "access$2400", "(Lorg/apache/commons/collections/DoubleOrderedMap$Node;I)Lorg/apache/commons/collections/DoubleOrderedMap$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "nextNode", "Lorg/apache/commons/collections/DoubleOrderedMap$Node;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "doGetNext", "()Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "nextNode", "Lorg/apache/commons/collections/DoubleOrderedMap$Node;");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "next", "()Ljava/lang/Object;", null, new String[] { "java/util/NoSuchElementException", "java/util/ConcurrentModificationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "nextNode", "Lorg/apache/commons/collections/DoubleOrderedMap$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "this$0", "Lorg/apache/commons/collections/DoubleOrderedMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/DoubleOrderedMap", "access$2200", "(Lorg/apache/commons/collections/DoubleOrderedMap;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "expectedModifications", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "nextNode", "Lorg/apache/commons/collections/DoubleOrderedMap$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "lastReturnedNode", "Lorg/apache/commons/collections/DoubleOrderedMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "this$0", "Lorg/apache/commons/collections/DoubleOrderedMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "nextNode", "Lorg/apache/commons/collections/DoubleOrderedMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "iteratorType", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/DoubleOrderedMap", "access$2500", "(Lorg/apache/commons/collections/DoubleOrderedMap;Lorg/apache/commons/collections/DoubleOrderedMap$Node;I)Lorg/apache/commons/collections/DoubleOrderedMap$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "nextNode", "Lorg/apache/commons/collections/DoubleOrderedMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "doGetNext", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "remove", "()V", null, new String[] { "java/lang/IllegalStateException", "java/util/ConcurrentModificationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "lastReturnedNode", "Lorg/apache/commons/collections/DoubleOrderedMap$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "this$0", "Lorg/apache/commons/collections/DoubleOrderedMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/DoubleOrderedMap", "access$2200", "(Lorg/apache/commons/collections/DoubleOrderedMap;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "expectedModifications", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "this$0", "Lorg/apache/commons/collections/DoubleOrderedMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "lastReturnedNode", "Lorg/apache/commons/collections/DoubleOrderedMap$Node;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/DoubleOrderedMap", "access$300", "(Lorg/apache/commons/collections/DoubleOrderedMap;Lorg/apache/commons/collections/DoubleOrderedMap$Node;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "expectedModifications", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "expectedModifications", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "lastReturnedNode", "Lorg/apache/commons/collections/DoubleOrderedMap$Node;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
