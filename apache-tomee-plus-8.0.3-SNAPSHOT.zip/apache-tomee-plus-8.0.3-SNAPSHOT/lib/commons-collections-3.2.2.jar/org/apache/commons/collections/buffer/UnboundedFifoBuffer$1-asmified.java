package asm.org.apache.commons.collections.buffer;
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
public class UnboundedFifoBuffer$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_SUPER, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", null, "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "index", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lastReturnedIndex", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "head", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "lastReturnedIndex", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "tail", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "hasNext", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "index", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "lastReturnedIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "index", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "access$000", "(Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;I)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "buffer", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "lastReturnedIndex", "I");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "lastReturnedIndex", "I");
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "lastReturnedIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "head", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "remove", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "lastReturnedIndex", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "lastReturnedIndex", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "access$000", "(Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;I)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "tail", "I");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "buffer", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "access$100", "(Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;I)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "buffer", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "access$000", "(Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;I)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "lastReturnedIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "tail", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "access$100", "(Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;I)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "tail", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "buffer", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "tail", "I");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "this$0", "Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "index", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/buffer/UnboundedFifoBuffer", "access$100", "(Lorg/apache/commons/collections/buffer/UnboundedFifoBuffer;I)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/buffer/UnboundedFifoBuffer$1", "index", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
