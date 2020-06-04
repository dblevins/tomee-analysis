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
public class KahaDBStoreDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/store/kahadb/KahaDBStore", null, "org/apache/activemq/store/kahadb/MessageDatabase", new String[] { "org/apache/activemq/store/PersistenceAdapter", "org/apache/activemq/store/NoLocalSubscriptionAware" });

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$6", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$StoreTaskExecutor", "org/apache/activemq/store/kahadb/KahaDBStore", "StoreTaskExecutor", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$StoreTopicTask", "org/apache/activemq/store/kahadb/KahaDBStore", "StoreTopicTask", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "org/apache/activemq/store/kahadb/KahaDBStore", "StoreQueueTask", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$StoreTask", "org/apache/activemq/store/kahadb/KahaDBStore", "StoreTask", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$AsyncJobKey", "org/apache/activemq/store/kahadb/KahaDBStore", "AsyncJobKey", ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "org/apache/activemq/store/kahadb/KahaDBStore", "KahaDBTopicMessageStore", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "org/apache/activemq/store/kahadb/KahaDBStore", "KahaDBMessageStore", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$5", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$4", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$3", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$2", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$Metadata", "org/apache/activemq/store/kahadb/MessageDatabase", "Metadata", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/page/Transaction$CallableClosure", "org/apache/activemq/store/kahadb/disk/page/Transaction", "CallableClosure", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "java/util/concurrent/locks/ReentrantReadWriteLock", "WriteLock", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/page/Transaction$Closure", "org/apache/activemq/store/kahadb/disk/page/Transaction", "Closure", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "org/apache/activemq/store/kahadb/data/KahaDestination", "DestinationType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MAX_ASYNC_JOBS", "I", null, new Integer(10000));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROPERTY_CANCELED_TASK_MOD_METRIC", "Ljava/lang/String;", null, "org.apache.activemq.store.kahadb.CANCELED_TASK_MOD_METRIC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "cancelledTaskModMetric", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROPERTY_ASYNC_EXECUTOR_MAX_THREADS", "Ljava/lang/String;", null, "org.apache.activemq.store.kahadb.ASYNC_EXECUTOR_MAX_THREADS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "asyncExecutorMaxThreads", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "queueExecutor", "Ljava/util/concurrent/ExecutorService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "topicExecutor", "Ljava/util/concurrent/ExecutorService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "asyncQueueMaps", "Ljava/util/List;", "Ljava/util/List<Ljava/util/Map<Lorg/apache/activemq/store/kahadb/KahaDBStore$AsyncJobKey;Lorg/apache/activemq/store/kahadb/KahaDBStore$StoreTask;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "asyncTopicMaps", "Ljava/util/List;", "Ljava/util/List<Ljava/util/Map<Lorg/apache/activemq/store/kahadb/KahaDBStore$AsyncJobKey;Lorg/apache/activemq/store/kahadb/KahaDBStore$StoreTask;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "wireFormat", "Lorg/apache/activemq/wireformat/WireFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "usageManager", "Lorg/apache/activemq/usage/SystemUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "asyncQueueJobQueue", "Ljava/util/concurrent/LinkedBlockingQueue;", "Ljava/util/concurrent/LinkedBlockingQueue<Ljava/lang/Runnable;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "asyncTopicJobQueue", "Ljava/util/concurrent/LinkedBlockingQueue;", "Ljava/util/concurrent/LinkedBlockingQueue<Ljava/lang/Runnable;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "globalQueueSemaphore", "Ljava/util/concurrent/Semaphore;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "globalTopicSemaphore", "Ljava/util/concurrent/Semaphore;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "concurrentStoreAndDispatchQueues", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "concurrentStoreAndDispatchTopics", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "concurrentStoreAndDispatchTransactions", "Z", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "maxAsyncJobs", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "transactionStore", "Lorg/apache/activemq/store/kahadb/KahaDBTransactionStore;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "transactionIdTransformer", "Lorg/apache/activemq/store/TransactionIdTransformer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/MessageDatabase", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "asyncQueueMaps", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "asyncTopicMaps", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/OpenWireFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/OpenWireFormat", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "wireFormat", "Lorg/apache/activemq/wireformat/WireFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "concurrentStoreAndDispatchQueues", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "concurrentStoreAndDispatchTopics", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "concurrentStoreAndDispatchTransactions", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 10000);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "maxAsyncJobs", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/KahaDBTransactionStore");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBTransactionStore", "<init>", "(Lorg/apache/activemq/store/kahadb/KahaDBStore;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "transactionStore", "Lorg/apache/activemq/store/kahadb/KahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/KahaDBStore$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore$1", "<init>", "(Lorg/apache/activemq/store/kahadb/KahaDBStore;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "transactionIdTransformer", "Lorg/apache/activemq/store/TransactionIdTransformer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("KahaDB:[");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "directory", "Ljava/io/File;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "getAbsolutePath", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBrokerName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUsageManager", "(Lorg/apache/activemq/usage/SystemUsage;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "usageManager", "Lorg/apache/activemq/usage/SystemUsage;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUsageManager", "()Lorg/apache/activemq/usage/SystemUsage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "usageManager", "Lorg/apache/activemq/usage/SystemUsage;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isConcurrentStoreAndDispatchQueues", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "concurrentStoreAndDispatchQueues", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConcurrentStoreAndDispatchQueues", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "concurrentStoreAndDispatchQueues", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isConcurrentStoreAndDispatchTopics", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "concurrentStoreAndDispatchTopics", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConcurrentStoreAndDispatchTopics", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "concurrentStoreAndDispatchTopics", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isConcurrentStoreAndDispatchTransactions", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxAsyncJobs", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "maxAsyncJobs", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxAsyncJobs", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "maxAsyncJobs", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "configureMetadata", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "metadata", "Lorg/apache/activemq/store/kahadb/MessageDatabase$Metadata;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/BrokerService", "getStoreOpenWireVersion", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$Metadata", "openwireVersion", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "wireFormat", "Lorg/apache/activemq/wireformat/WireFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "metadata", "Lorg/apache/activemq/store/kahadb/MessageDatabase$Metadata;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$Metadata", "openwireVersion", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/wireformat/WireFormat", "setVersion", "(I)V", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "isDebugEnabled", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Store OpenWire version configured as: {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "metadata", "Lorg/apache/activemq/store/kahadb/MessageDatabase$Metadata;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$Metadata", "openwireVersion", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doStart", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "configureMetadata", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/MessageDatabase", "doStart", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "metadata", "Lorg/apache/activemq/store/kahadb/MessageDatabase$Metadata;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$Metadata", "openwireVersion", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/BrokerService", "getStoreOpenWireVersion", "()I", false);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Existing Store uses a different OpenWire version[{}] than the version configured[{}] reverting to the version used by this store, some newer broker features may not workas expected.");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "metadata", "Lorg/apache/activemq/store/kahadb/MessageDatabase$Metadata;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$Metadata", "openwireVersion", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/BrokerService", "getStoreOpenWireVersion", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "wireFormat", "Lorg/apache/activemq/wireformat/WireFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "metadata", "Lorg/apache/activemq/store/kahadb/MessageDatabase$Metadata;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$Metadata", "openwireVersion", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/wireformat/WireFormat", "setVersion", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "metadata", "Lorg/apache/activemq/store/kahadb/MessageDatabase$Metadata;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$Metadata", "openwireVersion", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/BrokerService", "setStoreOpenWireVersion", "(I)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/Semaphore");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "getMaxAsyncJobs", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/Semaphore", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "globalQueueSemaphore", "Ljava/util/concurrent/Semaphore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/Semaphore");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "getMaxAsyncJobs", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/Semaphore", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "globalTopicSemaphore", "Ljava/util/concurrent/Semaphore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/LinkedBlockingQueue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "getMaxAsyncJobs", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/LinkedBlockingQueue", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "asyncQueueJobQueue", "Ljava/util/concurrent/LinkedBlockingQueue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/LinkedBlockingQueue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "getMaxAsyncJobs", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/LinkedBlockingQueue", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "asyncTopicJobQueue", "Ljava/util/concurrent/LinkedBlockingQueue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/KahaDBStore$StoreTaskExecutor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore", "asyncExecutorMaxThreads", "I");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "MILLISECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "asyncQueueJobQueue", "Ljava/util/concurrent/LinkedBlockingQueue;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/KahaDBStore$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore$2", "<init>", "(Lorg/apache/activemq/store/kahadb/KahaDBStore;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore$StoreTaskExecutor", "<init>", "(Lorg/apache/activemq/store/kahadb/KahaDBStore;IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "queueExecutor", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/KahaDBStore$StoreTaskExecutor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore", "asyncExecutorMaxThreads", "I");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "MILLISECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "asyncTopicJobQueue", "Ljava/util/concurrent/LinkedBlockingQueue;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/KahaDBStore$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore$3", "<init>", "(Lorg/apache/activemq/store/kahadb/KahaDBStore;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore$StoreTaskExecutor", "<init>", "(Lorg/apache/activemq/store/kahadb/KahaDBStore;IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "topicExecutor", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(13, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doStop", "(Lorg/apache/activemq/util/ServiceStopper;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label6, null);
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label6, null);
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
methodVisitor.visitTryCatchBlock(label8, label9, label10, null);
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label10, label11, label10, null);
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
methodVisitor.visitTryCatchBlock(label12, label13, label14, null);
Label label15 = new Label();
methodVisitor.visitTryCatchBlock(label14, label15, label14, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Stopping async queue tasks");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "globalQueueSemaphore", "Ljava/util/concurrent/Semaphore;");
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label16);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "globalQueueSemaphore", "Ljava/util/concurrent/Semaphore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "maxAsyncJobs", "I");
methodVisitor.visitLdcInsn(new Long(60L));
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "SECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/Semaphore", "tryAcquire", "(IJLjava/util/concurrent/TimeUnit;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "asyncQueueMaps", "Ljava/util/List;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "asyncQueueMaps", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label17 = new Label();
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label18);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label19 = new Label();
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/util/Map", "java/lang/Object", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label20 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label20);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/KahaDBStore$StoreTask");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/kahadb/KahaDBStore$StoreTask", "cancel", "()Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label21 = new Label();
methodVisitor.visitJumpInsn(GOTO, label21);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label17);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "asyncQueueMaps", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label5);
Label label22 = new Label();
methodVisitor.visitJumpInsn(GOTO, label22);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Stopping async topic tasks");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "globalTopicSemaphore", "Ljava/util/concurrent/Semaphore;");
Label label23 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label23);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "globalTopicSemaphore", "Ljava/util/concurrent/Semaphore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "maxAsyncJobs", "I");
methodVisitor.visitLdcInsn(new Long(60L));
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "SECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/Semaphore", "tryAcquire", "(IJLjava/util/concurrent/TimeUnit;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "asyncTopicMaps", "Ljava/util/List;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "asyncTopicMaps", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label24 = new Label();
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label25 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label25);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label26 = new Label();
methodVisitor.visitLabel(label26);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/util/Map", "java/lang/Object", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label27 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label27);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/KahaDBStore$StoreTask");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/kahadb/KahaDBStore$StoreTask", "cancel", "()Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label26);
methodVisitor.visitLabel(label27);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label9);
Label label28 = new Label();
methodVisitor.visitJumpInsn(GOTO, label28);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label11);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label28);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label24);
methodVisitor.visitLabel(label25);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "asyncTopicMaps", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label13);
Label label29 = new Label();
methodVisitor.visitJumpInsn(GOTO, label29);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label15);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label29);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "globalQueueSemaphore", "Ljava/util/concurrent/Semaphore;");
Label label30 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label30);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "globalQueueSemaphore", "Ljava/util/concurrent/Semaphore;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/Semaphore", "drainPermits", "()I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label30);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "globalTopicSemaphore", "Ljava/util/concurrent/Semaphore;");
Label label31 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label31);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "globalTopicSemaphore", "Ljava/util/concurrent/Semaphore;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/Semaphore", "drainPermits", "()I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label31);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "queueExecutor", "Ljava/util/concurrent/ExecutorService;");
Label label32 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label32);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "queueExecutor", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/ThreadPoolUtils", "shutdownNow", "(Ljava/util/concurrent/ExecutorService;)Ljava/util/List;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "queueExecutor", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitLabel(label32);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "topicExecutor", "Ljava/util/concurrent/ExecutorService;");
Label label33 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label33);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "topicExecutor", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/ThreadPoolUtils", "shutdownNow", "(Ljava/util/concurrent/ExecutorService;)Ljava/util/List;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "topicExecutor", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitLabel(label33);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Stopped KahaDB");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/MessageDatabase", "doStop", "(Lorg/apache/activemq/util/ServiceStopper;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "findMessageLocation", "(Ljava/lang/String;Lorg/apache/activemq/store/kahadb/data/KahaDestination;)Lorg/apache/activemq/store/kahadb/disk/journal/Location;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "pageFile", "Lorg/apache/activemq/store/kahadb/disk/page/PageFile;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/PageFile", "tx", "()Lorg/apache/activemq/store/kahadb/disk/page/Transaction;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/KahaDBStore$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore$4", "<init>", "(Lorg/apache/activemq/store/kahadb/KahaDBStore;Lorg/apache/activemq/store/kahadb/data/KahaDestination;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction$CallableClosure;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/disk/journal/Location");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "removeQueueTask", "(Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;Lorg/apache/activemq/command/MessageId;)Lorg/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "asyncTaskMap", "Ljava/util/Map;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "asyncTaskMap", "Ljava/util/Map;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/KahaDBStore$AsyncJobKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "getDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore$AsyncJobKey", "<init>", "(Lorg/apache/activemq/command/MessageId;Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/activemq/store/kahadb/KahaDBStore", "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "org/apache/activemq/command/MessageId", "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "java/lang/Object"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "addQueueTask", "(Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore;Lorg/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "asyncTaskMap", "Ljava/util/Map;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/KahaDBStore$AsyncJobKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore$StoreQueueTask", "getMessage", "()Lorg/apache/activemq/command/Message;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "getDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore$AsyncJobKey", "<init>", "(Lorg/apache/activemq/command/MessageId;Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "queueExecutor", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ExecutorService", "execute", "(Ljava/lang/Runnable;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "removeTopicTask", "(Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;Lorg/apache/activemq/command/MessageId;)Lorg/apache/activemq/store/kahadb/KahaDBStore$StoreTopicTask;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "asyncTaskMap", "Ljava/util/Map;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "asyncTaskMap", "Ljava/util/Map;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/KahaDBStore$AsyncJobKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "getDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore$AsyncJobKey", "<init>", "(Lorg/apache/activemq/command/MessageId;Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/KahaDBStore$StoreTopicTask");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/activemq/store/kahadb/KahaDBStore", "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "org/apache/activemq/command/MessageId", "org/apache/activemq/store/kahadb/KahaDBStore$StoreTopicTask", "java/lang/Object"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "addTopicTask", "(Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;Lorg/apache/activemq/store/kahadb/KahaDBStore$StoreTopicTask;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "asyncTaskMap", "Ljava/util/Map;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "asyncTaskMap", "Ljava/util/Map;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/KahaDBStore$AsyncJobKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore$StoreTopicTask", "getMessage", "()Lorg/apache/activemq/command/Message;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "getDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore$AsyncJobKey", "<init>", "(Lorg/apache/activemq/command/MessageId;Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/activemq/store/kahadb/KahaDBStore", "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "org/apache/activemq/store/kahadb/KahaDBStore$StoreTopicTask", "java/lang/Object"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "topicExecutor", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ExecutorService", "execute", "(Ljava/lang/Runnable;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTransactionStore", "()Lorg/apache/activemq/store/TransactionStore;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "transactionStore", "Lorg/apache/activemq/store/kahadb/KahaDBTransactionStore;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getForceRecoverIndex", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "forceRecoverIndex", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setForceRecoverIndex", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "forceRecoverIndex", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "subscriptionKey", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createQueueMessageStore", "(Lorg/apache/activemq/command/ActiveMQQueue;)Lorg/apache/activemq/store/MessageStore;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "convert", "(Lorg/apache/activemq/command/ActiveMQDestination;)Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "key", "(Lorg/apache/activemq/store/kahadb/data/KahaDestination;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "storeCache", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "convert", "(Lorg/apache/activemq/command/ActiveMQDestination;)Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "key", "(Lorg/apache/activemq/store/kahadb/data/KahaDestination;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/MessageStore");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "transactionStore", "Lorg/apache/activemq/store/kahadb/KahaDBTransactionStore;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBMessageStore", "<init>", "(Lorg/apache/activemq/store/kahadb/KahaDBStore;Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBTransactionStore", "proxy", "(Lorg/apache/activemq/store/MessageStore;)Lorg/apache/activemq/store/MessageStore;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "storeCache", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "putIfAbsent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/MessageStore");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "org/apache/activemq/store/MessageStore"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTopicMessageStore", "(Lorg/apache/activemq/command/ActiveMQTopic;)Lorg/apache/activemq/store/TopicMessageStore;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "convert", "(Lorg/apache/activemq/command/ActiveMQDestination;)Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "key", "(Lorg/apache/activemq/store/kahadb/data/KahaDestination;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "storeCache", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "convert", "(Lorg/apache/activemq/command/ActiveMQDestination;)Lorg/apache/activemq/store/kahadb/data/KahaDestination;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "key", "(Lorg/apache/activemq/store/kahadb/data/KahaDestination;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/MessageStore");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "transactionStore", "Lorg/apache/activemq/store/kahadb/KahaDBTransactionStore;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "<init>", "(Lorg/apache/activemq/store/kahadb/KahaDBStore;Lorg/apache/activemq/command/ActiveMQTopic;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBTransactionStore", "proxy", "(Lorg/apache/activemq/store/TopicMessageStore;)Lorg/apache/activemq/store/TopicMessageStore;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "storeCache", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "putIfAbsent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/MessageStore");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "org/apache/activemq/store/MessageStore"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/TopicMessageStore");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeQueueMessageStore", "(Lorg/apache/activemq/command/ActiveMQQueue;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeTopicMessageStore", "(Lorg/apache/activemq/command/ActiveMQTopic;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "deleteAllMessages", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "deleteAllMessages", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDestinations", "()Ljava/util/Set;", "()Ljava/util/Set<Lorg/apache/activemq/command/ActiveMQDestination;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/io/IOException");
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "indexLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "lock", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "pageFile", "Lorg/apache/activemq/store/kahadb/disk/page/PageFile;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/PageFile", "tx", "()Lorg/apache/activemq/store/kahadb/disk/page/Transaction;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/KahaDBStore$5");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore$5", "<init>", "(Lorg/apache/activemq/store/kahadb/KahaDBStore;Ljava/util/HashSet;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction$Closure;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "indexLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "unlock", "()V", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/activemq/store/kahadb/KahaDBStore", "java/util/HashSet"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "indexLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "unlock", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/activemq/store/kahadb/KahaDBStore"}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLastMessageBrokerSequenceId", "()J", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLastProducerSequenceId", "(Lorg/apache/activemq/command/ProducerId;)J", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "indexLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "lock", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "metadata", "Lorg/apache/activemq/store/kahadb/MessageDatabase$Metadata;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$Metadata", "producerSequenceIdTracker", "Lorg/apache/activemq/ActiveMQMessageAuditNoSync;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ActiveMQMessageAuditNoSync", "getLastSeqId", "(Lorg/apache/activemq/command/ProducerId;)J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "indexLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "unlock", "()V", false);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "indexLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "unlock", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()J", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "journalSize", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "get", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "getPageFile", "()Lorg/apache/activemq/store/kahadb/disk/page/PageFile;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/PageFile", "getDiskSize", "()J", false);
methodVisitor.visitInsn(LADD);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beginTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Not yet implemented.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commitTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Not yet implemented.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rollbackTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Not yet implemented.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "checkpoint", "(Z)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/MessageDatabase", "checkpointCleanup", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "loadMessage", "(Lorg/apache/activemq/store/kahadb/disk/journal/Location;)Lorg/apache/activemq/command/Message;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "load", "(Lorg/apache/activemq/store/kahadb/disk/journal/Location;)Lorg/apache/activemq/store/kahadb/JournalCommand;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore$6", "$SwitchMap$org$apache$activemq$store$kahadb$data$KahaEntryType", "[I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/kahadb/JournalCommand", "type", "()Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitLookupSwitchInsn(label5, new int[] { 1, 2 }, new Label[] { label3, label4 });
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/activemq/store/kahadb/JournalCommand", "org/apache/activemq/store/kahadb/data/KahaAddMessageCommand"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaUpdateMessageCommand");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaUpdateMessageCommand", "getMessage", "()Lorg/apache/activemq/store/kahadb/data/KahaAddMessageCommand;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaAddMessageCommand");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Could not load journal record, unexpected command type: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/kahadb/JournalCommand", "type", "()Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" at location: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaAddMessageCommand", "hasMessage", "()Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Could not load journal record, null message content at location: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "wireFormat", "Lorg/apache/activemq/wireformat/WireFormat;");
methodVisitor.visitTypeInsn(NEW, "java/io/DataInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaAddMessageCommand", "getMessage", "()Lorg/apache/activemq/protobuf/Buffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/protobuf/Buffer", "newInput", "()Lorg/apache/activemq/protobuf/BufferInputStream;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/DataInputStream", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/wireformat/WireFormat", "unmarshal", "(Ljava/io/DataInput;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/Message");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/activemq/store/kahadb/KahaDBStore", "org/apache/activemq/store/kahadb/disk/journal/Location"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Unexpected error on journal read at: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/IOExceptionSupport", "create", "(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/io/IOException;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Failed to load message at: {}");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/BrokerService", "handleIOException", "(Ljava/io/IOException;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "convert", "(Lorg/apache/activemq/store/kahadb/disk/journal/Location;)Lorg/apache/activemq/store/kahadb/data/KahaLocation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaLocation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaLocation", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/journal/Location", "getDataFileId", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaLocation", "setLogId", "(I)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/journal/Location", "getOffset", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaLocation", "setOffset", "(I)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "convert", "(Lorg/apache/activemq/command/ActiveMQDestination;)Lorg/apache/activemq/store/kahadb/data/KahaDestination;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaDestination");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQDestination", "getPhysicalName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "setName", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQDestination", "getDestinationType", "()B", false);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTableSwitchInsn(1, 6, label2, new Label[] { label0, label1, label2, label2, label3, label4 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/store/kahadb/data/KahaDestination"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "QUEUE", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "setType", "(Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "TOPIC", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "setType", "(Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "TEMP_QUEUE", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "setType", "(Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "TEMP_TOPIC", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "setType", "(Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "convert", "(Ljava/lang/String;)Lorg/apache/activemq/command/ActiveMQDestination;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Not in the valid destination format");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "parseInt", "(Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore", "convert", "(ILjava/lang/String;)Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "convert", "(Lorg/apache/activemq/store/kahadb/data/KahaDestination;)Lorg/apache/activemq/command/ActiveMQDestination;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "getType", "()Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "getNumber", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore", "convert", "(ILjava/lang/String;)Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "convert", "(ILjava/lang/String;)Lorg/apache/activemq/command/ActiveMQDestination;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore$6", "$SwitchMap$org$apache$activemq$store$kahadb$data$KahaDestination$DestinationType", "[I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "valueOf", "(I)Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTableSwitchInsn(1, 4, label4, new Label[] { label0, label1, label2, label3 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/ActiveMQQueue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/ActiveMQQueue", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/ActiveMQTopic");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/ActiveMQTopic", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/ActiveMQTempQueue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/ActiveMQTempQueue", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/ActiveMQTempTopic");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/ActiveMQTempTopic", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Not in the valid destination format");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransactionIdTransformer", "()Lorg/apache/activemq/store/TransactionIdTransformer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "transactionIdTransformer", "Lorg/apache/activemq/store/TransactionIdTransformer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTransactionIdTransformer", "(Lorg/apache/activemq/store/TransactionIdTransformer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "transactionIdTransformer", "Lorg/apache/activemq/store/TransactionIdTransformer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createJobSchedulerStore", "()Lorg/apache/activemq/broker/scheduler/JobSchedulerStore;", null, new String[] { "java/io/IOException", "java/lang/UnsupportedOperationException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPersistNoLocal", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/BrokerService", "getStoreOpenWireVersion", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 11);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/activemq/store/kahadb/KahaDBStore;)Lorg/apache/activemq/store/TransactionIdTransformer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "transactionIdTransformer", "Lorg/apache/activemq/store/TransactionIdTransformer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/apache/activemq/store/kahadb/KahaDBStore;Ljava/lang/String;Lorg/apache/activemq/store/kahadb/data/KahaDestination;)Lorg/apache/activemq/store/kahadb/disk/journal/Location;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/KahaDBStore", "findMessageLocation", "(Ljava/lang/String;Lorg/apache/activemq/store/kahadb/data/KahaDestination;)Lorg/apache/activemq/store/kahadb/disk/journal/Location;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/store/kahadb/KahaDBStore;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("org.apache.activemq.store.kahadb.CANCELED_TASK_MOD_METRIC");
methodVisitor.visitLdcInsn("0");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "parseInt", "(Ljava/lang/String;I)I", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore", "cancelledTaskModMetric", "I");
methodVisitor.visitLdcInsn("org.apache.activemq.store.kahadb.ASYNC_EXECUTOR_MAX_THREADS");
methodVisitor.visitLdcInsn("1");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "parseInt", "(Ljava/lang/String;I)I", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/KahaDBStore", "asyncExecutorMaxThreads", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
