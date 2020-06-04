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
public class ActiveMQManagedConnection$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/ra/ActiveMQManagedConnection$2", null, "java/lang/Object", new String[] { "org/apache/activemq/LocalTransactionEventListener" });

classWriter.visitOuterClass("org/apache/activemq/ra/ActiveMQManagedConnection", "<init>", "(Ljavax/security/auth/Subject;Lorg/apache/activemq/ActiveMQConnection;Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;)V");

classWriter.visitInnerClass("org/apache/activemq/ra/ActiveMQManagedConnection$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/ra/ActiveMQManagedConnection;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/ra/ActiveMQManagedConnection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/ra/ActiveMQManagedConnection$2", "this$0", "Lorg/apache/activemq/ra/ActiveMQManagedConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beginEvent", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQManagedConnection$2", "this$0", "Lorg/apache/activemq/ra/ActiveMQManagedConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQManagedConnection", "access$100", "(Lorg/apache/activemq/ra/ActiveMQManagedConnection;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commitEvent", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQManagedConnection$2", "this$0", "Lorg/apache/activemq/ra/ActiveMQManagedConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQManagedConnection", "access$200", "(Lorg/apache/activemq/ra/ActiveMQManagedConnection;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rollbackEvent", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQManagedConnection$2", "this$0", "Lorg/apache/activemq/ra/ActiveMQManagedConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQManagedConnection", "access$300", "(Lorg/apache/activemq/ra/ActiveMQManagedConnection;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
