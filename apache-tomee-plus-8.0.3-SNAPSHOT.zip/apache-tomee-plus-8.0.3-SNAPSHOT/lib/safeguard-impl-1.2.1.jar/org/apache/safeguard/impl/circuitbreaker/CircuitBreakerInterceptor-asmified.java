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
public class CircuitBreakerInterceptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", null, "java/lang/Object", new String[] { "java/io/Serializable" });

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/eclipse/microprofile/faulttolerance/CircuitBreaker;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/interceptor/Interceptor;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/annotation/Priority;", true);
annotationVisitor0.visit("value", new Integer(4012));
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "CheckIntervalData", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "CircuitBreakerImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckResult", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "CheckResult", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "Cache", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "State", ACC_PRIVATE | ACC_STATIC | ACC_ENUM | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckType", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "CheckType", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "Counter", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cache", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/inject/Inject;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ifNotOpen", "(Ljavax/interceptor/InvocationContext;)Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/interceptor/AroundInvoke;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "cache", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache", "getCircuitBreakers", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/safeguard/impl/cache/Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "cache", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache", "getUnwrappedCache", "()Lorg/apache/safeguard/impl/cache/UnwrappedCache;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/safeguard/impl/cache/UnwrappedCache", "getUnwrappedCache", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cache/Key", "<init>", "(Ljavax/interceptor/InvocationContext;Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "cache", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache", "create", "(Ljavax/interceptor/InvocationContext;)Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "putIfAbsent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "javax/interceptor/InvocationContext", "java/util/Map", "org/apache/safeguard/impl/cache/Key", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "cache", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache", "postCreate", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;Ljavax/interceptor/InvocationContext;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "access$000", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/interceptor/InvocationContext", "proceed", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckType", "READ_ONLY", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckType;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "access$100", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckType;)Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckResult;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckResult", "OPEN", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckResult;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "access$200", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "inc", "()V", true);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/faulttolerance/exceptions/CircuitBreakerOpenException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/interceptor/InvocationContext", "getMethod", "()Ljava/lang/reflect/Method;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" circuit breaker is open");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/faulttolerance/exceptions/CircuitBreakerOpenException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckResult"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/interceptor/InvocationContext", "proceed", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckResult", "CLOSED_CHANGED", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckResult;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "access$300", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "access$400", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "inc", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "javax/interceptor/InvocationContext", "java/util/Map", "org/apache/safeguard/impl/cache/Key", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckResult"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "access$500", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;)[Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFLE, label7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "access$500", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;)[Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Stream", "of", "([Ljava/lang/Object;)Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInvokeDynamicInsn("test", "(Ljava/lang/Exception;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "lambda$ifNotOpen$0", "(Ljava/lang/Exception;Ljava/lang/Class;)Z", false), Type.getType("(Ljava/lang/Class;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "anyMatch", "(Ljava/util/function/Predicate;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "access$600", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;)V", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Exception"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "access$400", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "inc", "()V", true);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "now", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "nanoTime", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$ifNotOpen$0", "(Ljava/lang/Exception;Ljava/lang/Class;)Z", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$800", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "now", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
