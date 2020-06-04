package asm.jakarta.xml.ws;
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
public class ServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "jakarta/xml/ws/Service", null, "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/xml/ws/Service$Mode", "jakarta/xml/ws/Service", "Mode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/net/URL;Ljavax/xml/namespace/QName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/ws/spi/Provider", "provider", "()Ljakarta/xml/ws/spi/Provider;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/Provider", "createServiceDelegate", "(Ljava/net/URL;Ljavax/xml/namespace/QName;Ljava/lang/Class;)Ljakarta/xml/ws/spi/ServiceDelegate;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_VARARGS, "<init>", "(Ljava/net/URL;Ljavax/xml/namespace/QName;[Ljakarta/xml/ws/WebServiceFeature;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/ws/spi/Provider", "provider", "()Ljakarta/xml/ws/spi/Provider;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/Provider", "createServiceDelegate", "(Ljava/net/URL;Ljavax/xml/namespace/QName;Ljava/lang/Class;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/spi/ServiceDelegate;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPort", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/xml/namespace/QName;Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "getPort", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPort", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "getPort", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "getPort", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;[Ljakarta/xml/ws/WebServiceFeature;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/xml/namespace/QName;Ljava/lang/Class<TT;>;[Ljakarta/xml/ws/WebServiceFeature;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "getPort", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;[Ljakarta/xml/ws/WebServiceFeature;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "getPort", "(Ljava/lang/Class;[Ljakarta/xml/ws/WebServiceFeature;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;[Ljakarta/xml/ws/WebServiceFeature;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "getPort", "(Ljava/lang/Class;[Ljakarta/xml/ws/WebServiceFeature;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "getPort", "(Ljakarta/xml/ws/EndpointReference;Ljava/lang/Class;[Ljakarta/xml/ws/WebServiceFeature;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljakarta/xml/ws/EndpointReference;Ljava/lang/Class<TT;>;[Ljakarta/xml/ws/WebServiceFeature;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "getPort", "(Ljakarta/xml/ws/EndpointReference;Ljava/lang/Class;[Ljakarta/xml/ws/WebServiceFeature;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addPort", "(Ljavax/xml/namespace/QName;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "addPort", "(Ljavax/xml/namespace/QName;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDispatch", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljakarta/xml/ws/Service$Mode;)Ljakarta/xml/ws/Dispatch;", "<T:Ljava/lang/Object;>(Ljavax/xml/namespace/QName;Ljava/lang/Class<TT;>;Ljakarta/xml/ws/Service$Mode;)Ljakarta/xml/ws/Dispatch<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "createDispatch", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljakarta/xml/ws/Service$Mode;)Ljakarta/xml/ws/Dispatch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDispatch", "(Ljavax/xml/namespace/QName;Ljakarta/xml/bind/JAXBContext;Ljakarta/xml/ws/Service$Mode;)Ljakarta/xml/ws/Dispatch;", "(Ljavax/xml/namespace/QName;Ljakarta/xml/bind/JAXBContext;Ljakarta/xml/ws/Service$Mode;)Ljakarta/xml/ws/Dispatch<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "createDispatch", "(Ljavax/xml/namespace/QName;Ljakarta/xml/bind/JAXBContext;Ljakarta/xml/ws/Service$Mode;)Ljakarta/xml/ws/Dispatch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "createDispatch", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch;", "<T:Ljava/lang/Object;>(Ljavax/xml/namespace/QName;Ljava/lang/Class<TT;>;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "createDispatch", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "createDispatch", "(Ljakarta/xml/ws/EndpointReference;Ljava/lang/Class;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch;", "<T:Ljava/lang/Object;>(Ljakarta/xml/ws/EndpointReference;Ljava/lang/Class<TT;>;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "createDispatch", "(Ljakarta/xml/ws/EndpointReference;Ljava/lang/Class;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "createDispatch", "(Ljavax/xml/namespace/QName;Ljakarta/xml/bind/JAXBContext;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch;", "(Ljavax/xml/namespace/QName;Ljakarta/xml/bind/JAXBContext;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "createDispatch", "(Ljavax/xml/namespace/QName;Ljakarta/xml/bind/JAXBContext;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "createDispatch", "(Ljakarta/xml/ws/EndpointReference;Ljakarta/xml/bind/JAXBContext;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch;", "(Ljakarta/xml/ws/EndpointReference;Ljakarta/xml/bind/JAXBContext;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "createDispatch", "(Ljakarta/xml/ws/EndpointReference;Ljakarta/xml/bind/JAXBContext;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getServiceName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "getServiceName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPorts", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljavax/xml/namespace/QName;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "getPorts", "()Ljava/util/Iterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWSDLDocumentLocation", "()Ljava/net/URL;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "getWSDLDocumentLocation", "()Ljava/net/URL;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHandlerResolver", "()Ljakarta/xml/ws/handler/HandlerResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "getHandlerResolver", "()Ljakarta/xml/ws/handler/HandlerResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setHandlerResolver", "(Ljakarta/xml/ws/handler/HandlerResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "setHandlerResolver", "(Ljakarta/xml/ws/handler/HandlerResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExecutor", "()Ljava/util/concurrent/Executor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "getExecutor", "()Ljava/util/concurrent/Executor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExecutor", "(Ljava/util/concurrent/Executor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/ws/Service", "delegate", "Ljakarta/xml/ws/spi/ServiceDelegate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/ServiceDelegate", "setExecutor", "(Ljava/util/concurrent/Executor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "create", "(Ljava/net/URL;Ljavax/xml/namespace/QName;)Ljakarta/xml/ws/Service;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/ws/Service");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/ws/Service", "<init>", "(Ljava/net/URL;Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "create", "(Ljavax/xml/namespace/QName;)Ljakarta/xml/ws/Service;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/ws/Service");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/ws/Service", "<init>", "(Ljava/net/URL;Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "create", "(Ljava/net/URL;Ljavax/xml/namespace/QName;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Service;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/ws/Service");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/ws/Service", "<init>", "(Ljava/net/URL;Ljavax/xml/namespace/QName;[Ljakarta/xml/ws/WebServiceFeature;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "create", "(Ljavax/xml/namespace/QName;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Service;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/ws/Service");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/ws/Service", "<init>", "(Ljava/net/URL;Ljavax/xml/namespace/QName;[Ljakarta/xml/ws/WebServiceFeature;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
