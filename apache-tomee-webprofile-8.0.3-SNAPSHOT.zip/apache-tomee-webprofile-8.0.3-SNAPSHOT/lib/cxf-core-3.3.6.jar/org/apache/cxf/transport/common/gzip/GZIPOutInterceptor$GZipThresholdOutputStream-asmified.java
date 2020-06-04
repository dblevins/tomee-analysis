package asm.org.apache.cxf.transport.common.gzip;
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
public class GZIPOutInterceptor$GZipThresholdOutputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/transport/common/gzip/GZIPOutInterceptor$GZipThresholdOutputStream", null, "org/apache/cxf/io/AbstractThresholdOutputStream", null);

classWriter.visitInnerClass("org/apache/cxf/transport/common/gzip/GZIPOutInterceptor$GZipThresholdOutputStream", "org/apache/cxf/transport/common/gzip/GZIPOutInterceptor", "GZipThresholdOutputStream", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "message", "Lorg/apache/cxf/message/Message;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(ILjava/io/OutputStream;ZLorg/apache/cxf/message/Message;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/io/AbstractThresholdOutputStream", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/io/AbstractThresholdOutputStream", "wrappedStream", "Ljava/io/OutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/common/gzip/GZIPOutInterceptor$GZipThresholdOutputStream", "message", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitVarInsn(ILOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/common/gzip/GZIPOutInterceptor$GZipThresholdOutputStream", "setupGZip", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/cxf/transport/common/gzip/GZIPOutInterceptor$GZipThresholdOutputStream", Opcodes.INTEGER, "java/io/OutputStream", Opcodes.INTEGER, "org/apache/cxf/message/Message"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setupGZip", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "thresholdNotReached", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/transport/common/gzip/GZIPOutInterceptor", "access$000", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitLdcInsn("Message is smaller than compression threshold, not compressing.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "fine", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "thresholdReached", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/transport/common/gzip/GZIPOutInterceptor", "access$000", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitLdcInsn("Compressing message.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "fine", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/common/gzip/GZIPOutInterceptor$GZipThresholdOutputStream", "message", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/common/gzip/GZIPOutInterceptor", "GZIP_ENCODING_KEY", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/common/gzip/GZIPOutInterceptor$GZipThresholdOutputStream", "message", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitLdcInsn("Content-Encoding");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/transport/common/gzip/GZIPOutInterceptor", "access$100", "(Lorg/apache/cxf/message/Message;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/common/gzip/GZIPOutInterceptor$GZipThresholdOutputStream", "message", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitLdcInsn("org.apache.cxf.client");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/common/gzip/GZIPOutInterceptor$GZipThresholdOutputStream", "message", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitLdcInsn("Vary");
methodVisitor.visitLdcInsn("Accept-Encoding");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/transport/common/gzip/GZIPOutInterceptor", "access$100", "(Lorg/apache/cxf/message/Message;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/zip/GZIPOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/common/gzip/GZIPOutInterceptor$GZipThresholdOutputStream", "wrappedStream", "Ljava/io/OutputStream;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/zip/GZIPOutputStream", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/common/gzip/GZIPOutInterceptor$GZipThresholdOutputStream", "wrappedStream", "Ljava/io/OutputStream;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
