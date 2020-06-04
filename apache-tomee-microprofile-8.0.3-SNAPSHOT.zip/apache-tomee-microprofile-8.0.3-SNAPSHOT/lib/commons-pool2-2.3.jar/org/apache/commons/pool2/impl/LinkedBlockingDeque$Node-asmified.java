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
public class LinkedBlockingDeque$NodeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_FINAL | ACC_SUPER, "org/apache/commons/pool2/impl/LinkedBlockingDeque$Node", "<E:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/commons/pool2/impl/LinkedBlockingDeque$Node", "org/apache/commons/pool2/impl/LinkedBlockingDeque", "Node", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "item", "Ljava/lang/Object;", "TE;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "prev", "Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node;", "Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node<TE;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "next", "Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node;", "Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node<TE;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/Object;Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node;Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node;)V", "(TE;Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node<TE;>;Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node<TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/LinkedBlockingDeque$Node", "item", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/LinkedBlockingDeque$Node", "prev", "Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/LinkedBlockingDeque$Node", "next", "Lorg/apache/commons/pool2/impl/LinkedBlockingDeque$Node;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
