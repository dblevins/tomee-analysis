package asm.org.apache.geronimo.connector.outbound;
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
public class ThreadLocalCachingConnectionInterceptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", null, "java/lang/Object", new String[] { "org/apache/geronimo/connector/outbound/ConnectionInterceptor" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "next", "Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "connections", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal<Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "matchConnections", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/ThreadLocal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ThreadLocal", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", "connections", "Ljava/lang/ThreadLocal;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", "next", "Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", "matchConnections", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnection", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;)V", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ConnectionInfo", "isUnshareable", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", "next", "Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/connector/outbound/ConnectionInterceptor", "getConnection", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", "connections", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", "matchConnections", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ConnectionInfo", "getManagedConnectionInfo", "()Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "getManagedConnectionFactory", "()Ljakarta/resource/spi/ManagedConnectionFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "getManagedConnection", "()Ljakarta/resource/spi/ManagedConnection;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singleton", "(Ljava/lang/Object;)Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "getSubject", "()Ljavax/security/auth/Subject;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "getConnectionRequestInfo", "()Ljakarta/resource/spi/ConnectionRequestInfo;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/resource/spi/ManagedConnectionFactory", "matchManagedConnections", "(Ljava/util/Set;Ljavax/security/auth/Subject;Ljakarta/resource/spi/ConnectionRequestInfo;)Ljakarta/resource/spi/ManagedConnection;", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ConnectionInfo", "setManagedConnectionInfo", "(Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "org/apache/geronimo/connector/outbound/ManagedConnectionInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", "connections", "Ljava/lang/ThreadLocal;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", "next", "Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/connector/outbound/ConnectionReturnAction", "RETURN_HANDLE", "Lorg/apache/geronimo/connector/outbound/ConnectionReturnAction;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/connector/outbound/ConnectionInterceptor", "returnConnection", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;Lorg/apache/geronimo/connector/outbound/ConnectionReturnAction;)V", true);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ConnectionInfo", "setManagedConnectionInfo", "(Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", "next", "Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/connector/outbound/ConnectionInterceptor", "getConnection", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", "connections", "Ljava/lang/ThreadLocal;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ConnectionInfo", "getManagedConnectionInfo", "()Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "returnConnection", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;Lorg/apache/geronimo/connector/outbound/ConnectionReturnAction;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/connector/outbound/ConnectionReturnAction", "DESTROY", "Lorg/apache/geronimo/connector/outbound/ConnectionReturnAction;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ConnectionInfo", "isUnshareable", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ConnectionInfo", "getManagedConnectionInfo", "()Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "hasConnectionHandles", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", "connections", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ConnectionInfo", "getManagedConnectionInfo", "()Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", "connections", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "remove", "()V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", "next", "Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/connector/outbound/ConnectionInterceptor", "returnConnection", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;Lorg/apache/geronimo/connector/outbound/ConnectionReturnAction;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "destroy", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", "next", "Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/connector/outbound/ConnectionInterceptor", "destroy", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "info", "(Ljava/lang/StringBuilder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("[matchConnections=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", "matchConnections", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Z)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("]\n");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ThreadLocalCachingConnectionInterceptor", "next", "Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/connector/outbound/ConnectionInterceptor", "info", "(Ljava/lang/StringBuilder;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
