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
public class TimerServiceWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/core/timer/TimerServiceWrapper", null, "java/lang/Object", new String[] { "javax/ejb/TimerService" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTimer", "(Ljava/util/Date;JLjava/io/Serializable;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/timer/TimerServiceWrapper", "getTimerService", "()Ljavax/ejb/TimerService;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ejb/TimerService", "createTimer", "(Ljava/util/Date;JLjava/io/Serializable;)Ljavax/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTimer", "(Ljava/util/Date;Ljava/io/Serializable;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/timer/TimerServiceWrapper", "getTimerService", "()Ljavax/ejb/TimerService;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ejb/TimerService", "createTimer", "(Ljava/util/Date;Ljava/io/Serializable;)Ljavax/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTimer", "(JJLjava/io/Serializable;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/timer/TimerServiceWrapper", "getTimerService", "()Ljavax/ejb/TimerService;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ejb/TimerService", "createTimer", "(JJLjava/io/Serializable;)Ljavax/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTimer", "(JLjava/io/Serializable;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/timer/TimerServiceWrapper", "getTimerService", "()Ljavax/ejb/TimerService;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ejb/TimerService", "createTimer", "(JLjava/io/Serializable;)Ljavax/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTimers", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljavax/ejb/Timer;>;", new String[] { "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/timer/TimerServiceWrapper", "getTimerService", "()Ljavax/ejb/TimerService;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ejb/TimerService", "getTimers", "()Ljava/util/Collection;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAllTimers", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljavax/ejb/Timer;>;", new String[] { "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/timer/Timers", "all", "()Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSingleActionTimer", "(JLjavax/ejb/TimerConfig;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/timer/TimerServiceWrapper", "getTimerService", "()Ljavax/ejb/TimerService;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ejb/TimerService", "createSingleActionTimer", "(JLjavax/ejb/TimerConfig;)Ljavax/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSingleActionTimer", "(Ljava/util/Date;Ljavax/ejb/TimerConfig;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/timer/TimerServiceWrapper", "getTimerService", "()Ljavax/ejb/TimerService;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ejb/TimerService", "createSingleActionTimer", "(Ljava/util/Date;Ljavax/ejb/TimerConfig;)Ljavax/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createIntervalTimer", "(JJLjavax/ejb/TimerConfig;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/timer/TimerServiceWrapper", "getTimerService", "()Ljavax/ejb/TimerService;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ejb/TimerService", "createIntervalTimer", "(JJLjavax/ejb/TimerConfig;)Ljavax/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createIntervalTimer", "(Ljava/util/Date;JLjavax/ejb/TimerConfig;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/timer/TimerServiceWrapper", "getTimerService", "()Ljavax/ejb/TimerService;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ejb/TimerService", "createIntervalTimer", "(Ljava/util/Date;JLjavax/ejb/TimerConfig;)Ljavax/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCalendarTimer", "(Ljavax/ejb/ScheduleExpression;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/timer/TimerServiceWrapper", "getTimerService", "()Ljavax/ejb/TimerService;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ejb/TimerService", "createCalendarTimer", "(Ljavax/ejb/ScheduleExpression;)Ljavax/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCalendarTimer", "(Ljavax/ejb/ScheduleExpression;Ljavax/ejb/TimerConfig;)Ljavax/ejb/Timer;", null, new String[] { "java/lang/IllegalArgumentException", "java/lang/IllegalStateException", "javax/ejb/EJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/timer/TimerServiceWrapper", "getTimerService", "()Ljavax/ejb/TimerService;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ejb/TimerService", "createCalendarTimer", "(Ljavax/ejb/ScheduleExpression;Ljavax/ejb/TimerConfig;)Ljavax/ejb/Timer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getTimerService", "()Ljavax/ejb/TimerService;", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ThreadContext", "getThreadContext", "()Lorg/apache/openejb/core/ThreadContext;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ThreadContext", "getBeanContext", "()Lorg/apache/openejb/BeanContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ThreadContext", "getPrimaryKey", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/timer/Timers", "getTimerService", "(Ljava/lang/Object;Lorg/apache/openejb/BeanContext;Z)Ljavax/ejb/TimerService;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
