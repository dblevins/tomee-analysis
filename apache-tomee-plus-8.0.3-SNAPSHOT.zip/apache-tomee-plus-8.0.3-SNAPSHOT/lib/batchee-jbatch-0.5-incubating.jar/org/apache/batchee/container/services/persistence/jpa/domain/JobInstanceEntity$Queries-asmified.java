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
public class JobInstanceEntity$QueriesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/batchee/container/services/persistence/jpa/domain/JobInstanceEntity$Queries", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/batchee/container/services/persistence/jpa/domain/JobInstanceEntity$Queries", "org/apache/batchee/container/services/persistence/jpa/domain/JobInstanceEntity", "Queries", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COUNT_BY_NAME", "Ljava/lang/String;", null, "org.apache.batchee.container.services.persistence.jpa.domain.JobInstanceEntity.countByName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FIND_BY_NAME", "Ljava/lang/String;", null, "org.apache.batchee.container.services.persistence.jpa.domain.JobInstanceEntity.findByName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FIND_EXTERNALS", "Ljava/lang/String;", null, "org.apache.batchee.container.services.persistence.jpa.domain.JobInstanceEntity.findExternals");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FIND_JOBNAMES", "Ljava/lang/String;", null, "org.apache.batchee.container.services.persistence.jpa.domain.JobInstanceEntity.findJobNames");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FIND_FROM_EXECUTION", "Ljava/lang/String;", null, "org.apache.batchee.container.services.persistence.jpa.domain.JobInstanceEntity.findByExecution");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_BY_INSTANCE_ID", "Ljava/lang/String;", null, "org.apache.batchee.container.services.persistence.jpa.domain.JobInstanceEntity.deleteFromInstanceId");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_BY_DATE", "Ljava/lang/String;", null, "org.apache.batchee.container.services.persistence.jpa.domain.JobInstanceEntity.deleteByDate");
fieldVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
