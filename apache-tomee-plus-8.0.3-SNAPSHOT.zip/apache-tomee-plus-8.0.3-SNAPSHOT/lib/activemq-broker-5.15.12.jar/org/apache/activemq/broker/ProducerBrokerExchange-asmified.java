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
public class ProducerBrokerExchangeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/broker/ProducerBrokerExchange", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo", "org/apache/activemq/broker/ProducerBrokerExchange", "FlowControlInfo", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "connectionContext", "Lorg/apache/activemq/broker/ConnectionContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "regionDestination", "Lorg/apache/activemq/broker/region/Destination;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "region", "Lorg/apache/activemq/broker/region/Region;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "producerState", "Lorg/apache/activemq/state/ProducerState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "mutable", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lastSendSequenceNumber", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "auditProducerSequenceIds", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "isNetworkProducer", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "brokerService", "Lorg/apache/activemq/broker/BrokerService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "flowControlInfo", "Lorg/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "mutable", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "lastSendSequenceNumber", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "flowControlInfo", "Lorg/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copy", "()Lorg/apache/activemq/broker/ProducerBrokerExchange;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/ProducerBrokerExchange");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/ProducerBrokerExchange", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "connectionContext", "Lorg/apache/activemq/broker/ConnectionContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ConnectionContext", "copy", "()Lorg/apache/activemq/broker/ConnectionContext;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "connectionContext", "Lorg/apache/activemq/broker/ConnectionContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "regionDestination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "regionDestination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "region", "Lorg/apache/activemq/broker/region/Region;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "region", "Lorg/apache/activemq/broker/region/Region;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "producerState", "Lorg/apache/activemq/state/ProducerState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "producerState", "Lorg/apache/activemq/state/ProducerState;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "mutable", "Z");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "mutable", "Z");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "flowControlInfo", "Lorg/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "flowControlInfo", "Lorg/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionContext", "()Lorg/apache/activemq/broker/ConnectionContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "connectionContext", "Lorg/apache/activemq/broker/ConnectionContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionContext", "(Lorg/apache/activemq/broker/ConnectionContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "connectionContext", "Lorg/apache/activemq/broker/ConnectionContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isMutable", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "mutable", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMutable", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "mutable", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRegionDestination", "()Lorg/apache/activemq/broker/region/Destination;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "regionDestination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRegionDestination", "(Lorg/apache/activemq/broker/region/Destination;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "regionDestination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRegion", "()Lorg/apache/activemq/broker/region/Region;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "region", "Lorg/apache/activemq/broker/region/Region;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRegion", "(Lorg/apache/activemq/broker/region/Region;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "region", "Lorg/apache/activemq/broker/region/Region;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProducerState", "()Lorg/apache/activemq/state/ProducerState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "producerState", "Lorg/apache/activemq/state/ProducerState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProducerState", "(Lorg/apache/activemq/state/ProducerState;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "producerState", "Lorg/apache/activemq/state/ProducerState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "canDispatch", "(Lorg/apache/activemq/command/Message;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "auditProducerSequenceIds", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "isPersistent", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/MessageId", "getProducerSequenceId", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "isNetworkProducer", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/ProducerBrokerExchange", "getStoredSequenceIdForMessage", "(Lorg/apache/activemq/command/MessageId;)J", false);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitInsn(LCMP);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFGT, label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/ProducerBrokerExchange", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("suppressing duplicate message send [{}] from network producer with producerSequence [{}] less than last stored: {}");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/ProducerBrokerExchange", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "isTraceEnabled", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/activemq/broker/ProducerBrokerExchange", "org/apache/activemq/command/Message", Opcodes.INTEGER, Opcodes.LONG, Opcodes.LONG}, 5, new Object[] {"org/slf4j/Logger", "java/lang/String", "[Ljava/lang/Object;", "[Ljava/lang/Object;", Opcodes.INTEGER});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/activemq/broker/ProducerBrokerExchange", "org/apache/activemq/command/Message", Opcodes.INTEGER, Opcodes.LONG, Opcodes.LONG}, 6, new Object[] {"org/slf4j/Logger", "java/lang/String", "[Ljava/lang/Object;", "[Ljava/lang/Object;", Opcodes.INTEGER, "java/lang/Object"});
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;[Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "lastSendSequenceNumber", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "get", "()J", false);
methodVisitor.visitInsn(LCMP);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFGT, label5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "isInTransaction", "()Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/ProducerBrokerExchange", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("suppressing duplicated message send [{}] with producerSequenceId [{}] <= last stored: {}");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/ProducerBrokerExchange", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "isTraceEnabled", "()Z", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/activemq/broker/ProducerBrokerExchange", "org/apache/activemq/command/Message", Opcodes.INTEGER, Opcodes.LONG}, 5, new Object[] {"org/slf4j/Logger", "java/lang/String", "[Ljava/lang/Object;", "[Ljava/lang/Object;", Opcodes.INTEGER});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/activemq/broker/ProducerBrokerExchange", "org/apache/activemq/command/Message", Opcodes.INTEGER, Opcodes.LONG}, 6, new Object[] {"org/slf4j/Logger", "java/lang/String", "[Ljava/lang/Object;", "[Ljava/lang/Object;", Opcodes.INTEGER, "java/lang/Object"});
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "lastSendSequenceNumber", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;[Ljava/lang/Object;)V", true);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/ProducerBrokerExchange", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("suppressing duplicated message send [{}] with producerSequenceId [{}] <= last stored: {}");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/ProducerBrokerExchange", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "isTraceEnabled", "()Z", true);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/activemq/broker/ProducerBrokerExchange", "org/apache/activemq/command/Message", Opcodes.INTEGER, Opcodes.LONG}, 5, new Object[] {"org/slf4j/Logger", "java/lang/String", "[Ljava/lang/Object;", "[Ljava/lang/Object;", Opcodes.INTEGER});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", false);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/activemq/broker/ProducerBrokerExchange", "org/apache/activemq/command/Message", Opcodes.INTEGER, Opcodes.LONG}, 6, new Object[] {"org/slf4j/Logger", "java/lang/String", "[Ljava/lang/Object;", "[Ljava/lang/Object;", Opcodes.INTEGER, "java/lang/Object"});
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "lastSendSequenceNumber", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;[Ljava/lang/Object;)V", true);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "lastSendSequenceNumber", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "set", "(J)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getStoredSequenceIdForMessage", "(Lorg/apache/activemq/command/MessageId;)J", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/BrokerService", "getPersistenceAdapter", "()Lorg/apache/activemq/store/PersistenceAdapter;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/MessageId", "getProducerId", "()Lorg/apache/activemq/command/ProducerId;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/PersistenceAdapter", "getLastProducerSequenceId", "(Lorg/apache/activemq/command/ProducerId;)J", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/ProducerBrokerExchange", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Failed to determine last producer sequence id for: {}");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLastStoredSequenceId", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "auditProducerSequenceIds", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "connectionContext", "Lorg/apache/activemq/broker/ConnectionContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ConnectionContext", "isNetworkConnection", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "connectionContext", "Lorg/apache/activemq/broker/ConnectionContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ConnectionContext", "getBroker", "()Lorg/apache/activemq/broker/Broker;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/Broker", "getBrokerService", "()Lorg/apache/activemq/broker/BrokerService;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "isNetworkProducer", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "lastSendSequenceNumber", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "set", "(J)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/ProducerBrokerExchange", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("last stored sequence id set: {}");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "incrementSend", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "flowControlInfo", "Lorg/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo", "incrementSend", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "blockingOnFlowControl", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "flowControlInfo", "Lorg/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo", "setBlockingOnFlowControl", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "incrementTimeBlocked", "(Lorg/apache/activemq/broker/region/Destination;J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "flowControlInfo", "Lorg/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo;");
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo", "incrementTimeBlocked", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isBlockedForFlowControl", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "flowControlInfo", "Lorg/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo", "isBlockingOnFlowControl", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resetFlowControl", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "flowControlInfo", "Lorg/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo", "reset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTotalTimeBlocked", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "flowControlInfo", "Lorg/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo", "getTotalTimeBlocked", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPercentageBlocked", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "flowControlInfo", "Lorg/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo", "getTotalSends", "()J", false);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(DCONST_0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "flowControlInfo", "Lorg/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo", "getSendsBlocked", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/ProducerBrokerExchange", "flowControlInfo", "Lorg/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ProducerBrokerExchange$FlowControlInfo", "getTotalSends", "()J", false);
methodVisitor.visitInsn(LDIV);
methodVisitor.visitInsn(L2D);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.DOUBLE});
methodVisitor.visitVarInsn(DSTORE, 1);
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitInsn(D2I);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/broker/ProducerBrokerExchange;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/broker/ProducerBrokerExchange", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
