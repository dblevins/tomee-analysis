package asm.javax.management.j2ee;
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
public class ManagementDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/management/j2ee/Management", null, "java/lang/Object", new String[] { "jakarta/ejb/EJBObject" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttribute", "(Ljavax/management/ObjectName;Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "javax/management/MBeanException", "javax/management/AttributeNotFoundException", "javax/management/InstanceNotFoundException", "javax/management/ReflectionException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttributes", "(Ljavax/management/ObjectName;[Ljava/lang/String;)Ljavax/management/AttributeList;", null, new String[] { "javax/management/InstanceNotFoundException", "javax/management/ReflectionException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDefaultDomain", "()Ljava/lang/String;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMBeanCount", "()Ljava/lang/Integer;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMBeanInfo", "(Ljavax/management/ObjectName;)Ljavax/management/MBeanInfo;", null, new String[] { "javax/management/IntrospectionException", "javax/management/InstanceNotFoundException", "javax/management/ReflectionException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "invoke", "(Ljavax/management/ObjectName;Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "javax/management/InstanceNotFoundException", "javax/management/MBeanException", "javax/management/ReflectionException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isRegistered", "(Ljavax/management/ObjectName;)Z", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "queryNames", "(Ljavax/management/ObjectName;Ljavax/management/QueryExp;)Ljava/util/Set;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAttribute", "(Ljavax/management/ObjectName;Ljavax/management/Attribute;)V", null, new String[] { "javax/management/InstanceNotFoundException", "javax/management/AttributeNotFoundException", "javax/management/InvalidAttributeValueException", "javax/management/MBeanException", "javax/management/ReflectionException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAttributes", "(Ljavax/management/ObjectName;Ljavax/management/AttributeList;)Ljavax/management/AttributeList;", null, new String[] { "javax/management/InstanceNotFoundException", "javax/management/ReflectionException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getListenerRegistry", "()Ljavax/management/j2ee/ListenerRegistration;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
