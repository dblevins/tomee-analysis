package asm.org.apache.coyote.ajp;
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
public class AjpProcessor$SocketOutputBufferDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/coyote/ajp/AjpProcessor$SocketOutputBuffer", null, "java/lang/Object", new String[] { "org/apache/coyote/OutputBuffer" });

classWriter.visitInnerClass("org/apache/coyote/ajp/AjpProcessor$SocketOutputBuffer", "org/apache/coyote/ajp/AjpProcessor", "SocketOutputBuffer", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/coyote/ajp/AjpProcessor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/coyote/ajp/AjpProcessor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/ajp/AjpProcessor$SocketOutputBuffer", "this$0", "Lorg/apache/coyote/ajp/AjpProcessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doWrite", "(Ljava/nio/ByteBuffer;)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/ajp/AjpProcessor$SocketOutputBuffer", "this$0", "Lorg/apache/coyote/ajp/AjpProcessor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/ajp/AjpProcessor", "access$300", "(Lorg/apache/coyote/ajp/AjpProcessor;)Lorg/apache/coyote/Response;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/Response", "isCommitted", "()Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/ajp/AjpProcessor$SocketOutputBuffer", "this$0", "Lorg/apache/coyote/ajp/AjpProcessor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/ajp/AjpProcessor", "prepareResponse", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/ajp/AjpProcessor$SocketOutputBuffer", "this$0", "Lorg/apache/coyote/ajp/AjpProcessor;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ErrorState", "CLOSE_CONNECTION_NOW", "Lorg/apache/coyote/ErrorState;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/ajp/AjpProcessor", "access$400", "(Lorg/apache/coyote/ajp/AjpProcessor;Lorg/apache/coyote/ErrorState;Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/ajp/AjpProcessor$SocketOutputBuffer", "this$0", "Lorg/apache/coyote/ajp/AjpProcessor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/ajp/AjpProcessor", "access$500", "(Lorg/apache/coyote/ajp/AjpProcessor;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/ajp/AjpProcessor$SocketOutputBuffer", "this$0", "Lorg/apache/coyote/ajp/AjpProcessor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/ajp/AjpProcessor", "access$600", "(Lorg/apache/coyote/ajp/AjpProcessor;Ljava/nio/ByteBuffer;)V", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/coyote/ajp/AjpProcessor$SocketOutputBuffer", "java/nio/ByteBuffer", Opcodes.INTEGER}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/ajp/AjpProcessor$SocketOutputBuffer", "this$0", "Lorg/apache/coyote/ajp/AjpProcessor;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ErrorState", "CLOSE_CONNECTION_NOW", "Lorg/apache/coyote/ErrorState;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/ajp/AjpProcessor", "access$700", "(Lorg/apache/coyote/ajp/AjpProcessor;Lorg/apache/coyote/ErrorState;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBytesWritten", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/ajp/AjpProcessor$SocketOutputBuffer", "this$0", "Lorg/apache/coyote/ajp/AjpProcessor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/ajp/AjpProcessor", "access$800", "(Lorg/apache/coyote/ajp/AjpProcessor;)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
