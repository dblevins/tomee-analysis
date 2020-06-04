package asm.org.apache.safeguard.impl.retry;
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
public class BaseRetryInterceptor$ModelDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "Counter", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "org/apache/safeguard/impl/retry/BaseRetryInterceptor", "Model", ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/retry/BaseRetryInterceptor$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "abortOn", "[Ljava/lang/Class;", "[Ljava/lang/Class<+Ljava/lang/Throwable;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "retryOn", "[Ljava/lang/Class;", "[Ljava/lang/Class<+Ljava/lang/Throwable;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "maxDuration", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "maxRetries", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delay", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "jitter", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "callsSucceededNotRetried", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "callsSucceededRetried", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "callsFailed", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "retries", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "disabled", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(ZLorg/eclipse/microprofile/faulttolerance/Retry;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "disabled", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/faulttolerance/Retry", "abortOn", "()[Ljava/lang/Class;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "abortOn", "[Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/faulttolerance/Retry", "retryOn", "()[Ljava/lang/Class;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "retryOn", "[Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/faulttolerance/Retry", "delayUnit", "()Ljava/time/temporal/ChronoUnit;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/time/temporal/ChronoUnit", "getDuration", "()Ljava/time/Duration;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/time/Duration", "toNanos", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/faulttolerance/Retry", "maxDuration", "()J", true);
methodVisitor.visitInsn(LMUL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "maxDuration", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/faulttolerance/Retry", "maxRetries", "()I", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "maxRetries", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/faulttolerance/Retry", "delayUnit", "()Ljava/time/temporal/ChronoUnit;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/time/temporal/ChronoUnit", "getDuration", "()Ljava/time/Duration;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/time/Duration", "toNanos", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/faulttolerance/Retry", "delay", "()J", true);
methodVisitor.visitInsn(LMUL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "delay", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/faulttolerance/Retry", "jitterDelayUnit", "()Ljava/time/temporal/ChronoUnit;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/time/temporal/ChronoUnit", "getDuration", "()Ljava/time/Duration;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/time/Duration", "toNanos", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/faulttolerance/Retry", "jitter", "()J", true);
methodVisitor.visitInsn(LMUL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "jitter", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "callsSucceededNotRetried", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "callsSucceededRetried", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "callsFailed", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "retries", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "maxRetries", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/faulttolerance/exceptions/FaultToleranceDefinitionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("max retries can't be negative");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/faulttolerance/exceptions/FaultToleranceDefinitionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", Opcodes.INTEGER, "org/eclipse/microprofile/faulttolerance/Retry", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "delay", "J");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFGE, label1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/faulttolerance/exceptions/FaultToleranceDefinitionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("delay can't be negative");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/faulttolerance/exceptions/FaultToleranceDefinitionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "maxDuration", "J");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFGE, label2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/faulttolerance/exceptions/FaultToleranceDefinitionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("max duration can't be negative");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/faulttolerance/exceptions/FaultToleranceDefinitionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "jitter", "J");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFGE, label3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/faulttolerance/exceptions/FaultToleranceDefinitionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("jitter can't be negative");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/faulttolerance/exceptions/FaultToleranceDefinitionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "delay", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "maxDuration", "J");
methodVisitor.visitInsn(LCMP);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFLE, label4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/faulttolerance/exceptions/FaultToleranceDefinitionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("delay can't be < max duration");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/faulttolerance/exceptions/FaultToleranceDefinitionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "abortOn", "(Ljava/lang/Exception;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "abortOn", "[Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "matches", "([Ljava/lang/Class;Ljava/lang/Exception;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "retryOn", "(Ljava/lang/Exception;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "retryOn", "[Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "matches", "([Ljava/lang/Class;Ljava/lang/Exception;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "matches", "([Ljava/lang/Class;Ljava/lang/Exception;)Z", "([Ljava/lang/Class<+Ljava/lang/Throwable;>;Ljava/lang/Exception;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Stream", "of", "([Ljava/lang/Object;)Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("test", "(Ljava/lang/Exception;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "lambda$matches$0", "(Ljava/lang/Exception;Ljava/lang/Class;)Z", false), Type.getType("(Ljava/lang/Class;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "anyMatch", "(Ljava/util/function/Predicate;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "nextPause", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/concurrent/ThreadLocalRandom", "current", "()Ljava/util/concurrent/ThreadLocalRandom;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "NANOSECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "maxDuration", "J");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadLocalRandom", "nextBoolean", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "java/util/concurrent/ThreadLocalRandom"}, 3, new Object[] {"java/util/concurrent/TimeUnit", Opcodes.LONG, Opcodes.LONG});
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "java/util/concurrent/ThreadLocalRandom"}, 4, new Object[] {"java/util/concurrent/TimeUnit", Opcodes.LONG, Opcodes.LONG, Opcodes.INTEGER});
methodVisitor.visitInsn(I2L);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "delay", "J");
methodVisitor.visitInsn(LMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "jitter", "J");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitInsn(LCONST_0);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "java/util/concurrent/ThreadLocalRandom"}, 4, new Object[] {"java/util/concurrent/TimeUnit", Opcodes.LONG, Opcodes.LONG, Opcodes.LONG});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "jitter", "J");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadLocalRandom", "nextLong", "(J)J", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "java/util/concurrent/ThreadLocalRandom"}, 5, new Object[] {"java/util/concurrent/TimeUnit", Opcodes.LONG, Opcodes.LONG, Opcodes.LONG, Opcodes.LONG});
methodVisitor.visitInsn(LADD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "max", "(JJ)J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(JJ)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/TimeUnit", "toMillis", "(J)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(11, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$matches$0", "(Ljava/lang/Exception;Ljava/lang/Class;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$Model;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "disabled", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$Model;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "maxDuration", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$Model;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "maxRetries", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$Model;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "callsSucceededNotRetried", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$Model;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "callsSucceededRetried", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$Model;Ljava/lang/Exception;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "abortOn", "(Ljava/lang/Exception;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$900", "(Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$Model;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "callsFailed", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1000", "(Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$Model;Ljava/lang/Exception;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "retryOn", "(Ljava/lang/Exception;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1100", "(Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$Model;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "retries", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1200", "(Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$Model;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "nextPause", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(ZLorg/eclipse/microprofile/faulttolerance/Retry;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "<init>", "(ZLorg/eclipse/microprofile/faulttolerance/Retry;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
