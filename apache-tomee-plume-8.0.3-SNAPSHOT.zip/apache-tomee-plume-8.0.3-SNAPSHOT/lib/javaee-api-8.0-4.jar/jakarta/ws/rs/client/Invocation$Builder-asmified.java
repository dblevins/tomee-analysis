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
public class Invocation$BuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/ws/rs/client/Invocation$Builder", null, "java/lang/Object", new String[] { "jakarta/ws/rs/client/SyncInvoker" });

classWriter.visitInnerClass("jakarta/ws/rs/client/Invocation$Builder", "jakarta/ws/rs/client/Invocation", "Builder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "build", "(Ljava/lang/String;)Ljakarta/ws/rs/client/Invocation;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "build", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity;)Ljakarta/ws/rs/client/Invocation;", "(Ljava/lang/String;Ljakarta/ws/rs/client/Entity<*>;)Ljakarta/ws/rs/client/Invocation;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildGet", "()Ljakarta/ws/rs/client/Invocation;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildDelete", "()Ljakarta/ws/rs/client/Invocation;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildPost", "(Ljakarta/ws/rs/client/Entity;)Ljakarta/ws/rs/client/Invocation;", "(Ljakarta/ws/rs/client/Entity<*>;)Ljakarta/ws/rs/client/Invocation;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildPut", "(Ljakarta/ws/rs/client/Entity;)Ljakarta/ws/rs/client/Invocation;", "(Ljakarta/ws/rs/client/Entity<*>;)Ljakarta/ws/rs/client/Invocation;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "async", "()Ljakarta/ws/rs/client/AsyncInvoker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "accept", "([Ljava/lang/String;)Ljakarta/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "accept", "([Ljakarta/ws/rs/core/MediaType;)Ljakarta/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "acceptLanguage", "([Ljava/util/Locale;)Ljakarta/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "acceptLanguage", "([Ljava/lang/String;)Ljakarta/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "acceptEncoding", "([Ljava/lang/String;)Ljakarta/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cookie", "(Ljakarta/ws/rs/core/Cookie;)Ljakarta/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cookie", "(Ljava/lang/String;Ljava/lang/String;)Ljakarta/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cacheControl", "(Ljakarta/ws/rs/core/CacheControl;)Ljakarta/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "header", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "headers", "(Ljakarta/ws/rs/core/MultivaluedMap;)Ljakarta/ws/rs/client/Invocation$Builder;", "(Ljakarta/ws/rs/core/MultivaluedMap<Ljava/lang/String;Ljava/lang/Object;>;)Ljakarta/ws/rs/client/Invocation$Builder;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "property", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "rx", "()Ljakarta/ws/rs/client/CompletionStageRxInvoker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "rx", "(Ljava/lang/Class;)Ljakarta/ws/rs/client/RxInvoker;", "<T::Ljakarta/ws/rs/client/RxInvoker;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
