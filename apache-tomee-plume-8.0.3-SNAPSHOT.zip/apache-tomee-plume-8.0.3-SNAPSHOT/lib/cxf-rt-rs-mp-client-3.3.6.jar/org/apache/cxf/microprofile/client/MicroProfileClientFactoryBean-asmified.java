package asm.org.apache.cxf.microprofile.client;
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
public class MicroProfileClientFactoryBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", null, "org/apache/cxf/jaxrs/client/JAXRSClientFactoryBean", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "comparator", "Ljava/util/Comparator;", "Ljava/util/Comparator<Lorg/apache/cxf/jaxrs/model/ProviderInfo<*>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "registeredProviders", "Ljava/util/List;", "Ljava/util/List<Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "configuration", "Ljavax/ws/rs/core/Configuration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "proxyLoader", "Ljava/lang/ClassLoader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "inheritHeaders", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "executorService", "Ljava/util/concurrent/ExecutorService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl;Ljava/lang/String;Ljava/lang/Class;Ljava/util/concurrent/ExecutorService;Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;)V", "(Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl<Lorg/eclipse/microprofile/rest/client/RestClientBuilder;>;Ljava/lang/String;Ljava/lang/Class<*>;Ljava/util/concurrent/ExecutorService;Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/microprofile/client/MicroProfileServiceFactoryBean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/microprofile/client/MicroProfileServiceFactoryBean", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/JAXRSClientFactoryBean", "<init>", "(Lorg/apache/cxf/jaxrs/JAXRSServiceFactoryBean;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl", "getConfiguration", "()Ljavax/ws/rs/core/Configuration;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "configuration", "Ljavax/ws/rs/core/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "createComparator", "(Lorg/apache/cxf/microprofile/client/MicroProfileClientFactoryBean;)Ljava/util/Comparator;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "comparator", "Ljava/util/Comparator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "executorService", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/JAXRSClientFactoryBean", "setAddress", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/JAXRSClientFactoryBean", "setServiceClass", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "comparator", "Ljava/util/Comparator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/JAXRSClientFactoryBean", "setProviderComparator", "(Ljava/util/Comparator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "registeredProviders", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "registeredProviders", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "processProviders", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl", "isDefaultExceptionMapperDisabled", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "registeredProviders", "Ljava/util/List;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/model/ProviderInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/microprofile/client/DefaultResponseExceptionMapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/microprofile/client/DefaultResponseExceptionMapper", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "getBus", "()Lorg/apache/cxf/Bus;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/model/ProviderInfo", "<init>", "(Ljava/lang/Object;Lorg/apache/cxf/Bus;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "org/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl", "java/lang/String", "java/lang/Class", "java/util/concurrent/ExecutorService", "org/apache/cxf/jaxrs/client/spec/TLSConfiguration"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "registeredProviders", "Ljava/util/List;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/model/ProviderInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/provider/jsrjsonp/JsrJsonpProvider");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/provider/jsrjsonp/JsrJsonpProvider", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "getBus", "()Lorg/apache/cxf/Bus;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/model/ProviderInfo", "<init>", "(Ljava/lang/Object;Lorg/apache/cxf/Bus;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "registeredProviders", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/JAXRSClientFactoryBean", "setProviders", "(Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setClassLoader", "(Ljava/lang/ClassLoader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/JAXRSClientFactoryBean", "setClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "proxyLoader", "Ljava/lang/ClassLoader;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInheritHeaders", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/JAXRSClientFactoryBean", "setInheritHeaders", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "inheritHeaders", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExecutorService", "()Ljava/util/concurrent/ExecutorService;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "executorService", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initClient", "(Lorg/apache/cxf/jaxrs/client/AbstractClient;Lorg/apache/cxf/endpoint/Endpoint;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/JAXRSClientFactoryBean", "initClient", "(Lorg/apache/cxf/jaxrs/client/AbstractClient;Lorg/apache/cxf/endpoint/Endpoint;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration", "getTlsClientParams", "()Lorg/apache/cxf/configuration/jsse/TLSClientParameters;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/jsse/TLSClientParameters", "getSSLSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/jsse/TLSClientParameters", "getTrustManagers", "()[Ljavax/net/ssl/TrustManager;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/jsse/TLSClientParameters", "getHostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/configuration/jsse/TLSClientParameters"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AbstractClient", "getConfiguration", "()Lorg/apache/cxf/jaxrs/client/ClientConfiguration;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/ClientConfiguration", "getHttpConduit", "()Lorg/apache/cxf/transport/http/HTTPConduit;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/HTTPConduit", "setTlsClientParameters", "(Lorg/apache/cxf/configuration/jsse/TLSClientParameters;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "getBus", "()Lorg/apache/cxf/Bus;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "comparator", "Ljava/util/Comparator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "createInstance", "(Lorg/apache/cxf/Bus;Ljava/util/Comparator;)Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "registeredProviders", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "setUserProviders", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "CLIENT_FACTORY_NAME", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/endpoint/Endpoint", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createClientProxy", "(Lorg/apache/cxf/jaxrs/model/ClassResourceInfo;ZLorg/apache/cxf/jaxrs/client/ClientState;[Ljava/lang/Object;)Lorg/apache/cxf/jaxrs/client/ClientProxyImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "getServiceClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/microprofile/client/cdi/CDIInterceptorWrapper", "createWrapper", "(Ljava/lang/Class;)Lorg/apache/cxf/microprofile/client/cdi/CDIInterceptorWrapper;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/microprofile/client/proxy/MicroProfileClientProxyImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "getAddress", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/net/URI", "create", "(Ljava/lang/String;)Ljava/net/URI;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "proxyLoader", "Ljava/lang/ClassLoader;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "inheritHeaders", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "executorService", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "configuration", "Ljavax/ws/rs/core/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/microprofile/client/proxy/MicroProfileClientProxyImpl", "<init>", "(Ljava/net/URI;Ljava/lang/ClassLoader;Lorg/apache/cxf/jaxrs/model/ClassResourceInfo;ZZLjava/util/concurrent/ExecutorService;Ljavax/ws/rs/core/Configuration;Lorg/apache/cxf/microprofile/client/cdi/CDIInterceptorWrapper;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/microprofile/client/cdi/CDIInterceptorWrapper"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/microprofile/client/proxy/MicroProfileClientProxyImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "proxyLoader", "Ljava/lang/ClassLoader;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "inheritHeaders", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "executorService", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "configuration", "Ljavax/ws/rs/core/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/microprofile/client/proxy/MicroProfileClientProxyImpl", "<init>", "(Lorg/apache/cxf/jaxrs/client/ClientState;Ljava/lang/ClassLoader;Lorg/apache/cxf/jaxrs/model/ClassResourceInfo;ZZLjava/util/concurrent/ExecutorService;Ljavax/ws/rs/core/Configuration;Lorg/apache/cxf/microprofile/client/cdi/CDIInterceptorWrapper;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(14, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getConfiguration", "()Ljavax/ws/rs/core/Configuration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "configuration", "Ljavax/ws/rs/core/Configuration;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "processProviders", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedHashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "configuration", "Ljavax/ws/rs/core/Configuration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/Configuration", "getInstances", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Set", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "getBus", "()Lorg/apache/cxf/Bus;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/ClassHelper", "getRealClass", "(Lorg/apache/cxf/Bus;Ljava/lang/Object;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/ws/rs/client/ClientRequestFilter");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/ws/rs/client/ClientResponseFilter");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", "java/lang/Class"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/model/FilterProviderInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "getBus", "()Lorg/apache/cxf/Bus;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "configuration", "Ljavax/ws/rs/core/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/Configuration", "getContracts", "(Ljava/lang/Class;)Ljava/util/Map;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/model/FilterProviderInfo", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;Lorg/apache/cxf/Bus;Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
