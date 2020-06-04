package asm.org.apache.openejb.mgmt;
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
public class MEJBBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/mgmt/MEJBBean", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/ejb/Singleton;", true);
annotationVisitor0.visit("name", "MEJB");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/ejb/Lock;", true);
annotationVisitor0.visitEnum("value", "Ljakarta/ejb/LockType;", "READ");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/ejb/RemoteHome;", true);
annotationVisitor0.visit("value", Type.getType("Ljakarta/management/j2ee/ManagementHome;"));
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mbeanServer", "Ljakarta/management/MBeanServer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/management/MBeanServerFactory", "findMBeanServer", "(Ljava/lang/String;)Ljava/util/ArrayList;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/management/MBeanServer");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/mgmt/MEJBBean", "mbeanServer", "Ljakarta/management/MBeanServer;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openejb/mgmt/MEJBBean", "java/util/List"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/management/MBeanServerFactory", "createMBeanServer", "()Ljakarta/management/MBeanServer;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/mgmt/MEJBBean", "mbeanServer", "Ljakarta/management/MBeanServer;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttribute", "(Ljakarta/management/ObjectName;Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "jakarta/management/MBeanException", "jakarta/management/AttributeNotFoundException", "jakarta/management/InstanceNotFoundException", "jakarta/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/mgmt/MEJBBean", "mbeanServer", "Ljakarta/management/MBeanServer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/management/MBeanServer", "getAttribute", "(Ljakarta/management/ObjectName;Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributes", "(Ljakarta/management/ObjectName;[Ljava/lang/String;)Ljakarta/management/AttributeList;", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/mgmt/MEJBBean", "mbeanServer", "Ljakarta/management/MBeanServer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/management/MBeanServer", "getAttributes", "(Ljakarta/management/ObjectName;[Ljava/lang/String;)Ljakarta/management/AttributeList;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultDomain", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/mgmt/MEJBBean", "mbeanServer", "Ljakarta/management/MBeanServer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/management/MBeanServer", "getDefaultDomain", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMBeanCount", "()Ljava/lang/Integer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/mgmt/MEJBBean", "mbeanServer", "Ljakarta/management/MBeanServer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/management/MBeanServer", "getMBeanCount", "()Ljava/lang/Integer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMBeanInfo", "(Ljakarta/management/ObjectName;)Ljakarta/management/MBeanInfo;", null, new String[] { "jakarta/management/IntrospectionException", "jakarta/management/InstanceNotFoundException", "jakarta/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/mgmt/MEJBBean", "mbeanServer", "Ljakarta/management/MBeanServer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/management/MBeanServer", "getMBeanInfo", "(Ljakarta/management/ObjectName;)Ljakarta/management/MBeanInfo;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "(Ljakarta/management/ObjectName;Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/MBeanException", "jakarta/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/mgmt/MEJBBean", "mbeanServer", "Ljakarta/management/MBeanServer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/management/MBeanServer", "invoke", "(Ljakarta/management/ObjectName;Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isRegistered", "(Ljakarta/management/ObjectName;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/mgmt/MEJBBean", "mbeanServer", "Ljakarta/management/MBeanServer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/management/MBeanServer", "isRegistered", "(Ljakarta/management/ObjectName;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "queryNames", "(Ljakarta/management/ObjectName;Ljakarta/management/QueryExp;)Ljava/util/Set;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/mgmt/MEJBBean", "mbeanServer", "Ljakarta/management/MBeanServer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/management/MBeanServer", "queryNames", "(Ljakarta/management/ObjectName;Ljakarta/management/QueryExp;)Ljava/util/Set;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAttribute", "(Ljakarta/management/ObjectName;Ljakarta/management/Attribute;)V", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/AttributeNotFoundException", "jakarta/management/InvalidAttributeValueException", "jakarta/management/MBeanException", "jakarta/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/mgmt/MEJBBean", "mbeanServer", "Ljakarta/management/MBeanServer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/management/MBeanServer", "setAttribute", "(Ljakarta/management/ObjectName;Ljakarta/management/Attribute;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAttributes", "(Ljakarta/management/ObjectName;Ljakarta/management/AttributeList;)Ljakarta/management/AttributeList;", null, new String[] { "jakarta/management/InstanceNotFoundException", "jakarta/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/mgmt/MEJBBean", "mbeanServer", "Ljakarta/management/MBeanServer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/management/MBeanServer", "setAttributes", "(Ljakarta/management/ObjectName;Ljakarta/management/AttributeList;)Ljakarta/management/AttributeList;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getListenerRegistry", "()Ljakarta/management/j2ee/ListenerRegistration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
