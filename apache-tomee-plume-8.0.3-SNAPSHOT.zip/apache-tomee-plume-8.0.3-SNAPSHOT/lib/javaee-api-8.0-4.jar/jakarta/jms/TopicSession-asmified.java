package asm.jakarta.jms;
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
public class TopicSessionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/jms/TopicSession", null, "java/lang/Object", new String[] { "jakarta/jms/Session" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createTopic", "(Ljava/lang/String;)Ljakarta/jms/Topic;", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSubscriber", "(Ljakarta/jms/Topic;)Ljakarta/jms/TopicSubscriber;", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSubscriber", "(Ljakarta/jms/Topic;Ljava/lang/String;Z)Ljakarta/jms/TopicSubscriber;", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createDurableSubscriber", "(Ljakarta/jms/Topic;Ljava/lang/String;)Ljakarta/jms/TopicSubscriber;", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createDurableSubscriber", "(Ljakarta/jms/Topic;Ljava/lang/String;Ljava/lang/String;Z)Ljakarta/jms/TopicSubscriber;", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createPublisher", "(Ljakarta/jms/Topic;)Ljakarta/jms/TopicPublisher;", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createTemporaryTopic", "()Ljakarta/jms/TemporaryTopic;", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unsubscribe", "(Ljava/lang/String;)V", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
