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
public class WsFrameBase$UnmaskTransformationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", null, "org/apache/tomcat/websocket/WsFrameBase$TerminalTransformation", null);

classWriter.visitInnerClass("org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", "org/apache/tomcat/websocket/WsFrameBase", "UnmaskTransformation", ACC_PRIVATE | ACC_FINAL);

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
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
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
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameBase", "access$400", "(Lorg/apache/tomcat/websocket/WsFrameBase;)J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameBase", "access$300", "(Lorg/apache/tomcat/websocket/WsFrameBase;)J", false);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase", "inputBuffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "hasRemaining", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase", "inputBuffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "get", "()B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameBase", "access$500", "(Lorg/apache/tomcat/websocket/WsFrameBase;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameBase", "access$600", "(Lorg/apache/tomcat/websocket/WsFrameBase;)I", false);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(I2B);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameBase", "access$608", "(Lorg/apache/tomcat/websocket/WsFrameBase;)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameBase", "access$600", "(Lorg/apache/tomcat/websocket/WsFrameBase;)I", false);
methodVisitor.visitInsn(ICONST_4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameBase", "access$602", "(Lorg/apache/tomcat/websocket/WsFrameBase;I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameBase", "access$408", "(Lorg/apache/tomcat/websocket/WsFrameBase;)J", false);
methodVisitor.visitInsn(POP2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "(B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameBase", "access$400", "(Lorg/apache/tomcat/websocket/WsFrameBase;)J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameBase", "access$300", "(Lorg/apache/tomcat/websocket/WsFrameBase;)J", false);
methodVisitor.visitInsn(LCMP);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/TransformationResult", "END_OF_FRAME", "Lorg/apache/tomcat/websocket/TransformationResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", "this$0", "Lorg/apache/tomcat/websocket/WsFrameBase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase", "inputBuffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/TransformationResult", "UNDERFLOW", "Lorg/apache/tomcat/websocket/TransformationResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/TransformationResult", "OVERFLOW", "Lorg/apache/tomcat/websocket/TransformationResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsFrameBase$UnmaskTransformation", "<init>", "(Lorg/apache/tomcat/websocket/WsFrameBase;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
