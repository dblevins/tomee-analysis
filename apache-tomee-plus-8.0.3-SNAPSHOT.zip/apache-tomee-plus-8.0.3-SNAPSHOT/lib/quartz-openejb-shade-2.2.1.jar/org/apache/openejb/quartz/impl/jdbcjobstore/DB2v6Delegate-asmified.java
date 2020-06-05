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
public class DB2v6DelegateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", null, "org/apache/openejb/quartz/impl/jdbcjobstore/StdJDBCDelegate", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_NUM_JOBS", "Ljava/lang/String;", null, "SELECT COUNT(*) FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_NUM_TRIGGERS_FOR_JOB", "Ljava/lang/String;", null, "SELECT COUNT(*) FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_NUM_TRIGGERS", "Ljava/lang/String;", null, "SELECT COUNT(*) FROM {0}TRIGGERS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_NUM_CALENDARS", "Ljava/lang/String;", null, "SELECT COUNT(*) FROM {0}CALENDARS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/jdbcjobstore/StdJDBCDelegate", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectNumJobs", "(Ljava/sql/Connection;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SELECT COUNT(*) FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1}");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "rtp", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Connection", "prepareStatement", "(Ljava/lang/String;)Ljava/sql/PreparedStatement;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/PreparedStatement", "executeQuery", "()Ljava/sql/ResultSet;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/ResultSet", "next", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/ResultSet", "getInt", "(I)I", true);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/sql/PreparedStatement", "java/sql/ResultSet", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeResultSet", "(Ljava/sql/ResultSet;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeStatement", "(Ljava/sql/Statement;)V", false);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "java/sql/Connection", "java/sql/PreparedStatement", "java/sql/ResultSet"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeResultSet", "(Ljava/sql/ResultSet;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeStatement", "(Ljava/sql/Statement;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectNumTriggersForJob", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/JobKey;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, null);
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label2, label5, label2, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SELECT COUNT(*) FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "rtp", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Connection", "prepareStatement", "(Ljava/lang/String;)Ljava/sql/PreparedStatement;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/JobKey", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/PreparedStatement", "setString", "(ILjava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/JobKey", "getGroup", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/PreparedStatement", "setString", "(ILjava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/PreparedStatement", "executeQuery", "()Ljava/sql/ResultSet;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/ResultSet", "next", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/ResultSet", "getInt", "(I)I", true);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeResultSet", "(Ljava/sql/ResultSet;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeStatement", "(Ljava/sql/Statement;)V", false);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/sql/PreparedStatement", "java/sql/ResultSet"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeResultSet", "(Ljava/sql/ResultSet;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeStatement", "(Ljava/sql/Statement;)V", false);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeResultSet", "(Ljava/sql/ResultSet;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeStatement", "(Ljava/sql/Statement;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectNumTriggers", "(Ljava/sql/Connection;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SELECT COUNT(*) FROM {0}TRIGGERS WHERE SCHED_NAME = {1}");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "rtp", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Connection", "prepareStatement", "(Ljava/lang/String;)Ljava/sql/PreparedStatement;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/PreparedStatement", "executeQuery", "()Ljava/sql/ResultSet;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/ResultSet", "next", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/ResultSet", "getInt", "(I)I", true);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/sql/PreparedStatement", "java/sql/ResultSet", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeResultSet", "(Ljava/sql/ResultSet;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeStatement", "(Ljava/sql/Statement;)V", false);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "java/sql/Connection", "java/sql/PreparedStatement", "java/sql/ResultSet"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeResultSet", "(Ljava/sql/ResultSet;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeStatement", "(Ljava/sql/Statement;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectNumCalendars", "(Ljava/sql/Connection;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SELECT COUNT(*) FROM {0}CALENDARS WHERE SCHED_NAME = {1}");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "rtp", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Connection", "prepareStatement", "(Ljava/lang/String;)Ljava/sql/PreparedStatement;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/PreparedStatement", "executeQuery", "()Ljava/sql/ResultSet;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/ResultSet", "next", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/ResultSet", "getInt", "(I)I", true);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/sql/PreparedStatement", "java/sql/ResultSet", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeResultSet", "(Ljava/sql/ResultSet;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeStatement", "(Ljava/sql/Statement;)V", false);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "java/sql/Connection", "java/sql/PreparedStatement", "java/sql/ResultSet"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeResultSet", "(Ljava/sql/ResultSet;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/jdbcjobstore/DB2v6Delegate", "closeStatement", "(Ljava/sql/Statement;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}