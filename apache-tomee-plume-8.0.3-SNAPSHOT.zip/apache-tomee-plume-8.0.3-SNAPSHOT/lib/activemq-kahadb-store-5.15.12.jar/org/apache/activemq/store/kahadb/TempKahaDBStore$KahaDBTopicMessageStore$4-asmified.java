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
public class TempKahaDBStore$KahaDBTopicMessageStore$4Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore$4", "Ljava/lang/Object;Lorg/apache/activemq/store/kahadb/disk/page/Transaction$Closure<Ljava/lang/Exception;>;", "java/lang/Object", new String[] { "org/apache/activemq/store/kahadb/disk/page/Transaction$Closure" });

classWriter.visitOuterClass("org/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore", "recoverSubscription", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/activemq/store/MessageRecoveryListener;)V");

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore", "org/apache/activemq/store/kahadb/TempKahaDBStore", "KahaDBTopicMessageStore", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore$4", null, null, 0);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/TempMessageDatabase$StoredDestination", "org/apache/activemq/store/kahadb/TempMessageDatabase", "StoredDestination", ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/TempMessageDatabase$MessageRecord", "org/apache/activemq/store/kahadb/TempMessageDatabase", "MessageRecord", ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/page/Transaction$Closure", "org/apache/activemq/store/kahadb/disk/page/Transaction", "Closure", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$subscriptionKey", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$listener", "Lorg/apache/activemq/store/MessageRecoveryListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore;Ljava/lang/String;Lorg/apache/activemq/store/MessageRecoveryListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore$4", "this$1", "Lorg/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore$4", "val$subscriptionKey", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore$4", "val$listener", "Lorg/apache/activemq/store/MessageRecoveryListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore$4", "this$1", "Lorg/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore", "this$0", "Lorg/apache/activemq/store/kahadb/TempKahaDBStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore$4", "this$1", "Lorg/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore", "dest", "Lorg/apache/activemq/store/kahadb/data/KahaDestination;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/TempKahaDBStore", "getStoredDestination", "(Lorg/apache/activemq/store/kahadb/data/KahaDestination;Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Lorg/apache/activemq/store/kahadb/TempMessageDatabase$StoredDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempMessageDatabase$StoredDestination", "subscriptionAcks", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore$4", "val$subscriptionKey", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "get", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Long");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LADD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempMessageDatabase$StoredDestination", "orderIndex", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "iterator", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/lang/Object;)Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/activemq/store/kahadb/TempMessageDatabase$StoredDestination", "java/lang/Long", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore$4", "val$listener", "Lorg/apache/activemq/store/MessageRecoveryListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore$4", "this$1", "Lorg/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempKahaDBStore$KahaDBTopicMessageStore", "this$0", "Lorg/apache/activemq/store/kahadb/TempKahaDBStore;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/TempKahaDBStore", "access$000", "(Lorg/apache/activemq/store/kahadb/TempKahaDBStore;)Lorg/apache/activemq/wireformat/WireFormat;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/TempMessageDatabase$MessageRecord");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/TempMessageDatabase$MessageRecord", "data", "Lorg/apache/activemq/util/ByteSequence;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/wireformat/WireFormat", "unmarshal", "(Lorg/apache/activemq/util/ByteSequence;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/Message");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/MessageRecoveryListener", "recoverMessage", "(Lorg/apache/activemq/command/Message;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
