package asm.javax.enterprise.concurrent;
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
public class ManagedScheduledExecutorServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/enterprise/concurrent/ManagedScheduledExecutorService", null, "java/lang/Object", new String[] { "javax/enterprise/concurrent/ManagedExecutorService", "java/util/concurrent/ScheduledExecutorService" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "schedule", "(Ljava/lang/Runnable;Ljavax/enterprise/concurrent/Trigger;)Ljava/util/concurrent/ScheduledFuture;", "(Ljava/lang/Runnable;Ljavax/enterprise/concurrent/Trigger;)Ljava/util/concurrent/ScheduledFuture<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "schedule", "(Ljava/util/concurrent/Callable;Ljavax/enterprise/concurrent/Trigger;)Ljava/util/concurrent/ScheduledFuture;", "<V:Ljava/lang/Object;>(Ljava/util/concurrent/Callable<TV;>;Ljavax/enterprise/concurrent/Trigger;)Ljava/util/concurrent/ScheduledFuture<TV;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
