package asm.org.apache.openejb.server.cxf;
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
public class CxfWsContainerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/openejb/server/cxf/CxfWsContainer", null, "java/lang/Object", new String[] { "org/apache/openejb/server/httpd/HttpListener" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "bus", "Lorg/apache/cxf/Bus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "port", "Lorg/apache/openejb/core/webservices/PortData;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "destination", "Lorg/apache/cxf/transport/http/AbstractHTTPDestination;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "endpoint", "Lorg/apache/openejb/server/cxf/CxfEndpoint;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "transportFactory", "Lorg/apache/cxf/transport/DestinationFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "serviceConfiguration", "Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jmxName", "Ljavax/management/ObjectName;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/Bus;Lorg/apache/cxf/transport/DestinationFactory;Lorg/apache/openejb/core/webservices/PortData;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/CxfWsContainer", "bus", "Lorg/apache/cxf/Bus;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/CxfWsContainer", "port", "Lorg/apache/openejb/core/webservices/PortData;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/CxfWsContainer", "serviceConfiguration", "Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/CxfWsContainer", "transportFactory", "Lorg/apache/cxf/transport/DestinationFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "start", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/CxfWsContainer", "createEndpoint", "()Lorg/apache/openejb/server/cxf/CxfEndpoint;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/CxfWsContainer", "endpoint", "Lorg/apache/openejb/server/cxf/CxfEndpoint;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/CxfWsContainer", "endpoint", "Lorg/apache/openejb/server/cxf/CxfEndpoint;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("http://");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/CxfWsContainer", "getFakeUrl", "()Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitIntInsn(BIPUSH, 95);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(CC)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":80");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/CxfEndpoint", "publish", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/CxfWsContainer", "endpoint", "Lorg/apache/openejb/server/cxf/CxfEndpoint;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/CxfEndpoint", "getServer", "()Lorg/apache/cxf/endpoint/ServerImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/endpoint/ServerImpl", "getDestination", "()Lorg/apache/cxf/transport/Destination;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/transport/http/AbstractHTTPDestination");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/CxfWsContainer", "destination", "Lorg/apache/cxf/transport/http/AbstractHTTPDestination;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/CxfWsContainer", "registerMBean", "()Ljavax/management/ObjectName;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/CxfWsContainer", "jmxName", "Ljavax/management/ObjectName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getFakeUrl", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/CxfWsContainer", "endpoint", "Lorg/apache/openejb/server/cxf/CxfEndpoint;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "createEndpoint", "()Lorg/apache/openejb/server/cxf/CxfEndpoint;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "registerMBean", "()Ljavax/management/ObjectName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "setWsldUrl", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "destroy", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/CxfWsContainer", "unregisterMBean", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/CxfWsContainer", "endpoint", "Lorg/apache/openejb/server/cxf/CxfEndpoint;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/CxfWsContainer", "endpoint", "Lorg/apache/openejb/server/cxf/CxfEndpoint;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/cxf/CxfEndpoint", "stop", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "unregisterMBean", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/CxfWsContainer", "jmxName", "Ljavax/management/ObjectName;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/monitoring/LocalMBeanServer", "unregisterSilently", "(Ljavax/management/ObjectName;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onMessage", "(Lorg/apache/openejb/server/httpd/HttpRequest;Lorg/apache/openejb/server/httpd/HttpResponse;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/transport/util/CxfUtil", "initBusLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/CxfWsContainer", "destination", "Lorg/apache/cxf/transport/http/AbstractHTTPDestination;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/server/httpd/HttpRequest", "getServletContext", "()Ljakarta/servlet/ServletContext;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/AbstractHTTPDestination", "invoke", "(Ljakarta/servlet/ServletConfig;Ljakarta/servlet/ServletContext;Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/transport/util/CxfUtil", "clearBusLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/openejb/server/cxf/CxfWsContainer", "org/apache/openejb/server/httpd/HttpRequest", "org/apache/openejb/server/httpd/HttpResponse", "java/lang/ClassLoader"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/transport/util/CxfUtil", "clearBusLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEndpoint", "()Lorg/apache/openejb/server/cxf/CxfEndpoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/CxfWsContainer", "endpoint", "Lorg/apache/openejb/server/cxf/CxfEndpoint;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
