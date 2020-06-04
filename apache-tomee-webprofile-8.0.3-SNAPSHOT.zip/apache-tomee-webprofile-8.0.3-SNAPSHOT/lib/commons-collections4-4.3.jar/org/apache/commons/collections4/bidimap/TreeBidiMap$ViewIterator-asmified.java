package asm.org.apache.commons.collections4.bidimap;
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

classWriter.visit(V1_8, ACC_SUPER | ACC_ABSTRACT, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "org/apache/commons/collections4/bidimap/TreeBidiMap", "DataElement", ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/commons/collections4/bidimap/TreeBidiMap$Node", "org/apache/commons/collections4/bidimap/TreeBidiMap", "Node", ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "org/apache/commons/collections4/bidimap/TreeBidiMap", "ViewIterator", ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "orderType", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "lastReturnedNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node<TK;TV;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "nextNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node<TK;TV;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "previousNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node<TK;TV;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "expectedModifications", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "orderType", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2100", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "expectedModifications", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2200", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;)[Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "ordinal", "()I", false);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2300", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "navigateNext", "()Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", "()Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2100", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "expectedModifications", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "orderType", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2400", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasPrevious", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "navigatePrevious", "()Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", "()Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2100", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "expectedModifications", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "orderType", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2400", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "orderType", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2500", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2100", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "expectedModifications", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2000", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "expectedModifications", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "expectedModifications", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "lastReturnedNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2200", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;)[Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "orderType", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "ordinal", "()I", false);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "orderType", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2600", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "nextNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "orderType", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2500", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "previousNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
