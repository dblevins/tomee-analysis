package asm.org.apache.commons.jcs.engine;
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
public class PooledCacheEventQueueDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lorg/apache/commons/jcs/engine/AbstractCacheEventQueue<TK;TV;>;", "org/apache/commons/jcs/engine/AbstractCacheEventQueue", null);

classWriter.visitInnerClass("org/apache/commons/jcs/engine/behavior/ICacheEventQueue$QueueType", "org/apache/commons/jcs/engine/behavior/ICacheEventQueue", "QueueType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/commons/jcs/engine/AbstractCacheEventQueue$AbstractCacheEvent", "org/apache/commons/jcs/engine/AbstractCacheEventQueue", "AbstractCacheEvent", ACC_PROTECTED | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/commons/logging/Log;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "queueType", "Lorg/apache/commons/jcs/engine/behavior/ICacheEventQueue$QueueType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "pool", "Ljava/util/concurrent/ThreadPoolExecutor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/jcs/engine/behavior/ICacheListener;JLjava/lang/String;IILjava/lang/String;)V", "(Lorg/apache/commons/jcs/engine/behavior/ICacheListener<TK;TV;>;JLjava/lang/String;IILjava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/AbstractCacheEventQueue", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "pool", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "initialize", "(Lorg/apache/commons/jcs/engine/behavior/ICacheListener;JLjava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initialize", "(Lorg/apache/commons/jcs/engine/behavior/ICacheListener;JLjava/lang/String;IILjava/lang/String;)V", "(Lorg/apache/commons/jcs/engine/behavior/ICacheListener<TK;TV;>;JLjava/lang/String;IILjava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/AbstractCacheEventQueue", "initialize", "(Lorg/apache/commons/jcs/engine/behavior/ICacheListener;JLjava/lang/String;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/utils/threadpool/ThreadPoolManager", "getInstance", "()Lorg/apache/commons/jcs/utils/threadpool/ThreadPoolManager;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("cache_event_queue");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/commons/jcs/engine/PooledCacheEventQueue", "org/apache/commons/jcs/engine/behavior/ICacheListener", Opcodes.LONG, "java/lang/String", Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/String"}, 2, new Object[] {"org/apache/commons/jcs/engine/PooledCacheEventQueue", "org/apache/commons/jcs/utils/threadpool/ThreadPoolManager"});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/commons/jcs/engine/PooledCacheEventQueue", "org/apache/commons/jcs/engine/behavior/ICacheListener", Opcodes.LONG, "java/lang/String", Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/String"}, 3, new Object[] {"org/apache/commons/jcs/engine/PooledCacheEventQueue", "org/apache/commons/jcs/utils/threadpool/ThreadPoolManager", "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/threadpool/ThreadPoolManager", "getPool", "(Ljava/lang/String;)Ljava/util/concurrent/ThreadPoolExecutor;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "pool", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQueueType", "()Lorg/apache/commons/jcs/engine/behavior/ICacheEventQueue$QueueType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "queueType", "Lorg/apache/commons/jcs/engine/behavior/ICacheEventQueue$QueueType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "destroy", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "isAlive", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "setAlive", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "pool", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "shutdownNow", "()Ljava/util/List;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isInfoEnabled", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Cache event queue destroyed: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "info", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "put", "(Lorg/apache/commons/jcs/engine/AbstractCacheEventQueue$AbstractCacheEvent;)V", "(Lorg/apache/commons/jcs/engine/AbstractCacheEventQueue<TK;TV;>.AbstractCacheEvent;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "pool", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "execute", "(Ljava/lang/Runnable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStatistics", "()Lorg/apache/commons/jcs/engine/stats/behavior/IStats;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/stats/Stats");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/stats/Stats", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Pooled Cache Event Queue");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/stats/behavior/IStats", "setTypeName", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/stats/StatElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Working");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/AbstractCacheEventQueue", "isWorking", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/stats/StatElement", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/stats/StatElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Alive");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "isAlive", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/stats/StatElement", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/stats/StatElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Empty");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "isEmpty", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/stats/StatElement", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "pool", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "getQueue", "()Ljava/util/concurrent/BlockingQueue;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "pool", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "getQueue", "()Ljava/util/concurrent/BlockingQueue;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/stats/StatElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Queue Size");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/BlockingQueue", "size", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/stats/StatElement", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/stats/StatElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Queue Capacity");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/BlockingQueue", "remainingCapacity", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/stats/StatElement", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/commons/jcs/engine/stats/behavior/IStats", "java/util/ArrayList"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/stats/StatElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Pool Size");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "pool", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "getPoolSize", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/stats/StatElement", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/stats/StatElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Maximum Pool Size");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "pool", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "getMaximumPoolSize", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/stats/StatElement", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/stats/behavior/IStats", "setStatElements", "(Ljava/util/List;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEmpty", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "pool", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "getQueue", "()Ljava/util/concurrent/BlockingQueue;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "pool", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "getQueue", "()Ljava/util/concurrent/BlockingQueue;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/BlockingQueue", "size", "()I", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "pool", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "getQueue", "()Ljava/util/concurrent/BlockingQueue;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "pool", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "getQueue", "()Ljava/util/concurrent/BlockingQueue;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/BlockingQueue", "size", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/jcs/engine/PooledCacheEventQueue;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/behavior/ICacheEventQueue$QueueType", "POOLED", "Lorg/apache/commons/jcs/engine/behavior/ICacheEventQueue$QueueType;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/engine/PooledCacheEventQueue", "queueType", "Lorg/apache/commons/jcs/engine/behavior/ICacheEventQueue$QueueType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
