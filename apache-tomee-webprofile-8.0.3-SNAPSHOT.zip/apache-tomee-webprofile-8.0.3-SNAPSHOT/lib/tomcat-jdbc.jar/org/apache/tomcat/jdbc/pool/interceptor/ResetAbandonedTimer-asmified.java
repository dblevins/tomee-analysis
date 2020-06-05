package asm.org.apache.tomcat.jdbc.pool.interceptor;
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
public class ResetAbandonedTimerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", null, "org/apache/tomcat/jdbc/pool/interceptor/AbstractQueryReport", new String[] { "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimerMBean" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "pcon", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "oname", "Ljavax/management/ObjectName;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/jdbc/pool/interceptor/AbstractQueryReport", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "(Lorg/apache/tomcat/jdbc/pool/ConnectionPool;Lorg/apache/tomcat/jdbc/pool/PooledConnection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/jdbc/pool/interceptor/AbstractQueryReport", "reset", "(Lorg/apache/tomcat/jdbc/pool/ConnectionPool;Lorg/apache/tomcat/jdbc/pool/PooledConnection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "pcon", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "oname", "Ljavax/management/ObjectName;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/jdbc/pool/jmx/JmxUtil", "unregisterJmx", "(Ljavax/management/ObjectName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "pcon", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn(",JdbcInterceptor=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "pcon", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/PooledConnection", "getObjectName", "()Ljavax/management/ObjectName;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/jdbc/pool/jmx/JmxUtil", "registerJmx", "(Ljavax/management/ObjectName;Ljava/lang/String;Ljava/lang/Object;)Ljavax/management/ObjectName;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resetTimer", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "pcon", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "pcon", "Lorg/apache/tomcat/jdbc/pool/PooledConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/PooledConnection", "setTimestamp", "(J)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "java/lang/Throwable" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/jdbc/pool/interceptor/AbstractQueryReport", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "resetTimer", "()Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "prepareCall", "(Ljava/lang/String;J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "resetTimer", "()Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "prepareStatement", "(Ljava/lang/String;J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "resetTimer", "()Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "closeInvoked", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "resetTimer", "()Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "reportQuery", "(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;JJ)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "resetTimer", "()Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/jdbc/pool/interceptor/AbstractQueryReport", "reportQuery", "(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;JJ)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "reportSlowQuery", "(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;JJ)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/interceptor/ResetAbandonedTimer", "resetTimer", "()Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/jdbc/pool/interceptor/AbstractQueryReport", "reportSlowQuery", "(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;JJ)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
