package asm.org.apache.activemq.openwire.v12;
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
public class DestinationInfoMarshallerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", null, "org/apache/activemq/openwire/v12/BaseCommandMarshaller", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v12/BaseCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDataStructureType", "()B", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createObject", "()Lorg/apache/activemq/command/DataStructure;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/DestinationInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/DestinationInfo", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "tightUnmarshal", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataInput;Lorg/apache/activemq/openwire/BooleanStream;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v12/BaseCommandMarshaller", "tightUnmarshal", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataInput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/DestinationInfo");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "tightUnmarsalCachedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/io/DataInput;Lorg/apache/activemq/openwire/BooleanStream;)Lorg/apache/activemq/command/DataStructure;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ConnectionId");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "setConnectionId", "(Lorg/apache/activemq/command/ConnectionId;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "tightUnmarsalCachedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/io/DataInput;Lorg/apache/activemq/openwire/BooleanStream;)Lorg/apache/activemq/command/DataStructure;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ActiveMQDestination");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "setDestination", "(Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readByte", "()B", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "setOperationType", "(B)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "tightUnmarshalLong", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/io/DataInput;Lorg/apache/activemq/openwire/BooleanStream;)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "setTimeout", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/BooleanStream", "readBoolean", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readShort", "()S", true);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/activemq/command/BrokerId");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 8);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "org/apache/activemq/openwire/OpenWireFormat", "java/lang/Object", "java/io/DataInput", "org/apache/activemq/openwire/BooleanStream", "org/apache/activemq/command/DestinationInfo", Opcodes.INTEGER, "[Lorg/apache/activemq/command/BrokerId;", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 6);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "tightUnmarsalNestedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/io/DataInput;Lorg/apache/activemq/openwire/BooleanStream;)Lorg/apache/activemq/command/DataStructure;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/BrokerId");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(8, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "setBrokerPath", "([Lorg/apache/activemq/command/BrokerId;)V", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "setBrokerPath", "([Lorg/apache/activemq/command/BrokerId;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "tightMarshal1", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Lorg/apache/activemq/openwire/BooleanStream;)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/DestinationInfo");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v12/BaseCommandMarshaller", "tightMarshal1", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Lorg/apache/activemq/openwire/BooleanStream;)I", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "getConnectionId", "()Lorg/apache/activemq/command/ConnectionId;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "tightMarshalCachedObject1", "(Lorg/apache/activemq/openwire/OpenWireFormat;Lorg/apache/activemq/command/DataStructure;Lorg/apache/activemq/openwire/BooleanStream;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "getDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "tightMarshalCachedObject1", "(Lorg/apache/activemq/openwire/OpenWireFormat;Lorg/apache/activemq/command/DataStructure;Lorg/apache/activemq/openwire/BooleanStream;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "getTimeout", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "tightMarshalLong1", "(Lorg/apache/activemq/openwire/OpenWireFormat;JLorg/apache/activemq/openwire/BooleanStream;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "getBrokerPath", "()[Lorg/apache/activemq/command/BrokerId;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "tightMarshalObjectArray1", "(Lorg/apache/activemq/openwire/OpenWireFormat;[Lorg/apache/activemq/command/DataStructure;Lorg/apache/activemq/openwire/BooleanStream;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "tightMarshal2", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataOutput;Lorg/apache/activemq/openwire/BooleanStream;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v12/BaseCommandMarshaller", "tightMarshal2", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataOutput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/DestinationInfo");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "getConnectionId", "()Lorg/apache/activemq/command/ConnectionId;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "tightMarshalCachedObject2", "(Lorg/apache/activemq/openwire/OpenWireFormat;Lorg/apache/activemq/command/DataStructure;Ljava/io/DataOutput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "getDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "tightMarshalCachedObject2", "(Lorg/apache/activemq/openwire/OpenWireFormat;Lorg/apache/activemq/command/DataStructure;Ljava/io/DataOutput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "getOperationType", "()B", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeByte", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "getTimeout", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "tightMarshalLong2", "(Lorg/apache/activemq/openwire/OpenWireFormat;JLjava/io/DataOutput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "getBrokerPath", "()[Lorg/apache/activemq/command/BrokerId;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "tightMarshalObjectArray2", "(Lorg/apache/activemq/openwire/OpenWireFormat;[Lorg/apache/activemq/command/DataStructure;Ljava/io/DataOutput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "looseUnmarshal", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataInput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v12/BaseCommandMarshaller", "looseUnmarshal", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataInput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/DestinationInfo");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "looseUnmarsalCachedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/io/DataInput;)Lorg/apache/activemq/command/DataStructure;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ConnectionId");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "setConnectionId", "(Lorg/apache/activemq/command/ConnectionId;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "looseUnmarsalCachedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/io/DataInput;)Lorg/apache/activemq/command/DataStructure;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ActiveMQDestination");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "setDestination", "(Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readByte", "()B", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "setOperationType", "(B)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "looseUnmarshalLong", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/io/DataInput;)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "setTimeout", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readBoolean", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readShort", "()S", true);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/activemq/command/BrokerId");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "org/apache/activemq/openwire/OpenWireFormat", "java/lang/Object", "java/io/DataInput", "org/apache/activemq/command/DestinationInfo", Opcodes.INTEGER, "[Lorg/apache/activemq/command/BrokerId;", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "looseUnmarsalNestedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/io/DataInput;)Lorg/apache/activemq/command/DataStructure;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/BrokerId");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "setBrokerPath", "([Lorg/apache/activemq/command/BrokerId;)V", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "setBrokerPath", "([Lorg/apache/activemq/command/BrokerId;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "looseMarshal", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataOutput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/DestinationInfo");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v12/BaseCommandMarshaller", "looseMarshal", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataOutput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "getConnectionId", "()Lorg/apache/activemq/command/ConnectionId;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "looseMarshalCachedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Lorg/apache/activemq/command/DataStructure;Ljava/io/DataOutput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "getDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "looseMarshalCachedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Lorg/apache/activemq/command/DataStructure;Ljava/io/DataOutput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "getOperationType", "()B", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeByte", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "getTimeout", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "looseMarshalLong", "(Lorg/apache/activemq/openwire/OpenWireFormat;JLjava/io/DataOutput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/DestinationInfo", "getBrokerPath", "()[Lorg/apache/activemq/command/BrokerId;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v12/DestinationInfoMarshaller", "looseMarshalObjectArray", "(Lorg/apache/activemq/openwire/OpenWireFormat;[Lorg/apache/activemq/command/DataStructure;Ljava/io/DataOutput;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}