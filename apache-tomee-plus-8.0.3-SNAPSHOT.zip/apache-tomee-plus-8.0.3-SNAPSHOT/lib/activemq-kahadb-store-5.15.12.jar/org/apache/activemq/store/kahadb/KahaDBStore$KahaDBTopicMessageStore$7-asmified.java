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
public class KahaDBStore$KahaDBTopicMessageStore$7Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "Ljava/lang/Object;Lorg/apache/activemq/store/kahadb/disk/page/Transaction$Closure<Ljava/lang/Exception;>;", "java/lang/Object", new String[] { "org/apache/activemq/store/kahadb/disk/page/Transaction$Closure" });

classWriter.visitOuterClass("org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "recoverNextMessages", "(Ljava/lang/String;Ljava/lang/String;ILorg/apache/activemq/store/MessageRecoveryListener;)V");

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "org/apache/activemq/store/kahadb/KahaDBStore", "KahaDBTopicMessageStore", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$LastAck", "org/apache/activemq/store/kahadb/MessageDatabase", "LastAck", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderCursor", "org/apache/activemq/store/kahadb/MessageDatabase", "MessageOrderCursor", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "org/apache/activemq/store/kahadb/MessageDatabase", "StoredDestination", 0);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$MessageKeys", "org/apache/activemq/store/kahadb/MessageDatabase", "MessageKeys", ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/page/Transaction$Closure", "org/apache/activemq/store/kahadb/disk/page/Transaction", "Closure", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex", "org/apache/activemq/store/kahadb/MessageDatabase", "MessageOrderIndex", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$subscriptionKey", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$maxReturned", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$listener", "Lorg/apache/activemq/store/MessageRecoveryListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;Ljava/lang/String;ILorg/apache/activemq/store/MessageRecoveryListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "this$1", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "val$subscriptionKey", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "val$maxReturned", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "val$listener", "Lorg/apache/activemq/store/MessageRecoveryListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "this$1", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "this$0", "Lorg/apache/activemq/store/kahadb/KahaDBStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "this$1", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "dest", "Lorg/apache/activemq/store/kahadb/data/KahaDestination;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "getStoredDestination", "(Lorg/apache/activemq/store/kahadb/data/KahaDestination;Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "orderIndex", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex", "resetCursorPosition", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "subscriptionCursors", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "val$subscriptionKey", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderCursor");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "this$1", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "this$0", "Lorg/apache/activemq/store/kahadb/KahaDBStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "val$subscriptionKey", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "getLastAck", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestination;Ljava/lang/String;)Lorg/apache/activemq/store/kahadb/MessageDatabase$LastAck;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "org/apache/activemq/store/kahadb/disk/page/Transaction", "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderCursor", "org/apache/activemq/store/kahadb/disk/util/SequenceSet", "org/apache/activemq/store/kahadb/MessageDatabase$LastAck"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "this$1", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "this$0", "Lorg/apache/activemq/store/kahadb/KahaDBStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "val$subscriptionKey", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "getSequenceSet", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestination;Ljava/lang/String;)Lorg/apache/activemq/store/kahadb/disk/util/SequenceSet;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/SequenceSet", "isEmpty", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/SequenceSet", "getHead", "()Lorg/apache/activemq/store/kahadb/disk/util/LinkedNode;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/disk/util/Sequence");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/Sequence", "getFirst", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$LastAck", "lastAckedSequence", "J");
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFGE, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "orderIndex", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/SequenceSet", "getHead", "()Lorg/apache/activemq/store/kahadb/disk/util/LinkedNode;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/disk/util/Sequence");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/Sequence", "getFirst", "()J", false);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex", "setBatch", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/lang/Long;)V", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "orderIndex", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex", "setBatch", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Lorg/apache/activemq/store/kahadb/MessageDatabase$LastAck;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "orderIndex", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex", "cursor", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderCursor;");
methodVisitor.visitVarInsn(ASTORE, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "orderIndex", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex", "cursor", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderCursor;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderCursor", "sync", "(Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderCursor;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "this$1", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "val$maxReturned", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "val$listener", "Lorg/apache/activemq/store/MessageRecoveryListener;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "recoverRolledBackAcks", "(Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestination;Lorg/apache/activemq/store/kahadb/disk/page/Transaction;ILorg/apache/activemq/store/MessageRecoveryListener;)I", false);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "orderIndex", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex", "iterator", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderCursor;)Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/util/Map$Entry", Opcodes.INTEGER, "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "this$1", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "this$0", "Lorg/apache/activemq/store/kahadb/KahaDBStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore", "ackedAndPrepared", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/MessageDatabase$MessageKeys");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$MessageKeys", "messageId", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "contains", "(Ljava/lang/Object;)Z", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Long");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/SequenceSet", "contains", "(J)Z", false);
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "val$listener", "Lorg/apache/activemq/store/MessageRecoveryListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "this$1", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "this$0", "Lorg/apache/activemq/store/kahadb/KahaDBStore;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/MessageDatabase$MessageKeys");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$MessageKeys", "location", "Lorg/apache/activemq/store/kahadb/disk/journal/Location;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "loadMessage", "(Lorg/apache/activemq/store/kahadb/disk/journal/Location;)Lorg/apache/activemq/command/Message;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/MessageRecoveryListener", "recoverMessage", "(Lorg/apache/activemq/command/Message;)Z", true);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "val$maxReturned", "I");
methodVisitor.visitJumpInsn(IF_ICMPGE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "val$listener", "Lorg/apache/activemq/store/MessageRecoveryListener;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/MessageRecoveryListener", "hasSpace", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "orderIndex", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex", "stoppedIterating", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "orderIndex", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderIndex", "cursor", "Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderCursor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/MessageDatabase$MessageOrderCursor", "copy", "()Lorg/apache/activemq/store/kahadb/MessageDatabase$MessageOrderCursor;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "subscriptionCursors", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$7", "val$subscriptionKey", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
