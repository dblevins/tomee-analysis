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
public class JobStoreSupport$TransactionValidatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$TransactionValidator", "<T:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$TransactionValidator", "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport", "TransactionValidator", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "validate", "(Ljava/sql/Connection;Ljava/lang/Object;)Ljava/lang/Boolean;", "(Ljava/sql/Connection;TT;)Ljava/lang/Boolean;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
