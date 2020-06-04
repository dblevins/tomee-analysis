package asm.org.cryptacular.codec;
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
public class HexCodecDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/cryptacular/codec/HexCodec", null, "java/lang/Object", new String[] { "org/cryptacular/codec/Codec" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "encoder", "Lorg/cryptacular/codec/Encoder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "decoder", "Lorg/cryptacular/codec/Decoder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "uppercase", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/HexCodec", "<init>", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/HexDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/HexDecoder", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/codec/HexCodec", "decoder", "Lorg/cryptacular/codec/Decoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/codec/HexCodec", "uppercase", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/HexEncoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/codec/HexCodec", "uppercase", "Z");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/HexEncoder", "<init>", "(ZZ)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/codec/HexCodec", "encoder", "Lorg/cryptacular/codec/Encoder;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncoder", "()Lorg/cryptacular/codec/Encoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/codec/HexCodec", "encoder", "Lorg/cryptacular/codec/Encoder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDecoder", "()Lorg/cryptacular/codec/Decoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/codec/HexCodec", "decoder", "Lorg/cryptacular/codec/Decoder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newEncoder", "()Lorg/cryptacular/codec/Encoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/HexEncoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/codec/HexCodec", "uppercase", "Z");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/HexEncoder", "<init>", "(ZZ)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newDecoder", "()Lorg/cryptacular/codec/Decoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/codec/HexDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/codec/HexDecoder", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
