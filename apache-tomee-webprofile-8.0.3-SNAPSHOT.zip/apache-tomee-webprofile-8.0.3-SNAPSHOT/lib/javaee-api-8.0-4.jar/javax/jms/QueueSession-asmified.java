package asm.javax.jms;
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
public class QueueSessionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/jms/QueueSession", null, "java/lang/Object", new String[] { "javax/jms/Session" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createQueue", "(Ljava/lang/String;)Ljavax/jms/Queue;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createReceiver", "(Ljavax/jms/Queue;)Ljavax/jms/QueueReceiver;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createReceiver", "(Ljavax/jms/Queue;Ljava/lang/String;)Ljavax/jms/QueueReceiver;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSender", "(Ljavax/jms/Queue;)Ljavax/jms/QueueSender;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createBrowser", "(Ljavax/jms/Queue;)Ljavax/jms/QueueBrowser;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createBrowser", "(Ljavax/jms/Queue;Ljava/lang/String;)Ljavax/jms/QueueBrowser;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createTemporaryQueue", "()Ljavax/jms/TemporaryQueue;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
