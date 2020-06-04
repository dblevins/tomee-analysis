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
public class TriggerPersistenceDelegateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate$TriggerPropertyBundle", "org/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate", "TriggerPropertyBundle", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "initialize", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "canHandleTriggerType", "(Lorg/apache/openejb/quartz/spi/OperableTrigger;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getHandledTriggerTypeDiscriminator", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "insertExtendedTriggerProperties", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/spi/OperableTrigger;Ljava/lang/String;Lorg/apache/openejb/quartz/JobDetail;)I", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateExtendedTriggerProperties", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/spi/OperableTrigger;Ljava/lang/String;Lorg/apache/openejb/quartz/JobDetail;)I", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteExtendedTriggerProperties", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/TriggerKey;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "loadExtendedTriggerProperties", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/TriggerKey;)Lorg/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate$TriggerPropertyBundle;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
