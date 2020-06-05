package asm.org.apache.openejb.resource.jdbc;
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
public class ResettableDataSourceHandler$RetryStrategyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$RetryStrategy", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$Result", "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler", "Result", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$RetryStrategy", "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler", "RetryStrategy", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "shouldRetry", "(Ljava/lang/Throwable;Lorg/apache/openejb/resource/jdbc/ResettableDataSourceHandler$Result;)Lorg/apache/openejb/resource/jdbc/ResettableDataSourceHandler$Result;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}