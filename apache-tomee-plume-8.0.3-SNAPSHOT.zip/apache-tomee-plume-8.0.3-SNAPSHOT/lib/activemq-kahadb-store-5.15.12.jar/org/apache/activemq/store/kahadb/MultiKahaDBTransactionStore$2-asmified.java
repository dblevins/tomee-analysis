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
public class MultiKahaDBTransactionStore$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", null, "org/apache/activemq/store/ProxyTopicMessageStore", null);

classWriter.visitOuterClass("org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "proxy", "(Lorg/apache/activemq/store/TransactionStore;Lorg/apache/activemq/store/TopicMessageStore;)Lorg/apache/activemq/store/TopicMessageStore;");

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;Lorg/apache/activemq/store/TopicMessageStore;Lorg/apache/activemq/store/TransactionStore;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/ProxyTopicMessageStore", "<init>", "(Lorg/apache/activemq/store/TopicMessageStore;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;Z)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "addMessage", "(Lorg/apache/activemq/store/TransactionStore;Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/Message;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "addMessage", "(Lorg/apache/activemq/store/TransactionStore;Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/Message;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asyncAddTopicMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;Z)Lorg/apache/activemq/store/ListenableFuture;", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;Z)Lorg/apache/activemq/store/ListenableFuture<Ljava/lang/Object;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "asyncAddTopicMessage", "(Lorg/apache/activemq/store/TransactionStore;Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/Message;)Lorg/apache/activemq/store/ListenableFuture;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asyncAddTopicMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;)Lorg/apache/activemq/store/ListenableFuture;", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;)Lorg/apache/activemq/store/ListenableFuture<Ljava/lang/Object;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "asyncAddTopicMessage", "(Lorg/apache/activemq/store/TransactionStore;Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/Message;)Lorg/apache/activemq/store/ListenableFuture;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/MessageAck;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "removeMessage", "(Lorg/apache/activemq/store/TransactionStore;Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/MessageAck;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeAsyncMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/MessageAck;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "removeAsyncMessage", "(Lorg/apache/activemq/store/TransactionStore;Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/MessageAck;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "acknowledge", "(Lorg/apache/activemq/broker/ConnectionContext;Ljava/lang/String;Ljava/lang/String;Lorg/apache/activemq/command/MessageId;Lorg/apache/activemq/command/MessageAck;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$2", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/TopicMessageStore");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "acknowledge", "(Lorg/apache/activemq/store/TransactionStore;Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/store/TopicMessageStore;Ljava/lang/String;Ljava/lang/String;Lorg/apache/activemq/command/MessageId;Lorg/apache/activemq/command/MessageAck;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
