package asm.org.hsqldb.jdbc;
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
public class JDBCStatementBaseDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/hsqldb/jdbc/JDBCStatementBase", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_VOLATILE, "isClosed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "isEscapeProcessing", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "connection", "Lorg/hsqldb/jdbc/JDBCConnection;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "maxRows", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "fetchSize", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "fetchDirection", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "resultIn", "Lorg/hsqldb/result/Result;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "errorResult", "Lorg/hsqldb/result/Result;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "generatedResult", "Lorg/hsqldb/result/Result;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "rsProperties", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "resultOut", "Lorg/hsqldb/result/Result;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "batchResultOut", "Lorg/hsqldb/result/Result;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "currentResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "generatedResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "rootWarning", "Ljava/sql/SQLWarning;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "resultSetCounter", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "queryTimeout", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "connectionIncarnation", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CLOSE_CURRENT_RESULT", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "KEEP_CURRENT_RESULT", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CLOSE_ALL_RESULTS", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SUCCESS_NO_INFO", "I", null, new Integer(-2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "EXECUTE_FAILED", "I", null, new Integer(-3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "RETURN_GENERATED_KEYS", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "NO_GENERATED_KEYS", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "isEscapeProcessing", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "fetchSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "fetchDirection", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "close", "()V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "checkClosed", "()V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "isClosed", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitIntInsn(SIPUSH, 1251);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/jdbc/JDBCUtil", "sqlException", "(I)Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "connection", "Lorg/hsqldb/jdbc/JDBCConnection;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCConnection", "isClosed", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCStatementBase", "close", "()V", false);
methodVisitor.visitIntInsn(SIPUSH, 1353);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/jdbc/JDBCUtil", "sqlException", "(I)Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "connectionIncarnation", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "connection", "Lorg/hsqldb/jdbc/JDBCConnection;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCConnection", "incarnation", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label2);
methodVisitor.visitIntInsn(SIPUSH, 1353);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/jdbc/JDBCUtil", "sqlException", "(I)Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "performPostExecute", "()V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "resultOut", "Lorg/hsqldb/result/Result;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/result/Result", "clearLobResults", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "generatedResult", "Lorg/hsqldb/result/Result;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "resultIn", "Lorg/hsqldb/result/Result;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "rootWarning", "Ljava/sql/SQLWarning;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "resultIn", "Lorg/hsqldb/result/Result;");
methodVisitor.visitVarInsn(ASTORE, 1);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/hsqldb/result/Result"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/result/Result", "getChainedResult", "()Lorg/hsqldb/result/Result;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/result/Result", "getUnlinkChainedResult", "()Lorg/hsqldb/result/Result;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/result/Result", "getType", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 19);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/jdbc/JDBCUtil", "sqlWarning", "(Lorg/hsqldb/result/Result;)Ljava/sql/SQLWarning;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "rootWarning", "Ljava/sql/SQLWarning;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "rootWarning", "Ljava/sql/SQLWarning;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/sql/SQLWarning"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "rootWarning", "Ljava/sql/SQLWarning;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/sql/SQLWarning", "setNextWarning", "(Ljava/sql/SQLWarning;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/result/Result", "getType", "()I", false);
methodVisitor.visitInsn(ICONST_2);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "errorResult", "Lorg/hsqldb/result/Result;");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/result/Result", "getType", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 20);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "generatedResult", "Lorg/hsqldb/result/Result;");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/result/Result", "getType", "()I", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "resultIn", "Lorg/hsqldb/result/Result;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/result/Result", "addChainedResult", "(Lorg/hsqldb/result/Result;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "rootWarning", "Ljava/sql/SQLWarning;");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "connection", "Lorg/hsqldb/jdbc/JDBCConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "rootWarning", "Ljava/sql/SQLWarning;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCConnection", "setWarnings", "(Ljava/sql/SQLWarning;)V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getUpdateCount", "()I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCStatementBase", "checkClosed", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "resultIn", "Lorg/hsqldb/result/Result;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "resultIn", "Lorg/hsqldb/result/Result;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/result/Result", "isData", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_M1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "resultIn", "Lorg/hsqldb/result/Result;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/result/Result", "getUpdateCount", "()I", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getResultSet", "()Ljava/sql/ResultSet;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCStatementBase", "checkClosed", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "currentResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "connection", "Lorg/hsqldb/jdbc/JDBCConnection;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCConnection", "isCloseResultSet", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "currentResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/sql/ResultSet"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "resultOut", "Lorg/hsqldb/result/Result;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/result/Result", "getStatementType", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/jdbc/JDBCResultSet", "newEptyResultSet", "()Lorg/hsqldb/jdbc/JDBCResultSet;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getMoreResults", "()Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCStatementBase", "getMoreResults", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getMoreResults", "(I)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCStatementBase", "checkClosed", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "resultIn", "Lorg/hsqldb/result/Result;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "resultIn", "Lorg/hsqldb/result/Result;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/result/Result", "getChainedResult", "()Lorg/hsqldb/result/Result;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "resultIn", "Lorg/hsqldb/result/Result;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "currentResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "currentResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCResultSet", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "currentResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "resultIn", "Lorg/hsqldb/result/Result;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/jdbc/JDBCResultSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "connection", "Lorg/hsqldb/jdbc/JDBCConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "resultIn", "Lorg/hsqldb/result/Result;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "resultIn", "Lorg/hsqldb/result/Result;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/result/Result", "metaData", "Lorg/hsqldb/result/ResultMetaData;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/jdbc/JDBCResultSet", "<init>", "(Lorg/hsqldb/jdbc/JDBCConnection;Lorg/hsqldb/jdbc/JDBCStatementBase;Lorg/hsqldb/result/Result;Lorg/hsqldb/result/ResultMetaData;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "currentResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getGeneratedResultSet", "()Ljava/sql/ResultSet;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "generatedResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "generatedResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCResultSet", "close", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "generatedResult", "Lorg/hsqldb/result/Result;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/result/Result", "emptyGeneratedResult", "Lorg/hsqldb/result/Result;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "generatedResult", "Lorg/hsqldb/result/Result;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/jdbc/JDBCResultSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "connection", "Lorg/hsqldb/jdbc/JDBCConnection;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "generatedResult", "Lorg/hsqldb/result/Result;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "generatedResult", "Lorg/hsqldb/result/Result;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/result/Result", "metaData", "Lorg/hsqldb/result/ResultMetaData;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/jdbc/JDBCResultSet", "<init>", "(Lorg/hsqldb/jdbc/JDBCConnection;Lorg/hsqldb/jdbc/JDBCStatementBase;Lorg/hsqldb/result/Result;Lorg/hsqldb/result/ResultMetaData;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "generatedResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "generatedResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "closeResultData", "()V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "currentResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "currentResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCResultSet", "close", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "generatedResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "generatedResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCResultSet", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "generatedResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "generatedResult", "Lorg/hsqldb/result/Result;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "resultIn", "Lorg/hsqldb/result/Result;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/JDBCStatementBase", "currentResultSet", "Lorg/hsqldb/jdbc/JDBCResultSet;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "closeOnCompletion", "()V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCStatementBase", "checkClosed", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isCloseOnCompletion", "()Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCStatementBase", "checkClosed", "()V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
