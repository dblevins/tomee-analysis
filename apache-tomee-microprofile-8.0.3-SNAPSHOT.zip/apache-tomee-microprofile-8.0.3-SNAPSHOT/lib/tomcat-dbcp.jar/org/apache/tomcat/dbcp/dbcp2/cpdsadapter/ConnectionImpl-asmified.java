package asm.org.apache.tomcat.dbcp.dbcp2.cpdsadapter;
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
public class ConnectionImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "Lorg/apache/tomcat/dbcp/dbcp2/DelegatingConnection<Ljava/sql/Connection;>;", "org/apache/tomcat/dbcp/dbcp2/DelegatingConnection", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "accessToUnderlyingConnectionAllowed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "pooledConnection", "Lorg/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl;Ljava/sql/Connection;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/DelegatingConnection", "<init>", "(Ljava/sql/Connection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "pooledConnection", "Lorg/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "accessToUnderlyingConnectionAllowed", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "isClosedInternal", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "passivate", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "setClosedInternal", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "pooledConnection", "Lorg/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl", "notifyListeners", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "setClosedInternal", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "pooledConnection", "Lorg/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl", "notifyListeners", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepareCall", "(Ljava/lang/String;)Ljava/sql/CallableStatement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "checkOpen", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/DelegatingCallableStatement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "pooledConnection", "Lorg/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl", "prepareCall", "(Ljava/lang/String;)Ljava/sql/CallableStatement;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/DelegatingCallableStatement", "<init>", "(Lorg/apache/tomcat/dbcp/dbcp2/DelegatingConnection;Ljava/sql/CallableStatement;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/sql/SQLException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "handleException", "(Ljava/sql/SQLException;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepareCall", "(Ljava/lang/String;II)Ljava/sql/CallableStatement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "checkOpen", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/DelegatingCallableStatement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "pooledConnection", "Lorg/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl", "prepareCall", "(Ljava/lang/String;II)Ljava/sql/CallableStatement;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/DelegatingCallableStatement", "<init>", "(Lorg/apache/tomcat/dbcp/dbcp2/DelegatingConnection;Ljava/sql/CallableStatement;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/sql/SQLException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "handleException", "(Ljava/sql/SQLException;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepareCall", "(Ljava/lang/String;III)Ljava/sql/CallableStatement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "checkOpen", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/DelegatingCallableStatement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "pooledConnection", "Lorg/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl", "prepareCall", "(Ljava/lang/String;III)Ljava/sql/CallableStatement;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/DelegatingCallableStatement", "<init>", "(Lorg/apache/tomcat/dbcp/dbcp2/DelegatingConnection;Ljava/sql/CallableStatement;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/sql/SQLException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "handleException", "(Ljava/sql/SQLException;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepareStatement", "(Ljava/lang/String;)Ljava/sql/PreparedStatement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "checkOpen", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/DelegatingPreparedStatement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "pooledConnection", "Lorg/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl", "prepareStatement", "(Ljava/lang/String;)Ljava/sql/PreparedStatement;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/DelegatingPreparedStatement", "<init>", "(Lorg/apache/tomcat/dbcp/dbcp2/DelegatingConnection;Ljava/sql/PreparedStatement;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/sql/SQLException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "handleException", "(Ljava/sql/SQLException;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepareStatement", "(Ljava/lang/String;II)Ljava/sql/PreparedStatement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "checkOpen", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/DelegatingPreparedStatement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "pooledConnection", "Lorg/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl", "prepareStatement", "(Ljava/lang/String;II)Ljava/sql/PreparedStatement;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/DelegatingPreparedStatement", "<init>", "(Lorg/apache/tomcat/dbcp/dbcp2/DelegatingConnection;Ljava/sql/PreparedStatement;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/sql/SQLException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "handleException", "(Ljava/sql/SQLException;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepareStatement", "(Ljava/lang/String;III)Ljava/sql/PreparedStatement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "checkOpen", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/DelegatingPreparedStatement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "pooledConnection", "Lorg/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl", "prepareStatement", "(Ljava/lang/String;III)Ljava/sql/PreparedStatement;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/DelegatingPreparedStatement", "<init>", "(Lorg/apache/tomcat/dbcp/dbcp2/DelegatingConnection;Ljava/sql/PreparedStatement;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/sql/SQLException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "handleException", "(Ljava/sql/SQLException;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepareStatement", "(Ljava/lang/String;I)Ljava/sql/PreparedStatement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "checkOpen", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/DelegatingPreparedStatement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "pooledConnection", "Lorg/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl", "prepareStatement", "(Ljava/lang/String;I)Ljava/sql/PreparedStatement;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/DelegatingPreparedStatement", "<init>", "(Lorg/apache/tomcat/dbcp/dbcp2/DelegatingConnection;Ljava/sql/PreparedStatement;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/sql/SQLException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "handleException", "(Ljava/sql/SQLException;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepareStatement", "(Ljava/lang/String;[I)Ljava/sql/PreparedStatement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "checkOpen", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/DelegatingPreparedStatement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "pooledConnection", "Lorg/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl", "prepareStatement", "(Ljava/lang/String;[I)Ljava/sql/PreparedStatement;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/DelegatingPreparedStatement", "<init>", "(Lorg/apache/tomcat/dbcp/dbcp2/DelegatingConnection;Ljava/sql/PreparedStatement;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/sql/SQLException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "handleException", "(Ljava/sql/SQLException;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepareStatement", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/sql/PreparedStatement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "checkOpen", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/dbcp2/DelegatingPreparedStatement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "pooledConnection", "Lorg/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/PooledConnectionImpl", "prepareStatement", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/sql/PreparedStatement;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/DelegatingPreparedStatement", "<init>", "(Lorg/apache/tomcat/dbcp/dbcp2/DelegatingConnection;Ljava/sql/PreparedStatement;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/sql/SQLException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "handleException", "(Ljava/sql/SQLException;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAccessToUnderlyingConnectionAllowed", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "accessToUnderlyingConnectionAllowed", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDelegate", "()Ljava/sql/Connection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "isAccessToUnderlyingConnectionAllowed", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "getDelegateInternal", "()Ljava/sql/Connection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInnermostDelegate", "()Ljava/sql/Connection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/cpdsadapter/ConnectionImpl", "isAccessToUnderlyingConnectionAllowed", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/dbcp2/DelegatingConnection", "getInnermostDelegateInternal", "()Ljava/sql/Connection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
