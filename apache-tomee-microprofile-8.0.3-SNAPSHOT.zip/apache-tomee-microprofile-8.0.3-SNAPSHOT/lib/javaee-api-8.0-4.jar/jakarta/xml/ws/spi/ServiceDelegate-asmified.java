package asm.jakarta.xml.ws.spi;
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
public class ServiceDelegateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "jakarta/xml/ws/spi/ServiceDelegate", null, "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/xml/ws/Service$Mode", "jakarta/xml/ws/Service", "Mode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPort", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/xml/namespace/QName;Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPort", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "getPort", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;[Ljakarta/xml/ws/WebServiceFeature;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/xml/namespace/QName;Ljava/lang/Class<TT;>;[Ljakarta/xml/ws/WebServiceFeature;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "getPort", "(Ljakarta/xml/ws/EndpointReference;Ljava/lang/Class;[Ljakarta/xml/ws/WebServiceFeature;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljakarta/xml/ws/EndpointReference;Ljava/lang/Class<TT;>;[Ljakarta/xml/ws/WebServiceFeature;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "getPort", "(Ljava/lang/Class;[Ljakarta/xml/ws/WebServiceFeature;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;[Ljakarta/xml/ws/WebServiceFeature;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addPort", "(Ljavax/xml/namespace/QName;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createDispatch", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljakarta/xml/ws/Service$Mode;)Ljakarta/xml/ws/Dispatch;", "<T:Ljava/lang/Object;>(Ljavax/xml/namespace/QName;Ljava/lang/Class<TT;>;Ljakarta/xml/ws/Service$Mode;)Ljakarta/xml/ws/Dispatch<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createDispatch", "(Ljavax/xml/namespace/QName;Ljakarta/xml/bind/JAXBContext;Ljakarta/xml/ws/Service$Mode;)Ljakarta/xml/ws/Dispatch;", "(Ljavax/xml/namespace/QName;Ljakarta/xml/bind/JAXBContext;Ljakarta/xml/ws/Service$Mode;)Ljakarta/xml/ws/Dispatch<Ljava/lang/Object;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "createDispatch", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch;", "<T:Ljava/lang/Object;>(Ljavax/xml/namespace/QName;Ljava/lang/Class<TT;>;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "createDispatch", "(Ljakarta/xml/ws/EndpointReference;Ljava/lang/Class;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch;", "<T:Ljava/lang/Object;>(Ljakarta/xml/ws/EndpointReference;Ljava/lang/Class<TT;>;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "createDispatch", "(Ljavax/xml/namespace/QName;Ljakarta/xml/bind/JAXBContext;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch;", "(Ljavax/xml/namespace/QName;Ljakarta/xml/bind/JAXBContext;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch<Ljava/lang/Object;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "createDispatch", "(Ljakarta/xml/ws/EndpointReference;Ljakarta/xml/bind/JAXBContext;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch;", "(Ljakarta/xml/ws/EndpointReference;Ljakarta/xml/bind/JAXBContext;Ljakarta/xml/ws/Service$Mode;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Dispatch<Ljava/lang/Object;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getServiceName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPorts", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljavax/xml/namespace/QName;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getWSDLDocumentLocation", "()Ljava/net/URL;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getHandlerResolver", "()Ljakarta/xml/ws/handler/HandlerResolver;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setHandlerResolver", "(Ljakarta/xml/ws/handler/HandlerResolver;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getExecutor", "()Ljava/util/concurrent/Executor;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setExecutor", "(Ljava/util/concurrent/Executor;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
