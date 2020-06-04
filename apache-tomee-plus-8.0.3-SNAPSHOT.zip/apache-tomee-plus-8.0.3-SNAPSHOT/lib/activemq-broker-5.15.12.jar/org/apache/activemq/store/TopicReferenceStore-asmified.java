package asm.org.apache.activemq.store;
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
public class TopicReferenceStoreDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/activemq/store/TopicReferenceStore", null, "java/lang/Object", new String[] { "org/apache/activemq/store/ReferenceStore", "org/apache/activemq/store/TopicMessageStore" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "acknowledgeReference", "(Lorg/apache/activemq/broker/ConnectionContext;Ljava/lang/String;Ljava/lang/String;Lorg/apache/activemq/command/MessageId;)Z", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteSubscription", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "recoverSubscription", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/activemq/store/MessageRecoveryListener;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "recoverNextMessages", "(Ljava/lang/String;Ljava/lang/String;ILorg/apache/activemq/store/MessageRecoveryListener;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resetBatching", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMessageCount", "(Ljava/lang/String;Ljava/lang/String;)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lookupSubscription", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/activemq/command/SubscriptionInfo;", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAllSubscriptions", "()[Lorg/apache/activemq/command/SubscriptionInfo;", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addSubsciption", "(Lorg/apache/activemq/command/SubscriptionInfo;Z)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
