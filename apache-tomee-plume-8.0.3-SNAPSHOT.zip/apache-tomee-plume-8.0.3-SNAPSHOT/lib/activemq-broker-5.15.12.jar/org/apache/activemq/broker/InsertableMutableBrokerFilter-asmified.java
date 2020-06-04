package asm.org.apache.activemq.broker;
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
public class InsertableMutableBrokerFilterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/broker/InsertableMutableBrokerFilter", null, "org/apache/activemq/broker/MutableBrokerFilter", null);

{
fieldVisitor = classWriter.visitField(0, "parent", "Lorg/apache/activemq/broker/MutableBrokerFilter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/broker/MutableBrokerFilter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/MutableBrokerFilter", "getNext", "()Lorg/apache/activemq/broker/Broker;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/MutableBrokerFilter", "<init>", "(Lorg/apache/activemq/broker/Broker;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/InsertableMutableBrokerFilter", "parent", "Lorg/apache/activemq/broker/MutableBrokerFilter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/MutableBrokerFilter", "setNext", "(Lorg/apache/activemq/broker/Broker;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/InsertableMutableBrokerFilter", "parent", "Lorg/apache/activemq/broker/MutableBrokerFilter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/InsertableMutableBrokerFilter", "getNext", "()Lorg/apache/activemq/broker/Broker;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/MutableBrokerFilter", "setNext", "(Lorg/apache/activemq/broker/Broker;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
