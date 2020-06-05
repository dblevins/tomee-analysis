package asm.org.apache.tomcat.dbcp.dbcp2;
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
public class PoolableConnectionFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "Ljava/lang/Object;Lorg/apache/tomcat/dbcp/pool2/PooledObjectFactory<Lorg/apache/tomcat/dbcp/dbcp2/PoolableConnection;>;", "java/lang/Object", new String[] { "org/apache/tomcat/dbcp/pool2/PooledObjectFactory" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/juli/logging/Log;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "UNKNOWN_TRANSACTION_ISOLATION", "I", null, new Integer(-1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "connectionFactory", "Lorg/apache/tomcat/dbcp/dbcp2/ConnectionFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "dataSourceJmxObjectName", "Ljavax/management/ObjectName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "validationQuery", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "validationQueryTimeoutSeconds", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "connectionInitSqls", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "disconnectionSqlCodes", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "fastFailValidation", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "pool", "Lorg/apache/tomcat/dbcp/pool2/ObjectPool;", "Lorg/apache/tomcat/dbcp/pool2/ObjectPool<Lorg/apache/tomcat/dbcp/dbcp2/PoolableConnection;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "defaultReadOnly", "Ljava/lang/Boolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "defaultAutoCommit", "Ljava/lang/Boolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "autoCommitOnReturn", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "rollbackOnReturn", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "defaultTransactionIsolation", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "defaultCatalog", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "defaultSchema", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cacheState", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "poolStatements", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "maxOpenPreparedStatements", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "maxConnLifetimeMillis", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "connectionIndex", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "defaultQueryTimeoutSeconds", "Ljava/lang/Integer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/tomcat/dbcp/dbcp2/ConnectionFactory;Ljavax/management/ObjectName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "validationQueryTimeoutSeconds", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "fastFailValidation", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "autoCommitOnReturn", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "rollbackOnReturn", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultTransactionIsolation", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "maxOpenPreparedStatements", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "maxConnLifetimeMillis", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "connectionIndex", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "connectionFactory", "Lorg/apache/tomcat/dbcp/dbcp2/ConnectionFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "dataSourceJmxObjectName", "Ljavax/management/ObjectName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "activateObject", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject;)V", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject<Lorg/apache/tomcat/dbcp/dbcp2/PoolableConnection;>;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "validateLifetime", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/PooledObject", "getObject", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "activate", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultAutoCommit", "Ljava/lang/Boolean;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "getAutoCommit", "()Z", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultAutoCommit", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultAutoCommit", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "setAutoCommit", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/tomcat/dbcp/dbcp2/PoolableConnection"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultTransactionIsolation", "I");
methodVisitor.visitInsn(ICONST_M1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "getTransactionIsolation", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultTransactionIsolation", "I");
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultTransactionIsolation", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "setTransactionIsolation", "(I)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultReadOnly", "Ljava/lang/Boolean;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "isReadOnly", "()Z", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultReadOnly", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultReadOnly", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "setReadOnly", "(Z)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultCatalog", "Ljava/lang/String;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultCatalog", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "getCatalog", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultCatalog", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "setCatalog", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultSchema", "Ljava/lang/String;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultSchema", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/dbcp2/Jdbc41Bridge", "getSchema", "(Ljava/sql/Connection;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultSchema", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/dbcp2/Jdbc41Bridge", "setSchema", "(Ljava/sql/Connection;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultQueryTimeoutSeconds", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "setDefaultQueryTimeout", "(Ljava/lang/Integer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "destroyObject", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject;)V", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject<Lorg/apache/tomcat/dbcp/dbcp2/PoolableConnection;>;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/PooledObject", "getObject", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "reallyClose", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCacheState", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "cacheState", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionFactory", "()Lorg/apache/tomcat/dbcp/dbcp2/ConnectionFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "connectionFactory", "Lorg/apache/tomcat/dbcp/dbcp2/ConnectionFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getConnectionIndex", "()Ljava/util/concurrent/atomic/AtomicLong;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "connectionIndex", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionInitSqls", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "connectionInitSqls", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDataSourceJmxName", "()Ljavax/management/ObjectName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "dataSourceJmxObjectName", "Ljavax/management/ObjectName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDataSourceJmxObjectName", "()Ljavax/management/ObjectName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "dataSourceJmxObjectName", "Ljavax/management/ObjectName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultAutoCommit", "()Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultAutoCommit", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultCatalog", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultCatalog", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultQueryTimeout", "()Ljava/lang/Integer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultQueryTimeoutSeconds", "Ljava/lang/Integer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultQueryTimeoutSeconds", "()Ljava/lang/Integer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultQueryTimeoutSeconds", "Ljava/lang/Integer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultReadOnly", "()Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultReadOnly", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultSchema", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultSchema", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultTransactionIsolation", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultTransactionIsolation", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDisconnectionSqlCodes", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "disconnectionSqlCodes", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxConnLifetimeMillis", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "maxConnLifetimeMillis", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getMaxOpenPreparedStatements", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "maxOpenPreparedStatements", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "getPool", "()Lorg/apache/tomcat/dbcp/pool2/ObjectPool;", "()Lorg/apache/tomcat/dbcp/pool2/ObjectPool<Lorg/apache/tomcat/dbcp/dbcp2/PoolableConnection;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "pool", "Lorg/apache/tomcat/dbcp/pool2/ObjectPool;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPoolStatements", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "poolStatements", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValidationQuery", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "validationQuery", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValidationQueryTimeoutSeconds", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "validationQueryTimeoutSeconds", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initializeConnection", "(Ljava/sql/Connection;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Throwable");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label6, null);
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label7, label8, label9, "java/lang/Throwable");
Label label10 = new Label();
methodVisitor.visitTryCatchBlock(label5, label10, label6, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "connectionInitSqls", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Connection", "isClosed", "()Z", true);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitTypeInsn(NEW, "java/sql/SQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("initializeConnection: connection closed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/sql/SQLException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Collection"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label12);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Connection", "createStatement", "()Ljava/sql/Statement;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label13 = new Label();
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/sql/Statement", "java/lang/Throwable", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("null connectionInitSqls element");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "requireNonNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Statement", "execute", "(Ljava/lang/String;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Statement", "close", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Statement", "close", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label15);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label16);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Statement", "close", "()V", true);
methodVisitor.visitLabel(label8);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "java/sql/Connection", "java/util/Collection", "java/sql/Statement", "java/lang/Throwable", Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Statement", "close", "()V", true);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "java/sql/Connection", "java/util/Collection"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAutoCommitOnReturn", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "autoCommitOnReturn", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "isEnableAutoCommitOnReturn", "()Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "autoCommitOnReturn", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFastFailValidation", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "fastFailValidation", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isRollbackOnReturn", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "rollbackOnReturn", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "makeObject", "()Lorg/apache/tomcat/dbcp/pool2/PooledObject;", "()Lorg/apache/tomcat/dbcp/pool2/PooledObject<Lorg/apache/tomcat/dbcp/dbcp2/PoolableConnection;>;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "connectionFactory", "Lorg/apache/tomcat/dbcp/dbcp2/ConnectionFactory;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/dbcp2/ConnectionFactory", "createConnection", "()Ljava/sql/Connection;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Connection factory returned null from createConnection");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/sql/Connection"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "initializeConnection", "(Ljava/sql/Connection;)V", false);
methodVisitor.visitLabel(label1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/sql/SQLException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Connection", "close", "()V", true);
methodVisitor.visitLabel(label4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "java/sql/Connection", "java/sql/SQLException"}, 1, new Object[] {"java/sql/SQLException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "connectionIndex", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "getAndIncrement", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "poolStatements", "Z");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/PoolingConnection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/PoolingConnection", "<init>", "(Ljava/sql/Connection;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/pool2/impl/GenericKeyedObjectPoolConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/impl/GenericKeyedObjectPoolConfig", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/GenericKeyedObjectPoolConfig", "setMaxTotalPerKey", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/GenericKeyedObjectPoolConfig", "setBlockWhenExhausted", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/GenericKeyedObjectPoolConfig", "setMaxWaitMillis", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/GenericKeyedObjectPoolConfig", "setMaxIdlePerKey", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "maxOpenPreparedStatements", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/GenericKeyedObjectPoolConfig", "setMaxTotal", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "dataSourceJmxObjectName", "Ljavax/management/ObjectName;");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "dataSourceJmxObjectName", "Ljavax/management/ObjectName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/ObjectName", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn(",connectionpool=connections,connection=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "toString", "(J)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/GenericKeyedObjectPoolConfig", "setJmxNameBase", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn(",statementpool=statements");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/GenericKeyedObjectPoolConfig", "setJmxNamePrefix", "(Ljava/lang/String;)V", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.LONG, "org/apache/tomcat/dbcp/pool2/impl/GenericKeyedObjectPoolConfig"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/GenericKeyedObjectPoolConfig", "setJmxEnabled", "(Z)V", false);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/dbcp/dbcp2/PoolingConnection");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/pool2/impl/GenericKeyedObjectPool");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/impl/GenericKeyedObjectPool", "<init>", "(Lorg/apache/tomcat/dbcp/pool2/KeyedPooledObjectFactory;Lorg/apache/tomcat/dbcp/pool2/impl/GenericKeyedObjectPoolConfig;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolingConnection", "setStatementPool", "(Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "cacheState", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolingConnection", "setCacheState", "(Z)V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "dataSourceJmxObjectName", "Ljavax/management/ObjectName;");
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label11);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/management/ObjectName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "dataSourceJmxObjectName", "Ljavax/management/ObjectName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/ObjectName", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(",connectionpool=connections,connection=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/ObjectName", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/management/ObjectName"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "pool", "Lorg/apache/tomcat/dbcp/pool2/ObjectPool;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "disconnectionSqlCodes", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "fastFailValidation", "Z");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "<init>", "(Ljava/sql/Connection;Lorg/apache/tomcat/dbcp/pool2/ObjectPool;Ljavax/management/ObjectName;Ljava/util/Collection;Z)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "cacheState", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "setCacheState", "(Z)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/pool2/impl/DefaultPooledObject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/impl/DefaultPooledObject", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "passivateObject", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject;)V", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject<Lorg/apache/tomcat/dbcp/dbcp2/PoolableConnection;>;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "validateLifetime", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/PooledObject", "getObject", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "rollbackOnReturn", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "getAutoCommit", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "isReadOnly", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "rollback", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "java/lang/Boolean"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "clearWarnings", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "autoCommitOnReturn", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "getAutoCommit", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "setAutoCommit", "(Z)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "passivate", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAutoCommitOnReturn", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "autoCommitOnReturn", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCacheState", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "cacheState", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionInitSql", "(Ljava/util/Collection;)V", "(Ljava/util/Collection<Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "connectionInitSqls", "Ljava/util/Collection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultAutoCommit", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultAutoCommit", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultCatalog", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultCatalog", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultQueryTimeout", "(Ljava/lang/Integer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultQueryTimeoutSeconds", "Ljava/lang/Integer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultReadOnly", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultReadOnly", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultSchema", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultSchema", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultTransactionIsolation", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "defaultTransactionIsolation", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDisconnectionSqlCodes", "(Ljava/util/Collection;)V", "(Ljava/util/Collection<Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "disconnectionSqlCodes", "Ljava/util/Collection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "setEnableAutoCommitOnReturn", "(Z)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "autoCommitOnReturn", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFastFailValidation", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "fastFailValidation", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxConnLifetimeMillis", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "maxConnLifetimeMillis", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxOpenPreparedStatements", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "maxOpenPreparedStatements", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "setMaxOpenPrepatedStatements", "(I)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "setMaxOpenPreparedStatements", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "setPool", "(Lorg/apache/tomcat/dbcp/pool2/ObjectPool;)V", "(Lorg/apache/tomcat/dbcp/pool2/ObjectPool<Lorg/apache/tomcat/dbcp/dbcp2/PoolableConnection;>;)V", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "pool", "Lorg/apache/tomcat/dbcp/pool2/ObjectPool;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "pool", "Lorg/apache/tomcat/dbcp/pool2/ObjectPool;");
methodVisitor.visitJumpInsn(IF_ACMPEQ, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "pool", "Lorg/apache/tomcat/dbcp/pool2/ObjectPool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/ObjectPool", "close", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "pool", "Lorg/apache/tomcat/dbcp/pool2/ObjectPool;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPoolStatements", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "poolStatements", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRollbackOnReturn", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "rollbackOnReturn", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValidationQuery", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "validationQuery", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValidationQueryTimeout", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "validationQueryTimeoutSeconds", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateConnection", "(Lorg/apache/tomcat/dbcp/dbcp2/PoolableConnection;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "isClosed", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/sql/SQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("validateConnection: connection closed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/sql/SQLException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "validationQuery", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "validationQueryTimeoutSeconds", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection", "validate", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "validateLifetime", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject;)V", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject<Lorg/apache/tomcat/dbcp/dbcp2/PoolableConnection;>;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "maxConnLifetimeMillis", "J");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/PooledObject", "getCreateTime", "()J", true);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "maxConnLifetimeMillis", "J");
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/LifetimeExceededException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("connectionFactory.lifetimeExceeded");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "maxConnLifetimeMillis", "J");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/dbcp2/Utils", "getMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/LifetimeExceededException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateObject", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject;)Z", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject<Lorg/apache/tomcat/dbcp/dbcp2/PoolableConnection;>;)Z", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "validateLifetime", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/PooledObject", "getObject", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/dbcp/dbcp2/PoolableConnection");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "validateConnection", "(Lorg/apache/tomcat/dbcp/dbcp2/PoolableConnection;)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "isDebugEnabled", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitLdcInsn("poolableConnectionFactory.validateObject.fail");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/dbcp2/Utils", "getMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "debug", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Exception"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/juli/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/dbcp/dbcp2/PoolableConnectionFactory", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
