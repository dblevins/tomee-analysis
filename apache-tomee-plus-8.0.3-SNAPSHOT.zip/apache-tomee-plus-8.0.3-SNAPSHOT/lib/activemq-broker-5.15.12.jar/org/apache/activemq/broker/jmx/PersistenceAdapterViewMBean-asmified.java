package asm.org.apache.activemq.broker.jmx;
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
public class PersistenceAdapterViewMBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/activemq/broker/jmx/PersistenceAdapterViewMBean", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getName", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Name of this persistence adapter.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTransactions", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Inflight transactions.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getData", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Current data.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSize", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Current size.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStatistics", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Statistics related to the PersistentAdapter.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resetStatistics", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Resets statistics.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
