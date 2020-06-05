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
public class EndpointDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "jakarta/xml/ws/Endpoint", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSDL_SERVICE", "Ljava/lang/String;", null, "jakarta.xml.ws.wsdl.service");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSDL_PORT", "Ljava/lang/String;", null, "jakarta.xml.ws.wsdl.port");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "create", "(Ljava/lang/Object;)Ljakarta/xml/ws/Endpoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/ws/Endpoint", "create", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/xml/ws/Endpoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "create", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/xml/ws/Endpoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/ws/spi/Provider", "provider", "()Ljakarta/xml/ws/spi/Provider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/Provider", "createEndpoint", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/xml/ws/Endpoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "create", "(Ljava/lang/Object;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Endpoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/ws/spi/Provider", "provider", "()Ljakarta/xml/ws/spi/Provider;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/Provider", "createEndpoint", "(Ljava/lang/String;Ljava/lang/Object;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Endpoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "create", "(Ljava/lang/String;Ljava/lang/Object;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Endpoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/ws/spi/Provider", "provider", "()Ljakarta/xml/ws/spi/Provider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/Provider", "createEndpoint", "(Ljava/lang/String;Ljava/lang/Object;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Endpoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "publish", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/xml/ws/Endpoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/ws/spi/Provider", "provider", "()Ljakarta/xml/ws/spi/Provider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/Provider", "createAndPublishEndpoint", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/xml/ws/Endpoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "publish", "(Ljava/lang/String;Ljava/lang/Object;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Endpoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/ws/spi/Provider", "provider", "()Ljakarta/xml/ws/spi/Provider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/Provider", "createAndPublishEndpoint", "(Ljava/lang/String;Ljava/lang/Object;[Ljakarta/xml/ws/WebServiceFeature;)Ljakarta/xml/ws/Endpoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBinding", "()Ljakarta/xml/ws/Binding;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getImplementor", "()Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "publish", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "publish", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "stop", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isPublished", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMetadata", "()Ljava/util/List;", "()Ljava/util/List<Ljavax/xml/transform/Source;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMetadata", "(Ljava/util/List;)V", "(Ljava/util/List<Ljavax/xml/transform/Source;>;)V", null);
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
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getProperties", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setProperties", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "getEndpointReference", "([Lorg/w3c/dom/Element;)Ljakarta/xml/ws/EndpointReference;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "getEndpointReference", "(Ljava/lang/Class;[Lorg/w3c/dom/Element;)Ljakarta/xml/ws/EndpointReference;", "<T:Ljakarta/xml/ws/EndpointReference;>(Ljava/lang/Class<TT;>;[Lorg/w3c/dom/Element;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEndpointContext", "(Ljakarta/xml/ws/EndpointContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAX-WS 2.2 implementations must override this method.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "publish", "(Ljakarta/xml/ws/spi/http/HttpContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAX-WS 2.2 implementations must override this method.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
