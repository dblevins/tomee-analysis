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
public class FastArrayList$ListIterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_SUPER, "org/apache/commons/collections/FastArrayList$ListIter", null, "java/lang/Object", new String[] { "java/util/ListIterator" });

classWriter.visitInnerClass("org/apache/commons/collections/FastArrayList$ListIter", "org/apache/commons/collections/FastArrayList", "ListIter", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "expected", "Ljava/util/List;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "iter", "Ljava/util/ListIterator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lastReturnedIndex", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/collections/FastArrayList;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/collections/FastArrayList;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "this$0", "Lorg/apache/commons/collections/FastArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "lastReturnedIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList", "list", "Ljava/util/ArrayList;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "expected", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/FastArrayList$ListIter", "get", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "listIterator", "(I)Ljava/util/ListIterator;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "iter", "Ljava/util/ListIterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "checkMod", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "this$0", "Lorg/apache/commons/collections/FastArrayList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList", "list", "Ljava/util/ArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "expected", "Ljava/util/List;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
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
methodVisitor = classWriter.visitMethod(0, "get", "()Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "expected", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "iter", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "hasNext", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "iter", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "nextIndex", "()I", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "lastReturnedIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "iter", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasPrevious", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "iter", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "hasPrevious", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previous", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "iter", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "previousIndex", "()I", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "lastReturnedIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "iter", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "previous", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previousIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "iter", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "previousIndex", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "iter", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "nextIndex", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/FastArrayList$ListIter", "checkMod", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "lastReturnedIndex", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/FastArrayList$ListIter", "get", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "lastReturnedIndex", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "remove", "(I)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "this$0", "Lorg/apache/commons/collections/FastArrayList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList", "list", "Ljava/util/ArrayList;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "expected", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/FastArrayList$ListIter", "get", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "lastReturnedIndex", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "listIterator", "(I)Ljava/util/ListIterator;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "iter", "Ljava/util/ListIterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "lastReturnedIndex", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "set", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/FastArrayList$ListIter", "checkMod", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "lastReturnedIndex", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/FastArrayList$ListIter", "get", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "lastReturnedIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "this$0", "Lorg/apache/commons/collections/FastArrayList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList", "list", "Ljava/util/ArrayList;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "expected", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/FastArrayList$ListIter", "get", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/FastArrayList$ListIter", "previousIndex", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "listIterator", "(I)Ljava/util/ListIterator;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "iter", "Ljava/util/ListIterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/FastArrayList$ListIter", "checkMod", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/FastArrayList$ListIter", "nextIndex", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/FastArrayList$ListIter", "get", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(ILjava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "this$0", "Lorg/apache/commons/collections/FastArrayList;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastArrayList", "list", "Ljava/util/ArrayList;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "expected", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/FastArrayList$ListIter", "get", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "listIterator", "(I)Ljava/util/ListIterator;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "iter", "Ljava/util/ListIterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastArrayList$ListIter", "lastReturnedIndex", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
