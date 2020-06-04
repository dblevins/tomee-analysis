package asm.org.apache.activemq.ra;
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
public class MessageEndpointProxy$MessageEndpointAliveDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointAlive", null, "org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState", null);

classWriter.visitInnerClass("org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointAlive", "org/apache/activemq/ra/MessageEndpointProxy", "MessageEndpointAlive", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/ra/MessageEndpointProxy$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState", "org/apache/activemq/ra/MessageEndpointProxy", "MessageEndpointState", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState", "<init>", "(Lorg/apache/activemq/ra/MessageEndpointProxy$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeDelivery", "(Lorg/apache/activemq/ra/MessageEndpointProxy;Ljava/lang/reflect/Method;)V", null, new String[] { "java/lang/NoSuchMethodException", "jakarta/resource/ResourceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchMethodException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "jakarta/resource/ResourceException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "access$400", "(Lorg/apache/activemq/ra/MessageEndpointProxy;)Ljakarta/resource/spi/endpoint/MessageEndpoint;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/resource/spi/endpoint/MessageEndpoint", "beforeDelivery", "(Ljava/lang/reflect/Method;)V", true);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchMethodException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "access$500", "()Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointAlive", "transition", "(Lorg/apache/activemq/ra/MessageEndpointProxy;Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/resource/ResourceException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "access$500", "()Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointAlive", "transition", "(Lorg/apache/activemq/ra/MessageEndpointProxy;Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onMessage", "(Lorg/apache/activemq/ra/MessageEndpointProxy;Ljakarta/jms/Message;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "access$600", "(Lorg/apache/activemq/ra/MessageEndpointProxy;)Ljakarta/jms/MessageListener;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/MessageListener", "onMessage", "(Ljakarta/jms/Message;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterDelivery", "(Lorg/apache/activemq/ra/MessageEndpointProxy;)V", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/resource/ResourceException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "access$400", "(Lorg/apache/activemq/ra/MessageEndpointProxy;)Ljakarta/resource/spi/endpoint/MessageEndpoint;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/resource/spi/endpoint/MessageEndpoint", "afterDelivery", "()V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/resource/ResourceException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "access$500", "()Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointAlive", "transition", "(Lorg/apache/activemq/ra/MessageEndpointProxy;Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "release", "(Lorg/apache/activemq/ra/MessageEndpointProxy;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "access$500", "()Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointAlive", "transition", "(Lorg/apache/activemq/ra/MessageEndpointProxy;Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/activemq/ra/MessageEndpointProxy$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointAlive", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
