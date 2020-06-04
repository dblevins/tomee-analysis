package asm.org.apache.geronimo.microprofile.opentracing.impl;
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
public class GeronimoTracerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", null, "java/lang/Object", new String[] { "io/opentracing/Tracer" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/enterprise/context/ApplicationScoped;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("io/opentracing/Tracer$SpanBuilder", "io/opentracing/Tracer", "SpanBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "scopeManager", "Lio/opentracing/ScopeManager;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/inject/Inject;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "idGenerator", "Lorg/apache/geronimo/microprofile/opentracing/impl/IdGenerator;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/inject/Inject;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "finishedSpanEvent", "Ljavax/enterprise/event/Event;", "Ljavax/enterprise/event/Event<Lorg/apache/geronimo/microprofile/opentracing/impl/FinishedSpan;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/inject/Inject;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "config", "Lorg/apache/geronimo/microprofile/opentracing/config/GeronimoOpenTracingConfig;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/inject/Inject;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parentSpanIdHeader", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "spanIdHeader", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "traceIdHeader", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "baggageHeaderPrefix", "Ljava/lang/String;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "init", "()V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/PostConstruct;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "config", "Lorg/apache/geronimo/microprofile/opentracing/config/GeronimoOpenTracingConfig;");
methodVisitor.visitLdcInsn("propagation.headers.parentSpanId");
methodVisitor.visitLdcInsn("X-B3-ParentSpanId");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/microprofile/opentracing/config/GeronimoOpenTracingConfig", "read", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "parentSpanIdHeader", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "config", "Lorg/apache/geronimo/microprofile/opentracing/config/GeronimoOpenTracingConfig;");
methodVisitor.visitLdcInsn("propagation.headers.spanId");
methodVisitor.visitLdcInsn("X-B3-SpanId");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/microprofile/opentracing/config/GeronimoOpenTracingConfig", "read", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "spanIdHeader", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "config", "Lorg/apache/geronimo/microprofile/opentracing/config/GeronimoOpenTracingConfig;");
methodVisitor.visitLdcInsn("propagation.headers.traceId");
methodVisitor.visitLdcInsn("X-B3-TraceId");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/microprofile/opentracing/config/GeronimoOpenTracingConfig", "read", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "traceIdHeader", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "config", "Lorg/apache/geronimo/microprofile/opentracing/config/GeronimoOpenTracingConfig;");
methodVisitor.visitLdcInsn("propagation.headers.baggagePrefix");
methodVisitor.visitLdcInsn("baggage-");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/microprofile/opentracing/config/GeronimoOpenTracingConfig", "read", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "baggageHeaderPrefix", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scopeManager", "()Lio/opentracing/ScopeManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "scopeManager", "Lio/opentracing/ScopeManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "activeSpan", "()Lio/opentracing/Span;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "scopeManager", "Lio/opentracing/ScopeManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "io/opentracing/ScopeManager", "active", "()Lio/opentracing/Scope;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Optional", "ofNullable", "(Ljava/lang/Object;)Ljava/util/Optional;", false);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEINTERFACE, "io/opentracing/Scope", "span", "()Lio/opentracing/Span;", true), Type.getType("(Lio/opentracing/Scope;)Lio/opentracing/Span;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "map", "(Ljava/util/function/Function;)Ljava/util/Optional;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "orElse", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "io/opentracing/Span");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildSpan", "(Ljava/lang/String;)Lio/opentracing/Tracer$SpanBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/microprofile/opentracing/impl/SpanBuilderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "lambda$buildSpan$0", "(Lorg/apache/geronimo/microprofile/opentracing/impl/SpanImpl;)V", false), Type.getType("(Lorg/apache/geronimo/microprofile/opentracing/impl/SpanImpl;)V")});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "idGenerator", "Lorg/apache/geronimo/microprofile/opentracing/impl/IdGenerator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/opentracing/impl/SpanBuilderImpl", "<init>", "(Lorg/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer;Ljava/util/function/Consumer;Ljava/lang/String;Lorg/apache/geronimo/microprofile/opentracing/impl/IdGenerator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "inject", "(Lio/opentracing/SpanContext;Lio/opentracing/propagation/Format;Ljava/lang/Object;)V", "<C:Ljava/lang/Object;>(Lio/opentracing/SpanContext;Lio/opentracing/propagation/Format<TC;>;TC;)V", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lio/opentracing/propagation/TextMap;"));
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Only TextMap are supported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Lio/opentracing/propagation/TextMap;"));
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "io/opentracing/propagation/TextMap");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/geronimo/microprofile/opentracing/impl/SpanContextImpl;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/geronimo/microprofile/opentracing/impl/SpanContextImpl");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "traceIdHeader", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/opentracing/impl/SpanContextImpl", "getTraceId", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "io/opentracing/propagation/TextMap", "put", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "spanIdHeader", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/opentracing/impl/SpanContextImpl", "getSpanId", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "io/opentracing/propagation/TextMap", "put", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/opentracing/impl/SpanContextImpl", "getBaggageItems", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer;Lio/opentracing/propagation/TextMap;)Ljava/util/function/BiConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "lambda$inject$1", "(Lio/opentracing/propagation/TextMap;Ljava/lang/String;Ljava/lang/String;)V", false), Type.getType("(Ljava/lang/String;Ljava/lang/String;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "forEach", "(Ljava/util/function/BiConsumer;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "extract", "(Lio/opentracing/propagation/Format;Ljava/lang/Object;)Lio/opentracing/SpanContext;", "<C:Ljava/lang/Object;>(Lio/opentracing/propagation/Format<TC;>;TC;)Lio/opentracing/SpanContext;", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/geronimo/microprofile/opentracing/impl/JaxRsHeaderTextMap;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/geronimo/microprofile/opentracing/impl/JaxRsHeaderTextMap;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/geronimo/microprofile/opentracing/impl/JaxRsHeaderTextMap");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/opentracing/impl/JaxRsHeaderTextMap", "getMap", "()Ljavax/ws/rs/core/MultivaluedMap;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "traceIdHeader", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/MultivaluedMap", "getFirst", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "spanIdHeader", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/MultivaluedMap", "getFirst", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "parentSpanIdHeader", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/MultivaluedMap", "getFirst", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/MultivaluedMap", "keySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("test", "(Lorg/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "lambda$extract$2", "(Ljava/lang/String;)Z", false), Type.getType("(Ljava/lang/String;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "filter", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/function/Function", "identity", "()Ljava/util/function/Function;", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInvokeDynamicInsn("apply", "(Ljavax/ws/rs/core/MultivaluedMap;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "lambda$extract$3", "(Ljavax/ws/rs/core/MultivaluedMap;Ljava/lang/String;)Ljava/lang/String;", false), Type.getType("(Ljava/lang/String;)Ljava/lang/String;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collectors", "toMap", "(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "newContext", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Lorg/apache/geronimo/microprofile/opentracing/impl/SpanContextImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "io/opentracing/propagation/Format", "java/lang/Object", "javax/ws/rs/core/MultivaluedMap", "java/lang/String", "java/lang/String", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "io/opentracing/propagation/Format", "java/lang/Object"}, 0, new Object[] {});
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/geronimo/microprofile/opentracing/impl/ServletHeaderTextMap;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/geronimo/microprofile/opentracing/impl/ServletHeaderTextMap;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/geronimo/microprofile/opentracing/impl/ServletHeaderTextMap");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/opentracing/impl/ServletHeaderTextMap", "getRequest", "()Ljavax/servlet/http/HttpServletRequest;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "traceIdHeader", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getHeader", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "spanIdHeader", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getHeader", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "parentSpanIdHeader", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getHeader", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getHeaderNames", "()Ljava/util/Enumeration;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "list", "(Ljava/util/Enumeration;)Ljava/util/ArrayList;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "stream", "()Ljava/util/stream/Stream;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("test", "(Lorg/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "lambda$extract$4", "(Ljava/lang/String;)Z", false), Type.getType("(Ljava/lang/String;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "filter", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/function/Function", "identity", "()Ljava/util/function/Function;", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInvokeDynamicInsn("apply", "(Ljavax/servlet/http/HttpServletRequest;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "lambda$extract$5", "(Ljavax/servlet/http/HttpServletRequest;Ljava/lang/String;)Ljava/lang/String;", false), Type.getType("(Ljava/lang/String;)Ljava/lang/String;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collectors", "toMap", "(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "newContext", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Lorg/apache/geronimo/microprofile/opentracing/impl/SpanContextImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "io/opentracing/propagation/Format", "java/lang/Object", "javax/servlet/http/HttpServletRequest", "java/lang/String", "java/lang/String", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "io/opentracing/propagation/Format", "java/lang/Object"}, 0, new Object[] {});
methodVisitor.visitLdcInsn(Type.getType("Lio/opentracing/propagation/TextMap;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Only TextMap are supported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Lio/opentracing/propagation/TextMap;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "io/opentracing/propagation/TextMap");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "io/opentracing/propagation/TextMap", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "io/opentracing/propagation/Format", "java/lang/Object", "java/util/Iterator", "java/lang/String", "java/lang/String", "java/lang/String", "java/util/Map"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "baggageHeaderPrefix", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Map$Entry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "spanIdHeader", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "traceIdHeader", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "parentSpanIdHeader", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "newContext", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Lorg/apache/geronimo/microprofile/opentracing/impl/SpanContextImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processNewSpan", "(Lorg/apache/geronimo/microprofile/opentracing/impl/SpanImpl;)Lio/opentracing/Span;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newContext", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Lorg/apache/geronimo/microprofile/opentracing/impl/SpanContextImpl;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lorg/apache/geronimo/microprofile/opentracing/impl/SpanContextImpl;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/microprofile/opentracing/impl/SpanContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/opentracing/impl/SpanContextImpl", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$extract$5", "(Ljavax/servlet/http/HttpServletRequest;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getHeader", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$extract$4", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "baggageHeaderPrefix", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$extract$3", "(Ljavax/ws/rs/core/MultivaluedMap;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/MultivaluedMap", "getFirst", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$extract$2", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "baggageHeaderPrefix", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$inject$1", "(Lio/opentracing/propagation/TextMap;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "baggageHeaderPrefix", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "io/opentracing/propagation/TextMap", "put", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$buildSpan$0", "(Lorg/apache/geronimo/microprofile/opentracing/impl/SpanImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "finishedSpanEvent", "Ljavax/enterprise/event/Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/microprofile/opentracing/impl/FinishedSpan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/opentracing/impl/GeronimoTracer", "processNewSpan", "(Lorg/apache/geronimo/microprofile/opentracing/impl/SpanImpl;)Lio/opentracing/Span;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/opentracing/impl/FinishedSpan", "<init>", "(Lio/opentracing/Span;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/event/Event", "fire", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
