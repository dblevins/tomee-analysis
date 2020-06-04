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
public class OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", null, "java/lang/Object", new String[] { "org/apache/geronimo/transaction/manager/NamedXAResource" });

classWriter.visitInnerClass("org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory", "NamedXAResourceWithConnectioninfo", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Lorg/apache/geronimo/transaction/manager/NamedXAResource;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "connectionInfo", "Lorg/apache/geronimo/connector/outbound/ConnectionInfo;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/geronimo/transaction/manager/NamedXAResource;Lorg/apache/geronimo/connector/outbound/ConnectionInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", "delegate", "Lorg/apache/geronimo/transaction/manager/NamedXAResource;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", "connectionInfo", "Lorg/apache/geronimo/connector/outbound/ConnectionInfo;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionInfo", "()Lorg/apache/geronimo/connector/outbound/ConnectionInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", "connectionInfo", "Lorg/apache/geronimo/connector/outbound/ConnectionInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", "delegate", "Lorg/apache/geronimo/transaction/manager/NamedXAResource;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/NamedXAResource", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commit", "(Ljavax/transaction/xa/Xid;Z)V", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", "delegate", "Lorg/apache/geronimo/transaction/manager/NamedXAResource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/NamedXAResource", "commit", "(Ljavax/transaction/xa/Xid;Z)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "end", "(Ljavax/transaction/xa/Xid;I)V", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", "delegate", "Lorg/apache/geronimo/transaction/manager/NamedXAResource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/NamedXAResource", "end", "(Ljavax/transaction/xa/Xid;I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "forget", "(Ljavax/transaction/xa/Xid;)V", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", "delegate", "Lorg/apache/geronimo/transaction/manager/NamedXAResource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/NamedXAResource", "forget", "(Ljavax/transaction/xa/Xid;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransactionTimeout", "()I", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", "delegate", "Lorg/apache/geronimo/transaction/manager/NamedXAResource;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/NamedXAResource", "getTransactionTimeout", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSameRM", "(Ljavax/transaction/xa/XAResource;)Z", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", "delegate", "Lorg/apache/geronimo/transaction/manager/NamedXAResource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/NamedXAResource", "isSameRM", "(Ljavax/transaction/xa/XAResource;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepare", "(Ljavax/transaction/xa/Xid;)I", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", "delegate", "Lorg/apache/geronimo/transaction/manager/NamedXAResource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/NamedXAResource", "prepare", "(Ljavax/transaction/xa/Xid;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "recover", "(I)[Ljavax/transaction/xa/Xid;", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", "delegate", "Lorg/apache/geronimo/transaction/manager/NamedXAResource;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/NamedXAResource", "recover", "(I)[Ljavax/transaction/xa/Xid;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rollback", "(Ljavax/transaction/xa/Xid;)V", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", "delegate", "Lorg/apache/geronimo/transaction/manager/NamedXAResource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/NamedXAResource", "rollback", "(Ljavax/transaction/xa/Xid;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTransactionTimeout", "(I)Z", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", "delegate", "Lorg/apache/geronimo/transaction/manager/NamedXAResource;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/NamedXAResource", "setTransactionTimeout", "(I)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "start", "(Ljavax/transaction/xa/Xid;I)V", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", "delegate", "Lorg/apache/geronimo/transaction/manager/NamedXAResource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/NamedXAResource", "start", "(Ljavax/transaction/xa/Xid;I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/geronimo/transaction/manager/NamedXAResource;Lorg/apache/geronimo/connector/outbound/ConnectionInfo;Lorg/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/connector/outbound/OutboundNamedXAResourceFactory$NamedXAResourceWithConnectioninfo", "<init>", "(Lorg/apache/geronimo/transaction/manager/NamedXAResource;Lorg/apache/geronimo/connector/outbound/ConnectionInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
