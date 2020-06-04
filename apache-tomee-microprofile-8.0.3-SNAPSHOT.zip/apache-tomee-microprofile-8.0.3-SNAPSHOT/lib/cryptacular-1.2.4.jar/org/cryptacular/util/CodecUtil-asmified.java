package asm.org.cryptacular.util;
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
public class CodecUtilDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/cryptacular/util/CodecUtil", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hex", "([B)Ljava/lang/String;", null, new String[] { "org/cryptacular/EncodingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/HexEncoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/HexEncoder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/util/CodecUtil", "encode", "(Lorg/cryptacular/codec/Encoder;[B)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hex", "([BZ)Ljava/lang/String;", null, new String[] { "org/cryptacular/EncodingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/HexEncoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/HexEncoder", "<init>", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/util/CodecUtil", "encode", "(Lorg/cryptacular/codec/Encoder;[B)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hex", "(Ljava/lang/CharSequence;)[B", null, new String[] { "org/cryptacular/EncodingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/HexDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/HexDecoder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/util/CodecUtil", "decode", "(Lorg/cryptacular/codec/Decoder;Ljava/lang/CharSequence;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "b64", "([B)Ljava/lang/String;", null, new String[] { "org/cryptacular/EncodingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/Base64Encoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/Base64Encoder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/util/CodecUtil", "encode", "(Lorg/cryptacular/codec/Encoder;[B)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "b64", "(Ljava/lang/CharSequence;)[B", null, new String[] { "org/cryptacular/EncodingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/Base64Decoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/Base64Decoder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/util/CodecUtil", "decode", "(Lorg/cryptacular/codec/Decoder;Ljava/lang/CharSequence;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "b64", "([BI)Ljava/lang/String;", null, new String[] { "org/cryptacular/EncodingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/Base64Encoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/Base64Encoder", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/util/CodecUtil", "encode", "(Lorg/cryptacular/codec/Encoder;[B)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "b32", "([B)Ljava/lang/String;", null, new String[] { "org/cryptacular/EncodingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/Base32Encoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/Base32Encoder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/util/CodecUtil", "encode", "(Lorg/cryptacular/codec/Encoder;[B)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "b32", "(Ljava/lang/CharSequence;)[B", null, new String[] { "org/cryptacular/EncodingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/Base32Decoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/Base32Decoder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/util/CodecUtil", "decode", "(Lorg/cryptacular/codec/Decoder;Ljava/lang/CharSequence;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "b32", "([BI)Ljava/lang/String;", null, new String[] { "org/cryptacular/EncodingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/Base32Encoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/Base32Encoder", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/util/CodecUtil", "encode", "(Lorg/cryptacular/codec/Encoder;[B)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "encode", "(Lorg/cryptacular/codec/Encoder;[B)Ljava/lang/String;", null, new String[] { "org/cryptacular/EncodingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/codec/Encoder", "outputSize", "(I)I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/CharBuffer", "allocate", "(I)Ljava/nio/CharBuffer;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "wrap", "([B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/codec/Encoder", "encode", "(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/codec/Encoder", "finalize", "(Ljava/nio/CharBuffer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "flip", "()Ljava/nio/Buffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "decode", "(Lorg/cryptacular/codec/Decoder;Ljava/lang/CharSequence;)[B", null, new String[] { "org/cryptacular/EncodingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/CharSequence", "length", "()I", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/codec/Decoder", "outputSize", "(I)I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "allocate", "(I)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/CharBuffer", "wrap", "(Ljava/lang/CharSequence;)Ljava/nio/CharBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/codec/Decoder", "decode", "(Ljava/nio/CharBuffer;Ljava/nio/ByteBuffer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/codec/Decoder", "finalize", "(Ljava/nio/ByteBuffer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "flip", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/util/ByteUtil", "toArray", "(Ljava/nio/ByteBuffer;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
