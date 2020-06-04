package asm.org.apache.activemq.broker.jmx;
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
public class ManagedTransportConnectorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/broker/jmx/ManagedTransportConnector", null, "org/apache/activemq/broker/TransportConnector", null);

{
fieldVisitor = classWriter.visitField(ACC_STATIC, "nextConnectionId", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "managementContext", "Lorg/apache/activemq/broker/jmx/ManagementContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "connectorName", "Ljakarta/management/ObjectName;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/broker/jmx/ManagementContext;Ljakarta/management/ObjectName;Lorg/apache/activemq/transport/TransportServer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/TransportConnector", "<init>", "(Lorg/apache/activemq/transport/TransportServer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/ManagedTransportConnector", "managementContext", "Lorg/apache/activemq/broker/jmx/ManagementContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/ManagedTransportConnector", "connectorName", "Ljakarta/management/ObjectName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asManagedConnector", "(Ljakarta/management/MBeanServer;Ljakarta/management/ObjectName;)Lorg/apache/activemq/broker/jmx/ManagedTransportConnector;", null, new String[] { "java/io/IOException", "java/net/URISyntaxException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createConnection", "(Lorg/apache/activemq/transport/Transport;)Lorg/apache/activemq/broker/Connection;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/ManagedTransportConnection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagedTransportConnector", "getBroker", "()Lorg/apache/activemq/broker/Broker;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagedTransportConnector", "isDisableAsyncDispatch", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitInsn(ACONST_NULL);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/activemq/broker/jmx/ManagedTransportConnector", "org/apache/activemq/transport/Transport"}, 5, new Object[] {label0, label0, "org/apache/activemq/broker/jmx/ManagedTransportConnector", "org/apache/activemq/transport/Transport", "org/apache/activemq/broker/Broker"});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagedTransportConnector", "getTaskRunnerFactory", "()Lorg/apache/activemq/thread/TaskRunnerFactory;", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/activemq/broker/jmx/ManagedTransportConnector", "org/apache/activemq/transport/Transport"}, 6, new Object[] {label0, label0, "org/apache/activemq/broker/jmx/ManagedTransportConnector", "org/apache/activemq/transport/Transport", "org/apache/activemq/broker/Broker", "org/apache/activemq/thread/TaskRunnerFactory"});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagedTransportConnector", "getBrokerService", "()Lorg/apache/activemq/broker/BrokerService;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/BrokerService", "getTaskRunnerFactory", "()Lorg/apache/activemq/thread/TaskRunnerFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/ManagedTransportConnector", "managementContext", "Lorg/apache/activemq/broker/jmx/ManagementContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/ManagedTransportConnector", "connectorName", "Ljakarta/management/ObjectName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/ManagedTransportConnection", "<init>", "(Lorg/apache/activemq/broker/TransportConnector;Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/broker/Broker;Lorg/apache/activemq/thread/TaskRunnerFactory;Lorg/apache/activemq/thread/TaskRunnerFactory;Lorg/apache/activemq/broker/jmx/ManagementContext;Ljakarta/management/ObjectName;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC | ACC_SYNCHRONIZED, "getNextConnectionId", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/jmx/ManagedTransportConnector", "nextConnectionId", "J");
methodVisitor.visitInsn(DUP2);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LADD);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/broker/jmx/ManagedTransportConnector", "nextConnectionId", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/broker/jmx/ManagedTransportConnector", "nextConnectionId", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
