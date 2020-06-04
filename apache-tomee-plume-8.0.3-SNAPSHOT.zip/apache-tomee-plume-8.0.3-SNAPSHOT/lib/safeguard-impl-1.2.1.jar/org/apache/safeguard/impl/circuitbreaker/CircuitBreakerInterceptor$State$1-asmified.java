package asm.org.apache.safeguard.impl.circuitbreaker;
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
public class CircuitBreakerInterceptor$State$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State$1", null, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", null);

classWriter.visitOuterClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", null, null);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "State", ACC_PRIVATE | ACC_STATIC | ACC_ENUM | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State$1", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "CircuitBreakerImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "CheckIntervalData", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "Counter", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/String;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", "<init>", "(Ljava/lang/String;ILorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isStateTransition", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData;Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData;)Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "access$800", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State$1", "getCurrentFailureRatio", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData;)D", false);
methodVisitor.visitVarInsn(DSTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "access$1000", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;)Ljava/util/concurrent/atomic/AtomicLong;", false);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData", "access$900", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData;)J", false);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "set", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData", "access$1100", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData;)[Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "access$1200", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;)I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(DLOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "access$1300", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;)D", false);
methodVisitor.visitInsn(DCMPL);
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "access$1400", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "inc", "()V", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State$1", "OPEN", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.LONG, Opcodes.DOUBLE}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getCurrentFailureRatio", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData;)D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData", "access$1100", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData;)[Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(DCONST_0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData", "access$1100", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData;)[Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Stream", "of", "([Ljava/lang/Object;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State$1", "lambda$getCurrentFailureRatio$0", "(Ljava/lang/Boolean;)Z", false), Type.getType("(Ljava/lang/Boolean;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "filter", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "count", "()J", true);
methodVisitor.visitInsn(L2D);
methodVisitor.visitInsn(DCONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData", "access$1100", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData;)[Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(I2D);
methodVisitor.visitInsn(DMUL);
methodVisitor.visitInsn(DDIV);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.DOUBLE});
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getCurrentFailureRatio$0", "(Ljava/lang/Boolean;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
