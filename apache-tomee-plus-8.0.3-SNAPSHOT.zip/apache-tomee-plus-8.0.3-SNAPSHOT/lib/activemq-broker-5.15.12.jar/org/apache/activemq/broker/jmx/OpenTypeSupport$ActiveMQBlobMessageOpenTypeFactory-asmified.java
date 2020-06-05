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
public class OpenTypeSupport$ActiveMQBlobMessageOpenTypeFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/broker/jmx/OpenTypeSupport$ActiveMQBlobMessageOpenTypeFactory", null, "org/apache/activemq/broker/jmx/OpenTypeSupport$MessageOpenTypeFactory", null);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/OpenTypeSupport$ActiveMQBlobMessageOpenTypeFactory", "org/apache/activemq/broker/jmx/OpenTypeSupport", "ActiveMQBlobMessageOpenTypeFactory", ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/OpenTypeSupport$MessageOpenTypeFactory", "org/apache/activemq/broker/jmx/OpenTypeSupport", "MessageOpenTypeFactory", ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$MessageOpenTypeFactory", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getTypeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/command/ActiveMQBlobMessage;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "init", "()V", null, new String[] { "javax/management/openmbean/OpenDataException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$MessageOpenTypeFactory", "init", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Url");
methodVisitor.visitLdcInsn("Body Url");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/management/openmbean/SimpleType", "STRING", "Ljavax/management/openmbean/SimpleType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$ActiveMQBlobMessageOpenTypeFactory", "addItem", "(Ljava/lang/String;Ljava/lang/String;Ljavax/management/openmbean/OpenType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFields", "(Ljava/lang/Object;)Ljava/util/Map;", "(Ljava/lang/Object;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", new String[] { "javax/management/openmbean/OpenDataException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/jms/JMSException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ActiveMQBlobMessage");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$MessageOpenTypeFactory", "getFields", "(Ljava/lang/Object;)Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("Url");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQBlobMessage", "getURL", "()Ljava/net/URL;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/activemq/broker/jmx/OpenTypeSupport$ActiveMQBlobMessageOpenTypeFactory", "java/lang/Object", "org/apache/activemq/command/ActiveMQBlobMessage", "java/util/Map"}, 1, new Object[] {"jakarta/jms/JMSException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("Url");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
