package asm.org.apache.geronimo.connector.outbound;
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
public class AbstractSinglePoolConnectionInterceptor$FillTaskDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", null, "java/util/TimerTask", null);

classWriter.visitInnerClass("org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "FillTask", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "managedConnectionFactory", "Ljakarta/resource/spi/ManagedConnectionFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "subject", "Ljavax/security/auth/Subject;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "cri", "Ljakarta/resource/spi/ConnectionRequestInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;Lorg/apache/geronimo/connector/outbound/ConnectionInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "this$0", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/TimerTask", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ConnectionInfo", "getManagedConnectionInfo", "()Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "getManagedConnectionFactory", "()Ljakarta/resource/spi/ManagedConnectionFactory;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "managedConnectionFactory", "Ljakarta/resource/spi/ManagedConnectionFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ConnectionInfo", "getManagedConnectionInfo", "()Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "getSubject", "()Ljavax/security/auth/Subject;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "subject", "Ljavax/security/auth/Subject;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ConnectionInfo", "getManagedConnectionInfo", "()Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "getConnectionRequestInfo", "()Ljakarta/resource/spi/ConnectionRequestInfo;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "cri", "Ljakarta/resource/spi/ConnectionRequestInfo;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/resource/ResourceException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Throwable");
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label5, "java/lang/Throwable");
Label label8 = new Label();
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label8, label9, label5, "java/lang/Throwable");
Label label10 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label10, null);
methodVisitor.visitTryCatchBlock(label6, label7, label10, null);
methodVisitor.visitTryCatchBlock(label8, label9, label10, null);
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label5, label11, label10, null);
Label label12 = new Label();
methodVisitor.visitTryCatchBlock(label10, label12, label10, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "this$0", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "access$100", "(Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;)Ljava/util/concurrent/locks/ReadWriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/ReadWriteLock", "readLock", "()Ljava/util/concurrent/locks/Lock;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/Lock", "lock", "()V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "this$0", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "connectionCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "this$0", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "minSize", "I");
methodVisitor.visitJumpInsn(IF_ICMPGE, label9);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "managedConnectionFactory", "Ljakarta/resource/spi/ManagedConnectionFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "cri", "Ljakarta/resource/spi/ConnectionRequestInfo;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "<init>", "(Ljakarta/resource/spi/ManagedConnectionFactory;Ljakarta/resource/spi/ConnectionRequestInfo;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "subject", "Ljavax/security/auth/Subject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "setSubject", "(Ljavax/security/auth/Subject;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/connector/outbound/ConnectionInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/connector/outbound/ConnectionInfo", "<init>", "(Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "this$0", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "next", "Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/connector/outbound/ConnectionInterceptor", "getConnection", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "org/apache/geronimo/connector/outbound/ManagedConnectionInfo", "org/apache/geronimo/connector/outbound/ConnectionInfo"}, 1, new Object[] {"jakarta/resource/ResourceException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "this$0", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "access$100", "(Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;)Ljava/util/concurrent/locks/ReadWriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/ReadWriteLock", "readLock", "()Ljava/util/concurrent/locks/Lock;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/Lock", "unlock", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "this$0", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "addToPool", "(Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "this$0", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/connector/outbound/ConnectionReturnAction", "DESTROY", "Lorg/apache/geronimo/connector/outbound/ConnectionReturnAction;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "internalReturn", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;Lorg/apache/geronimo/connector/outbound/ConnectionReturnAction;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "this$0", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "access$100", "(Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;)Ljava/util/concurrent/locks/ReadWriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/ReadWriteLock", "readLock", "()Ljava/util/concurrent/locks/Lock;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/Lock", "unlock", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "this$0", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "access$100", "(Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;)Ljava/util/concurrent/locks/ReadWriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/ReadWriteLock", "readLock", "()Ljava/util/concurrent/locks/Lock;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/Lock", "unlock", "()V", true);
Label label13 = new Label();
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("FillTask encountered error in run method");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "this$0", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "access$100", "(Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;)Ljava/util/concurrent/locks/ReadWriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/ReadWriteLock", "readLock", "()Ljava/util/concurrent/locks/Lock;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/Lock", "unlock", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$FillTask", "this$0", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "access$100", "(Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;)Ljava/util/concurrent/locks/ReadWriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/ReadWriteLock", "readLock", "()Ljava/util/concurrent/locks/Lock;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/Lock", "unlock", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
