package asm.org.apache.johnzon.core;
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
public class BufferStrategyFactory$ThreadLocalProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_ABSTRACT, "org/apache/johnzon/core/BufferStrategyFactory$ThreadLocalProvider", "<T:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/johnzon/core/BufferStrategy$BufferProvider<TT;>;", "java/lang/Object", new String[] { "org/apache/johnzon/core/BufferStrategy$BufferProvider" });

classWriter.visitInnerClass("org/apache/johnzon/core/BufferStrategyFactory$ThreadLocalProvider", "org/apache/johnzon/core/BufferStrategyFactory", "ThreadLocalProvider", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/johnzon/core/BufferStrategyFactory$ThreadLocalProvider$1", null, null, 0);

classWriter.visitInnerClass("org/apache/johnzon/core/BufferStrategy$BufferProvider", "org/apache/johnzon/core/BufferStrategy", "BufferProvider", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "cache", "Lorg/apache/johnzon/core/ThreadLocalBufferCache;", "Lorg/apache/johnzon/core/ThreadLocalBufferCache<TT;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/BufferStrategyFactory$ThreadLocalProvider$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/BufferStrategyFactory$ThreadLocalProvider$1", "<init>", "(Lorg/apache/johnzon/core/BufferStrategyFactory$ThreadLocalProvider;II)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/BufferStrategyFactory$ThreadLocalProvider", "cache", "Lorg/apache/johnzon/core/ThreadLocalBufferCache;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "newInstance", "(I)Ljava/lang/Object;", "(I)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newBuffer", "()Ljava/lang/Object;", "()TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/BufferStrategyFactory$ThreadLocalProvider", "cache", "Lorg/apache/johnzon/core/ThreadLocalBufferCache;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/ThreadLocalBufferCache", "getCache", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "release", "(Ljava/lang/Object;)V", "(TT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/BufferStrategyFactory$ThreadLocalProvider", "cache", "Lorg/apache/johnzon/core/ThreadLocalBufferCache;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/ThreadLocalBufferCache", "release", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
