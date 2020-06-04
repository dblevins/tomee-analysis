package asm.org.apache.geronimo.microprofile.opentracing.microprofile.server;
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
public class OpenTracingServerRequestFilterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/microprofile/opentracing/microprofile/server/OpenTracingServerRequestFilter", null, "java/lang/Object", new String[] { "javax/ws/rs/container/ContainerRequestFilter" });

classWriter.visitInnerClass("io/opentracing/Tracer$SpanBuilder", "io/opentracing/Tracer", "SpanBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("io/opentracing/propagation/Format$Builtin", "io/opentracing/propagation/Format", "Builtin", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "operationName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "tracer", "Lio/opentracing/Tracer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "skip", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "skipDefaultTags", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Lio/opentracing/Tracer;ZZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/server/OpenTracingServerRequestFilter", "operationName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/server/OpenTracingServerRequestFilter", "tracer", "Lio/opentracing/Tracer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/server/OpenTracingServerRequestFilter", "skip", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/server/OpenTracingServerRequestFilter", "skipDefaultTags", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "filter", "(Ljavax/ws/rs/container/ContainerRequestContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/geronimo/microprofile/opentracing/microprofile/client/OpenTracingClientRequestFilter;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/container/ContainerRequestContext", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/server/OpenTracingServerRequestFilter", "skip", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/server/OpenTracingServerRequestFilter", "tracer", "Lio/opentracing/Tracer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/server/OpenTracingServerRequestFilter", "operationName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "io/opentracing/Tracer", "buildSpan", "(Ljava/lang/String;)Lio/opentracing/Tracer$SpanBuilder;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "io/opentracing/tag/Tags", "SPAN_KIND", "Lio/opentracing/tag/StringTag;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "io/opentracing/tag/StringTag", "getKey", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("server");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "io/opentracing/Tracer$SpanBuilder", "withTag", "(Ljava/lang/String;Ljava/lang/String;)Lio/opentracing/Tracer$SpanBuilder;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("component");
methodVisitor.visitLdcInsn("jaxrs");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "io/opentracing/Tracer$SpanBuilder", "withTag", "(Ljava/lang/String;Ljava/lang/String;)Lio/opentracing/Tracer$SpanBuilder;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/server/OpenTracingServerRequestFilter", "tracer", "Lio/opentracing/Tracer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "io/opentracing/Tracer", "activeSpan", "()Lio/opentracing/Span;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Optional", "ofNullable", "(Ljava/lang/Object;)Ljava/util/Optional;", false);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEINTERFACE, "io/opentracing/Span", "context", "()Lio/opentracing/SpanContext;", true), Type.getType("(Lio/opentracing/Span;)Lio/opentracing/SpanContext;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "map", "(Ljava/util/function/Function;)Ljava/util/Optional;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/geronimo/microprofile/opentracing/microprofile/server/OpenTracingServerRequestFilter;Ljavax/ws/rs/container/ContainerRequestContext;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/geronimo/microprofile/opentracing/microprofile/server/OpenTracingServerRequestFilter", "lambda$filter$0", "(Ljavax/ws/rs/container/ContainerRequestContext;)Lio/opentracing/SpanContext;", false), Type.getType("()Lio/opentracing/SpanContext;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "orElseGet", "(Ljava/util/function/Supplier;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Optional", "ofNullable", "(Ljava/lang/Object;)Ljava/util/Optional;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lio/opentracing/Tracer$SpanBuilder;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKEINTERFACE, "io/opentracing/Tracer$SpanBuilder", "asChildOf", "(Lio/opentracing/SpanContext;)Lio/opentracing/Tracer$SpanBuilder;", true), Type.getType("(Lio/opentracing/SpanContext;)V")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "ifPresent", "(Ljava/util/function/Consumer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "io/opentracing/Tracer$SpanBuilder", "startActive", "(Z)Lio/opentracing/Scope;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "io/opentracing/Scope", "span", "()Lio/opentracing/Span;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/server/OpenTracingServerRequestFilter", "skipDefaultTags", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "io/opentracing/tag/Tags", "HTTP_METHOD", "Lio/opentracing/tag/StringTag;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/container/ContainerRequestContext", "getMethod", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "io/opentracing/tag/StringTag", "set", "(Lio/opentracing/Span;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "io/opentracing/tag/Tags", "HTTP_URL", "Lio/opentracing/tag/StringTag;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/container/ContainerRequestContext", "getUriInfo", "()Ljavax/ws/rs/core/UriInfo;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/UriInfo", "getRequestUri", "()Ljava/net/URI;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "toASCIIString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "io/opentracing/tag/StringTag", "set", "(Lio/opentracing/Span;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"io/opentracing/Tracer$SpanBuilder", "io/opentracing/Scope", "io/opentracing/Span"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/geronimo/microprofile/opentracing/microprofile/server/OpenTracingFilter;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/container/ContainerRequestContext", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$filter$0", "(Ljavax/ws/rs/container/ContainerRequestContext;)Lio/opentracing/SpanContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/server/OpenTracingServerRequestFilter", "tracer", "Lio/opentracing/Tracer;");
methodVisitor.visitFieldInsn(GETSTATIC, "io/opentracing/propagation/Format$Builtin", "HTTP_HEADERS", "Lio/opentracing/propagation/Format;");
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/microprofile/opentracing/impl/JaxRsHeaderTextMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/container/ContainerRequestContext", "getHeaders", "()Ljavax/ws/rs/core/MultivaluedMap;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/opentracing/impl/JaxRsHeaderTextMap", "<init>", "(Ljavax/ws/rs/core/MultivaluedMap;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "io/opentracing/Tracer", "extract", "(Lio/opentracing/propagation/Format;Ljava/lang/Object;)Lio/opentracing/SpanContext;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
