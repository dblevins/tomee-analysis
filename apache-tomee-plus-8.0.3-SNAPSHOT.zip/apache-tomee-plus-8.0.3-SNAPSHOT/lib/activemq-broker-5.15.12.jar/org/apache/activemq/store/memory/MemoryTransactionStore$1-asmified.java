package asm.org.apache.activemq.store.memory;
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
public class MemoryTransactionStore$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/memory/MemoryTransactionStore$1", null, "org/apache/activemq/store/ProxyMessageStore", null);

classWriter.visitOuterClass("org/apache/activemq/store/memory/MemoryTransactionStore", "proxy", "(Lorg/apache/activemq/store/MessageStore;)Lorg/apache/activemq/store/MessageStore;");

classWriter.visitInnerClass("org/apache/activemq/store/memory/MemoryTransactionStore$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/memory/MemoryTransactionStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/memory/MemoryTransactionStore;Lorg/apache/activemq/store/MessageStore;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/memory/MemoryTransactionStore$1", "this$0", "Lorg/apache/activemq/store/memory/MemoryTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/ProxyMessageStore", "<init>", "(Lorg/apache/activemq/store/MessageStore;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/memory/MemoryTransactionStore$1", "this$0", "Lorg/apache/activemq/store/memory/MemoryTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/memory/MemoryTransactionStore$1", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/memory/MemoryTransactionStore", "addMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/Message;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;Z)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/memory/MemoryTransactionStore$1", "this$0", "Lorg/apache/activemq/store/memory/MemoryTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/memory/MemoryTransactionStore$1", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/memory/MemoryTransactionStore", "addMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/Message;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asyncAddQueueMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;)Lorg/apache/activemq/store/ListenableFuture;", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;)Lorg/apache/activemq/store/ListenableFuture<Ljava/lang/Object;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/memory/MemoryTransactionStore$1", "this$0", "Lorg/apache/activemq/store/memory/MemoryTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/memory/MemoryTransactionStore$1", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/memory/MemoryTransactionStore", "addMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/Message;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/InlineListenableFuture");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/InlineListenableFuture", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asyncAddQueueMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;Z)Lorg/apache/activemq/store/ListenableFuture;", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;Z)Lorg/apache/activemq/store/ListenableFuture<Ljava/lang/Object;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/memory/MemoryTransactionStore$1", "this$0", "Lorg/apache/activemq/store/memory/MemoryTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/memory/MemoryTransactionStore$1", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/memory/MemoryTransactionStore", "addMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/Message;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/InlineListenableFuture");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/InlineListenableFuture", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/MessageAck;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/memory/MemoryTransactionStore$1", "this$0", "Lorg/apache/activemq/store/memory/MemoryTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/memory/MemoryTransactionStore$1", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/memory/MemoryTransactionStore", "removeMessage", "(Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/MessageAck;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeAsyncMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/MessageAck;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/memory/MemoryTransactionStore$1", "this$0", "Lorg/apache/activemq/store/memory/MemoryTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/memory/MemoryTransactionStore$1", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/memory/MemoryTransactionStore", "removeMessage", "(Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/MessageAck;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
