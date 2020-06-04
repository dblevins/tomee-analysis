package asm.org.apache.cxf.transport.http;
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
public class AbstractHTTPDestination$WrappedOutputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", null, "org/apache/cxf/io/AbstractWrappedOutputStream", new String[] { "org/apache/cxf/io/CopyingOutputStream" });

classWriter.visitInnerClass("org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "org/apache/cxf/transport/http/AbstractHTTPDestination", "WrappedOutputStream", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "outMessage", "Lorg/apache/cxf/message/Message;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/transport/http/AbstractHTTPDestination;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/transport/http/AbstractHTTPDestination;Lorg/apache/cxf/message/Message;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "this$0", "Lorg/apache/cxf/transport/http/AbstractHTTPDestination;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/io/AbstractWrappedOutputStream", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "outMessage", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copyFrom", "(Ljava/io/InputStream;)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "written", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "onFirstWrite", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "written", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "wrappedStream", "Ljava/io/OutputStream;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "wrappedStream", "Ljava/io/OutputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/helpers/IOUtils", "copy", "(Ljava/io/InputStream;Ljava/io/OutputStream;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 4096);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/helpers/IOUtils", "copy", "(Ljava/io/InputStream;Ljava/io/OutputStream;I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "onFirstWrite", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "this$0", "Lorg/apache/cxf/transport/http/AbstractHTTPDestination;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "outMessage", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/AbstractHTTPDestination", "flushHeaders", "(Lorg/apache/cxf/message/Message;)Ljava/io/OutputStream;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "wrappedStream", "Ljava/io/OutputStream;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/io/OutputStream"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "written", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "wrappedStream", "Ljava/io/OutputStream;");
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "this$0", "Lorg/apache/cxf/transport/http/AbstractHTTPDestination;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "outMessage", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/AbstractHTTPDestination", "flushHeaders", "(Lorg/apache/cxf/message/Message;Z)Ljava/io/OutputStream;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "wrappedStream", "Ljava/io/OutputStream;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "wrappedStream", "Ljava/io/OutputStream;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/AbstractHTTPDestination$WrappedOutputStream", "wrappedStream", "Ljava/io/OutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStream", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
