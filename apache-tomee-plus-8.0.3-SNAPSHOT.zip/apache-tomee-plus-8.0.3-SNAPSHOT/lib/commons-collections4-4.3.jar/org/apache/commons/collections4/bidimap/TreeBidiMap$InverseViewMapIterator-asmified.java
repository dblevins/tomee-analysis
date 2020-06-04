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
public class TreeBidiMap$InverseViewMapIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap<TK;TV;>.ViewIterator;Lorg/apache/commons/collections4/OrderedMapIterator<TV;TK;>;", "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", new String[] { "org/apache/commons/collections4/OrderedMapIterator" });

classWriter.visitInnerClass("org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "org/apache/commons/collections4/bidimap/TreeBidiMap", "DataElement", ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator", "org/apache/commons/collections4/bidimap/TreeBidiMap", "InverseViewMapIterator", 0);

classWriter.visitInnerClass("org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "org/apache/commons/collections4/bidimap/TreeBidiMap", "ViewIterator", ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/commons/collections4/bidimap/TreeBidiMap$Node", "org/apache/commons/collections4/bidimap/TreeBidiMap", "Node", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$ViewIterator", "<init>", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKey", "()Ljava/lang/Comparable;", "()TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator", "lastReturnedNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Iterator getKey() can only be called after next() and before remove()");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator", "lastReturnedNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Node", "getValue", "()Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "()Ljava/lang/Comparable;", "()TK;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator", "lastReturnedNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Iterator getValue() can only be called after next() and before remove()");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator", "lastReturnedNode", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Node", "getKey", "()Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValue", "(Ljava/lang/Comparable;)Ljava/lang/Comparable;", "(TK;)TK;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Comparable;", "()TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator", "navigateNext", "()Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Node", "getValue", "()Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previous", "()Ljava/lang/Comparable;", "()TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator", "navigatePrevious", "()Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Node", "getValue", "()Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "previous", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator", "previous", "()Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Comparable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator", "setValue", "(Ljava/lang/Comparable;)Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getValue", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator", "getValue", "()Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getKey", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator", "getKey", "()Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator", "next", "()Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
