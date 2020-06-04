package asm.org.apache.myfaces.application.jsp;
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
public class ServletViewResponseWrapper$WrappedServletOutputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream", null, "jakarta/servlet/ServletOutputStream", null);

classWriter.visitInnerClass("org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream", "org/apache/myfaces/application/jsp/ServletViewResponseWrapper", "WrappedServletOutputStream", ACC_STATIC);

classWriter.visitInnerClass("org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream", "org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream", "WrappedByteArrayOutputStream", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_byteArrayOutputStream", "Lorg/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/ServletOutputStream", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream", "_byteArrayOutputStream", "Lorg/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream", "_byteArrayOutputStream", "Lorg/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream", "write", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toByteArray", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream", "_byteArrayOutputStream", "Lorg/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream", "toByteArray", "()[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "writeTo", "(Ljava/io/Writer;Ljava/lang/String;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/charset/Charset", "defaultCharset", "()Ljava/nio/charset/Charset;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/charset/Charset", "forName", "(Ljava/lang/String;)Ljava/nio/charset/Charset;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/nio/charset/Charset"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/charset/Charset", "newDecoder", "()Ljava/nio/charset/CharsetDecoder;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream", "_byteArrayOutputStream", "Lorg/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream", "access$100", "(Lorg/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream;)[B", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream", "_byteArrayOutputStream", "Lorg/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream", "access$200", "(Lorg/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "wrap", "([BII)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/charset/CharsetDecoder", "decode", "(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "hasArray", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "array", "()[C", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/Writer", "write", "([C)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/nio/charset/Charset", "java/nio/charset/CharsetDecoder", "java/nio/CharBuffer"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream", "_byteArrayOutputStream", "Lorg/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream$WrappedByteArrayOutputStream", "reset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isReady", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWriteListener", "(Ljakarta/servlet/WriteListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream;Ljava/io/Writer;Ljava/lang/String;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/application/jsp/ServletViewResponseWrapper$WrappedServletOutputStream", "writeTo", "(Ljava/io/Writer;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
