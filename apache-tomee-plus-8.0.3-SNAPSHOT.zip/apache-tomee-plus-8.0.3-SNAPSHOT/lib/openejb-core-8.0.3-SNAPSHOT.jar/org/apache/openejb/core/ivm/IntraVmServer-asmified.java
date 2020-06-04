package asm.org.apache.openejb.core.ivm;
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
public class IntraVmServerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/core/ivm/IntraVmServer", null, "java/lang/Object", new String[] { "org/apache/openejb/spi/ApplicationServer" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEJBMetaData", "(Lorg/apache/openejb/ProxyInfo;)Ljavax/ejb/EJBMetaData;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/ProxyInfo", "getBeanContext", "()Lorg/apache/openejb/BeanContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/ivm/IntraVmMetaData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext", "getHomeInterface", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext", "getRemoteInterface", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext", "getComponentType", "()Lorg/apache/openejb/BeanType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/IntraVmMetaData", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Lorg/apache/openejb/BeanType;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/IntraVmServer", "getEJBHome", "(Lorg/apache/openejb/ProxyInfo;)Ljavax/ejb/EJBHome;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/IntraVmMetaData", "setEJBHome", "(Ljavax/ejb/EJBHome;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHandle", "(Lorg/apache/openejb/ProxyInfo;)Ljavax/ejb/Handle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/ivm/IntraVmHandle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/IntraVmServer", "getEJBObject", "(Lorg/apache/openejb/ProxyInfo;)Ljavax/ejb/EJBObject;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/IntraVmHandle", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHomeHandle", "(Lorg/apache/openejb/ProxyInfo;)Ljavax/ejb/HomeHandle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/ivm/IntraVmHandle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/IntraVmServer", "getEJBHome", "(Lorg/apache/openejb/ProxyInfo;)Ljavax/ejb/EJBHome;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/IntraVmHandle", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEJBObject", "(Lorg/apache/openejb/ProxyInfo;)Ljavax/ejb/EJBObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/ProxyInfo", "getBeanContext", "()Lorg/apache/openejb/BeanContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/ProxyInfo", "getPrimaryKey", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/ProxyInfo", "getInterfaceType", "()Lorg/apache/openejb/InterfaceType;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/ProxyInfo", "getInterfaces", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/ProxyInfo", "getInterface", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/EjbObjectProxyHandler", "createProxy", "(Lorg/apache/openejb/BeanContext;Ljava/lang/Object;Lorg/apache/openejb/InterfaceType;Ljava/util/List;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ejb/EJBObject");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBusinessObject", "(Lorg/apache/openejb/ProxyInfo;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/ProxyInfo", "getBeanContext", "()Lorg/apache/openejb/BeanContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/ProxyInfo", "getPrimaryKey", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/ProxyInfo", "getInterfaceType", "()Lorg/apache/openejb/InterfaceType;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/ProxyInfo", "getInterfaces", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/ProxyInfo", "getInterface", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/EjbObjectProxyHandler", "createProxy", "(Lorg/apache/openejb/BeanContext;Ljava/lang/Object;Lorg/apache/openejb/InterfaceType;Ljava/util/List;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEJBHome", "(Lorg/apache/openejb/ProxyInfo;)Ljavax/ejb/EJBHome;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/ProxyInfo", "getBeanContext", "()Lorg/apache/openejb/BeanContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/ProxyInfo", "getInterfaceType", "()Lorg/apache/openejb/InterfaceType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/EjbHomeProxyHandler", "createHomeProxy", "(Lorg/apache/openejb/BeanContext;Lorg/apache/openejb/InterfaceType;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ejb/EJBHome");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
