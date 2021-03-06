package asm.org.apache.tomcat.util.http.fileupload;
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
public class MultipartStream$ItemInputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", null, "java/io/InputStream", new String[] { "org/apache/tomcat/util/http/fileupload/util/Closeable" });

classWriter.visitInnerClass("org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "org/apache/tomcat/util/http/fileupload/MultipartStream", "ItemInputStream", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/tomcat/util/http/fileupload/FileItemStream$ItemSkippedException", "org/apache/tomcat/util/http/fileupload/FileItemStream", "ItemSkippedException", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomcat/util/http/fileupload/MultipartStream$MalformedStreamException", "org/apache/tomcat/util/http/fileupload/MultipartStream", "MalformedStreamException", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomcat/util/http/fileupload/MultipartStream$ProgressNotifier", "org/apache/tomcat/util/http/fileupload/MultipartStream", "ProgressNotifier", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "total", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "pad", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "pos", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "closed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "BYTE_POSITIVE_OFFSET", "I", null, new Integer(256));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/InputStream", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "findSeparator", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "findSeparator", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/fileupload/MultipartStream", "findSeparator", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "pos", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "pos", "I");
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$000", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$100", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$200", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$200", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "pad", "I");
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$000", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$100", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "pad", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBytesRead", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "total", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "available", "()I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "pos", "I");
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$000", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$100", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "pad", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "pos", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$100", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "()I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "closed", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/fileupload/FileItemStream$ItemSkippedException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/fileupload/FileItemStream$ItemSkippedException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "available", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "makeAvailable", "()I", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "total", "J");
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "total", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$300", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$108", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFLT, label2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "([BII)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "closed", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/fileupload/FileItemStream$ItemSkippedException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/fileupload/FileItemStream$ItemSkippedException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "available", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "makeAvailable", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(II)I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$300", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$100", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$100", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$102", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "total", "J");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "total", "J");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "close", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "(Z)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "closed", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "closed", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$400", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)Ljava/io/InputStream;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "close", "()V", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "available", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "makeAvailable", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "skip", "(J)J", false);
methodVisitor.visitInsn(POP2);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "closed", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "skip", "(J)J", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "closed", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/fileupload/FileItemStream$ItemSkippedException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/fileupload/FileItemStream$ItemSkippedException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "available", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "makeAvailable", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(I2L);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(JJ)J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$100", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LADD);
methodVisitor.visitInsn(L2I);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$102", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "makeAvailable", "()I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "pos", "I");
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "total", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$000", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$100", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "pad", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "total", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$300", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$000", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "pad", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$300", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)[B", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "pad", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$102", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "pad", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$002", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;I)I", false);
methodVisitor.visitInsn(POP);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$400", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)Ljava/io/InputStream;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$300", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$000", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$500", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$000", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "read", "([BII)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_M1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitLdcInsn("Stream ended unexpectedly");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/fileupload/MultipartStream$MalformedStreamException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Stream ended unexpectedly");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/fileupload/MultipartStream$MalformedStreamException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$600", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)Lorg/apache/tomcat/util/http/fileupload/MultipartStream$ProgressNotifier;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$600", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)Lorg/apache/tomcat/util/http/fileupload/MultipartStream$ProgressNotifier;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/fileupload/MultipartStream$ProgressNotifier", "noteBytesRead", "(I)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "this$0", "Lorg/apache/tomcat/util/http/fileupload/MultipartStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$000", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;)I", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/fileupload/MultipartStream", "access$002", "(Lorg/apache/tomcat/util/http/fileupload/MultipartStream;I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "findSeparator", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "available", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFGT, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "pos", "I");
methodVisitor.visitInsn(ICONST_M1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isClosed", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/fileupload/MultipartStream$ItemInputStream", "closed", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
