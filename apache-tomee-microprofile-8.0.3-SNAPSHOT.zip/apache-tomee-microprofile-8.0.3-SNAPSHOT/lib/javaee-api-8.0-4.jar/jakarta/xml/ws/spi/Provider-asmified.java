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
public class ProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "jakarta/xml/ws/spi/Provider", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAXWSPROVIDER_PROPERTY", "Ljava/lang/String;", null, "jakarta.xml.ws.spi.Provider");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_JAXWSPROVIDER", "Ljava/lang/String;", null, "org.apache.cxf.jaxws.spi.ProviderImpl");
fieldVisitor.visitEnd();
}
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "provider", "()Ljakarta/xml/ws/spi/Provider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("jakarta.xml.ws.spi.Provider");
methodVisitor.visitLdcInsn("org.apache.cxf.jaxws.spi.ProviderImpl");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/ws/spi/FactoryFinder", "find", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/xml/ws/spi/Provider");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createServiceDelegate", "(Ljava/net/URL;Ljavax/xml/namespace/QName;Ljava/lang/Class;)Ljakarta/xml/ws/spi/ServiceDelegate;", "(Ljava/net/URL;Ljavax/xml/namespace/QName;Ljava/lang/Class<+Ljakarta/xml/ws/Service;>;)Ljakarta/xml/ws/spi/ServiceDelegate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "createServiceDelegate", "(Ljava/net/URL;Ljavax/xml/namespace/QName;Ljava/lang/Class;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/spi/ServiceDelegate;", "(Ljava/net/URL;Ljavax/xml/namespace/QName;Ljava/lang/Class<+Ljakarta/xml/ws/Service;>;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/spi/ServiceDelegate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAX-WS 2.2 implementations must override this method.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createEndpoint", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/xml/ws/Endpoint;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "createEndpoint", "(Ljava/lang/String;Ljava/lang/Class;Ljakarta/xml/ws/spi/Invoker;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Endpoint;", "(Ljava/lang/String;Ljava/lang/Class<*>;Ljakarta/xml/ws/spi/Invoker;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Endpoint;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAX-WS 2.2 implementations must override this method.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "createEndpoint", "(Ljava/lang/String;Ljava/lang/Object;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Endpoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAX-WS 2.2 implementations must override this method.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createAndPublishEndpoint", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/xml/ws/Endpoint;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "createAndPublishEndpoint", "(Ljava/lang/String;Ljava/lang/Object;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Endpoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAX-WS 2.2 implementations must override this method.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "readEndpointReference", "(Ljavax/xml/transform/Source;)Ljakarta/xml/ws/EndpointReference;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "getPort", "(Ljakarta/xml/ws/EndpointReference;Ljava/lang/Class;[Ljakarta/xml/ws/WebServiceFeature;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljakarta/xml/ws/EndpointReference;Ljava/lang/Class<TT;>;[Ljakarta/xml/ws/WebServiceFeature;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createW3CEndpointReference", "(Ljava/lang/String;Ljavax/xml/namespace/QName;Ljavax/xml/namespace/QName;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljakarta/xml/ws/wsaddressing/W3CEndpointReference;", "(Ljava/lang/String;Ljavax/xml/namespace/QName;Ljavax/xml/namespace/QName;Ljava/util/List<Lorg/w3c/dom/Element;>;Ljava/lang/String;Ljava/util/List<Lorg/w3c/dom/Element;>;)Ljakarta/xml/ws/wsaddressing/W3CEndpointReference;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createW3CEndpointReference", "(Ljava/lang/String;Ljavax/xml/namespace/QName;Ljavax/xml/namespace/QName;Ljavax/xml/namespace/QName;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Ljakarta/xml/ws/wsaddressing/W3CEndpointReference;", "(Ljava/lang/String;Ljavax/xml/namespace/QName;Ljavax/xml/namespace/QName;Ljavax/xml/namespace/QName;Ljava/util/List<Lorg/w3c/dom/Element;>;Ljava/lang/String;Ljava/util/List<Lorg/w3c/dom/Element;>;Ljava/util/List<Lorg/w3c/dom/Element;>;Ljava/util/Map<Ljavax/xml/namespace/QName;Ljava/lang/String;>;)Ljakarta/xml/ws/wsaddressing/W3CEndpointReference;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAX-WS 2.2 implementations must override this method.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 10);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
