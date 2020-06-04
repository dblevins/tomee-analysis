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
public class JDBCResultSet$JDBCResultSetBasicDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/hsqldb/jdbc/JDBCResultSet$JDBCResultSetBasic", null, "org/hsqldb/jdbc/JDBCResultSet", null);

classWriter.visitInnerClass("org/hsqldb/jdbc/JDBCResultSet$JDBCResultSetBasic", "org/hsqldb/jdbc/JDBCResultSet", "JDBCResultSetBasic", ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/hsqldb/result/Result;Lorg/hsqldb/result/ResultMetaData;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/jdbc/JDBCResultSet", "<init>", "(Lorg/hsqldb/jdbc/JDBCConnection;Lorg/hsqldb/result/Result;Lorg/hsqldb/result/ResultMetaData;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getColumnInType", "(ILorg/hsqldb/types/Type;)Ljava/lang/Object;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCResultSet$JDBCResultSetBasic", "getCurrent", "()[Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCResultSet$JDBCResultSetBasic", "checkColumn", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCResultSet$JDBCResultSetBasic", "resultMetaData", "Lorg/hsqldb/result/ResultMetaData;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/result/ResultMetaData", "columnTypes", "[Lorg/hsqldb/types/Type;");
methodVisitor.visitIincInsn(1, -1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCResultSet$JDBCResultSetBasic", "trackNull", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljava/lang/Object;", "org/hsqldb/types/Type", "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitIntInsn(SIPUSH, 5561);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "error", "(I)Lorg/hsqldb/HsqlException;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/jdbc/JDBCUtil", "throwError", "(Lorg/hsqldb/HsqlException;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDate", "(I)Ljava/sql/Date;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_DATE", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCResultSet$JDBCResultSetBasic", "getColumnInType", "(ILorg/hsqldb/types/Type;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/sql/Date");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTime", "(I)Ljava/sql/Time;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_DATE", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCResultSet$JDBCResultSetBasic", "getColumnInType", "(ILorg/hsqldb/types/Type;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/sql/Time");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTimestamp", "(I)Ljava/sql/Timestamp;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_DATE", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCResultSet$JDBCResultSetBasic", "getColumnInType", "(ILorg/hsqldb/types/Type;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/sql/Timestamp");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBinaryStream", "(I)Ljava/io/InputStream;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/jdbc/JDBCUtil", "notSupported", "()Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCharacterStream", "(I)Ljava/io/Reader;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/jdbc/JDBCUtil", "notSupported", "()Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBlob", "(I)Ljava/sql/Blob;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCResultSet$JDBCResultSetBasic", "checkColumn", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCResultSet$JDBCResultSetBasic", "resultMetaData", "Lorg/hsqldb/result/ResultMetaData;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/result/ResultMetaData", "columnTypes", "[Lorg/hsqldb/types/Type;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCResultSet$JDBCResultSetBasic", "getColumnInType", "(ILorg/hsqldb/types/Type;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/hsqldb/types/Type", "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/sql/Blob");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "java/sql/Blob");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "[B");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/jdbc/JDBCBlob");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/jdbc/JDBCBlob", "<init>", "([B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(SIPUSH, 5561);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/jdbc/JDBCUtil", "sqlException", "(I)Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClob", "(I)Ljava/sql/Clob;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCResultSet$JDBCResultSetBasic", "checkColumn", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/JDBCResultSet$JDBCResultSetBasic", "resultMetaData", "Lorg/hsqldb/result/ResultMetaData;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/result/ResultMetaData", "columnTypes", "[Lorg/hsqldb/types/Type;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCResultSet$JDBCResultSetBasic", "getColumnInType", "(ILorg/hsqldb/types/Type;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/hsqldb/types/Type", "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/sql/Clob");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "java/sql/Clob");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/String");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/jdbc/JDBCClob");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/jdbc/JDBCClob", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(SIPUSH, 5561);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/jdbc/JDBCUtil", "sqlException", "(I)Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTime", "(ILjava/util/Calendar;)Ljava/sql/Time;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/jdbc/JDBCUtil", "notSupported", "()Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTimestamp", "(ILjava/util/Calendar;)Ljava/sql/Timestamp;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/jdbc/JDBCUtil", "notSupported", "()Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
