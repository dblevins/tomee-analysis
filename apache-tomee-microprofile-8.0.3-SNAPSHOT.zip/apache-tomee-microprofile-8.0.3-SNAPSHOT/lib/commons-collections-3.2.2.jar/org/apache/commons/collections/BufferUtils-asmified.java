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
public class BufferUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections/BufferUtils", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EMPTY_BUFFER", "Lorg/apache/commons/collections/Buffer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "synchronizedBuffer", "(Lorg/apache/commons/collections/Buffer;)Lorg/apache/commons/collections/Buffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/buffer/SynchronizedBuffer", "decorate", "(Lorg/apache/commons/collections/Buffer;)Lorg/apache/commons/collections/Buffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "blockingBuffer", "(Lorg/apache/commons/collections/Buffer;)Lorg/apache/commons/collections/Buffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/buffer/BlockingBuffer", "decorate", "(Lorg/apache/commons/collections/Buffer;)Lorg/apache/commons/collections/Buffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "blockingBuffer", "(Lorg/apache/commons/collections/Buffer;J)Lorg/apache/commons/collections/Buffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/buffer/BlockingBuffer", "decorate", "(Lorg/apache/commons/collections/Buffer;J)Lorg/apache/commons/collections/Buffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "boundedBuffer", "(Lorg/apache/commons/collections/Buffer;I)Lorg/apache/commons/collections/Buffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/buffer/BoundedBuffer", "decorate", "(Lorg/apache/commons/collections/Buffer;I)Lorg/apache/commons/collections/buffer/BoundedBuffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "boundedBuffer", "(Lorg/apache/commons/collections/Buffer;IJ)Lorg/apache/commons/collections/Buffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/buffer/BoundedBuffer", "decorate", "(Lorg/apache/commons/collections/Buffer;IJ)Lorg/apache/commons/collections/buffer/BoundedBuffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unmodifiableBuffer", "(Lorg/apache/commons/collections/Buffer;)Lorg/apache/commons/collections/Buffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/buffer/UnmodifiableBuffer", "decorate", "(Lorg/apache/commons/collections/Buffer;)Lorg/apache/commons/collections/Buffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "predicatedBuffer", "(Lorg/apache/commons/collections/Buffer;Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Buffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/buffer/PredicatedBuffer", "decorate", "(Lorg/apache/commons/collections/Buffer;Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Buffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "typedBuffer", "(Lorg/apache/commons/collections/Buffer;Ljava/lang/Class;)Lorg/apache/commons/collections/Buffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/buffer/TypedBuffer", "decorate", "(Lorg/apache/commons/collections/Buffer;Ljava/lang/Class;)Lorg/apache/commons/collections/Buffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "transformedBuffer", "(Lorg/apache/commons/collections/Buffer;Lorg/apache/commons/collections/Transformer;)Lorg/apache/commons/collections/Buffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/buffer/TransformedBuffer", "decorate", "(Lorg/apache/commons/collections/Buffer;Lorg/apache/commons/collections/Transformer;)Lorg/apache/commons/collections/Buffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections/ArrayStack");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/ArrayStack", "<init>", "(I)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/buffer/UnmodifiableBuffer", "decorate", "(Lorg/apache/commons/collections/Buffer;)Lorg/apache/commons/collections/Buffer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections/BufferUtils", "EMPTY_BUFFER", "Lorg/apache/commons/collections/Buffer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
