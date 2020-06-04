package asm.org.apache.activemq.store.kahadb;
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
public class KahaDBStore$StoreQueueTaskDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", null, "java/lang/Object", new String[] { "java/lang/Runnable", "org/apache/activemq/store/kahadb/KahaDBStore$StoreTask" });

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "org/apache/activemq/store/kahadb/KahaDBStore", "StoreQueueTask", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask$InnerFutureTask", "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "InnerFutureTask", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "org/apache/activemq/store/kahadb/KahaDBStore", "KahaDBMessageStore", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$StoreTask", "org/apache/activemq/store/kahadb/KahaDBStore", "StoreTask", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "message", "Lorg/apache/activemq/command/Message;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "context", "Lorg/apache/activemq/broker/ConnectionContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "store", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "future", "Lorg/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask$InnerFutureTask;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "done", "Ljava/util/concurrent/atomic/AtomicBoolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "locked", "Ljava/util/concurrent/atomic/AtomicBoolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/KahaDBStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/store/kahadb/KahaDBStore;Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "this$0", "Lorg/apache/activemq/store/kahadb/KahaDBStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicBoolean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicBoolean", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "done", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicBoolean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicBoolean", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "locked", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "store", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "context", "Lorg/apache/activemq/broker/ConnectionContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask$InnerFutureTask");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask$InnerFutureTask", "<init>", "(Lorg/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask;Ljava/lang/Runnable;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "future", "Lorg/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask$InnerFutureTask;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFuture", "()Lorg/apache/activemq/store/ListenableFuture;", "()Lorg/apache/activemq/store/ListenableFuture<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "future", "Lorg/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask$InnerFutureTask;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cancel", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "done", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicBoolean", "compareAndSet", "(ZZ)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "future", "Lorg/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask$InnerFutureTask;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask$InnerFutureTask", "cancel", "(Z)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "aquireLocks", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/InterruptedException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "locked", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicBoolean", "compareAndSet", "(ZZ)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "this$0", "Lorg/apache/activemq/store/kahadb/KahaDBStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "globalQueueSemaphore", "Ljava/util/concurrent/Semaphore;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/Semaphore", "acquire", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "store", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "acquireLocalAsyncLock", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "incrementReferenceCount", "()I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InterruptedException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Failed to aquire lock");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "releaseLocks", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "locked", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicBoolean", "compareAndSet", "(ZZ)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "store", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "releaseLocalAsyncLock", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "this$0", "Lorg/apache/activemq/store/kahadb/KahaDBStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "globalQueueSemaphore", "Ljava/util/concurrent/Semaphore;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/Semaphore", "release", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "decrementReferenceCount", "()I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "store", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "doneTasks", "D");
methodVisitor.visitInsn(DCONST_1);
methodVisitor.visitInsn(DADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "doneTasks", "D");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "done", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicBoolean", "compareAndSet", "(ZZ)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "store", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "context", "Lorg/apache/activemq/broker/ConnectionContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "addMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "this$0", "Lorg/apache/activemq/store/kahadb/KahaDBStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "store", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "removeQueueTask", "(Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;Lorg/apache/activemq/command/MessageId;)Lorg/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "future", "Lorg/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask$InnerFutureTask;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask$InnerFutureTask", "complete", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore", "cancelledTaskModMetric", "I");
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "store", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "canceledTasks", "D");
methodVisitor.visitInsn(DCONST_1);
methodVisitor.visitInsn(DADD);
methodVisitor.visitInsn(DUP2_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "canceledTasks", "D");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore", "cancelledTaskModMetric", "I");
methodVisitor.visitInsn(I2D);
methodVisitor.visitInsn(DREM);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitInsn(DCMPL);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "store", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "dest", "Lorg/apache/activemq/store/kahadb/data/KahaDestination;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" cancelled: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "store", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "canceledTasks", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "store", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "doneTasks", "D");
methodVisitor.visitInsn(DDIV);
methodVisitor.visitLdcInsn(new Double("100.0"));
methodVisitor.visitInsn(DMUL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(D)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "store", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "store", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;");
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitInsn(DUP2_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "doneTasks", "D");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "canceledTasks", "D");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "future", "Lorg/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask$InnerFutureTask;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask$InnerFutureTask", "setException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "this$0", "Lorg/apache/activemq/store/kahadb/KahaDBStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "store", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "removeQueueTask", "(Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;Lorg/apache/activemq/command/MessageId;)Lorg/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getMessage", "()Lorg/apache/activemq/command/Message;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
