package asm.org.eclipse.persistence.platform.database.jdbc;
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
public class JDBCTypesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ENUM, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "Ljava/lang/Enum<Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;>;Lorg/eclipse/persistence/platform/database/jdbc/JDBCType;", "java/lang/Enum", new String[] { "org/eclipse/persistence/platform/database/jdbc/JDBCType" });

classWriter.visitInnerClass("org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "org/eclipse/persistence/internal/helper/DatabaseType", "DatabaseTypeHelper", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/persistence/platform/database/jdbc/JDBCTypes$1", null, null, ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/persistence/platform/database/jdbc/JDBCTypes$2", null, null, ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/persistence/platform/database/jdbc/JDBCTypes$3", null, null, ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/persistence/platform/database/jdbc/JDBCTypes$4", null, null, ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ARRAY_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BIGINT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BINARY_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BIT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BLOB_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BOOLEAN_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NCHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLOB_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DATALINK_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DATE_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DECIMAL_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DISTINCT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DOUBLE_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FLOAT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INTEGER_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAVA_OBJECT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LONGVARBINARY_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LONGVARCHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NULL_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NUMERIC_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OTHER_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REAL_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REF_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SMALLINT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STRUCT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TIME_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TIMESTAMP_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TINYINT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VARBINARY_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VARCHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NVARCHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NVARCHAR2_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "typeCode", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "typeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ARRAY_TYPE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(SIPUSH, 2003);
methodVisitor.visitLdcInsn("ARRAY");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "ARRAY_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BIGINT_TYPE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, -5);
methodVisitor.visitLdcInsn("BIGINT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "BIGINT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BINARY_TYPE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, -2);
methodVisitor.visitLdcInsn("BINARY");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "BINARY_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BIT_TYPE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, -7);
methodVisitor.visitLdcInsn("BIT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "BIT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BLOB_TYPE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(SIPUSH, 2004);
methodVisitor.visitLdcInsn("BLOB");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "BLOB_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BOOLEAN_TYPE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitLdcInsn("BOOLEAN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "BOOLEAN_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CHAR_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("CHAR");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "CHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NCHAR_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitIntInsn(BIPUSH, -15);
methodVisitor.visitLdcInsn("NCHAR");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "NCHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLOB_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(SIPUSH, 2005);
methodVisitor.visitLdcInsn("CLOB");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "CLOB_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DATALINK_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(BIPUSH, 70);
methodVisitor.visitLdcInsn("DATALINK");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "DATALINK_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DATE_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(BIPUSH, 91);
methodVisitor.visitLdcInsn("DATE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "DATE_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DECIMAL_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("DECIMAL");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "DECIMAL_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DISTINCT_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitIntInsn(SIPUSH, 2001);
methodVisitor.visitLdcInsn("DISTINCT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "DISTINCT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DOUBLE_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("DOUBLE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "DOUBLE_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FLOAT_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("FLOAT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "FLOAT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INTEGER_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("INTEGER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "INTEGER_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_OBJECT_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitIntInsn(SIPUSH, 2000);
methodVisitor.visitLdcInsn("JAVA_OBJECT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "JAVA_OBJECT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LONGVARBINARY_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitIntInsn(BIPUSH, -4);
methodVisitor.visitLdcInsn("LONGVARBINARY");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "LONGVARBINARY_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LONGVARCHAR_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitLdcInsn("LONGVARCHAR");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "LONGVARCHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NULL_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("NULL");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "NULL_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NUMERIC_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("NUMERIC");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes$1", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "NUMERIC_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OTHER_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitIntInsn(SIPUSH, 1111);
methodVisitor.visitLdcInsn("OTHER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "OTHER_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REAL_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("REAL");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "REAL_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REF_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitIntInsn(SIPUSH, 2006);
methodVisitor.visitLdcInsn("REF");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "REF_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SMALLINT_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("SMALLINT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "SMALLINT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STRUCT_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitIntInsn(SIPUSH, 2002);
methodVisitor.visitLdcInsn("STRUCT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "STRUCT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TIME_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitIntInsn(BIPUSH, 92);
methodVisitor.visitLdcInsn("TIME");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "TIME_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TIMESTAMP_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitLdcInsn("TIMESTAMP");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "TIMESTAMP_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TINYINT_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitIntInsn(BIPUSH, -6);
methodVisitor.visitLdcInsn("TINYINT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "TINYINT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VARBINARY_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitIntInsn(BIPUSH, -3);
methodVisitor.visitLdcInsn("VARBINARY");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "VARBINARY_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VARCHAR_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("VARCHAR");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes$2", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "VARCHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NVARCHAR_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitIntInsn(BIPUSH, -9);
methodVisitor.visitLdcInsn("NVARCHAR");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes$3", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "NVARCHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NVARCHAR2_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitIntInsn(BIPUSH, -9);
methodVisitor.visitLdcInsn("NVARCHAR2");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes$4", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "NVARCHAR2_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "ARRAY_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "BIGINT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "BINARY_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "BIT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "BLOB_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "BOOLEAN_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "CHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "NCHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "CLOB_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "DATALINK_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "DATE_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "DECIMAL_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "DISTINCT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "DOUBLE_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "FLOAT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "INTEGER_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "JAVA_OBJECT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "LONGVARBINARY_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "LONGVARCHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "NULL_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "NUMERIC_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "OTHER_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "REAL_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "REF_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "SMALLINT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "STRUCT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "TIME_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "TIMESTAMP_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "TINYINT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "VARBINARY_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "VARCHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "NVARCHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "NVARCHAR2_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "ENUM$VALUES", "[Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "typeCode", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "typeName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isComplexDatabaseType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isJDBCType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSqlCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "typeCode", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConversionCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "getSqlCode", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "typeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "computeInIndex", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;ILjava/util/ListIterator;)I", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;ILjava/util/ListIterator<Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;>;)I", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "databaseTypeHelper", "Lorg/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "computeInIndex", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "computeOutIndex", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;ILjava/util/ListIterator;)I", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;ILjava/util/ListIterator<Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;>;)I", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "databaseTypeHelper", "Lorg/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "computeOutIndex", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildInDeclare", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "databaseTypeHelper", "Lorg/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "declareTarget", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/helper/DatabaseType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(" := :");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument", "inIndex", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(";");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("\n");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildOutDeclare", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "databaseTypeHelper", "Lorg/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "declareTarget", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/helper/DatabaseType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(";");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("\n");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildBeginBlock", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLStoredProcedureCall;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildOutAssignment", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLStoredProcedureCall;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "databaseTypeHelper", "Lorg/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "buildOutAssignment", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLStoredProcedureCall;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "translate", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lorg/eclipse/persistence/queries/StoredProcedureCall;)V", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Ljava/util/List<Lorg/eclipse/persistence/internal/helper/DatabaseField;>;Ljava/util/List<Lorg/eclipse/persistence/internal/helper/DatabaseField;>;Ljava/util/List;Lorg/eclipse/persistence/queries/StoredProcedureCall;)V", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "databaseTypeHelper", "Lorg/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "translate", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lorg/eclipse/persistence/queries/StoredProcedureCall;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildOutputRow", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/sessions/DatabaseRecord;Ljava/util/List;Ljava/util/List;)V", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/sessions/DatabaseRecord;Ljava/util/List<Lorg/eclipse/persistence/internal/helper/DatabaseField;>;Ljava/util/List;)V", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "databaseTypeHelper", "Lorg/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "buildOutputRow", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/sessions/DatabaseRecord;Ljava/util/List;Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "logParameter", "(Ljava/lang/StringBuilder;Ljava/lang/Integer;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/platform/database/DatabasePlatform;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "databaseTypeHelper", "Lorg/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "logParameter", "(Ljava/lang/StringBuilder;Ljava/lang/Integer;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/platform/database/DatabasePlatform;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDatabaseTypeForCode", "(I)Lorg/eclipse/persistence/internal/helper/DatabaseType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
Label label16 = new Label();
Label label17 = new Label();
Label label18 = new Label();
Label label19 = new Label();
Label label20 = new Label();
Label label21 = new Label();
Label label22 = new Label();
Label label23 = new Label();
Label label24 = new Label();
Label label25 = new Label();
Label label26 = new Label();
Label label27 = new Label();
Label label28 = new Label();
Label label29 = new Label();
Label label30 = new Label();
Label label31 = new Label();
Label label32 = new Label();
methodVisitor.visitLookupSwitchInsn(label32, new int[] { -15, -9, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 12, 16, 70, 91, 92, 93, 1111, 2000, 2001, 2002, 2003, 2004, 2005, 2006 }, new Label[] { label0, label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15, label16, label17, label18, label19, label20, label21, label22, label23, label24, label25, label26, label27, label28, label29, label30, label31 });
methodVisitor.visitLabel(label28);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/helper/DatabaseType"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "ARRAY_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "BIGINT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "BINARY_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "BIT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label29);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "BLOB_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "BOOLEAN_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "CHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label30);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "CLOB_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "DATALINK_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "DATE_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "DECIMAL_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label26);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "DISTINCT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "DOUBLE_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "FLOAT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "INTEGER_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label25);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "JAVA_OBJECT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "LONGVARBINARY_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "LONGVARCHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "NCHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "NULL_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "NUMERIC_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "NVARCHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "OTHER_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "REAL_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label31);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "REF_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "SMALLINT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label27);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "STRUCT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "TIME_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "TIMESTAMP_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "TINYINT_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "VARBINARY_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "VARCHAR_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label32);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getClassForCode", "(I)Ljava/lang/Class;", "(I)Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "STRING", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
methodVisitor.visitLookupSwitchInsn(label15, new int[] { -7, -6, -5, -4, -3, -2, 0, 2, 3, 4, 5, 6, 7, 8, 16, 70, 91, 92, 93, 1111, 2000, 2001, 2002, 2003, 2004, 2005, 2006 }, new Label[] { label0, label0, label1, label2, label2, label2, label3, label1, label1, label4, label0, label5, label5, label6, label7, label8, label9, label10, label11, label8, label8, label8, label12, label13, label2, label14, label8 });
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Array;"));
methodVisitor.visitVarInsn(ASTORE, 1);
Label label16 = new Label();
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "BIGDECIMAL", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "BLOB", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "CLOB", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "BOOLEAN", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "Object_Class", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "Void_Class", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "JavaSqlDate_Class", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "JavaSqlTimestamp_Class", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "DOUBLE", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "FLOAT", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "INTEGER", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "SHORT", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Struct;"));
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "JavaSqlTime_Class", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "STRING", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "ENUM$VALUES", "[Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljava/lang/String;IILjava/lang/String;Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
