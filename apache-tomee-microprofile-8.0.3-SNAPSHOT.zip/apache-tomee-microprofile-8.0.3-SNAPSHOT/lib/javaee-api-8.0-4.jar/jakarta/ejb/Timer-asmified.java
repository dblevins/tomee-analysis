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
public class TimerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/ejb/Timer", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cancel", "()V", null, new String[] { "jakarta/ejb/EJBException", "java/lang/IllegalStateException", "jakarta/ejb/NoSuchObjectLocalException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTimeRemaining", "()J", null, new String[] { "jakarta/ejb/EJBException", "java/lang/IllegalStateException", "jakarta/ejb/NoSuchObjectLocalException", "jakarta/ejb/NoMoreTimeoutsException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNextTimeout", "()Ljava/util/Date;", null, new String[] { "jakarta/ejb/EJBException", "java/lang/IllegalStateException", "jakarta/ejb/NoSuchObjectLocalException", "jakarta/ejb/NoMoreTimeoutsException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInfo", "()Ljava/io/Serializable;", null, new String[] { "jakarta/ejb/EJBException", "java/lang/IllegalStateException", "jakarta/ejb/NoSuchObjectLocalException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getHandle", "()Ljakarta/ejb/TimerHandle;", null, new String[] { "jakarta/ejb/EJBException", "java/lang/IllegalStateException", "jakarta/ejb/NoSuchObjectLocalException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSchedule", "()Ljakarta/ejb/ScheduleExpression;", null, new String[] { "jakarta/ejb/EJBException", "java/lang/IllegalStateException", "jakarta/ejb/NoSuchObjectLocalException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isPersistent", "()Z", null, new String[] { "jakarta/ejb/EJBException", "java/lang/IllegalStateException", "jakarta/ejb/NoSuchObjectLocalException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isCalendarTimer", "()Z", null, new String[] { "jakarta/ejb/EJBException", "java/lang/IllegalStateException", "jakarta/ejb/NoSuchObjectLocalException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
