package asm.org.apache.commons.collections4;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections4/BagUtils", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EMPTY_BAG", "Lorg/apache/commons/collections4/Bag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EMPTY_SORTED_BAG", "Lorg/apache/commons/collections4/Bag;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "synchronizedBag", "(Lorg/apache/commons/collections4/Bag;)Lorg/apache/commons/collections4/Bag;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Bag<TE;>;)Lorg/apache/commons/collections4/Bag<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bag/SynchronizedBag", "synchronizedBag", "(Lorg/apache/commons/collections4/Bag;)Lorg/apache/commons/collections4/bag/SynchronizedBag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unmodifiableBag", "(Lorg/apache/commons/collections4/Bag;)Lorg/apache/commons/collections4/Bag;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Bag<+TE;>;)Lorg/apache/commons/collections4/Bag<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bag/UnmodifiableBag", "unmodifiableBag", "(Lorg/apache/commons/collections4/Bag;)Lorg/apache/commons/collections4/Bag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "predicatedBag", "(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Bag;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Bag<TE;>;Lorg/apache/commons/collections4/Predicate<-TE;>;)Lorg/apache/commons/collections4/Bag<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bag/PredicatedBag", "predicatedBag", "(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/bag/PredicatedBag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "transformingBag", "(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Bag;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Bag<TE;>;Lorg/apache/commons/collections4/Transformer<-TE;+TE;>;)Lorg/apache/commons/collections4/Bag<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bag/TransformedBag", "transformingBag", "(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Bag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "collectionBag", "(Lorg/apache/commons/collections4/Bag;)Lorg/apache/commons/collections4/Bag;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Bag<TE;>;)Lorg/apache/commons/collections4/Bag<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bag/CollectionBag", "collectionBag", "(Lorg/apache/commons/collections4/Bag;)Lorg/apache/commons/collections4/Bag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "synchronizedSortedBag", "(Lorg/apache/commons/collections4/SortedBag;)Lorg/apache/commons/collections4/SortedBag;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/SortedBag<TE;>;)Lorg/apache/commons/collections4/SortedBag<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bag/SynchronizedSortedBag", "synchronizedSortedBag", "(Lorg/apache/commons/collections4/SortedBag;)Lorg/apache/commons/collections4/bag/SynchronizedSortedBag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unmodifiableSortedBag", "(Lorg/apache/commons/collections4/SortedBag;)Lorg/apache/commons/collections4/SortedBag;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/SortedBag<TE;>;)Lorg/apache/commons/collections4/SortedBag<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bag/UnmodifiableSortedBag", "unmodifiableSortedBag", "(Lorg/apache/commons/collections4/SortedBag;)Lorg/apache/commons/collections4/SortedBag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "predicatedSortedBag", "(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/SortedBag;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/SortedBag<TE;>;Lorg/apache/commons/collections4/Predicate<-TE;>;)Lorg/apache/commons/collections4/SortedBag<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bag/PredicatedSortedBag", "predicatedSortedBag", "(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/bag/PredicatedSortedBag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "transformingSortedBag", "(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/SortedBag;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/SortedBag<TE;>;Lorg/apache/commons/collections4/Transformer<-TE;+TE;>;)Lorg/apache/commons/collections4/SortedBag<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bag/TransformedSortedBag", "transformingSortedBag", "(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/bag/TransformedSortedBag;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "emptyBag", "()Lorg/apache/commons/collections4/Bag;", "<E:Ljava/lang/Object;>()Lorg/apache/commons/collections4/Bag<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/BagUtils", "EMPTY_BAG", "Lorg/apache/commons/collections4/Bag;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "emptySortedBag", "()Lorg/apache/commons/collections4/SortedBag;", "<E:Ljava/lang/Object;>()Lorg/apache/commons/collections4/SortedBag<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/BagUtils", "EMPTY_SORTED_BAG", "Lorg/apache/commons/collections4/Bag;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections4/SortedBag");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/bag/HashBag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/bag/HashBag", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bag/UnmodifiableBag", "unmodifiableBag", "(Lorg/apache/commons/collections4/Bag;)Lorg/apache/commons/collections4/Bag;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections4/BagUtils", "EMPTY_BAG", "Lorg/apache/commons/collections4/Bag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/bag/TreeBag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/bag/TreeBag", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bag/UnmodifiableSortedBag", "unmodifiableSortedBag", "(Lorg/apache/commons/collections4/SortedBag;)Lorg/apache/commons/collections4/SortedBag;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections4/BagUtils", "EMPTY_SORTED_BAG", "Lorg/apache/commons/collections4/Bag;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
