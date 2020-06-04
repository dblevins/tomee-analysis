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
public class BagUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections/BagUtils", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EMPTY_BAG", "Lorg/apache/commons/collections/Bag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EMPTY_SORTED_BAG", "Lorg/apache/commons/collections/Bag;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "synchronizedBag", "(Lorg/apache/commons/collections/Bag;)Lorg/apache/commons/collections/Bag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/SynchronizedBag", "decorate", "(Lorg/apache/commons/collections/Bag;)Lorg/apache/commons/collections/Bag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unmodifiableBag", "(Lorg/apache/commons/collections/Bag;)Lorg/apache/commons/collections/Bag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/UnmodifiableBag", "decorate", "(Lorg/apache/commons/collections/Bag;)Lorg/apache/commons/collections/Bag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "predicatedBag", "(Lorg/apache/commons/collections/Bag;Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Bag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/PredicatedBag", "decorate", "(Lorg/apache/commons/collections/Bag;Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Bag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "typedBag", "(Lorg/apache/commons/collections/Bag;Ljava/lang/Class;)Lorg/apache/commons/collections/Bag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/TypedBag", "decorate", "(Lorg/apache/commons/collections/Bag;Ljava/lang/Class;)Lorg/apache/commons/collections/Bag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "transformedBag", "(Lorg/apache/commons/collections/Bag;Lorg/apache/commons/collections/Transformer;)Lorg/apache/commons/collections/Bag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/TransformedBag", "decorate", "(Lorg/apache/commons/collections/Bag;Lorg/apache/commons/collections/Transformer;)Lorg/apache/commons/collections/Bag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "synchronizedSortedBag", "(Lorg/apache/commons/collections/SortedBag;)Lorg/apache/commons/collections/SortedBag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/SynchronizedSortedBag", "decorate", "(Lorg/apache/commons/collections/SortedBag;)Lorg/apache/commons/collections/SortedBag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unmodifiableSortedBag", "(Lorg/apache/commons/collections/SortedBag;)Lorg/apache/commons/collections/SortedBag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/UnmodifiableSortedBag", "decorate", "(Lorg/apache/commons/collections/SortedBag;)Lorg/apache/commons/collections/SortedBag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "predicatedSortedBag", "(Lorg/apache/commons/collections/SortedBag;Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/SortedBag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/PredicatedSortedBag", "decorate", "(Lorg/apache/commons/collections/SortedBag;Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/SortedBag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "typedSortedBag", "(Lorg/apache/commons/collections/SortedBag;Ljava/lang/Class;)Lorg/apache/commons/collections/SortedBag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/TypedSortedBag", "decorate", "(Lorg/apache/commons/collections/SortedBag;Ljava/lang/Class;)Lorg/apache/commons/collections/SortedBag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "transformedSortedBag", "(Lorg/apache/commons/collections/SortedBag;Lorg/apache/commons/collections/Transformer;)Lorg/apache/commons/collections/SortedBag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/TransformedSortedBag", "decorate", "(Lorg/apache/commons/collections/SortedBag;Lorg/apache/commons/collections/Transformer;)Lorg/apache/commons/collections/SortedBag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections/bag/HashBag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/bag/HashBag", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/UnmodifiableBag", "decorate", "(Lorg/apache/commons/collections/Bag;)Lorg/apache/commons/collections/Bag;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections/BagUtils", "EMPTY_BAG", "Lorg/apache/commons/collections/Bag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections/bag/TreeBag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/bag/TreeBag", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/UnmodifiableSortedBag", "decorate", "(Lorg/apache/commons/collections/SortedBag;)Lorg/apache/commons/collections/SortedBag;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections/BagUtils", "EMPTY_SORTED_BAG", "Lorg/apache/commons/collections/Bag;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
