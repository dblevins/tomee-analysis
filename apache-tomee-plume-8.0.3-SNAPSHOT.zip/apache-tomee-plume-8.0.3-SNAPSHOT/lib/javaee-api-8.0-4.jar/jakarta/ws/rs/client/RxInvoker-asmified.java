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
public class RxInvokerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/ws/rs/client/RxInvoker", "<T:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "()Ljava/lang/Object;", "()TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljava/lang/Class;)Ljava/lang/Object;", "<R:Ljava/lang/Object;>(Ljava/lang/Class<TR;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", "<R:Ljava/lang/Object;>(Ljakarta/ws/rs/core/GenericType<TR;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "put", "(Ljakarta/ws/rs/client/Entity;)Ljava/lang/Object;", "(Ljakarta/ws/rs/client/Entity<*>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "put", "(Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/lang/Object;", "<R:Ljava/lang/Object;>(Ljakarta/ws/rs/client/Entity<*>;Ljava/lang/Class<TR;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "put", "(Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", "<R:Ljava/lang/Object;>(Ljakarta/ws/rs/client/Entity<*>;Ljakarta/ws/rs/core/GenericType<TR;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "post", "(Ljakarta/ws/rs/client/Entity;)Ljava/lang/Object;", "(Ljakarta/ws/rs/client/Entity<*>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "post", "(Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/lang/Object;", "<R:Ljava/lang/Object;>(Ljakarta/ws/rs/client/Entity<*>;Ljava/lang/Class<TR;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "post", "(Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", "<R:Ljava/lang/Object;>(Ljakarta/ws/rs/client/Entity<*>;Ljakarta/ws/rs/core/GenericType<TR;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "delete", "()Ljava/lang/Object;", "()TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "delete", "(Ljava/lang/Class;)Ljava/lang/Object;", "<R:Ljava/lang/Object;>(Ljava/lang/Class<TR;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "delete", "(Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", "<R:Ljava/lang/Object;>(Ljakarta/ws/rs/core/GenericType<TR;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "head", "()Ljava/lang/Object;", "()TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "options", "()Ljava/lang/Object;", "()TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "options", "(Ljava/lang/Class;)Ljava/lang/Object;", "<R:Ljava/lang/Object;>(Ljava/lang/Class<TR;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "options", "(Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", "<R:Ljava/lang/Object;>(Ljakarta/ws/rs/core/GenericType<TR;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trace", "()Ljava/lang/Object;", "()TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trace", "(Ljava/lang/Class;)Ljava/lang/Object;", "<R:Ljava/lang/Object;>(Ljava/lang/Class<TR;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trace", "(Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", "<R:Ljava/lang/Object;>(Ljakarta/ws/rs/core/GenericType<TR;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/String;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "<R:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TR;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", "<R:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/ws/rs/core/GenericType<TR;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;)Ljava/lang/Object;", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity<*>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljava/lang/Class;)Ljava/lang/Object;", "<R:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/ws/rs/client/Entity<*>;Ljava/lang/Class<TR;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "method", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;Ljakarta/ws/rs/core/GenericType;)Ljava/lang/Object;", "<R:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/ws/rs/client/Entity<*>;Ljakarta/ws/rs/core/GenericType<TR;>;)TT;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
