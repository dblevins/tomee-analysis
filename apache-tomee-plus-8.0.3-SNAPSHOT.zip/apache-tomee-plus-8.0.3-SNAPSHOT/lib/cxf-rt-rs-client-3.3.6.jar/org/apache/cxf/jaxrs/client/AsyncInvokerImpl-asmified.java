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
public class AsyncInvokerImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", null, "java/lang/Object", new String[] { "javax/ws/rs/client/AsyncInvoker" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/jaxrs/client/WebClient;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "()Ljava/util/concurrent/Future;", "()Ljava/util/concurrent/Future<Ljavax/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/Response;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "get", "(Ljava/lang/Class;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljava/lang/Class;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("GET");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("GET");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/client/InvocationCallback<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("GET");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "put", "(Ljavax/ws/rs/client/Entity;)Ljava/util/concurrent/Future;", "(Ljavax/ws/rs/client/Entity<*>;)Ljava/util/concurrent/Future<Ljavax/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/Response;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "put", "(Ljavax/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "put", "(Ljavax/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/client/Entity<*>;Ljava/lang/Class<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("PUT");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "put", "(Ljavax/ws/rs/client/Entity;Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/client/Entity<*>;Ljavax/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("PUT");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "put", "(Ljavax/ws/rs/client/Entity;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/client/Entity<*>;Ljavax/ws/rs/client/InvocationCallback<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("PUT");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "post", "(Ljavax/ws/rs/client/Entity;)Ljava/util/concurrent/Future;", "(Ljavax/ws/rs/client/Entity<*>;)Ljava/util/concurrent/Future<Ljavax/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/Response;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "post", "(Ljavax/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "post", "(Ljavax/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/client/Entity<*>;Ljava/lang/Class<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("POST");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "post", "(Ljavax/ws/rs/client/Entity;Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/client/Entity<*>;Ljavax/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("POST");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "post", "(Ljavax/ws/rs/client/Entity;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/client/Entity<*>;Ljavax/ws/rs/client/InvocationCallback<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("POST");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "delete", "()Ljava/util/concurrent/Future;", "()Ljava/util/concurrent/Future<Ljavax/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/Response;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "delete", "(Ljava/lang/Class;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "delete", "(Ljava/lang/Class;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("DELETE");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "delete", "(Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("DELETE");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "delete", "(Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/client/InvocationCallback<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("DELETE");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "head", "()Ljava/util/concurrent/Future;", "()Ljava/util/concurrent/Future<Ljavax/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("HEAD");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "head", "(Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", "(Ljavax/ws/rs/client/InvocationCallback<Ljavax/ws/rs/core/Response;>;)Ljava/util/concurrent/Future<Ljavax/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("HEAD");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "options", "()Ljava/util/concurrent/Future;", "()Ljava/util/concurrent/Future<Ljavax/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/Response;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "options", "(Ljava/lang/Class;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "options", "(Ljava/lang/Class;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("OPTIONS");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "options", "(Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("OPTIONS");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "options", "(Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/client/InvocationCallback<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("OPTIONS");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trace", "()Ljava/util/concurrent/Future;", "()Ljava/util/concurrent/Future<Ljavax/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/Response;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "trace", "(Ljava/lang/Class;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trace", "(Ljava/lang/Class;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("TRACE");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trace", "(Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("TRACE");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trace", "(Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/client/InvocationCallback<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("TRACE");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "method", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "(Ljava/lang/String;)Ljava/util/concurrent/Future<Ljavax/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/Response;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/WebClient", "doInvokeAsync", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "method", "(Ljava/lang/String;Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/GenericType", "getRawType", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/GenericType", "getType", "()Ljava/lang/reflect/Type;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/WebClient", "doInvokeAsync", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "method", "(Ljava/lang/String;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/ws/rs/client/InvocationCallback<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/WebClient", "doInvokeAsyncCallback", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;)Ljava/util/concurrent/Future;", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity<*>;)Ljava/util/concurrent/Future<Ljavax/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/Response;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/ws/rs/client/Entity<*>;Ljava/lang/Class<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/WebClient", "doInvokeAsync", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/ws/rs/client/Entity<*>;Ljavax/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/GenericType", "getRawType", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/GenericType", "getType", "()Ljava/lang/reflect/Type;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/WebClient", "doInvokeAsync", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/ws/rs/client/Entity<*>;Ljavax/ws/rs/client/InvocationCallback<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/AsyncInvokerImpl", "wc", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/WebClient", "doInvokeAsyncCallback", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
