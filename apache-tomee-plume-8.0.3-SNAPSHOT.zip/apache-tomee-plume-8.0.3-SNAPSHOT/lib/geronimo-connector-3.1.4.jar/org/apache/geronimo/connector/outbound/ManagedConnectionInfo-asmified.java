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
public class ManagedConnectionInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "managedConnectionFactory", "Ljakarta/resource/spi/ManagedConnectionFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "connectionRequestInfo", "Ljakarta/resource/spi/ConnectionRequestInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "subject", "Ljavax/security/auth/Subject;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "managedConnection", "Ljakarta/resource/spi/ManagedConnection;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xares", "Ljavax/transaction/xa/XAResource;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lastUsed", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "poolInterceptor", "Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "listener", "Lorg/apache/geronimo/connector/outbound/GeronimoConnectionEventListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$assertionsDisabled", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/resource/spi/ManagedConnectionFactory;Ljakarta/resource/spi/ConnectionRequestInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "managedConnectionFactory", "Ljakarta/resource/spi/ManagedConnectionFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "connectionRequestInfo", "Ljakarta/resource/spi/ConnectionRequestInfo;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getManagedConnectionFactory", "()Ljakarta/resource/spi/ManagedConnectionFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "managedConnectionFactory", "Ljakarta/resource/spi/ManagedConnectionFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setManagedConnectionFactory", "(Ljakarta/resource/spi/ManagedConnectionFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "managedConnectionFactory", "Ljakarta/resource/spi/ManagedConnectionFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionRequestInfo", "()Ljakarta/resource/spi/ConnectionRequestInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "connectionRequestInfo", "Ljakarta/resource/spi/ConnectionRequestInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionRequestInfo", "(Ljakarta/resource/spi/ConnectionRequestInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "connectionRequestInfo", "Ljakarta/resource/spi/ConnectionRequestInfo;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSubject", "()Ljavax/security/auth/Subject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "subject", "Ljavax/security/auth/Subject;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSubject", "(Ljavax/security/auth/Subject;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "subject", "Ljavax/security/auth/Subject;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getManagedConnection", "()Ljakarta/resource/spi/ManagedConnection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "managedConnection", "Ljakarta/resource/spi/ManagedConnection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setManagedConnection", "(Ljakarta/resource/spi/ManagedConnection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "$assertionsDisabled", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "managedConnection", "Ljakarta/resource/spi/ManagedConnection;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/AssertionError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AssertionError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "managedConnection", "Ljakarta/resource/spi/ManagedConnection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXAResource", "()Ljavax/transaction/xa/XAResource;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "xares", "Ljavax/transaction/xa/XAResource;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setXAResource", "(Ljavax/transaction/xa/XAResource;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "xares", "Ljavax/transaction/xa/XAResource;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLastUsed", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "lastUsed", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLastUsed", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "lastUsed", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPoolInterceptor", "(Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "poolInterceptor", "Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPoolInterceptor", "()Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "poolInterceptor", "Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionEventListener", "(Lorg/apache/geronimo/connector/outbound/GeronimoConnectionEventListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "listener", "Lorg/apache/geronimo/connector/outbound/GeronimoConnectionEventListener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addConnectionHandle", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "listener", "Lorg/apache/geronimo/connector/outbound/GeronimoConnectionEventListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/GeronimoConnectionEventListener", "addConnectionInfo", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeConnectionHandle", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "listener", "Lorg/apache/geronimo/connector/outbound/GeronimoConnectionEventListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/GeronimoConnectionEventListener", "removeConnectionInfo", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasConnectionHandles", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "listener", "Lorg/apache/geronimo/connector/outbound/GeronimoConnectionEventListener;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/GeronimoConnectionEventListener", "hasConnectionInfos", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clearConnectionHandles", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "listener", "Lorg/apache/geronimo/connector/outbound/GeronimoConnectionEventListener;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/GeronimoConnectionEventListener", "clearConnectionInfos", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionInfos", "()Ljava/util/Collection;", "()Ljava/util/Collection<Lorg/apache/geronimo/connector/outbound/ConnectionInfo;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "listener", "Lorg/apache/geronimo/connector/outbound/GeronimoConnectionEventListener;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/GeronimoConnectionEventListener", "getConnectionInfos", "()Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "securityMatches", "(Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "subject", "Ljavax/security/auth/Subject;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "getSubject", "()Ljavax/security/auth/Subject;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "subject", "Ljavax/security/auth/Subject;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "getSubject", "()Ljavax/security/auth/Subject;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/auth/Subject", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "connectionRequestInfo", "Ljakarta/resource/spi/ConnectionRequestInfo;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "getConnectionRequestInfo", "()Ljakarta/resource/spi/ConnectionRequestInfo;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "connectionRequestInfo", "Ljakarta/resource/spi/ConnectionRequestInfo;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "getConnectionRequestInfo", "()Ljakarta/resource/spi/ConnectionRequestInfo;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/resource/spi/ConnectionRequestInfo", "equals", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasConnectionInfo", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "listener", "Lorg/apache/geronimo/connector/outbound/GeronimoConnectionEventListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/GeronimoConnectionEventListener", "hasConnectionInfo", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFirstConnectionInfo", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "listener", "Lorg/apache/geronimo/connector/outbound/GeronimoConnectionEventListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/GeronimoConnectionEventListener", "isFirstConnectionInfo", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("ManagedConnectionInfo: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(". mc: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "managedConnection", "Ljakarta/resource/spi/ManagedConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "desiredAssertionStatus", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "$assertionsDisabled", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
