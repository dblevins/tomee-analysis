package asm.org.apache.openejb.resource.activemq.jms2.cdi;
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
public class JMS2CDIExtension$TransactionAutoContextDestructionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$TransactionAutoContextDestruction", null, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$AutoContextDestruction", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/transaction/TransactionScoped;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$TransactionAutoContextDestruction", "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension", "TransactionAutoContextDestruction", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$AutoContextDestruction", "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension", "AutoContextDestruction", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$AutoContextDestruction", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
