package asm.org.apache.tomcat.util.http.fileupload.impl;
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
public class FileItemStreamImpl$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl$1", null, "org/apache/tomcat/util/http/fileupload/util/LimitedInputStream", null);

classWriter.visitOuterClass("org/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl", "<init>", "(Lorg/apache/tomcat/util/http/fileupload/impl/FileItemIteratorImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V");

classWriter.visitInnerClass("org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "org/apache/tomcat/util/http/fileupload/MultipartStream", "ItemInputStream", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$itemStream", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl;Ljava/io/InputStream;JLorg/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl$1", "this$0", "Lorg/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl$1", "val$itemStream", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/fileupload/util/LimitedInputStream", "<init>", "(Ljava/io/InputStream;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "raiseError", "(JJ)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl$1", "val$itemStream", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "close", "(Z)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/fileupload/impl/FileSizeLimitExceededException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("The field %s exceeds its maximum permitted size of %s bytes.");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl$1", "this$0", "Lorg/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl", "access$000", "(Lorg/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/fileupload/impl/FileSizeLimitExceededException", "<init>", "(Ljava/lang/String;JJ)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl$1", "this$0", "Lorg/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl", "access$000", "(Lorg/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/fileupload/impl/FileSizeLimitExceededException", "setFieldName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl$1", "this$0", "Lorg/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/impl/FileItemStreamImpl", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/fileupload/impl/FileSizeLimitExceededException", "setFileName", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/fileupload/impl/FileUploadIOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/fileupload/impl/FileUploadIOException", "<init>", "(Lorg/apache/tomcat/util/http/fileupload/FileUploadException;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(8, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
