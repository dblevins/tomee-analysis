package asm.org.apache.activemq.ra;
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
public class ActiveMQManagedConnection$3Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/ra/ActiveMQManagedConnection$3", null, "java/lang/Object", new String[] { "jakarta/resource/spi/ManagedConnectionMetaData" });

classWriter.visitOuterClass("org/apache/activemq/ra/ActiveMQManagedConnection", "getMetaData", "()Ljakarta/resource/spi/ManagedConnectionMetaData;");

classWriter.visitInnerClass("org/apache/activemq/ra/ActiveMQManagedConnection$3", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/ra/ActiveMQManagedConnection;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/ra/ActiveMQManagedConnection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/ra/ActiveMQManagedConnection$3", "this$0", "Lorg/apache/activemq/ra/ActiveMQManagedConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEISProductName", "()Ljava/lang/String;", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/jms/JMSException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQManagedConnection$3", "this$0", "Lorg/apache/activemq/ra/ActiveMQManagedConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQManagedConnection", "access$400", "(Lorg/apache/activemq/ra/ActiveMQManagedConnection;)Lorg/apache/activemq/ActiveMQConnection;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "jakarta/resource/ResourceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Not connected.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/resource/ResourceException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQManagedConnection$3", "this$0", "Lorg/apache/activemq/ra/ActiveMQManagedConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQManagedConnection", "access$400", "(Lorg/apache/activemq/ra/ActiveMQManagedConnection;)Lorg/apache/activemq/ActiveMQConnection;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ActiveMQConnection", "getMetaData", "()Ljakarta/jms/ConnectionMetaData;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/ConnectionMetaData", "getJMSProviderName", "()Ljava/lang/String;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/jms/JMSException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "jakarta/resource/ResourceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error accessing provider.");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/resource/ResourceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEISProductVersion", "()Ljava/lang/String;", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/jms/JMSException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQManagedConnection$3", "this$0", "Lorg/apache/activemq/ra/ActiveMQManagedConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQManagedConnection", "access$400", "(Lorg/apache/activemq/ra/ActiveMQManagedConnection;)Lorg/apache/activemq/ActiveMQConnection;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "jakarta/resource/ResourceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Not connected.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/resource/ResourceException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQManagedConnection$3", "this$0", "Lorg/apache/activemq/ra/ActiveMQManagedConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQManagedConnection", "access$400", "(Lorg/apache/activemq/ra/ActiveMQManagedConnection;)Lorg/apache/activemq/ActiveMQConnection;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ActiveMQConnection", "getMetaData", "()Ljakarta/jms/ConnectionMetaData;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/ConnectionMetaData", "getProviderVersion", "()Ljava/lang/String;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/jms/JMSException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "jakarta/resource/ResourceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error accessing provider.");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/resource/ResourceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxConnections", "()I", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQManagedConnection$3", "this$0", "Lorg/apache/activemq/ra/ActiveMQManagedConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQManagedConnection", "access$400", "(Lorg/apache/activemq/ra/ActiveMQManagedConnection;)Lorg/apache/activemq/ActiveMQConnection;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "jakarta/resource/ResourceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Not connected.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/resource/ResourceException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(new Integer(2147483647));
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUserName", "()Ljava/lang/String;", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/jms/JMSException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQManagedConnection$3", "this$0", "Lorg/apache/activemq/ra/ActiveMQManagedConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQManagedConnection", "access$400", "(Lorg/apache/activemq/ra/ActiveMQManagedConnection;)Lorg/apache/activemq/ActiveMQConnection;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "jakarta/resource/ResourceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Not connected.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/resource/ResourceException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQManagedConnection$3", "this$0", "Lorg/apache/activemq/ra/ActiveMQManagedConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQManagedConnection", "access$400", "(Lorg/apache/activemq/ra/ActiveMQManagedConnection;)Lorg/apache/activemq/ActiveMQConnection;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ActiveMQConnection", "getClientID", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/jms/JMSException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "jakarta/resource/ResourceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error accessing provider.");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/resource/ResourceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
