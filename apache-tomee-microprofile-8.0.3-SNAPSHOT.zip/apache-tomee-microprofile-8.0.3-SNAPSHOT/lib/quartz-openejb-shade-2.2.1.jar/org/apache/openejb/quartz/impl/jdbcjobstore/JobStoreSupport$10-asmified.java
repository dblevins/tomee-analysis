package asm.org.apache.openejb.quartz.impl.jdbcjobstore;
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
public class JobStoreSupport$10Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$10", null, "java/lang/Object", new String[] { "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$TransactionCallback" });

classWriter.visitOuterClass("org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport", "removeTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;)Z");

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$10", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$TransactionCallback", "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport", "TransactionCallback", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$triggerKey", "Lorg/apache/openejb/quartz/TriggerKey;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport;Lorg/apache/openejb/quartz/TriggerKey;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$10", "this$0", "Lorg/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$10", "val$triggerKey", "Lorg/apache/openejb/quartz/TriggerKey;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Ljava/sql/Connection;)Ljava/lang/Object;", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$10", "this$0", "Lorg/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$10", "val$triggerKey", "Lorg/apache/openejb/quartz/TriggerKey;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport", "removeTrigger", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/TriggerKey;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
