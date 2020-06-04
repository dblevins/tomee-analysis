package asm.org.apache.safeguard.impl.bulkhead;
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
public class BulkheadInterceptor$CacheDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/enterprise/context/ApplicationScoped;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model", "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor", "Model", ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor", "Cache", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "Histogram", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "Counter", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "models", "Ljava/util/Map;", "Ljava/util/Map<Lorg/apache/safeguard/impl/cache/Key;Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "finder", "Lorg/apache/safeguard/impl/annotation/AnnotationFinder;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/inject/Inject;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "metrics", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/inject/Inject;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "configurationMapper", "Lorg/apache/safeguard/impl/config/ConfigurationMapper;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/inject/Inject;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "unwrappedCache", "Lorg/apache/safeguard/impl/cache/UnwrappedCache;", null, null);
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
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "models", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUnwrappedCache", "()Lorg/apache/safeguard/impl/cache/UnwrappedCache;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "unwrappedCache", "Lorg/apache/safeguard/impl/cache/UnwrappedCache;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "destroy", "()V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/PreDestroy;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "models", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "lambda$destroy$0", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;)Z", false), Type.getType("(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "filter", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("accept", "()Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "lambda$destroy$1", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;)V", false), Type.getType("(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "forEach", "(Ljava/util/function/Consumer;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getModels", "()Ljava/util/Map;", "()Ljava/util/Map<Lorg/apache/safeguard/impl/cache/Key;Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "models", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "create", "(Ljavax/interceptor/InvocationContext;)Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "finder", "Lorg/apache/safeguard/impl/annotation/AnnotationFinder;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/faulttolerance/Asynchronous;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/safeguard/impl/annotation/AnnotationFinder", "findAnnotation", "(Ljava/lang/Class;Ljavax/interceptor/InvocationContext;)Ljava/lang/annotation/Annotation;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "getMetricsNameBase", "(Ljavax/interceptor/InvocationContext;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "metrics", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("callsAccepted.total");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("Number of calls accepted by the bulkhead");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "counter", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "metrics", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("callsRejected.total");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("Number of calls rejected by the bulkhead");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "counter", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "metrics", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("executionDuration");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("Histogram of method execution times. This does not include any time spent waiting in the bulkhead queue.");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "histogram", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "metrics", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("waiting.duration");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("Histogram of the time executions spend waiting in the queue");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "histogram", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "javax/interceptor/InvocationContext", Opcodes.INTEGER, "java/lang/String", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram"}, 0, new Object[] {});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "configurationMapper", "Lorg/apache/safeguard/impl/config/ConfigurationMapper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/interceptor/InvocationContext", "getMethod", "()Ljava/lang/reflect/Method;", true);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/faulttolerance/Bulkhead;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/safeguard/impl/config/ConfigurationMapper", "isEnabled", "(Ljava/lang/reflect/Method;Ljava/lang/Class;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitInsn(ICONST_1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "javax/interceptor/InvocationContext", Opcodes.INTEGER, "java/lang/String", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram"}, 2, new Object[] {label3, label3});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "javax/interceptor/InvocationContext", Opcodes.INTEGER, "java/lang/String", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram"}, 3, new Object[] {label3, label3, Opcodes.INTEGER});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "configurationMapper", "Lorg/apache/safeguard/impl/config/ConfigurationMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "finder", "Lorg/apache/safeguard/impl/annotation/AnnotationFinder;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/faulttolerance/Bulkhead;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/safeguard/impl/annotation/AnnotationFinder", "findAnnotation", "(Ljava/lang/Class;Ljavax/interceptor/InvocationContext;)Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/interceptor/InvocationContext", "getMethod", "()Ljava/lang/reflect/Method;", true);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/faulttolerance/Bulkhead;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/safeguard/impl/config/ConfigurationMapper", "map", "(Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/faulttolerance/Bulkhead");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model", "<init>", "(ZLjavax/interceptor/InvocationContext;Lorg/eclipse/microprofile/faulttolerance/Bulkhead;ZLorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Counter;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram;Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics$Histogram;Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(11, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getMetricsNameBase", "(Ljavax/interceptor/InvocationContext;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("ft.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/interceptor/InvocationContext", "getMethod", "()Ljava/lang/reflect/Method;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getDeclaringClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getCanonicalName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(".");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/interceptor/InvocationContext", "getMethod", "()Ljava/lang/reflect/Method;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(".bulkhead.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "postCreate", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;Ljavax/interceptor/InvocationContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "getMetricsNameBase", "(Ljavax/interceptor/InvocationContext;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "metrics", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("concurrentExecutions");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("Number of currently running executions");
methodVisitor.visitLdcInsn("none");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model", "access$600", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;)Ljava/util/concurrent/atomic/AtomicLong;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInvokeDynamicInsn("get", "(Ljava/util/concurrent/atomic/AtomicLong;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "get", "()J", false), Type.getType("()Ljava/lang/Long;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "gauge", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Supplier;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model", "access$1100", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;)Ljava/util/concurrent/ArrayBlockingQueue;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "metrics", "Lorg/apache/safeguard/impl/metrics/FaultToleranceMetrics;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("waitingQueue.population");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("Number of executions currently waiting in the queue");
methodVisitor.visitLdcInsn("none");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Cache", "lambda$postCreate$2", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;)Ljava/lang/Long;", false), Type.getType("()Ljava/lang/Long;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "gauge", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Supplier;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$postCreate$2", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;)Ljava/lang/Long;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model", "access$1100", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;)Ljava/util/concurrent/ArrayBlockingQueue;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ArrayBlockingQueue", "size", "()I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$destroy$1", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model", "access$200", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;)Ljava/util/concurrent/ThreadPoolExecutor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "shutdownNow", "()Ljava/util/List;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$destroy$0", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model", "access$200", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;)Ljava/util/concurrent/ThreadPoolExecutor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
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
