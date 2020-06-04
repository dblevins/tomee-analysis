package asm.org.apache.geronimo.microprofile.opentracing.microprofile.client;
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
public class GeronimoClientTracingRegistrarProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/microprofile/opentracing/microprofile/client/GeronimoClientTracingRegistrarProvider", null, "java/lang/Object", new String[] { "org/eclipse/microprofile/opentracing/ClientTracingRegistrarProvider" });

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "requestFilter", "Lorg/apache/geronimo/microprofile/opentracing/microprofile/client/OpenTracingClientRequestFilter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "responseFilter", "Lorg/apache/geronimo/microprofile/opentracing/microprofile/client/OpenTracingClientResponseFilter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "tracer", "Lio/opentracing/Tracer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/enterprise/inject/spi/CDI", "current", "()Ljavax/enterprise/inject/spi/CDI;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/geronimo/microprofile/opentracing/microprofile/client/OpenTracingClientRequestFilter;"));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/enterprise/inject/spi/CDI", "select", "(Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/Instance;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/Instance", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/geronimo/microprofile/opentracing/microprofile/client/OpenTracingClientRequestFilter");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/client/GeronimoClientTracingRegistrarProvider", "requestFilter", "Lorg/apache/geronimo/microprofile/opentracing/microprofile/client/OpenTracingClientRequestFilter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/geronimo/microprofile/opentracing/microprofile/client/OpenTracingClientResponseFilter;"));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/enterprise/inject/spi/CDI", "select", "(Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/Instance;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/Instance", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/geronimo/microprofile/opentracing/microprofile/client/OpenTracingClientResponseFilter");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/client/GeronimoClientTracingRegistrarProvider", "responseFilter", "Lorg/apache/geronimo/microprofile/opentracing/microprofile/client/OpenTracingClientResponseFilter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lio/opentracing/Tracer;"));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/enterprise/inject/spi/CDI", "select", "(Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/Instance;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/Instance", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "io/opentracing/Tracer");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/client/GeronimoClientTracingRegistrarProvider", "tracer", "Lio/opentracing/Tracer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configure", "(Ljavax/ws/rs/client/ClientBuilder;)Ljavax/ws/rs/client/ClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/microprofile/opentracing/microprofile/client/SyncExecutor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/opentracing/microprofile/client/SyncExecutor", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/opentracing/microprofile/client/GeronimoClientTracingRegistrarProvider", "configure", "(Ljavax/ws/rs/client/ClientBuilder;Ljava/util/concurrent/ExecutorService;)Ljavax/ws/rs/client/ClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configure", "(Ljavax/ws/rs/client/ClientBuilder;Ljava/util/concurrent/ExecutorService;)Ljavax/ws/rs/client/ClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/client/ClientBuilder", "getConfiguration", "()Ljavax/ws/rs/core/Configuration;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/Configuration", "getInstances", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("test", "(Lorg/apache/geronimo/microprofile/opentracing/microprofile/client/GeronimoClientTracingRegistrarProvider;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/geronimo/microprofile/opentracing/microprofile/client/GeronimoClientTracingRegistrarProvider", "lambda$configure$0", "(Ljava/lang/Object;)Z", false), Type.getType("(Ljava/lang/Object;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "anyMatch", "(Ljava/util/function/Predicate;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/client/GeronimoClientTracingRegistrarProvider", "requestFilter", "Lorg/apache/geronimo/microprofile/opentracing/microprofile/client/OpenTracingClientRequestFilter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/client/ClientBuilder", "register", "(Ljava/lang/Object;)Ljavax/ws/rs/core/Configurable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ws/rs/client/ClientBuilder");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/client/GeronimoClientTracingRegistrarProvider", "responseFilter", "Lorg/apache/geronimo/microprofile/opentracing/microprofile/client/OpenTracingClientResponseFilter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/client/ClientBuilder", "register", "(Ljava/lang/Object;)Ljavax/ws/rs/core/Configurable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ws/rs/client/ClientBuilder");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/opentracing/microprofile/client/GeronimoClientTracingRegistrarProvider", "wrapExecutor", "(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/client/ClientBuilder", "executorService", "(Ljava/util/concurrent/ExecutorService;)Ljavax/ws/rs/client/ClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "wrapExecutor", "(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/geronimo/microprofile/opentracing/microprofile/thread/OpenTracingExecutorService;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/microprofile/opentracing/microprofile/thread/OpenTracingExecutorService");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/client/GeronimoClientTracingRegistrarProvider", "tracer", "Lio/opentracing/Tracer;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/opentracing/microprofile/thread/OpenTracingExecutorService", "<init>", "(Ljava/util/concurrent/ExecutorService;Lio/opentracing/Tracer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$configure$0", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/opentracing/microprofile/client/GeronimoClientTracingRegistrarProvider", "requestFilter", "Lorg/apache/geronimo/microprofile/opentracing/microprofile/client/OpenTracingClientRequestFilter;");
methodVisitor.visitVarInsn(ALOAD, 1);
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
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
