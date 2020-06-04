package asm.org.apache.activemq.blob;
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
public class FTPBlobDownloadStrategy$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/blob/FTPBlobDownloadStrategy$1", null, "java/io/FilterInputStream", null);

classWriter.visitOuterClass("org/apache/activemq/blob/FTPBlobDownloadStrategy", "getInputStream", "(Lorg/apache/activemq/command/ActiveMQBlobMessage;)Ljava/io/InputStream;");

classWriter.visitInnerClass("org/apache/activemq/blob/FTPBlobDownloadStrategy$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$ftp", "Lorg/apache/commons/net/ftp/FTPClient;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/blob/FTPBlobDownloadStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/blob/FTPBlobDownloadStrategy;Ljava/io/InputStream;Lorg/apache/commons/net/ftp/FTPClient;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/blob/FTPBlobDownloadStrategy$1", "this$0", "Lorg/apache/activemq/blob/FTPBlobDownloadStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/blob/FTPBlobDownloadStrategy$1", "val$ftp", "Lorg/apache/commons/net/ftp/FTPClient;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/FilterInputStream", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/blob/FTPBlobDownloadStrategy$1", "in", "Ljava/io/InputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "close", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/blob/FTPBlobDownloadStrategy$1", "val$ftp", "Lorg/apache/commons/net/ftp/FTPClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/net/ftp/FTPClient", "quit", "()I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/blob/FTPBlobDownloadStrategy$1", "val$ftp", "Lorg/apache/commons/net/ftp/FTPClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/net/ftp/FTPClient", "disconnect", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
