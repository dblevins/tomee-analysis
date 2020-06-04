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
public class OpenTypeSupportDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/activemq/broker/jmx/OpenTypeSupport", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/OpenTypeSupport$HealthStatusOpenTypeFactory", "org/apache/activemq/broker/jmx/OpenTypeSupport", "HealthStatusOpenTypeFactory", ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/OpenTypeSupport$SlowConsumerEntryOpenTypeFactory", "org/apache/activemq/broker/jmx/OpenTypeSupport", "SlowConsumerEntryOpenTypeFactory", ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/OpenTypeSupport$ActiveMQBlobMessageOpenTypeFactory", "org/apache/activemq/broker/jmx/OpenTypeSupport", "ActiveMQBlobMessageOpenTypeFactory", ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/OpenTypeSupport$JobOpenTypeFactory", "org/apache/activemq/broker/jmx/OpenTypeSupport", "JobOpenTypeFactory", ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/OpenTypeSupport$TextMessageOpenTypeFactory", "org/apache/activemq/broker/jmx/OpenTypeSupport", "TextMessageOpenTypeFactory", ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/OpenTypeSupport$StreamMessageOpenTypeFactory", "org/apache/activemq/broker/jmx/OpenTypeSupport", "StreamMessageOpenTypeFactory", ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/OpenTypeSupport$ObjectMessageOpenTypeFactory", "org/apache/activemq/broker/jmx/OpenTypeSupport", "ObjectMessageOpenTypeFactory", ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/OpenTypeSupport$MapMessageOpenTypeFactory", "org/apache/activemq/broker/jmx/OpenTypeSupport", "MapMessageOpenTypeFactory", ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/OpenTypeSupport$ByteMessageOpenTypeFactory", "org/apache/activemq/broker/jmx/OpenTypeSupport", "ByteMessageOpenTypeFactory", ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/OpenTypeSupport$MessageOpenTypeFactory", "org/apache/activemq/broker/jmx/OpenTypeSupport", "MessageOpenTypeFactory", ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/OpenTypeSupport$AbstractOpenTypeFactory", "org/apache/activemq/broker/jmx/OpenTypeSupport", "AbstractOpenTypeFactory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/OpenTypeSupport$OpenTypeFactory", "org/apache/activemq/broker/jmx/OpenTypeSupport", "OpenTypeFactory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "OPEN_TYPE_FACTORIES", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/Class;Lorg/apache/activemq/broker/jmx/OpenTypeSupport$AbstractOpenTypeFactory;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getFactory", "(Ljava/lang/Class;)Lorg/apache/activemq/broker/jmx/OpenTypeSupport$OpenTypeFactory;", "(Ljava/lang/Class<*>;)Lorg/apache/activemq/broker/jmx/OpenTypeSupport$OpenTypeFactory;", new String[] { "javax/management/openmbean/OpenDataException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/jmx/OpenTypeSupport", "OPEN_TYPE_FACTORIES", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/jmx/OpenTypeSupport$OpenTypeFactory");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "convert", "(Ljava/lang/Object;)Ljavax/management/openmbean/CompositeData;", null, new String[] { "javax/management/openmbean/OpenDataException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/jmx/OpenTypeSupport", "getFactory", "(Ljava/lang/Class;)Lorg/apache/activemq/broker/jmx/OpenTypeSupport$OpenTypeFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "javax/management/openmbean/OpenDataException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Cannot create a CompositeData for type: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/openmbean/OpenDataException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/broker/jmx/OpenTypeSupport$OpenTypeFactory"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/jmx/OpenTypeSupport$OpenTypeFactory", "getCompositeType", "()Ljavax/management/openmbean/CompositeType;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/jmx/OpenTypeSupport$OpenTypeFactory", "getFields", "(Ljava/lang/Object;)Ljava/util/Map;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "javax/management/openmbean/CompositeDataSupport");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/openmbean/CompositeDataSupport", "<init>", "(Ljavax/management/openmbean/CompositeType;Ljava/util/Map;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/broker/jmx/OpenTypeSupport", "OPEN_TYPE_FACTORIES", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/jmx/OpenTypeSupport", "OPEN_TYPE_FACTORIES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/command/ActiveMQMessage;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/OpenTypeSupport$MessageOpenTypeFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$MessageOpenTypeFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/jmx/OpenTypeSupport", "OPEN_TYPE_FACTORIES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/command/ActiveMQBytesMessage;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/OpenTypeSupport$ByteMessageOpenTypeFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$ByteMessageOpenTypeFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/jmx/OpenTypeSupport", "OPEN_TYPE_FACTORIES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/command/ActiveMQMapMessage;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/OpenTypeSupport$MapMessageOpenTypeFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$MapMessageOpenTypeFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/jmx/OpenTypeSupport", "OPEN_TYPE_FACTORIES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/command/ActiveMQObjectMessage;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/OpenTypeSupport$ObjectMessageOpenTypeFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$ObjectMessageOpenTypeFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/jmx/OpenTypeSupport", "OPEN_TYPE_FACTORIES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/command/ActiveMQStreamMessage;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/OpenTypeSupport$StreamMessageOpenTypeFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$StreamMessageOpenTypeFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/jmx/OpenTypeSupport", "OPEN_TYPE_FACTORIES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/command/ActiveMQTextMessage;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/OpenTypeSupport$TextMessageOpenTypeFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$TextMessageOpenTypeFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/jmx/OpenTypeSupport", "OPEN_TYPE_FACTORIES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/broker/scheduler/Job;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/OpenTypeSupport$JobOpenTypeFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$JobOpenTypeFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/jmx/OpenTypeSupport", "OPEN_TYPE_FACTORIES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/broker/region/policy/SlowConsumerEntry;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/OpenTypeSupport$SlowConsumerEntryOpenTypeFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$SlowConsumerEntryOpenTypeFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/jmx/OpenTypeSupport", "OPEN_TYPE_FACTORIES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/command/ActiveMQBlobMessage;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/OpenTypeSupport$ActiveMQBlobMessageOpenTypeFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$ActiveMQBlobMessageOpenTypeFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/jmx/OpenTypeSupport", "OPEN_TYPE_FACTORIES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/broker/jmx/HealthStatus;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/OpenTypeSupport$HealthStatusOpenTypeFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/OpenTypeSupport$HealthStatusOpenTypeFactory", "<init>", "()V", false);
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
