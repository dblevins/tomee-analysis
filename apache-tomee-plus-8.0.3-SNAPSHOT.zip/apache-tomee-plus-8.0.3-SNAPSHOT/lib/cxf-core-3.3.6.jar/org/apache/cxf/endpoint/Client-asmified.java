package asm.org.apache.cxf.endpoint;
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
public class ClientDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/cxf/endpoint/Client", null, "java/lang/Object", new String[] { "org/apache/cxf/interceptor/InterceptorProvider", "org/apache/cxf/transport/MessageObserver", "org/apache/cxf/endpoint/ConduitSelectorHolder", "java/lang/AutoCloseable" });

classWriter.visitInnerClass("org/apache/cxf/endpoint/Client$Contexts", "org/apache/cxf/endpoint/Client", "Contexts", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/endpoint/Client$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUEST_CONTEXT", "Ljava/lang/String;", null, "RequestContext");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESPONSE_CONTEXT", "Ljava/lang/String;", null, "ResponseContext");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEEP_CONDUIT_ALIVE", "Ljava/lang/String;", null, "KeepConduitAlive");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "invoke", "(Ljava/lang/String;[Ljava/lang/Object;)[Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "invoke", "(Ljavax/xml/namespace/QName;[Ljava/lang/Object;)[Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "invokeWrapped", "(Ljava/lang/String;[Ljava/lang/Object;)[Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "invokeWrapped", "(Ljavax/xml/namespace/QName;[Ljava/lang/Object;)[Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "invoke", "(Lorg/apache/cxf/service/model/BindingOperationInfo;[Ljava/lang/Object;)[Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "invoke", "(Lorg/apache/cxf/service/model/BindingOperationInfo;[Ljava/lang/Object;Ljava/util/Map;)[Ljava/lang/Object;", "(Lorg/apache/cxf/service/model/BindingOperationInfo;[Ljava/lang/Object;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)[Ljava/lang/Object;", new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "invoke", "(Lorg/apache/cxf/service/model/BindingOperationInfo;[Ljava/lang/Object;Ljava/util/Map;Lorg/apache/cxf/message/Exchange;)[Ljava/lang/Object;", "(Lorg/apache/cxf/service/model/BindingOperationInfo;[Ljava/lang/Object;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Lorg/apache/cxf/message/Exchange;)[Ljava/lang/Object;", new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "invoke", "(Lorg/apache/cxf/endpoint/ClientCallback;Ljava/lang/String;[Ljava/lang/Object;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "invoke", "(Lorg/apache/cxf/endpoint/ClientCallback;Ljavax/xml/namespace/QName;[Ljava/lang/Object;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "invokeWrapped", "(Lorg/apache/cxf/endpoint/ClientCallback;Ljava/lang/String;[Ljava/lang/Object;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "invokeWrapped", "(Lorg/apache/cxf/endpoint/ClientCallback;Ljavax/xml/namespace/QName;[Ljava/lang/Object;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "invoke", "(Lorg/apache/cxf/endpoint/ClientCallback;Lorg/apache/cxf/service/model/BindingOperationInfo;[Ljava/lang/Object;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "invoke", "(Lorg/apache/cxf/endpoint/ClientCallback;Lorg/apache/cxf/service/model/BindingOperationInfo;[Ljava/lang/Object;Ljava/util/Map;)V", "(Lorg/apache/cxf/endpoint/ClientCallback;Lorg/apache/cxf/service/model/BindingOperationInfo;[Ljava/lang/Object;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "invoke", "(Lorg/apache/cxf/endpoint/ClientCallback;Lorg/apache/cxf/service/model/BindingOperationInfo;[Ljava/lang/Object;Lorg/apache/cxf/message/Exchange;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "invoke", "(Lorg/apache/cxf/endpoint/ClientCallback;Lorg/apache/cxf/service/model/BindingOperationInfo;[Ljava/lang/Object;Ljava/util/Map;Lorg/apache/cxf/message/Exchange;)V", "(Lorg/apache/cxf/endpoint/ClientCallback;Lorg/apache/cxf/service/model/BindingOperationInfo;[Ljava/lang/Object;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Lorg/apache/cxf/message/Exchange;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequestContext", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getResponseContext", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setThreadLocalRequestContext", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isThreadLocalRequestContext", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContexts", "()Lorg/apache/cxf/endpoint/Client$Contexts;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/endpoint/Client$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/endpoint/Client$1", "<init>", "(Lorg/apache/cxf/endpoint/Client;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEndpoint", "()Lorg/apache/cxf/endpoint/Endpoint;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getConduit", "()Lorg/apache/cxf/transport/Conduit;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getConduitSelector", "()Lorg/apache/cxf/endpoint/ConduitSelector;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setConduitSelector", "(Lorg/apache/cxf/endpoint/ConduitSelector;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "destroy", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setExecutor", "(Ljava/util/concurrent/Executor;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBus", "()Lorg/apache/cxf/Bus;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
