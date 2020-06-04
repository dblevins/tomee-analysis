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
public class BlobUploaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/blob/BlobUploader", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "blobTransferPolicy", "Lorg/apache/activemq/blob/BlobTransferPolicy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "file", "Ljava/io/File;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "in", "Ljava/io/InputStream;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/blob/BlobTransferPolicy;Ljava/io/InputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/blob/BlobTransferPolicy", "copy", "()Lorg/apache/activemq/blob/BlobTransferPolicy;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/blob/BlobUploader", "blobTransferPolicy", "Lorg/apache/activemq/blob/BlobTransferPolicy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/blob/BlobUploader", "in", "Ljava/io/InputStream;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/blob/BlobTransferPolicy;Ljava/io/File;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/blob/BlobTransferPolicy", "copy", "()Lorg/apache/activemq/blob/BlobTransferPolicy;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/blob/BlobUploader", "blobTransferPolicy", "Lorg/apache/activemq/blob/BlobTransferPolicy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/blob/BlobUploader", "file", "Ljava/io/File;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "upload", "(Lorg/apache/activemq/command/ActiveMQBlobMessage;)Ljava/net/URL;", null, new String[] { "javax/jms/JMSException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/blob/BlobUploader", "file", "Ljava/io/File;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/blob/BlobUploader", "getStrategy", "()Lorg/apache/activemq/blob/BlobUploadStrategy;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/blob/BlobUploader", "file", "Ljava/io/File;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/blob/BlobUploadStrategy", "uploadFile", "(Lorg/apache/activemq/command/ActiveMQBlobMessage;Ljava/io/File;)Ljava/net/URL;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/blob/BlobUploader", "getStrategy", "()Lorg/apache/activemq/blob/BlobUploadStrategy;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/blob/BlobUploader", "in", "Ljava/io/InputStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/blob/BlobUploadStrategy", "uploadStream", "(Lorg/apache/activemq/command/ActiveMQBlobMessage;Ljava/io/InputStream;)Ljava/net/URL;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBlobTransferPolicy", "()Lorg/apache/activemq/blob/BlobTransferPolicy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/blob/BlobUploader", "blobTransferPolicy", "Lorg/apache/activemq/blob/BlobTransferPolicy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStrategy", "()Lorg/apache/activemq/blob/BlobUploadStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/blob/BlobUploader", "getBlobTransferPolicy", "()Lorg/apache/activemq/blob/BlobTransferPolicy;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/blob/BlobTransferPolicy", "getUploadStrategy", "()Lorg/apache/activemq/blob/BlobUploadStrategy;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
