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
public class CheckpointEntityDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/services/persistence/jpa/domain/CheckpointEntity", null, "java/lang/Object", null);

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
annotationVisitor2.visit("name", "org.apache.batchee.container.services.persistence.jpa.domain.CheckpointEntity.find");
annotationVisitor2.visit("query", "select c from CheckpointEntity c where c.instance.jobInstanceId = :jobInstanceId and c.stepName = :stepName and c.type = :type");
annotationVisitor2.visitEnd();
}
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljavax/persistence/NamedQuery;");
annotationVisitor2.visit("name", "org.apache.batchee.container.services.persistence.jpa.domain.CheckpointEntity.deleteByInstanceId");
annotationVisitor2.visit("query", "delete from CheckpointEntity e where e.instance.jobInstanceId = :id");
annotationVisitor2.visitEnd();
}
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljavax/persistence/NamedQuery;");
annotationVisitor2.visit("name", "org.apache.batchee.container.services.persistence.jpa.domain.CheckpointEntity.deleteBydate");
annotationVisitor2.visit("query", "delete from CheckpointEntity e where (select max(x.endTime) from JobExecutionEntity x where x.instance.jobInstanceId = e.instance.jobInstanceId) < :date");
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/persistence/Table;", true);
annotationVisitor0.visit("name", "BATCH_CHECKPOINT");
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/batchee/container/services/persistence/jpa/domain/CheckpointEntity$Queries", "org/apache/batchee/container/services/persistence/jpa/domain/CheckpointEntity", "Queries", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_NAME", "Ljava/lang/String;", null, "BATCH_CHECKPOINT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "id", "Ljava/lang/String;", null, null);
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
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "stepName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "type", "Lorg/apache/batchee/container/impl/controller/chunk/CheckpointType;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/persistence/Enumerated;", true);
annotationVisitor0.visitEnum("value", "Ljavax/persistence/EnumType;", "STRING");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "data", "[B", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/CheckpointEntity", "id", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStepName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/CheckpointEntity", "stepName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setStepName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/CheckpointEntity", "stepName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Lorg/apache/batchee/container/impl/controller/chunk/CheckpointType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/CheckpointEntity", "type", "Lorg/apache/batchee/container/impl/controller/chunk/CheckpointType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setType", "(Lorg/apache/batchee/container/impl/controller/chunk/CheckpointType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/CheckpointEntity", "type", "Lorg/apache/batchee/container/impl/controller/chunk/CheckpointType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getData", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/CheckpointEntity", "data", "[B");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setData", "([B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/CheckpointEntity", "data", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInstance", "()Lorg/apache/batchee/container/services/persistence/jpa/domain/JobInstanceEntity;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/CheckpointEntity", "instance", "Lorg/apache/batchee/container/services/persistence/jpa/domain/JobInstanceEntity;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInstance", "(Lorg/apache/batchee/container/services/persistence/jpa/domain/JobInstanceEntity;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/jpa/domain/CheckpointEntity", "instance", "Lorg/apache/batchee/container/services/persistence/jpa/domain/JobInstanceEntity;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
