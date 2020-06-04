package asm.javax.xml.rpc;
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

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/xml/rpc/Service", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPort", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;)Ljava/rmi/Remote;", null, new String[] { "javax/xml/rpc/ServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPort", "(Ljava/lang/Class;)Ljava/rmi/Remote;", null, new String[] { "javax/xml/rpc/ServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCalls", "(Ljavax/xml/namespace/QName;)[Ljavax/xml/rpc/Call;", null, new String[] { "javax/xml/rpc/ServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCall", "(Ljavax/xml/namespace/QName;)Ljavax/xml/rpc/Call;", null, new String[] { "javax/xml/rpc/ServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCall", "(Ljavax/xml/namespace/QName;Ljavax/xml/namespace/QName;)Ljavax/xml/rpc/Call;", null, new String[] { "javax/xml/rpc/ServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCall", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Ljavax/xml/rpc/Call;", null, new String[] { "javax/xml/rpc/ServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCall", "()Ljavax/xml/rpc/Call;", null, new String[] { "javax/xml/rpc/ServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getServiceName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPorts", "()Ljava/util/Iterator;", null, new String[] { "javax/xml/rpc/ServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getWSDLDocumentLocation", "()Ljava/net/URL;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTypeMappingRegistry", "()Ljavax/xml/rpc/encoding/TypeMappingRegistry;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getHandlerRegistry", "()Ljavax/xml/rpc/handler/HandlerRegistry;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
