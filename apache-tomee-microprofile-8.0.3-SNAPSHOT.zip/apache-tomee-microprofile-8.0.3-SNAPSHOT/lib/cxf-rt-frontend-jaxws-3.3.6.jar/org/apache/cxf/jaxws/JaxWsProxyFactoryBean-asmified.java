package asm.org.apache.cxf.jaxws;
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
public class JaxWsProxyFactoryBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", null, "org/apache/cxf/frontend/ClientProxyFactoryBean", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/cxf/common/injection/NoJSR250Annotations;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder", "org/apache/cxf/common/classloader/ClassLoaderUtils", "ClassLoaderHolder", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "handlers", "Ljava/util/List;", "Ljava/util/List<Ljakarta/xml/ws/handler/Handler;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "loadHandlers", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxws/JaxWsClientFactoryBean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxws/JaxWsClientFactoryBean", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/frontend/ClientProxyFactoryBean", "<init>", "(Lorg/apache/cxf/frontend/ClientFactoryBean;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "handlers", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "loadHandlers", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/frontend/ClientFactoryBean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/frontend/ClientProxyFactoryBean", "<init>", "(Lorg/apache/cxf/frontend/ClientFactoryBean;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "handlers", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "loadHandlers", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getConfiguredName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "getEndpointName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "getClientFactoryBean", "()Lorg/apache/cxf/frontend/ClientFactoryBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/frontend/ClientFactoryBean", "getServiceFactory", "()Lorg/apache/cxf/wsdl/service/factory/ReflectionServiceFactoryBean;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxws/support/JaxWsServiceFactoryBean");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/support/JaxWsServiceFactoryBean", "getJaxWsImplementorInfo", "()Lorg/apache/cxf/jaxws/support/JaxWsImplementorInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/support/JaxWsImplementorInfo", "getEndpointName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/xml/namespace/QName"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(".jaxws-client.proxyFactory");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setHandlers", "(Ljava/util/List;)V", "(Ljava/util/List<Ljakarta/xml/ws/handler/Handler;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "handlers", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "handlers", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHandlers", "()Ljava/util/List;", "()Ljava/util/List<Ljakarta/xml/ws/handler/Handler;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "handlers", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLoadHandlers", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "loadHandlers", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isLoadHandlers", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "loadHandlers", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "clientClientProxy", "(Lorg/apache/cxf/endpoint/Client;)Lorg/apache/cxf/frontend/ClientProxy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxws/JaxWsClientProxy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/endpoint/Client", "getEndpoint", "()Lorg/apache/cxf/endpoint/Endpoint;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxws/support/JaxWsEndpointImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/support/JaxWsEndpointImpl", "getJaxwsBinding", "()Ljakarta/xml/ws/Binding;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxws/JaxWsClientProxy", "<init>", "(Lorg/apache/cxf/endpoint/Client;Ljakarta/xml/ws/Binding;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/JaxWsClientProxy", "getRequestContext", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "getProperties", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "putAll", "(Ljava/util/Map;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "buildHandlerChain", "(Lorg/apache/cxf/jaxws/JaxWsClientProxy;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getImplementingClasses", "()[Ljava/lang/Class;", "()[Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "getClientFactoryBean", "()Lorg/apache/cxf/frontend/ClientFactoryBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/frontend/ClientFactoryBean", "getServiceClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/xml/ws/BindingProvider;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn(Type.getType("Ljava/io/Closeable;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/endpoint/Client;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "create", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "getBus", "()Lorg/apache/cxf/Bus;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "getBus", "()Lorg/apache/cxf/Bus;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/ClassLoader;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/Bus", "getExtension", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/ClassLoader");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/classloader/ClassLoaderUtils", "setThreadContextClassloader", "(Ljava/lang/ClassLoader;)Lorg/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/frontend/ClientProxyFactoryBean", "create", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "getServiceFactory", "()Lorg/apache/cxf/wsdl/service/factory/ReflectionServiceFactoryBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/wsdl/service/factory/ReflectionServiceFactoryBean", "getService", "()Lorg/apache/cxf/service/Service;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/service/Service", "getServiceInfos", "()Ljava/util/List;", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/service/model/ServiceInfo");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "needWrapperClassInterceptor", "(Lorg/apache/cxf/service/model/ServiceInfo;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/frontend/ClientProxyFactoryBean", "getInInterceptors", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/frontend/ClientProxyFactoryBean", "getOutInterceptors", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxws/interceptors/WrapperClassInInterceptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxws/interceptors/WrapperClassInInterceptor", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxws/interceptors/HolderInInterceptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxws/interceptors/HolderInInterceptor", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxws/interceptors/WrapperClassOutInterceptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxws/interceptors/WrapperClassOutInterceptor", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxws/interceptors/HolderOutInterceptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxws/interceptors/HolderOutInterceptor", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", "org/apache/cxf/service/Service"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder", "reset", "()V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder", "reset", "()V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder", Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "needWrapperClassInterceptor", "(Lorg/apache/cxf/service/model/ServiceInfo;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/ServiceInfo", "getInterface", "()Lorg/apache/cxf/service/model/InterfaceInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/InterfaceInfo", "getOperations", "()Ljava/util/Collection;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/service/model/OperationInfo");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/OperationInfo", "isUnwrappedCapable", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("wrapper.gen.needed");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/OperationInfo", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "buildHandlerChain", "(Lorg/apache/cxf/jaxws/JaxWsClientProxy;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxws/handler/AnnotationHandlerChainBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxws/handler/AnnotationHandlerChainBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "getServiceFactory", "()Lorg/apache/cxf/wsdl/service/factory/ReflectionServiceFactoryBean;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxws/support/JaxWsServiceFactoryBean");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "handlers", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "loadHandlers", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/support/JaxWsServiceFactoryBean", "getServiceClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/support/JaxWsServiceFactoryBean", "getEndpointInfo", "()Lorg/apache/cxf/service/model/EndpointInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/EndpointInfo", "getName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/support/JaxWsServiceFactoryBean", "getServiceQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "getBindingId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/handler/AnnotationHandlerChainBuilder", "buildHandlerChainFromClass", "(Ljava/lang/Class;Ljavax/xml/namespace/QName;Ljavax/xml/namespace/QName;Ljava/lang/String;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/cxf/jaxws/handler/AnnotationHandlerChainBuilder", "org/apache/cxf/jaxws/support/JaxWsServiceFactoryBean", "java/util/List"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "getBus", "()Lorg/apache/cxf/Bus;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/resource/ResourceManager;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/Bus", "getExtension", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/resource/ResourceManager");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/resource/ResourceManager", "getResourceResolvers", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/resource/DefaultResourceManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/resource/DefaultResourceManager", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxws/context/WebServiceContextResourceResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxws/context/WebServiceContextResourceResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/resource/ResourceManager", "addResourceResolver", "(Lorg/apache/cxf/resource/ResourceResolver;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/injection/ResourceInjector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/injection/ResourceInjector", "<init>", "(Lorg/apache/cxf/resource/ResourceManager;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "org/apache/cxf/jaxws/JaxWsClientProxy", "org/apache/cxf/jaxws/handler/AnnotationHandlerChainBuilder", "org/apache/cxf/jaxws/support/JaxWsServiceFactoryBean", "java/util/List", "org/apache/cxf/resource/ResourceManager", "java/util/List", "org/apache/cxf/common/injection/ResourceInjector", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/xml/ws/handler/Handler");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Proxy", "isProxyClass", "(Ljava/lang/Class;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "getServiceClass", "()Ljava/lang/Class;", false);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "getServiceClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/injection/ResourceInjector", "inject", "(Ljava/lang/Object;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "getServiceClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/injection/ResourceInjector", "construct", "(Ljava/lang/Object;Ljava/lang/Class;)V", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"jakarta/xml/ws/handler/Handler"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/injection/ResourceInjector", "inject", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/injection/ResourceInjector", "construct", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/cxf/jaxws/JaxWsProxyFactoryBean", "org/apache/cxf/jaxws/JaxWsClientProxy", "org/apache/cxf/jaxws/handler/AnnotationHandlerChainBuilder", "org/apache/cxf/jaxws/support/JaxWsServiceFactoryBean", "java/util/List"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/JaxWsClientProxy", "getBinding", "()Ljakarta/xml/ws/Binding;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/ws/Binding", "setHandlerChain", "(Ljava/util/List;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 10);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
