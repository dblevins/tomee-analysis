package asm.org.apache.openejb.resource.jdbc.router;
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
public class FailOverRouter$StrategyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/resource/jdbc/router/FailOverRouter$Strategy", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/router/FailOverRouter$DataSourceHolder", "org/apache/openejb/resource/jdbc/router/FailOverRouter", "DataSourceHolder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/router/FailOverRouter$Strategy", "org/apache/openejb/resource/jdbc/router/FailOverRouter", "Strategy", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "prepare", "(Ljava/util/Collection;)Ljava/util/Collection;", "(Ljava/util/Collection<Lorg/apache/openejb/resource/jdbc/router/FailOverRouter$DataSourceHolder;>;)Ljava/util/Collection<Lorg/apache/openejb/resource/jdbc/router/FailOverRouter$DataSourceHolder;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "used", "(Lorg/apache/openejb/resource/jdbc/router/FailOverRouter$DataSourceHolder;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
