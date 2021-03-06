package asm.org.apache.commons.collections4.queue;
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
public class CircularFifoQueue$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "Ljava/lang/Object;Ljava/util/Iterator<TE;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitOuterClass("org/apache/commons/collections4/queue/CircularFifoQueue", "iterator", "()Ljava/util/Iterator;");

classWriter.visitInnerClass("org/apache/commons/collections4/queue/CircularFifoQueue$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "index", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lastReturnedIndex", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "isFirst", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$000", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "lastReturnedIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$100", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "isFirst", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "isFirst", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$200", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", "()TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "hasNext", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "isFirst", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "index", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "lastReturnedIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "index", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$300", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;I)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$400", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)[Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "lastReturnedIndex", "I");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "lastReturnedIndex", "I");
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "lastReturnedIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$000", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/queue/CircularFifoQueue", "remove", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "lastReturnedIndex", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "lastReturnedIndex", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$000", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "lastReturnedIndex", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$200", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)I", false);
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$400", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)[Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$400", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)[Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "lastReturnedIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$200", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)I", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$200", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)I", false);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label3);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$500", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)I", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$400", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)[Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$400", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)[Ljava/lang/Object;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$400", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)[Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$600", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;I)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$400", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)[Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$300", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;I)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "lastReturnedIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$200", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$600", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;I)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$202", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$400", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)[Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$200", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;)I", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$102", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "this$0", "Lorg/apache/commons/collections4/queue/CircularFifoQueue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "index", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/CircularFifoQueue", "access$600", "(Lorg/apache/commons/collections4/queue/CircularFifoQueue;I)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/queue/CircularFifoQueue$1", "index", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
