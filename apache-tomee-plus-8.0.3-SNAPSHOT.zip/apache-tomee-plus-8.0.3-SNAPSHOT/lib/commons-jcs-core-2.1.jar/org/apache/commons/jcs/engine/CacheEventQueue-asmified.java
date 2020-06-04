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
public class CacheEventQueueDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/engine/CacheEventQueue", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lorg/apache/commons/jcs/engine/AbstractCacheEventQueue<TK;TV;>;", "org/apache/commons/jcs/engine/AbstractCacheEventQueue", null);

classWriter.visitInnerClass("org/apache/commons/jcs/engine/CacheEventQueue$QProcessor", "org/apache/commons/jcs/engine/CacheEventQueue", "QProcessor", ACC_PROTECTED);

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
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "processorThread", "Ljava/lang/Thread;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "queue", "Ljava/util/concurrent/LinkedBlockingQueue;", "Ljava/util/concurrent/LinkedBlockingQueue<Lorg/apache/commons/jcs/engine/AbstractCacheEventQueue<TK;TV;>.AbstractCacheEvent;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/jcs/engine/behavior/ICacheListener;JLjava/lang/String;)V", "(Lorg/apache/commons/jcs/engine/behavior/ICacheListener<TK;TV;>;JLjava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(SIPUSH, 500);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/CacheEventQueue", "<init>", "(Lorg/apache/commons/jcs/engine/behavior/ICacheListener;JLjava/lang/String;II)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/jcs/engine/behavior/ICacheListener;JLjava/lang/String;II)V", "(Lorg/apache/commons/jcs/engine/behavior/ICacheListener<TK;TV;>;JLjava/lang/String;II)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/AbstractCacheEventQueue", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/LinkedBlockingQueue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/LinkedBlockingQueue", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/engine/CacheEventQueue", "queue", "Ljava/util/concurrent/LinkedBlockingQueue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/CacheEventQueue", "initialize", "(Lorg/apache/commons/jcs/engine/behavior/ICacheListener;JLjava/lang/String;II)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQueueType", "()Lorg/apache/commons/jcs/engine/behavior/ICacheEventQueue$QueueType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/CacheEventQueue", "queueType", "Lorg/apache/commons/jcs/engine/behavior/ICacheEventQueue$QueueType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "stopProcessing", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/CacheEventQueue", "setAlive", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/engine/CacheEventQueue", "processorThread", "Ljava/lang/Thread;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "destroy", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/CacheEventQueue", "isAlive", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/CacheEventQueue", "setAlive", "(Z)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/CacheEventQueue", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isInfoEnabled", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/CacheEventQueue", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Destroying queue, stats =  ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/CacheEventQueue", "getStatistics", "()Lorg/apache/commons/jcs/engine/stats/behavior/IStats;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "info", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/CacheEventQueue", "processorThread", "Ljava/lang/Thread;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/CacheEventQueue", "processorThread", "Ljava/lang/Thread;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "interrupt", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/engine/CacheEventQueue", "processorThread", "Ljava/lang/Thread;");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/CacheEventQueue", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isInfoEnabled", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/CacheEventQueue", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Cache event queue destroyed: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "info", "(Ljava/lang/Object;)V", true);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/CacheEventQueue", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isInfoEnabled", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/CacheEventQueue", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Destroy was called after queue was destroyed. Doing nothing. Stats =  ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/CacheEventQueue", "getStatistics", "()Lorg/apache/commons/jcs/engine/stats/behavior/IStats;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "info", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "put", "(Lorg/apache/commons/jcs/engine/AbstractCacheEventQueue$AbstractCacheEvent;)V", "(Lorg/apache/commons/jcs/engine/AbstractCacheEventQueue<TK;TV;>.AbstractCacheEvent;)V", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/CacheEventQueue", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/CacheEventQueue", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Event entering Queue for ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/CacheEventQueue", "getCacheName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(": ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/CacheEventQueue", "queue", "Ljava/util/concurrent/LinkedBlockingQueue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/LinkedBlockingQueue", "offer", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/CacheEventQueue", "isWorking", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/CacheEventQueue", "isAlive", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/CacheEventQueue", "setAlive", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/CacheEventQueue$QProcessor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/CacheEventQueue$QProcessor", "<init>", "(Lorg/apache/commons/jcs/engine/CacheEventQueue;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/engine/CacheEventQueue", "processorThread", "Ljava/lang/Thread;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/CacheEventQueue", "processorThread", "Ljava/lang/Thread;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "start", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/CacheEventQueue", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isInfoEnabled", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/CacheEventQueue", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Cache event queue created: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "info", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
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
methodVisitor.visitLdcInsn("Cache Event Queue");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/CacheEventQueue", "isWorking", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/stats/StatElement", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/stats/StatElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Alive");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/CacheEventQueue", "isAlive", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/stats/StatElement", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/stats/StatElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Empty");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/CacheEventQueue", "isEmpty", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/stats/StatElement", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/stats/StatElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Size");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/CacheEventQueue", "size", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/stats/StatElement", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/stats/behavior/IStats", "setStatElements", "(Ljava/util/List;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEmpty", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/CacheEventQueue", "queue", "Ljava/util/concurrent/LinkedBlockingQueue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/LinkedBlockingQueue", "isEmpty", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/CacheEventQueue", "queue", "Ljava/util/concurrent/LinkedBlockingQueue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/LinkedBlockingQueue", "size", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/commons/jcs/engine/CacheEventQueue;)Ljava/util/concurrent/LinkedBlockingQueue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/CacheEventQueue", "queue", "Ljava/util/concurrent/LinkedBlockingQueue;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "()Lorg/apache/commons/logging/Log;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/CacheEventQueue", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/jcs/engine/CacheEventQueue;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/engine/CacheEventQueue", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/behavior/ICacheEventQueue$QueueType", "SINGLE", "Lorg/apache/commons/jcs/engine/behavior/ICacheEventQueue$QueueType;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/engine/CacheEventQueue", "queueType", "Lorg/apache/commons/jcs/engine/behavior/ICacheEventQueue$QueueType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
