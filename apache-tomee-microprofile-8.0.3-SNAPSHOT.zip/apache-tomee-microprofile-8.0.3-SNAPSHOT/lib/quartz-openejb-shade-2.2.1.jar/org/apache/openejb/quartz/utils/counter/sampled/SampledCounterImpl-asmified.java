package asm.org.apache.openejb.quartz.utils.counter.sampled;
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
public class SampledCounterImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", null, "org/apache/openejb/quartz/utils/counter/CounterImpl", new String[] { "org/apache/openejb/quartz/utils/counter/sampled/SampledCounter" });

classWriter.visitInnerClass("org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-3605369302464131521L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MILLIS_PER_SEC", "I", null, new Integer(1000));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "history", "Lorg/apache/openejb/quartz/utils/CircularLossyQueue;", "Lorg/apache/openejb/quartz/utils/CircularLossyQueue<Lorg/apache/openejb/quartz/utils/counter/sampled/TimeStampedCounterValue;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "resetOnSample", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "samplerTask", "Ljava/util/TimerTask;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "intervalMillis", "J", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounterConfig;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterConfig", "getInitialValue", "()J", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/utils/counter/CounterImpl", "<init>", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterConfig", "getIntervalSecs", "()I", false);
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitInsn(I2L);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "intervalMillis", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/utils/CircularLossyQueue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterConfig", "getHistorySize", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/utils/CircularLossyQueue", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "history", "Lorg/apache/openejb/quartz/utils/CircularLossyQueue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterConfig", "isResetOnSample", "()Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "resetOnSample", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl$1", "<init>", "(Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "samplerTask", "Ljava/util/TimerTask;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "recordSample", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMostRecentSample", "()Lorg/apache/openejb/quartz/utils/counter/sampled/TimeStampedCounterValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "history", "Lorg/apache/openejb/quartz/utils/CircularLossyQueue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/CircularLossyQueue", "peek", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/quartz/utils/counter/sampled/TimeStampedCounterValue");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAllSampleValues", "()[Lorg/apache/openejb/quartz/utils/counter/sampled/TimeStampedCounterValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "history", "Lorg/apache/openejb/quartz/utils/CircularLossyQueue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "history", "Lorg/apache/openejb/quartz/utils/CircularLossyQueue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/CircularLossyQueue", "depth", "()I", false);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/quartz/utils/counter/sampled/TimeStampedCounterValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/CircularLossyQueue", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/quartz/utils/counter/sampled/TimeStampedCounterValue;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "shutdown", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "samplerTask", "Ljava/util/TimerTask;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "samplerTask", "Ljava/util/TimerTask;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/TimerTask", "cancel", "()Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTimerTask", "()Ljava/util/TimerTask;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "samplerTask", "Ljava/util/TimerTask;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIntervalMillis", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "intervalMillis", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "recordSample", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "resetOnSample", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "getAndReset", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "getValue", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/utils/counter/sampled/TimeStampedCounterValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/utils/counter/sampled/TimeStampedCounterValue", "<init>", "(JJ)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "history", "Lorg/apache/openejb/quartz/utils/CircularLossyQueue;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/CircularLossyQueue", "push", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAndReset", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterImpl", "getAndSet", "(J)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
