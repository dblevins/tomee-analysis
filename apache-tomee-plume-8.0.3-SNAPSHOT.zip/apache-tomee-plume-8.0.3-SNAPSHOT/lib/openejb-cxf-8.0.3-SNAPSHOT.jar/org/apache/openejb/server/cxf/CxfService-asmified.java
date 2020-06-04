package asm.org.apache.openejb.server.cxf;
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
public class CxfServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/server/cxf/CxfService", null, "org/apache/openejb/server/webservices/WsService", null);

classWriter.visitInnerClass("org/apache/openejb/core/ivm/naming/JaxWsServiceReference$WebServiceClientCustomizer", "org/apache/openejb/core/ivm/naming/JaxWsServiceReference", "WebServiceClientCustomizer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openejb/util/AppFinder$AppContextTransformer", "org/apache/openejb/util/AppFinder", "AppContextTransformer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/util/AppFinder$Transformer", "org/apache/openejb/util/AppFinder", "Transformer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_JAXWS_CXF_FEATURES", "Ljava/lang/String;", null, "features");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "wsContainers", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/apache/openejb/server/cxf/CxfWsContainer;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "transportFactory", "Lorg/apache/cxf/binding/soap/SoapTransportFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "factoryByListener", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/WsService", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/TreeMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/TreeMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/CxfService", "wsContainers", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("cxf");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(Ljava/util/Properties;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/WsService", "init", "(Ljava/util/Properties;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/transport/util/CxfUtil", "configureBus", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/client/SaajInterceptor", "registerInterceptors", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("openejb.cxf.factoryByListener");
methodVisitor.visitLdcInsn("false");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "getProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/CxfService", "factoryByListener", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/binding/soap/SoapTransportFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/soap/SoapTransportFactory", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/CxfService", "transportFactory", "Lorg/apache/cxf/binding/soap/SoapTransportFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/core/ivm/naming/JaxWsServiceReference$WebServiceClientCustomizer;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "getComponent", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/core/ivm/naming/JaxWsServiceReference$WebServiceClientCustomizer;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/cxf/client/WebServiceInjectionConfigurator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/client/WebServiceInjectionConfigurator", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "setComponent", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "()V", null, new String[] { "org/apache/openejb/server/ServiceException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/WsService", "stop", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/transport/util/CxfUtil", "release", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setWsdl", "(Lorg/apache/openejb/server/httpd/HttpListener;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/server/cxf/CxfWsContainer;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/server/cxf/CxfWsContainer;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/server/cxf/CxfWsContainer");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/CxfWsContainer", "setWsldUrl", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "newTransportFactory", "()Lorg/apache/cxf/binding/soap/SoapTransportFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/CxfService", "factoryByListener", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/CxfService", "transportFactory", "Lorg/apache/cxf/binding/soap/SoapTransportFactory;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/binding/soap/SoapTransportFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/soap/SoapTransportFactory", "<init>", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/cxf/binding/soap/SoapTransportFactory"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createEjbWsContainer", "(Ljava/net/URL;Lorg/apache/openejb/core/webservices/PortData;Lorg/apache/openejb/BeanContext;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)Lorg/apache/openejb/server/httpd/HttpListener;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/transport/util/CxfUtil", "getBus", "()Lorg/apache/cxf/Bus;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/transport/util/CxfUtil", "initBusLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("META-INF/jax-ws-catalog.xml");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/CxfCatalogUtils", "loadOASISCatalog", "(Lorg/apache/cxf/Bus;Ljava/net/URL;Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/cxf/ejb/EjbWsContainer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/CxfService", "newTransportFactory", "()Lorg/apache/cxf/binding/soap/SoapTransportFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "<init>", "(Lorg/apache/cxf/Bus;Lorg/apache/cxf/transport/DestinationFactory;Lorg/apache/openejb/core/webservices/PortData;Lorg/apache/openejb/BeanContext;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "start", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/CxfService", "wsContainers", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext", "getDeploymentID", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/cxf/event/ServerCreated");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "getEndpoint", "()Lorg/apache/openejb/server/cxf/CxfEndpoint;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/CxfEndpoint", "getServer", "()Lorg/apache/cxf/endpoint/ServerImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext", "getModuleContext", "()Lorg/apache/openejb/ModuleContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/ModuleContext", "getAppContext", "()Lorg/apache/openejb/AppContext;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/event/ServerCreated", "<init>", "(Lorg/apache/cxf/endpoint/Server;Lorg/apache/openejb/AppContext;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "fireEvent", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/transport/util/CxfUtil", "clearBusLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/openejb/server/cxf/CxfService", "java/net/URL", "org/apache/openejb/core/webservices/PortData", "org/apache/openejb/BeanContext", "org/apache/openejb/assembler/classic/util/ServiceConfiguration", "org/apache/cxf/Bus", "java/lang/ClassLoader", "org/apache/openejb/server/cxf/ejb/EjbWsContainer", "org/apache/openejb/server/httpd/HttpListener"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/openejb/server/cxf/CxfService", "java/net/URL", "org/apache/openejb/core/webservices/PortData", "org/apache/openejb/BeanContext", "org/apache/openejb/assembler/classic/util/ServiceConfiguration", "org/apache/cxf/Bus", "java/lang/ClassLoader"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/transport/util/CxfUtil", "clearBusLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(7, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createPojoWsContainer", "(Ljava/lang/ClassLoader;Ljava/net/URL;Lorg/apache/openejb/core/webservices/PortData;Ljava/lang/String;Ljava/lang/Class;Ljavax/naming/Context;Ljava/lang/String;Ljava/util/Map;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)Lorg/apache/openejb/server/httpd/HttpListener;", "(Ljava/lang/ClassLoader;Ljava/net/URL;Lorg/apache/openejb/core/webservices/PortData;Ljava/lang/String;Ljava/lang/Class;Ljavax/naming/Context;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)Lorg/apache/openejb/server/httpd/HttpListener;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/transport/util/CxfUtil", "getBus", "()Lorg/apache/cxf/Bus;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/transport/util/CxfUtil", "initBusLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("META-INF/jax-ws-catalog.xml");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/CxfCatalogUtils", "loadOASISCatalog", "(Lorg/apache/cxf/Bus;Ljava/net/URL;Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/cxf/pojo/PojoWsContainer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/CxfService", "newTransportFactory", "()Lorg/apache/cxf/binding/soap/SoapTransportFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "<init>", "(Ljava/lang/ClassLoader;Lorg/apache/cxf/transport/DestinationFactory;Lorg/apache/cxf/Bus;Lorg/apache/openejb/core/webservices/PortData;Ljavax/naming/Context;Ljava/lang/Class;Ljava/util/Map;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "start", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/CxfService", "wsContainers", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/cxf/event/ServerCreated");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "getEndpoint", "()Lorg/apache/openejb/server/cxf/CxfEndpoint;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/CxfEndpoint", "getServer", "()Lorg/apache/cxf/endpoint/ServerImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/AppFinder$AppContextTransformer", "INSTANCE", "Lorg/apache/openejb/util/AppFinder$Transformer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/AppFinder", "findAppContextOrWeb", "(Ljava/lang/ClassLoader;Lorg/apache/openejb/util/AppFinder$Transformer;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/AppContext");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/event/ServerCreated", "<init>", "(Lorg/apache/cxf/endpoint/Server;Lorg/apache/openejb/AppContext;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "fireEvent", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 11);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/transport/util/CxfUtil", "clearBusLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 14, new Object[] {"org/apache/openejb/server/cxf/CxfService", "java/lang/ClassLoader", "java/net/URL", "org/apache/openejb/core/webservices/PortData", "java/lang/String", "java/lang/Class", "javax/naming/Context", "java/lang/String", "java/util/Map", "org/apache/openejb/assembler/classic/util/ServiceConfiguration", "org/apache/cxf/Bus", "java/lang/ClassLoader", "org/apache/openejb/server/cxf/pojo/PojoWsContainer", "org/apache/openejb/server/httpd/HttpListener"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/apache/openejb/server/cxf/CxfService", "java/lang/ClassLoader", "java/net/URL", "org/apache/openejb/core/webservices/PortData", "java/lang/String", "java/lang/Class", "javax/naming/Context", "java/lang/String", "java/util/Map", "org/apache/openejb/assembler/classic/util/ServiceConfiguration", "org/apache/cxf/Bus", "java/lang/ClassLoader"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 11);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/transport/util/CxfUtil", "clearBusLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(10, 15);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "destroyPojoWsContainer", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/CxfService", "destroyWsContainer", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "destroyEjbWsContainer", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/CxfService", "destroyWsContainer", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "destroyWsContainer", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/CxfService", "wsContainers", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/server/cxf/CxfWsContainer");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/transport/util/CxfUtil", "initBusLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/CxfWsContainer", "destroy", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/cxf/event/ServerDestroyed");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/CxfWsContainer", "getEndpoint", "()Lorg/apache/openejb/server/cxf/CxfEndpoint;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/CxfEndpoint", "getServer", "()Lorg/apache/cxf/endpoint/ServerImpl;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/event/ServerDestroyed", "<init>", "(Lorg/apache/cxf/endpoint/Server;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "fireEvent", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/transport/util/CxfUtil", "clearBusLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/openejb/server/cxf/CxfService", "java/lang/String", "org/apache/openejb/server/cxf/CxfWsContainer", "java/lang/ClassLoader"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/transport/util/CxfUtil", "clearBusLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
