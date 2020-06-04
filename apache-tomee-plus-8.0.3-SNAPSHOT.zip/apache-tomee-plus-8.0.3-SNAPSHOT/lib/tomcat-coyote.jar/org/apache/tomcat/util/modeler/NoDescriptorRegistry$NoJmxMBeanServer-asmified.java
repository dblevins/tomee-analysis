package asm.org.apache.tomcat.util.modeler;
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
public class NoDescriptorRegistry$NoJmxMBeanServerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/util/modeler/NoDescriptorRegistry$NoJmxMBeanServer", null, "java/lang/Object", new String[] { "jakarta/management/MBeanServer" });

classWriter.visitInnerClass("org/apache/tomcat/util/modeler/NoDescriptorRegistry$NoJmxMBeanServer", "org/apache/tomcat/util/modeler/NoDescriptorRegistry", "NoJmxMBeanServer", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomcat/util/modeler/NoDescriptorRegistry$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMBean", "(Ljava/lang/String;Ljakarta/management/ObjectName;)Ljakarta/management/ObjectInstance;", null, new String[] { "jakarta/management/ReflectionException", "jakarta/management/InstanceAlreadyExistsException", "jakarta/management/MBeanRegistrationException", "jakarta/management/NotCompliantMBeanException", "jakarta/management/MBeanRegistrationException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMBean", "(Ljava/lang/String;Ljakarta/management/ObjectName;Ljakarta/management/ObjectName;)Ljakarta/management/ObjectInstance;", null, new String[] { "jakarta/management/ReflectionException", "jakarta/management/InstanceAlreadyExistsException", "jakarta/management/MBeanRegistrationException", "jakarta/management/NotCompliantMBeanException", "jakarta/management/InstanceNotFoundException", "jakarta/management/MBeanRegistrationException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMBean", "(Ljava/lang/String;Ljakarta/management/ObjectName;[Ljava/lang/Object;[Ljava/lang/String;)Ljakarta/management/ObjectInstance;", null, new String[] { "jakarta/management/ReflectionException", "jakarta/management/InstanceAlreadyExistsException", "jakarta/management/MBeanRegistrationException", "jakarta/management/NotCompliantMBeanException", "jakarta/management/MBeanRegistrationException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMBean", "(Ljava/lang/String;Ljakarta/management/ObjectName;Ljakarta/management/ObjectName;[Ljava/lang/Object;[Ljava/lang/String;)Ljakarta/management/ObjectInstance;", null, new String[] { "jakarta/management/ReflectionException", "jakarta/management/InstanceAlreadyExistsException", "jakarta/management/MBeanRegistrationException", "jakarta/management/NotCompliantMBeanException", "jakarta/management/InstanceNotFoundException", "jakarta/management/MBeanRegistrationException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "registerMBean", "(Ljava/lang/Object;Ljakarta/management/ObjectName;)Ljakarta/management/ObjectInstance;", null, new String[] { "jakarta/management/InstanceAlreadyExistsException", "jakarta/management/MBeanRegistrationException", "jakarta/management/NotCompliantMBeanException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unregisterMBean", "(Ljakarta/management/ObjectName;)V", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/MBeanRegistrationException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getObjectInstance", "(Ljakarta/management/ObjectName;)Ljakarta/management/ObjectInstance;", null, new String[] { "jakarta/management/InstanceNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "queryMBeans", "(Ljakarta/management/ObjectName;Ljakarta/management/QueryExp;)Ljava/util/Set;", "(Ljakarta/management/ObjectName;Ljakarta/management/QueryExp;)Ljava/util/Set<Ljakarta/management/ObjectInstance;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "queryNames", "(Ljakarta/management/ObjectName;Ljakarta/management/QueryExp;)Ljava/util/Set;", "(Ljakarta/management/ObjectName;Ljakarta/management/QueryExp;)Ljava/util/Set<Ljakarta/management/ObjectName;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isRegistered", "(Ljakarta/management/ObjectName;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMBeanCount", "()Ljava/lang/Integer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttribute", "(Ljakarta/management/ObjectName;Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "jakarta/management/MBeanException", "jakarta/management/AttributeNotFoundException", "jakarta/management/InstanceNotFoundException", "jakarta/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributes", "(Ljakarta/management/ObjectName;[Ljava/lang/String;)Ljakarta/management/AttributeList;", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAttribute", "(Ljakarta/management/ObjectName;Ljakarta/management/Attribute;)V", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/AttributeNotFoundException", "jakarta/management/InvalidAttributeValueException", "jakarta/management/MBeanException", "jakarta/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAttributes", "(Ljakarta/management/ObjectName;Ljakarta/management/AttributeList;)Ljakarta/management/AttributeList;", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "(Ljakarta/management/ObjectName;Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/MBeanException", "jakarta/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultDomain", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDomains", "()[Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addNotificationListener", "(Ljakarta/management/ObjectName;Ljakarta/management/NotificationListener;Ljakarta/management/NotificationFilter;Ljava/lang/Object;)V", null, new String[] { "jakarta/management/InstanceNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addNotificationListener", "(Ljakarta/management/ObjectName;Ljakarta/management/ObjectName;Ljakarta/management/NotificationFilter;Ljava/lang/Object;)V", null, new String[] { "jakarta/management/InstanceNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeNotificationListener", "(Ljakarta/management/ObjectName;Ljakarta/management/ObjectName;)V", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/ListenerNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeNotificationListener", "(Ljakarta/management/ObjectName;Ljakarta/management/ObjectName;Ljakarta/management/NotificationFilter;Ljava/lang/Object;)V", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/ListenerNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeNotificationListener", "(Ljakarta/management/ObjectName;Ljakarta/management/NotificationListener;)V", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/ListenerNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeNotificationListener", "(Ljakarta/management/ObjectName;Ljakarta/management/NotificationListener;Ljakarta/management/NotificationFilter;Ljava/lang/Object;)V", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/ListenerNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMBeanInfo", "(Ljakarta/management/ObjectName;)Ljakarta/management/MBeanInfo;", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/IntrospectionException", "jakarta/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isInstanceOf", "(Ljakarta/management/ObjectName;Ljava/lang/String;)Z", null, new String[] { "jakarta/management/InstanceNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "instantiate", "(Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "jakarta/management/ReflectionException", "jakarta/management/MBeanException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "instantiate", "(Ljava/lang/String;Ljakarta/management/ObjectName;)Ljava/lang/Object;", null, new String[] { "jakarta/management/ReflectionException", "jakarta/management/MBeanException", "jakarta/management/InstanceNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "instantiate", "(Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "jakarta/management/ReflectionException", "jakarta/management/MBeanException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "instantiate", "(Ljava/lang/String;Ljakarta/management/ObjectName;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "jakarta/management/ReflectionException", "jakarta/management/MBeanException", "jakarta/management/InstanceNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "deserialize", "(Ljakarta/management/ObjectName;[B)Ljava/io/ObjectInputStream;", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/OperationsException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "deserialize", "(Ljava/lang/String;[B)Ljava/io/ObjectInputStream;", null, new String[] { "jakarta/management/OperationsException", "jakarta/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "deserialize", "(Ljava/lang/String;Ljakarta/management/ObjectName;[B)Ljava/io/ObjectInputStream;", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/OperationsException", "jakarta/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClassLoaderFor", "(Ljakarta/management/ObjectName;)Ljava/lang/ClassLoader;", null, new String[] { "jakarta/management/InstanceNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClassLoader", "(Ljakarta/management/ObjectName;)Ljava/lang/ClassLoader;", null, new String[] { "jakarta/management/InstanceNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClassLoaderRepository", "()Ljavax/management/loading/ClassLoaderRepository;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/tomcat/util/modeler/NoDescriptorRegistry$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/modeler/NoDescriptorRegistry$NoJmxMBeanServer", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
