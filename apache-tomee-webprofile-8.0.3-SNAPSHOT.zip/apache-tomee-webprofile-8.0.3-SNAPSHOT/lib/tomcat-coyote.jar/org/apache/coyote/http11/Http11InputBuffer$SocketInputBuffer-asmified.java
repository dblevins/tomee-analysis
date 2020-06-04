package asm.org.apache.coyote.http11;
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
public class Http11InputBuffer$SocketInputBufferDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/coyote/http11/Http11InputBuffer$SocketInputBuffer", null, "java/lang/Object", new String[] { "org/apache/coyote/InputBuffer" });

classWriter.visitInnerClass("org/apache/coyote/http11/Http11InputBuffer$SocketInputBuffer", "org/apache/coyote/http11/Http11InputBuffer", "SocketInputBuffer", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/coyote/http11/Http11InputBuffer$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/coyote/http11/Http11InputBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/coyote/http11/Http11InputBuffer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http11/Http11InputBuffer$SocketInputBuffer", "this$0", "Lorg/apache/coyote/http11/Http11InputBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doRead", "(Lorg/apache/tomcat/util/net/ApplicationBufferHandler;)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http11/Http11InputBuffer$SocketInputBuffer", "this$0", "Lorg/apache/coyote/http11/Http11InputBuffer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http11/Http11InputBuffer", "access$200", "(Lorg/apache/coyote/http11/Http11InputBuffer;)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http11/Http11InputBuffer$SocketInputBuffer", "this$0", "Lorg/apache/coyote/http11/Http11InputBuffer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http11/Http11InputBuffer", "access$200", "(Lorg/apache/coyote/http11/Http11InputBuffer;)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "limit", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http11/Http11InputBuffer$SocketInputBuffer", "this$0", "Lorg/apache/coyote/http11/Http11InputBuffer;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http11/Http11InputBuffer", "access$300", "(Lorg/apache/coyote/http11/Http11InputBuffer;Z)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http11/Http11InputBuffer$SocketInputBuffer", "this$0", "Lorg/apache/coyote/http11/Http11InputBuffer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http11/Http11InputBuffer", "access$200", "(Lorg/apache/coyote/http11/Http11InputBuffer;)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http11/Http11InputBuffer$SocketInputBuffer", "this$0", "Lorg/apache/coyote/http11/Http11InputBuffer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http11/Http11InputBuffer", "access$200", "(Lorg/apache/coyote/http11/Http11InputBuffer;)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "duplicate", "()Ljava/nio/ByteBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/util/net/ApplicationBufferHandler", "setByteBuffer", "(Ljava/nio/ByteBuffer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http11/Http11InputBuffer$SocketInputBuffer", "this$0", "Lorg/apache/coyote/http11/Http11InputBuffer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http11/Http11InputBuffer", "access$200", "(Lorg/apache/coyote/http11/Http11InputBuffer;)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http11/Http11InputBuffer$SocketInputBuffer", "this$0", "Lorg/apache/coyote/http11/Http11InputBuffer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http11/Http11InputBuffer", "access$200", "(Lorg/apache/coyote/http11/Http11InputBuffer;)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "limit", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/coyote/http11/Http11InputBuffer;Lorg/apache/coyote/http11/Http11InputBuffer$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http11/Http11InputBuffer$SocketInputBuffer", "<init>", "(Lorg/apache/coyote/http11/Http11InputBuffer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
