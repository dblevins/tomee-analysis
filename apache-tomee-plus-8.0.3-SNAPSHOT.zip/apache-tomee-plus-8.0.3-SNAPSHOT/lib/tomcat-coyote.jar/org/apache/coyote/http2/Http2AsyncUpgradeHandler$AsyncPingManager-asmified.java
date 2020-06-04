package asm.org.apache.coyote.http2;
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
public class Http2AsyncUpgradeHandler$AsyncPingManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", null, "org/apache/coyote/http2/Http2UpgradeHandler$PingManager", null);

classWriter.visitInnerClass("org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", "org/apache/coyote/http2/Http2AsyncUpgradeHandler", "AsyncPingManager", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/coyote/http2/Http2UpgradeHandler$PingRecord", "org/apache/coyote/http2/Http2UpgradeHandler", "PingRecord", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/coyote/http2/Http2UpgradeHandler$PingManager", "org/apache/coyote/http2/Http2UpgradeHandler", "PingManager", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/tomcat/util/net/SocketWrapperBase$BlockingMode", "org/apache/tomcat/util/net/SocketWrapperBase", "BlockingMode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomcat/util/net/SocketWrapperBase$CompletionCheck", "org/apache/tomcat/util/net/SocketWrapperBase", "CompletionCheck", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/tomcat/util/net/SocketWrapperBase$CompletionState", "org/apache/tomcat/util/net/SocketWrapperBase", "CompletionState", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/coyote/http2/Http2AsyncUpgradeHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/coyote/http2/Http2AsyncUpgradeHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", "this$0", "Lorg/apache/coyote/http2/Http2AsyncUpgradeHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2UpgradeHandler$PingManager", "<init>", "(Lorg/apache/coyote/http2/Http2UpgradeHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sendPing", "(Z)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", "initiateDisabled", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "nanoTime", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", "lastPingNanoTime", "J");
methodVisitor.visitInsn(LSUB);
methodVisitor.visitLdcInsn(new Long(10000000000L));
methodVisitor.visitInsn(LCMP);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFLE, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", "lastPingNanoTime", "J");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", "sequence", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", "sequence", "I");
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Http2UpgradeHandler$PingRecord");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2UpgradeHandler$PingRecord", "<init>", "(IJ)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", "inflightPings", "Ljava/util/Queue;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Queue", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http2/ByteUtil", "set31Bits", "([BII)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", "this$0", "Lorg/apache/coyote/http2/Http2AsyncUpgradeHandler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketWrapperBase$BlockingMode", "SEMI_BLOCK", "Lorg/apache/tomcat/util/net/SocketWrapperBase$BlockingMode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", "this$0", "Lorg/apache/coyote/http2/Http2AsyncUpgradeHandler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler", "protocol", "Lorg/apache/coyote/http2/Http2Protocol;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/Http2Protocol", "getWriteTimeout", "()J", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "MILLISECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketWrapperBase", "COMPLETE_WRITE", "Lorg/apache/tomcat/util/net/SocketWrapperBase$CompletionCheck;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", "this$0", "Lorg/apache/coyote/http2/Http2AsyncUpgradeHandler;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http2/Http2AsyncUpgradeHandler", "access$500", "(Lorg/apache/coyote/http2/Http2AsyncUpgradeHandler;)Ljava/nio/channels/CompletionHandler;", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/nio/ByteBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2UpgradeHandler", "PING", "[B");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "wrap", "([B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "wrap", "([B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SocketWrapperBase", "write", "(Lorg/apache/tomcat/util/net/SocketWrapperBase$BlockingMode;JLjava/util/concurrent/TimeUnit;Ljava/lang/Object;Lorg/apache/tomcat/util/net/SocketWrapperBase$CompletionCheck;Ljava/nio/channels/CompletionHandler;[Ljava/nio/ByteBuffer;)Lorg/apache/tomcat/util/net/SocketWrapperBase$CompletionState;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", "this$0", "Lorg/apache/coyote/http2/Http2AsyncUpgradeHandler;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http2/Http2AsyncUpgradeHandler", "access$300", "(Lorg/apache/coyote/http2/Http2AsyncUpgradeHandler;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(12, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "receivePing", "([BZ)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2UpgradeHandler$PingManager", "receivePing", "([BZ)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", "this$0", "Lorg/apache/coyote/http2/Http2AsyncUpgradeHandler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketWrapperBase$BlockingMode", "SEMI_BLOCK", "Lorg/apache/tomcat/util/net/SocketWrapperBase$BlockingMode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", "this$0", "Lorg/apache/coyote/http2/Http2AsyncUpgradeHandler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler", "protocol", "Lorg/apache/coyote/http2/Http2Protocol;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/Http2Protocol", "getWriteTimeout", "()J", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "MILLISECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketWrapperBase", "COMPLETE_WRITE", "Lorg/apache/tomcat/util/net/SocketWrapperBase$CompletionCheck;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", "this$0", "Lorg/apache/coyote/http2/Http2AsyncUpgradeHandler;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http2/Http2AsyncUpgradeHandler", "access$500", "(Lorg/apache/coyote/http2/Http2AsyncUpgradeHandler;)Ljava/nio/channels/CompletionHandler;", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/nio/ByteBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2UpgradeHandler", "PING_ACK", "[B");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "wrap", "([B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "wrap", "([B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SocketWrapperBase", "write", "(Lorg/apache/tomcat/util/net/SocketWrapperBase$BlockingMode;JLjava/util/concurrent/TimeUnit;Ljava/lang/Object;Lorg/apache/tomcat/util/net/SocketWrapperBase$CompletionCheck;Ljava/nio/channels/CompletionHandler;[Ljava/nio/ByteBuffer;)Lorg/apache/tomcat/util/net/SocketWrapperBase$CompletionState;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2AsyncUpgradeHandler$AsyncPingManager", "this$0", "Lorg/apache/coyote/http2/Http2AsyncUpgradeHandler;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http2/Http2AsyncUpgradeHandler", "access$300", "(Lorg/apache/coyote/http2/Http2AsyncUpgradeHandler;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(12, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
