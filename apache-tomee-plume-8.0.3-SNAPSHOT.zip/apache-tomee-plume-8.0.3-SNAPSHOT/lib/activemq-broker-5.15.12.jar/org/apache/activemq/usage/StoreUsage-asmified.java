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
public class StoreUsageDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/usage/StoreUsage", "Lorg/apache/activemq/usage/PercentLimitUsage<Lorg/apache/activemq/usage/StoreUsage;>;", "org/apache/activemq/usage/PercentLimitUsage", null);

classWriter.visitInnerClass("java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "java/util/concurrent/locks/ReentrantReadWriteLock", "WriteLock", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "store", "Lorg/apache/activemq/store/PersistenceAdapter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(FCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/usage/PercentLimitUsage", "<init>", "(Lorg/apache/activemq/usage/Usage;Ljava/lang/String;F)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Lorg/apache/activemq/store/PersistenceAdapter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(FCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/usage/PercentLimitUsage", "<init>", "(Lorg/apache/activemq/usage/Usage;Ljava/lang/String;F)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/usage/StoreUsage", "store", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/StoreUsage", "updateLimitBasedOnPercent", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/usage/StoreUsage;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(FCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/usage/PercentLimitUsage", "<init>", "(Lorg/apache/activemq/usage/Usage;Ljava/lang/String;F)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "store", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/usage/StoreUsage", "store", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/StoreUsage", "updateLimitBasedOnPercent", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "retrieveUsage", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "store", "Lorg/apache/activemq/store/PersistenceAdapter;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "store", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/PersistenceAdapter", "size", "()J", true);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStore", "()Lorg/apache/activemq/store/PersistenceAdapter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "store", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setStore", "(Lorg/apache/activemq/store/PersistenceAdapter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/usage/StoreUsage", "store", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "percentLimit", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/StoreUsage", "updateLimitBasedOnPercent", "()V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/StoreUsage", "onLimitChange", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPercentUsage", "()I", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "usageLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "lock", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/StoreUsage", "caclPercentUsage", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/usage/StoreUsage", "percentUsage", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/usage/PercentLimitUsage", "getPercentUsage", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "usageLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "unlock", "()V", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "usageLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "unlock", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "updateLimitBasedOnPercent", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "usageLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "lock", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "store", "Lorg/apache/activemq/store/PersistenceAdapter;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "store", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/PersistenceAdapter", "getDirectory", "()Ljava/io/File;", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/activemq/usage/StoreUsage"});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/activemq/usage/StoreUsage"}, 2, new Object[] {"org/apache/activemq/usage/StoreUsage", "java/io/File"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/StoreUsage", "percentLimitFromFile", "(Ljava/io/File;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "usageLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "unlock", "()V", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "usageLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "unlock", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copy", "()Lorg/apache/activemq/usage/StoreUsage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/usage/StoreUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/usage/StoreUsage", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "name", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/usage/StoreUsage", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "parent", "Lorg/apache/activemq/usage/Usage;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/usage/StoreUsage", "parent", "Lorg/apache/activemq/usage/Usage;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "total", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/usage/StoreUsage", "total", "J");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/StoreUsage", "percentLimit", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/usage/StoreUsage", "percentLimit", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/StoreUsage", "getLimiter", "()Lorg/apache/activemq/usage/UsageCapacity;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/StoreUsage", "getLimiter", "()Lorg/apache/activemq/usage/UsageCapacity;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/usage/UsageCapacity", "getLimit", "()J", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/usage/UsageCapacity", "setLimit", "(J)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
