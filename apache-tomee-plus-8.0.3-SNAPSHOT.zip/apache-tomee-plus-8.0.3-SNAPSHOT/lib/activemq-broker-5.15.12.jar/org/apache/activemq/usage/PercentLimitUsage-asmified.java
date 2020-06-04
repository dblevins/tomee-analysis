package asm.org.apache.activemq.usage;
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
public class PercentLimitUsageDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/activemq/usage/PercentLimitUsage", "<T:Lorg/apache/activemq/usage/Usage;>Lorg/apache/activemq/usage/Usage<TT;>;", "org/apache/activemq/usage/Usage", null);

classWriter.visitInnerClass("java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "java/util/concurrent/locks/ReentrantReadWriteLock", "WriteLock", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock", "java/util/concurrent/locks/ReentrantReadWriteLock", "ReadLock", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "percentLimit", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "total", "J", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/usage/Usage;Ljava/lang/String;F)V", "(TT;Ljava/lang/String;F)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(FLOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/usage/Usage", "<init>", "(Lorg/apache/activemq/usage/Usage;Ljava/lang/String;F)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/usage/PercentLimitUsage", "percentLimit", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/usage/PercentLimitUsage", "total", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPercentLimit", "(I)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/PercentLimitUsage", "usageLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "lock", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/usage/PercentLimitUsage", "percentLimit", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/PercentLimitUsage", "updateLimitBasedOnPercent", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/PercentLimitUsage", "usageLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "unlock", "()V", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/PercentLimitUsage", "usageLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "unlock", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPercentLimit", "()I", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/PercentLimitUsage", "usageLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "readLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock", "lock", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/PercentLimitUsage", "percentLimit", "I");
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/PercentLimitUsage", "usageLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "readLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock", "unlock", "()V", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/PercentLimitUsage", "usageLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "readLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock", "unlock", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTotal", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/usage/PercentLimitUsage", "total", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTotal", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/PercentLimitUsage", "total", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "percentLimitFromFile", "(Ljava/io/File;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/PercentLimitUsage", "percentLimit", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/PercentLimitUsage", "total", "J");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/PercentLimitUsage", "total", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/PercentLimitUsage", "percentLimit", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LMUL);
methodVisitor.visitLdcInsn(new Long(100L));
methodVisitor.visitInsn(LDIV);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/PercentLimitUsage", "setLimit", "(J)V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/StoreUtil", "findParentDirectory", "(Ljava/io/File;)Ljava/io/File;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "getTotalSpace", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/PercentLimitUsage", "percentLimit", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LMUL);
methodVisitor.visitLdcInsn(new Long(100L));
methodVisitor.visitInsn(LDIV);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/PercentLimitUsage", "setLimit", "(J)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "updateLimitBasedOnPercent", "()V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
