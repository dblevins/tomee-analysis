package asm.javax.xml.ws;
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
public class DispatchDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/xml/ws/Dispatch", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/xml/ws/BindingProvider;", "java/lang/Object", new String[] { "javax/xml/ws/BindingProvider" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TT;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "invokeAsync", "(Ljava/lang/Object;)Ljavax/xml/ws/Response;", "(TT;)Ljavax/xml/ws/Response<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "invokeAsync", "(Ljava/lang/Object;Ljavax/xml/ws/AsyncHandler;)Ljava/util/concurrent/Future;", "(TT;Ljavax/xml/ws/AsyncHandler<TT;>;)Ljava/util/concurrent/Future<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "invokeOneWay", "(Ljava/lang/Object;)V", "(TT;)V", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
