package asm.org.apache.openejb.quartz.ee.jmx.jboss;
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
public class JBoss4RMIRemoteMBeanSchedulerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/quartz/ee/jmx/jboss/JBoss4RMIRemoteMBeanScheduler", null, "org/apache/openejb/quartz/impl/RemoteMBeanScheduler", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_PROVIDER_URL", "Ljava/lang/String;", null, "jnp://localhost:1099");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "RMI_ADAPTOR_JNDI_NAME", "Ljava/lang/String;", null, "jmx/rmi/RMIAdaptor");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "server", "Ljavax/management/MBeanServerConnection;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "providerURL", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/RemoteMBeanScheduler", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/ee/jmx/jboss/JBoss4RMIRemoteMBeanScheduler", "server", "Ljavax/management/MBeanServerConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jnp://localhost:1099");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/ee/jmx/jboss/JBoss4RMIRemoteMBeanScheduler", "providerURL", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProviderURL", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/ee/jmx/jboss/JBoss4RMIRemoteMBeanScheduler", "providerURL", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "()V", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/naming/NamingException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Exception");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label6, null);
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label7, label8, label9, "javax/naming/NamingException");
Label label10 = new Label();
methodVisitor.visitTryCatchBlock(label5, label10, label6, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "javax/naming/InitialContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/ee/jmx/jboss/JBoss4RMIRemoteMBeanScheduler", "getContextProperties", "()Ljava/util/Properties;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/naming/InitialContext", "<init>", "(Ljava/util/Hashtable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("jmx/rmi/RMIAdaptor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/naming/InitialContext", "lookup", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/management/MBeanServerConnection");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/ee/jmx/jboss/JBoss4RMIRemoteMBeanScheduler", "server", "Ljavax/management/MBeanServerConnection;");
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/naming/InitialContext", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openejb/quartz/ee/jmx/jboss/JBoss4RMIRemoteMBeanScheduler", "javax/naming/InitialContext"}, 1, new Object[] {"javax/naming/NamingException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/SchedulerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Failed to lookup JBoss JMX RMI Adaptor.");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/SchedulerException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/naming/InitialContext", "close", "()V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/openejb/quartz/ee/jmx/jboss/JBoss4RMIRemoteMBeanScheduler", "javax/naming/InitialContext", Opcodes.TOP, "java/lang/Throwable"}, 1, new Object[] {"javax/naming/NamingException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getContextProperties", "()Ljava/util/Properties;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/Properties");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Properties", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("java.naming.factory.initial");
methodVisitor.visitLdcInsn("org.jnp.interfaces.NamingContextFactory");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("java.naming.factory.url.pkgs");
methodVisitor.visitLdcInsn("org.jboss.naming:org.jnp.interfaces");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("java.naming.provider.url");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/ee/jmx/jboss/JBoss4RMIRemoteMBeanScheduler", "providerURL", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/ee/jmx/jboss/JBoss4RMIRemoteMBeanScheduler", "server", "Ljavax/management/MBeanServerConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/ee/jmx/jboss/JBoss4RMIRemoteMBeanScheduler", "getSchedulerObjectName", "()Ljavax/management/ObjectName;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/MBeanServerConnection", "getAttribute", "(Ljavax/management/ObjectName;Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/SchedulerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Failed to get Scheduler MBean attribute: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/SchedulerException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getAttributes", "([Ljava/lang/String;)Ljavax/management/AttributeList;", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/ee/jmx/jboss/JBoss4RMIRemoteMBeanScheduler", "server", "Ljavax/management/MBeanServerConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/ee/jmx/jboss/JBoss4RMIRemoteMBeanScheduler", "getSchedulerObjectName", "()Ljavax/management/ObjectName;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/MBeanServerConnection", "getAttributes", "(Ljavax/management/ObjectName;[Ljava/lang/String;)Ljavax/management/AttributeList;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/SchedulerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Failed to get Scheduler MBean attributes: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/SchedulerException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "invoke", "(Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/ee/jmx/jboss/JBoss4RMIRemoteMBeanScheduler", "server", "Ljavax/management/MBeanServerConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/ee/jmx/jboss/JBoss4RMIRemoteMBeanScheduler", "getSchedulerObjectName", "()Ljavax/management/ObjectName;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/MBeanServerConnection", "invoke", "(Ljavax/management/ObjectName;Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/SchedulerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Failed to invoke Scheduler MBean operation: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/SchedulerException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
