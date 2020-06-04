package asm.org.apache.activemq.filter;
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
public class PropertyExpressionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/filter/PropertyExpression", null, "java/lang/Object", new String[] { "org/apache/activemq/filter/Expression" });

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$SubExpression", "org/apache/activemq/filter/PropertyExpression", "SubExpression", ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$19", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$18", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$17", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$16", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$15", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$14", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$13", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$12", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$11", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$10", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$9", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$8", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$7", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$6", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$5", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$4", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$3", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$2", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/filter/PropertyExpression$1", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/apache/activemq/filter/PropertyExpression$SubExpression;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "jmsPropertyExpression", "Lorg/apache/activemq/filter/PropertyExpression$SubExpression;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/filter/PropertyExpression", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/filter/PropertyExpression$SubExpression");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/filter/PropertyExpression", "jmsPropertyExpression", "Lorg/apache/activemq/filter/PropertyExpression$SubExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "(Lorg/apache/activemq/filter/MessageEvaluationContext;)Ljava/lang/Object;", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/io/IOException");
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label5, "java/io/IOException");
methodVisitor.visitTryCatchBlock(label0, label1, label5, "java/io/IOException");
methodVisitor.visitTryCatchBlock(label2, label5, label5, "java/io/IOException");
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/filter/MessageEvaluationContext", "isDropped", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/filter/PropertyExpression", "jmsPropertyExpression", "Lorg/apache/activemq/filter/PropertyExpression$SubExpression;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/filter/PropertyExpression", "jmsPropertyExpression", "Lorg/apache/activemq/filter/PropertyExpression$SubExpression;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/filter/MessageEvaluationContext", "getMessage", "()Lorg/apache/activemq/command/Message;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/filter/PropertyExpression$SubExpression", "evaluate", "(Lorg/apache/activemq/command/Message;)Ljava/lang/Object;", true);
methodVisitor.visitLabel(label7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/filter/MessageEvaluationContext", "getMessage", "()Lorg/apache/activemq/command/Message;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/filter/PropertyExpression", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Could not get property: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/filter/PropertyExpression", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" reason: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/IOException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/JMSExceptionSupport", "create", "(Ljava/lang/String;Ljava/lang/Exception;)Ljakarta/jms/JMSException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/JMSExceptionSupport", "create", "(Ljava/lang/Exception;)Ljakarta/jms/JMSException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "(Lorg/apache/activemq/command/Message;)Ljava/lang/Object;", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/filter/PropertyExpression", "jmsPropertyExpression", "Lorg/apache/activemq/filter/PropertyExpression$SubExpression;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/filter/PropertyExpression", "jmsPropertyExpression", "Lorg/apache/activemq/filter/PropertyExpression$SubExpression;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/filter/PropertyExpression$SubExpression", "evaluate", "(Lorg/apache/activemq/command/Message;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/filter/PropertyExpression", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/JMSExceptionSupport", "create", "(Ljava/lang/Exception;)Ljakarta/jms/JMSException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/filter/PropertyExpression", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/filter/PropertyExpression", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/filter/PropertyExpression", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/filter/PropertyExpression", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/filter/PropertyExpression");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/filter/PropertyExpression", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSDestination");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$1", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSReplyTo");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$2", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSType");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$3", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSDeliveryMode");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$4", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSPriority");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$5");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$5", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSMessageID");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$6");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$6", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSTimestamp");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$7");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$7", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSCorrelationID");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$8");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$8", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSExpiration");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$9");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$9", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSRedelivered");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$10");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$10", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSXDeliveryCount");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$11");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$11", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSXGroupID");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$12");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$12", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSXUserID");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$13");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$13", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSXGroupSeq");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$14");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$14", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSXProducerTXID");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$15");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$15", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSActiveMQBrokerInTime");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$16");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$16", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSActiveMQBrokerOutTime");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$17");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$17", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSActiveMQBrokerPath");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$18");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$18", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/filter/PropertyExpression", "JMS_PROPERTY_EXPRESSIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("JMSXGroupFirstForConsumer");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/PropertyExpression$19");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/PropertyExpression$19", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
