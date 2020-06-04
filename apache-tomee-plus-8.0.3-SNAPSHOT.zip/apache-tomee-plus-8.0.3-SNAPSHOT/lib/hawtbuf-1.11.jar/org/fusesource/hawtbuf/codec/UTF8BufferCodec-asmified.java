package asm.org.fusesource.hawtbuf.codec;
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
public class UTF8BufferCodecDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/fusesource/hawtbuf/codec/UTF8BufferCodec", "Lorg/fusesource/hawtbuf/codec/AbstractBufferCodec<Lorg/fusesource/hawtbuf/UTF8Buffer;>;", "org/fusesource/hawtbuf/codec/AbstractBufferCodec", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSTANCE", "Lorg/fusesource/hawtbuf/codec/UTF8BufferCodec;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/fusesource/hawtbuf/codec/AbstractBufferCodec", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createBuffer", "([B)Lorg/fusesource/hawtbuf/UTF8Buffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/fusesource/hawtbuf/UTF8Buffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/fusesource/hawtbuf/UTF8Buffer", "<init>", "([B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "createBuffer", "([B)Lorg/fusesource/hawtbuf/Buffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/fusesource/hawtbuf/codec/UTF8BufferCodec", "createBuffer", "([B)Lorg/fusesource/hawtbuf/UTF8Buffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/fusesource/hawtbuf/codec/UTF8BufferCodec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/fusesource/hawtbuf/codec/UTF8BufferCodec", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/fusesource/hawtbuf/codec/UTF8BufferCodec", "INSTANCE", "Lorg/fusesource/hawtbuf/codec/UTF8BufferCodec;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
