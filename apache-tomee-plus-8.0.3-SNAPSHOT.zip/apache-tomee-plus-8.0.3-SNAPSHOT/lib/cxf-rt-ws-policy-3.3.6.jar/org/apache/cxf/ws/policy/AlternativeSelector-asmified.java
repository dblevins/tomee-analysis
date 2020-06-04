package asm.org.apache.cxf.ws.policy;
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
public class AlternativeSelectorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/cxf/ws/policy/AlternativeSelector", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectAlternative", "(Lorg/apache/neethi/Policy;Lorg/apache/cxf/ws/policy/PolicyEngine;Lorg/apache/cxf/ws/policy/Assertor;Ljava/util/List;Lorg/apache/cxf/message/Message;)Ljava/util/Collection;", "(Lorg/apache/neethi/Policy;Lorg/apache/cxf/ws/policy/PolicyEngine;Lorg/apache/cxf/ws/policy/Assertor;Ljava/util/List<Ljava/util/List<Lorg/apache/neethi/Assertion;>;>;Lorg/apache/cxf/message/Message;)Ljava/util/Collection<Lorg/apache/neethi/Assertion;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
