package asm.org.apache.coyote.http11.filters;
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
public class GzipOutputFilter$FakeOutputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/coyote/http11/filters/GzipOutputFilter$FakeOutputStream", null, "java/io/OutputStream", null);

classWriter.visitInnerClass("org/apache/coyote/http11/filters/GzipOutputFilter$FakeOutputStream", "org/apache/coyote/http11/filters/GzipOutputFilter", "FakeOutputStream", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "outputChunk", "Ljava/nio/ByteBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/coyote/http11/filters/GzipOutputFilter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/coyote/http11/filters/GzipOutputFilter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http11/filters/GzipOutputFilter$FakeOutputStream", "this$0", "Lorg/apache/coyote/http11/filters/GzipOutputFilter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/OutputStream", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "allocate", "(I)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http11/filters/GzipOutputFilter$FakeOutputStream", "outputChunk", "Ljava/nio/ByteBuffer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http11/filters/GzipOutputFilter$FakeOutputStream", "outputChunk", "Ljava/nio/ByteBuffer;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(I2B);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "(IB)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http11/filters/GzipOutputFilter$FakeOutputStream", "this$0", "Lorg/apache/coyote/http11/filters/GzipOutputFilter;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http11/filters/GzipOutputFilter", "buffer", "Lorg/apache/coyote/http11/HttpOutputBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http11/filters/GzipOutputFilter$FakeOutputStream", "outputChunk", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/http11/HttpOutputBuffer", "doWrite", "(Ljava/nio/ByteBuffer;)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "([BII)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http11/filters/GzipOutputFilter$FakeOutputStream", "this$0", "Lorg/apache/coyote/http11/filters/GzipOutputFilter;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http11/filters/GzipOutputFilter", "buffer", "Lorg/apache/coyote/http11/HttpOutputBuffer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "wrap", "([BII)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/http11/HttpOutputBuffer", "doWrite", "(Ljava/nio/ByteBuffer;)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "flush", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
