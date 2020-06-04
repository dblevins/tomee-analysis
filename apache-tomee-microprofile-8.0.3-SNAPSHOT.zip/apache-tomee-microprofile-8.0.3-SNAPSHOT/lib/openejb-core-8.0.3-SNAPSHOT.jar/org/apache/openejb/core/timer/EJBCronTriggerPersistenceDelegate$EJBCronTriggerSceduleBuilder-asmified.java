package asm.org.apache.openejb.core.timer;
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
public class EJBCronTriggerPersistenceDelegate$EJBCronTriggerSceduleBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/core/timer/EJBCronTriggerPersistenceDelegate$EJBCronTriggerSceduleBuilder", "Lorg/apache/openejb/quartz/ScheduleBuilder<Lorg/apache/openejb/core/timer/EJBCronTrigger;>;", "org/apache/openejb/quartz/ScheduleBuilder", null);

classWriter.visitInnerClass("org/apache/openejb/core/timer/EJBCronTriggerPersistenceDelegate$EJBCronTriggerSceduleBuilder", "org/apache/openejb/core/timer/EJBCronTriggerPersistenceDelegate", "EJBCronTriggerSceduleBuilder", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "trigger", "Lorg/apache/openejb/core/timer/EJBCronTrigger;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/core/timer/EJBCronTrigger;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/ScheduleBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/timer/EJBCronTriggerPersistenceDelegate$EJBCronTriggerSceduleBuilder", "trigger", "Lorg/apache/openejb/core/timer/EJBCronTrigger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "build", "()Lorg/apache/openejb/quartz/spi/MutableTrigger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/EJBCronTriggerPersistenceDelegate$EJBCronTriggerSceduleBuilder", "trigger", "Lorg/apache/openejb/core/timer/EJBCronTrigger;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
