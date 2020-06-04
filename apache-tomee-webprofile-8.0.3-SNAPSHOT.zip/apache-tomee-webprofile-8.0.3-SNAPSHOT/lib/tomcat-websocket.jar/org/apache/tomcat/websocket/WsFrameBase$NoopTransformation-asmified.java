package asm.org.apache.tomcat.websocket;
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
public class WsFrameBase$NoopTransformationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", null, "org/apache/tomcat/websocket/WsFrameBase$TerminalTransformation", null);

classWriter.visitInnerClass("org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", "org/apache/tomcat/websocket/WsFrameBase", "NoopTransformation", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/tomcat/websocket/WsFrameBase$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/tomcat/websocket/WsFrameBase$TerminalTransformation", "org/apache/tomcat/websocket/WsFrameBase", "TerminalTransformation", ACC_PRIVATE | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/tomcat/websocket/WsFrameBase;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsFrameBase$TerminalTransformation", "<init>", "(Lorg/apache/tomcat/websocket/WsFrameBase;Lorg/apache/tomcat/websocket/WsFrameBase$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMoreData", "(BZILjava/nio/ByteBuffer;)Lorg/apache/tomcat/websocket/TransformationResult;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameBase", "access$300", "(Lorg/apache/tomcat/websocket/WsFrameBase;)J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameBase", "access$400", "(Lorg/apache/tomcat/websocket/WsFrameBase;)J", false);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase", "inputBuffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(JJ)J", false);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(JJ)J", false);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase", "inputBuffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "limit", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase", "inputBuffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase", "inputBuffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "()I", false);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "limit", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase", "inputBuffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase", "inputBuffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "limit", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameBase", "access$400", "(Lorg/apache/tomcat/websocket/WsFrameBase;)J", false);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitInsn(LADD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameBase", "access$402", "(Lorg/apache/tomcat/websocket/WsFrameBase;J)J", false);
methodVisitor.visitInsn(POP2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameBase", "access$400", "(Lorg/apache/tomcat/websocket/WsFrameBase;)J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameBase", "access$300", "(Lorg/apache/tomcat/websocket/WsFrameBase;)J", false);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/TransformationResult", "END_OF_FRAME", "Lorg/apache/tomcat/websocket/TransformationResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.LONG, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase", "inputBuffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/TransformationResult", "UNDERFLOW", "Lorg/apache/tomcat/websocket/TransformationResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/TransformationResult", "OVERFLOW", "Lorg/apache/tomcat/websocket/TransformationResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sendMessagePart", "(Ljava/util/List;)Ljava/util/List;", "(Ljava/util/List<Lorg/apache/tomcat/websocket/MessagePart;>;)Ljava/util/List<Lorg/apache/tomcat/websocket/MessagePart;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/tomcat/websocket/WsFrameBase;Lorg/apache/tomcat/websocket/WsFrameBase$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsFrameBase$NoopTransformation", "<init>", "(Lorg/apache/tomcat/websocket/WsFrameBase;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
