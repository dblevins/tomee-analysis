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
public class AbstractLinkedMap$ValuesIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections4/map/AbstractLinkedMap$ValuesIterator", "<V:Ljava/lang/Object;>Lorg/apache/commons/collections4/map/AbstractLinkedMap$LinkIterator<Ljava/lang/Object;TV;>;Lorg/apache/commons/collections4/OrderedIterator<TV;>;Lorg/apache/commons/collections4/ResettableIterator<TV;>;", "org/apache/commons/collections4/map/AbstractLinkedMap$LinkIterator", new String[] { "org/apache/commons/collections4/OrderedIterator", "org/apache/commons/collections4/ResettableIterator" });

classWriter.visitInnerClass("org/apache/commons/collections4/map/AbstractLinkedMap$ValuesIterator", "org/apache/commons/collections4/map/AbstractLinkedMap", "ValuesIterator", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/map/AbstractLinkedMap$LinkIterator", "org/apache/commons/collections4/map/AbstractLinkedMap", "LinkIterator", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/commons/collections4/map/AbstractLinkedMap$LinkEntry", "org/apache/commons/collections4/map/AbstractLinkedMap", "LinkEntry", ACC_PROTECTED | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/commons/collections4/map/AbstractLinkedMap;)V", "(Lorg/apache/commons/collections4/map/AbstractLinkedMap<*TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/map/AbstractLinkedMap$LinkIterator", "<init>", "(Lorg/apache/commons/collections4/map/AbstractLinkedMap;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", "()TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/map/AbstractLinkedMap$LinkIterator", "nextEntry", "()Lorg/apache/commons/collections4/map/AbstractLinkedMap$LinkEntry;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/map/AbstractLinkedMap$LinkEntry", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previous", "()Ljava/lang/Object;", "()TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/map/AbstractLinkedMap$LinkIterator", "previousEntry", "()Lorg/apache/commons/collections4/map/AbstractLinkedMap$LinkEntry;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/map/AbstractLinkedMap$LinkEntry", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
