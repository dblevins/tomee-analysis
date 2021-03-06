package asm.org.apache.commons.collections.iterators;
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
public class EmptyIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections/iterators/EmptyIterator", null, "org/apache/commons/collections/iterators/AbstractEmptyIterator", new String[] { "org/apache/commons/collections/ResettableIterator" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESETTABLE_INSTANCE", "Lorg/apache/commons/collections/ResettableIterator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSTANCE", "Ljava/util/Iterator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/iterators/AbstractEmptyIterator", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections/iterators/EmptyIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/iterators/EmptyIterator", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections/iterators/EmptyIterator", "RESETTABLE_INSTANCE", "Lorg/apache/commons/collections/ResettableIterator;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections/iterators/EmptyIterator", "RESETTABLE_INSTANCE", "Lorg/apache/commons/collections/ResettableIterator;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections/iterators/EmptyIterator", "INSTANCE", "Ljava/util/Iterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
