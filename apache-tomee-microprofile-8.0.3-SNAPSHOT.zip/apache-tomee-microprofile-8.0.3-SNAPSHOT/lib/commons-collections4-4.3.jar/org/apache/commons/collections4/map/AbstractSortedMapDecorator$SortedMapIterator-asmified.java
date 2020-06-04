package asm.org.apache.commons.collections4.map;
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
public class AbstractSortedMapDecorator$SortedMapIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections4/map/AbstractSortedMapDecorator$SortedMapIterator", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lorg/apache/commons/collections4/map/EntrySetToMapIteratorAdapter<TK;TV;>;Lorg/apache/commons/collections4/OrderedMapIterator<TK;TV;>;", "org/apache/commons/collections4/map/EntrySetToMapIteratorAdapter", new String[] { "org/apache/commons/collections4/OrderedMapIterator" });

classWriter.visitInnerClass("org/apache/commons/collections4/map/AbstractSortedMapDecorator$SortedMapIterator", "org/apache/commons/collections4/map/AbstractSortedMapDecorator", "SortedMapIterator", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/util/Set;)V", "(Ljava/util/Set<Ljava/util/Map$Entry<TK;TV;>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/map/EntrySetToMapIteratorAdapter", "<init>", "(Ljava/util/Set;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/map/EntrySetToMapIteratorAdapter", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/iterators/ListIteratorWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/map/AbstractSortedMapDecorator$SortedMapIterator", "iterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/iterators/ListIteratorWrapper", "<init>", "(Ljava/util/Iterator;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/map/AbstractSortedMapDecorator$SortedMapIterator", "iterator", "Ljava/util/Iterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasPrevious", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/map/AbstractSortedMapDecorator$SortedMapIterator", "iterator", "Ljava/util/Iterator;");
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/ListIterator");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "hasPrevious", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previous", "()Ljava/lang/Object;", "()TK;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/map/AbstractSortedMapDecorator$SortedMapIterator", "iterator", "Ljava/util/Iterator;");
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/ListIterator");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "previous", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/map/AbstractSortedMapDecorator$SortedMapIterator", "entry", "Ljava/util/Map$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/map/AbstractSortedMapDecorator$SortedMapIterator", "getKey", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
