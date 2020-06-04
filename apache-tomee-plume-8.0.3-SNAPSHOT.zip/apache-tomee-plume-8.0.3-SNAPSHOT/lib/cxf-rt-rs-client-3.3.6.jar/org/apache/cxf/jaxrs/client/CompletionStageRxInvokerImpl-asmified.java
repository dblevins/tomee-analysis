package asm.org.apache.cxf.jaxrs.client;
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
public class CompletionStageRxInvokerImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", null, "java/lang/Object", new String[] { "jakarta/ws/rs/client/CompletionStageRxInvoker" });

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ex", "Ljava/util/concurrent/ExecutorService;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/jaxrs/client/WebClient;Ljava/util/concurrent/ExecutorService;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "ex", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "()Ljava/util/concurrent/CompletionStage;", "()Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ws/rs/core/Response;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "get", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("GET");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljakarta/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("GET");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "put", "(Ljakarta/ws/rs/client/Entity;)Ljava/util/concurrent/CompletionStage;", "(Ljakarta/ws/rs/client/Entity<*>;)Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ws/rs/core/Response;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "put", "(Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "put", "(Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljakarta/ws/rs/client/Entity<*>;Ljava/lang/Class<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("PUT");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "put", "(Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljakarta/ws/rs/client/Entity<*>;Ljakarta/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("PUT");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "post", "(Ljakarta/ws/rs/client/Entity;)Ljava/util/concurrent/CompletionStage;", "(Ljakarta/ws/rs/client/Entity<*>;)Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ws/rs/core/Response;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "post", "(Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "post", "(Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljakarta/ws/rs/client/Entity<*>;Ljava/lang/Class<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("POST");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "post", "(Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljakarta/ws/rs/client/Entity<*>;Ljakarta/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("POST");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "delete", "()Ljava/util/concurrent/CompletionStage;", "()Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ws/rs/core/Response;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "delete", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "delete", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("DELETE");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "delete", "(Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljakarta/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("DELETE");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "head", "()Ljava/util/concurrent/CompletionStage;", "()Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("HEAD");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "options", "()Ljava/util/concurrent/CompletionStage;", "()Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ws/rs/core/Response;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "options", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "options", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("OPTIONS");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "options", "(Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljakarta/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("OPTIONS");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trace", "()Ljava/util/concurrent/CompletionStage;", "()Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ws/rs/core/Response;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "trace", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trace", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("TRACE");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trace", "(Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljakarta/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("TRACE");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "method", "(Ljava/lang/String;)Ljava/util/concurrent/CompletionStage;", "(Ljava/lang/String;)Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ws/rs/core/Response;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;)Ljava/util/concurrent/CompletionStage;", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity<*>;)Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ws/rs/core/Response;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/ws/rs/client/Entity<*>;Ljava/lang/Class<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "ex", "Ljava/util/concurrent/ExecutorService;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl;Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "lambda$method$0", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/lang/Object;", false), Type.getType("()Ljava/lang/Object;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/concurrent/CompletableFuture", "supplyAsync", "(Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl;Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "lambda$method$1", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/lang/Object;", false), Type.getType("()Ljava/lang/Object;")});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "ex", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/concurrent/CompletableFuture", "supplyAsync", "(Ljava/util/function/Supplier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/ws/rs/client/Entity<*>;Ljakarta/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "ex", "Ljava/util/concurrent/ExecutorService;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl;Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "lambda$method$2", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", false), Type.getType("()Ljava/lang/Object;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/concurrent/CompletableFuture", "supplyAsync", "(Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl;Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "lambda$method$3", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", false), Type.getType("()Ljava/lang/Object;")});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "ex", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/concurrent/CompletableFuture", "supplyAsync", "(Ljava/util/function/Supplier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "ex", "Ljava/util/concurrent/ExecutorService;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl;Ljava/lang/String;Ljava/lang/Class;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "lambda$method$4", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", false), Type.getType("()Ljava/lang/Object;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/concurrent/CompletableFuture", "supplyAsync", "(Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl;Ljava/lang/String;Ljava/lang/Class;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "lambda$method$5", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", false), Type.getType("()Ljava/lang/Object;")});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "ex", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/concurrent/CompletableFuture", "supplyAsync", "(Ljava/util/function/Supplier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "method", "(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "ex", "Ljava/util/concurrent/ExecutorService;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl;Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "lambda$method$6", "(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", false), Type.getType("()Ljava/lang/Object;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/concurrent/CompletableFuture", "supplyAsync", "(Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl;Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "lambda$method$7", "(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", false), Type.getType("()Ljava/lang/Object;")});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "ex", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/concurrent/CompletableFuture", "supplyAsync", "(Ljava/util/function/Supplier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "method", "(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "method", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "method", "(Ljava/lang/String;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "trace", "(Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "trace", "(Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "trace", "(Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "trace", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "trace", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "trace", "()Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "options", "(Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "options", "(Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "options", "(Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "options", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "options", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "options", "()Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "head", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "head", "()Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "delete", "(Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "delete", "(Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "delete", "(Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "delete", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "delete", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "delete", "()Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "post", "(Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "post", "(Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "post", "(Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "post", "(Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "post", "(Ljakarta/ws/rs/client/Entity;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "post", "(Ljakarta/ws/rs/client/Entity;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "put", "(Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "put", "(Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "put", "(Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "put", "(Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "put", "(Ljakarta/ws/rs/client/Entity;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "put", "(Ljakarta/ws/rs/client/Entity;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "get", "(Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "get", "(Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "get", "(Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "get", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "get", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "get", "()Ljava/util/concurrent/CompletionStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$method$7", "(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/WebClient", "sync", "()Ljakarta/ws/rs/client/SyncInvoker;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/SyncInvoker", "method", "(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$method$6", "(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/WebClient", "sync", "()Ljakarta/ws/rs/client/SyncInvoker;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/SyncInvoker", "method", "(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$method$5", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/WebClient", "sync", "()Ljakarta/ws/rs/client/SyncInvoker;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/SyncInvoker", "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$method$4", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/WebClient", "sync", "()Ljakarta/ws/rs/client/SyncInvoker;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/SyncInvoker", "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$method$3", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/WebClient", "sync", "()Ljakarta/ws/rs/client/SyncInvoker;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/SyncInvoker", "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$method$2", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/WebClient", "sync", "()Ljakarta/ws/rs/client/SyncInvoker;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/SyncInvoker", "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$method$1", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/WebClient", "sync", "()Ljakarta/ws/rs/client/SyncInvoker;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/SyncInvoker", "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$method$0", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/CompletionStageRxInvokerImpl", "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/WebClient", "sync", "()Ljakarta/ws/rs/client/SyncInvoker;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/SyncInvoker", "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
