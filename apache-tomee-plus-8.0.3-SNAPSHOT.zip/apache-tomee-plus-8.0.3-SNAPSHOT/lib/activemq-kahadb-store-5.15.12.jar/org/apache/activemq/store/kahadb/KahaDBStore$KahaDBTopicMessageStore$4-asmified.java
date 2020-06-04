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
public class KahaDBStore$KahaDBTopicMessageStore$4Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$4", "Ljava/lang/Object;Lorg/apache/activemq/store/kahadb/disk/page/Transaction$CallableClosure<Ljava/lang/Long;Ljava/io/IOException;>;", "java/lang/Object", new String[] { "org/apache/activemq/store/kahadb/disk/page/Transaction$CallableClosure" });

classWriter.visitOuterClass("org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "getMessageSize", "(Ljava/lang/String;Ljava/lang/String;)J");

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "org/apache/activemq/store/kahadb/KahaDBStore", "KahaDBTopicMessageStore", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$4", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "org/apache/activemq/store/kahadb/MessageDatabase", "StoredDestination", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MessageDatabase$LastAck", "org/apache/activemq/store/kahadb/MessageDatabase", "LastAck", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/page/Transaction$CallableClosure", "org/apache/activemq/store/kahadb/disk/page/Transaction", "CallableClosure", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$subscriptionKey", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$4", "this$1", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$4", "val$subscriptionKey", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Ljava/lang/Long;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$4", "this$1", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "this$0", "Lorg/apache/activemq/store/kahadb/KahaDBStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$4", "this$1", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "dest", "Lorg/apache/activemq/store/kahadb/data/KahaDestination;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "getStoredDestination", "(Lorg/apache/activemq/store/kahadb/data/KahaDestination;Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$4", "this$1", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "this$0", "Lorg/apache/activemq/store/kahadb/KahaDBStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$4", "val$subscriptionKey", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "getLastAck", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestination;Ljava/lang/String;)Lorg/apache/activemq/store/kahadb/MessageDatabase$LastAck;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/activemq/store/kahadb/MessageDatabase$StoredDestination", "org/apache/activemq/store/kahadb/MessageDatabase$LastAck"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$4", "this$1", "Lorg/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore", "this$0", "Lorg/apache/activemq/store/kahadb/KahaDBStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$4", "val$subscriptionKey", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore", "getStoredMessageSize", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Lorg/apache/activemq/store/kahadb/MessageDatabase$StoredDestination;Ljava/lang/String;)J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Ljava/lang/Object;", null, new String[] { "java/lang/Throwable" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBStore$KahaDBTopicMessageStore$4", "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Ljava/lang/Long;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
