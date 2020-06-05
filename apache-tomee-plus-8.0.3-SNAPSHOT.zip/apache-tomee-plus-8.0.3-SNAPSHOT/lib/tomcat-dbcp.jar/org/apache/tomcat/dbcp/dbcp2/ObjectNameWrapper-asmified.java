package asm.org.apache.tomcat.dbcp.dbcp2;
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
public class ObjectNameWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/juli/logging/Log;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "MBEAN_SERVER", "Ljavax/management/MBeanServer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "objectName", "Ljavax/management/ObjectName;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getPlatformMBeanServer", "()Ljavax/management/MBeanServer;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/LinkageError");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/management/ManagementFactory", "getPlatformMBeanServer", "()Ljavax/management/MBeanServer;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitLdcInsn("Failed to get platform MBeanServer");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "debug", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unwrap", "(Lorg/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper;)Ljavax/management/ObjectName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "unwrap", "()Ljavax/management/ObjectName;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/management/ObjectName"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "wrap", "(Ljavax/management/ObjectName;)Lorg/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "<init>", "(Ljavax/management/ObjectName;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "wrap", "(Ljava/lang/String;)Lorg/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper;", null, new String[] { "javax/management/MalformedObjectNameException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/management/ObjectName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/ObjectName", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "wrap", "(Ljavax/management/ObjectName;)Lorg/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/management/ObjectName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "objectName", "Ljavax/management/ObjectName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "registerMBean", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/LinkageError");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "MBEAN_SERVER", "Ljavax/management/MBeanServer;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "objectName", "Ljavax/management/ObjectName;");
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "MBEAN_SERVER", "Ljavax/management/MBeanServer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "objectName", "Ljavax/management/ObjectName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/MBeanServer", "registerMBean", "(Ljava/lang/Object;Ljavax/management/ObjectName;)Ljavax/management/ObjectInstance;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Failed to complete JMX registration for ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "objectName", "Ljavax/management/ObjectName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "warn", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "objectName", "Ljavax/management/ObjectName;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "toString", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unregisterMBean", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/LinkageError");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "MBEAN_SERVER", "Ljavax/management/MBeanServer;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "objectName", "Ljavax/management/ObjectName;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "MBEAN_SERVER", "Ljavax/management/MBeanServer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "objectName", "Ljavax/management/ObjectName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/MBeanServer", "isRegistered", "(Ljavax/management/ObjectName;)Z", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "MBEAN_SERVER", "Ljavax/management/MBeanServer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "objectName", "Ljavax/management/ObjectName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/MBeanServer", "unregisterMBean", "(Ljavax/management/ObjectName;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Failed to complete JMX unregistration for ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "objectName", "Ljavax/management/ObjectName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "warn", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unwrap", "()Ljavax/management/ObjectName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "objectName", "Ljavax/management/ObjectName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/juli/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "getPlatformMBeanServer", "()Ljavax/management/MBeanServer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/dbcp/dbcp2/ObjectNameWrapper", "MBEAN_SERVER", "Ljavax/management/MBeanServer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
