package asm.org.apache.activemq.store.kahadb.scheduler;
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
public class JobSchedulerStoreImpl$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl$2", "Ljava/lang/Object;Lorg/apache/activemq/store/kahadb/disk/page/Transaction$Closure<Ljava/io/IOException;>;", "java/lang/Object", new String[] { "org/apache/activemq/store/kahadb/disk/page/Transaction$Closure" });

classWriter.visitOuterClass("org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl", "removeJobScheduler", "(Ljava/lang/String;)Z");

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl$2", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/page/Transaction$Closure", "org/apache/activemq/store/kahadb/disk/page/Transaction", "Closure", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$js", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;Ljava/lang/String;Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl$2", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl$2", "val$name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl$2", "val$js", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl$2", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl", "access$000", "(Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;)Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "getJobSchedulers", "()Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl$2", "val$name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "remove", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl$2", "val$js", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerImpl", "removeAll", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}