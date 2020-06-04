package asm.org.apache.openjpa.jdbc.sql;
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
public class RowDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/jdbc/sql/Row", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACTION_UNKNOWN", "I", null, new Integer(-1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACTION_UPDATE", "I", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACTION_INSERT", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACTION_DELETE", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTable", "()Lorg/apache/openjpa/jdbc/schema/Table;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAction", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFailedObject", "()Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setFailedObject", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isValid", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setValid", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPrimaryKey", "()Lorg/apache/openjpa/kernel/OpenJPAStateManager;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setPrimaryKey", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setPrimaryKey", "(Lorg/apache/openjpa/jdbc/schema/ColumnIO;Lorg/apache/openjpa/kernel/OpenJPAStateManager;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "wherePrimaryKey", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setForeignKey", "(Lorg/apache/openjpa/jdbc/schema/ForeignKey;Lorg/apache/openjpa/kernel/OpenJPAStateManager;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setForeignKey", "(Lorg/apache/openjpa/jdbc/schema/ForeignKey;Lorg/apache/openjpa/jdbc/schema/ColumnIO;Lorg/apache/openjpa/kernel/OpenJPAStateManager;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereForeignKey", "(Lorg/apache/openjpa/jdbc/schema/ForeignKey;Lorg/apache/openjpa/kernel/OpenJPAStateManager;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setArray", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/sql/Array;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAsciiStream", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/io/InputStream;I)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setBigDecimal", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/math/BigDecimal;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setBigInteger", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/math/BigInteger;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setBinaryStream", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/io/InputStream;I)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setBlob", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/sql/Blob;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setBoolean", "(Lorg/apache/openjpa/jdbc/schema/Column;Z)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setByte", "(Lorg/apache/openjpa/jdbc/schema/Column;B)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setBytes", "(Lorg/apache/openjpa/jdbc/schema/Column;[B)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setCalendar", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/util/Calendar;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setChar", "(Lorg/apache/openjpa/jdbc/schema/Column;C)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setCharacterStream", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/io/Reader;I)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setClob", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/sql/Clob;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setDate", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/util/Date;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setDate", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/sql/Date;Ljava/util/Calendar;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setDouble", "(Lorg/apache/openjpa/jdbc/schema/Column;D)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setFloat", "(Lorg/apache/openjpa/jdbc/schema/Column;F)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setInt", "(Lorg/apache/openjpa/jdbc/schema/Column;I)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setLong", "(Lorg/apache/openjpa/jdbc/schema/Column;J)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setLocale", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/util/Locale;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setNull", "(Lorg/apache/openjpa/jdbc/schema/Column;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setNull", "(Lorg/apache/openjpa/jdbc/schema/Column;Z)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setNumber", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/Number;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setObject", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/Object;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setRaw", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/String;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setRelationId", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/meta/RelationId;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setShort", "(Lorg/apache/openjpa/jdbc/schema/Column;S)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setString", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/String;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setTime", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/sql/Time;Ljava/util/Calendar;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setTimestamp", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/sql/Timestamp;Ljava/util/Calendar;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereArray", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/sql/Array;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereAsciiStream", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/io/InputStream;I)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereBigDecimal", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/math/BigDecimal;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereBigInteger", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/math/BigInteger;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereBinaryStream", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/io/InputStream;I)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereBlob", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/sql/Blob;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereBoolean", "(Lorg/apache/openjpa/jdbc/schema/Column;Z)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereByte", "(Lorg/apache/openjpa/jdbc/schema/Column;B)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereBytes", "(Lorg/apache/openjpa/jdbc/schema/Column;[B)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereCalendar", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/util/Calendar;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereChar", "(Lorg/apache/openjpa/jdbc/schema/Column;C)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereCharacterStream", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/io/Reader;I)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereClob", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/sql/Clob;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereDate", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/util/Date;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereDate", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/sql/Date;Ljava/util/Calendar;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereDouble", "(Lorg/apache/openjpa/jdbc/schema/Column;D)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereFloat", "(Lorg/apache/openjpa/jdbc/schema/Column;F)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereInt", "(Lorg/apache/openjpa/jdbc/schema/Column;I)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereLong", "(Lorg/apache/openjpa/jdbc/schema/Column;J)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereLocale", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/util/Locale;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereNull", "(Lorg/apache/openjpa/jdbc/schema/Column;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereNumber", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/Number;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereObject", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/Object;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereRaw", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/String;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereShort", "(Lorg/apache/openjpa/jdbc/schema/Column;S)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereString", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/String;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereTime", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/sql/Time;Ljava/util/Calendar;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whereTimestamp", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/sql/Timestamp;Ljava/util/Calendar;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
