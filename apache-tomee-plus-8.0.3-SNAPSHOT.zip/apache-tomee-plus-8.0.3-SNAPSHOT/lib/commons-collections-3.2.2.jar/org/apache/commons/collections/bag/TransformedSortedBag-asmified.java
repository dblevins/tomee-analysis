package asm.org.apache.commons.collections.bag;
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
public class TransformedSortedBagDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections/bag/TransformedSortedBag", null, "org/apache/commons/collections/bag/TransformedBag", new String[] { "org/apache/commons/collections/SortedBag" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-251737742649401930L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "decorate", "(Lorg/apache/commons/collections/SortedBag;Lorg/apache/commons/collections/Transformer;)Lorg/apache/commons/collections/SortedBag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections/bag/TransformedSortedBag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/bag/TransformedSortedBag", "<init>", "(Lorg/apache/commons/collections/SortedBag;Lorg/apache/commons/collections/Transformer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/commons/collections/SortedBag;Lorg/apache/commons/collections/Transformer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/bag/TransformedBag", "<init>", "(Lorg/apache/commons/collections/Bag;Lorg/apache/commons/collections/Transformer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getSortedBag", "()Lorg/apache/commons/collections/SortedBag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/TransformedSortedBag", "collection", "Ljava/util/Collection;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections/SortedBag");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "first", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bag/TransformedSortedBag", "getSortedBag", "()Lorg/apache/commons/collections/SortedBag;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections/SortedBag", "first", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "last", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bag/TransformedSortedBag", "getSortedBag", "()Lorg/apache/commons/collections/SortedBag;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections/SortedBag", "last", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "comparator", "()Ljava/util/Comparator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bag/TransformedSortedBag", "getSortedBag", "()Lorg/apache/commons/collections/SortedBag;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections/SortedBag", "comparator", "()Ljava/util/Comparator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
