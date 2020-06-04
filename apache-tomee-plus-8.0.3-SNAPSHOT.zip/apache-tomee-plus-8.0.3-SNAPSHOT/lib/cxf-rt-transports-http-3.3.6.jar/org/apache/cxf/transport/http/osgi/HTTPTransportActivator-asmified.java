package asm.org.apache.cxf.transport.http.osgi;
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
public class HTTPTransportActivatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/transport/http/osgi/HTTPTransportActivator", null, "java/lang/Object", new String[] { "org/osgi/framework/BundleActivator" });

classWriter.visitInnerClass("org/apache/cxf/transport/http/osgi/HTTPTransportActivator$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DISABLE_DEFAULT_HTTP_TRANSPORT", "Ljava/lang/String;", null, "org.apache.cxf.osgi.http.transport.disable");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "httpServiceTracker", "Lorg/osgi/util/tracker/ServiceTracker;", "Lorg/osgi/util/tracker/ServiceTracker<Lorg/osgi/service/http/HttpService;*>;", null);
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
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/osgi/ConfigAdminHttpConduitConfigurer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/osgi/ConfigAdminHttpConduitConfigurer", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/osgi/service/cm/ManagedServiceFactory;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("org.apache.cxf.http.conduits");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/osgi/HTTPTransportActivator", "registerService", "(Lorg/osgi/framework/BundleContext;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Lorg/osgi/framework/ServiceRegistration;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/transport/http/HTTPConduitConfigurer;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("org.apache.cxf.http.conduit-configurer");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/osgi/HTTPTransportActivator", "registerService", "(Lorg/osgi/framework/BundleContext;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Lorg/osgi/framework/ServiceRegistration;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("org.apache.cxf.osgi.http.transport.disable");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/osgi/framework/BundleContext", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/PropertyUtils", "isTrue", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/transport/http/osgi/ConfigAdminHttpConduitConfigurer"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/DestinationRegistryImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/DestinationRegistryImpl", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/HTTPTransportFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/HTTPTransportFactory", "<init>", "(Lorg/apache/cxf/transport/http/DestinationRegistry;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/osgi/HttpServiceTrackerCust");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/osgi/HttpServiceTrackerCust", "<init>", "(Lorg/apache/cxf/transport/http/DestinationRegistry;Lorg/osgi/framework/BundleContext;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/osgi/util/tracker/ServiceTracker");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/osgi/service/http/HttpService;"));
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/osgi/util/tracker/ServiceTracker", "<init>", "(Lorg/osgi/framework/BundleContext;Ljava/lang/Class;Lorg/osgi/util/tracker/ServiceTrackerCustomizer;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/osgi/HTTPTransportActivator", "httpServiceTracker", "Lorg/osgi/util/tracker/ServiceTracker;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/osgi/HTTPTransportActivator", "httpServiceTracker", "Lorg/osgi/util/tracker/ServiceTracker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/osgi/util/tracker/ServiceTracker", "open", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/transport/http/DestinationRegistry;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/osgi/framework/BundleContext", "registerService", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Dictionary;)Lorg/osgi/framework/ServiceRegistration;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/transport/http/HTTPTransportFactory;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/osgi/framework/BundleContext", "registerService", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Dictionary;)Lorg/osgi/framework/ServiceRegistration;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/osgi/HTTPTransportActivator$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/osgi/HTTPTransportActivator$1", "<init>", "(Lorg/apache/cxf/transport/http/osgi/HTTPTransportActivator;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("http://cxf.apache.org/transports/http/configuration");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/bus/blueprint/NamespaceHandlerRegisterer", "register", "(Lorg/osgi/framework/BundleContext;Lorg/apache/cxf/bus/blueprint/BlueprintNameSpaceHandlerFactory;[Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "registerService", "(Lorg/osgi/framework/BundleContext;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Lorg/osgi/framework/ServiceRegistration;", "<T:Ljava/lang/Object;>(Lorg/osgi/framework/BundleContext;Ljava/lang/Class<TT;>;TT;Ljava/lang/String;)Lorg/osgi/framework/ServiceRegistration<TT;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "(Lorg/osgi/framework/BundleContext;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/osgi/HTTPTransportActivator", "httpServiceTracker", "Lorg/osgi/util/tracker/ServiceTracker;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/osgi/HTTPTransportActivator", "httpServiceTracker", "Lorg/osgi/util/tracker/ServiceTracker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/osgi/util/tracker/ServiceTracker", "close", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
