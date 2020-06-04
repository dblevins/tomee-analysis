package asm.javax.ejb;
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
public class TimerServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/ejb/TimerService", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createTimer", "(Ljava/util/Date;JLjava/io/Serializable;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createTimer", "(Ljava/util/Date;Ljava/io/Serializable;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createTimer", "(JJLjava/io/Serializable;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createTimer", "(JLjava/io/Serializable;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTimers", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljavax/ejb/Timer;>;", new String[] { "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAllTimers", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljavax/ejb/Timer;>;", new String[] { "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSingleActionTimer", "(JLjavax/ejb/TimerConfig;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSingleActionTimer", "(Ljava/util/Date;Ljavax/ejb/TimerConfig;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createIntervalTimer", "(JJLjavax/ejb/TimerConfig;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createIntervalTimer", "(Ljava/util/Date;JLjavax/ejb/TimerConfig;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCalendarTimer", "(Ljavax/ejb/ScheduleExpression;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCalendarTimer", "(Ljavax/ejb/ScheduleExpression;Ljavax/ejb/TimerConfig;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
