package asm.org.apache.openejb.core.timer;
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
public class TimerStoreDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/core/timer/TimerStore", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTimer", "(Ljava/lang/String;J)Lorg/apache/openejb/core/timer/TimerData;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTimers", "(Ljava/lang/String;)Ljava/util/Collection;", "(Ljava/lang/String;)Ljava/util/Collection<Lorg/apache/openejb/core/timer/TimerData;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "loadTimers", "(Lorg/apache/openejb/core/timer/EjbTimerServiceImpl;Ljava/lang/String;)Ljava/util/Collection;", "(Lorg/apache/openejb/core/timer/EjbTimerServiceImpl;Ljava/lang/String;)Ljava/util/Collection<Lorg/apache/openejb/core/timer/TimerData;>;", new String[] { "org/apache/openejb/core/timer/TimerStoreException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addTimerData", "(Lorg/apache/openejb/core/timer/TimerData;)V", null, new String[] { "org/apache/openejb/core/timer/TimerStoreException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSingleActionTimer", "(Lorg/apache/openejb/core/timer/EjbTimerServiceImpl;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/Date;Ljakarta/ejb/TimerConfig;)Lorg/apache/openejb/core/timer/TimerData;", null, new String[] { "org/apache/openejb/core/timer/TimerStoreException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createIntervalTimer", "(Lorg/apache/openejb/core/timer/EjbTimerServiceImpl;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/Date;JLjakarta/ejb/TimerConfig;)Lorg/apache/openejb/core/timer/TimerData;", null, new String[] { "org/apache/openejb/core/timer/TimerStoreException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCalendarTimer", "(Lorg/apache/openejb/core/timer/EjbTimerServiceImpl;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljakarta/ejb/ScheduleExpression;Ljakarta/ejb/TimerConfig;Z)Lorg/apache/openejb/core/timer/TimerData;", null, new String[] { "org/apache/openejb/core/timer/TimerStoreException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeTimer", "(J)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateIntervalTimer", "(Lorg/apache/openejb/core/timer/TimerData;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
