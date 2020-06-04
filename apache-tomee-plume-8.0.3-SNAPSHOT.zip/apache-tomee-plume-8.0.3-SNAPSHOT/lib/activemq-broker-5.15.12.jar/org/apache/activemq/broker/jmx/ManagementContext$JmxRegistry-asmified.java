package asm.org.apache.activemq.broker.jmx;
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
public class ManagementContext$JmxRegistryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/broker/jmx/ManagementContext$JmxRegistry", null, "sun/rmi/registry/RegistryImpl", null);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/ManagementContext$JmxRegistry", "org/apache/activemq/broker/jmx/ManagementContext", "JmxRegistry", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/broker/jmx/ManagementContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/broker/jmx/ManagementContext;I)V", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/ManagementContext$JmxRegistry", "this$0", "Lorg/apache/activemq/broker/jmx/ManagementContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "sun/rmi/registry/RegistryImpl", "<init>", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lookup", "(Ljava/lang/String;)Ljava/rmi/Remote;", null, new String[] { "java/rmi/RemoteException", "java/rmi/NotBoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/ManagementContext$JmxRegistry", "this$0", "Lorg/apache/activemq/broker/jmx/ManagementContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/jmx/ManagementContext", "access$700", "(Lorg/apache/activemq/broker/jmx/ManagementContext;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/ManagementContext$JmxRegistry", "this$0", "Lorg/apache/activemq/broker/jmx/ManagementContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/jmx/ManagementContext", "access$500", "(Lorg/apache/activemq/broker/jmx/ManagementContext;)Ljava/rmi/Remote;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/rmi/Remote"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "bind", "(Ljava/lang/String;Ljava/rmi/Remote;)V", null, new String[] { "java/rmi/RemoteException", "java/rmi/AlreadyBoundException", "java/rmi/AccessException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unbind", "(Ljava/lang/String;)V", null, new String[] { "java/rmi/RemoteException", "java/rmi/NotBoundException", "java/rmi/AccessException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rebind", "(Ljava/lang/String;Ljava/rmi/Remote;)V", null, new String[] { "java/rmi/RemoteException", "java/rmi/AccessException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "list", "()[Ljava/lang/String;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/ManagementContext$JmxRegistry", "this$0", "Lorg/apache/activemq/broker/jmx/ManagementContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/jmx/ManagementContext", "access$700", "(Lorg/apache/activemq/broker/jmx/ManagementContext;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
