package asm.org.apache.cxf.bus.osgi;
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
public class CXFActivatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/bus/osgi/CXFActivator", null, "java/lang/Object", new String[] { "org/osgi/framework/BundleActivator" });

classWriter.visitInnerClass("org/apache/cxf/bus/osgi/CXFActivator$2", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/bus/osgi/CXFActivator$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "extensions", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/cxf/bus/extension/Extension;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "workQueues", "Lorg/apache/cxf/bus/osgi/ManagedWorkQueueList;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "configAdminTracker", "Lorg/osgi/util/tracker/ServiceTracker;", "Lorg/osgi/util/tracker/ServiceTracker<Lorg/osgi/service/cm/ConfigurationAdmin;Lorg/osgi/service/cm/ConfigurationAdmin;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cxfBundleListener", "Lorg/apache/cxf/bus/osgi/CXFExtensionBundleListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "workQueueServiceRegistration", "Lorg/osgi/framework/ServiceRegistration;", "Lorg/osgi/framework/ServiceRegistration<Lorg/osgi/service/cm/ManagedServiceFactory;>;", null);
fieldVisitor.visitEnd();
}
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "start", "(Lorg/osgi/framework/BundleContext;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/bus/osgi/ManagedWorkQueueList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/osgi/ManagedWorkQueueList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "workQueues", "Lorg/apache/cxf/bus/osgi/ManagedWorkQueueList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/bus/osgi/CXFExtensionBundleListener");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/osgi/framework/BundleContext", "getBundle", "()Lorg/osgi/framework/Bundle;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/osgi/framework/Bundle", "getBundleId", "()J", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/osgi/CXFExtensionBundleListener", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "cxfBundleListener", "Lorg/apache/cxf/bus/osgi/CXFExtensionBundleListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "cxfBundleListener", "Lorg/apache/cxf/bus/osgi/CXFExtensionBundleListener;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/osgi/framework/BundleContext", "addBundleListener", "(Lorg/osgi/framework/BundleListener;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "cxfBundleListener", "Lorg/apache/cxf/bus/osgi/CXFExtensionBundleListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bus/osgi/CXFExtensionBundleListener", "registerExistingBundles", "(Lorg/osgi/framework/BundleContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/osgi/util/tracker/ServiceTracker");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/osgi/service/cm/ConfigurationAdmin;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/osgi/util/tracker/ServiceTracker", "<init>", "(Lorg/osgi/framework/BundleContext;Ljava/lang/Class;Lorg/osgi/util/tracker/ServiceTrackerCustomizer;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "configAdminTracker", "Lorg/osgi/util/tracker/ServiceTracker;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "configAdminTracker", "Lorg/osgi/util/tracker/ServiceTracker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/osgi/util/tracker/ServiceTracker", "open", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "workQueues", "Lorg/apache/cxf/bus/osgi/ManagedWorkQueueList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "configAdminTracker", "Lorg/osgi/util/tracker/ServiceTracker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bus/osgi/ManagedWorkQueueList", "setConfigAdminTracker", "(Lorg/osgi/util/tracker/ServiceTracker;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/osgi/service/cm/ManagedServiceFactory;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "workQueues", "Lorg/apache/cxf/bus/osgi/ManagedWorkQueueList;");
methodVisitor.visitLdcInsn("org.apache.cxf.workqueues");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/osgi/CXFActivator", "registerManagedServiceFactory", "(Lorg/osgi/framework/BundleContext;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Lorg/osgi/framework/ServiceRegistration;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "workQueueServiceRegistration", "Lorg/osgi/framework/ServiceRegistration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "extensions", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "extensions", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/osgi/CXFActivator", "createOsgiBusListenerExtension", "(Lorg/osgi/framework/BundleContext;)Lorg/apache/cxf/bus/extension/Extension;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "extensions", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "workQueues", "Lorg/apache/cxf/bus/osgi/ManagedWorkQueueList;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/bus/osgi/CXFActivator", "createManagedWorkQueueListExtension", "(Lorg/apache/cxf/bus/osgi/ManagedWorkQueueList;)Lorg/apache/cxf/bus/extension/Extension;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "extensions", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/bus/extension/ExtensionRegistry", "addExtensions", "(Ljava/util/List;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/bus/osgi/CXFActivator$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/osgi/CXFActivator$1", "<init>", "(Lorg/apache/cxf/bus/osgi/CXFActivator;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("http://cxf.apache.org/blueprint/core");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("http://cxf.apache.org/configuration/beans");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("http://cxf.apache.org/configuration/parameterized-types");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("http://cxf.apache.org/configuration/security");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/wsdl/");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("http://www.w3.org/2005/08/addressing");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2004/08/addressing");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/bus/blueprint/NamespaceHandlerRegisterer", "register", "(Lorg/osgi/framework/BundleContext;Lorg/apache/cxf/bus/blueprint/BlueprintNameSpaceHandlerFactory;[Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "registerManagedServiceFactory", "(Lorg/osgi/framework/BundleContext;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Lorg/osgi/framework/ServiceRegistration;", "<T:Ljava/lang/Object;>(Lorg/osgi/framework/BundleContext;Ljava/lang/Class<TT;>;TT;Ljava/lang/String;)Lorg/osgi/framework/ServiceRegistration<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("service.pid");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/CollectionUtils", "singletonDictionary", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Dictionary;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/osgi/framework/BundleContext", "registerService", "(Ljava/lang/Class;Ljava/lang/Object;Ljava/util/Dictionary;)Lorg/osgi/framework/ServiceRegistration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createOsgiBusListenerExtension", "(Lorg/osgi/framework/BundleContext;)Lorg/apache/cxf/bus/extension/Extension;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/bus/extension/Extension");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/bus/osgi/OSGIBusListener;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/extension/Extension", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bus/extension/Extension", "setArgs", "([Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "createManagedWorkQueueListExtension", "(Lorg/apache/cxf/bus/osgi/ManagedWorkQueueList;)Lorg/apache/cxf/bus/extension/Extension;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/bus/osgi/CXFActivator$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/bus/osgi/ManagedWorkQueueList;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/osgi/CXFActivator$2", "<init>", "(Ljava/lang/Class;Lorg/apache/cxf/bus/osgi/ManagedWorkQueueList;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "(Lorg/osgi/framework/BundleContext;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "cxfBundleListener", "Lorg/apache/cxf/bus/osgi/CXFExtensionBundleListener;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/osgi/framework/BundleContext", "removeBundleListener", "(Lorg/osgi/framework/BundleListener;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "cxfBundleListener", "Lorg/apache/cxf/bus/osgi/CXFExtensionBundleListener;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bus/osgi/CXFExtensionBundleListener", "shutdown", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "workQueues", "Lorg/apache/cxf/bus/osgi/ManagedWorkQueueList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bus/osgi/ManagedWorkQueueList", "shutDown", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "workQueueServiceRegistration", "Lorg/osgi/framework/ServiceRegistration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/osgi/framework/ServiceRegistration", "unregister", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "configAdminTracker", "Lorg/osgi/util/tracker/ServiceTracker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/osgi/util/tracker/ServiceTracker", "close", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/osgi/CXFActivator", "extensions", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/bus/extension/ExtensionRegistry", "removeExtensions", "(Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
