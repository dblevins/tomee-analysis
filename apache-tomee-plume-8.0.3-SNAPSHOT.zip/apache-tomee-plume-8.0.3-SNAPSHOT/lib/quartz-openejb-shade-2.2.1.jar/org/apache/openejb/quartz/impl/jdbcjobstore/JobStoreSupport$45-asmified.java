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
public class JobStoreSupport$45Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$45", null, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$VoidTransactionCallback", null);

classWriter.visitOuterClass("org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport", "triggeredJobComplete", "(Lorg/apache/openejb/quartz/spi/OperableTrigger;Lorg/apache/openejb/quartz/JobDetail;Lorg/apache/openejb/quartz/Trigger$CompletedExecutionInstruction;)V");

classWriter.visitInnerClass("org/apache/openejb/quartz/Trigger$CompletedExecutionInstruction", "org/apache/openejb/quartz/Trigger", "CompletedExecutionInstruction", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$45", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$VoidTransactionCallback", "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport", "VoidTransactionCallback", ACC_PROTECTED | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$trigger", "Lorg/apache/openejb/quartz/spi/OperableTrigger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$jobDetail", "Lorg/apache/openejb/quartz/JobDetail;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$triggerInstCode", "Lorg/apache/openejb/quartz/Trigger$CompletedExecutionInstruction;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport;Lorg/apache/openejb/quartz/spi/OperableTrigger;Lorg/apache/openejb/quartz/JobDetail;Lorg/apache/openejb/quartz/Trigger$CompletedExecutionInstruction;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$45", "this$0", "Lorg/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$45", "val$trigger", "Lorg/apache/openejb/quartz/spi/OperableTrigger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$45", "val$jobDetail", "Lorg/apache/openejb/quartz/JobDetail;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$45", "val$triggerInstCode", "Lorg/apache/openejb/quartz/Trigger$CompletedExecutionInstruction;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$VoidTransactionCallback", "<init>", "(Lorg/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "executeVoid", "(Ljava/sql/Connection;)V", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$45", "this$0", "Lorg/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$45", "val$trigger", "Lorg/apache/openejb/quartz/spi/OperableTrigger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$45", "val$jobDetail", "Lorg/apache/openejb/quartz/JobDetail;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$45", "val$triggerInstCode", "Lorg/apache/openejb/quartz/Trigger$CompletedExecutionInstruction;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport", "triggeredJobComplete", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/spi/OperableTrigger;Lorg/apache/openejb/quartz/JobDetail;Lorg/apache/openejb/quartz/Trigger$CompletedExecutionInstruction;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
