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
public class EncodingOutputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/cryptacular/io/EncodingOutputStream", null, "java/io/FilterOutputStream", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "encoder", "Lorg/cryptacular/codec/Encoder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "writer", "Ljava/io/OutputStreamWriter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "output", "Ljava/nio/CharBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/io/OutputStream;Lorg/cryptacular/codec/Encoder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/FilterOutputStream", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Encoder cannot be null.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/cryptacular/io/EncodingOutputStream", "java/io/OutputStream", "org/cryptacular/codec/Encoder"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/io/EncodingOutputStream", "encoder", "Lorg/cryptacular/codec/Encoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/io/OutputStreamWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/OutputStreamWriter", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/io/EncodingOutputStream", "writer", "Ljava/io/OutputStreamWriter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/io/EncodingOutputStream", "write", "([B)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "([B)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/io/EncodingOutputStream", "write", "([BII)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "([BII)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "wrap", "([BII)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "encoder", "Lorg/cryptacular/codec/Encoder;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/codec/Encoder", "outputSize", "(I)I", true);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "output", "Ljava/nio/CharBuffer;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "output", "Ljava/nio/CharBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "capacity", "()I", false);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/nio/ByteBuffer", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/CharBuffer", "allocate", "(I)Ljava/nio/CharBuffer;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/io/EncodingOutputStream", "output", "Ljava/nio/CharBuffer;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "output", "Ljava/nio/CharBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "clear", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "encoder", "Lorg/cryptacular/codec/Encoder;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "output", "Ljava/nio/CharBuffer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/codec/Encoder", "encode", "(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "output", "Ljava/nio/CharBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "flip", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "writer", "Ljava/io/OutputStreamWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "output", "Ljava/nio/CharBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStreamWriter", "write", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "writer", "Ljava/io/OutputStreamWriter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStreamWriter", "flush", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "flush", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "writer", "Ljava/io/OutputStreamWriter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStreamWriter", "flush", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "output", "Ljava/nio/CharBuffer;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/CharBuffer", "allocate", "(I)Ljava/nio/CharBuffer;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/io/EncodingOutputStream", "output", "Ljava/nio/CharBuffer;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "output", "Ljava/nio/CharBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "clear", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "encoder", "Lorg/cryptacular/codec/Encoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "output", "Ljava/nio/CharBuffer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/codec/Encoder", "finalize", "(Ljava/nio/CharBuffer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "output", "Ljava/nio/CharBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "flip", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "writer", "Ljava/io/OutputStreamWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "output", "Ljava/nio/CharBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStreamWriter", "write", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "writer", "Ljava/io/OutputStreamWriter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStreamWriter", "flush", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/io/EncodingOutputStream", "writer", "Ljava/io/OutputStreamWriter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStreamWriter", "close", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "base64", "(Ljava/io/OutputStream;)Lorg/cryptacular/io/EncodingOutputStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/io/EncodingOutputStream", "base64", "(Ljava/io/OutputStream;I)Lorg/cryptacular/io/EncodingOutputStream;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "base64", "(Ljava/io/OutputStream;I)Lorg/cryptacular/io/EncodingOutputStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/io/EncodingOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/Base64Encoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/Base64Encoder", "<init>", "(I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/io/EncodingOutputStream", "<init>", "(Ljava/io/OutputStream;Lorg/cryptacular/codec/Encoder;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hex", "(Ljava/io/OutputStream;)Lorg/cryptacular/io/EncodingOutputStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/io/EncodingOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/HexEncoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/HexEncoder", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/io/EncodingOutputStream", "<init>", "(Ljava/io/OutputStream;Lorg/cryptacular/codec/Encoder;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
