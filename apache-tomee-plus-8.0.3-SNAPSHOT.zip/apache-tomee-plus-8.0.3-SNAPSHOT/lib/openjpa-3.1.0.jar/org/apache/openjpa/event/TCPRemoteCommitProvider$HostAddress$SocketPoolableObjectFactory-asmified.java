package asm.org.apache.openjpa.event;
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
public class TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "Lorg/apache/commons/pool2/BasePooledObjectFactory<Ljava/net/Socket;>;", "org/apache/commons/pool2/BasePooledObjectFactory", null);

classWriter.visitInnerClass("org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress", "org/apache/openjpa/event/TCPRemoteCommitProvider", "HostAddress", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress", "SocketPoolableObjectFactory", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openjpa/event/TCPRemoteCommitProvider$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/Localizer$Message", "org/apache/openjpa/lib/util/Localizer", "Message", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "this$1", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/BasePooledObjectFactory", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "create", "()Ljava/net/Socket;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/PrivilegedActionException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "this$1", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress", "access$300", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;)Ljava/net/InetAddress;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "this$1", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress", "access$400", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/J2DoPrivHelper", "newSocketAction", "(Ljava/net/InetAddress;I)Ljava/security/PrivilegedExceptionAction;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/Socket");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "this$1", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress", "this$0", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider", "log", "Lorg/apache/openjpa/lib/log/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "isTraceEnabled", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "this$1", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress", "this$0", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider", "log", "Lorg/apache/openjpa/lib/log/Log;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/event/TCPRemoteCommitProvider", "access$1700", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("tcp-open-connection");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "this$1", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress", "access$300", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;)Ljava/net/InetAddress;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "this$1", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress", "access$400", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/Socket", "getLocalPort", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "trace", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/net/Socket"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory"}, 1, new Object[] {"java/security/PrivilegedActionException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getException", "()Ljava/lang/Exception;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/io/IOException");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "wrap", "(Ljava/net/Socket;)Lorg/apache/commons/pool2/PooledObject;", "(Ljava/net/Socket;)Lorg/apache/commons/pool2/PooledObject<Ljava/net/Socket;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/impl/DefaultPooledObject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/impl/DefaultPooledObject", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "destroyObject", "(Lorg/apache/commons/pool2/PooledObject;)V", "(Lorg/apache/commons/pool2/PooledObject<Ljava/net/Socket;>;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/pool2/PooledObject", "getObject", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/Socket");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "this$1", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress", "this$0", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider", "log", "Lorg/apache/openjpa/lib/log/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "isTraceEnabled", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "this$1", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress", "this$0", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider", "log", "Lorg/apache/openjpa/lib/log/Log;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/event/TCPRemoteCommitProvider", "access$1700", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("tcp-close-sending-socket");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "this$1", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress", "access$300", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;)Ljava/net/InetAddress;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "this$1", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress", "access$400", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/Socket", "getLocalPort", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "trace", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/net/Socket"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/Socket", "close", "()V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "org/apache/commons/pool2/PooledObject"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "this$1", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress", "this$0", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider", "log", "Lorg/apache/openjpa/lib/log/Log;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/event/TCPRemoteCommitProvider", "access$1700", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("tcp-close-socket-error");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "this$1", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress", "access$300", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;)Ljava/net/InetAddress;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/InetAddress", "getHostAddress", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "this$1", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress", "access$400", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "warn", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "wrap", "(Ljava/lang/Object;)Lorg/apache/commons/pool2/PooledObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/Socket");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "wrap", "(Ljava/net/Socket;)Lorg/apache/commons/pool2/PooledObject;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "create", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "create", "()Ljava/net/Socket;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;Lorg/apache/openjpa/event/TCPRemoteCommitProvider$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress$SocketPoolableObjectFactory", "<init>", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider$HostAddress;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
