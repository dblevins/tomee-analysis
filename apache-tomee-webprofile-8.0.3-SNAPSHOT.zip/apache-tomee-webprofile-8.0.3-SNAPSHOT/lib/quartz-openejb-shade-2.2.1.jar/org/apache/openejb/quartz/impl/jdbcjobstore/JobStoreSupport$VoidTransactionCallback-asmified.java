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
public class JobStoreSupport$VoidTransactionCallbackDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$VoidTransactionCallback", "Ljava/lang/Object;Lorg/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$TransactionCallback<Ljava/lang/Void;>;", "java/lang/Object", new String[] { "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$TransactionCallback" });

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$VoidTransactionCallback", "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport", "VoidTransactionCallback", ACC_PROTECTED | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$TransactionCallback", "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport", "TransactionCallback", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$VoidTransactionCallback", "this$0", "Lorg/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "execute", "(Ljava/sql/Connection;)Ljava/lang/Void;", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$VoidTransactionCallback", "executeVoid", "(Ljava/sql/Connection;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "executeVoid", "(Ljava/sql/Connection;)V", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "execute", "(Ljava/sql/Connection;)Ljava/lang/Object;", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/JobStoreSupport$VoidTransactionCallback", "execute", "(Ljava/sql/Connection;)Ljava/lang/Void;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
