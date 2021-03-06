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
public class MessageDatabase$StoredDestinationMarshallerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "Lorg/apache/activemq/store/kahadb/disk/util/VariableMarshaller<Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestination;>;", "org/apache/activemq/store/kahadb/disk/util/VariableMarshaller", null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "org/apache/activemq/store/kahadb/MessageDatabase", "StoredDestinationMarshaller", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller$3", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller$2", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$MessageKeysMarshaller", "org/apache/activemq/store/kahadb/MessageDatabase", "MessageKeysMarshaller", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "org/apache/activemq/store/kahadb/MessageDatabase", "StoredDestination", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex", "org/apache/activemq/store/kahadb/MessageDatabase", "MessageOrderIndex", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$Metadata", "org/apache/activemq/store/kahadb/MessageDatabase", "Metadata", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/page/Transaction$Closure", "org/apache/activemq/store/kahadb/disk/page/Transaction", "Closure", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "messageKeysMarshaller", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageKeysMarshaller;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/activemq/store/kahadb/MessageDatabase;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/util/VariableMarshaller", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/MessageDatabase$MessageKeysMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/MessageDatabase$MessageKeysMarshaller", "<init>", "(Lorg/apache/activemq/store/kahadb/MessageDatabase;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "messageKeysMarshaller", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageKeysMarshaller;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readPayload", "(Ljava/io/DataInput;)Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestination;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "<init>", "(Lorg/apache/activemq/store/kahadb/MessageDatabase;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "orderIndex", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase", "pageFile", "Lorg/apache/activemq/store/kahadb/disk/page/PageFile;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readLong", "()J", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex", "defaultPriorityIndex", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase", "pageFile", "Lorg/apache/activemq/store/kahadb/disk/page/PageFile;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readLong", "()J", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "locationIndex", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase", "pageFile", "Lorg/apache/activemq/store/kahadb/disk/page/PageFile;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readLong", "()J", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "messageIdIndex", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readBoolean", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase", "pageFile", "Lorg/apache/activemq/store/kahadb/disk/page/PageFile;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readLong", "()J", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "subscriptions", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase", "pageFile", "Lorg/apache/activemq/store/kahadb/disk/page/PageFile;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readLong", "()J", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "subscriptionAcks", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase", "metadata", "Lorg/apache/activemq/store/kahadb/MessageDatabase$Metadata;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$Metadata", "version", "I");
methodVisitor.visitInsn(ICONST_4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/ListIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase", "pageFile", "Lorg/apache/activemq/store/kahadb/disk/page/PageFile;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readLong", "()J", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "ackPositions", "Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase", "pageFile", "Lorg/apache/activemq/store/kahadb/disk/page/PageFile;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/PageFile", "tx", "()Lorg/apache/activemq/store/kahadb/disk/page/Transaction;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller$1", "<init>", "(Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller;Ljava/io/DataInput;Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestination;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction$Closure;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase", "metadata", "Lorg/apache/activemq/store/kahadb/MessageDatabase$Metadata;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$Metadata", "version", "I");
methodVisitor.visitInsn(ICONST_5);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/ListIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase", "pageFile", "Lorg/apache/activemq/store/kahadb/disk/page/PageFile;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readLong", "()J", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "subLocations", "Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;");
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase", "pageFile", "Lorg/apache/activemq/store/kahadb/disk/page/PageFile;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/PageFile", "tx", "()Lorg/apache/activemq/store/kahadb/disk/page/Transaction;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller$2", "<init>", "(Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller;Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestination;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction$Closure;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase", "metadata", "Lorg/apache/activemq/store/kahadb/MessageDatabase$Metadata;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$Metadata", "version", "I");
methodVisitor.visitInsn(ICONST_2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "orderIndex", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase", "pageFile", "Lorg/apache/activemq/store/kahadb/disk/page/PageFile;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readLong", "()J", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex", "lowPriorityIndex", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "orderIndex", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase", "pageFile", "Lorg/apache/activemq/store/kahadb/disk/page/PageFile;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readLong", "()J", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex", "highPriorityIndex", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/MessageDatabase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase", "pageFile", "Lorg/apache/activemq/store/kahadb/disk/page/PageFile;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/PageFile", "tx", "()Lorg/apache/activemq/store/kahadb/disk/page/Transaction;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller$3", "<init>", "(Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller;Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestination;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction$Closure;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writePayload", "(Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestination;Ljava/io/DataOutput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "orderIndex", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex", "defaultPriorityIndex", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeLong", "(J)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "locationIndex", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeLong", "(J)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "messageIdIndex", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeLong", "(J)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "subscriptions", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeBoolean", "(Z)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "subscriptions", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeLong", "(J)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "subscriptionAcks", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeLong", "(J)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "ackPositions", "Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListIndex", "getHeadPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeLong", "(J)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "subLocations", "Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListIndex", "getHeadPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeLong", "(J)V", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeBoolean", "(Z)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "orderIndex", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex", "lowPriorityIndex", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeLong", "(J)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "orderIndex", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex", "highPriorityIndex", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeLong", "(J)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "readPayload", "(Ljava/io/DataInput;)Ljava/lang/Object;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "readPayload", "(Ljava/io/DataInput;)Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestination;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "writePayload", "(Ljava/lang/Object;Ljava/io/DataOutput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestinationMarshaller", "writePayload", "(Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestination;Ljava/io/DataOutput;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
