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
public class InvocationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/ws/rs/client/Invocation", null, "java/lang/Object", null);

classWriter.visitInnerClass("javax/ws/rs/client/Invocation$Builder", "javax/ws/rs/client/Invocation", "Builder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "property", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/ws/rs/client/Invocation;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "invoke", "()Ljavax/ws/rs/core/Response;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "invoke", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "invoke", "(Ljavax/ws/rs/core/GenericType;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/core/GenericType<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "submit", "()Ljava/util/concurrent/Future;", "()Ljava/util/concurrent/Future<Ljavax/ws/rs/core/Response;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "submit", "(Ljava/lang/Class;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "submit", "(Ljavax/ws/rs/core/GenericType;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/core/GenericType<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "submit", "(Ljavax/ws/rs/client/InvocationCallback;)Ljava/util/concurrent/Future;", "<T:Ljava/lang/Object;>(Ljavax/ws/rs/client/InvocationCallback<TT;>;)Ljava/util/concurrent/Future<TT;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
