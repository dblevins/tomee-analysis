package asm.jakarta.ws.rs.client;
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
public class CompletionStageRxInvokerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "Ljava/lang/Object;Ljakarta/ws/rs/client/RxInvoker<Ljava/util/concurrent/CompletionStage;>;", "java/lang/Object", new String[] { "jakarta/ws/rs/client/RxInvoker" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "()Ljava/util/concurrent/CompletionStage;", "()Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljakarta/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "put", "(Ljakarta/ws/rs/client/Entity;)Ljava/util/concurrent/CompletionStage;", "(Ljakarta/ws/rs/client/Entity<*>;)Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "put", "(Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljakarta/ws/rs/client/Entity<*>;Ljava/lang/Class<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "put", "(Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljakarta/ws/rs/client/Entity<*>;Ljakarta/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "post", "(Ljakarta/ws/rs/client/Entity;)Ljava/util/concurrent/CompletionStage;", "(Ljakarta/ws/rs/client/Entity<*>;)Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "post", "(Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljakarta/ws/rs/client/Entity<*>;Ljava/lang/Class<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "post", "(Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljakarta/ws/rs/client/Entity<*>;Ljakarta/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "delete", "()Ljava/util/concurrent/CompletionStage;", "()Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "delete", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "delete", "(Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljakarta/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "head", "()Ljava/util/concurrent/CompletionStage;", "()Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "options", "()Ljava/util/concurrent/CompletionStage;", "()Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "options", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "options", "(Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljakarta/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trace", "()Ljava/util/concurrent/CompletionStage;", "()Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trace", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trace", "(Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljakarta/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;)Ljava/util/concurrent/CompletionStage;", "(Ljava/lang/String;)Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;)Ljava/util/concurrent/CompletionStage;", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity<*>;)Ljava/util/concurrent/CompletionStage<Ljakarta/ws/rs/core/Response;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/ws/rs/client/Entity<*>;Ljava/lang/Class<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/ws/rs/client/Entity<*>;Ljakarta/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/CompletionStage<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;)Ljava/util/concurrent/CompletionStage;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "method", "(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "method", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "method", "(Ljava/lang/String;)Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "trace", "(Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "trace", "(Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "trace", "(Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "trace", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "trace", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "trace", "()Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "options", "(Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "options", "(Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "options", "(Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "options", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "options", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "options", "()Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "head", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "head", "()Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "delete", "(Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "delete", "(Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "delete", "(Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "delete", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "delete", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "delete", "()Ljava/util/concurrent/CompletionStage;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "post", "(Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "post", "(Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "post", "(Ljakarta/ws/rs/client/Entity;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "post", "(Ljakarta/ws/rs/client/Entity;)Ljava/util/concurrent/CompletionStage;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "put", "(Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "put", "(Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "put", "(Ljakarta/ws/rs/client/Entity;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "put", "(Ljakarta/ws/rs/client/Entity;)Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "get", "(Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "get", "(Ljakarta/ws/rs/core/GenericType;)Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "get", "(Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "get", "(Ljava/lang/Class;)Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "get", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/CompletionStageRxInvoker", "get", "()Ljava/util/concurrent/CompletionStage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
