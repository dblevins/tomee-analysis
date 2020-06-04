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
public class Invocation$BuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/ws/rs/client/Invocation$Builder", null, "java/lang/Object", new String[] { "javax/ws/rs/client/SyncInvoker" });

classWriter.visitInnerClass("javax/ws/rs/client/Invocation$Builder", "javax/ws/rs/client/Invocation", "Builder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "build", "(Ljava/lang/String;)Ljavax/ws/rs/client/Invocation;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "build", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity;)Ljavax/ws/rs/client/Invocation;", "(Ljava/lang/String;Ljavax/ws/rs/client/Entity<*>;)Ljavax/ws/rs/client/Invocation;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildGet", "()Ljavax/ws/rs/client/Invocation;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildDelete", "()Ljavax/ws/rs/client/Invocation;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildPost", "(Ljavax/ws/rs/client/Entity;)Ljavax/ws/rs/client/Invocation;", "(Ljavax/ws/rs/client/Entity<*>;)Ljavax/ws/rs/client/Invocation;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildPut", "(Ljavax/ws/rs/client/Entity;)Ljavax/ws/rs/client/Invocation;", "(Ljavax/ws/rs/client/Entity<*>;)Ljavax/ws/rs/client/Invocation;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "async", "()Ljavax/ws/rs/client/AsyncInvoker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "accept", "([Ljava/lang/String;)Ljavax/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "accept", "([Ljavax/ws/rs/core/MediaType;)Ljavax/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "acceptLanguage", "([Ljava/util/Locale;)Ljavax/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "acceptLanguage", "([Ljava/lang/String;)Ljavax/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "acceptEncoding", "([Ljava/lang/String;)Ljavax/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cookie", "(Ljavax/ws/rs/core/Cookie;)Ljavax/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cookie", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cacheControl", "(Ljavax/ws/rs/core/CacheControl;)Ljavax/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "header", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "headers", "(Ljavax/ws/rs/core/MultivaluedMap;)Ljavax/ws/rs/client/Invocation$Builder;", "(Ljavax/ws/rs/core/MultivaluedMap<Ljava/lang/String;Ljava/lang/Object;>;)Ljavax/ws/rs/client/Invocation$Builder;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "property", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "rx", "()Ljavax/ws/rs/client/CompletionStageRxInvoker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "rx", "(Ljava/lang/Class;)Ljavax/ws/rs/client/RxInvoker;", "<T::Ljavax/ws/rs/client/RxInvoker;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
