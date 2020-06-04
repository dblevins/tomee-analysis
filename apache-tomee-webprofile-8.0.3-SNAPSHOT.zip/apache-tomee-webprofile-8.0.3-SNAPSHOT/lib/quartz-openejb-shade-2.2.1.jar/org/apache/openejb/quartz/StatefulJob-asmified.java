package asm.org.apache.openejb.quartz;
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
public class StatefulJobDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE | ACC_DEPRECATED, "org/apache/openejb/quartz/StatefulJob", null, "java/lang/Object", new String[] { "org/apache/openejb/quartz/Job" });

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/openejb/quartz/PersistJobDataAfterExecution;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/openejb/quartz/DisallowConcurrentExecution;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
