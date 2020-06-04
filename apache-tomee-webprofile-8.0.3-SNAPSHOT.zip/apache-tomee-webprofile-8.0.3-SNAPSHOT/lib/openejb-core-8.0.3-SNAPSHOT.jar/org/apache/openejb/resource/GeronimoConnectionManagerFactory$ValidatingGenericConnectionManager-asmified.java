package asm.org.apache.openejb.resource;
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
public class GeronimoConnectionManagerFactory$ValidatingGenericConnectionManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", null, "org/apache/geronimo/connector/outbound/GenericConnectionManager", null);

classWriter.visitInnerClass("org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "org/apache/openejb/resource/GeronimoConnectionManagerFactory", "ValidatingGenericConnectionManager", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager$ValidatingTask", "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "ValidatingTask", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/geronimo/connector/outbound/AbstractConnectionManager$Interceptors", "org/apache/geronimo/connector/outbound/AbstractConnectionManager", "Interceptors", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TIMER", "Ljava/util/Timer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "validatingTask", "Ljava/util/TimerTask;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "validationInterval", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "lock", "Ljava/util/concurrent/locks/ReadWriteLock;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "pool", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/geronimo/connector/outbound/connectionmanagerconfig/TransactionSupport;Lorg/apache/geronimo/connector/outbound/connectionmanagerconfig/PoolingSupport;Lorg/apache/geronimo/connector/outbound/SubjectSource;Lorg/apache/openejb/resource/AutoConnectionTracker;Lorg/apache/geronimo/transaction/manager/RecoverableTransactionManager;Ljavax/resource/spi/ManagedConnectionFactory;Ljava/lang/String;Ljava/lang/ClassLoader;J)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalAccessException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchFieldException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/connector/outbound/GenericConnectionManager", "<init>", "(Lorg/apache/geronimo/connector/outbound/connectionmanagerconfig/TransactionSupport;Lorg/apache/geronimo/connector/outbound/connectionmanagerconfig/PoolingSupport;Lorg/apache/geronimo/connector/outbound/SubjectSource;Lorg/apache/geronimo/connector/outbound/connectiontracking/ConnectionTracker;Lorg/apache/geronimo/transaction/manager/RecoverableTransactionManager;Ljavax/resource/spi/ManagedConnectionFactory;Ljava/lang/String;Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 9);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "validationInterval", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "interceptors", "Lorg/apache/geronimo/connector/outbound/AbstractConnectionManager$Interceptors;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/connector/outbound/AbstractConnectionManager$Interceptors", "getStack", "()Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;", true);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ASTORE, 13);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 13, new Object[] {"org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "org/apache/geronimo/connector/outbound/connectionmanagerconfig/TransactionSupport", "org/apache/geronimo/connector/outbound/connectionmanagerconfig/PoolingSupport", "org/apache/geronimo/connector/outbound/SubjectSource", "org/apache/openejb/resource/AutoConnectionTracker", "org/apache/geronimo/transaction/manager/RecoverableTransactionManager", "javax/resource/spi/ManagedConnectionFactory", "java/lang/String", "java/lang/ClassLoader", Opcodes.LONG, "org/apache/geronimo/connector/outbound/ConnectionInterceptor", "java/util/concurrent/locks/ReadWriteLock", "org/apache/geronimo/connector/outbound/ConnectionInterceptor"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor");
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;"));
methodVisitor.visitLdcInsn("resizeLock");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getDeclaredField", "(Ljava/lang/String;)Ljava/lang/reflect/Field;", false);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "isAccessible", "()Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "setAccessible", "(Z)V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/reflect/Field"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/concurrent/locks/ReadWriteLock");
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitLabel(label1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 13, new Object[] {"org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "org/apache/geronimo/connector/outbound/connectionmanagerconfig/TransactionSupport", "org/apache/geronimo/connector/outbound/connectionmanagerconfig/PoolingSupport", "org/apache/geronimo/connector/outbound/SubjectSource", "org/apache/openejb/resource/AutoConnectionTracker", "org/apache/geronimo/transaction/manager/RecoverableTransactionManager", "javax/resource/spi/ManagedConnectionFactory", "java/lang/String", "java/lang/ClassLoader", Opcodes.LONG, "org/apache/geronimo/connector/outbound/ConnectionInterceptor", "java/util/concurrent/locks/ReadWriteLock", "org/apache/geronimo/connector/outbound/ConnectionInterceptor"}, 1, new Object[] {"java/lang/ReflectiveOperationException"});
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitLdcInsn("next");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/reflection/Reflections", "get", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/geronimo/connector/outbound/ConnectionInterceptor");
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitLabel(label4);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "lock", "Ljava/util/concurrent/locks/ReadWriteLock;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor");
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitLdcInsn("pool");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/reflection/Reflections", "get", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 14);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/geronimo/connector/outbound/MultiPoolConnectionInterceptor");
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("validation on stack ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" not supported");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "pool", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "pool", "Ljava/lang/Object;");
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager$ValidatingTask");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "lock", "Ljava/util/concurrent/locks/ReadWriteLock;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "pool", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager$ValidatingTask", "<init>", "(Lorg/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager;Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;Ljava/util/concurrent/locks/ReadWriteLock;Ljava/lang/Object;Lorg/apache/openejb/resource/AutoConnectionTracker;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "validatingTask", "Ljava/util/TimerTask;");
Label label13 = new Label();
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "validatingTask", "Ljava/util/TimerTask;");
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 15);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doStart", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/connector/outbound/GenericConnectionManager", "doStart", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "validatingTask", "Ljava/util/TimerTask;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "TIMER", "Ljava/util/Timer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "validatingTask", "Ljava/util/TimerTask;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "validationInterval", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "validationInterval", "J");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Timer", "schedule", "(Ljava/util/TimerTask;JJ)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doStop", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "validatingTask", "Ljava/util/TimerTask;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "validatingTask", "Ljava/util/TimerTask;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/TimerTask", "cancel", "()Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/connector/outbound/GenericConnectionManager", "doStop", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "()Lorg/slf4j/Logger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "()Lorg/slf4j/Logger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "()Lorg/slf4j/Logger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/Timer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ValidatingGenericConnectionManagerTimer");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Timer", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/resource/GeronimoConnectionManagerFactory$ValidatingGenericConnectionManager", "TIMER", "Ljava/util/Timer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
