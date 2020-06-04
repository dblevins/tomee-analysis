package asm.javax.websocket;
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
public class ClientEndpointConfigDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/websocket/ClientEndpointConfig", null, "java/lang/Object", new String[] { "javax/websocket/EndpointConfig" });

classWriter.visitInnerClass("javax/websocket/ClientEndpointConfig$Configurator", "javax/websocket/ClientEndpointConfig", "Configurator", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("javax/websocket/ClientEndpointConfig$Builder", "javax/websocket/ClientEndpointConfig", "Builder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPreferredSubprotocols", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getExtensions", "()Ljava/util/List;", "()Ljava/util/List<Ljavax/websocket/Extension;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getConfigurator", "()Ljavax/websocket/ClientEndpointConfig$Configurator;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
