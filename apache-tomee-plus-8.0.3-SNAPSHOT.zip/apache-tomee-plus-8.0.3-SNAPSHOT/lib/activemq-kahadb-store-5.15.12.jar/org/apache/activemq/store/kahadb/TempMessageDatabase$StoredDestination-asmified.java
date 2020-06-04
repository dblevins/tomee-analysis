package asm.org.apache.activemq.store.kahadb;
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
public class TempMessageDatabase$StoredDestinationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/TempMessageDatabase$StoredDestination", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/TempMessageDatabase$MessageRecord", "org/apache/activemq/store/kahadb/TempMessageDatabase", "MessageRecord", ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/TempMessageDatabase$StoredDestination", "org/apache/activemq/store/kahadb/TempMessageDatabase", "StoredDestination", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "nextMessageId", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "orderIndex", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex<Ljava/lang/Long;Lorg/apache/activemq/store/kahadb/TempMessageDatabase$MessageRecord;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "messageIdIndex", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex<Ljava/lang/String;Ljava/lang/Long;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "subscriptions", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex<Ljava/lang/String;Lorg/apache/activemq/store/kahadb/data/KahaSubscriptionCommand;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "subscriptionAcks", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex<Ljava/lang/String;Ljava/lang/Long;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "subscriptionCursors", "Ljava/util/HashMap;", "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Long;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "ackPositions", "Ljava/util/TreeMap;", "Ljava/util/TreeMap<Ljava/lang/Long;Ljava/util/HashSet<Ljava/lang/String;>;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
