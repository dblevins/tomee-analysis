package asm.org.apache.activemq.openwire.v9;
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
public class RemoveInfoMarshallerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/openwire/v9/RemoveInfoMarshaller", null, "org/apache/activemq/openwire/v9/BaseCommandMarshaller", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v9/BaseCommandMarshaller", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDataStructureType", "()B", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createObject", "()Lorg/apache/activemq/command/DataStructure;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/RemoveInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/RemoveInfo", "<init>", "()V", false);
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v9/BaseCommandMarshaller", "tightUnmarshal", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataInput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/RemoveInfo");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/RemoveInfoMarshaller", "tightUnmarsalCachedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/io/DataInput;Lorg/apache/activemq/openwire/BooleanStream;)Lorg/apache/activemq/command/DataStructure;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/RemoveInfo", "setObjectId", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/RemoveInfoMarshaller", "tightUnmarshalLong", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/io/DataInput;Lorg/apache/activemq/openwire/BooleanStream;)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/RemoveInfo", "setLastDeliveredSequenceId", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "tightMarshal1", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Lorg/apache/activemq/openwire/BooleanStream;)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/RemoveInfo");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v9/BaseCommandMarshaller", "tightMarshal1", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Lorg/apache/activemq/openwire/BooleanStream;)I", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/RemoveInfo", "getObjectId", "()Lorg/apache/activemq/command/DataStructure;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/RemoveInfoMarshaller", "tightMarshalCachedObject1", "(Lorg/apache/activemq/openwire/OpenWireFormat;Lorg/apache/activemq/command/DataStructure;Lorg/apache/activemq/openwire/BooleanStream;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/RemoveInfo", "getLastDeliveredSequenceId", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/RemoveInfoMarshaller", "tightMarshalLong1", "(Lorg/apache/activemq/openwire/OpenWireFormat;JLorg/apache/activemq/openwire/BooleanStream;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_0);
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v9/BaseCommandMarshaller", "tightMarshal2", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataOutput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/RemoveInfo");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/RemoveInfo", "getObjectId", "()Lorg/apache/activemq/command/DataStructure;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/RemoveInfoMarshaller", "tightMarshalCachedObject2", "(Lorg/apache/activemq/openwire/OpenWireFormat;Lorg/apache/activemq/command/DataStructure;Ljava/io/DataOutput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/RemoveInfo", "getLastDeliveredSequenceId", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/RemoveInfoMarshaller", "tightMarshalLong2", "(Lorg/apache/activemq/openwire/OpenWireFormat;JLjava/io/DataOutput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v9/BaseCommandMarshaller", "looseUnmarshal", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataInput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/RemoveInfo");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/RemoveInfoMarshaller", "looseUnmarsalCachedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/io/DataInput;)Lorg/apache/activemq/command/DataStructure;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/RemoveInfo", "setObjectId", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/RemoveInfoMarshaller", "looseUnmarshalLong", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/io/DataInput;)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/RemoveInfo", "setLastDeliveredSequenceId", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "looseMarshal", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataOutput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/RemoveInfo");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v9/BaseCommandMarshaller", "looseMarshal", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataOutput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/RemoveInfo", "getObjectId", "()Lorg/apache/activemq/command/DataStructure;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/RemoveInfoMarshaller", "looseMarshalCachedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Lorg/apache/activemq/command/DataStructure;Ljava/io/DataOutput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/RemoveInfo", "getLastDeliveredSequenceId", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/RemoveInfoMarshaller", "looseMarshalLong", "(Lorg/apache/activemq/openwire/OpenWireFormat;JLjava/io/DataOutput;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
