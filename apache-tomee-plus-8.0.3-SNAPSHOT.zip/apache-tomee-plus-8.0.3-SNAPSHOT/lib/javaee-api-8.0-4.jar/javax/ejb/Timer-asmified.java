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
public class TimerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/ejb/Timer", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cancel", "()V", null, new String[] { "javax/ejb/EJBException", "java/lang/IllegalStateException", "javax/ejb/NoSuchObjectLocalException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTimeRemaining", "()J", null, new String[] { "javax/ejb/EJBException", "java/lang/IllegalStateException", "javax/ejb/NoSuchObjectLocalException", "javax/ejb/NoMoreTimeoutsException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNextTimeout", "()Ljava/util/Date;", null, new String[] { "javax/ejb/EJBException", "java/lang/IllegalStateException", "javax/ejb/NoSuchObjectLocalException", "javax/ejb/NoMoreTimeoutsException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInfo", "()Ljava/io/Serializable;", null, new String[] { "javax/ejb/EJBException", "java/lang/IllegalStateException", "javax/ejb/NoSuchObjectLocalException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getHandle", "()Ljavax/ejb/TimerHandle;", null, new String[] { "javax/ejb/EJBException", "java/lang/IllegalStateException", "javax/ejb/NoSuchObjectLocalException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSchedule", "()Ljavax/ejb/ScheduleExpression;", null, new String[] { "javax/ejb/EJBException", "java/lang/IllegalStateException", "javax/ejb/NoSuchObjectLocalException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isPersistent", "()Z", null, new String[] { "javax/ejb/EJBException", "java/lang/IllegalStateException", "javax/ejb/NoSuchObjectLocalException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isCalendarTimer", "()Z", null, new String[] { "javax/ejb/EJBException", "java/lang/IllegalStateException", "javax/ejb/NoSuchObjectLocalException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
