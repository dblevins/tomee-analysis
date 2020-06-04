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
public class KahaDBTransactionStore$AddMessageCommandDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/activemq/store/kahadb/KahaDBTransactionStore$AddMessageCommand", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/KahaDBTransactionStore$AddMessageCommand", "org/apache/activemq/store/kahadb/KahaDBTransactionStore", "AddMessageCommand", ACC_PUBLIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ctx", "Lorg/apache/activemq/broker/ConnectionContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/KahaDBTransactionStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/kahadb/KahaDBTransactionStore;Lorg/apache/activemq/broker/ConnectionContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBTransactionStore$AddMessageCommand", "this$0", "Lorg/apache/activemq/store/kahadb/KahaDBTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/KahaDBTransactionStore$AddMessageCommand", "ctx", "Lorg/apache/activemq/broker/ConnectionContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "getMessage", "()Lorg/apache/activemq/command/Message;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "run", "()Ljava/util/concurrent/Future;", "()Ljava/util/concurrent/Future<Ljava/lang/Object;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/KahaDBTransactionStore$AddMessageCommand", "ctx", "Lorg/apache/activemq/broker/ConnectionContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/KahaDBTransactionStore$AddMessageCommand", "run", "(Lorg/apache/activemq/broker/ConnectionContext;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "run", "(Lorg/apache/activemq/broker/ConnectionContext;)Ljava/util/concurrent/Future;", "(Lorg/apache/activemq/broker/ConnectionContext;)Ljava/util/concurrent/Future<Ljava/lang/Object;>;", new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
