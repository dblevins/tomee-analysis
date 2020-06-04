package asm.org.apache.openejb.quartz;
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
public class ListenerManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/quartz/ListenerManager", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addJobListener", "(Lorg/apache/openejb/quartz/JobListener;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addJobListener", "(Lorg/apache/openejb/quartz/JobListener;Lorg/apache/openejb/quartz/Matcher;)V", "(Lorg/apache/openejb/quartz/JobListener;Lorg/apache/openejb/quartz/Matcher<Lorg/apache/openejb/quartz/JobKey;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addJobListener", "(Lorg/apache/openejb/quartz/JobListener;[Lorg/apache/openejb/quartz/Matcher;)V", "(Lorg/apache/openejb/quartz/JobListener;[Lorg/apache/openejb/quartz/Matcher<Lorg/apache/openejb/quartz/JobKey;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addJobListener", "(Lorg/apache/openejb/quartz/JobListener;Ljava/util/List;)V", "(Lorg/apache/openejb/quartz/JobListener;Ljava/util/List<Lorg/apache/openejb/quartz/Matcher<Lorg/apache/openejb/quartz/JobKey;>;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addJobListenerMatcher", "(Ljava/lang/String;Lorg/apache/openejb/quartz/Matcher;)Z", "(Ljava/lang/String;Lorg/apache/openejb/quartz/Matcher<Lorg/apache/openejb/quartz/JobKey;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeJobListenerMatcher", "(Ljava/lang/String;Lorg/apache/openejb/quartz/Matcher;)Z", "(Ljava/lang/String;Lorg/apache/openejb/quartz/Matcher<Lorg/apache/openejb/quartz/JobKey;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setJobListenerMatchers", "(Ljava/lang/String;Ljava/util/List;)Z", "(Ljava/lang/String;Ljava/util/List<Lorg/apache/openejb/quartz/Matcher<Lorg/apache/openejb/quartz/JobKey;>;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobListenerMatchers", "(Ljava/lang/String;)Ljava/util/List;", "(Ljava/lang/String;)Ljava/util/List<Lorg/apache/openejb/quartz/Matcher<Lorg/apache/openejb/quartz/JobKey;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeJobListener", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobListeners", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/openejb/quartz/JobListener;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobListener", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/JobListener;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addTriggerListener", "(Lorg/apache/openejb/quartz/TriggerListener;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addTriggerListener", "(Lorg/apache/openejb/quartz/TriggerListener;Lorg/apache/openejb/quartz/Matcher;)V", "(Lorg/apache/openejb/quartz/TriggerListener;Lorg/apache/openejb/quartz/Matcher<Lorg/apache/openejb/quartz/TriggerKey;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addTriggerListener", "(Lorg/apache/openejb/quartz/TriggerListener;[Lorg/apache/openejb/quartz/Matcher;)V", "(Lorg/apache/openejb/quartz/TriggerListener;[Lorg/apache/openejb/quartz/Matcher<Lorg/apache/openejb/quartz/TriggerKey;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addTriggerListener", "(Lorg/apache/openejb/quartz/TriggerListener;Ljava/util/List;)V", "(Lorg/apache/openejb/quartz/TriggerListener;Ljava/util/List<Lorg/apache/openejb/quartz/Matcher<Lorg/apache/openejb/quartz/TriggerKey;>;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addTriggerListenerMatcher", "(Ljava/lang/String;Lorg/apache/openejb/quartz/Matcher;)Z", "(Ljava/lang/String;Lorg/apache/openejb/quartz/Matcher<Lorg/apache/openejb/quartz/TriggerKey;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeTriggerListenerMatcher", "(Ljava/lang/String;Lorg/apache/openejb/quartz/Matcher;)Z", "(Ljava/lang/String;Lorg/apache/openejb/quartz/Matcher<Lorg/apache/openejb/quartz/TriggerKey;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setTriggerListenerMatchers", "(Ljava/lang/String;Ljava/util/List;)Z", "(Ljava/lang/String;Ljava/util/List<Lorg/apache/openejb/quartz/Matcher<Lorg/apache/openejb/quartz/TriggerKey;>;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTriggerListenerMatchers", "(Ljava/lang/String;)Ljava/util/List;", "(Ljava/lang/String;)Ljava/util/List<Lorg/apache/openejb/quartz/Matcher<Lorg/apache/openejb/quartz/TriggerKey;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeTriggerListener", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTriggerListeners", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/openejb/quartz/TriggerListener;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTriggerListener", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/TriggerListener;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addSchedulerListener", "(Lorg/apache/openejb/quartz/SchedulerListener;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeSchedulerListener", "(Lorg/apache/openejb/quartz/SchedulerListener;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSchedulerListeners", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/openejb/quartz/SchedulerListener;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
