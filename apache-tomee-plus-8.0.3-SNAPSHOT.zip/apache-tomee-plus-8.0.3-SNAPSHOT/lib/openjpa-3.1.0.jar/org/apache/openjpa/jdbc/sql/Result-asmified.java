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
public class ResultDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/jdbc/sql/Result", null, "java/lang/Object", new String[] { "org/apache/openjpa/lib/util/Closeable" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEager", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "putEager", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newJoins", "()Lorg/apache/openjpa/jdbc/sql/Joins;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "close", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setLocking", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isLocking", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "supportsRandomAccess", "()Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "absolute", "(I)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "next", "()Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pushBack", "()V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "size", "()I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "contains", "(Ljava/lang/Object;)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "containsAll", "([Ljava/lang/Object;)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "contains", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "containsAll", "([Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBaseMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setBaseMapping", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMappedByFieldMapping", "()Lorg/apache/openjpa/jdbc/meta/FieldMapping;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMappedByFieldMapping", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMappedByValue", "()Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMappedByValue", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "indexOf", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "load", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;)Ljava/lang/Object;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "load", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/lang/Object;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getArray", "(Ljava/lang/Object;)Ljava/sql/Array;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAsciiStream", "(Ljava/lang/Object;)Ljava/io/InputStream;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBigDecimal", "(Ljava/lang/Object;)Ljava/math/BigDecimal;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBigInteger", "(Ljava/lang/Object;)Ljava/math/BigInteger;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBinaryStream", "(Ljava/lang/Object;)Ljava/io/InputStream;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLOBStream", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Ljava/lang/Object;)Ljava/io/InputStream;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBlob", "(Ljava/lang/Object;)Ljava/sql/Blob;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBoolean", "(Ljava/lang/Object;)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getByte", "(Ljava/lang/Object;)B", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBytes", "(Ljava/lang/Object;)[B", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCalendar", "(Ljava/lang/Object;)Ljava/util/Calendar;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLocalDate", "(Ljava/lang/Object;)Ljava/time/LocalDate;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLocalTime", "(Ljava/lang/Object;)Ljava/time/LocalTime;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLocalDateTime", "(Ljava/lang/Object;)Ljava/time/LocalDateTime;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOffsetTime", "(Ljava/lang/Object;)Ljava/time/OffsetTime;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOffsetDateTime", "(Ljava/lang/Object;)Ljava/time/OffsetDateTime;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getChar", "(Ljava/lang/Object;)C", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCharacterStream", "(Ljava/lang/Object;)Ljava/io/Reader;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClob", "(Ljava/lang/Object;)Ljava/sql/Clob;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDate", "(Ljava/lang/Object;)Ljava/util/Date;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDate", "(Ljava/lang/Object;Ljava/util/Calendar;)Ljava/sql/Date;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDouble", "(Ljava/lang/Object;)D", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFloat", "(Ljava/lang/Object;)F", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInt", "(Ljava/lang/Object;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLocale", "(Ljava/lang/Object;)Ljava/util/Locale;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLong", "(Ljava/lang/Object;)J", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNumber", "(Ljava/lang/Object;)Ljava/lang/Number;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getObject", "(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSQLObject", "(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRef", "(Ljava/lang/Object;Ljava/util/Map;)Ljava/sql/Ref;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getShort", "(Ljava/lang/Object;)S", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getString", "(Ljava/lang/Object;)Ljava/lang/String;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTime", "(Ljava/lang/Object;Ljava/util/Calendar;)Ljava/sql/Time;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTimestamp", "(Ljava/lang/Object;Ljava/util/Calendar;)Ljava/sql/Timestamp;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getArray", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/sql/Array;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAsciiStream", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/io/InputStream;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBigDecimal", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/math/BigDecimal;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBigInteger", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/math/BigInteger;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBinaryStream", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/io/InputStream;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBlob", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/sql/Blob;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBoolean", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getByte", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)B", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBytes", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)[B", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCalendar", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/util/Calendar;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getChar", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)C", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCharacterStream", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/io/Reader;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClob", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/sql/Clob;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDate", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/util/Date;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDate", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/util/Calendar;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/sql/Date;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDouble", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)D", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFloat", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)F", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInt", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLocale", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/util/Locale;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLong", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)J", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNumber", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/lang/Number;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getObject", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/Object;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/lang/Object;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSQLObject", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/util/Map;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/lang/Object;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRef", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/util/Map;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/sql/Ref;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getShort", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)S", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getString", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/lang/String;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTime", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/util/Calendar;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/sql/Time;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTimestamp", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/util/Calendar;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/sql/Timestamp;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "wasNull", "()Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "startDataRequest", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "endDataRequest", "()V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
