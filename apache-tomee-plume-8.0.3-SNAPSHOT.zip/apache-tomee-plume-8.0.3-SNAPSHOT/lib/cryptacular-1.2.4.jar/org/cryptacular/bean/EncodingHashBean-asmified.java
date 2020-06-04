package asm.org.cryptacular.bean;
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
public class EncodingHashBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/cryptacular/bean/EncodingHashBean", "Lorg/cryptacular/bean/AbstractHashBean;Lorg/cryptacular/bean/HashBean<Ljava/lang/String;>;", "org/cryptacular/bean/AbstractHashBean", new String[] { "org/cryptacular/bean/HashBean" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "codecSpec", "Lorg/cryptacular/spec/Spec;", "Lorg/cryptacular/spec/Spec<Lorg/cryptacular/codec/Codec;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "salted", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/bean/AbstractHashBean", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/cryptacular/spec/Spec;Lorg/cryptacular/spec/Spec;)V", "(Lorg/cryptacular/spec/Spec<Lorg/cryptacular/codec/Codec;>;Lorg/cryptacular/spec/Spec<Lorg/bouncycastle/crypto/Digest;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/bean/EncodingHashBean", "<init>", "(Lorg/cryptacular/spec/Spec;Lorg/cryptacular/spec/Spec;IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/cryptacular/spec/Spec;Lorg/cryptacular/spec/Spec;I)V", "(Lorg/cryptacular/spec/Spec<Lorg/cryptacular/codec/Codec;>;Lorg/cryptacular/spec/Spec<Lorg/bouncycastle/crypto/Digest;>;I)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/bean/EncodingHashBean", "<init>", "(Lorg/cryptacular/spec/Spec;Lorg/cryptacular/spec/Spec;IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/cryptacular/spec/Spec;Lorg/cryptacular/spec/Spec;IZ)V", "(Lorg/cryptacular/spec/Spec<Lorg/cryptacular/codec/Codec;>;Lorg/cryptacular/spec/Spec<Lorg/bouncycastle/crypto/Digest;>;IZ)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/bean/AbstractHashBean", "<init>", "(Lorg/cryptacular/spec/Spec;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/bean/EncodingHashBean", "setCodecSpec", "(Lorg/cryptacular/spec/Spec;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/bean/EncodingHashBean", "setSalted", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCodecSpec", "()Lorg/cryptacular/spec/Spec;", "()Lorg/cryptacular/spec/Spec<Lorg/cryptacular/codec/Codec;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/bean/EncodingHashBean", "codecSpec", "Lorg/cryptacular/spec/Spec;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCodecSpec", "(Lorg/cryptacular/spec/Spec;)V", "(Lorg/cryptacular/spec/Spec<Lorg/cryptacular/codec/Codec;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/bean/EncodingHashBean", "codecSpec", "Lorg/cryptacular/spec/Spec;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSalted", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/bean/EncodingHashBean", "salted", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSalted", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/bean/EncodingHashBean", "salted", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "hash", "([Ljava/lang/Object;)Ljava/lang/String;", null, new String[] { "org/cryptacular/CryptoException", "org/cryptacular/EncodingException", "org/cryptacular/StreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/bean/EncodingHashBean", "salted", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(INSTANCEOF, "[B");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Last parameter must be a salt of type byte[]");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/bean/EncodingHashBean", "codecSpec", "Lorg/cryptacular/spec/Spec;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/spec/Spec", "newInstance", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/cryptacular/codec/Codec");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/codec/Codec", "getEncoder", "()Lorg/cryptacular/codec/Encoder;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/bean/EncodingHashBean", "hashInternal", "([Ljava/lang/Object;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Arrays", "concatenate", "([B[B)[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/util/CodecUtil", "encode", "(Lorg/cryptacular/codec/Encoder;[B)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/bean/EncodingHashBean", "codecSpec", "Lorg/cryptacular/spec/Spec;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/spec/Spec", "newInstance", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/cryptacular/codec/Codec");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/codec/Codec", "getEncoder", "()Lorg/cryptacular/codec/Encoder;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/bean/EncodingHashBean", "hashInternal", "([Ljava/lang/Object;)[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/util/CodecUtil", "encode", "(Lorg/cryptacular/codec/Encoder;[B)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "compare", "(Ljava/lang/String;[Ljava/lang/Object;)Z", null, new String[] { "org/cryptacular/CryptoException", "org/cryptacular/EncodingException", "org/cryptacular/StreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/bean/EncodingHashBean", "codecSpec", "Lorg/cryptacular/spec/Spec;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/spec/Spec", "newInstance", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/cryptacular/codec/Codec");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/codec/Codec", "getDecoder", "()Lorg/cryptacular/codec/Decoder;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/util/CodecUtil", "decode", "(Lorg/cryptacular/codec/Decoder;Ljava/lang/CharSequence;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/bean/EncodingHashBean", "compareInternal", "([B[Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "compare", "(Ljava/lang/Object;[Ljava/lang/Object;)Z", null, new String[] { "org/cryptacular/CryptoException", "org/cryptacular/StreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/bean/EncodingHashBean", "compare", "(Ljava/lang/String;[Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "hash", "([Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "org/cryptacular/CryptoException", "org/cryptacular/StreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/bean/EncodingHashBean", "hash", "([Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
