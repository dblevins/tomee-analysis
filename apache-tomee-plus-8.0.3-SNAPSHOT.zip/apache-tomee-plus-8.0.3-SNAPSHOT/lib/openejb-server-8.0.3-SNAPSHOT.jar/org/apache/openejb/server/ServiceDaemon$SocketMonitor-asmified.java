package asm.org.apache.openejb.server;
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
public class ServiceDaemon$SocketMonitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/server/ServiceDaemon$SocketMonitor", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visit("append", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/openejb/server/ServiceDaemon$SocketMonitor", "org/apache/openejb/server/ServiceDaemon", "SocketMonitor", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/server/ServiceDaemon;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/server/ServiceDaemon;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/ServiceDaemon$SocketMonitor", "this$0", "Lorg/apache/openejb/server/ServiceDaemon;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocalPort", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/ServiceDaemon$SocketMonitor", "this$0", "Lorg/apache/openejb/server/ServiceDaemon;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/ServiceDaemon", "getServerSocket", "()Ljava/net/ServerSocket;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/ServerSocket", "getLocalPort", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReuseAddress", "()Z", null, new String[] { "java/net/SocketException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/ServiceDaemon$SocketMonitor", "this$0", "Lorg/apache/openejb/server/ServiceDaemon;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/ServiceDaemon", "getServerSocket", "()Ljava/net/ServerSocket;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/ServerSocket", "getReuseAddress", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSoTimeout", "()I", null, new String[] { "java/io/IOException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/ServiceDaemon$SocketMonitor", "this$0", "Lorg/apache/openejb/server/ServiceDaemon;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/ServiceDaemon", "getServerSocket", "()Ljava/net/ServerSocket;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/ServerSocket", "getSoTimeout", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isClosed", "()Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/ServiceDaemon$SocketMonitor", "this$0", "Lorg/apache/openejb/server/ServiceDaemon;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/ServiceDaemon", "getServerSocket", "()Ljava/net/ServerSocket;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/ServerSocket", "isClosed", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isBound", "()Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/ServiceDaemon$SocketMonitor", "this$0", "Lorg/apache/openejb/server/ServiceDaemon;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/ServiceDaemon", "getServerSocket", "()Ljava/net/ServerSocket;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/ServerSocket", "isBound", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReceiveBufferSize", "()I", null, new String[] { "java/net/SocketException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/ServiceDaemon$SocketMonitor", "this$0", "Lorg/apache/openejb/server/ServiceDaemon;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/ServiceDaemon", "getServerSocket", "()Ljava/net/ServerSocket;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/ServerSocket", "getReceiveBufferSize", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReceiveBufferSize", "(I)V", null, new String[] { "java/net/SocketException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/ServiceDaemon$SocketMonitor", "this$0", "Lorg/apache/openejb/server/ServiceDaemon;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/ServiceDaemon", "getServerSocket", "()Ljava/net/ServerSocket;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/ServerSocket", "setReceiveBufferSize", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPerformancePreferences", "(III)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/ServiceDaemon$SocketMonitor", "this$0", "Lorg/apache/openejb/server/ServiceDaemon;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/ServiceDaemon", "getServerSocket", "()Ljava/net/ServerSocket;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/ServerSocket", "setPerformancePreferences", "(III)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReuseAddress", "(Z)V", null, new String[] { "java/net/SocketException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/ServiceDaemon$SocketMonitor", "this$0", "Lorg/apache/openejb/server/ServiceDaemon;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/ServiceDaemon", "getServerSocket", "()Ljava/net/ServerSocket;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/ServerSocket", "setReuseAddress", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSoTimeout", "(I)V", null, new String[] { "java/net/SocketException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/ServiceDaemon$SocketMonitor", "this$0", "Lorg/apache/openejb/server/ServiceDaemon;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/ServiceDaemon", "getServerSocket", "()Ljava/net/ServerSocket;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/ServerSocket", "setSoTimeout", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
