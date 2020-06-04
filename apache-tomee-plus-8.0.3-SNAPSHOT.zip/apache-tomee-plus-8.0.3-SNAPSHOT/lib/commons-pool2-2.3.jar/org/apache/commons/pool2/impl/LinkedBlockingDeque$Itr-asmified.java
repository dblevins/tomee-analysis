package asm.org.apache.commons.pool2.impl;
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
public class LinkedBlockingDeque$ItrDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/commons/pool2/impl/LinkedBlockingDeque$Itr", "Lorg/apache/commons/pool2/impl/LinkedBlockingDeque<TE;>.AbstractItr;", "org/apache/commons/pool2/impl/LinkedBlockingDeque$AbstractItr", null);

classWriter.visitInnerClass("org/apache/commons/pool2/impl/LinkedBlockingDeque$Itr", "org/apache/commons/pool2/impl/LinkedBlockingDeque", "Itr", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/pool2/impl/LinkedBlockingDeque$Node", "org/apache/commons/pool2/impl/LinkedBlockingDeque", "Node", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/pool2/impl/LinkedBlockingDeque$1", "org/apache/commons/pool2/impl/LinkedBlockingDeque", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/commons/pool2/impl/LinkedBlockingDeque$AbstractItr", "org/apache/commons/pool2/impl/LinkedBlockingDeque", "AbstractItr", ACC_PRIVATE | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/pool2/impl/LinkedBlockingDeque;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/commons/pool2/impl/LinkedBlockingDeque;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/LinkedBlockingDeque$Itr", "this$0", "Lorg/apache/commons/pool2/impl/LinkedBlockingDeque;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/impl/LinkedBlockingDeque$AbstractItr", "<init>", "(Lorg/apache/commons/pool2/impl/LinkedBlockingDeque;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "firstNode", "()Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node;", "()Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/LinkedBlockingDeque$Itr", "this$0", "Lorg/apache/commons/pool2/impl/LinkedBlockingDeque;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/pool2/impl/LinkedBlockingDeque", "access$400", "(Lorg/apache/commons/pool2/impl/LinkedBlockingDeque;)Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "nextNode", "(Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node;)Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node;", "(Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node<TE;>;)Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/LinkedBlockingDeque$Node", "next", "Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/commons/pool2/impl/LinkedBlockingDeque;Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/impl/LinkedBlockingDeque$Itr", "<init>", "(Lorg/apache/commons/pool2/impl/LinkedBlockingDeque;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
