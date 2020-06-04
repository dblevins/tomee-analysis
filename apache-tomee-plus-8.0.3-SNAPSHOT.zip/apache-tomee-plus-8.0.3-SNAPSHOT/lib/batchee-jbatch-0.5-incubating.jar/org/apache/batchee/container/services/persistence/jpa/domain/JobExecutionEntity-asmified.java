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
public class JobExecutionEntityDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/persistence/Entity;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/persistence/NamedQueries;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljavax/persistence/NamedQuery;");
annotationVisitor2.visit("name", "org.apache.batchee.container.services.persistence.jpa.domain.JobExecutionEntity.mostRecent");
annotationVisitor2.visit("query", "SELECT e FROM JobExecutionEntity e WHERE e.instance.jobInstanceId = :instanceId ORDER BY e.createTime DESC");
annotationVisitor2.visitEnd();
}
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljavax/persistence/NamedQuery;");
annotationVisitor2.visit("name", "org.apache.batchee.container.services.persistence.jpa.domain.JobExecutionEntity.findByInstance");
annotationVisitor2.visit("query", "SELECT e FROM JobExecutionEntity e WHERE e.instance.jobInstanceId = :instanceId");
annotationVisitor2.visitEnd();
}
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljavax/persistence/NamedQuery;");
annotationVisitor2.visit("name", "org.apache.batchee.container.services.persistence.jpa.domain.JobExecutionEntity.deleteByInstanceId");
annotationVisitor2.visit("query", "delete from JobExecutionEntity e where e.instance.jobInstanceId = :instanceId");
annotationVisitor2.visitEnd();
}
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljavax/persistence/NamedQuery;");
annotationVisitor2.visit("name", "org.apache.batchee.container.services.persistence.jpa.domain.JobExecutionEntity.deleteByDate");
annotationVisitor2.visit("query", "delete from JobExecutionEntity e where e.endTime < :date");
annotationVisitor2.visitEnd();
}
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljavax/persistence/NamedQuery;");
annotationVisitor2.visit("name", "org.apache.batchee.container.services.persistence.jpa.domain.JobExecutionEntity.findRunning");
annotationVisitor2.visit("query", "SELECT e FROM JobExecutionEntity e WHERE e.batchStatus in :statuses and e.instance.name = :name");
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/persistence/Table;", true);
annotationVisitor0.visit("name", "BATCH_JOBEXECUTION");
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity$Queries", "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "Queries", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_NAME", "Ljava/lang/String;", null, "BATCH_JOBEXECUTION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "executionId", "J", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/persistence/Id;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/persistence/GeneratedValue;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "createTime", "Ljava/sql/Timestamp;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "startTime", "Ljava/sql/Timestamp;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "endTime", "Ljava/sql/Timestamp;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "updateTime", "Ljava/sql/Timestamp;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "batchStatus", "Ljavax/batch/runtime/BatchStatus;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/persistence/Enumerated;", true);
annotationVisitor0.visitEnum("value", "Ljavax/persistence/EnumType;", "STRING");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "exitStatus", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jobProperties", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/persistence/Lob;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "instance", "Lorg/apache/batchee/container/services/persistence/jpa/domain/JobInstanceEntity;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/persistence/ManyToOne;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExecutionId", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "executionId", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCreateTime", "()Ljava/sql/Timestamp;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "createTime", "Ljava/sql/Timestamp;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCreateTime", "(Ljava/sql/Timestamp;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "createTime", "Ljava/sql/Timestamp;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStartTime", "()Ljava/sql/Timestamp;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "startTime", "Ljava/sql/Timestamp;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setStartTime", "(Ljava/sql/Timestamp;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "startTime", "Ljava/sql/Timestamp;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEndTime", "()Ljava/sql/Timestamp;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "endTime", "Ljava/sql/Timestamp;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEndTime", "(Ljava/sql/Timestamp;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "endTime", "Ljava/sql/Timestamp;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUpdateTime", "()Ljava/sql/Timestamp;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "updateTime", "Ljava/sql/Timestamp;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUpdateTime", "(Ljava/sql/Timestamp;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "updateTime", "Ljava/sql/Timestamp;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBatchStatus", "()Ljavax/batch/runtime/BatchStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "batchStatus", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBatchStatus", "(Ljavax/batch/runtime/BatchStatus;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "batchStatus", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExitStatus", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "exitStatus", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExitStatus", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "exitStatus", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJobProperties", "()Ljava/util/Properties;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "jobProperties", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/services/persistence/jpa/domain/PropertyHelper", "stringToProperties", "(Ljava/lang/String;)Ljava/util/Properties;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJobProperties", "(Ljava/util/Properties;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/services/persistence/jpa/domain/PropertyHelper", "propertiesToString", "(Ljava/util/Properties;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "jobProperties", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInstance", "()Lorg/apache/batchee/container/services/persistence/jpa/domain/JobInstanceEntity;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "instance", "Lorg/apache/batchee/container/services/persistence/jpa/domain/JobInstanceEntity;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInstance", "(Lorg/apache/batchee/container/services/persistence/jpa/domain/JobInstanceEntity;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/JobExecutionEntity", "instance", "Lorg/apache/batchee/container/services/persistence/jpa/domain/JobInstanceEntity;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
