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
public class MultiKahaDBTransactionStore$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", null, "org/apache/activemq/store/ProxyMessageStore", null);

classWriter.visitOuterClass("org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "proxy", "(Lorg/apache/activemq/store/TransactionStore;Lorg/apache/activemq/store/MessageStore;)Lorg/apache/activemq/store/MessageStore;");

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$DelegateDestinationMap", "org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter", "DelegateDestinationMap", ACC_FINAL);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/store/TransactionStore;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/ProxyMessageStore", "<init>", "(Lorg/apache/activemq/store/MessageStore;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "addMessage", "(Lorg/apache/activemq/store/TransactionStore;Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/Message;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;Z)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "addMessage", "(Lorg/apache/activemq/store/TransactionStore;Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/Message;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asyncAddQueueMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;)Lorg/apache/activemq/store/ListenableFuture;", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;)Lorg/apache/activemq/store/ListenableFuture<Ljava/lang/Object;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "asyncAddQueueMessage", "(Lorg/apache/activemq/store/TransactionStore;Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/Message;)Lorg/apache/activemq/store/ListenableFuture;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asyncAddQueueMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;Z)Lorg/apache/activemq/store/ListenableFuture;", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;Z)Lorg/apache/activemq/store/ListenableFuture<Ljava/lang/Object;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "asyncAddQueueMessage", "(Lorg/apache/activemq/store/TransactionStore;Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/Message;)Lorg/apache/activemq/store/ListenableFuture;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/MessageAck;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "val$transactionStore", "Lorg/apache/activemq/store/TransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "removeAsyncMessage", "(Lorg/apache/activemq/store/TransactionStore;Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/MessageAck;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "registerIndexListener", "(Lorg/apache/activemq/store/IndexListener;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/MessageStore", "registerIndexListener", "(Lorg/apache/activemq/store/IndexListener;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/activemq/broker/region/BaseDestination");
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "multiKahaDBPersistenceAdapter", "Lorg/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter", "destinationMap", "Lorg/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$DelegateDestinationMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "getDelegate", "()Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/MessageStore", "getDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$DelegateDestinationMap", "chooseValue", "(Lorg/apache/activemq/command/ActiveMQDestination;)Lorg/apache/activemq/filter/DestinationMapEntry;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/activemq/store/kahadb/FilteredKahaDBPersistenceAdapter");
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/FilteredKahaDBPersistenceAdapter");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/FilteredKahaDBPersistenceAdapter", "getUsage", "()Lorg/apache/activemq/usage/StoreUsage;", false);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/FilteredKahaDBPersistenceAdapter", "getPersistenceAdapter", "()Lorg/apache/activemq/store/PersistenceAdapter;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/activemq/store/kahadb/KahaDBPersistenceAdapter");
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/FilteredKahaDBPersistenceAdapter", "getUsage", "()Lorg/apache/activemq/usage/StoreUsage;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/FilteredKahaDBPersistenceAdapter", "getPersistenceAdapter", "()Lorg/apache/activemq/store/PersistenceAdapter;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/StoreUsage", "setStore", "(Lorg/apache/activemq/store/PersistenceAdapter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore$1", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBTransactionStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "multiKahaDBPersistenceAdapter", "Lorg/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter", "getBrokerService", "()Lorg/apache/activemq/broker/BrokerService;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/BrokerService", "getSystemUsage", "()Lorg/apache/activemq/usage/SystemUsage;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/SystemUsage", "getStoreUsage", "()Lorg/apache/activemq/usage/StoreUsage;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/StoreUsage", "setParent", "(Lorg/apache/activemq/usage/Usage;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/BaseDestination");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/BaseDestination", "getSystemUsage", "()Lorg/apache/activemq/usage/SystemUsage;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/SystemUsage", "setStoreUsage", "(Lorg/apache/activemq/usage/StoreUsage;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/MultiKahaDBTransactionStore", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Failed to set mKahaDB destination store usage");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
