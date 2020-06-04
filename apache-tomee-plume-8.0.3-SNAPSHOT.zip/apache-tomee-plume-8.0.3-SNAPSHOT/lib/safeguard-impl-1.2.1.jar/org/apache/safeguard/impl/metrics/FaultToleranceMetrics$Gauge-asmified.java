package asm.org.apache.safeguard.impl.metrics;
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
public class FaultToleranceMetrics$GaugeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Gauge", "Ljava/lang/Object;Ljava/util/function/Supplier<Ljava/lang/Long;>;", "java/lang/Object", new String[] { "java/util/function/Supplier" });

classWriter.visitInnerClass("org/apache/safeguard/impl/metrics/FaultToleranceMetrics$Gauge", "org/apache/safeguard/impl/metrics/FaultToleranceMetrics", "Gauge", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitEnd();

return classWriter.toByteArray();
}
}
