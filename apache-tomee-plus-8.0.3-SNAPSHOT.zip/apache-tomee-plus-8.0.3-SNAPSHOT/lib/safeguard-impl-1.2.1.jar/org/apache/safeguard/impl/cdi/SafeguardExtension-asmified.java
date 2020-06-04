package asm.org.apache.safeguard.impl.cdi;
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
public class SafeguardExtensionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/safeguard/impl/cdi/SafeguardExtension", null, "java/lang/Object", new String[] { "javax/enterprise/inject/spi/Extension" });

classWriter.visitInnerClass("org/apache/safeguard/impl/cdi/SafeguardExtension$MockInvocationContext", "org/apache/safeguard/impl/cdi/SafeguardExtension", "MockInvocationContext", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/cdi/SafeguardExtension$1", null, null, 0);

classWriter.visitInnerClass("org/apache/safeguard/impl/timeout/TimeoutInterceptor$Cache", "org/apache/safeguard/impl/timeout/TimeoutInterceptor", "Cache", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor", "Cache", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "Cache", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/fallback/FallbackInterceptor$Cache", "org/apache/safeguard/impl/fallback/FallbackInterceptor", "Cache", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/retry/BaseRetryInterceptor$Cache", "org/apache/safeguard/impl/retry/BaseRetryInterceptor", "Cache", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("javax/interceptor/Interceptor$Priority", "javax/interceptor/Interceptor", "Priority", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/cdi/SafeguardEnabled$Literal", "org/apache/safeguard/impl/cdi/SafeguardEnabled", "Literal", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("javax/enterprise/inject/Default$Literal", "javax/enterprise/inject/Default", "Literal", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("javax/enterprise/inject/Any$Literal", "javax/enterprise/inject/Any", "Literal", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/customizable/Safeguard$Literal", "org/apache/safeguard/impl/customizable/Safeguard", "Literal", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/retry/BaseRetryInterceptor$Model", "org/apache/safeguard/impl/retry/BaseRetryInterceptor", "Model", ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "CircuitBreakerImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model", "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor", "Model", ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/timeout/TimeoutInterceptor$Model", "org/apache/safeguard/impl/timeout/TimeoutInterceptor", "Model", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "foundExecutor", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "config", "Lorg/apache/safeguard/impl/config/GeronimoFaultToleranceConfig;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "priorityBase", "Ljava/lang/Integer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "beansToValidate", "Ljava/util/Collection;", "Ljava/util/Collection<Ljavax/enterprise/inject/spi/Annotated;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "timeoutCache", "Lorg/apache/safeguard/impl/timeout/TimeoutInterceptor$Cache;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "bulkHeadCache", "Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "circuitBreakerCache", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "fallbackCache", "Lorg/apache/safeguard/impl/fallback/FallbackInterceptor$Cache;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "retryCache", "Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$Cache;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "beansToValidate", "Ljava/util/Collection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "grabInterceptorPriority", "(Ljavax/enterprise/inject/spi/BeforeBeanDiscovery;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/config/GeronimoFaultToleranceConfig", "create", "()Lorg/apache/safeguard/impl/config/GeronimoFaultToleranceConfig;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "config", "Lorg/apache/safeguard/impl/config/GeronimoFaultToleranceConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "config", "Lorg/apache/safeguard/impl/config/GeronimoFaultToleranceConfig;");
methodVisitor.visitLdcInsn("mp.fault.tolerance.interceptor.priority");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/safeguard/impl/config/GeronimoFaultToleranceConfig", "read", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Optional", "ofNullable", "(Ljava/lang/Object;)Ljava/util/Optional;", false);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "java/lang/Integer", "parseInt", "(Ljava/lang/String;)I", false), Type.getType("(Ljava/lang/String;)Ljava/lang/Integer;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "map", "(Ljava/util/function/Function;)Ljava/util/Optional;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "orElse", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "priorityBase", "Ljava/lang/Integer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "customizeAsyncPriority", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType<Lorg/apache/safeguard/impl/asynchronous/AsynchronousInterceptor;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "customizePriority", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "customizeBulkHeadPriority", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType<Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "customizePriority", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "customizeCircuitbreakerPriority", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType<Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "customizePriority", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "customizeFallbackPriority", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType<Lorg/apache/safeguard/impl/fallback/FallbackInterceptor;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "customizePriority", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "customizeBeforeRetryPriority", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType<Lorg/apache/safeguard/impl/retry/BeforeRetryInterceptor;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "customizePriority", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "customizeAfterRetryPriority", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType<Lorg/apache/safeguard/impl/retry/AfterRetryInterceptor;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "customizePriority", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "customizeTimeoutPriority", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType<Lorg/apache/safeguard/impl/timeout/TimeoutInterceptor;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "customizePriority", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "addFallbackInterceptor", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType<Lorg/apache/safeguard/impl/fallback/FallbackInterceptor;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessAnnotatedType", "configureAnnotatedType", "()Ljavax/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/safeguard/impl/cdi/FallbackBinding");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/FallbackBinding", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator", "add", "(Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "activateSafeguard", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType<*>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/inject/spi/WithAnnotations;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/microprofile/faulttolerance/Bulkhead;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/microprofile/faulttolerance/CircuitBreaker;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/microprofile/faulttolerance/Fallback;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/microprofile/faulttolerance/Retry;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/microprofile/faulttolerance/Timeout;"));
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessAnnotatedType", "getAnnotatedType", "()Ljavax/enterprise/inject/spi/AnnotatedType;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getJavaClass", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("org.apache.safeguard.impl.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "faultToleranceAnnotations", "()Ljava/util/stream/Stream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("test", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$activateSafeguard$0", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;Ljava/lang/Class;)Z", false), Type.getType("(Ljava/lang/Class;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "anyMatch", "(Ljava/util/function/Predicate;)Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessAnnotatedType", "configureAnnotatedType", "()Ljavax/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/safeguard/impl/cdi/SafeguardEnabled$Literal", "INSTANCE", "Lorg/apache/safeguard/impl/cdi/SafeguardEnabled$Literal;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator", "add", "(Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", true);
methodVisitor.visitInsn(POP);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessAnnotatedType", "getAnnotatedType", "()Ljavax/enterprise/inject/spi/AnnotatedType;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getMethods", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("test", "(Lorg/apache/safeguard/impl/cdi/SafeguardExtension;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$activateSafeguard$1", "(Ljavax/enterprise/inject/spi/AnnotatedMethod;)Z", false), Type.getType("(Ljavax/enterprise/inject/spi/AnnotatedMethod;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "filter", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedMethod", "getJavaMember", "()Ljava/lang/reflect/Method;", true), Type.getType("(Ljavax/enterprise/inject/spi/AnnotatedMethod;)Ljava/lang/reflect/Method;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collectors", "toList", "()Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessAnnotatedType", "configureAnnotatedType", "()Ljavax/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("test", "(Ljava/util/List;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$activateSafeguard$2", "(Ljava/util/List;Ljavax/enterprise/inject/spi/AnnotatedMethod;)Z", false), Type.getType("(Ljavax/enterprise/inject/spi/AnnotatedMethod;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator", "filterMethods", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("accept", "()Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$activateSafeguard$3", "(Ljavax/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator;)V", false), Type.getType("(Ljavax/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "forEach", "(Ljava/util/function/Consumer;)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "onBean", "(Ljavax/enterprise/inject/spi/ProcessBean;)V", "(Ljavax/enterprise/inject/spi/ProcessBean<*>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "isSafeguardBean", "(Ljavax/enterprise/inject/spi/ProcessBean;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessBean", "getBean", "()Ljavax/enterprise/inject/spi/Bean;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Bean", "getTypes", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("test", "(Lorg/apache/safeguard/impl/cdi/SafeguardExtension;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$onBean$4", "(Ljava/lang/reflect/Type;)Z", false), Type.getType("(Ljava/lang/reflect/Type;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "anyMatch", "(Ljava/util/function/Predicate;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "foundExecutor", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/inject/spi/AnnotatedType;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessBean", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/inject/spi/AnnotatedType;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessBean", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedType");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getMethods", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$onBean$5", "(Ljavax/enterprise/inject/spi/AnnotatedMethod;)Z", false), Type.getType("(Ljavax/enterprise/inject/spi/AnnotatedMethod;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "anyMatch", "(Ljava/util/function/Predicate;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "beansToValidate", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessBean", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "addMissingBeans", "(Ljavax/enterprise/inject/spi/AfterBeanDiscovery;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/config/GeronimoFaultToleranceConfig", "create", "()Lorg/apache/safeguard/impl/config/GeronimoFaultToleranceConfig;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AfterBeanDiscovery", "addBean", "()Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitLdcInsn("geronimo_safeguard#configuration");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "id", "(Ljava/lang/String;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/reflect/Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/safeguard/impl/config/GeronimoFaultToleranceConfig;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "types", "([Ljava/lang/reflect/Type;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/safeguard/impl/config/GeronimoFaultToleranceConfig;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "beanClass", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/enterprise/inject/Default$Literal", "INSTANCE", "Ljavax/enterprise/inject/Default$Literal;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/enterprise/inject/Any$Literal", "INSTANCE", "Ljavax/enterprise/inject/Any$Literal;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "qualifiers", "([Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/context/ApplicationScoped;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "scope", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/safeguard/impl/config/GeronimoFaultToleranceConfig;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$addMissingBeans$6", "(Lorg/apache/safeguard/impl/config/GeronimoFaultToleranceConfig;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", false), Type.getType("(Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "createWith", "(Ljava/util/function/Function;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AfterBeanDiscovery", "addBean", "()Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitLdcInsn("geronimo_safeguard#metrics");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "id", "(Ljava/lang/String;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/reflect/Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "types", "([Ljava/lang/reflect/Type;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "beanClass", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/enterprise/inject/Default$Literal", "INSTANCE", "Ljavax/enterprise/inject/Default$Literal;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/enterprise/inject/Any$Literal", "INSTANCE", "Ljavax/enterprise/inject/Any$Literal;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "qualifiers", "([Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/context/ApplicationScoped;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "scope", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/safeguard/impl/config/GeronimoFaultToleranceConfig;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$addMissingBeans$7", "(Lorg/apache/safeguard/impl/config/GeronimoFaultToleranceConfig;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", false), Type.getType("(Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "createWith", "(Ljava/util/function/Function;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "foundExecutor", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AfterBeanDiscovery", "addBean", "()Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitLdcInsn("geronimo_safeguard#executor");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "id", "(Ljava/lang/String;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/reflect/Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/concurrent/Executor;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "types", "([Ljava/lang/reflect/Type;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/concurrent/Executor;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "beanClass", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/safeguard/impl/customizable/Safeguard$Literal", "INSTANCE", "Lorg/apache/safeguard/impl/customizable/Safeguard$Literal;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/enterprise/inject/Any$Literal", "INSTANCE", "Ljavax/enterprise/inject/Any$Literal;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "qualifiers", "([Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/safeguard/impl/cdi/SafeguardExtension;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$addMissingBeans$8", "(Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", false), Type.getType("(Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "createWith", "(Ljava/util/function/Function;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/context/ApplicationScoped;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "scope", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitInvokeDynamicInsn("accept", "()Ljava/util/function/BiConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$addMissingBeans$9", "(Ljava/lang/Object;Ljavax/enterprise/context/spi/CreationalContext;)V", false), Type.getType("(Ljava/lang/Object;Ljavax/enterprise/context/spi/CreationalContext;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "destroyWith", "(Ljava/util/function/BiConsumer;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/safeguard/impl/config/GeronimoFaultToleranceConfig"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "addDefinitionErrors", "(Ljavax/enterprise/inject/spi/AfterDeploymentValidation;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "beansToValidate", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/safeguard/impl/cdi/SafeguardExtension;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "validate", "(Ljavax/enterprise/inject/spi/Annotated;)Ljava/lang/Throwable;", false), Type.getType("(Ljavax/enterprise/inject/spi/Annotated;)Ljava/lang/Throwable;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "java/util/Objects", "nonNull", "(Ljava/lang/Object;)Z", false), Type.getType("(Ljava/lang/Throwable;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "filter", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInvokeDynamicInsn("accept", "(Ljavax/enterprise/inject/spi/AfterDeploymentValidation;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKEINTERFACE, "javax/enterprise/inject/spi/AfterDeploymentValidation", "addDeploymentProblem", "(Ljava/lang/Throwable;)V", true), Type.getType("(Ljava/lang/Throwable;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "forEach", "(Ljava/util/function/Consumer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "beansToValidate", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "clear", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/enterprise/inject/spi/CDI", "current", "()Ljavax/enterprise/inject/spi/CDI;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/enterprise/inject/spi/CDI", "select", "(Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/Instance;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/Instance", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "validate", "(Ljavax/enterprise/inject/spi/Annotated;)Ljava/lang/Throwable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/faulttolerance/Timeout;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/safeguard/impl/cdi/SafeguardExtension;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$validate$10", "(Ljavax/interceptor/InvocationContext;)V", false), Type.getType("(Ljavax/interceptor/InvocationContext;)V")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "validate", "(Ljava/lang/Class;Ljavax/enterprise/inject/spi/Annotated;Ljava/util/function/Consumer;)Ljava/lang/Throwable;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/faulttolerance/Bulkhead;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/safeguard/impl/cdi/SafeguardExtension;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$validate$11", "(Ljavax/interceptor/InvocationContext;)V", false), Type.getType("(Ljavax/interceptor/InvocationContext;)V")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "validate", "(Ljava/lang/Class;Ljavax/enterprise/inject/spi/Annotated;Ljava/util/function/Consumer;)Ljava/lang/Throwable;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/faulttolerance/CircuitBreaker;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/safeguard/impl/cdi/SafeguardExtension;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$validate$12", "(Ljavax/interceptor/InvocationContext;)V", false), Type.getType("(Ljavax/interceptor/InvocationContext;)V")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "validate", "(Ljava/lang/Class;Ljavax/enterprise/inject/spi/Annotated;Ljava/util/function/Consumer;)Ljava/lang/Throwable;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/faulttolerance/Fallback;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/safeguard/impl/cdi/SafeguardExtension;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$validate$13", "(Ljavax/interceptor/InvocationContext;)V", false), Type.getType("(Ljavax/interceptor/InvocationContext;)V")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "validate", "(Ljava/lang/Class;Ljavax/enterprise/inject/spi/Annotated;Ljava/util/function/Consumer;)Ljava/lang/Throwable;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/faulttolerance/Retry;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/safeguard/impl/cdi/SafeguardExtension;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$validate$14", "(Ljavax/interceptor/InvocationContext;)V", false), Type.getType("(Ljavax/interceptor/InvocationContext;)V")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "validate", "(Ljava/lang/Class;Ljavax/enterprise/inject/spi/Annotated;Ljava/util/function/Consumer;)Ljava/lang/Throwable;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "validate", "(Ljava/lang/Class;Ljavax/enterprise/inject/spi/Annotated;Ljava/util/function/Consumer;)Ljava/lang/Throwable;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;Ljavax/enterprise/inject/spi/Annotated;Ljava/util/function/Consumer<Ljavax/interceptor/InvocationContext;>;)Ljava/lang/Throwable;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/RuntimeException");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Annotated", "isAnnotationPresent", "(Ljava/lang/Class;)Z", true);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/inject/spi/AnnotatedType;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedType");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getMethods", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("test", "(ZLjava/lang/Class;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$validate$15", "(ZLjava/lang/Class;Ljavax/enterprise/inject/spi/AnnotatedMethod;)Z", false), Type.getType("(Ljavax/enterprise/inject/spi/AnnotatedMethod;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "filter", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$validate$16", "(Ljavax/enterprise/inject/spi/AnnotatedMethod;)Lorg/apache/safeguard/impl/cdi/SafeguardExtension$MockInvocationContext;", false), Type.getType("(Ljavax/enterprise/inject/spi/AnnotatedMethod;)Lorg/apache/safeguard/impl/cdi/SafeguardExtension$MockInvocationContext;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "forEach", "(Ljava/util/function/Consumer;)V", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/safeguard/impl/cdi/SafeguardExtension", "java/lang/Class", "javax/enterprise/inject/spi/Annotated", "java/util/function/Consumer", Opcodes.INTEGER, "javax/enterprise/inject/spi/AnnotatedType"}, 1, new Object[] {"java/lang/RuntimeException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "javax/enterprise/inject/spi/DefinitionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/enterprise/inject/spi/DefinitionException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "isSafeguardBean", "(Ljavax/enterprise/inject/spi/ProcessBean;)Z", "(Ljavax/enterprise/inject/spi/ProcessBean<*>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessBean", "getBean", "()Ljavax/enterprise/inject/spi/Bean;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Bean", "getQualifiers", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$isSafeguardBean$17", "(Ljava/lang/annotation/Annotation;)Z", false), Type.getType("(Ljava/lang/annotation/Annotation;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "anyMatch", "(Ljava/util/function/Predicate;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "customizePriority", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;)V", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "priorityBase", "Ljava/lang/Integer;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessAnnotatedType", "getAnnotatedType", "()Ljavax/enterprise/inject/spi/AnnotatedType;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/annotation/Priority;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/annotation/Priority");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/annotation/Priority", "value", "()I", true);
methodVisitor.visitIntInsn(SIPUSH, 4000);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessAnnotatedType", "configureAnnotatedType", "()Ljavax/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", true);
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/cdi/SafeguardExtension", "lambda$customizePriority$18", "(Ljava/lang/annotation/Annotation;)Z", false), Type.getType("(Ljava/lang/annotation/Annotation;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator", "remove", "(Ljava/util/function/Predicate;)Ljavax/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/safeguard/impl/cdi/PriorityBinding");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "priorityBase", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/PriorityBinding", "<init>", "(I)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator", "add", "(Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toClass", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "(Ljava/lang/reflect/Type;)Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "doToClass", "(Ljava/lang/reflect/Type;I)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "doToClass", "(Ljava/lang/reflect/Type;I)Ljava/lang/Class;", "(Ljava/lang/reflect/Type;I)Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Class;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Class;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 100);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/reflect/ParameterizedType;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/reflect/ParameterizedType;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/ParameterizedType");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/reflect/ParameterizedType", "getRawType", "()Ljava/lang/reflect/Type;", true);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "doToClass", "(Ljava/lang/reflect/Type;I)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "faultToleranceAnnotations", "()Ljava/util/stream/Stream;", "()Ljava/util/stream/Stream<Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/faulttolerance/Asynchronous;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/faulttolerance/Bulkhead;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/faulttolerance/CircuitBreaker;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/faulttolerance/Fallback;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/faulttolerance/Retry;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/faulttolerance/Timeout;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Stream", "of", "([Ljava/lang/Object;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$customizePriority$18", "(Ljava/lang/annotation/Annotation;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/annotation/Annotation", "annotationType", "()Ljava/lang/Class;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/annotation/Priority;"));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$isSafeguardBean$17", "(Ljava/lang/annotation/Annotation;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/annotation/Annotation", "annotationType", "()Ljava/lang/Class;", true);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/safeguard/impl/customizable/Safeguard;"));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$validate$16", "(Ljavax/enterprise/inject/spi/AnnotatedMethod;)Lorg/apache/safeguard/impl/cdi/SafeguardExtension$MockInvocationContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/safeguard/impl/cdi/SafeguardExtension$MockInvocationContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedMethod", "getJavaMember", "()Ljava/lang/reflect/Method;", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension$MockInvocationContext", "<init>", "(Ljava/lang/reflect/Method;Lorg/apache/safeguard/impl/cdi/SafeguardExtension$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$validate$15", "(ZLjava/lang/Class;Ljavax/enterprise/inject/spi/AnnotatedMethod;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedMethod", "isAnnotationPresent", "(Ljava/lang/Class;)Z", true);
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
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$validate$14", "(Ljavax/interceptor/InvocationContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "retryCache", "Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$Cache;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$Cache;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "getInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Cache");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "retryCache", "Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$Cache;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "retryCache", "Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$Cache;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/safeguard/impl/retry/BaseRetryInterceptor$Cache", "create", "(Ljavax/interceptor/InvocationContext;)Lorg/apache/safeguard/impl/retry/BaseRetryInterceptor$Model;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$validate$13", "(Ljavax/interceptor/InvocationContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "fallbackCache", "Lorg/apache/safeguard/impl/fallback/FallbackInterceptor$Cache;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/safeguard/impl/fallback/FallbackInterceptor$Cache;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "getInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/safeguard/impl/fallback/FallbackInterceptor$Cache");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "fallbackCache", "Lorg/apache/safeguard/impl/fallback/FallbackInterceptor$Cache;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "fallbackCache", "Lorg/apache/safeguard/impl/fallback/FallbackInterceptor$Cache;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/safeguard/impl/fallback/FallbackInterceptor$Cache", "create", "(Ljavax/interceptor/InvocationContext;)Lorg/eclipse/microprofile/faulttolerance/FallbackHandler;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$validate$12", "(Ljavax/interceptor/InvocationContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "circuitBreakerCache", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "getInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "circuitBreakerCache", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "circuitBreakerCache", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$Cache", "create", "(Ljavax/interceptor/InvocationContext;)Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$validate$11", "(Ljavax/interceptor/InvocationContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "bulkHeadCache", "Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "getInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "bulkHeadCache", "Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "bulkHeadCache", "Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "create", "(Ljavax/interceptor/InvocationContext;)Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$validate$10", "(Ljavax/interceptor/InvocationContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "timeoutCache", "Lorg/apache/safeguard/impl/timeout/TimeoutInterceptor$Cache;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/safeguard/impl/timeout/TimeoutInterceptor$Cache;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "getInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/safeguard/impl/timeout/TimeoutInterceptor$Cache");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "timeoutCache", "Lorg/apache/safeguard/impl/timeout/TimeoutInterceptor$Cache;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/cdi/SafeguardExtension", "timeoutCache", "Lorg/apache/safeguard/impl/timeout/TimeoutInterceptor$Cache;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/safeguard/impl/timeout/TimeoutInterceptor$Cache", "create", "(Ljavax/interceptor/InvocationContext;)Lorg/apache/safeguard/impl/timeout/TimeoutInterceptor$Model;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$addMissingBeans$9", "(Ljava/lang/Object;Ljavax/enterprise/context/spi/CreationalContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/concurrent/ExecutorService;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/concurrent/ExecutorService");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ExecutorService", "shutdownNow", "()Ljava/util/List;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$addMissingBeans$8", "(Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/safeguard/impl/cdi/SafeguardExtension$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension$1", "<init>", "(Lorg/apache/safeguard/impl/cdi/SafeguardExtension;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/concurrent/Executors", "newCachedThreadPool", "(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$addMissingBeans$7", "(Lorg/apache/safeguard/impl/config/GeronimoFaultToleranceConfig;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "create", "(Lorg/apache/safeguard/impl/config/GeronimoFaultToleranceConfig;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$addMissingBeans$6", "(Lorg/apache/safeguard/impl/config/GeronimoFaultToleranceConfig;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$onBean$5", "(Ljavax/enterprise/inject/spi/AnnotatedMethod;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/safeguard/impl/cdi/SafeguardEnabled;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedMethod", "isAnnotationPresent", "(Ljava/lang/Class;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$onBean$4", "(Ljava/lang/reflect/Type;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/concurrent/Executor;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "toClass", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$activateSafeguard$3", "(Ljavax/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/safeguard/impl/cdi/SafeguardEnabled$Literal", "INSTANCE", "Lorg/apache/safeguard/impl/cdi/SafeguardEnabled$Literal;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator", "add", "(Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$activateSafeguard$2", "(Ljava/util/List;Ljavax/enterprise/inject/spi/AnnotatedMethod;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedMethod", "getJavaMember", "()Ljava/lang/reflect/Method;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$activateSafeguard$1", "(Ljavax/enterprise/inject/spi/AnnotatedMethod;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardExtension", "faultToleranceAnnotations", "()Ljava/util/stream/Stream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInvokeDynamicInsn("test", "(Ljavax/enterprise/inject/spi/AnnotatedMethod;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKEINTERFACE, "javax/enterprise/inject/spi/Annotated", "isAnnotationPresent", "(Ljava/lang/Class;)Z", true), Type.getType("(Ljava/lang/Class;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "anyMatch", "(Ljava/util/function/Predicate;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$activateSafeguard$0", "(Ljavax/enterprise/inject/spi/ProcessAnnotatedType;Ljava/lang/Class;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessAnnotatedType", "getAnnotatedType", "()Ljavax/enterprise/inject/spi/AnnotatedType;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "isAnnotationPresent", "(Ljava/lang/Class;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
