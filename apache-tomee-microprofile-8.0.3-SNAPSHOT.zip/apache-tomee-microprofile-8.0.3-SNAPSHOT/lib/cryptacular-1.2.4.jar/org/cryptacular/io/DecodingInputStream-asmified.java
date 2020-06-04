package asm.org.cryptacular.io;
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
public class DecodingInputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/cryptacular/io/DecodingInputStream", null, "java/io/FilterInputStream", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "decoder", "Lorg/cryptacular/codec/Decoder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "reader", "Ljava/io/InputStreamReader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "input", "Ljava/nio/CharBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "output", "Ljava/nio/ByteBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/io/InputStream;Lorg/cryptacular/codec/Decoder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/FilterInputStream", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Decoder cannot be null.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/cryptacular/io/DecodingInputStream", "java/io/InputStream", "org/cryptacular/codec/Decoder"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/io/DecodingInputStream", "decoder", "Lorg/cryptacular/codec/Decoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/io/InputStreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/InputStreamReader", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/io/DecodingInputStream", "reader", "Ljava/io/InputStreamReader;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "()I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/io/DecodingInputStream", "read", "([B)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "([B)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/io/DecodingInputStream", "read", "([BII)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "([BII)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/io/DecodingInputStream", "prepareInputBuffer", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/io/DecodingInputStream", "prepareOutputBuffer", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "reader", "Ljava/io/InputStreamReader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "input", "Ljava/nio/CharBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStreamReader", "read", "(Ljava/nio/CharBuffer;)I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "decoder", "Lorg/cryptacular/codec/Decoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "output", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/codec/Decoder", "finalize", "(Ljava/nio/ByteBuffer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "output", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "input", "Ljava/nio/CharBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "flip", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "decoder", "Lorg/cryptacular/codec/Decoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "input", "Ljava/nio/CharBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "output", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/codec/Decoder", "decode", "(Ljava/nio/CharBuffer;Ljava/nio/ByteBuffer;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "output", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "flip", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "output", "Ljava/nio/ByteBuffer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "output", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "limit", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "get", "([BII)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "output", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "base64", "(Ljava/io/InputStream;)Lorg/cryptacular/io/DecodingInputStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/io/DecodingInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/Base64Decoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/Base64Decoder", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/io/DecodingInputStream", "<init>", "(Ljava/io/InputStream;Lorg/cryptacular/codec/Decoder;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hex", "(Ljava/io/InputStream;)Lorg/cryptacular/io/DecodingInputStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/io/DecodingInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/HexDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/HexDecoder", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/io/DecodingInputStream", "<init>", "(Ljava/io/InputStream;Lorg/cryptacular/codec/Decoder;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "prepareInputBuffer", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "input", "Ljava/nio/CharBuffer;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "input", "Ljava/nio/CharBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "capacity", "()I", false);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/CharBuffer", "allocate", "(I)Ljava/nio/CharBuffer;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/io/DecodingInputStream", "input", "Ljava/nio/CharBuffer;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "input", "Ljava/nio/CharBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "clear", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "prepareOutputBuffer", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "decoder", "Lorg/cryptacular/codec/Decoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "input", "Ljava/nio/CharBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "capacity", "()I", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/codec/Decoder", "outputSize", "(I)I", true);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "output", "Ljava/nio/ByteBuffer;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "output", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "capacity", "()I", false);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "allocate", "(I)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/io/DecodingInputStream", "output", "Ljava/nio/ByteBuffer;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/DecodingInputStream", "output", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "clear", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
