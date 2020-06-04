package asm.org.apache.activemq.proxy;
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
public class ProxyConnector$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/proxy/ProxyConnector$2", null, "org/apache/activemq/transport/TransportFilter", null);

classWriter.visitOuterClass("org/apache/activemq/proxy/ProxyConnector", "createRemoteTransport", "(Lorg/apache/activemq/transport/Transport;)Lorg/apache/activemq/transport/Transport;");

classWriter.visitInnerClass("org/apache/activemq/proxy/ProxyConnector$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$local", "Lorg/apache/activemq/transport/Transport;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/proxy/ProxyConnector;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/proxy/ProxyConnector;Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/transport/Transport;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/proxy/ProxyConnector$2", "this$0", "Lorg/apache/activemq/proxy/ProxyConnector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/proxy/ProxyConnector$2", "val$local", "Lorg/apache/activemq/transport/Transport;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/TransportFilter", "<init>", "(Lorg/apache/activemq/transport/Transport;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/proxy/ProxyConnector", "access$200", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Stopping proxy.");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/TransportFilter", "stop", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/proxy/ProxyConnection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/proxy/ProxyConnector$2", "val$local", "Lorg/apache/activemq/transport/Transport;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/proxy/ProxyConnection", "<init>", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/transport/Transport;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/proxy/ProxyConnector", "access$200", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Removing proxyConnection {}");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/proxy/ProxyConnection", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/proxy/ProxyConnector$2", "this$0", "Lorg/apache/activemq/proxy/ProxyConnector;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/proxy/ProxyConnector", "access$100", "(Lorg/apache/activemq/proxy/ProxyConnector;)Ljava/util/concurrent/CopyOnWriteArrayList;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CopyOnWriteArrayList", "remove", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
