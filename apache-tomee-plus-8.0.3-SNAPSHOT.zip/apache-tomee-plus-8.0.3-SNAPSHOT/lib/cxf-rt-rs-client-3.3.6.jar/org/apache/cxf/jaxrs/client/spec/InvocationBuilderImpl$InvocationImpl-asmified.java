package asm.org.apache.cxf.jaxrs.client.spec;
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
public class InvocationBuilderImpl$InvocationImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", null, "java/lang/Object", new String[] { "javax/ws/rs/client/Invocation" });

classWriter.visitInnerClass("javax/ws/rs/client/Invocation$Builder", "javax/ws/rs/client/Invocation", "Builder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl", "InvocationImpl", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "invBuilder", "Ljavax/ws/rs/client/Invocation$Builder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "httpMethod", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "entity", "Ljavax/ws/rs/client/Entity;", "Ljavax/ws/rs/client/Entity<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "<init>", "(Lorg/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl;Ljava/lang/String;Ljavax/ws/rs/client/Entity;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl;Ljava/lang/String;Ljavax/ws/rs/client/Entity;)V", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "this$0", "Lorg/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "invBuilder", "Ljavax/ws/rs/client/Invocation$Builder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "httpMethod", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "entity", "Ljavax/ws/rs/client/Entity;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "()Ljavax/ws/rs/core/Response;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "invBuilder", "Ljavax/ws/rs/client/Invocation$Builder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "httpMethod", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "entity", "Ljavax/ws/rs/client/Entity;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/client/Invocation$Builder", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;)Ljavax/ws/rs/core/Response;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "invBuilder", "Ljavax/ws/rs/client/Invocation$Builder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "httpMethod", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "entity", "Ljavax/ws/rs/client/Entity;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/client/Invocation$Builder", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "(Ljavax/ws/rs/core/GenericType;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/core/GenericType<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "invBuilder", "Ljavax/ws/rs/client/Invocation$Builder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "httpMethod", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "entity", "Ljavax/ws/rs/client/Entity;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/client/Invocation$Builder", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljavax/ws/rs/core/GenericType;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "property", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/ws/rs/client/Invocation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "invBuilder", "Ljavax/ws/rs/client/Invocation$Builder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/client/Invocation$Builder", "property", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/ws/rs/client/Invocation$Builder;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "submit", "()Ljava/util/concurrent/Future;", "()Ljava/util/concurrent/Future<Ljavax/ws/rs/core/Response;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "invBuilder", "Ljavax/ws/rs/client/Invocation$Builder;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/client/Invocation$Builder", "async", "()Ljavax/ws/rs/client/AsyncInvoker;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "httpMethod", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "entity", "Ljavax/ws/rs/client/Entity;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/client/AsyncInvoker", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;)Ljava/util/concurrent/Future;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "submit", "(Ljava/lang/Class;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "invBuilder", "Ljavax/ws/rs/client/Invocation$Builder;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/client/Invocation$Builder", "async", "()Ljavax/ws/rs/client/AsyncInvoker;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "httpMethod", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "entity", "Ljavax/ws/rs/client/Entity;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/client/AsyncInvoker", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/util/concurrent/Future;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "submit", "(Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "invBuilder", "Ljavax/ws/rs/client/Invocation$Builder;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/client/Invocation$Builder", "async", "()Ljavax/ws/rs/client/AsyncInvoker;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "httpMethod", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "entity", "Ljavax/ws/rs/client/Entity;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/client/AsyncInvoker", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "submit", "(Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/client/InvocationCallback<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "invBuilder", "Ljavax/ws/rs/client/Invocation$Builder;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/client/Invocation$Builder", "async", "()Ljavax/ws/rs/client/AsyncInvoker;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "httpMethod", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/InvocationBuilderImpl$InvocationImpl", "entity", "Ljavax/ws/rs/client/Entity;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/client/AsyncInvoker", "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
