package asm.org.apache.activemq.broker.region;
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
public class DestinationFactoryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/broker/region/DestinationFactoryImpl", null, "org/apache/activemq/broker/region/DestinationFactory", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "taskRunnerFactory", "Lorg/apache/activemq/thread/TaskRunnerFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "persistenceAdapter", "Lorg/apache/activemq/store/PersistenceAdapter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "broker", "Lorg/apache/activemq/broker/region/RegionBroker;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "brokerService", "Lorg/apache/activemq/broker/BrokerService;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/broker/BrokerService;Lorg/apache/activemq/thread/TaskRunnerFactory;Lorg/apache/activemq/store/PersistenceAdapter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/region/DestinationFactory", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "taskRunnerFactory", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("null persistenceAdapter");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/activemq/broker/region/DestinationFactoryImpl", "org/apache/activemq/broker/BrokerService", "org/apache/activemq/thread/TaskRunnerFactory", "org/apache/activemq/store/PersistenceAdapter"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "persistenceAdapter", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRegionBroker", "(Lorg/apache/activemq/broker/region/RegionBroker;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("null broker");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "broker", "Lorg/apache/activemq/broker/region/RegionBroker;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDestinations", "()Ljava/util/Set;", "()Ljava/util/Set<Lorg/apache/activemq/command/ActiveMQDestination;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "persistenceAdapter", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/PersistenceAdapter", "getDestinations", "()Ljava/util/Set;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDestination", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/broker/region/DestinationStatistics;)Lorg/apache/activemq/broker/region/Destination;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQDestination", "isQueue", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQDestination", "isTemporary", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ActiveMQTempDestination");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/region/TempQueue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "taskRunnerFactory", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/region/TempQueue", "<init>", "(Lorg/apache/activemq/broker/BrokerService;Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/broker/region/DestinationStatistics;Lorg/apache/activemq/thread/TaskRunnerFactory;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/DestinationFactoryImpl", "configureQueue", "(Lorg/apache/activemq/broker/region/Queue;Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "initialize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "persistenceAdapter", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ActiveMQQueue");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/PersistenceAdapter", "createQueueMessageStore", "(Lorg/apache/activemq/command/ActiveMQQueue;)Lorg/apache/activemq/store/MessageStore;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "taskRunnerFactory", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/region/Queue", "<init>", "(Lorg/apache/activemq/broker/BrokerService;Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/broker/region/DestinationStatistics;Lorg/apache/activemq/thread/TaskRunnerFactory;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/DestinationFactoryImpl", "configureQueue", "(Lorg/apache/activemq/broker/region/Queue;Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "initialize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQDestination", "isTemporary", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/region/Topic");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "taskRunnerFactory", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/region/Topic", "<init>", "(Lorg/apache/activemq/broker/BrokerService;Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/store/TopicMessageStore;Lorg/apache/activemq/broker/region/DestinationStatistics;Lorg/apache/activemq/thread/TaskRunnerFactory;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/DestinationFactoryImpl", "configureTopic", "(Lorg/apache/activemq/broker/region/Topic;Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Topic", "initialize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/advisory/AdvisorySupport", "isAdvisoryTopic", "(Lorg/apache/activemq/command/ActiveMQDestination;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "persistenceAdapter", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ActiveMQTopic");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/PersistenceAdapter", "createTopicMessageStore", "(Lorg/apache/activemq/command/ActiveMQTopic;)Lorg/apache/activemq/store/TopicMessageStore;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/store/TopicMessageStore"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/region/Topic");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "taskRunnerFactory", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/region/Topic", "<init>", "(Lorg/apache/activemq/broker/BrokerService;Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/store/TopicMessageStore;Lorg/apache/activemq/broker/region/DestinationStatistics;Lorg/apache/activemq/thread/TaskRunnerFactory;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/DestinationFactoryImpl", "configureTopic", "(Lorg/apache/activemq/broker/region/Topic;Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Topic", "initialize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeDestination", "(Lorg/apache/activemq/broker/region/Destination;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/Destination", "getActiveMQDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQDestination", "isTemporary", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQDestination", "isQueue", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "persistenceAdapter", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ActiveMQQueue");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/PersistenceAdapter", "removeQueueMessageStore", "(Lorg/apache/activemq/command/ActiveMQQueue;)V", true);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/command/ActiveMQDestination"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/advisory/AdvisorySupport", "isAdvisoryTopic", "(Lorg/apache/activemq/command/ActiveMQDestination;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "persistenceAdapter", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ActiveMQTopic");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/PersistenceAdapter", "removeTopicMessageStore", "(Lorg/apache/activemq/command/ActiveMQTopic;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "configureQueue", "(Lorg/apache/activemq/broker/region/Queue;Lorg/apache/activemq/command/ActiveMQDestination;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "broker", "Lorg/apache/activemq/broker/region/RegionBroker;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("broker property is not set");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "broker", "Lorg/apache/activemq/broker/region/RegionBroker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/RegionBroker", "getDestinationPolicy", "()Lorg/apache/activemq/broker/region/policy/PolicyMap;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "broker", "Lorg/apache/activemq/broker/region/RegionBroker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/RegionBroker", "getDestinationPolicy", "()Lorg/apache/activemq/broker/region/policy/PolicyMap;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/policy/PolicyMap", "getEntryFor", "(Lorg/apache/activemq/command/ActiveMQDestination;)Lorg/apache/activemq/broker/region/policy/PolicyEntry;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "broker", "Lorg/apache/activemq/broker/region/RegionBroker;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/policy/PolicyEntry", "configure", "(Lorg/apache/activemq/broker/Broker;Lorg/apache/activemq/broker/region/Queue;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "configureTopic", "(Lorg/apache/activemq/broker/region/Topic;Lorg/apache/activemq/command/ActiveMQDestination;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "broker", "Lorg/apache/activemq/broker/region/RegionBroker;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("broker property is not set");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "broker", "Lorg/apache/activemq/broker/region/RegionBroker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/RegionBroker", "getDestinationPolicy", "()Lorg/apache/activemq/broker/region/policy/PolicyMap;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "broker", "Lorg/apache/activemq/broker/region/RegionBroker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/RegionBroker", "getDestinationPolicy", "()Lorg/apache/activemq/broker/region/policy/PolicyMap;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/policy/PolicyMap", "getEntryFor", "(Lorg/apache/activemq/command/ActiveMQDestination;)Lorg/apache/activemq/broker/region/policy/PolicyEntry;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "broker", "Lorg/apache/activemq/broker/region/RegionBroker;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/policy/PolicyEntry", "configure", "(Lorg/apache/activemq/broker/Broker;Lorg/apache/activemq/broker/region/Topic;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLastMessageBrokerSequenceId", "()J", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "persistenceAdapter", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/PersistenceAdapter", "getLastMessageBrokerSequenceId", "()J", true);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPersistenceAdapter", "()Lorg/apache/activemq/store/PersistenceAdapter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "persistenceAdapter", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAllDurableSubscriptions", "(Lorg/apache/activemq/command/ActiveMQTopic;)[Lorg/apache/activemq/command/SubscriptionInfo;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/DestinationFactoryImpl", "persistenceAdapter", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/PersistenceAdapter", "createTopicMessageStore", "(Lorg/apache/activemq/command/ActiveMQTopic;)Lorg/apache/activemq/store/TopicMessageStore;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/TopicMessageStore", "getAllSubscriptions", "()[Lorg/apache/activemq/command/SubscriptionInfo;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
