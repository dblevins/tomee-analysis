package asm.org.apache.commons.jcs.jcache.jmx;
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
public class ConfigurableMBeanServerIdBuilder$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER | ACC_SYNTHETIC, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$1", null, "java/lang/Object", null);

classWriter.visitOuterClass("org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder", null, null);

classWriter.visitInnerClass("org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$1", "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitEnd();

return classWriter.toByteArray();
}
}
