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
public class TimerServiceImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/core/timer/TimerServiceImpl", null, "java/lang/Object", new String[] { "jakarta/ejb/TimerService" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ejbTimerService", "Lorg/apache/openejb/core/timer/EjbTimerService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "primaryKey", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ejbTimeout", "Ljava/lang/reflect/Method;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/core/timer/EjbTimerService;Ljava/lang/Object;Ljava/lang/reflect/Method;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimerService", "Lorg/apache/openejb/core/timer/EjbTimerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "primaryKey", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimeout", "Ljava/lang/reflect/Method;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTimer", "(Ljava/util/Date;JLjava/io/Serializable;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimerService", "Lorg/apache/openejb/core/timer/EjbTimerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "primaryKey", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimeout", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitTypeInsn(NEW, "jakarta/ejb/TimerConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ejb/TimerConfig", "<init>", "(Ljava/io/Serializable;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/timer/EjbTimerService", "createTimer", "(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/Date;JLjakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(10, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTimer", "(Ljava/util/Date;Ljava/io/Serializable;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimerService", "Lorg/apache/openejb/core/timer/EjbTimerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "primaryKey", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimeout", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "jakarta/ejb/TimerConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ejb/TimerConfig", "<init>", "(Ljava/io/Serializable;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/timer/EjbTimerService", "createTimer", "(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/Date;Ljakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTimer", "(JJLjava/io/Serializable;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimerService", "Lorg/apache/openejb/core/timer/EjbTimerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "primaryKey", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimeout", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitTypeInsn(NEW, "jakarta/ejb/TimerConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ejb/TimerConfig", "<init>", "(Ljava/io/Serializable;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/timer/EjbTimerService", "createTimer", "(Ljava/lang/Object;Ljava/lang/reflect/Method;JJLjakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(11, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTimer", "(JLjava/io/Serializable;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimerService", "Lorg/apache/openejb/core/timer/EjbTimerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "primaryKey", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimeout", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitTypeInsn(NEW, "jakarta/ejb/TimerConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ejb/TimerConfig", "<init>", "(Ljava/io/Serializable;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/timer/EjbTimerService", "createTimer", "(Ljava/lang/Object;Ljava/lang/reflect/Method;JLjakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTimers", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljakarta/ejb/Timer;>;", new String[] { "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimerService", "Lorg/apache/openejb/core/timer/EjbTimerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "primaryKey", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/timer/EjbTimerService", "getTimers", "(Ljava/lang/Object;)Ljava/util/Collection;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSingleActionTimer", "(JLjakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimerService", "Lorg/apache/openejb/core/timer/EjbTimerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "primaryKey", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimeout", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/timer/EjbTimerService", "createTimer", "(Ljava/lang/Object;Ljava/lang/reflect/Method;JLjakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSingleActionTimer", "(Ljava/util/Date;Ljakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimerService", "Lorg/apache/openejb/core/timer/EjbTimerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "primaryKey", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimeout", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/timer/EjbTimerService", "createTimer", "(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/Date;Ljakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createIntervalTimer", "(JJLjakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimerService", "Lorg/apache/openejb/core/timer/EjbTimerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "primaryKey", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimeout", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/timer/EjbTimerService", "createTimer", "(Ljava/lang/Object;Ljava/lang/reflect/Method;JJLjakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createIntervalTimer", "(Ljava/util/Date;JLjakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimerService", "Lorg/apache/openejb/core/timer/EjbTimerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "primaryKey", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimeout", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/timer/EjbTimerService", "createTimer", "(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/Date;JLjakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCalendarTimer", "(Ljakarta/ejb/ScheduleExpression;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimerService", "Lorg/apache/openejb/core/timer/EjbTimerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "primaryKey", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimeout", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/timer/TimerServiceImpl", "copy", "(Ljakarta/ejb/ScheduleExpression;)Ljakarta/ejb/ScheduleExpression;", false);
methodVisitor.visitTypeInsn(NEW, "jakarta/ejb/TimerConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ejb/TimerConfig", "<init>", "(Ljava/io/Serializable;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/timer/EjbTimerService", "createTimer", "(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljakarta/ejb/ScheduleExpression;Ljakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCalendarTimer", "(Ljakarta/ejb/ScheduleExpression;Ljakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimerService", "Lorg/apache/openejb/core/timer/EjbTimerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "primaryKey", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/TimerServiceImpl", "ejbTimeout", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/timer/TimerServiceImpl", "copy", "(Ljakarta/ejb/ScheduleExpression;)Ljakarta/ejb/ScheduleExpression;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/timer/EjbTimerService", "createTimer", "(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljakarta/ejb/ScheduleExpression;Ljakarta/ejb/TimerConfig;)Ljakarta/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "copy", "(Ljakarta/ejb/ScheduleExpression;)Ljakarta/ejb/ScheduleExpression;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/ejb/ScheduleExpression");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ejb/ScheduleExpression", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "getYear", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "year", "(Ljava/lang/String;)Ljakarta/ejb/ScheduleExpression;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "getMonth", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "month", "(Ljava/lang/String;)Ljakarta/ejb/ScheduleExpression;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "getDayOfMonth", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "dayOfMonth", "(Ljava/lang/String;)Ljakarta/ejb/ScheduleExpression;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "getDayOfWeek", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "dayOfWeek", "(Ljava/lang/String;)Ljakarta/ejb/ScheduleExpression;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "getHour", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "hour", "(Ljava/lang/String;)Ljakarta/ejb/ScheduleExpression;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "getMinute", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "minute", "(Ljava/lang/String;)Ljakarta/ejb/ScheduleExpression;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "getSecond", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "second", "(Ljava/lang/String;)Ljakarta/ejb/ScheduleExpression;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "getStart", "()Ljava/util/Date;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "start", "(Ljava/util/Date;)Ljakarta/ejb/ScheduleExpression;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "getEnd", "()Ljava/util/Date;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "end", "(Ljava/util/Date;)Ljakarta/ejb/ScheduleExpression;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "getTimezone", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/ScheduleExpression", "timezone", "(Ljava/lang/String;)Ljakarta/ejb/ScheduleExpression;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAllTimers", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljakarta/ejb/Timer;>;", new String[] { "java/lang/IllegalStateException", "jakarta/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("not expecting to call this method from this class, see TimerServiceWrapper");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
