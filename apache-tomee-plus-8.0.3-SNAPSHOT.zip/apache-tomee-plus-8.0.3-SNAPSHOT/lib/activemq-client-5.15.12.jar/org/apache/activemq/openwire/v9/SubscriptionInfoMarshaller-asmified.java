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
public class SubscriptionInfoMarshallerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", null, "org/apache/activemq/openwire/v9/BaseDataStreamMarshaller", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v9/BaseDataStreamMarshaller", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDataStructureType", "()B", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createObject", "()Lorg/apache/activemq/command/DataStructure;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/SubscriptionInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/SubscriptionInfo", "<init>", "()V", false);
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v9/BaseDataStreamMarshaller", "tightUnmarshal", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataInput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/SubscriptionInfo");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "tightUnmarshalString", "(Ljava/io/DataInput;Lorg/apache/activemq/openwire/BooleanStream;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "setClientId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "tightUnmarsalCachedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/io/DataInput;Lorg/apache/activemq/openwire/BooleanStream;)Lorg/apache/activemq/command/DataStructure;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ActiveMQDestination");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "setDestination", "(Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "tightUnmarshalString", "(Ljava/io/DataInput;Lorg/apache/activemq/openwire/BooleanStream;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "setSelector", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "tightUnmarshalString", "(Ljava/io/DataInput;Lorg/apache/activemq/openwire/BooleanStream;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "setSubcriptionName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "tightUnmarsalNestedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/io/DataInput;Lorg/apache/activemq/openwire/BooleanStream;)Lorg/apache/activemq/command/DataStructure;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ActiveMQDestination");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "setSubscribedDestination", "(Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "tightMarshal1", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Lorg/apache/activemq/openwire/BooleanStream;)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/SubscriptionInfo");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v9/BaseDataStreamMarshaller", "tightMarshal1", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Lorg/apache/activemq/openwire/BooleanStream;)I", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "getClientId", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "tightMarshalString1", "(Ljava/lang/String;Lorg/apache/activemq/openwire/BooleanStream;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "getDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "tightMarshalCachedObject1", "(Lorg/apache/activemq/openwire/OpenWireFormat;Lorg/apache/activemq/command/DataStructure;Lorg/apache/activemq/openwire/BooleanStream;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "getSelector", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "tightMarshalString1", "(Ljava/lang/String;Lorg/apache/activemq/openwire/BooleanStream;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "getSubcriptionName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "tightMarshalString1", "(Ljava/lang/String;Lorg/apache/activemq/openwire/BooleanStream;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "getSubscribedDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "tightMarshalNestedObject1", "(Lorg/apache/activemq/openwire/OpenWireFormat;Lorg/apache/activemq/command/DataStructure;Lorg/apache/activemq/openwire/BooleanStream;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 6);
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v9/BaseDataStreamMarshaller", "tightMarshal2", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataOutput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/SubscriptionInfo");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "getClientId", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "tightMarshalString2", "(Ljava/lang/String;Ljava/io/DataOutput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "getDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "tightMarshalCachedObject2", "(Lorg/apache/activemq/openwire/OpenWireFormat;Lorg/apache/activemq/command/DataStructure;Ljava/io/DataOutput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "getSelector", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "tightMarshalString2", "(Ljava/lang/String;Ljava/io/DataOutput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "getSubcriptionName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "tightMarshalString2", "(Ljava/lang/String;Ljava/io/DataOutput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "getSubscribedDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "tightMarshalNestedObject2", "(Lorg/apache/activemq/openwire/OpenWireFormat;Lorg/apache/activemq/command/DataStructure;Ljava/io/DataOutput;Lorg/apache/activemq/openwire/BooleanStream;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "looseUnmarshal", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataInput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v9/BaseDataStreamMarshaller", "looseUnmarshal", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataInput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/SubscriptionInfo");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "looseUnmarshalString", "(Ljava/io/DataInput;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "setClientId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "looseUnmarsalCachedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/io/DataInput;)Lorg/apache/activemq/command/DataStructure;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ActiveMQDestination");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "setDestination", "(Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "looseUnmarshalString", "(Ljava/io/DataInput;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "setSelector", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "looseUnmarshalString", "(Ljava/io/DataInput;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "setSubcriptionName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "looseUnmarsalNestedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/io/DataInput;)Lorg/apache/activemq/command/DataStructure;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ActiveMQDestination");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "setSubscribedDestination", "(Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "looseMarshal", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataOutput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/SubscriptionInfo");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/v9/BaseDataStreamMarshaller", "looseMarshal", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/lang/Object;Ljava/io/DataOutput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "getClientId", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "looseMarshalString", "(Ljava/lang/String;Ljava/io/DataOutput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "getDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "looseMarshalCachedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Lorg/apache/activemq/command/DataStructure;Ljava/io/DataOutput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "getSelector", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "looseMarshalString", "(Ljava/lang/String;Ljava/io/DataOutput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "getSubcriptionName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "looseMarshalString", "(Ljava/lang/String;Ljava/io/DataOutput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SubscriptionInfo", "getSubscribedDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/v9/SubscriptionInfoMarshaller", "looseMarshalNestedObject", "(Lorg/apache/activemq/openwire/OpenWireFormat;Lorg/apache/activemq/command/DataStructure;Ljava/io/DataOutput;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
