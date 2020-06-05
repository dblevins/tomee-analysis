package asm.org.apache.cxf.management.jmx;
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
public class MBServerConnectorFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/management/jmx/MBServerConnectorFactory", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/management/jmx/MBServerConnectorFactory$JmxRegistry", "org/apache/cxf/management/jmx/MBServerConnectorFactory", "JmxRegistry", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/cxf/management/jmx/MBServerConnectorFactory$MBeanServerHolder", "org/apache/cxf/management/jmx/MBServerConnectorFactory", "MBeanServerHolder", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/management/jmx/MBServerConnectorFactory$MBServerConnectorFactoryHolder", "org/apache/cxf/management/jmx/MBServerConnectorFactory", "MBServerConnectorFactoryHolder", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/management/jmx/MBServerConnectorFactory$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_SERVICE_URL", "Ljava/lang/String;", null, "service:jmx:rmi:///jndi/rmi://localhost:9913/jmxrmi");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "server", "Ljavax/management/MBeanServer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "serviceUrl", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "environment", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "threaded", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "daemon", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "connectorServer", "Ljavax/management/remote/JMXConnectorServer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "remoteServerStub", "Ljava/rmi/Remote;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "rmiServer", "Ljavax/management/remote/rmi/RMIJRMPServerImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getServerPort", "(Ljava/lang/String;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("localhost");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(Ljava/lang/String;)I", false);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "indexNotOfNumber", "(Ljava/lang/String;I)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "parseInt", "(Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.INTEGER, Opcodes.TOP, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "indexNotOfNumber", "(Ljava/lang/String;I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C", false);
methodVisitor.visitIntInsn(BIPUSH, 48);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C", false);
methodVisitor.visitIntInsn(BIPUSH, 57);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "()Lorg/apache/cxf/management/jmx/MBServerConnectorFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory$MBServerConnectorFactoryHolder", "access$100", "()Lorg/apache/cxf/management/jmx/MBServerConnectorFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMBeanServer", "(Ljavax/management/MBeanServer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "server", "Ljavax/management/MBeanServer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setServiceUrl", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "serviceUrl", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEnvironment", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "environment", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setThreaded", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "threaded", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDaemon", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "daemon", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createConnector", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "server", "Ljavax/management/MBeanServer;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory$MBeanServerHolder", "access$200", "()Ljavax/management/MBeanServer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "server", "Ljavax/management/MBeanServer;");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/management/remote/JMXServiceURL");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "serviceUrl", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/remote/JMXServiceURL", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "serviceUrl", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("localhost");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/remote/JMXServiceURL", "getProtocol", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("rmi");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "compareToIgnoreCase", "(Ljava/lang/String;)I", false);
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "serviceUrl", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "getRegistryPort", "(Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/management/jmx/MBServerConnectorFactory$JmxRegistry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "getBindingName", "(Ljavax/management/remote/JMXServiceURL;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/management/jmx/MBServerConnectorFactory$JmxRegistry", "<init>", "(Lorg/apache/cxf/management/jmx/MBServerConnectorFactory;ILjava/lang/String;)V", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/cxf/management/jmx/MBServerConnectorFactory", "javax/management/remote/JMXServiceURL"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("CREATE_REGISTRY_FAULT_MSG");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/management/remote/rmi/RMIJRMPServerImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "serviceUrl", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "getServerPort", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "environment", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/remote/rmi/RMIJRMPServerImpl", "<init>", "(ILjava/rmi/server/RMIClientSocketFactory;Ljava/rmi/server/RMIServerSocketFactory;Ljava/util/Map;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "rmiServer", "Ljavax/management/remote/rmi/RMIJRMPServerImpl;");
methodVisitor.visitTypeInsn(NEW, "javax/management/remote/rmi/RMIConnectorServer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "environment", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "rmiServer", "Ljavax/management/remote/rmi/RMIJRMPServerImpl;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "server", "Ljavax/management/MBeanServer;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/remote/rmi/RMIConnectorServer", "<init>", "(Ljavax/management/remote/JMXServiceURL;Ljava/util/Map;Ljavax/management/remote/rmi/RMIServerImpl;Ljavax/management/MBeanServer;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "connectorServer", "Ljavax/management/remote/JMXConnectorServer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "threaded", "Z");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/management/jmx/MBServerConnectorFactory$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/management/jmx/MBServerConnectorFactory$1", "<init>", "(Lorg/apache/cxf/management/jmx/MBServerConnectorFactory;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("JMX Connector Thread [");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "serviceUrl", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "daemon", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setDaemon", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "start", "()V", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "connectorServer", "Ljavax/management/remote/JMXConnectorServer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/remote/JMXConnectorServer", "start", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "rmiServer", "Ljavax/management/remote/rmi/RMIJRMPServerImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/remote/rmi/RMIJRMPServerImpl", "toStub", "()Ljava/rmi/Remote;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "remoteServerStub", "Ljava/rmi/Remote;");
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "INFO", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("JMX connector server started: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "connectorServer", "Ljavax/management/remote/JMXConnectorServer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "info", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getRegistryPort", "(Ljava/lang/String;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("/jndi/rmi://");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(I)I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "indexNotOfNumber", "(Ljava/lang/String;I)I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "parseInt", "(Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"java/lang/String", Opcodes.INTEGER, "java/lang/String", Opcodes.INTEGER, Opcodes.TOP, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "getBindingName", "(Ljavax/management/remote/JMXServiceURL;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/net/URISyntaxException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/remote/JMXServiceURL", "getURLPath", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("/jndi/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "java/net/URI");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/URI", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "getPath", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("^/+");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replaceAll", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("/+$");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replaceAll", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/net/URISyntaxException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("jmxrmi");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "destroy", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "connectorServer", "Ljavax/management/remote/JMXConnectorServer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/remote/JMXConnectorServer", "stop", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "INFO", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("JMX connector server stopped: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "connectorServer", "Ljavax/management/remote/JMXConnectorServer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "info", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/cxf/management/jmx/MBServerConnectorFactory$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "()Ljavax/management/remote/JMXConnectorServer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "connectorServer", "Ljavax/management/remote/JMXConnectorServer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$402", "(Ljava/rmi/Remote;)Ljava/rmi/Remote;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "remoteServerStub", "Ljava/rmi/Remote;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "()Ljavax/management/remote/rmi/RMIJRMPServerImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "rmiServer", "Ljavax/management/remote/rmi/RMIJRMPServerImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "()Ljava/util/logging/Logger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "()Ljava/rmi/Remote;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "remoteServerStub", "Ljava/rmi/Remote;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/management/jmx/MBServerConnectorFactory;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/logging/LogUtils", "getL7dLogger", "(Ljava/lang/Class;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("service:jmx:rmi:///jndi/rmi://localhost:9913/jmxrmi");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "serviceUrl", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
