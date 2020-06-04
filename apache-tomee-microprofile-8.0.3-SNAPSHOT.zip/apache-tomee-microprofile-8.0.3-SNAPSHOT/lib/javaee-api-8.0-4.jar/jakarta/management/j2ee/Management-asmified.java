package asm.jakarta.management.j2ee;
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

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/management/j2ee/Management", null, "java/lang/Object", new String[] { "jakarta/ejb/EJBObject" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttribute", "(Ljakarta/management/ObjectName;Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "jakarta/management/MBeanException", "jakarta/management/AttributeNotFoundException", "jakarta/management/InstanceNotFoundException", "jakarta/management/ReflectionException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttributes", "(Ljakarta/management/ObjectName;[Ljava/lang/String;)Ljakarta/management/AttributeList;", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/ReflectionException", "java/rmi/RemoteException" });
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMBeanInfo", "(Ljakarta/management/ObjectName;)Ljakarta/management/MBeanInfo;", null, new String[] { "jakarta/management/IntrospectionException", "jakarta/management/InstanceNotFoundException", "jakarta/management/ReflectionException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "invoke", "(Ljakarta/management/ObjectName;Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/MBeanException", "jakarta/management/ReflectionException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isRegistered", "(Ljakarta/management/ObjectName;)Z", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "queryNames", "(Ljakarta/management/ObjectName;Ljakarta/management/QueryExp;)Ljava/util/Set;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAttribute", "(Ljakarta/management/ObjectName;Ljakarta/management/Attribute;)V", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/AttributeNotFoundException", "jakarta/management/InvalidAttributeValueException", "jakarta/management/MBeanException", "jakarta/management/ReflectionException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAttributes", "(Ljakarta/management/ObjectName;Ljakarta/management/AttributeList;)Ljakarta/management/AttributeList;", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/ReflectionException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getListenerRegistry", "()Ljakarta/management/j2ee/ListenerRegistration;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
