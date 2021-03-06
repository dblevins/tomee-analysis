package asm.org.apache.tomcat.jdbc.pool;
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
public class ProxyConnectionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/jdbc/pool/ProxyConnection", null, "org/apache/tomcat/jdbc/pool/JdbcInterceptor", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "pool", "Lorg/apache/tomcat/jdbc/pool/ConnectionPool;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnection", "()Lorg/apache/tomcat/jdbc/pool/PooledConnection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnection", "(Lorg/apache/tomcat/jdbc/pool/PooledConnection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPool", "()Lorg/apache/tomcat/jdbc/pool/ConnectionPool;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "pool", "Lorg/apache/tomcat/jdbc/pool/ConnectionPool;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPool", "(Lorg/apache/tomcat/jdbc/pool/ConnectionPool;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "pool", "Lorg/apache/tomcat/jdbc/pool/ConnectionPool;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/tomcat/jdbc/pool/ConnectionPool;Lorg/apache/tomcat/jdbc/pool/PooledConnection;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/jdbc/pool/JdbcInterceptor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "pool", "Lorg/apache/tomcat/jdbc/pool/ConnectionPool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "pool", "Lorg/apache/tomcat/jdbc/pool/ConnectionPool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/ProxyConnection", "setUseEquals", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "(Lorg/apache/tomcat/jdbc/pool/ConnectionPool;Lorg/apache/tomcat/jdbc/pool/PooledConnection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "pool", "Lorg/apache/tomcat/jdbc/pool/ConnectionPool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isWrapperFor", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<*>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/sql/XAConnection;"));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/PooledConnection", "getXAConnection", "()Ljavax/sql/XAConnection;", false);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/PooledConnection", "getConnection", "()Ljava/sql/Connection;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unwrap", "(Ljava/lang/Class;)Ljava/lang/Object;", "(Ljava/lang/Class<*>;)Ljava/lang/Object;", new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/jdbc/pool/PooledConnection;"));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/sql/XAConnection;"));
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/PooledConnection", "getXAConnection", "()Ljavax/sql/XAConnection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/ProxyConnection", "isWrapperFor", "(Ljava/lang/Class;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/PooledConnection", "getConnection", "()Ljava/sql/Connection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/sql/SQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Not a wrapper of ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/sql/SQLException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "java/lang/Throwable" });
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
methodVisitor.visitTryCatchBlock(label6, label5, label5, "java/lang/Throwable");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("isClosed");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/ProxyConnection", "compare", "(Ljava/lang/String;Ljava/lang/reflect/Method;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/ProxyConnection", "isClosed", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("close");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/ProxyConnection", "compare", "(Ljava/lang/String;Ljava/lang/reflect/Method;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label9);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "pool", "Lorg/apache/tomcat/jdbc/pool/ConnectionPool;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/ConnectionPool", "returnConnection", "(Lorg/apache/tomcat/jdbc/pool/PooledConnection;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("toString");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/ProxyConnection", "compare", "(Ljava/lang/String;Ljava/lang/reflect/Method;)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/ProxyConnection", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("getConnection");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/ProxyConnection", "compare", "(Ljava/lang/String;Ljava/lang/reflect/Method;)Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/PooledConnection", "getConnection", "()Ljava/sql/Connection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getDeclaringClass", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/sql/XAConnection;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/PooledConnection", "getXAConnection", "()Ljavax/sql/XAConnection;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/reflect/InvocationTargetException");
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "getCause", "()Ljava/lang/Throwable;", false);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "getCause", "()Ljava/lang/Throwable;", false);
Label label15 = new Label();
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/ProxyConnection", "isClosed", "()Z", false);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label16);
methodVisitor.visitTypeInsn(NEW, "java/sql/SQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Connection has already been closed.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/sql/SQLException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("unwrap");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/ProxyConnection", "compare", "(Ljava/lang/String;Ljava/lang/reflect/Method;)Z", false);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label17);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/ProxyConnection", "unwrap", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("isWrapperFor");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/ProxyConnection", "compare", "(Ljava/lang/String;Ljava/lang/reflect/Method;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/ProxyConnection", "isWrapperFor", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/PooledConnection", "getConnection", "()Ljava/sql/Connection;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/tomcat/jdbc/pool/PooledConnection"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/sql/SQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Connection has already been closed.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/sql/SQLException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/tomcat/jdbc/pool/ProxyConnection", "java/lang/Object", "java/lang/reflect/Method", "[Ljava/lang/Object;"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/reflect/InvocationTargetException");
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label18);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "getCause", "()Ljava/lang/Throwable;", false);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label19);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "getCause", "()Ljava/lang/Throwable;", false);
Label label20 = new Label();
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isClosed", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/PooledConnection", "isDiscarded", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDelegateConnection", "()Lorg/apache/tomcat/jdbc/pool/PooledConnection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParentPool", "()Lorg/apache/tomcat/jdbc/pool/ConnectionPool;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "pool", "Lorg/apache/tomcat/jdbc/pool/ConnectionPool;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("ProxyConnection[");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/ProxyConnection", "connection", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/PooledConnection", "toString", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/StringBuilder"});
methodVisitor.visitLdcInsn("null");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/tomcat/jdbc/pool/ProxyConnection"}, 2, new Object[] {"java/lang/StringBuilder", "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
