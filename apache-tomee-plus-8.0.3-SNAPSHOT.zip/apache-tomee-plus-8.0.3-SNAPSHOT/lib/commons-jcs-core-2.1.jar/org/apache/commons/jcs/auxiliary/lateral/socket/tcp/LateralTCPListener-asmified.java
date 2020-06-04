package asm.org.apache.commons.jcs.auxiliary.lateral.socket.tcp;
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
public class LateralTCPListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/commons/jcs/auxiliary/lateral/behavior/ILateralCacheListener<TK;TV;>;Lorg/apache/commons/jcs/engine/behavior/IShutdownObserver;", "java/lang/Object", new String[] { "org/apache/commons/jcs/auxiliary/lateral/behavior/ILateralCacheListener", "org/apache/commons/jcs/engine/behavior/IShutdownObserver" });

classWriter.visitInnerClass("org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener$1", "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener$ConnectionHandler", "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "ConnectionHandler", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener$ListenerThread", "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "ListenerThread", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/commons/logging/Log;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "acceptTimeOut", "I", null, new Integer(1000));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "cacheManager", "Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "instances", "Ljava/util/HashMap;", "Ljava/util/HashMap<Ljava/lang/String;Lorg/apache/commons/jcs/auxiliary/lateral/behavior/ILateralCacheListener<**>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "receiver", "Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener$ListenerThread;", "Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener<TK;TV;>.ListenerThread;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "tcpLateralCacheAttributes", "Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "port", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "pooledExecutor", "Ljava/util/concurrent/ExecutorService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "putCnt", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "removeCnt", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "getCnt", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "listenerId", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "shutdown", "Ljava/util/concurrent/atomic/AtomicBoolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "terminated", "Ljava/util/concurrent/atomic/AtomicBoolean;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_SYNCHRONIZED, "getInstance", "(Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;)Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;)Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "instances", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes", "getTcpListenerPort", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "<init>", "(Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "init", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "setCacheManager", "(Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "instances", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes", "getTcpListenerPort", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isInfoEnabled", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Created new listener ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes", "getTcpListenerPort", "()I", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "info", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "putCnt", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "removeCnt", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getCnt", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/CacheInfo", "listenerId", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "listenerId", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "setTcpLateralCacheAttributes", "(Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "init", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getTcpLateralCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes", "getTcpListenerPort", "()I", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "port", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/utils/threadpool/DaemonThreadFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JCS-LateralTCPListener-");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/utils/threadpool/DaemonThreadFactory", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/concurrent/Executors", "newCachedThreadPool", "(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "pooledExecutor", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicBoolean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicBoolean", "<init>", "(Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "terminated", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicBoolean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicBoolean", "<init>", "(Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "shutdown", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Listening on port ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "port", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "info", "(Ljava/lang/Object;)V", true);
methodVisitor.visitTypeInsn(NEW, "java/net/ServerSocket");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "port", "I");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/ServerSocket", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/ServerSocket", "setSoTimeout", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener$ListenerThread");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener$ListenerThread", "<init>", "(Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener;Ljava/net/ServerSocket;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "receiver", "Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener$ListenerThread;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "receiver", "Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener$ListenerThread;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener$ListenerThread", "setDaemon", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "receiver", "Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener$ListenerThread;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener$ListenerThread", "start", "()V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setListenerId", "(J)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "listenerId", "J");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("set listenerId = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getListenerId", "()J", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "listenerId", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handlePut", "(Lorg/apache/commons/jcs/engine/behavior/ICacheElement;)V", "(Lorg/apache/commons/jcs/engine/behavior/ICacheElement<TK;TV;>;)V", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "putCnt", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "putCnt", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isInfoEnabled", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getPutCnt", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitInsn(IREM);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Put Count (port ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getTcpLateralCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes", "getTcpListenerPort", "()I", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(") = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getPutCnt", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "info", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("handlePut> cacheName=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/behavior/ICacheElement", "getCacheName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(", key=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/behavior/ICacheElement", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/behavior/ICacheElement", "getCacheName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getCache", "(Ljava/lang/String;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCache", "localUpdate", "(Lorg/apache/commons/jcs/engine/behavior/ICacheElement;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleRemove", "(Ljava/lang/String;Ljava/lang/Object;)V", "(Ljava/lang/String;TK;)V", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "removeCnt", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "removeCnt", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isInfoEnabled", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getRemoveCnt", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitInsn(IREM);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Remove Count = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getRemoveCnt", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "info", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("handleRemove> cacheName=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(", key=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getCache", "(Ljava/lang/String;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCache", "localRemove", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleRemoveAll", "(Ljava/lang/String;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("handleRemoveAll> cacheName=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getCache", "(Ljava/lang/String;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCache", "localRemoveAll", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleGet", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/jcs/engine/behavior/ICacheElement;", "(Ljava/lang/String;TK;)Lorg/apache/commons/jcs/engine/behavior/ICacheElement<TK;TV;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getCnt", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getCnt", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isInfoEnabled", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getGetCnt", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitInsn(IREM);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Get Count (port ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getTcpLateralCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes", "getTcpListenerPort", "()I", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(") = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getGetCnt", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "info", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("handleGet> cacheName=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(", key = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getCache", "(Ljava/lang/String;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCache", "localGet", "(Ljava/lang/Object;)Lorg/apache/commons/jcs/engine/behavior/ICacheElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleGetMatching", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map<TK;Lorg/apache/commons/jcs/engine/behavior/ICacheElement<TK;TV;>;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getCnt", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getCnt", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isInfoEnabled", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getGetCnt", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitInsn(IREM);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("GetMatching Count (port ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getTcpLateralCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes", "getTcpListenerPort", "()I", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(") = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getGetCnt", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "info", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("handleGetMatching> cacheName=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(", pattern = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getCache", "(Ljava/lang/String;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCache", "localGetMatching", "(Ljava/lang/String;)Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleGetKeySet", "(Ljava/lang/String;)Ljava/util/Set;", "(Ljava/lang/String;)Ljava/util/Set<TK;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getCache", "(Ljava/lang/String;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCache", "getKeySet", "(Z)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleDispose", "(Ljava/lang/String;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isInfoEnabled", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("handleDispose > cacheName=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" | Ignoring message.  Do not dispose from remote.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "info", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "terminated", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicBoolean", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "dispose", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "terminated", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicBoolean", "set", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "notify", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "pooledExecutor", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ExecutorService", "shutdownNow", "()Ljava/util/List;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getCache", "(Ljava/lang/String;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", "(Ljava/lang/String;)Lorg/apache/commons/jcs/engine/control/CompositeCache<TK;TV;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/commons/jcs/access/exception/CacheException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getCacheManager", "()Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/engine/control/CompositeCacheManager", "getInstance", "()Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "setCacheManager", "(Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;)V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/commons/jcs/access/exception/CacheException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Could not retrieve cache manager instance");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("cacheMgr = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getCacheManager", "()Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getCacheManager", "()Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/behavior/ICompositeCacheManager", "getCache", "(Ljava/lang/String;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPutCnt", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "putCnt", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGetCnt", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "getCnt", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRemoveCnt", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "removeCnt", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCacheManager", "(Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "cacheManager", "Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCacheManager", "()Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "cacheManager", "Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTcpLateralCacheAttributes", "(Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "tcpLateralCacheAttributes", "Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTcpLateralCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "tcpLateralCacheAttributes", "Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "shutdown", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "shutdown", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicBoolean", "compareAndSet", "(ZZ)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isInfoEnabled", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitLdcInsn("Shutting down TCP Lateral receiver.");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "info", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "receiver", "Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener$ListenerThread;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener$ListenerThread", "interrupt", "()V", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitLdcInsn("Shutdown already called.");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "()Lorg/apache/commons/logging/Log;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener;)Ljava/util/concurrent/atomic/AtomicBoolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "terminated", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener;)Ljava/util/concurrent/ExecutorService;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "pooledExecutor", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/auxiliary/lateral/socket/tcp/LateralTCPListener", "instances", "Ljava/util/HashMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
