package asm.org.apache.openejb.core.ivm;
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
public class IntraVmHandleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/core/ivm/IntraVmHandle", null, "java/lang/Object", new String[] { "java/io/Serializable", "javax/ejb/HomeHandle", "javax/ejb/Handle" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "theProxy", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/ivm/IntraVmHandle", "theProxy", "Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEJBHome", "()Ljavax/ejb/EJBHome;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/IntraVmHandle", "theProxy", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ejb/EJBHome");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEJBObject", "()Ljavax/ejb/EJBObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/IntraVmHandle", "theProxy", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ejb/EJBObject");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrimaryKey", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/IntraVmHandle", "theProxy", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/proxy/ProxyManager", "getInvocationHandler", "(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/core/ivm/BaseEjbProxyHandler");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/BaseEjbProxyHandler", "primaryKey", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "writeReplace", "()Ljava/lang/Object;", null, new String[] { "java/io/ObjectStreamException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "isIntraVmCopyOperation", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/ivm/IntraVmArtifact");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/IntraVmArtifact", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "isStatefulPassivationOperation", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "isCrossClassLoaderOperation", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/IntraVmHandle", "theProxy", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/proxy/ProxyManager", "getInvocationHandler", "(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/core/ivm/BaseEjbProxyHandler");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/IntraVmHandle", "theProxy", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/ejb/EJBObject");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ServerFederation", "getApplicationServer", "()Lorg/apache/openejb/spi/ApplicationServer;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/BaseEjbProxyHandler", "getProxyInfo", "()Lorg/apache/openejb/ProxyInfo;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/spi/ApplicationServer", "getHandle", "(Lorg/apache/openejb/ProxyInfo;)Ljavax/ejb/Handle;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/core/ivm/BaseEjbProxyHandler"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/IntraVmHandle", "theProxy", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/ejb/EJBHome");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ServerFederation", "getApplicationServer", "()Lorg/apache/openejb/spi/ApplicationServer;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/BaseEjbProxyHandler", "getProxyInfo", "()Lorg/apache/openejb/ProxyInfo;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/spi/ApplicationServer", "getHomeHandle", "(Lorg/apache/openejb/ProxyInfo;)Ljavax/ejb/HomeHandle;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/OpenEJBRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Invalid proxy type. Handles are only supported by EJBObject types in EJB 1.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/OpenEJBRuntimeException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
