package asm.org.apache.openejb.core.mdb;
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
public class MdbInstanceManager$MdbJmxControlDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/openejb/core/mdb/MdbInstanceManager$MdbJmxControl", null, "java/lang/Object", new String[] { "javax/management/DynamicMBean" });

classWriter.visitInnerClass("org/apache/openejb/core/mdb/MdbPoolContainer$MdbActivationContext", "org/apache/openejb/core/mdb/MdbPoolContainer", "MdbActivationContext", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/core/mdb/MdbInstanceManager$MdbJmxControl", "org/apache/openejb/core/mdb/MdbInstanceManager", "MdbJmxControl", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/core/mdb/MdbInstanceManager$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ATTRIBUTE_LIST", "Ljavax/management/AttributeList;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "INFO", "Ljavax/management/MBeanInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "activationContext", "Lorg/apache/openejb/core/mdb/MdbPoolContainer$MdbActivationContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openejb/core/mdb/MdbPoolContainer$MdbActivationContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/MdbInstanceManager$MdbJmxControl", "activationContext", "Lorg/apache/openejb/core/mdb/MdbPoolContainer$MdbActivationContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "(Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "javax/management/MBeanException", "javax/management/ReflectionException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/resource/ResourceException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("stop");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/MdbInstanceManager$MdbJmxControl", "activationContext", "Lorg/apache/openejb/core/mdb/MdbPoolContainer$MdbActivationContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/mdb/MdbPoolContainer$MdbActivationContext", "stop", "()V", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("start");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/MdbInstanceManager$MdbJmxControl", "activationContext", "Lorg/apache/openejb/core/mdb/MdbPoolContainer$MdbActivationContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/mdb/MdbPoolContainer$MdbActivationContext", "start", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/resource/ResourceException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/mdb/MdbInstanceManager", "logger", "Lorg/apache/openejb/util/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Error invoking ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(": ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/resource/ResourceException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "error", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "javax/management/MBeanException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/resource/ResourceException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/MBeanException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/management/MBeanException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("unsupported operation: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/MBeanException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMBeanInfo", "()Ljavax/management/MBeanInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/mdb/MdbInstanceManager$MdbJmxControl", "INFO", "Ljavax/management/MBeanInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "javax/management/AttributeNotFoundException", "javax/management/MBeanException", "javax/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("started");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/MdbInstanceManager$MdbJmxControl", "activationContext", "Lorg/apache/openejb/core/mdb/MdbPoolContainer$MdbActivationContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/mdb/MdbPoolContainer$MdbActivationContext", "isStarted", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/management/AttributeNotFoundException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/AttributeNotFoundException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAttribute", "(Ljavax/management/Attribute;)V", null, new String[] { "javax/management/AttributeNotFoundException", "javax/management/InvalidAttributeValueException", "javax/management/MBeanException", "javax/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/management/AttributeNotFoundException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/AttributeNotFoundException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributes", "([Ljava/lang/String;)Ljavax/management/AttributeList;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/mdb/MdbInstanceManager$MdbJmxControl", "ATTRIBUTE_LIST", "Ljavax/management/AttributeList;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAttributes", "(Ljavax/management/AttributeList;)Ljavax/management/AttributeList;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/mdb/MdbInstanceManager$MdbJmxControl", "ATTRIBUTE_LIST", "Ljavax/management/AttributeList;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/core/mdb/MdbPoolContainer$MdbActivationContext;Lorg/apache/openejb/core/mdb/MdbInstanceManager$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/mdb/MdbInstanceManager$MdbJmxControl", "<init>", "(Lorg/apache/openejb/core/mdb/MdbPoolContainer$MdbActivationContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/management/AttributeList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/AttributeList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/mdb/MdbInstanceManager$MdbJmxControl", "ATTRIBUTE_LIST", "Ljavax/management/AttributeList;");
methodVisitor.visitTypeInsn(NEW, "javax/management/MBeanInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("org.apache.openejb.resource.activemq.ActiveMQResourceAdapter.MdbJmxControl");
methodVisitor.visitLdcInsn("Allows to control a MDB (start/stop)");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/management/MBeanAttributeInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "javax/management/MBeanAttributeInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("started");
methodVisitor.visitLdcInsn("boolean");
methodVisitor.visitLdcInsn("started: boolean indicating whether this MDB endpoint has been activated.");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/MBeanAttributeInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/management/MBeanConstructorInfo");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/management/MBeanOperationInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "javax/management/MBeanOperationInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("start");
methodVisitor.visitLdcInsn("Ensure the listener is active.");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/management/MBeanParameterInfo");
methodVisitor.visitLdcInsn("void");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/MBeanOperationInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanParameterInfo;Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "javax/management/MBeanOperationInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("stop");
methodVisitor.visitLdcInsn("Ensure the listener is not active.");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/management/MBeanParameterInfo");
methodVisitor.visitLdcInsn("void");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/MBeanOperationInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanParameterInfo;Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/management/MBeanNotificationInfo");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/MBeanInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanAttributeInfo;[Ljavax/management/MBeanConstructorInfo;[Ljavax/management/MBeanOperationInfo;[Ljavax/management/MBeanNotificationInfo;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/mdb/MdbInstanceManager$MdbJmxControl", "INFO", "Ljavax/management/MBeanInfo;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(16, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
