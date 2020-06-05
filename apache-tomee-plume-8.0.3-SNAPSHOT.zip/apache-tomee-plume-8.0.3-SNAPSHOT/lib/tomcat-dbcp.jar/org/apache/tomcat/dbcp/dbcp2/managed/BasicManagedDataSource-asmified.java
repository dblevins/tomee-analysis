package asm.org.apache.tomcat.dbcp.dbcp2.managed;
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
public class BasicManagedDataSourceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", null, "org/apache/tomcat/dbcp/dbcp2/BasicDataSource", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "transactionRegistry", "Lorg/apache/tomcat/dbcp/dbcp2/managed/TransactionRegistry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "transactionManager", "Ljakarta/transaction/TransactionManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xaDataSource", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xaDataSourceInstance", "Ljavax/sql/XADataSource;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "transactionSynchronizationRegistry", "Ljakarta/transaction/TransactionSynchronizationRegistry;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/BasicDataSource", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "getXaDataSourceInstance", "()Ljavax/sql/XADataSource;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "xaDataSourceInstance", "Ljavax/sql/XADataSource;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "setXaDataSourceInstance", "(Ljavax/sql/XADataSource;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "xaDataSourceInstance", "Ljavax/sql/XADataSource;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource"});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "javax/sql/XADataSource"}, 2, new Object[] {"org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "java/lang/String"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "xaDataSource", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransactionManager", "()Ljakarta/transaction/TransactionManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "transactionManager", "Ljakarta/transaction/TransactionManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransactionSynchronizationRegistry", "()Ljakarta/transaction/TransactionSynchronizationRegistry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "transactionSynchronizationRegistry", "Ljakarta/transaction/TransactionSynchronizationRegistry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_SYNCHRONIZED, "getTransactionRegistry", "()Lorg/apache/tomcat/dbcp/dbcp2/managed/TransactionRegistry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "transactionRegistry", "Lorg/apache/tomcat/dbcp/dbcp2/managed/TransactionRegistry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTransactionManager", "(Ljakarta/transaction/TransactionManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "transactionManager", "Ljakarta/transaction/TransactionManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTransactionSynchronizationRegistry", "(Ljakarta/transaction/TransactionSynchronizationRegistry;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "transactionSynchronizationRegistry", "Ljakarta/transaction/TransactionSynchronizationRegistry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "getXADataSource", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "xaDataSource", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "setXADataSource", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "xaDataSource", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createConnectionFactory", "()Lorg/apache/tomcat/dbcp/dbcp2/ConnectionFactory;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "transactionManager", "Ljakarta/transaction/TransactionManager;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitTypeInsn(NEW, "java/sql/SQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Transaction manager must be set before a connection can be created");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/sql/SQLException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "xaDataSource", "Ljava/lang/String;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/BasicDataSource", "createConnectionFactory", "()Lorg/apache/tomcat/dbcp/dbcp2/ConnectionFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/managed/LocalXAConnectionFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getTransactionManager", "()Ljakarta/transaction/TransactionManager;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/managed/LocalXAConnectionFactory", "<init>", "(Ljakarta/transaction/TransactionManager;Lorg/apache/tomcat/dbcp/dbcp2/ConnectionFactory;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/dbcp2/managed/XAConnectionFactory", "getTransactionRegistry", "()Lorg/apache/tomcat/dbcp/dbcp2/managed/TransactionRegistry;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "transactionRegistry", "Lorg/apache/tomcat/dbcp/dbcp2/managed/TransactionRegistry;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "xaDataSourceInstance", "Ljavax/sql/XADataSource;");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label8);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "xaDataSource", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "java/lang/Class"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Cannot load XA data source class '");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "xaDataSource", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("'");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/sql/SQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/sql/SQLException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getConstructor", "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "newInstance", "([Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/sql/XADataSource");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "xaDataSourceInstance", "Ljavax/sql/XADataSource;");
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Cannot create XA data source of class '");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "xaDataSource", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("'");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/sql/SQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/sql/SQLException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/managed/DataSourceXAConnectionFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getTransactionManager", "()Ljakarta/transaction/TransactionManager;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "xaDataSourceInstance", "Ljavax/sql/XADataSource;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getUsername", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getPassword", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/dbcp2/Utils", "toCharArray", "(Ljava/lang/String;)[C", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getTransactionSynchronizationRegistry", "()Ljakarta/transaction/TransactionSynchronizationRegistry;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/managed/DataSourceXAConnectionFactory", "<init>", "(Ljakarta/transaction/TransactionManager;Ljavax/sql/XADataSource;Ljava/lang/String;[CLjakarta/transaction/TransactionSynchronizationRegistry;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/dbcp2/managed/XAConnectionFactory", "getTransactionRegistry", "()Lorg/apache/tomcat/dbcp/dbcp2/managed/TransactionRegistry;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "transactionRegistry", "Lorg/apache/tomcat/dbcp/dbcp2/managed/TransactionRegistry;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createDataSourceInstance", "()Ljavax/sql/DataSource;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/managed/ManagedDataSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getConnectionPool", "()Lorg/apache/tomcat/dbcp/pool2/impl/GenericObjectPool;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "transactionRegistry", "Lorg/apache/tomcat/dbcp/dbcp2/managed/TransactionRegistry;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/managed/ManagedDataSource", "<init>", "(Lorg/apache/tomcat/dbcp/pool2/ObjectPool;Lorg/apache/tomcat/dbcp/dbcp2/managed/TransactionRegistry;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "isAccessToUnderlyingConnectionAllowed", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolingDataSource", "setAccessToUnderlyingConnectionAllowed", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createPoolableConnectionFactory", "(Lorg/apache/tomcat/dbcp/dbcp2/ConnectionFactory;)Lorg/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/RuntimeException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/Exception");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/managed/PoolableManagedConnectionFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/dbcp/dbcp2/managed/XAConnectionFactory");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getRegisteredJmxName", "()Ljavax/management/ObjectName;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/managed/PoolableManagedConnectionFactory", "<init>", "(Lorg/apache/tomcat/dbcp/dbcp2/managed/XAConnectionFactory;Ljavax/management/ObjectName;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getValidationQuery", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setValidationQuery", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getValidationQueryTimeout", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setValidationQueryTimeout", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getConnectionInitSqls", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setConnectionInitSql", "(Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getDefaultReadOnly", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setDefaultReadOnly", "(Ljava/lang/Boolean;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getDefaultAutoCommit", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setDefaultAutoCommit", "(Ljava/lang/Boolean;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getDefaultTransactionIsolation", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setDefaultTransactionIsolation", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getDefaultCatalog", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setDefaultCatalog", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getDefaultSchema", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setDefaultSchema", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getCacheState", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setCacheState", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "isPoolPreparedStatements", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setPoolStatements", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getMaxOpenPreparedStatements", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setMaxOpenPreparedStatements", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getMaxConnLifetimeMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setMaxConnLifetimeMillis", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getRollbackOnReturn", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setRollbackOnReturn", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getAutoCommitOnReturn", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setAutoCommitOnReturn", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getDefaultQueryTimeout", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setDefaultQueryTimeout", "(Ljava/lang/Integer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getFastFailValidation", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setFastFailValidation", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "getDisconnectionSqlCodes", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setDisconnectionSqlCodes", "(Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "validateConnectionFactory", "(Lorg/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory;)V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/tomcat/dbcp/dbcp2/managed/BasicManagedDataSource", "org/apache/tomcat/dbcp/dbcp2/ConnectionFactory", "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory"}, 1, new Object[] {"java/lang/RuntimeException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/sql/SQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Cannot create PoolableConnectionFactory (");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(")");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/sql/SQLException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
