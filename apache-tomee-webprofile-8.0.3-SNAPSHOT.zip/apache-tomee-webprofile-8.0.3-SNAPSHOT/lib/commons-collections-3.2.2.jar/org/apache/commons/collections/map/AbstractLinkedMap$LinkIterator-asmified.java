package asm.org.apache.commons.collections.map;
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
public class AbstractLinkedMap$LinkIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", null, "java/lang/Object", new String[] { "org/apache/commons/collections/OrderedIterator", "org/apache/commons/collections/ResettableIterator" });

classWriter.visitInnerClass("org/apache/commons/collections/map/AbstractLinkedMap$LinkEntry", "org/apache/commons/collections/map/AbstractLinkedMap", "LinkEntry", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "org/apache/commons/collections/map/AbstractLinkedMap", "LinkIterator", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "parent", "Lorg/apache/commons/collections/map/AbstractLinkedMap;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "last", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "next", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "expectedModCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/commons/collections/map/AbstractLinkedMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "parent", "Lorg/apache/commons/collections/map/AbstractLinkedMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap", "header", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkEntry", "after", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "next", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap", "modCount", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "expectedModCount", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "next", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "parent", "Lorg/apache/commons/collections/map/AbstractLinkedMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap", "header", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "next", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkEntry", "before", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "parent", "Lorg/apache/commons/collections/map/AbstractLinkedMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap", "header", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
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
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "nextEntry", "()Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "parent", "Lorg/apache/commons/collections/map/AbstractLinkedMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap", "modCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "expectedModCount", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "next", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "parent", "Lorg/apache/commons/collections/map/AbstractLinkedMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap", "header", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No next() entry in the iteration");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "next", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "last", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "next", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkEntry", "after", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "next", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "last", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "previousEntry", "()Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "parent", "Lorg/apache/commons/collections/map/AbstractLinkedMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap", "modCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "expectedModCount", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "next", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkEntry", "before", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "parent", "Lorg/apache/commons/collections/map/AbstractLinkedMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap", "header", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No previous() entry in the iteration");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "next", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "last", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "last", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "currentEntry", "()Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "last", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "last", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("remove() can only be called once after next()");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "parent", "Lorg/apache/commons/collections/map/AbstractLinkedMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap", "modCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "expectedModCount", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "parent", "Lorg/apache/commons/collections/map/AbstractLinkedMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "last", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/AbstractLinkedMap$LinkEntry", "getKey", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/AbstractLinkedMap", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "last", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "parent", "Lorg/apache/commons/collections/map/AbstractLinkedMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap", "modCount", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "expectedModCount", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "last", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "parent", "Lorg/apache/commons/collections/map/AbstractLinkedMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap", "header", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkEntry", "after", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "next", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "last", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Iterator[");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "last", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/AbstractLinkedMap$LinkEntry", "getKey", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitLdcInsn("=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractLinkedMap$LinkIterator", "last", "Lorg/apache/commons/collections/map/AbstractLinkedMap$LinkEntry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/AbstractLinkedMap$LinkEntry", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitLdcInsn("]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("Iterator[]");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
