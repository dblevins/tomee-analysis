package asm.jakarta.ejb;
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

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/ejb/TimerService", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createTimer", "(Ljava/util/Date;JLjava/io/Serializable;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createTimer", "(Ljava/util/Date;Ljava/io/Serializable;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createTimer", "(JJLjava/io/Serializable;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createTimer", "(JLjava/io/Serializable;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTimers", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljakarta/ejb/Timer;>;", new String[] { "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAllTimers", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljakarta/ejb/Timer;>;", new String[] { "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSingleActionTimer", "(JLjakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSingleActionTimer", "(Ljava/util/Date;Ljakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createIntervalTimer", "(JJLjakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createIntervalTimer", "(Ljava/util/Date;JLjakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCalendarTimer", "(Ljakarta/ejb/ScheduleExpression;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCalendarTimer", "(Ljakarta/ejb/ScheduleExpression;Ljakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
