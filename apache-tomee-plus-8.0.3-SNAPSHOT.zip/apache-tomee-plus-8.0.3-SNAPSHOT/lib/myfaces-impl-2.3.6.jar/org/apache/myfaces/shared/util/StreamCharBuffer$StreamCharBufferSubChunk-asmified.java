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
public class StreamCharBuffer$StreamCharBufferSubChunkDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", null, "org/apache/myfaces/shared/util/StreamCharBuffer$AbstractChunk", null);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "org/apache/myfaces/shared/util/StreamCharBuffer", "StreamCharBufferSubChunk", ACC_FINAL);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/StreamCharBuffer$ChunkReader", "org/apache/myfaces/shared/util/StreamCharBuffer", "ChunkReader", ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunkReader", "org/apache/myfaces/shared/util/StreamCharBuffer", "StreamCharBufferSubChunkReader", ACC_FINAL);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/StreamCharBuffer$AbstractChunk", "org/apache/myfaces/shared/util/StreamCharBuffer", "AbstractChunk", ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferKey", "org/apache/myfaces/shared/util/StreamCharBuffer", "StreamCharBufferKey", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(0, "streamCharBuffer", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "cachedSize", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;Lorg/apache/myfaces/shared/util/StreamCharBuffer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "this$0", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/util/StreamCharBuffer$AbstractChunk", "<init>", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "streamCharBuffer", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer", "access$1500", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;)I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/util/StreamCharBuffer", "size", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "cachedSize", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer", "access$1500", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "cachedSize", "I");
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer", "access$1502", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;I)I", false);
methodVisitor.visitInsn(POP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "org/apache/myfaces/shared/util/StreamCharBuffer", "org/apache/myfaces/shared/util/StreamCharBuffer"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "cachedSize", "I");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeTo", "(Ljava/io/Writer;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "streamCharBuffer", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/util/StreamCharBuffer", "writeTo", "(Ljava/io/Writer;)Ljava/io/Writer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getChunkReader", "(Z)Lorg/apache/myfaces/shared/util/StreamCharBuffer$ChunkReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunkReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "this$0", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunkReader", "<init>", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;Lorg/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "cachedSize", "I");
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "streamCharBuffer", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/util/StreamCharBuffer", "size", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "cachedSize", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "cachedSize", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasCachedSize", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "cachedSize", "I");
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSubBuffer", "()Lorg/apache/myfaces/shared/util/StreamCharBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "streamCharBuffer", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resetSize", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "cachedSize", "I");
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "cachedSize", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "subtractFromTotalCount", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "this$0", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer", "access$1500", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;)I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "this$0", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "this$0", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer", "access$1500", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "size", "()I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer", "access$1502", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "this$0", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer", "access$1700", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;)Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferSubChunk", "streamCharBuffer", "Lorg/apache/myfaces/shared/util/StreamCharBuffer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/StreamCharBuffer", "access$1600", "(Lorg/apache/myfaces/shared/util/StreamCharBuffer;)Lorg/apache/myfaces/shared/util/StreamCharBuffer$StreamCharBufferKey;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
