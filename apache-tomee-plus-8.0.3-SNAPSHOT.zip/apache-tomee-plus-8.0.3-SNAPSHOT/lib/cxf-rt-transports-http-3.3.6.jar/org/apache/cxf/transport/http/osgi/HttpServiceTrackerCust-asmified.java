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
public class HttpServiceTrackerCustDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/cxf/transport/http/osgi/HttpServiceTrackerCust", "Ljava/lang/Object;Lorg/osgi/util/tracker/ServiceTrackerCustomizer<Lorg/osgi/service/http/HttpService;Lorg/osgi/service/http/HttpService;>;", "java/lang/Object", new String[] { "org/osgi/util/tracker/ServiceTrackerCustomizer" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CXF_CONFIG_PID", "Ljava/lang/String;", null, "org.apache.cxf.osgi");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "destinationRegistry", "Lorg/apache/cxf/transport/http/DestinationRegistry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "context", "Lorg/osgi/framework/BundleContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "servletPublisherReg", "Lorg/osgi/framework/ServiceRegistration;", "Lorg/osgi/framework/ServiceRegistration<Lorg/osgi/service/cm/ManagedService;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "servletExporter", "Lorg/apache/cxf/transport/http/osgi/ServletExporter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/transport/http/DestinationRegistry;Lorg/osgi/framework/BundleContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/osgi/HttpServiceTrackerCust", "destinationRegistry", "Lorg/apache/cxf/transport/http/DestinationRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/osgi/HttpServiceTrackerCust", "context", "Lorg/osgi/framework/BundleContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removedService", "(Lorg/osgi/framework/ServiceReference;Lorg/osgi/service/http/HttpService;)V", "(Lorg/osgi/framework/ServiceReference<Lorg/osgi/service/http/HttpService;>;Lorg/osgi/service/http/HttpService;)V", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/osgi/service/cm/ConfigurationException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/osgi/HttpServiceTrackerCust", "servletPublisherReg", "Lorg/osgi/framework/ServiceRegistration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/osgi/framework/ServiceRegistration", "unregister", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/osgi/HttpServiceTrackerCust", "servletExporter", "Lorg/apache/cxf/transport/http/osgi/ServletExporter;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/osgi/ServletExporter", "updated", "(Ljava/util/Dictionary;)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/osgi/service/cm/ConfigurationException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "modifiedService", "(Lorg/osgi/framework/ServiceReference;Lorg/osgi/service/http/HttpService;)V", "(Lorg/osgi/framework/ServiceReference<Lorg/osgi/service/http/HttpService;>;Lorg/osgi/service/http/HttpService;)V", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addingService", "(Lorg/osgi/framework/ServiceReference;)Lorg/osgi/service/http/HttpService;", "(Lorg/osgi/framework/ServiceReference<Lorg/osgi/service/http/HttpService;>;)Lorg/osgi/service/http/HttpService;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/osgi/HttpServiceTrackerCust", "context", "Lorg/osgi/framework/BundleContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/osgi/framework/BundleContext", "getService", "(Lorg/osgi/framework/ServiceReference;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/osgi/service/http/HttpService");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/servlet/CXFNonSpringServlet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/osgi/HttpServiceTrackerCust", "destinationRegistry", "Lorg/apache/cxf/transport/http/DestinationRegistry;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/servlet/CXFNonSpringServlet", "<init>", "(Lorg/apache/cxf/transport/http/DestinationRegistry;Z)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/osgi/ServletExporter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/osgi/ServletExporter", "<init>", "(Ljakarta/servlet/Servlet;Lorg/osgi/service/http/HttpService;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/osgi/HttpServiceTrackerCust", "servletExporter", "Lorg/apache/cxf/transport/http/osgi/ServletExporter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/osgi/HttpServiceTrackerCust", "context", "Lorg/osgi/framework/BundleContext;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/osgi/service/cm/ManagedService;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/osgi/HttpServiceTrackerCust", "servletExporter", "Lorg/apache/cxf/transport/http/osgi/ServletExporter;");
methodVisitor.visitLdcInsn("service.pid");
methodVisitor.visitLdcInsn("org.apache.cxf.osgi");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/CollectionUtils", "singletonDictionary", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Dictionary;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/osgi/framework/BundleContext", "registerService", "(Ljava/lang/Class;Ljava/lang/Object;Ljava/util/Dictionary;)Lorg/osgi/framework/ServiceRegistration;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/osgi/HttpServiceTrackerCust", "servletPublisherReg", "Lorg/osgi/framework/ServiceRegistration;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removedService", "(Lorg/osgi/framework/ServiceReference;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/osgi/service/http/HttpService");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/osgi/HttpServiceTrackerCust", "removedService", "(Lorg/osgi/framework/ServiceReference;Lorg/osgi/service/http/HttpService;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "modifiedService", "(Lorg/osgi/framework/ServiceReference;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/osgi/service/http/HttpService");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/osgi/HttpServiceTrackerCust", "modifiedService", "(Lorg/osgi/framework/ServiceReference;Lorg/osgi/service/http/HttpService;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addingService", "(Lorg/osgi/framework/ServiceReference;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/osgi/HttpServiceTrackerCust", "addingService", "(Lorg/osgi/framework/ServiceReference;)Lorg/osgi/service/http/HttpService;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
