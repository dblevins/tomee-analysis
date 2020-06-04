package asm.org.apache.openejb.resource.jdbc.dbcp;
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
public class BasicManagedDataSource$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/resource/jdbc/dbcp/BasicManagedDataSource$1", "Lorg/apache/commons/dbcp2/managed/ManagedDataSource<Lorg/apache/commons/dbcp2/PoolableConnection;>;", "org/apache/commons/dbcp2/managed/ManagedDataSource", null);

classWriter.visitOuterClass("org/apache/openejb/resource/jdbc/dbcp/BasicManagedDataSource", "createDataSourceInstance", "()Ljavax/sql/DataSource;");

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/dbcp/BasicManagedDataSource$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/dbcp/BasicManagedDataSource$1$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$transactionRegistry", "Lorg/apache/commons/dbcp2/managed/TransactionRegistry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/resource/jdbc/dbcp/BasicManagedDataSource;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/resource/jdbc/dbcp/BasicManagedDataSource;Lorg/apache/commons/pool2/ObjectPool;Lorg/apache/commons/dbcp2/managed/TransactionRegistry;Lorg/apache/commons/dbcp2/managed/TransactionRegistry;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/jdbc/dbcp/BasicManagedDataSource$1", "this$0", "Lorg/apache/openejb/resource/jdbc/dbcp/BasicManagedDataSource;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/jdbc/dbcp/BasicManagedDataSource$1", "val$transactionRegistry", "Lorg/apache/commons/dbcp2/managed/TransactionRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/dbcp2/managed/ManagedDataSource", "<init>", "(Lorg/apache/commons/pool2/ObjectPool;Lorg/apache/commons/dbcp2/managed/TransactionRegistry;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnection", "()Ljava/sql/Connection;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/resource/jdbc/dbcp/BasicManagedDataSource$1$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/jdbc/dbcp/BasicManagedDataSource$1", "getPool", "()Lorg/apache/commons/pool2/ObjectPool;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/dbcp/BasicManagedDataSource$1", "val$transactionRegistry", "Lorg/apache/commons/dbcp2/managed/TransactionRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/jdbc/dbcp/BasicManagedDataSource$1", "isAccessToUnderlyingConnectionAllowed", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/jdbc/dbcp/BasicManagedDataSource$1$1", "<init>", "(Lorg/apache/openejb/resource/jdbc/dbcp/BasicManagedDataSource$1;Lorg/apache/commons/pool2/ObjectPool;Lorg/apache/commons/dbcp2/managed/TransactionRegistry;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
