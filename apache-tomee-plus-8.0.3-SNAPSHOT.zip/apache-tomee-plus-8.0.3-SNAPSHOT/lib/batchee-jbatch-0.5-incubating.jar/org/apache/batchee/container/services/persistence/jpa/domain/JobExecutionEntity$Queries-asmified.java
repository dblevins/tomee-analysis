package asm.org.apache.batchee.container.services.persistence.jpa.domain;
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
public class JobExecutionEntity$QueriesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity$Queries", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity$Queries", "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "Queries", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MOST_RECENT", "Ljava/lang/String;", null, "org.apache.batchee.container.services.persistence.jpa.domain.JobExecutionEntity.mostRecent");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FIND_BY_INSTANCE", "Ljava/lang/String;", null, "org.apache.batchee.container.services.persistence.jpa.domain.JobExecutionEntity.findByInstance");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FIND_RUNNING", "Ljava/lang/String;", null, "org.apache.batchee.container.services.persistence.jpa.domain.JobExecutionEntity.findRunning");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_BY_INSTANCE_ID", "Ljava/lang/String;", null, "org.apache.batchee.container.services.persistence.jpa.domain.JobExecutionEntity.deleteByInstanceId");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_BY_DATE", "Ljava/lang/String;", null, "org.apache.batchee.container.services.persistence.jpa.domain.JobExecutionEntity.deleteByDate");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RUNNING_STATUSES", "Ljava/util/List;", "Ljava/util/List<Ljavax/batch/runtime/BatchStatus;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/batch/runtime/BatchStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/BatchStatus", "STARTED", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/BatchStatus", "STARTING", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/BatchStatus", "STOPPING", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity$Queries", "RUNNING_STATUSES", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
