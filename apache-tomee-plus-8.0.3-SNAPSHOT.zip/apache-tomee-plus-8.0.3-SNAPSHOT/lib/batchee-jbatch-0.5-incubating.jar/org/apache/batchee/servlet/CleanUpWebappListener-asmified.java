package asm.org.apache.batchee.servlet;
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
public class CleanUpWebappListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/servlet/CleanUpWebappListener", null, "java/lang/Object", new String[] { "jakarta/servlet/ServletContextListener" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/servlet/annotation/WebListener;", true);
annotationVisitor0.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "contextInitialized", "(Ljakarta/servlet/ServletContextEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "contextDestroyed", "(Ljakarta/servlet/ServletContextEvent;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/services/ServicesManager", "find", "()Lorg/apache/batchee/container/services/ServicesManager;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/batchee/spi/BatchThreadPoolService;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/services/ServicesManager", "service", "(Ljava/lang/Class;)Lorg/apache/batchee/spi/BatchService;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/batchee/spi/BatchThreadPoolService");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/batchee/servlet/CleanUpWebappListener;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/ServletContextEvent", "getServletContext", "()Ljakarta/servlet/ServletContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "getClassLoader", "()Ljava/lang/ClassLoader;", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/spi/BatchThreadPoolService", "shutdown", "()V", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/management/ManagementFactory", "getPlatformMBeanServer", "()Ljavax/management/MBeanServer;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "javax/management/ObjectName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("org.apache.batchee:type=batchee,name=operator");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/ObjectName", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/MBeanServer", "isRegistered", "(Ljavax/management/ObjectName;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/MBeanServer", "unregisterMBean", "(Ljavax/management/ObjectName;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/batchee/spi/BatchThreadPoolService", "javax/management/MBeanServer"}, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
