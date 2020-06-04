package asm.org.apache.activemq.transport;
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
public class AbstractInactivityMonitor$1$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/transport/AbstractInactivityMonitor$1$1", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/activemq/transport/AbstractInactivityMonitor$1", "run", "()V");

classWriter.visitInnerClass("org/apache/activemq/transport/AbstractInactivityMonitor$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/transport/AbstractInactivityMonitor$1$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/activemq/transport/AbstractInactivityMonitor$1;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/transport/AbstractInactivityMonitor$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/AbstractInactivityMonitor$1$1", "this$1", "Lorg/apache/activemq/transport/AbstractInactivityMonitor$1;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/AbstractInactivityMonitor$1$1", "this$1", "Lorg/apache/activemq/transport/AbstractInactivityMonitor$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/AbstractInactivityMonitor$1", "this$0", "Lorg/apache/activemq/transport/AbstractInactivityMonitor;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/InactivityIOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Channel was inactive (no connection attempt made) for too (>");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/AbstractInactivityMonitor$1$1", "this$1", "Lorg/apache/activemq/transport/AbstractInactivityMonitor$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/AbstractInactivityMonitor$1", "this$0", "Lorg/apache/activemq/transport/AbstractInactivityMonitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/AbstractInactivityMonitor", "access$000", "(Lorg/apache/activemq/transport/AbstractInactivityMonitor;)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(") long: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/AbstractInactivityMonitor$1$1", "this$1", "Lorg/apache/activemq/transport/AbstractInactivityMonitor$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/AbstractInactivityMonitor$1", "this$0", "Lorg/apache/activemq/transport/AbstractInactivityMonitor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/AbstractInactivityMonitor", "next", "Lorg/apache/activemq/transport/Transport;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/transport/Transport", "getRemoteAddress", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/InactivityIOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/AbstractInactivityMonitor", "onException", "(Ljava/io/IOException;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
