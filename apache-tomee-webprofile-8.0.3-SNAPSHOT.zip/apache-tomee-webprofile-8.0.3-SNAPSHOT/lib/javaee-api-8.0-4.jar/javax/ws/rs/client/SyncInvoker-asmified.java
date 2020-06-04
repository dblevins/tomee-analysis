package asm.javax.ws.rs.client;
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
public class SyncInvokerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/ws/rs/client/SyncInvoker", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "()Ljavax/ws/rs/core/Response;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljavax/ws/rs/core/GenericType;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/core/GenericType<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "put", "(Ljavax/ws/rs/client/Entity;)Ljavax/ws/rs/core/Response;", "(Ljavax/ws/rs/client/Entity<*>;)Ljavax/ws/rs/core/Response;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "put", "(Ljavax/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/client/Entity<*>;Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "put", "(Ljavax/ws/rs/client/Entity;Ljavax/ws/rs/core/GenericType;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/client/Entity<*>;Ljavax/ws/rs/core/GenericType<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "post", "(Ljavax/ws/rs/client/Entity;)Ljavax/ws/rs/core/Response;", "(Ljavax/ws/rs/client/Entity<*>;)Ljavax/ws/rs/core/Response;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "post", "(Ljavax/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/client/Entity<*>;Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "post", "(Ljavax/ws/rs/client/Entity;Ljavax/ws/rs/core/GenericType;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/client/Entity<*>;Ljavax/ws/rs/core/GenericType<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "delete", "()Ljavax/ws/rs/core/Response;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "delete", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "delete", "(Ljavax/ws/rs/core/GenericType;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/core/GenericType<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "head", "()Ljavax/ws/rs/core/Response;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "options", "()Ljavax/ws/rs/core/Response;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "options", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "options", "(Ljavax/ws/rs/core/GenericType;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/core/GenericType<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trace", "()Ljavax/ws/rs/core/Response;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trace", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trace", "(Ljavax/ws/rs/core/GenericType;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/core/GenericType<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;)Ljavax/ws/rs/core/Response;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;Ljavax/ws/rs/core/GenericType;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/ws/rs/core/GenericType<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;)Ljavax/ws/rs/core/Response;", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity<*>;)Ljavax/ws/rs/core/Response;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/ws/rs/client/Entity<*>;Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;Ljavax/ws/rs/core/GenericType;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/ws/rs/client/Entity<*>;Ljavax/ws/rs/core/GenericType<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
