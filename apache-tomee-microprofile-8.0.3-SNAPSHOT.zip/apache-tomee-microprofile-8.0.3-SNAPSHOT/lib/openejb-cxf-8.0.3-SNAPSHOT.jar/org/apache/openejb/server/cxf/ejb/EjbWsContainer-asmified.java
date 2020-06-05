package asm.org.apache.openejb.server.cxf.ejb;
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
public class EjbWsContainerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", null, "org/apache/openejb/server/cxf/CxfWsContainer", null);

classWriter.visitInnerClass("org/apache/openejb/server/cxf/ejb/EjbWsContainer$WsServiceMBean", "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "WsServiceMBean", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "beanContext", "Lorg/apache/openejb/BeanContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "mbean", "Lorg/apache/openejb/server/cxf/ejb/EjbWsContainer$WsServiceMBean;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/Bus;Lorg/apache/cxf/transport/DestinationFactory;Lorg/apache/openejb/core/webservices/PortData;Lorg/apache/openejb/BeanContext;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/CxfWsContainer", "<init>", "(Lorg/apache/cxf/Bus;Lorg/apache/cxf/transport/DestinationFactory;Lorg/apache/openejb/core/webservices/PortData;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("deploymentInfo is null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openejb/server/cxf/ejb/EjbWsContainer", "org/apache/cxf/Bus", "org/apache/cxf/transport/DestinationFactory", "org/apache/openejb/core/webservices/PortData", "org/apache/openejb/BeanContext", "org/apache/openejb/assembler/classic/util/ServiceConfiguration"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "beanContext", "Lorg/apache/openejb/BeanContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createEndpoint", "()Lorg/apache/openejb/server/cxf/ejb/EjbEndpoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/cxf/ejb/EjbEndpoint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "bus", "Lorg/apache/cxf/Bus;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "port", "Lorg/apache/openejb/core/webservices/PortData;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "beanContext", "Lorg/apache/openejb/BeanContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "transportFactory", "Lorg/apache/cxf/transport/DestinationFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "serviceConfiguration", "Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/ejb/EjbEndpoint", "<init>", "(Lorg/apache/cxf/Bus;Lorg/apache/openejb/core/webservices/PortData;Lorg/apache/openejb/BeanContext;Lorg/apache/cxf/transport/DestinationFactory;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getFakeUrl", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "beanContext", "Lorg/apache/openejb/BeanContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext", "getEjbName", "()Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(CC)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("_ejb");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "beanContext", "Lorg/apache/openejb/BeanContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "registerMBean", "()Ljavax/management/ObjectName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/monitoring/ObjectNameBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("openejb.management");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/ObjectNameBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("j2eeType");
methodVisitor.visitLdcInsn("JAX-WS");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/ObjectNameBuilder", "set", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openejb/monitoring/ObjectNameBuilder;", false);
methodVisitor.visitLdcInsn("J2EEServer");
methodVisitor.visitLdcInsn("openejb");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/ObjectNameBuilder", "set", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openejb/monitoring/ObjectNameBuilder;", false);
methodVisitor.visitLdcInsn("J2EEApplication");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/ObjectNameBuilder", "set", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openejb/monitoring/ObjectNameBuilder;", false);
methodVisitor.visitLdcInsn("EndpointType");
methodVisitor.visitLdcInsn("EJB");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/ObjectNameBuilder", "set", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openejb/monitoring/ObjectNameBuilder;", false);
methodVisitor.visitLdcInsn("name");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "beanContext", "Lorg/apache/openejb/BeanContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext", "getEjbName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/ObjectNameBuilder", "set", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openejb/monitoring/ObjectNameBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/ObjectNameBuilder", "build", "()Ljavax/management/ObjectName;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/cxf/ejb/EjbWsContainer$WsServiceMBean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "beanContext", "Lorg/apache/openejb/BeanContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "port", "Lorg/apache/openejb/core/webservices/PortData;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/ejb/EjbWsContainer$WsServiceMBean", "<init>", "(Lorg/apache/openejb/server/cxf/ejb/EjbWsContainer;Lorg/apache/openejb/BeanContext;Lorg/apache/openejb/core/webservices/PortData;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "mbean", "Lorg/apache/openejb/server/cxf/ejb/EjbWsContainer$WsServiceMBean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "mbean", "Lorg/apache/openejb/server/cxf/ejb/EjbWsContainer$WsServiceMBean;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/monitoring/LocalMBeanServer", "registerDynamicWrapperSilently", "(Ljava/lang/Object;Ljavax/management/ObjectName;)Ljavax/management/ObjectInstance;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setWsldUrl", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "mbean", "Lorg/apache/openejb/server/cxf/ejb/EjbWsContainer$WsServiceMBean;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/ejb/EjbWsContainer$WsServiceMBean", "wsdl", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "createEndpoint", "()Lorg/apache/openejb/server/cxf/CxfEndpoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "createEndpoint", "()Lorg/apache/openejb/server/cxf/ejb/EjbEndpoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
