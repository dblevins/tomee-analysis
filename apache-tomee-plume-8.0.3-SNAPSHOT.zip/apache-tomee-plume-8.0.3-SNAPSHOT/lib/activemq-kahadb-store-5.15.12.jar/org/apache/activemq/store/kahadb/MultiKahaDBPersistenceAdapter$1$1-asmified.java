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
public class MultiKahaDBPersistenceAdapter$1$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$1$1", null, "java/lang/Object", new String[] { "javax/transaction/xa/Xid" });

classWriter.visitOuterClass("org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$1", "transform", "(Lorg/apache/activemq/command/TransactionId;)Lorg/apache/activemq/command/TransactionId;");

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$1$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$t", "Lorg/apache/activemq/command/LocalTransactionId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$1;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$1;Lorg/apache/activemq/command/LocalTransactionId;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$1$1", "this$1", "Lorg/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$1;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$1$1", "val$t", "Lorg/apache/activemq/command/LocalTransactionId;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFormatId", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$1$1", "this$1", "Lorg/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$1", "this$0", "Lorg/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter", "LOCAL_FORMAT_ID_MAGIC", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGlobalTransactionId", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$1$1", "val$t", "Lorg/apache/activemq/command/LocalTransactionId;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/LocalTransactionId", "getConnectionId", "()Lorg/apache/activemq/command/ConnectionId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ConnectionId", "getValue", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("utf-8");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/charset/Charset", "forName", "(Ljava/lang/String;)Ljava/nio/charset/Charset;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/nio/charset/Charset;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBranchQualifier", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/MultiKahaDBPersistenceAdapter$1$1", "val$t", "Lorg/apache/activemq/command/LocalTransactionId;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/LocalTransactionId", "getValue", "()J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "toString", "(J)Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("utf-8");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/charset/Charset", "forName", "(Ljava/lang/String;)Ljava/nio/charset/Charset;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/nio/charset/Charset;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
