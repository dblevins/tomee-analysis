package asm.javax.enterprise.event;
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
public class EventDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/enterprise/event/Event", "<T:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fire", "(Ljava/lang/Object;)V", "(TT;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fireAsync", "(Ljava/lang/Object;)Ljava/util/concurrent/CompletionStage;", "<U:TT;>(TU;)Ljava/util/concurrent/CompletionStage<TU;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fireAsync", "(Ljava/lang/Object;Ljavax/enterprise/event/NotificationOptions;)Ljava/util/concurrent/CompletionStage;", "<U:TT;>(TU;Ljavax/enterprise/event/NotificationOptions;)Ljava/util/concurrent/CompletionStage<TU;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "select", "([Ljava/lang/annotation/Annotation;)Ljavax/enterprise/event/Event;", "([Ljava/lang/annotation/Annotation;)Ljavax/enterprise/event/Event<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "select", "(Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)Ljavax/enterprise/event/Event;", "<U:TT;>(Ljava/lang/Class<TU;>;[Ljava/lang/annotation/Annotation;)Ljavax/enterprise/event/Event<TU;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "select", "(Ljavax/enterprise/util/TypeLiteral;[Ljava/lang/annotation/Annotation;)Ljavax/enterprise/event/Event;", "<U:TT;>(Ljavax/enterprise/util/TypeLiteral<TU;>;[Ljava/lang/annotation/Annotation;)Ljavax/enterprise/event/Event<TU;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
