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
public class DoubleOrderedMap$4Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_SUPER, "org/apache/commons/collections/DoubleOrderedMap$4", null, "java/util/AbstractSet", null);

classWriter.visitInnerClass("org/apache/commons/collections/DoubleOrderedMap$4", null, null, 0);

classWriter.visitInnerClass("org/apache/commons/collections/DoubleOrderedMap$4$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/collections/DoubleOrderedMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections/DoubleOrderedMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/AbstractSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/DoubleOrderedMap$4", "this$0", "Lorg/apache/commons/collections/DoubleOrderedMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections/DoubleOrderedMap$4$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/DoubleOrderedMap$4$1", "<init>", "(Lorg/apache/commons/collections/DoubleOrderedMap$4;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$4", "this$0", "Lorg/apache/commons/collections/DoubleOrderedMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/DoubleOrderedMap", "size", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "contains", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$4", "this$0", "Lorg/apache/commons/collections/DoubleOrderedMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/DoubleOrderedMap", "containsKey", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$4", "this$0", "Lorg/apache/commons/collections/DoubleOrderedMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/DoubleOrderedMap", "access$500", "(Lorg/apache/commons/collections/DoubleOrderedMap;)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$4", "this$0", "Lorg/apache/commons/collections/DoubleOrderedMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/DoubleOrderedMap", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$4", "this$0", "Lorg/apache/commons/collections/DoubleOrderedMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/DoubleOrderedMap", "access$500", "(Lorg/apache/commons/collections/DoubleOrderedMap;)I", false);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$4", "this$0", "Lorg/apache/commons/collections/DoubleOrderedMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/DoubleOrderedMap", "clear", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1900", "(Lorg/apache/commons/collections/DoubleOrderedMap$4;)Lorg/apache/commons/collections/DoubleOrderedMap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/DoubleOrderedMap$4", "this$0", "Lorg/apache/commons/collections/DoubleOrderedMap;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
