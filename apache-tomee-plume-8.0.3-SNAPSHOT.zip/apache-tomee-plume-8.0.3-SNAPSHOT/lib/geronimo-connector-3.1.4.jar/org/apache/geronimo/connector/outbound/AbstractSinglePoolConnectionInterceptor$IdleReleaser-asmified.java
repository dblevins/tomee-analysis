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
public class AbstractSinglePoolConnectionInterceptor$IdleReleaserDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$IdleReleaser", null, "java/util/TimerTask", null);

classWriter.visitInnerClass("org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$IdleReleaser", "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "IdleReleaser", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parent", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/TimerTask", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$IdleReleaser", "parent", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cancel", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$IdleReleaser", "parent", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/TimerTask", "cancel", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, null);
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label2, label4, label3, null);
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label5, label3, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$IdleReleaser", "parent", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "access$100", "(Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;)Ljava/util/concurrent/locks/ReadWriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/ReadWriteLock", "readLock", "()Ljava/util/concurrent/locks/Lock;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/Lock", "lock", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "idleTimeoutMilliseconds", "J");
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "getPartitionMaxSize", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "getExpiredManagedConnectionInfos", "(JLjava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.LONG, "java/util/List", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/geronimo/connector/outbound/ManagedConnectionInfo");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/connector/outbound/ConnectionInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/connector/outbound/ConnectionInfo", "<init>", "(Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$IdleReleaser", "parent", "Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "next", "Lorg/apache/geronimo/connector/outbound/ConnectionInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/connector/outbound/ConnectionReturnAction", "DESTROY", "Lorg/apache/geronimo/connector/outbound/ConnectionReturnAction;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/connector/outbound/ConnectionInterceptor", "returnConnection", "(Lorg/apache/geronimo/connector/outbound/ConnectionInfo;Lorg/apache/geronimo/connector/outbound/ConnectionReturnAction;)V", true);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "access$100", "(Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;)Ljava/util/concurrent/locks/ReadWriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/ReadWriteLock", "readLock", "()Ljava/util/concurrent/locks/Lock;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/Lock", "unlock", "()V", true);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error occurred during execution of ExpirationMonitor TimerTask");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "access$100", "(Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;)Ljava/util/concurrent/locks/ReadWriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/ReadWriteLock", "readLock", "()Ljava/util/concurrent/locks/Lock;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/Lock", "unlock", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor", "access$100", "(Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;)Ljava/util/concurrent/locks/ReadWriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/ReadWriteLock", "readLock", "()Ljava/util/concurrent/locks/Lock;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/Lock", "unlock", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor$IdleReleaser", "<init>", "(Lorg/apache/geronimo/connector/outbound/AbstractSinglePoolConnectionInterceptor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
