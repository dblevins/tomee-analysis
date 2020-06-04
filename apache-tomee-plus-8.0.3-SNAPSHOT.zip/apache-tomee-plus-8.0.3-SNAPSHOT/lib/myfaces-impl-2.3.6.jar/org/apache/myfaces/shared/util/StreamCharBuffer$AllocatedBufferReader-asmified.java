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
public class StreamCharBuffer$AllocatedBufferReaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", null, "org/apache/myfaces/shared/util/StreamCharBuffer$ChunkReader", null);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer", "org/apache/myfaces/shared/util/StreamCharBuffer", "AllocatedBuffer", ACC_FINAL);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "org/apache/myfaces/shared/util/StreamCharBuffer", "AllocatedBufferReader", ACC_FINAL);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/StreamCharBuffer$ChunkReader", "org/apache/myfaces/shared/util/StreamCharBuffer", "ChunkReader", ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferWriter", "org/apache/myfaces/shared/util/StreamCharBuffer", "StreamCharBufferWriter", ACC_PUBLIC | ACC_FINAL);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/StreamCharBuffer$AbstractChunk", "org/apache/myfaces/shared/util/StreamCharBuffer", "AbstractChunk", ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(0, "parent", "Lorg/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "position", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "writerUsedCounter", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "removeAfterReading", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;Lorg/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "this$0", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/util/StreamCharBuffer$ChunkReader", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "parent", "Lorg/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer", "access$1800", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "position", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer", "hasReaders", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer", "access$1000", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;)Lorg/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferWriter;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferWriter", "writerUsedCounter", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "writerUsedCounter", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "org/apache/myfaces/shared/util/StreamCharBuffer", "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "writerUsedCounter", "I");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "removeAfterReading", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReadLenLimit", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "parent", "Lorg/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer", "access$1900", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "position", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(II)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "([CII)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "parent", "Lorg/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer", "access$2000", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer;)[C", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "position", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer", "arrayCopy", "([CI[CII)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "position", "I");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "position", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "removeAfterReading", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "parent", "Lorg/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "position", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer", "access$1802", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer;I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lorg/apache/myfaces/shared/util/StreamCharBuffer$ChunkReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWriterUsedCounter", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "writerUsedCounter", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isValid", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "this$0", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer", "access$300", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;)Lorg/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "parent", "Lorg/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBuffer;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "this$0", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer", "access$1200", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;)Lorg/apache/myfaces/shared/util/StreamCharBuffer$AbstractChunk;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "this$0", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer", "access$1200", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;)Lorg/apache/myfaces/shared/util/StreamCharBuffer$AbstractChunk;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AbstractChunk", "writerUsedCounter", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$AllocatedBufferReader", "writerUsedCounter", "I");
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
