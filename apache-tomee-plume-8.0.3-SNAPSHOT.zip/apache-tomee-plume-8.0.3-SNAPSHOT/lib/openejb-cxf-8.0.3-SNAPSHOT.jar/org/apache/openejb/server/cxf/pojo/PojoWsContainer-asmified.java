package asm.org.apache.openejb.server.cxf.pojo;
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
public class PojoWsContainerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", null, "org/apache/openejb/server/cxf/CxfWsContainer", null);

classWriter.visitInnerClass("org/apache/openejb/server/cxf/pojo/PojoWsContainer$WsServiceMBean", "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "WsServiceMBean", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "context", "Ljavax/naming/Context;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "target", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "bindings", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "loader", "Ljava/lang/ClassLoader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "mbean", "Lorg/apache/openejb/server/cxf/pojo/PojoWsContainer$WsServiceMBean;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/ClassLoader;Lorg/apache/cxf/transport/DestinationFactory;Lorg/apache/cxf/Bus;Lorg/apache/openejb/core/webservices/PortData;Ljavax/naming/Context;Ljava/lang/Class;Ljava/util/Map;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", "(Ljava/lang/ClassLoader;Lorg/apache/cxf/transport/DestinationFactory;Lorg/apache/cxf/Bus;Lorg/apache/openejb/core/webservices/PortData;Ljavax/naming/Context;Ljava/lang/Class;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/CxfWsContainer", "<init>", "(Lorg/apache/cxf/Bus;Lorg/apache/cxf/transport/DestinationFactory;Lorg/apache/openejb/core/webservices/PortData;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("target is null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/openejb/server/cxf/pojo/PojoWsContainer", "java/lang/ClassLoader", "org/apache/cxf/transport/DestinationFactory", "org/apache/cxf/Bus", "org/apache/openejb/core/webservices/PortData", "javax/naming/Context", "java/lang/Class", "java/util/Map", "org/apache/openejb/assembler/classic/util/ServiceConfiguration"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "context", "Ljavax/naming/Context;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "target", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "bindings", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "loader", "Ljava/lang/ClassLoader;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getFakeUrl", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Class;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "target", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Class;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "target", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/StringBuilder"});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "target", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/openejb/server/cxf/pojo/PojoWsContainer"}, 2, new Object[] {"java/lang/StringBuilder", "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("_");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createEndpoint", "()Lorg/apache/openejb/server/cxf/pojo/PojoEndpoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/cxf/pojo/PojoEndpoint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "loader", "Ljava/lang/ClassLoader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "bus", "Lorg/apache/cxf/Bus;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "port", "Lorg/apache/openejb/core/webservices/PortData;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "context", "Ljavax/naming/Context;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "target", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "transportFactory", "Lorg/apache/cxf/transport/DestinationFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "bindings", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "serviceConfiguration", "Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/pojo/PojoEndpoint", "<init>", "(Ljava/lang/ClassLoader;Lorg/apache/cxf/Bus;Lorg/apache/openejb/core/webservices/PortData;Ljavax/naming/Context;Ljava/lang/Class;Lorg/apache/cxf/transport/DestinationFactory;Ljava/util/Map;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(10, 1);
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
methodVisitor.visitLdcInsn("POJO");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/ObjectNameBuilder", "set", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openejb/monitoring/ObjectNameBuilder;", false);
methodVisitor.visitLdcInsn("name");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "target", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/ObjectNameBuilder", "set", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openejb/monitoring/ObjectNameBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/ObjectNameBuilder", "build", "()Ljavax/management/ObjectName;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/cxf/pojo/PojoWsContainer$WsServiceMBean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "context", "Ljavax/naming/Context;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "target", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "port", "Lorg/apache/openejb/core/webservices/PortData;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/pojo/PojoWsContainer$WsServiceMBean", "<init>", "(Lorg/apache/openejb/server/cxf/pojo/PojoWsContainer;Ljavax/naming/Context;Ljava/lang/Class;Lorg/apache/openejb/core/webservices/PortData;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "mbean", "Lorg/apache/openejb/server/cxf/pojo/PojoWsContainer$WsServiceMBean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "mbean", "Lorg/apache/openejb/server/cxf/pojo/PojoWsContainer$WsServiceMBean;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/monitoring/LocalMBeanServer", "registerDynamicWrapperSilently", "(Ljava/lang/Object;Ljavax/management/ObjectName;)Ljavax/management/ObjectInstance;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setWsldUrl", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "mbean", "Lorg/apache/openejb/server/cxf/pojo/PojoWsContainer$WsServiceMBean;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/pojo/PojoWsContainer$WsServiceMBean", "wsdl", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "createEndpoint", "()Lorg/apache/openejb/server/cxf/CxfEndpoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "createEndpoint", "()Lorg/apache/openejb/server/cxf/pojo/PojoEndpoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
