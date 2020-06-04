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
public class VirtualDestinationSelectorCacheViewMBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/activemq/broker/jmx/VirtualDestinationSelectorCacheViewMBean", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectorsForDestination", "(Ljava/lang/String;)Ljava/util/Set;", "(Ljava/lang/String;)Ljava/util/Set<Ljava/lang/String;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Dump raw cache of selectors organized by destination");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteSelectorForDestination", "(Ljava/lang/String;Ljava/lang/String;)Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Delete a selector for a destination. Selector must match what returns from selectorsForDestination operation");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteAllSelectorsForDestination", "(Ljava/lang/String;)Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Dump raw cache of selectors organized by destination");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
