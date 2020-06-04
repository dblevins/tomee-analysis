package asm.org.apache.myfaces.shared.util;
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
public class StreamCharBuffer$StreamCharBufferSubChunkReaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunkReader", null, "org/apache/myfaces/shared/util/StreamCharBuffer$AbstractChunkReader", null);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "org/apache/myfaces/shared/util/StreamCharBuffer", "StreamCharBufferSubChunk", ACC_FINAL);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferReader", "org/apache/myfaces/shared/util/StreamCharBuffer", "StreamCharBufferReader", ACC_PUBLIC | ACC_FINAL);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunkReader", "org/apache/myfaces/shared/util/StreamCharBuffer", "StreamCharBufferSubChunkReader", ACC_FINAL);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/StreamCharBuffer$AbstractChunkReader", "org/apache/myfaces/shared/util/StreamCharBuffer", "AbstractChunkReader", ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/StreamCharBuffer$AbstractChunk", "org/apache/myfaces/shared/util/StreamCharBuffer", "AbstractChunk", ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(0, "parent", "Lorg/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "reader", "Lorg/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferReader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;Lorg/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunkReader", "this$0", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/util/StreamCharBuffer$AbstractChunkReader", "<init>", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;Lorg/apache/myfaces/shared/util/StreamCharBuffer$AbstractChunk;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunkReader", "parent", "Lorg/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "streamCharBuffer", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/util/StreamCharBuffer", "getReader", "()Ljava/io/Reader;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferReader");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunkReader", "reader", "Lorg/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferReader;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReadLenLimit", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunkReader", "reader", "Lorg/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferReader;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferReader", "getReadLenLimit", "(I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "([CII)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunkReader", "reader", "Lorg/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferReader;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferReader", "read", "([CII)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
