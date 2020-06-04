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
public class ScheduledMessageDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/activemq/ScheduledMessage", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AMQ_SCHEDULED_DELAY", "Ljava/lang/String;", null, "AMQ_SCHEDULED_DELAY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AMQ_SCHEDULED_PERIOD", "Ljava/lang/String;", null, "AMQ_SCHEDULED_PERIOD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AMQ_SCHEDULED_REPEAT", "Ljava/lang/String;", null, "AMQ_SCHEDULED_REPEAT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AMQ_SCHEDULED_CRON", "Ljava/lang/String;", null, "AMQ_SCHEDULED_CRON");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AMQ_SCHEDULED_ID", "Ljava/lang/String;", null, "scheduledJobId");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AMQ_SCHEDULER_MANAGEMENT_DESTINATION", "Ljava/lang/String;", null, "ActiveMQ.Scheduler.Management");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AMQ_SCHEDULER_ACTION", "Ljava/lang/String;", null, "AMQ_SCHEDULER_ACTION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AMQ_SCHEDULER_ACTION_BROWSE", "Ljava/lang/String;", null, "BROWSE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AMQ_SCHEDULER_ACTION_REMOVE", "Ljava/lang/String;", null, "REMOVE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AMQ_SCHEDULER_ACTION_REMOVEALL", "Ljava/lang/String;", null, "REMOVEALL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AMQ_SCHEDULER_ACTION_START_TIME", "Ljava/lang/String;", null, "ACTION_START_TIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AMQ_SCHEDULER_ACTION_END_TIME", "Ljava/lang/String;", null, "ACTION_END_TIME");
fieldVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
