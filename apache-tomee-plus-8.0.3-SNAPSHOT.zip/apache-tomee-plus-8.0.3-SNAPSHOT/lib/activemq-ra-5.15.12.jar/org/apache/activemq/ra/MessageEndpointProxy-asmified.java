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
public class MessageEndpointProxyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/ra/MessageEndpointProxy", null, "java/lang/Object", new String[] { "javax/jms/MessageListener", "javax/resource/spi/endpoint/MessageEndpoint" });

classWriter.visitInnerClass("org/apache/activemq/ra/MessageEndpointProxy$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointDead", "org/apache/activemq/ra/MessageEndpointProxy", "MessageEndpointDead", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointAlive", "org/apache/activemq/ra/MessageEndpointProxy", "MessageEndpointAlive", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState", "org/apache/activemq/ra/MessageEndpointProxy", "MessageEndpointState", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ALIVE", "Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEAD", "Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "proxyCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "proxyID", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "endpoint", "Ljavax/resource/spi/endpoint/MessageEndpoint;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "messageListener", "Ljavax/jms/MessageListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "state", "Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/resource/spi/endpoint/MessageEndpoint;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "ALIVE", "Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/ra/MessageEndpointProxy", "state", "Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/jms/MessageListener");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MessageEndpoint is not a MessageListener");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/activemq/ra/MessageEndpointProxy", "javax/resource/spi/endpoint/MessageEndpoint"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/jms/MessageListener");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/ra/MessageEndpointProxy", "messageListener", "Ljavax/jms/MessageListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "getID", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/ra/MessageEndpointProxy", "proxyID", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/ra/MessageEndpointProxy", "endpoint", "Ljavax/resource/spi/endpoint/MessageEndpoint;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getID", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "proxyCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "proxyCount", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeDelivery", "(Ljava/lang/reflect/Method;)V", null, new String[] { "java/lang/NoSuchMethodException", "javax/resource/ResourceException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Invoking MessageEndpoint.beforeDelivery()");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "trace", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/MessageEndpointProxy", "state", "Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState", "beforeDelivery", "(Lorg/apache/activemq/ra/MessageEndpointProxy;Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onMessage", "(Ljavax/jms/Message;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Invoking MessageEndpoint.onMethod()");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "trace", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/MessageEndpointProxy", "state", "Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState", "onMessage", "(Lorg/apache/activemq/ra/MessageEndpointProxy;Ljavax/jms/Message;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterDelivery", "()V", null, new String[] { "javax/resource/ResourceException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Invoking MessageEndpoint.afterDelivery()");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "trace", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/MessageEndpointProxy", "state", "Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState", "afterDelivery", "(Lorg/apache/activemq/ra/MessageEndpointProxy;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "release", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Invoking MessageEndpoint.release()");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "trace", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/MessageEndpointProxy", "state", "Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState", "release", "(Lorg/apache/activemq/ra/MessageEndpointProxy;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("MessageEndpointProxy{ proxyID: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/MessageEndpointProxy", "proxyID", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(", endpoint: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/MessageEndpointProxy", "endpoint", "Ljavax/resource/spi/endpoint/MessageEndpoint;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" }");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$202", "(Lorg/apache/activemq/ra/MessageEndpointProxy;Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;)Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/ra/MessageEndpointProxy", "state", "Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/activemq/ra/MessageEndpointProxy;)Ljavax/resource/spi/endpoint/MessageEndpoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/MessageEndpointProxy", "endpoint", "Ljavax/resource/spi/endpoint/MessageEndpoint;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "()Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "DEAD", "Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lorg/apache/activemq/ra/MessageEndpointProxy;)Ljavax/jms/MessageListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/MessageEndpointProxy", "messageListener", "Ljavax/jms/MessageListener;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointAlive");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointAlive", "<init>", "(Lorg/apache/activemq/ra/MessageEndpointProxy$1;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "ALIVE", "Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointDead");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/ra/MessageEndpointProxy$MessageEndpointDead", "<init>", "(Lorg/apache/activemq/ra/MessageEndpointProxy$1;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "DEAD", "Lorg/apache/activemq/ra/MessageEndpointProxy$MessageEndpointState;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/ra/MessageEndpointProxy;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/ra/MessageEndpointProxy", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
