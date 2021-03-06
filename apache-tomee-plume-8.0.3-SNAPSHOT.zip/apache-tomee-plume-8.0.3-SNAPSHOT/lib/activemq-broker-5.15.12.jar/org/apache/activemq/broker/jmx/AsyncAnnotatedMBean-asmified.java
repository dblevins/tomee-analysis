package asm.org.apache.activemq.broker.jmx;
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
public class AsyncAnnotatedMBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/broker/jmx/AsyncAnnotatedMBean", null, "org/apache/activemq/broker/jmx/AnnotatedMBean", null);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/AsyncAnnotatedMBean$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "executor", "Ljava/util/concurrent/ExecutorService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "timeout", "J", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/concurrent/ExecutorService;JLjava/lang/Object;Ljava/lang/Class;Ljavax/management/ObjectName;)V", "<T:Ljava/lang/Object;>(Ljava/util/concurrent/ExecutorService;JTT;Ljava/lang/Class<TT;>;Ljavax/management/ObjectName;)V", new String[] { "javax/management/NotCompliantMBeanException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/AnnotatedMBean", "<init>", "(Ljava/lang/Object;Ljava/lang/Class;Ljavax/management/ObjectName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/AsyncAnnotatedMBean", "timeout", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/AsyncAnnotatedMBean", "executor", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/AsyncAnnotatedMBean", "timeout", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/Class;Ljavax/management/ObjectName;)V", "(Ljava/lang/Class<*>;Ljavax/management/ObjectName;)V", new String[] { "javax/management/NotCompliantMBeanException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/AnnotatedMBean", "<init>", "(Ljava/lang/Class;Ljavax/management/ObjectName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/AsyncAnnotatedMBean", "timeout", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "asyncInvole", "(Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "javax/management/MBeanException", "javax/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/AnnotatedMBean", "invoke", "(Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "registerMBean", "(Ljava/util/concurrent/ExecutorService;JLorg/apache/activemq/broker/jmx/ManagementContext;Ljava/lang/Object;Ljavax/management/ObjectName;)Ljavax/management/ObjectInstance;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("async timeout cannot be negative.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("timeout given but no ExecutorService instance given.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("MBean");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getInterfaces", "()[Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 9);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"java/util/concurrent/ExecutorService", Opcodes.LONG, "org/apache/activemq/broker/jmx/ManagementContext", "java/lang/Object", "javax/management/ObjectName", "java/lang/String", "[Ljava/lang/Class;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 8);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/AnnotatedMBean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/AnnotatedMBean", "<init>", "(Ljava/lang/Object;Ljava/lang/Class;Ljavax/management/ObjectName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagementContext", "registerMBean", "(Ljava/lang/Object;Ljavax/management/ObjectName;)Ljavax/management/ObjectInstance;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/AsyncAnnotatedMBean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/AsyncAnnotatedMBean", "<init>", "(Ljava/util/concurrent/ExecutorService;JLjava/lang/Object;Ljava/lang/Class;Ljavax/management/ObjectName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagementContext", "registerMBean", "(Ljava/lang/Object;Ljavax/management/ObjectName;)Ljavax/management/ObjectInstance;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagementContext", "registerMBean", "(Ljava/lang/Object;Ljavax/management/ObjectName;)Ljavax/management/ObjectInstance;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "(Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "javax/management/MBeanException", "javax/management/ReflectionException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/util/concurrent/ExecutionException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/Exception");
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label4, null);
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label2, label5, label4, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/AsyncAnnotatedMBean", "executor", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/AsyncAnnotatedMBean$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/AsyncAnnotatedMBean$1", "<init>", "(Lorg/apache/activemq/broker/jmx/AsyncAnnotatedMBean;Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ExecutorService", "submit", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/AsyncAnnotatedMBean", "timeout", "J");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "MILLISECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/Future", "get", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/Future", "isDone", "()Z", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/Future", "cancel", "(Z)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/activemq/broker/jmx/AsyncAnnotatedMBean", "java/lang/String", "[Ljava/lang/Object;", "[Ljava/lang/String;", "java/lang/String", "[Ljava/lang/Object;", "[Ljava/lang/String;", "java/util/concurrent/Future", "java/lang/Object"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/activemq/broker/jmx/AsyncAnnotatedMBean", "java/lang/String", "[Ljava/lang/Object;", "[Ljava/lang/String;", "java/lang/String", "[Ljava/lang/Object;", "[Ljava/lang/String;", "java/util/concurrent/Future"}, 1, new Object[] {"java/util/concurrent/ExecutionException"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ExecutionException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/management/MBeanException");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ExecutionException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/management/MBeanException");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/concurrent/ExecutionException"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/management/MBeanException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/MBeanException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/activemq/broker/jmx/AsyncAnnotatedMBean", "java/lang/String", "[Ljava/lang/Object;", "[Ljava/lang/String;", "java/lang/String", "[Ljava/lang/Object;", "[Ljava/lang/String;", "java/util/concurrent/Future"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitTypeInsn(NEW, "javax/management/MBeanException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/MBeanException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/Future", "isDone", "()Z", true);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/Future", "cancel", "(Z)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, "java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(7, 10);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
