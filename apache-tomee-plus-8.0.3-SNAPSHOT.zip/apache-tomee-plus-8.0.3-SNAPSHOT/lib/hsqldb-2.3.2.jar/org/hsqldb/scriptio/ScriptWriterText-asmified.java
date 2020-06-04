package asm.org.hsqldb.scriptio;
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
public class ScriptWriterTextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/hsqldb/scriptio/ScriptWriterText", null, "org/hsqldb/scriptio/ScriptWriterBase", null);

classWriter.visitInnerClass("org/hsqldb/lib/FileAccess$FileSync", "org/hsqldb/lib/FileAccess", "FileSync", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/hsqldb/HsqlNameManager$HsqlName", "org/hsqldb/HsqlNameManager", "HsqlName", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ISO_8859_1", "Ljava/lang/String;", null, "ISO-8859-1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "BYTES_LINE_SEP", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "BYTES_COMMIT", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "BYTES_INSERT_INTO", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "BYTES_VALUES", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "BYTES_TERM", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "BYTES_DELETE_FROM", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "BYTES_WHERE", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "BYTES_SEQUENCE", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "BYTES_SEQUENCE_MID", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "BYTES_C_ID_INIT", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "BYTES_C_ID_TERM", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "BYTES_SCHEMA", "[B", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/hsqldb/Database;Ljava/io/OutputStream;Lorg/hsqldb/lib/FileAccess$FileSync;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/scriptio/ScriptWriterBase", "<init>", "(Lorg/hsqldb/Database;Ljava/io/OutputStream;Lorg/hsqldb/lib/FileAccess$FileSync;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/hsqldb/Database;Ljava/lang/String;ZZZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/scriptio/ScriptWriterBase", "<init>", "(Lorg/hsqldb/Database;Ljava/lang/String;ZZZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/hsqldb/Database;Ljava/lang/String;ZZ)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/scriptio/ScriptWriterBase", "<init>", "(Lorg/hsqldb/Database;Ljava/lang/String;ZZZ)V", false);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/scriptio/ScriptWriterText", "isCompressed", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/zip/GZIPOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "fileStreamOut", "Ljava/io/OutputStream;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/zip/GZIPOutputStream", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/scriptio/ScriptWriterText", "fileStreamOut", "Ljava/io/OutputStream;");
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/hsqldb/scriptio/ScriptWriterText", "org/hsqldb/Database", "java/lang/String", Opcodes.INTEGER, Opcodes.INTEGER}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(SIPUSH, 452);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/IOException", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "outFile", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "error", "(Ljava/lang/Throwable;II[Ljava/lang/Object;)Lorg/hsqldb/HsqlException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initBuffers", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/rowio/RowOutputTextLog");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/rowio/RowOutputTextLog", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "writeDataTerm", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "writeSessionIdAndSchema", "(Lorg/hsqldb/Session;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "currentSession", "Lorg/hsqldb/Session;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_C_ID_INIT", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Session", "getId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "writeLong", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_C_ID_TERM", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/scriptio/ScriptWriterText", "currentSession", "Lorg/hsqldb/Session;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "writeRowOutToFile", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "schemaToLog", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Session", "loggedSchema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "schemaToLog", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/scriptio/ScriptWriterText", "writeSchemaStatement", "(Lorg/hsqldb/HsqlNameManager$HsqlName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "schemaToLog", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/Session", "loggedSchema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "writeRowOutToFile", "()V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "writeSchemaStatement", "(Lorg/hsqldb/HsqlNameManager$HsqlName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_SCHEMA", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "statementName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "writeString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_LINE_SEP", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeLogStatement", "(Lorg/hsqldb/Session;Ljava/lang/String;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Session", "currentSchema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/scriptio/ScriptWriterText", "schemaToLog", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "writeSessionIdAndSchema", "(Lorg/hsqldb/Session;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "writeString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_LINE_SEP", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "writeRowOutToFile", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/scriptio/ScriptWriterText", "needsSync", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeRow", "(Lorg/hsqldb/Session;Lorg/hsqldb/Row;Lorg/hsqldb/Table;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/scriptio/ScriptWriterText", "schemaToLog", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "writeSessionIdAndSchema", "(Lorg/hsqldb/Session;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "setMode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_INSERT_INTO", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "statementName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "writeString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_VALUES", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getColumnTypes", "()[Lorg/hsqldb/types/Type;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "writeData", "(Lorg/hsqldb/Row;[Lorg/hsqldb/types/Type;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_TERM", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_LINE_SEP", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "writeRowOutToFile", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeTableInit", "(Lorg/hsqldb/Table;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "currentSession", "Lorg/hsqldb/Session;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "isEmpty", "(Lorg/hsqldb/Session;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "schemaToLog", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "currentSession", "Lorg/hsqldb/Session;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Session", "loggedSchema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/scriptio/ScriptWriterText", "writeSchemaStatement", "(Lorg/hsqldb/HsqlNameManager$HsqlName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "writeRowOutToFile", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "currentSession", "Lorg/hsqldb/Session;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "schemaToLog", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/Session", "loggedSchema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeOtherStatement", "(Lorg/hsqldb/Session;Ljava/lang/String;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "writeLogStatement", "(Lorg/hsqldb/Session;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "writeDelay", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "sync", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeInsertStatement", "(Lorg/hsqldb/Session;Lorg/hsqldb/Row;Lorg/hsqldb/Table;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/scriptio/ScriptWriterText", "schemaToLog", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "writeRow", "(Lorg/hsqldb/Session;Lorg/hsqldb/Row;Lorg/hsqldb/Table;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeDeleteStatement", "(Lorg/hsqldb/Session;Lorg/hsqldb/Table;[Ljava/lang/Object;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/scriptio/ScriptWriterText", "schemaToLog", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "writeSessionIdAndSchema", "(Lorg/hsqldb/Session;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "setMode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_DELETE_FROM", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "statementName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "writeString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_WHERE", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getColumnCount", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getColumnTypes", "()[Lorg/hsqldb/types/Type;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Table", "columnList", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getPrimaryKey", "()[I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "writeData", "(I[Lorg/hsqldb/types/Type;[Ljava/lang/Object;Lorg/hsqldb/lib/HashMappedList;[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_LINE_SEP", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "writeRowOutToFile", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeSequenceStatement", "(Lorg/hsqldb/Session;Lorg/hsqldb/NumberSequence;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/NumberSequence", "getName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/scriptio/ScriptWriterText", "schemaToLog", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "writeSessionIdAndSchema", "(Lorg/hsqldb/Session;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_SEQUENCE", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/NumberSequence", "getSchemaName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "statementName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "writeString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/NumberSequence", "getName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "statementName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "writeString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_SEQUENCE_MID", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/NumberSequence", "peek", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "writeLong", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_LINE_SEP", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "writeRowOutToFile", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/scriptio/ScriptWriterText", "needsSync", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeCommitStatement", "(Lorg/hsqldb/Session;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "writeSessionIdAndSchema", "(Lorg/hsqldb/Session;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_COMMIT", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_LINE_SEP", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "writeRowOutToFile", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/scriptio/ScriptWriterText", "needsSync", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "writeDelay", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/scriptio/ScriptWriterText", "sync", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "finishStream", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "isCompressed", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "fileStreamOut", "Ljava/io/OutputStream;");
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/zip/GZIPOutputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/zip/GZIPOutputStream", "finish", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "writeRowOutToFile", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "fileStreamOut", "Ljava/io/OutputStream;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "fileStreamOut", "Ljava/io/OutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "getBuffer", "()[B", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "size", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStream", "write", "([BII)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "byteCount", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "rowOut", "Lorg/hsqldb/rowio/RowOutputTextLog;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputTextLog", "size", "()I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/scriptio/ScriptWriterText", "byteCount", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/scriptio/ScriptWriterText", "lineCount", "J");
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/scriptio/ScriptWriterText", "lineCount", "J");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/hsqldb/scriptio/ScriptWriterText", "java/lang/Object"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/UnsupportedEncodingException");
methodVisitor.visitLdcInsn("line.separator");
methodVisitor.visitLdcInsn("\n");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "()[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_LINE_SEP", "[B");
methodVisitor.visitLdcInsn("COMMIT");
methodVisitor.visitLdcInsn("ISO-8859-1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_COMMIT", "[B");
methodVisitor.visitLdcInsn("INSERT INTO ");
methodVisitor.visitLdcInsn("ISO-8859-1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_INSERT_INTO", "[B");
methodVisitor.visitLdcInsn(" VALUES(");
methodVisitor.visitLdcInsn("ISO-8859-1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_VALUES", "[B");
methodVisitor.visitLdcInsn(")");
methodVisitor.visitLdcInsn("ISO-8859-1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_TERM", "[B");
methodVisitor.visitLdcInsn("DELETE FROM ");
methodVisitor.visitLdcInsn("ISO-8859-1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_DELETE_FROM", "[B");
methodVisitor.visitLdcInsn(" WHERE ");
methodVisitor.visitLdcInsn("ISO-8859-1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_WHERE", "[B");
methodVisitor.visitLdcInsn("ALTER SEQUENCE ");
methodVisitor.visitLdcInsn("ISO-8859-1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_SEQUENCE", "[B");
methodVisitor.visitLdcInsn(" RESTART WITH ");
methodVisitor.visitLdcInsn("ISO-8859-1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_SEQUENCE_MID", "[B");
methodVisitor.visitLdcInsn("/*C");
methodVisitor.visitLdcInsn("ISO-8859-1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_C_ID_INIT", "[B");
methodVisitor.visitLdcInsn("*/");
methodVisitor.visitLdcInsn("ISO-8859-1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_C_ID_TERM", "[B");
methodVisitor.visitLdcInsn("SET SCHEMA ");
methodVisitor.visitLdcInsn("ISO-8859-1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/scriptio/ScriptWriterText", "BYTES_SCHEMA", "[B");
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"java/lang/String"}, 1, new Object[] {"java/io/UnsupportedEncodingException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("ScriptWriterText");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
