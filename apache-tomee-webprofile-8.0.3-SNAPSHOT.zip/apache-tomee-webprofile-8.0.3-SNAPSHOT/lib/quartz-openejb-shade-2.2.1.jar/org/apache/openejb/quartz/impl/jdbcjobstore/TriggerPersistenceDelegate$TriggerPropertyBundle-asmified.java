package asm.org.apache.openejb.quartz.impl.jdbcjobstore;
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
public class TriggerPersistenceDelegate$TriggerPropertyBundleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate$TriggerPropertyBundle", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate$TriggerPropertyBundle", "org/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate", "TriggerPropertyBundle", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sb", "Lorg/apache/openejb/quartz/ScheduleBuilder;", "Lorg/apache/openejb/quartz/ScheduleBuilder<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "statePropertyNames", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "statePropertyValues", "[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/quartz/ScheduleBuilder;[Ljava/lang/String;[Ljava/lang/Object;)V", "(Lorg/apache/openejb/quartz/ScheduleBuilder<*>;[Ljava/lang/String;[Ljava/lang/Object;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate$TriggerPropertyBundle", "sb", "Lorg/apache/openejb/quartz/ScheduleBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate$TriggerPropertyBundle", "statePropertyNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate$TriggerPropertyBundle", "statePropertyValues", "[Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getScheduleBuilder", "()Lorg/apache/openejb/quartz/ScheduleBuilder;", "()Lorg/apache/openejb/quartz/ScheduleBuilder<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate$TriggerPropertyBundle", "sb", "Lorg/apache/openejb/quartz/ScheduleBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStatePropertyNames", "()[Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate$TriggerPropertyBundle", "statePropertyNames", "[Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStatePropertyValues", "()[Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate$TriggerPropertyBundle", "statePropertyValues", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
