package asm.org.apache.commons.jcs.jcache.jmx;
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
public class ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", null, "javax/management/MBeanServerDelegate", null);

classWriter.visitInnerClass("org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder", "ForceIdMBeanServerDelegate", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Ljavax/management/MBeanServerDelegate;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder;Ljavax/management/MBeanServerDelegate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "this$0", "Lorg/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/MBeanServerDelegate", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "delegate", "Ljavax/management/MBeanServerDelegate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMBeanServerId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("org.jsr107.tck.management.agentId");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "delegate", "Ljavax/management/MBeanServerDelegate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/MBeanServerDelegate", "getMBeanServerId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSpecificationName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "delegate", "Ljavax/management/MBeanServerDelegate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/MBeanServerDelegate", "getSpecificationName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSpecificationVersion", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "delegate", "Ljavax/management/MBeanServerDelegate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/MBeanServerDelegate", "getSpecificationVersion", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSpecificationVendor", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "delegate", "Ljavax/management/MBeanServerDelegate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/MBeanServerDelegate", "getSpecificationVendor", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getImplementationName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "delegate", "Ljavax/management/MBeanServerDelegate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/MBeanServerDelegate", "getImplementationName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getImplementationVersion", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "delegate", "Ljavax/management/MBeanServerDelegate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/MBeanServerDelegate", "getImplementationVersion", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getImplementationVendor", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "delegate", "Ljavax/management/MBeanServerDelegate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/MBeanServerDelegate", "getImplementationVendor", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNotificationInfo", "()[Ljavax/management/MBeanNotificationInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "delegate", "Ljavax/management/MBeanServerDelegate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/MBeanServerDelegate", "getNotificationInfo", "()[Ljavax/management/MBeanNotificationInfo;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addNotificationListener", "(Ljavax/management/NotificationListener;Ljavax/management/NotificationFilter;Ljava/lang/Object;)V", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "delegate", "Ljavax/management/MBeanServerDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/MBeanServerDelegate", "addNotificationListener", "(Ljavax/management/NotificationListener;Ljavax/management/NotificationFilter;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeNotificationListener", "(Ljavax/management/NotificationListener;Ljavax/management/NotificationFilter;Ljava/lang/Object;)V", null, new String[] { "javax/management/ListenerNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "delegate", "Ljavax/management/MBeanServerDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/MBeanServerDelegate", "removeNotificationListener", "(Ljavax/management/NotificationListener;Ljavax/management/NotificationFilter;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeNotificationListener", "(Ljavax/management/NotificationListener;)V", null, new String[] { "javax/management/ListenerNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "delegate", "Ljavax/management/MBeanServerDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/MBeanServerDelegate", "removeNotificationListener", "(Ljavax/management/NotificationListener;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sendNotification", "(Ljavax/management/Notification;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "delegate", "Ljavax/management/MBeanServerDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/MBeanServerDelegate", "sendNotification", "(Ljavax/management/Notification;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
