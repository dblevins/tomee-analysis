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
public class DoubleOrderedMap$2$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_SUPER, "org/apache/commons/collections/DoubleOrderedMap$2$1", null, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", null);

classWriter.visitInnerClass("org/apache/commons/collections/DoubleOrderedMap$2", null, null, 0);

classWriter.visitInnerClass("org/apache/commons/collections/DoubleOrderedMap$2$1", null, null, 0);

classWriter.visitInnerClass("org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "org/apache/commons/collections/DoubleOrderedMap", "DoubleOrderedMapIterator", ACC_PRIVATE | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/commons/collections/DoubleOrderedMap$Node", "org/apache/commons/collections/DoubleOrderedMap", "Node", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/commons/collections/DoubleOrderedMap$2;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections/DoubleOrderedMap$2;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/DoubleOrderedMap$2", "access$400", "(Lorg/apache/commons/collections/DoubleOrderedMap$2;)Lorg/apache/commons/collections/DoubleOrderedMap;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/DoubleOrderedMap$DoubleOrderedMapIterator", "<init>", "(Lorg/apache/commons/collections/DoubleOrderedMap;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/DoubleOrderedMap$2$1", "this$1", "Lorg/apache/commons/collections/DoubleOrderedMap$2;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doGetNext", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$2$1", "lastReturnedNode", "Lorg/apache/commons/collections/DoubleOrderedMap$Node;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/DoubleOrderedMap$Node", "access$200", "(Lorg/apache/commons/collections/DoubleOrderedMap$Node;I)Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
