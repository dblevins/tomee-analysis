package asm.org.apache.openejb.resource.activemq.jms2;
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
public class TomEEProducer$ProducerAsyncCallbackDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/resource/activemq/jms2/TomEEProducer$ProducerAsyncCallback", null, "java/lang/Object", new String[] { "org/apache/activemq/AsyncCallback" });

classWriter.visitInnerClass("org/apache/openejb/resource/activemq/jms2/TomEEProducer$ProducerAsyncCallback", "org/apache/openejb/resource/activemq/jms2/TomEEProducer", "ProducerAsyncCallback", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/activemq/jms2/TomEEProducer$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "message", "Ljavax/jms/Message;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "completionListener", "Ljavax/jms/CompletionListener;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljavax/jms/Message;Ljavax/jms/CompletionListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/activemq/jms2/TomEEProducer$ProducerAsyncCallback", "message", "Ljavax/jms/Message;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/activemq/jms2/TomEEProducer$ProducerAsyncCallback", "completionListener", "Ljavax/jms/CompletionListener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onSuccess", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/TomEEProducer$ProducerAsyncCallback", "completionListener", "Ljavax/jms/CompletionListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/TomEEProducer$ProducerAsyncCallback", "message", "Ljavax/jms/Message;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/CompletionListener", "onCompletion", "(Ljavax/jms/Message;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onException", "(Ljavax/jms/JMSException;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/TomEEProducer$ProducerAsyncCallback", "completionListener", "Ljavax/jms/CompletionListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/TomEEProducer$ProducerAsyncCallback", "message", "Ljavax/jms/Message;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/CompletionListener", "onException", "(Ljavax/jms/Message;Ljava/lang/Exception;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljavax/jms/Message;Ljavax/jms/CompletionListener;Lorg/apache/openejb/resource/activemq/jms2/TomEEProducer$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/TomEEProducer$ProducerAsyncCallback", "<init>", "(Ljavax/jms/Message;Ljavax/jms/CompletionListener;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
