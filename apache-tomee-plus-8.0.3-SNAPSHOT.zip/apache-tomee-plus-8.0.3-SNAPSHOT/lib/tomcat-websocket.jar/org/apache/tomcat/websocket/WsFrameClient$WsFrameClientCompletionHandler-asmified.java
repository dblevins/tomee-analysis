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
public class WsFrameClient$WsFrameClientCompletionHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "Ljava/lang/Object;Ljava/nio/channels/CompletionHandler<Ljava/lang/Integer;Ljava/lang/Void;>;", "java/lang/Object", new String[] { "java/nio/channels/CompletionHandler" });

classWriter.visitInnerClass("org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "org/apache/tomcat/websocket/WsFrameClient", "WsFrameClientCompletionHandler", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/tomcat/websocket/WsFrameClient$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/tomcat/websocket/WsFrameBase$ReadState", "org/apache/tomcat/websocket/WsFrameBase", "ReadState", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/websocket/WsFrameClient;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/tomcat/websocket/WsFrameClient;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "this$0", "Lorg/apache/tomcat/websocket/WsFrameClient;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "completed", "(Ljava/lang/Integer;Ljava/lang/Void;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "this$0", "Lorg/apache/tomcat/websocket/WsFrameClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/WsFrameClient", "isOpen", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "this$0", "Lorg/apache/tomcat/websocket/WsFrameClient;");
methodVisitor.visitTypeInsn(NEW, "java/io/EOFException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/EOFException", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameClient", "access$100", "(Lorg/apache/tomcat/websocket/WsFrameClient;Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "this$0", "Lorg/apache/tomcat/websocket/WsFrameClient;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameClient", "access$200", "(Lorg/apache/tomcat/websocket/WsFrameClient;)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "flip", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "doResumeProcessing", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "failed", "(Ljava/lang/Throwable;Ljava/lang/Void;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/tomcat/websocket/ReadBufferOverflowException");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "this$0", "Lorg/apache/tomcat/websocket/WsFrameClient;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/websocket/ReadBufferOverflowException");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/ReadBufferOverflowException", "getMinBufferSize", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "allocate", "(I)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameClient", "access$202", "(Lorg/apache/tomcat/websocket/WsFrameClient;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "this$0", "Lorg/apache/tomcat/websocket/WsFrameClient;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameClient", "access$200", "(Lorg/apache/tomcat/websocket/WsFrameClient;)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "flip", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "doResumeProcessing", "(Z)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "this$0", "Lorg/apache/tomcat/websocket/WsFrameClient;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameClient", "access$100", "(Lorg/apache/tomcat/websocket/WsFrameClient;Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "doResumeProcessing", "(Z)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsFrameClient$1", "$SwitchMap$org$apache$tomcat$websocket$WsFrameBase$ReadState", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "this$0", "Lorg/apache/tomcat/websocket/WsFrameClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/WsFrameClient", "getReadState", "()Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
methodVisitor.visitLookupSwitchInsn(label3, new int[] { 3, 4 }, new Label[] { label1, label2 });
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "this$0", "Lorg/apache/tomcat/websocket/WsFrameClient;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "PROCESSING", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "WAITING", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/WsFrameClient", "changeReadState", "(Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "this$0", "Lorg/apache/tomcat/websocket/WsFrameClient;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameClient", "access$300", "(Lorg/apache/tomcat/websocket/WsFrameClient;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "this$0", "Lorg/apache/tomcat/websocket/WsFrameClient;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "SUSPENDING_PROCESS", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "SUSPENDED", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/WsFrameClient", "changeReadState", "(Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/WsFrameClient", "access$400", "()Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitLdcInsn("wsFrame.illegalReadState");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "this$0", "Lorg/apache/tomcat/websocket/WsFrameClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/WsFrameClient", "getReadState", "()Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "failed", "(Ljava/lang/Throwable;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Void");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "failed", "(Ljava/lang/Throwable;Ljava/lang/Void;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "completed", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Void");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "completed", "(Ljava/lang/Integer;Ljava/lang/Void;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/tomcat/websocket/WsFrameClient;Lorg/apache/tomcat/websocket/WsFrameClient$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsFrameClient$WsFrameClientCompletionHandler", "<init>", "(Lorg/apache/tomcat/websocket/WsFrameClient;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
