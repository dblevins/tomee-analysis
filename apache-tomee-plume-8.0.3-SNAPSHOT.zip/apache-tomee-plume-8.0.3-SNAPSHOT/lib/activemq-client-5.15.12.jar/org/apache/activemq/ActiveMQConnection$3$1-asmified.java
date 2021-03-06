package asm.org.apache.activemq;
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
public class ActiveMQConnection$3$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/ActiveMQConnection$3$1", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/activemq/ActiveMQConnection$3", "processConnectionError", "(Lorg/apache/activemq/command/ConnectionError;)Lorg/apache/activemq/command/Response;");

classWriter.visitInnerClass("org/apache/activemq/ActiveMQConnection$3", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/ActiveMQConnection$3$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$error", "Lorg/apache/activemq/command/ConnectionError;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/activemq/ActiveMQConnection$3;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/ActiveMQConnection$3;Lorg/apache/activemq/command/ConnectionError;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/ActiveMQConnection$3$1", "this$1", "Lorg/apache/activemq/ActiveMQConnection$3;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/ActiveMQConnection$3$1", "val$error", "Lorg/apache/activemq/command/ConnectionError;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQConnection$3$1", "this$1", "Lorg/apache/activemq/ActiveMQConnection$3;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQConnection$3", "this$0", "Lorg/apache/activemq/ActiveMQConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQConnection$3$1", "val$error", "Lorg/apache/activemq/command/ConnectionError;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ConnectionError", "getException", "()Ljava/lang/Throwable;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ActiveMQConnection", "onAsyncException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
