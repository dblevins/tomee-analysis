package asm.javax.resource.spi.work;
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
public class WorkManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/resource/spi/work/WorkManager", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IMMEDIATE", "J", null, new Long(0L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INDEFINITE", "J", null, new Long(9223372036854775807L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNKNOWN", "J", null, new Long(-1L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doWork", "(Ljavax/resource/spi/work/Work;)V", null, new String[] { "javax/resource/spi/work/WorkException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doWork", "(Ljavax/resource/spi/work/Work;JLjavax/resource/spi/work/ExecutionContext;Ljavax/resource/spi/work/WorkListener;)V", null, new String[] { "javax/resource/spi/work/WorkException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "startWork", "(Ljavax/resource/spi/work/Work;)J", null, new String[] { "javax/resource/spi/work/WorkException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "startWork", "(Ljavax/resource/spi/work/Work;JLjavax/resource/spi/work/ExecutionContext;Ljavax/resource/spi/work/WorkListener;)J", null, new String[] { "javax/resource/spi/work/WorkException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scheduleWork", "(Ljavax/resource/spi/work/Work;)V", null, new String[] { "javax/resource/spi/work/WorkException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scheduleWork", "(Ljavax/resource/spi/work/Work;JLjavax/resource/spi/work/ExecutionContext;Ljavax/resource/spi/work/WorkListener;)V", null, new String[] { "javax/resource/spi/work/WorkException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
