package asm.com.sun.xml.fastinfoset;
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
public class Encoder$EncodingBufferOutputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", null, "java/io/OutputStream", null);

classWriter.visitInnerClass("com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "com/sun/xml/fastinfoset/Encoder", "EncodingBufferOutputStream", ACC_PRIVATE);

classWriter.visitInnerClass("com/sun/xml/fastinfoset/Encoder$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/xml/fastinfoset/Encoder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lcom/sun/xml/fastinfoset/Encoder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/OutputStream", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$100", "(Lcom/sun/xml/fastinfoset/Encoder;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$200", "(Lcom/sun/xml/fastinfoset/Encoder;)[B", false);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$200", "(Lcom/sun/xml/fastinfoset/Encoder;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$108", "(Lcom/sun/xml/fastinfoset/Encoder;)I", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$200", "(Lcom/sun/xml/fastinfoset/Encoder;)[B", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$100", "(Lcom/sun/xml/fastinfoset/Encoder;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "max", "(II)I", false);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$200", "(Lcom/sun/xml/fastinfoset/Encoder;)[B", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$100", "(Lcom/sun/xml/fastinfoset/Encoder;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$202", "(Lcom/sun/xml/fastinfoset/Encoder;[B)[B", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$200", "(Lcom/sun/xml/fastinfoset/Encoder;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$108", "(Lcom/sun/xml/fastinfoset/Encoder;)I", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "([BII)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPGT, label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPGT, label0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFGE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IndexOutOfBoundsException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IndexOutOfBoundsException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$100", "(Lcom/sun/xml/fastinfoset/Encoder;)I", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$200", "(Lcom/sun/xml/fastinfoset/Encoder;)[B", false);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$200", "(Lcom/sun/xml/fastinfoset/Encoder;)[B", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "max", "(II)I", false);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$200", "(Lcom/sun/xml/fastinfoset/Encoder;)[B", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$100", "(Lcom/sun/xml/fastinfoset/Encoder;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$202", "(Lcom/sun/xml/fastinfoset/Encoder;[B)[B", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$200", "(Lcom/sun/xml/fastinfoset/Encoder;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$100", "(Lcom/sun/xml/fastinfoset/Encoder;)I", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$102", "(Lcom/sun/xml/fastinfoset/Encoder;I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLength", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$100", "(Lcom/sun/xml/fastinfoset/Encoder;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "this$0", "Lcom/sun/xml/fastinfoset/Encoder;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/Encoder", "access$102", "(Lcom/sun/xml/fastinfoset/Encoder;I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lcom/sun/xml/fastinfoset/Encoder;Lcom/sun/xml/fastinfoset/Encoder$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/Encoder$EncodingBufferOutputStream", "<init>", "(Lcom/sun/xml/fastinfoset/Encoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
