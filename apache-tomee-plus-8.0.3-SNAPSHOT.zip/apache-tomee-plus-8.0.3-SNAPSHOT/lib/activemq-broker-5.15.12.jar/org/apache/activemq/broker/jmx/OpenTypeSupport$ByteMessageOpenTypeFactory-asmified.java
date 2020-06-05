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
public class OpenTypeSupport$ByteMessageOpenTypeFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/broker/jmx/OpenTypeSupport$ByteMessageOpenTypeFactory", null, "org/apache/activemq/broker/jmx/OpenTypeSupport$MessageOpenTypeFactory", null);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/OpenTypeSupport$ByteMessageOpenTypeFactory", "org/apache/activemq/broker/jmx/OpenTypeSupport", "ByteMessageOpenTypeFactory", ACC_STATIC);

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
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/command/ActiveMQBytesMessage;"));
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
methodVisitor.visitLdcInsn("BodyLength");
methodVisitor.visitLdcInsn("Body length");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/management/openmbean/SimpleType", "LONG", "Ljavax/management/openmbean/SimpleType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$ByteMessageOpenTypeFactory", "addItem", "(Ljava/lang/String;Ljava/lang/String;Ljavax/management/openmbean/OpenType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("BodyPreview");
methodVisitor.visitLdcInsn("Body preview");
methodVisitor.visitTypeInsn(NEW, "javax/management/openmbean/ArrayType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/management/openmbean/SimpleType", "BYTE", "Ljavax/management/openmbean/SimpleType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/openmbean/ArrayType", "<init>", "(ILjavax/management/openmbean/OpenType;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$ByteMessageOpenTypeFactory", "addItem", "(Ljava/lang/String;Ljava/lang/String;Ljavax/management/openmbean/OpenType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFields", "(Ljava/lang/Object;)Ljava/util/Map;", "(Ljava/lang/Object;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", new String[] { "javax/management/openmbean/OpenDataException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/jms/JMSException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "jakarta/jms/JMSException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ActiveMQBytesMessage");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQBytesMessage", "setReadOnlyBody", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$MessageOpenTypeFactory", "getFields", "(Ljava/lang/Object;)Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQBytesMessage", "getBodyLength", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("BodyLength");
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/activemq/broker/jmx/OpenTypeSupport$ByteMessageOpenTypeFactory", "java/lang/Object", "org/apache/activemq/command/ActiveMQBytesMessage", "java/util/Map", Opcodes.LONG}, 1, new Object[] {"jakarta/jms/JMSException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("BodyLength");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitLdcInsn(new Long(255L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(JJ)J", false);
methodVisitor.visitInsn(L2I);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQBytesMessage", "readBytes", "([B)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQBytesMessage", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Byte");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 8);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[B", "[Ljava/lang/Byte;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitTypeInsn(NEW, "java/lang/Byte");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Byte", "<init>", "(B)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(8, 1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("BodyPreview");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/activemq/broker/jmx/OpenTypeSupport$ByteMessageOpenTypeFactory", "java/lang/Object", "org/apache/activemq/command/ActiveMQBytesMessage", "java/util/Map", Opcodes.LONG}, 1, new Object[] {"jakarta/jms/JMSException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("BodyPreview");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Byte");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 9);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
