package asm.org.hsqldb;
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
public class TokensDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/hsqldb/Tokens", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ABS", "Ljava/lang/String;", null, "ABS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_ALL", "Ljava/lang/String;", null, "ALL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ALLOCATE", "Ljava/lang/String;", null, "ALLOCATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_ALTER", "Ljava/lang/String;", null, "ALTER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_AND", "Ljava/lang/String;", null, "AND");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_ANY", "Ljava/lang/String;", null, "ANY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ARE", "Ljava/lang/String;", null, "ARE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_ARRAY", "Ljava/lang/String;", null, "ARRAY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_ARRAY_AGG", "Ljava/lang/String;", null, "ARRAY_AGG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_AS", "Ljava/lang/String;", null, "AS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ASENSITIVE", "Ljava/lang/String;", null, "ASENSITIVE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ASYMMETRIC", "Ljava/lang/String;", null, "ASYMMETRIC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_AT", "Ljava/lang/String;", null, "AT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ATOMIC", "Ljava/lang/String;", null, "ATOMIC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_AUTHORIZATION", "Ljava/lang/String;", null, "AUTHORIZATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_AVG", "Ljava/lang/String;", null, "AVG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BEGIN", "Ljava/lang/String;", null, "BEGIN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BETWEEN", "Ljava/lang/String;", null, "BETWEEN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_BIGINT", "Ljava/lang/String;", null, "BIGINT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_BINARY", "Ljava/lang/String;", null, "BINARY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BIT_LENGTH", "Ljava/lang/String;", null, "BIT_LENGTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_BLOB", "Ljava/lang/String;", null, "BLOB");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_BOOLEAN", "Ljava/lang/String;", null, "BOOLEAN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BOTH", "Ljava/lang/String;", null, "BOTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BY", "Ljava/lang/String;", null, "BY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CALL", "Ljava/lang/String;", null, "CALL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CALLED", "Ljava/lang/String;", null, "CALLED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CARDINALITY", "Ljava/lang/String;", null, "CARDINALITY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CASCADED", "Ljava/lang/String;", null, "CASCADED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CASE", "Ljava/lang/String;", null, "CASE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CAST", "Ljava/lang/String;", null, "CAST");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CEIL", "Ljava/lang/String;", null, "CEIL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CEILING", "Ljava/lang/String;", null, "CEILING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CHAR", "Ljava/lang/String;", null, "CHAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CHAR_LENGTH", "Ljava/lang/String;", null, "CHAR_LENGTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CHARACTER", "Ljava/lang/String;", null, "CHARACTER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CHARACTER_LENGTH", "Ljava/lang/String;", null, "CHARACTER_LENGTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CHECK", "Ljava/lang/String;", null, "CHECK");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CLOB", "Ljava/lang/String;", null, "CLOB");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CLOSE", "Ljava/lang/String;", null, "CLOSE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COALESCE", "Ljava/lang/String;", null, "COALESCE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_COLLATE", "Ljava/lang/String;", null, "COLLATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COLLECT", "Ljava/lang/String;", null, "COLLECT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COLUMN", "Ljava/lang/String;", null, "COLUMN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_COMMIT", "Ljava/lang/String;", null, "COMMIT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CONDITION", "Ljava/lang/String;", null, "CONDIITON");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CONNECT", "Ljava/lang/String;", null, "CONNECT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CONSTRAINT", "Ljava/lang/String;", null, "CONSTRAINT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CONVERT", "Ljava/lang/String;", null, "CONVERT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CORR", "Ljava/lang/String;", null, "CORR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CORRESPONDING", "Ljava/lang/String;", null, "CORRESPONDING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COUNT", "Ljava/lang/String;", null, "COUNT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COVAR_POP", "Ljava/lang/String;", null, "COVAR_POP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COVAR_SAMP", "Ljava/lang/String;", null, "COVAR_SAMP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CREATE", "Ljava/lang/String;", null, "CREATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CROSS", "Ljava/lang/String;", null, "CROSS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CUBE", "Ljava/lang/String;", null, "CUBE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CUME_DIST", "Ljava/lang/String;", null, "CUME_DIST");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURRENT", "Ljava/lang/String;", null, "CURRENT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURRENT_CATALOG", "Ljava/lang/String;", null, "CURRENT_CATALOG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURRENT_DATE", "Ljava/lang/String;", null, "CURRENT_DATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURRENT_DEFAULT_TRANSFORM_GROUP", "Ljava/lang/String;", null, "CURRENT_DEFAULT_TRANSFORM_GROUP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURRENT_PATH", "Ljava/lang/String;", null, "CURRENT_PATH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURRENT_ROLE", "Ljava/lang/String;", null, "CURRENT_ROLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURRENT_SCHEMA", "Ljava/lang/String;", null, "CURRENT_SCHEMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURRENT_TIME", "Ljava/lang/String;", null, "CURRENT_TIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURRENT_TIMESTAMP", "Ljava/lang/String;", null, "CURRENT_TIMESTAMP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURRENT_TRANSFORM_GROUP_FOR_TYPE", "Ljava/lang/String;", null, "CURRENT_TRANSFORM_GROUP_FOR_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURRENT_USER", "Ljava/lang/String;", null, "CURRENT_USER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURSOR", "Ljava/lang/String;", null, "CURSOR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CYCLE", "Ljava/lang/String;", null, "CYCLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DATE", "Ljava/lang/String;", null, "DATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DAY", "Ljava/lang/String;", null, "DAY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DEALLOCATE", "Ljava/lang/String;", null, "DEALLOCATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DEC", "Ljava/lang/String;", null, "DEC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DECIMAL", "Ljava/lang/String;", null, "DECIMAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DECLARE", "Ljava/lang/String;", null, "DECLARE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DEFAULT", "Ljava/lang/String;", null, "DEFAULT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DELETE", "Ljava/lang/String;", null, "DELETE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DENSE_RANK", "Ljava/lang/String;", null, "DENSE_RANK");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DEREF", "Ljava/lang/String;", null, "DEREF");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DESCRIBE", "Ljava/lang/String;", null, "DESCRIBE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DETERMINISTIC", "Ljava/lang/String;", null, "DETERMINISTIC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DISCONNECT", "Ljava/lang/String;", null, "DISCONNECT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DISTINCT", "Ljava/lang/String;", null, "DISTINCT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DO", "Ljava/lang/String;", null, "DO");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DOUBLE", "Ljava/lang/String;", null, "DOUBLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DROP", "Ljava/lang/String;", null, "DROP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DYNAMIC", "Ljava/lang/String;", null, "DYNAMIC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_EACH", "Ljava/lang/String;", null, "EACH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ELEMENT", "Ljava/lang/String;", null, "ELEMENT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ELSE", "Ljava/lang/String;", null, "ELSE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ELSEIF", "Ljava/lang/String;", null, "ELSEIF");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_END", "Ljava/lang/String;", null, "END");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_END_EXEC", "Ljava/lang/String;", null, "END_EXEC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ESCAPE", "Ljava/lang/String;", null, "ESCAPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_EVERY", "Ljava/lang/String;", null, "EVERY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_EXCEPT", "Ljava/lang/String;", null, "EXCEPT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_EXEC", "Ljava/lang/String;", null, "EXEC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_EXECUTE", "Ljava/lang/String;", null, "EXECUTE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_EXISTS", "Ljava/lang/String;", null, "EXISTS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_EXP", "Ljava/lang/String;", null, "EXP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_EXTERNAL", "Ljava/lang/String;", null, "EXTERNAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_EXTRACT", "Ljava/lang/String;", null, "EXTRACT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_FALSE", "Ljava/lang/String;", null, "FALSE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_FETCH", "Ljava/lang/String;", null, "FETCH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_FILTER", "Ljava/lang/String;", null, "FILTER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_FIRST_VALUE", "Ljava/lang/String;", null, "FIRST_VALUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_FLOAT", "Ljava/lang/String;", null, "FLOAT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_FLOOR", "Ljava/lang/String;", null, "FLOOR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_FOR", "Ljava/lang/String;", null, "FOR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_FOREIGN", "Ljava/lang/String;", null, "FOREIGN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_FREE", "Ljava/lang/String;", null, "FREE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_FROM", "Ljava/lang/String;", null, "FROM");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_FULL", "Ljava/lang/String;", null, "FULL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_FUNCTION", "Ljava/lang/String;", null, "FUNCTION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_FUSION", "Ljava/lang/String;", null, "FUSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_GET", "Ljava/lang/String;", null, "GET");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_GLOBAL", "Ljava/lang/String;", null, "GLOBAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_GRANT", "Ljava/lang/String;", null, "GRANT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_GROUP", "Ljava/lang/String;", null, "GROUP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_GROUPING", "Ljava/lang/String;", null, "GROUPING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_HANDLER", "Ljava/lang/String;", null, "HANDLER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_HAVING", "Ljava/lang/String;", null, "HAVING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_HOLD", "Ljava/lang/String;", null, "HOLD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_HOUR", "Ljava/lang/String;", null, "HOUR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_IDENTITY", "Ljava/lang/String;", null, "IDENTITY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_IF", "Ljava/lang/String;", null, "IF");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_IMPORT", "Ljava/lang/String;", null, "IMPORT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_IN", "Ljava/lang/String;", null, "IN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_INDICATOR", "Ljava/lang/String;", null, "INDICATOR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_INNER", "Ljava/lang/String;", null, "INNER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_INOUT", "Ljava/lang/String;", null, "INOUT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_INSENSITIVE", "Ljava/lang/String;", null, "INSENSITIVE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_INSERT", "Ljava/lang/String;", null, "INSERT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_INT", "Ljava/lang/String;", null, "INT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_INTEGER", "Ljava/lang/String;", null, "INTEGER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_INTERSECT", "Ljava/lang/String;", null, "INTERSECT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_INTERSECTION", "Ljava/lang/String;", null, "INTERSECTION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_INTERVAL", "Ljava/lang/String;", null, "INTERVAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_INTO", "Ljava/lang/String;", null, "INTO");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ITERATE", "Ljava/lang/String;", null, "ITERATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_IS", "Ljava/lang/String;", null, "IS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_JAR", "Ljava/lang/String;", null, "JAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_JOIN", "Ljava/lang/String;", null, "JOIN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LAG", "Ljava/lang/String;", null, "LAG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_LANGUAGE", "Ljava/lang/String;", null, "LANGUAGE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LARGE", "Ljava/lang/String;", null, "LARGE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LAST_VALUE", "Ljava/lang/String;", null, "LAST_VALUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LATERAL", "Ljava/lang/String;", null, "LATERAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LEAD", "Ljava/lang/String;", null, "LEAD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LEADING", "Ljava/lang/String;", null, "LEADING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LEAVE", "Ljava/lang/String;", null, "LEAVE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LEFT", "Ljava/lang/String;", null, "LEFT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LIKE", "Ljava/lang/String;", null, "LIKE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LIKE_REGX", "Ljava/lang/String;", null, "LIKE_REGX");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LN", "Ljava/lang/String;", null, "LN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_LOCAL", "Ljava/lang/String;", null, "LOCAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LOCALTIME", "Ljava/lang/String;", null, "LOCALTIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LOCALTIMESTAMP", "Ljava/lang/String;", null, "LOCALTIMESTAMP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_LOOP", "Ljava/lang/String;", null, "LOOP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LOWER", "Ljava/lang/String;", null, "LOWER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MATCH", "Ljava/lang/String;", null, "MATCH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MAX", "Ljava/lang/String;", null, "MAX");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MAX_CARDINALITY", "Ljava/lang/String;", null, "MAX_CARDINALITY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MEMBER", "Ljava/lang/String;", null, "MEMBER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MERGE", "Ljava/lang/String;", null, "MERGE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_METHOD", "Ljava/lang/String;", null, "METHOD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MIN", "Ljava/lang/String;", null, "MIN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_MINUTE", "Ljava/lang/String;", null, "MINUTE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MOD", "Ljava/lang/String;", null, "MOD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MODIFIES", "Ljava/lang/String;", null, "MODIFIES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MODULE", "Ljava/lang/String;", null, "MODULE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_MONTH", "Ljava/lang/String;", null, "MONTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_MULTISET", "Ljava/lang/String;", null, "MULTISET");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NATIONAL", "Ljava/lang/String;", null, "NATIONAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NATURAL", "Ljava/lang/String;", null, "NATURAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NCHAR", "Ljava/lang/String;", null, "NCHAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NCLOB", "Ljava/lang/String;", null, "NCLOB");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NEW", "Ljava/lang/String;", null, "NEW");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_NO", "Ljava/lang/String;", null, "NO");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_NONE", "Ljava/lang/String;", null, "NONE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NORMALIZE", "Ljava/lang/String;", null, "NORMALIZE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NOT", "Ljava/lang/String;", null, "NOT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NTH_VALUE", "Ljava/lang/String;", null, "NTH_VALUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NTILE", "Ljava/lang/String;", null, "NTILE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_NULL", "Ljava/lang/String;", null, "NULL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_NULLIF", "Ljava/lang/String;", null, "NULLIF");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_NUMERIC", "Ljava/lang/String;", null, "NUMERIC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OCCURRENCES_REGEX", "Ljava/lang/String;", null, "OCCURRENCES_REGEX");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OCTET_LENGTH", "Ljava/lang/String;", null, "OCTET_LENGTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OF", "Ljava/lang/String;", null, "OF");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OFFSET", "Ljava/lang/String;", null, "OFFSET");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OLD", "Ljava/lang/String;", null, "OLD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_ON", "Ljava/lang/String;", null, "ON");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_ONLY", "Ljava/lang/String;", null, "ONLY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OPEN", "Ljava/lang/String;", null, "OPEN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OR", "Ljava/lang/String;", null, "OR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_ORDER", "Ljava/lang/String;", null, "ORDER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OUT", "Ljava/lang/String;", null, "OUT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OUTER", "Ljava/lang/String;", null, "OUTER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OVER", "Ljava/lang/String;", null, "OVER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OVERLAPS", "Ljava/lang/String;", null, "OVERLAPS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OVERLAY", "Ljava/lang/String;", null, "OVERLAY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PARAMETER", "Ljava/lang/String;", null, "PARAMETER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PARTITION", "Ljava/lang/String;", null, "PARTITION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PERCENT_RANK", "Ljava/lang/String;", null, "PERCENT_RANK");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PERCENTILE_CONT", "Ljava/lang/String;", null, "PERCENTILE_CONT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PERCENTILE_DISC", "Ljava/lang/String;", null, "PERCENTILE_DISC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_POSITION", "Ljava/lang/String;", null, "POSITION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_POSITION_REGEX", "Ljava/lang/String;", null, "POSITION_REGEX");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_POWER", "Ljava/lang/String;", null, "POWER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PRECISION", "Ljava/lang/String;", null, "PRECISION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PREPARE", "Ljava/lang/String;", null, "PREPARE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PRIMARY", "Ljava/lang/String;", null, "PRIMARY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_PROCEDURE", "Ljava/lang/String;", null, "PROCEDURE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RANGE", "Ljava/lang/String;", null, "RANGE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RANK", "Ljava/lang/String;", null, "RANK");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_READS", "Ljava/lang/String;", null, "READS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_REAL", "Ljava/lang/String;", null, "REAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RECURSIVE", "Ljava/lang/String;", null, "RECURSIVE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REF", "Ljava/lang/String;", null, "REF");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_REFERENCES", "Ljava/lang/String;", null, "REFERENCES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REFERENCING", "Ljava/lang/String;", null, "REFERENCING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REGR_AVGX", "Ljava/lang/String;", null, "REGR_AVGX");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REGR_AVGY", "Ljava/lang/String;", null, "REGR_AVGY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REGR_COUNT", "Ljava/lang/String;", null, "REGR_COUNT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REGR_INTERCEPT", "Ljava/lang/String;", null, "REGR_INTERCEPT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REGR_R2", "Ljava/lang/String;", null, "REGR_R2");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REGR_SLOPE", "Ljava/lang/String;", null, "REGR_SLOPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REGR_SXX", "Ljava/lang/String;", null, "REGR_SXX");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REGR_SXY", "Ljava/lang/String;", null, "REGR_SXY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REGR_SYY", "Ljava/lang/String;", null, "REGR_SYY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RELEASE", "Ljava/lang/String;", null, "RELEASE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REPEAT", "Ljava/lang/String;", null, "REPEAT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RESIGNAL", "Ljava/lang/String;", null, "RESIGNAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_RESULT", "Ljava/lang/String;", null, "RESULT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RETURN", "Ljava/lang/String;", null, "RETURN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RETURNS", "Ljava/lang/String;", null, "RETURNS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REVOKE", "Ljava/lang/String;", null, "REVOKE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RIGHT", "Ljava/lang/String;", null, "RIGHT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_ROLLBACK", "Ljava/lang/String;", null, "ROLLBACK");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ROLLUP", "Ljava/lang/String;", null, "ROLLUP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_ROW", "Ljava/lang/String;", null, "ROW");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ROW_NUMBER", "Ljava/lang/String;", null, "ROW_NUMBER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_ROWS", "Ljava/lang/String;", null, "ROWS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SAVEPOINT", "Ljava/lang/String;", null, "SAVEPOINT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SCOPE", "Ljava/lang/String;", null, "SCOPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SCROLL", "Ljava/lang/String;", null, "SCROLL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SEARCH", "Ljava/lang/String;", null, "SEARCH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SECOND", "Ljava/lang/String;", null, "SECOND");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SELECT", "Ljava/lang/String;", null, "SELECT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SENSITIVE", "Ljava/lang/String;", null, "SENSITIVE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SESSION_USER", "Ljava/lang/String;", null, "SESSION_USER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SET", "Ljava/lang/String;", null, "SET");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SIGNAL", "Ljava/lang/String;", null, "SIGNAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SIMILAR", "Ljava/lang/String;", null, "SIMILAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SMALLINT", "Ljava/lang/String;", null, "SMALLINT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SOME", "Ljava/lang/String;", null, "SOME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SPECIFIC", "Ljava/lang/String;", null, "SPECIFIC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SPECIFICTYPE", "Ljava/lang/String;", null, "SPECIFICTYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SQL", "Ljava/lang/String;", null, "SQL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQLEXCEPTION", "Ljava/lang/String;", null, "SQLEXCEPTION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQLSTATE", "Ljava/lang/String;", null, "SQLSTATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQLWARNING", "Ljava/lang/String;", null, "SQLWARNING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQRT", "Ljava/lang/String;", null, "SQRT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_START", "Ljava/lang/String;", null, "START");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_STATIC", "Ljava/lang/String;", null, "STATIC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_STDDEV_POP", "Ljava/lang/String;", null, "STDDEV_POP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_STDDEV_SAMP", "Ljava/lang/String;", null, "STDDEV_SAMP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SUBMULTISET", "Ljava/lang/String;", null, "SUBMULTISET");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SUBSTRING", "Ljava/lang/String;", null, "SUBSTRING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SUBSTRING_REGEX", "Ljava/lang/String;", null, "SUBSTRING_REGEX");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SUM", "Ljava/lang/String;", null, "SUM");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SYMMETRIC", "Ljava/lang/String;", null, "SYMMETRIC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SYSTEM", "Ljava/lang/String;", null, "SYSTEM");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SYSTEM_USER", "Ljava/lang/String;", null, "SYSTEM_USER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TABLE", "Ljava/lang/String;", null, "TABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TABLESAMPLE", "Ljava/lang/String;", null, "TABLESAMPLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_THEN", "Ljava/lang/String;", null, "THEN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TIME", "Ljava/lang/String;", null, "TIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TIMESTAMP", "Ljava/lang/String;", null, "TIMESTAMP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TIMEZONE_HOUR", "Ljava/lang/String;", null, "TIMEZONE_HOUR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TIMEZONE_MINUTE", "Ljava/lang/String;", null, "TIMEZONE_MINUTE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TO", "Ljava/lang/String;", null, "TO");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRAILING", "Ljava/lang/String;", null, "TRAILING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TRANSLATE", "Ljava/lang/String;", null, "TRANSLATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRANSLATE_REGEX", "Ljava/lang/String;", null, "TRANSLATE_REGEX");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRANSLATION", "Ljava/lang/String;", null, "TRANSLATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TREAT", "Ljava/lang/String;", null, "TREAT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TRIGGER", "Ljava/lang/String;", null, "TRIGGER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRIM", "Ljava/lang/String;", null, "TRIM");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRIM_ARRAY", "Ljava/lang/String;", null, "TRIM_ARRAY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TRUE", "Ljava/lang/String;", null, "TRUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TRUNCATE", "Ljava/lang/String;", null, "TRUNCATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_UESCAPE", "Ljava/lang/String;", null, "UESCAPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_UNION", "Ljava/lang/String;", null, "UNION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_UNIQUE", "Ljava/lang/String;", null, "UNIQUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_UNKNOWN", "Ljava/lang/String;", null, "UNKNOWN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_UNNEST", "Ljava/lang/String;", null, "UNNEST");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_UNTIL", "Ljava/lang/String;", null, "UNTIL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_UPDATE", "Ljava/lang/String;", null, "UPDATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_UPPER", "Ljava/lang/String;", null, "UPPER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_USER", "Ljava/lang/String;", null, "USER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_USING", "Ljava/lang/String;", null, "USING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_VALUE", "Ljava/lang/String;", null, "VALUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_VALUES", "Ljava/lang/String;", null, "VALUES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_VAR_POP", "Ljava/lang/String;", null, "VAR_POP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_VAR_SAMP", "Ljava/lang/String;", null, "VAR_SAMP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_VARBINARY", "Ljava/lang/String;", null, "VARBINARY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_VARCHAR", "Ljava/lang/String;", null, "VARCHAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_VARYING", "Ljava/lang/String;", null, "VARYING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_WHEN", "Ljava/lang/String;", null, "WHEN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_WHENEVER", "Ljava/lang/String;", null, "WHENEVER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_WHERE", "Ljava/lang/String;", null, "WHERE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_WHILE", "Ljava/lang/String;", null, "WHILE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_WIDTH_BUCKET", "Ljava/lang/String;", null, "WIDTH_BUCKET");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_WINDOW", "Ljava/lang/String;", null, "WINDOW");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_WITH", "Ljava/lang/String;", null, "WITH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_WITHIN", "Ljava/lang/String;", null, "WITHIN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_WITHOUT", "Ljava/lang/String;", null, "WITHOUT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_YEAR", "Ljava/lang/String;", null, "YEAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ASTERISK", "Ljava/lang/String;", null, "*");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_COMMA", "Ljava/lang/String;", null, ",");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CIRCUMFLEX", "Ljava/lang/String;", null, "^");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CLOSEBRACKET", "Ljava/lang/String;", null, ")");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COLON", "Ljava/lang/String;", null, ":");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CONCAT", "Ljava/lang/String;", null, "||");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DIVIDE", "Ljava/lang/String;", null, "/");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_EQUALS", "Ljava/lang/String;", null, "=");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_GREATER", "Ljava/lang/String;", null, ">");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_GREATER_EQUALS", "Ljava/lang/String;", null, ">=");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_LEFTBRACKET", "Ljava/lang/String;", null, "[");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LESS", "Ljava/lang/String;", null, "<");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LESS_EQUALS", "Ljava/lang/String;", null, "<=");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PERCENT", "Ljava/lang/String;", null, "%");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PLUS", "Ljava/lang/String;", null, "+");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MINUS", "Ljava/lang/String;", null, "-");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NOT_EQUALS", "Ljava/lang/String;", null, "<>");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NOT_EQUALS_ALT", "Ljava/lang/String;", null, "!=");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_OPENBRACKET", "Ljava/lang/String;", null, "(");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_QUESTION", "Ljava/lang/String;", null, "?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_RIGHTBRACKET", "Ljava/lang/String;", null, "]");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SEMICOLON", "Ljava/lang/String;", null, ";");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DOUBLE_COLON", "Ljava/lang/String;", null, "::");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_A", "Ljava/lang/String;", null, "A");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ABSOLUTE", "Ljava/lang/String;", null, "ABSOLUTE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ACTION", "Ljava/lang/String;", null, "ACTION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ADA", "Ljava/lang/String;", null, "ADA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ADD", "Ljava/lang/String;", null, "ADD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ADMIN", "Ljava/lang/String;", null, "ADMIN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_AFTER", "Ljava/lang/String;", null, "AFTER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ALWAYS", "Ljava/lang/String;", null, "ALWAYS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ASC", "Ljava/lang/String;", null, "ASC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ASSERTION", "Ljava/lang/String;", null, "ASSERTION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ASSIGNMENT", "Ljava/lang/String;", null, "ASSIGNMENT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ATTRIBUTE", "Ljava/lang/String;", null, "ATTRIBUTE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ATTRIBUTES", "Ljava/lang/String;", null, "ATTRIBUTES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BEFORE", "Ljava/lang/String;", null, "BEFORE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BERNOULLI", "Ljava/lang/String;", null, "BERNOULLI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_BIT", "Ljava/lang/String;", null, "BIT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BITLENGTH", "Ljava/lang/String;", null, "BITLENGTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BREADTH", "Ljava/lang/String;", null, "BREADTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_C", "Ljava/lang/String;", null, "C");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CASCADE", "Ljava/lang/String;", null, "CASCADE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CATALOG", "Ljava/lang/String;", null, "CATALOG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CATALOG_NAME", "Ljava/lang/String;", null, "CATALOG_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CHAIN", "Ljava/lang/String;", null, "CHAIN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CHARACTER_SET_CATALOG", "Ljava/lang/String;", null, "CHARACTER_SET_CATALOG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CHARACTER_SET_NAME", "Ljava/lang/String;", null, "CHARACTER_SET_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CHARACTER_SET_SCHEMA", "Ljava/lang/String;", null, "CHARACTER_SET_SCHEMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CHARACTERISTICS", "Ljava/lang/String;", null, "CHARACTERISTICS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CHARACTERS", "Ljava/lang/String;", null, "CHARACTERS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CLASS_ORIGIN", "Ljava/lang/String;", null, "CLASS_ORIGIN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COBOL", "Ljava/lang/String;", null, "COBOL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_COLLATION", "Ljava/lang/String;", null, "COLLATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COLLATION_CATALOG", "Ljava/lang/String;", null, "COLLATION_CATALOG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COLLATION_NAME", "Ljava/lang/String;", null, "COLLATION_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COLLATION_SCHEMA", "Ljava/lang/String;", null, "COLLATION_SCHEMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COLUMN_NAME", "Ljava/lang/String;", null, "COLUMN_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COMMAND_FUNCTION", "Ljava/lang/String;", null, "COMMAND_FUNCTION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COMMAND_FUNCTION_CODE", "Ljava/lang/String;", null, "COMMAND_FUNCTION_CODE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_COMMITTED", "Ljava/lang/String;", null, "COMMITTED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COMPARABLE", "Ljava/lang/String;", null, "COMPARABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CONDITION_IDENTIFIER", "Ljava/lang/String;", null, "CONDIITON_IDENTIFIER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CONDITION_NUMBER", "Ljava/lang/String;", null, "CONDITION_NUMBER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CONNECTION_NAME", "Ljava/lang/String;", null, "CONNECTION_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CONSTRAINT_CATALOG", "Ljava/lang/String;", null, "CONSTRAINT_CATALOG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CONSTRAINT_NAME", "Ljava/lang/String;", null, "CONSTRAINT_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CONSTRAINT_SCHEMA", "Ljava/lang/String;", null, "CONSTRAINT_SCHEMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CONSTRAINTS", "Ljava/lang/String;", null, "CONSTRAINTS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CONSTRUCTOR", "Ljava/lang/String;", null, "CONSTRUCTOR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CONTAINS", "Ljava/lang/String;", null, "CONTAINS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CONTINUE", "Ljava/lang/String;", null, "CONTINUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURRENT_COLLATION", "Ljava/lang/String;", null, "CURRENT_COLLATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURSOR_NAME", "Ljava/lang/String;", null, "CURSOR_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DATA", "Ljava/lang/String;", null, "DATA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DATETIME_INTERVAL_CODE", "Ljava/lang/String;", null, "DATETIME_INTERVAL_CODE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DATETIME_INTERVAL_PRECISION", "Ljava/lang/String;", null, "DATETIME_INTERVAL_PRECISION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DEFAULTS", "Ljava/lang/String;", null, "DEFAULTS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DEFERRABLE", "Ljava/lang/String;", null, "DEFERRABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DEFERRED", "Ljava/lang/String;", null, "DEFERRED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DEFINED", "Ljava/lang/String;", null, "DEFINED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DEFINER", "Ljava/lang/String;", null, "DEFINER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DEGREE", "Ljava/lang/String;", null, "DEGREE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DEPTH", "Ljava/lang/String;", null, "DEPTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DERIVED", "Ljava/lang/String;", null, "DERIVED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DESC", "Ljava/lang/String;", null, "DESC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DESCRIPTOR", "Ljava/lang/String;", null, "DESCRIPTOR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DIAGNOSTICS", "Ljava/lang/String;", null, "DIAGNOSTICS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DISPATCH", "Ljava/lang/String;", null, "DISPATCH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DOMAIN", "Ljava/lang/String;", null, "DOMAIN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DYNAMIC_FUNCTION", "Ljava/lang/String;", null, "DYNAMIC_FUNCTION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DYNAMIC_FUNCTION_CODE", "Ljava/lang/String;", null, "DYNAMIC_FUNCTION_CODE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_EXCEPTION", "Ljava/lang/String;", null, "EXCEPTION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_EXCLUDE", "Ljava/lang/String;", null, "EXCLUDE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_EXCLUDING", "Ljava/lang/String;", null, "EXCLUDING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_EXIT", "Ljava/lang/String;", null, "EXIT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_FINAL", "Ljava/lang/String;", null, "FINAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_FIRST", "Ljava/lang/String;", null, "FIRST");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_FOLLOWING", "Ljava/lang/String;", null, "FOLLOWING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_FORTRAN", "Ljava/lang/String;", null, "FORTRAN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_FOUND", "Ljava/lang/String;", null, "FOUND");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_G_FACTOR", "Ljava/lang/String;", null, "G");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_GENERATED", "Ljava/lang/String;", null, "GENERATED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_GENERAL", "Ljava/lang/String;", null, "GENERAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_GO", "Ljava/lang/String;", null, "GO");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_GOTO", "Ljava/lang/String;", null, "GOTO");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_GRANTED", "Ljava/lang/String;", null, "GRANTED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_HIERARCHY", "Ljava/lang/String;", null, "HIERARCHY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_IMPLEMENTATION", "Ljava/lang/String;", null, "IMPLEMENTATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_INCLUDING", "Ljava/lang/String;", null, "INCLUDING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_INCREMENT", "Ljava/lang/String;", null, "INCREMENT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_INITIALLY", "Ljava/lang/String;", null, "INITIALLY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_INPUT", "Ljava/lang/String;", null, "INPUT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_INSTANCE", "Ljava/lang/String;", null, "INSTANCE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_INSTANTIABLE", "Ljava/lang/String;", null, "INSTANTIABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_INSTEAD", "Ljava/lang/String;", null, "INSTEAD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_INTERFACE", "Ljava/lang/String;", null, "INTERFACE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_INVOKER", "Ljava/lang/String;", null, "INVOKER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_ISOLATION", "Ljava/lang/String;", null, "ISOLATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_JAVA", "Ljava/lang/String;", null, "JAVA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_K_FACTOR", "Ljava/lang/String;", null, "K");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_KEY", "Ljava/lang/String;", null, "KEY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_KEY_MEMBER", "Ljava/lang/String;", null, "KEY_MEMBER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_KEY_TYPE", "Ljava/lang/String;", null, "KEY_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LAST", "Ljava/lang/String;", null, "LAST");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LENGTH", "Ljava/lang/String;", null, "LENGTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_LEVEL", "Ljava/lang/String;", null, "LEVEL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_LIBRARY", "Ljava/lang/String;", null, "LIBRARY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LOCATOR", "Ljava/lang/String;", null, "LOCATOR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_M_FACTOR", "Ljava/lang/String;", null, "M");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MAP", "Ljava/lang/String;", null, "MAP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MATCHED", "Ljava/lang/String;", null, "MATCHED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MAXVALUE", "Ljava/lang/String;", null, "MAXVALUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MESSAGE_LENGTH", "Ljava/lang/String;", null, "MESSAGE_LENGTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MESSAGE_OCTET_LENGTH", "Ljava/lang/String;", null, "MESSAGE_OCTET_LENGTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MESSAGE_TEXT", "Ljava/lang/String;", null, "MESSAGE_TEXT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MINVALUE", "Ljava/lang/String;", null, "MINVALUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MORE", "Ljava/lang/String;", null, "MORE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MUMPS", "Ljava/lang/String;", null, "MUMPS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_NAME", "Ljava/lang/String;", null, "NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_NAMES", "Ljava/lang/String;", null, "NAMES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NESTING", "Ljava/lang/String;", null, "NESTING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NEXT", "Ljava/lang/String;", null, "NEXT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NORMALIZED", "Ljava/lang/String;", null, "NORMALIZED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NULLABLE", "Ljava/lang/String;", null, "NULLABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_NULLS", "Ljava/lang/String;", null, "NULLS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NUMBER", "Ljava/lang/String;", null, "NUMBER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_OBJECT", "Ljava/lang/String;", null, "OBJECT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OCTETS", "Ljava/lang/String;", null, "OCTETS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OPTION", "Ljava/lang/String;", null, "OPTION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OPTIONS", "Ljava/lang/String;", null, "OPTIONS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ORDERING", "Ljava/lang/String;", null, "ORDERING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ORDINALITY", "Ljava/lang/String;", null, "ORDINALITY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OTHERS", "Ljava/lang/String;", null, "OTHERS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_OVERRIDING", "Ljava/lang/String;", null, "OVERRIDING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_P_FACTOR", "Ljava/lang/String;", null, "P");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_PAD", "Ljava/lang/String;", null, "PAD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PARAMETER_MODE", "Ljava/lang/String;", null, "PARAMETER_MODE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PARAMETER_NAME", "Ljava/lang/String;", null, "PARAMETER_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PARAMETER_ORDINAL_POSITION", "Ljava/lang/String;", null, "PARAMETER_ORDINAL_POSITION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PARAMETER_SPECIFIC_CATALOG", "Ljava/lang/String;", null, "PARAMETER_SPECIFIC_CATALOG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PARAMETER_SPEC_NAME", "Ljava/lang/String;", null, "PARAMETER_SPECIFIC_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PARAMETER_SPEC_SCHEMA", "Ljava/lang/String;", null, "PARAMETER_SPECIFIC_SCHEMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PARTIAL", "Ljava/lang/String;", null, "PARTIAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PASCAL", "Ljava/lang/String;", null, "PASCAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_PATH", "Ljava/lang/String;", null, "PATH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PLACING", "Ljava/lang/String;", null, "PLACING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PLI", "Ljava/lang/String;", null, "PLI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PRECEDING", "Ljava/lang/String;", null, "PRECEDING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PRESERVE", "Ljava/lang/String;", null, "PRESERVE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PRIOR", "Ljava/lang/String;", null, "PRIOR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PRIVILEGES", "Ljava/lang/String;", null, "PRIVILEGES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_PUBLIC", "Ljava/lang/String;", null, "PUBLIC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_READ", "Ljava/lang/String;", null, "READ");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RELATIVE", "Ljava/lang/String;", null, "RELATIVE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REPEATABLE", "Ljava/lang/String;", null, "REPEATABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RESTART", "Ljava/lang/String;", null, "RESTART");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RESET", "Ljava/lang/String;", null, "RESET");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RETURNED_CARDINALITY", "Ljava/lang/String;", null, "RETURNED_CARDINALITY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RETURNED_LENGTH", "Ljava/lang/String;", null, "RETURNED_LENGTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RETURNED_OCTET_LENGTH", "Ljava/lang/String;", null, "RETURNED_OCTET_LENGTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RETURNED_SQLSTATE", "Ljava/lang/String;", null, "RETURNED_SQLSTATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_ROLE", "Ljava/lang/String;", null, "ROLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_ROUTINE", "Ljava/lang/String;", null, "ROUTINE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ROUTINE_CATALOG", "Ljava/lang/String;", null, "ROUTINE_CATALOG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ROUTINE_NAME", "Ljava/lang/String;", null, "ROUTINE_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ROUTINE_SCHEMA", "Ljava/lang/String;", null, "ROUTINE_SCHEMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ROW_COUNT", "Ljava/lang/String;", null, "ROW_COUNT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SCALE", "Ljava/lang/String;", null, "SCALE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SCHEMA", "Ljava/lang/String;", null, "SCHEMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SCHEMA_NAME", "Ljava/lang/String;", null, "SCHEMA_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SCOPE_CATALOG", "Ljava/lang/String;", null, "SCOPE_CATALOG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SCOPE_NAME", "Ljava/lang/String;", null, "SCOPE_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SCOPE_SCHEMA", "Ljava/lang/String;", null, "SCOPE_SCHEMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SECTION", "Ljava/lang/String;", null, "SECTION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SECURITY", "Ljava/lang/String;", null, "SECURITY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SELF", "Ljava/lang/String;", null, "SELF");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SEQUENCE", "Ljava/lang/String;", null, "SEQUENCE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SERIAL", "Ljava/lang/String;", null, "SERIAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SERIALIZABLE", "Ljava/lang/String;", null, "SERIALIZABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SERVER", "Ljava/lang/String;", null, "SERVER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SERVER_NAME", "Ljava/lang/String;", null, "SERVER_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SESSION", "Ljava/lang/String;", null, "SESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SETS", "Ljava/lang/String;", null, "SETS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SIMPLE", "Ljava/lang/String;", null, "SIMPLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SIZE", "Ljava/lang/String;", null, "SIZE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SOURCE", "Ljava/lang/String;", null, "SOURCE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SPACE", "Ljava/lang/String;", null, "SPACE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SPECIFIC_NAME", "Ljava/lang/String;", null, "SPECIFIC_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQLDATA", "Ljava/lang/String;", null, "SQLDATA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_STACKED", "Ljava/lang/String;", null, "STACKED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_STATE", "Ljava/lang/String;", null, "STATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_STATEMENT", "Ljava/lang/String;", null, "STATEMENT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_STRUCTURE", "Ljava/lang/String;", null, "STRUCTURE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_STYLE", "Ljava/lang/String;", null, "STYLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SUBCLASS_ORIGIN", "Ljava/lang/String;", null, "SUBCLASS_ORIGIN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_T_FACTOR", "Ljava/lang/String;", null, "T");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TABLE_NAME", "Ljava/lang/String;", null, "TABLE_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TEMPORARY", "Ljava/lang/String;", null, "TEMPORARY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TIES", "Ljava/lang/String;", null, "TIES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TOP_LEVEL_COUNT", "Ljava/lang/String;", null, "TOP_LEVEL_COUNT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TRANSACTION", "Ljava/lang/String;", null, "TRANSACTION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRANSACTS_COMMITTED", "Ljava/lang/String;", null, "TRANSACTIONS_COMMITTED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRANSACTS_ROLLED_BACK", "Ljava/lang/String;", null, "TRANSACTIONS_ROLLED_BACK");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRANSACTION_ACTIVE", "Ljava/lang/String;", null, "TRANSACTION_ACTIVE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRANSFORM", "Ljava/lang/String;", null, "TRANSFORM");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRANSFORMS", "Ljava/lang/String;", null, "TRANSFORMS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRIGGER_CATALOG", "Ljava/lang/String;", null, "TRIGGER_CATALOG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRIGGER_NAME", "Ljava/lang/String;", null, "TRIGGER_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRIGGER_SCHEMA", "Ljava/lang/String;", null, "TRIGGER_SCHEMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TYPE", "Ljava/lang/String;", null, "TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_UNBOUNDED", "Ljava/lang/String;", null, "UNBOUNDED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_UNCOMMITTED", "Ljava/lang/String;", null, "UNCOMMITTED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_UNDER", "Ljava/lang/String;", null, "UNDER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_UNDO", "Ljava/lang/String;", null, "UNDO");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_UNNAMED", "Ljava/lang/String;", null, "UNNAMED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_USAGE", "Ljava/lang/String;", null, "USAGE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_USER_DEFINED_TYPE_CATALOG", "Ljava/lang/String;", null, "USER_DEFINED_TYPE_CATALOG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_USER_DEFINED_TYPE_CODE", "Ljava/lang/String;", null, "USER_DEFINED_TYPE_CODE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_USER_DEFINED_TYPE_NAME", "Ljava/lang/String;", null, "USER_DEFINED_TYPE_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_USER_DEFINED_TYPE_SCHEMA", "Ljava/lang/String;", null, "USER_DEFINED_TYPE_SCHEMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_VIEW", "Ljava/lang/String;", null, "VIEW");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_WORK", "Ljava/lang/String;", null, "WORK");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_WRAPPER", "Ljava/lang/String;", null, "WRAPPER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_WRITE", "Ljava/lang/String;", null, "WRITE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_ZONE", "Ljava/lang/String;", null, "ZONE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ALIAS", "Ljava/lang/String;", null, "ALIAS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_AGGREGATE", "Ljava/lang/String;", null, "AGGREGATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_AUTHENTICATION", "Ljava/lang/String;", null, "AUTHENTICATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_AUTO_INCREMENT", "Ljava/lang/String;", null, "AUTO_INCREMENT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_AUTOCOMMIT", "Ljava/lang/String;", null, "AUTOCOMMIT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_BACKUP", "Ljava/lang/String;", null, "BACKUP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BIGSERIAL", "Ljava/lang/String;", null, "BIGSERIAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BINARY_DOUBLE", "Ljava/lang/String;", null, "BINARY_DOUBLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BINARY_FLOAT", "Ljava/lang/String;", null, "BINARY_FLOAT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BODY", "Ljava/lang/String;", null, "BODY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BYTE", "Ljava/lang/String;", null, "BYTE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CACHE", "Ljava/lang/String;", null, "CACHE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CACHED", "Ljava/lang/String;", null, "CACHED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CASEWHEN", "Ljava/lang/String;", null, "CASEWHEN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CHECKPOINT", "Ljava/lang/String;", null, "CHECKPOINT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CITEXT", "Ljava/lang/String;", null, "CITEXT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CLASS", "Ljava/lang/String;", null, "CLASS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CLUSTERED", "Ljava/lang/String;", null, "CLUSTERED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COMMENT", "Ljava/lang/String;", null, "COMMENT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COMPACT", "Ljava/lang/String;", null, "COMPACT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_COMPRESSED", "Ljava/lang/String;", null, "COMPRESSED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CONFLICT", "Ljava/lang/String;", null, "CONFLICT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CONTROL", "Ljava/lang/String;", null, "CONTROL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURDATE", "Ljava/lang/String;", null, "CURDATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURRVAL", "Ljava/lang/String;", null, "CURRVAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CURTIME", "Ljava/lang/String;", null, "CURTIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DATABASE", "Ljava/lang/String;", null, "DATABASE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DATETIME", "Ljava/lang/String;", null, "DATETIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DB2", "Ljava/lang/String;", null, "DB2");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DEADLOCK", "Ljava/lang/String;", null, "DEADLOCK");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DEFRAG", "Ljava/lang/String;", null, "DEFRAG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DELAY", "Ljava/lang/String;", null, "DELAY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DIGEST", "Ljava/lang/String;", null, "DIGEST");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DUAL", "Ljava/lang/String;", null, "DUAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_EXPLAIN", "Ljava/lang/String;", null, "EXPLAIN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_EVENT", "Ljava/lang/String;", null, "EVENT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_FILE", "Ljava/lang/String;", null, "FILE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_FILES", "Ljava/lang/String;", null, "FILES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_FOLD", "Ljava/lang/String;", null, "FOLD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_FORMAT", "Ljava/lang/String;", null, "FORMAT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_GROUP_CONCAT", "Ljava/lang/String;", null, "GROUP_CONCAT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_HEADER", "Ljava/lang/String;", null, "HEADER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_IFNULL", "Ljava/lang/String;", null, "IFNULL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_IGNORECASE", "Ljava/lang/String;", null, "IGNORECASE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_IMMEDIATELY", "Ljava/lang/String;", null, "IMMEDIATELY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_INDEX", "Ljava/lang/String;", null, "INDEX");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_INDEXER", "Ljava/lang/String;", null, "INDEXER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_INITIAL", "Ljava/lang/String;", null, "INITIAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_INTEGRITY", "Ljava/lang/String;", null, "INTEGRITY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_IS_AUTOCOMMIT", "Ljava/lang/String;", null, "IS_AUTOCOMMIT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_IS_READONLY_DATABASE", "Ljava/lang/String;", null, "IS_READONLY_DATABASE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_IS_READONLY_DATABASE_FILES", "Ljava/lang/String;", null, "IS_READONLY_DATABASE_FILES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_IS_READONLY_SESSION", "Ljava/lang/String;", null, "IS_READONLY_SESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ISNULL", "Ljava/lang/String;", null, "ISNULL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LASTVAL", "Ljava/lang/String;", null, "LASTVAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LIMIT", "Ljava/lang/String;", null, "LIMIT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_LOB", "Ljava/lang/String;", null, "LOB");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_LOCK", "Ljava/lang/String;", null, "LOCK");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_LOCKS", "Ljava/lang/String;", null, "LOCKS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_LONG", "Ljava/lang/String;", null, "LONG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_LONGBLOB", "Ljava/lang/String;", null, "LONGBLOB");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_LONGTEXT", "Ljava/lang/String;", null, "LONGTEXT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_LONGVAR", "Ljava/lang/String;", null, "LONGVAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_LONGVARBINARY", "Ljava/lang/String;", null, "LONGVARBINARY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_LONGVARCHAR", "Ljava/lang/String;", null, "LONGVARCHAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MAXROWS", "Ljava/lang/String;", null, "MAXROWS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MEDIAN", "Ljava/lang/String;", null, "MEDIAN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MEDIUMBLOB", "Ljava/lang/String;", null, "MEDIUMBLOB");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MEDIUMTEXT", "Ljava/lang/String;", null, "MEDIUMTEXT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_MEMORY", "Ljava/lang/String;", null, "MEMORY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_MILLIS", "Ljava/lang/String;", null, "MILLIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MINUS_EXCEPT", "Ljava/lang/String;", null, "MINUS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_MSS", "Ljava/lang/String;", null, "MSS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_MVCC", "Ljava/lang/String;", null, "MVCC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_MVLOCKS", "Ljava/lang/String;", null, "MVLOCKS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_MYS", "Ljava/lang/String;", null, "MYS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_NAN", "Ljava/lang/String;", null, "NAN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NEXTVAL", "Ljava/lang/String;", null, "NEXTVAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_NIO", "Ljava/lang/String;", null, "NIO");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NOWAIT", "Ljava/lang/String;", null, "NOWAIT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_NVARCHAR", "Ljava/lang/String;", null, "NVARCHAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_NVARCHAR2", "Ljava/lang/String;", null, "NVARCHAR2");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NVL", "Ljava/lang/String;", null, "NVL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NVL2", "Ljava/lang/String;", null, "NVL2");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OCTETLENGTH", "Ljava/lang/String;", null, "OCTETLENGTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_OFF", "Ljava/lang/String;", null, "OFF");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_OTHER", "Ljava/lang/String;", null, "OTHER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_ORA", "Ljava/lang/String;", null, "ORA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_PASSWORD", "Ljava/lang/String;", null, "PASSWORD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PLAN", "Ljava/lang/String;", null, "PLAN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_PGS", "Ljava/lang/String;", null, "PGS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PREVVAL", "Ljava/lang/String;", null, "PREVVAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PROPERTY", "Ljava/lang/String;", null, "PROPERTY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_QUEUE", "Ljava/lang/String;", null, "QUEUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RAW", "Ljava/lang/String;", null, "RAW");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_READONLY", "Ljava/lang/String;", null, "READONLY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REFERENTIAL", "Ljava/lang/String;", null, "REFERENTIAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_REGULAR", "Ljava/lang/String;", null, "REGULAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RENAME", "Ljava/lang/String;", null, "RENAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RESTRICT", "Ljava/lang/String;", null, "RESTRICT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ROWNUM", "Ljava/lang/String;", null, "ROWNUM");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SCRIPT", "Ljava/lang/String;", null, "SCRIPT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SEPARATOR", "Ljava/lang/String;", null, "SEPARATOR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BLOCKING", "Ljava/lang/String;", null, "BLOCKING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SHUTDOWN", "Ljava/lang/String;", null, "SHUTDOWN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_TSI_DAY", "Ljava/lang/String;", null, "SQL_TSI_DAY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_TSI_FRAC_SECOND", "Ljava/lang/String;", null, "SQL_TSI_FRAC_SECOND");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_TSI_MILLI_SECOND", "Ljava/lang/String;", null, "SQL_TSI_MILLI_SECOND");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_TSI_HOUR", "Ljava/lang/String;", null, "SQL_TSI_HOUR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_TSI_MINUTE", "Ljava/lang/String;", null, "SQL_TSI_MINUTE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_TSI_MONTH", "Ljava/lang/String;", null, "SQL_TSI_MONTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_TSI_QUARTER", "Ljava/lang/String;", null, "SQL_TSI_QUARTER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_TSI_SECOND", "Ljava/lang/String;", null, "SQL_TSI_SECOND");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_TSI_WEEK", "Ljava/lang/String;", null, "SQL_TSI_WEEK");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_TSI_YEAR", "Ljava/lang/String;", null, "SQL_TSI_YEAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_BIGINT", "Ljava/lang/String;", null, "SQL_BIGINT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_BINARY", "Ljava/lang/String;", null, "SQL_BINARY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_BIT", "Ljava/lang/String;", null, "SQL_BIT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_BLOB", "Ljava/lang/String;", null, "SQL_BLOB");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_BOOLEAN", "Ljava/lang/String;", null, "SQL_BOOLEAN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_CHAR", "Ljava/lang/String;", null, "SQL_CHAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_CLOB", "Ljava/lang/String;", null, "SQL_CLOB");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_DATE", "Ljava/lang/String;", null, "SQL_DATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_DECIMAL", "Ljava/lang/String;", null, "SQL_DECIMAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_DATALINK", "Ljava/lang/String;", null, "SQL_DATALINK");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_DOUBLE", "Ljava/lang/String;", null, "SQL_DOUBLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_FLOAT", "Ljava/lang/String;", null, "SQL_FLOAT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_INTEGER", "Ljava/lang/String;", null, "SQL_INTEGER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_LONGVARBINARY", "Ljava/lang/String;", null, "SQL_LONGVARBINARY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_LONGNVARCHAR", "Ljava/lang/String;", null, "SQL_LONGNVARCHAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_LONGVARCHAR", "Ljava/lang/String;", null, "SQL_LONGVARCHAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_NCHAR", "Ljava/lang/String;", null, "SQL_NCHAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_NCLOB", "Ljava/lang/String;", null, "SQL_NCLOB");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_NUMERIC", "Ljava/lang/String;", null, "SQL_NUMERIC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_NVARCHAR", "Ljava/lang/String;", null, "SQL_NVARCHAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_REAL", "Ljava/lang/String;", null, "SQL_REAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_ROWID", "Ljava/lang/String;", null, "SQL_ROWID");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_SQLXML", "Ljava/lang/String;", null, "SQL_SQLXML");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_SMALLINT", "Ljava/lang/String;", null, "SQL_SMALLINT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_TIME", "Ljava/lang/String;", null, "SQL_TIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_TIMESTAMP", "Ljava/lang/String;", null, "SQL_TIMESTAMP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_TINYINT", "Ljava/lang/String;", null, "SQL_TINYINT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_VARBINARY", "Ljava/lang/String;", null, "SQL_VARBINARY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SQL_VARCHAR", "Ljava/lang/String;", null, "SQL_VARCHAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SYNTAX", "Ljava/lang/String;", null, "SYNTAX");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TDC", "Ljava/lang/String;", null, "TDC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TEMP", "Ljava/lang/String;", null, "TEMP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TEXT", "Ljava/lang/String;", null, "TEXT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TIMESTAMP_WITH_ZONE", "Ljava/lang/String;", null, "TIMESTAMP_WITH_ZONE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TIMESTAMPADD", "Ljava/lang/String;", null, "TIMESTAMPADD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TIMESTAMPDIFF", "Ljava/lang/String;", null, "TIMESTAMPDIFF");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TINYBLOB", "Ljava/lang/String;", null, "TINYBLOB");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TINYINT", "Ljava/lang/String;", null, "TINYINT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TINYTEXT", "Ljava/lang/String;", null, "TINYTEXT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TOP", "Ljava/lang/String;", null, "TOP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TTI", "Ljava/lang/String;", null, "TTI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_TYPES", "Ljava/lang/String;", null, "TYPES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_VARCHAR_IGNORECASE", "Ljava/lang/String;", null, "VARCHAR_IGNORECASE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_VARCHAR2", "Ljava/lang/String;", null, "VARCHAR2");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_UTF16", "Ljava/lang/String;", null, "UTF16");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_WRITE_DELAY", "Ljava/lang/String;", null, "WRITE_DELAY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_YES", "Ljava/lang/String;", null, "YES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DAY_NAME", "Ljava/lang/String;", null, "DAY_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_MONTH_NAME", "Ljava/lang/String;", null, "MONTH_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_QUARTER", "Ljava/lang/String;", null, "QUARTER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DAY_OF_WEEK", "Ljava/lang/String;", null, "DAY_OF_WEEK");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DAY_OF_MONTH", "Ljava/lang/String;", null, "DAY_OF_MONTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_DAY_OF_YEAR", "Ljava/lang/String;", null, "DAY_OF_YEAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_WEEK_OF_YEAR", "Ljava/lang/String;", null, "WEEK_OF_YEAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DAYNAME", "Ljava/lang/String;", null, "DAYNAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MONTHNAME", "Ljava/lang/String;", null, "MONTHNAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DAYOFMONTH", "Ljava/lang/String;", null, "DAYOFMONTH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DAYOFWEEK", "Ljava/lang/String;", null, "DAYOFWEEK");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DAYOFYEAR", "Ljava/lang/String;", null, "DAYOFYEAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_WEEK", "Ljava/lang/String;", null, "WEEK");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DAYS", "Ljava/lang/String;", null, "DAYS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ACOS", "Ljava/lang/String;", null, "ACOS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ACTION_ID", "Ljava/lang/String;", null, "ACTION_ID");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ADD_MONTHS", "Ljava/lang/String;", null, "ADD_MONTHS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ARRAY_SORT", "Ljava/lang/String;", null, "ARRAY_SORT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ASCII", "Ljava/lang/String;", null, "ASCII");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ASIN", "Ljava/lang/String;", null, "ASIN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ATAN", "Ljava/lang/String;", null, "ATAN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ATAN2", "Ljava/lang/String;", null, "ATAN2");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BITAND", "Ljava/lang/String;", null, "BITAND");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BITANDNOT", "Ljava/lang/String;", null, "BITANDNOT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BITNOT", "Ljava/lang/String;", null, "BITNOT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BITOR", "Ljava/lang/String;", null, "BITOR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_BITXOR", "Ljava/lang/String;", null, "BITXOR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_CONCAT_WORD", "Ljava/lang/String;", null, "CONCAT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CONCAT_WS", "Ljava/lang/String;", null, "CONCAT_WS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CHR", "Ljava/lang/String;", null, "CHR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COS", "Ljava/lang/String;", null, "COS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_COT", "Ljava/lang/String;", null, "COT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_CRYPT_KEY", "Ljava/lang/String;", null, "CRYPT_KEY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DATABASE_NAME", "Ljava/lang/String;", null, "DATABASE_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DATE_ADD", "Ljava/lang/String;", null, "DATE_ADD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DATE_SUB", "Ljava/lang/String;", null, "DATE_SUB");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DATEADD", "Ljava/lang/String;", null, "DATEADD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DATEDIFF", "Ljava/lang/String;", null, "DATEDIFF");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DBTIMEZONE", "Ljava/lang/String;", null, "DBTIMEZONE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DECODE", "Ljava/lang/String;", null, "DECODE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DEGREES", "Ljava/lang/String;", null, "DEGREES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DIFFERENCE", "Ljava/lang/String;", null, "DIFFERENCE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DMOD", "Ljava/lang/String;", null, "DMOD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_FROM_TZ", "Ljava/lang/String;", null, "FROM_TZ");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_GC", "Ljava/lang/String;", null, "GC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_GREATEST", "Ljava/lang/String;", null, "GREATEST");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_HEXTORAW", "Ljava/lang/String;", null, "HEXTORAW");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_INSTR", "Ljava/lang/String;", null, "INSTR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LCASE", "Ljava/lang/String;", null, "LCASE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LEAST", "Ljava/lang/String;", null, "LEAST");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LOAD_FILE", "Ljava/lang/String;", null, "LOAD_FILE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LOCATE", "Ljava/lang/String;", null, "LOCATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_LOG", "Ljava/lang/String;", null, "LOG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LOG10", "Ljava/lang/String;", null, "LOG10");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LAST_DAY", "Ljava/lang/String;", null, "LAST_DAY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LPAD", "Ljava/lang/String;", null, "LPAD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LTRIM", "Ljava/lang/String;", null, "LTRIM");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_MONTHS_BETWEEN", "Ljava/lang/String;", null, "MONTHS_BETWEEN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NEXT_DAY", "Ljava/lang/String;", null, "NEXT_DAY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NEW_TIME", "Ljava/lang/String;", null, "NEW_TIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NOW", "Ljava/lang/String;", null, "NOW");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NUMTODSINTERVAL", "Ljava/lang/String;", null, "NUMTODSINTERVAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_NUMTOYMINTERVAL", "Ljava/lang/String;", null, "NUMTOYMINTERVAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_PI", "Ljava/lang/String;", null, "PI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_POSITION_ARRAY", "Ljava/lang/String;", null, "POSITION_ARRAY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RADIANS", "Ljava/lang/String;", null, "RADIANS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RAND", "Ljava/lang/String;", null, "RAND");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RAWTOHEX", "Ljava/lang/String;", null, "RAWTOHEX");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REGEXP_MATCHES", "Ljava/lang/String;", null, "REGEXP_MATCHES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REGEXP_SUBSTRING", "Ljava/lang/String;", null, "REGEXP_SUBSTRING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REGEXP_SUBSTRING_ARRAY", "Ljava/lang/String;", null, "REGEXP_SUBSTRING_ARRAY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REPLACE", "Ljava/lang/String;", null, "REPLACE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_REVERSE", "Ljava/lang/String;", null, "REVERSE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ROUND", "Ljava/lang/String;", null, "ROUND");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ROUNDMAGIC", "Ljava/lang/String;", null, "ROUNDMAGIC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RPAD", "Ljava/lang/String;", null, "RPAD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_RTRIM", "Ljava/lang/String;", null, "RTRIM");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T_SECONDS_MIDNIGHT", "Ljava/lang/String;", null, "SECONDS_SINCE_MIDNIGHT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SESSIONTIMEZONE", "Ljava/lang/String;", null, "SESSIONTIMEZONE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SIGN", "Ljava/lang/String;", null, "SIGN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SIN", "Ljava/lang/String;", null, "SIN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SORT_ARRAY", "Ljava/lang/String;", null, "SORT_ARRAY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SOUNDEX", "Ljava/lang/String;", null, "SOUNDEX");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SUBSTR", "Ljava/lang/String;", null, "SUBSTR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SYS_EXTRACT_UTC", "Ljava/lang/String;", null, "SYS_EXTRACT_UTC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SYSDATE", "Ljava/lang/String;", null, "SYSDATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SYSTIMESTAMP", "Ljava/lang/String;", null, "SYSTIMESTAMP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TAN", "Ljava/lang/String;", null, "TAN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TO_CHAR", "Ljava/lang/String;", null, "TO_CHAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TO_DATE", "Ljava/lang/String;", null, "TO_DATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TO_DSINTERVAL", "Ljava/lang/String;", null, "TO_DSINTERVAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TO_YMINTERVAL", "Ljava/lang/String;", null, "TO_YMINTERVAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TO_NUMBER", "Ljava/lang/String;", null, "TO_NUMBER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TO_TIMESTAMP", "Ljava/lang/String;", null, "TO_TIMESTAMP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TO_TIMESTAMP_TZ", "Ljava/lang/String;", null, "TO_TIMESTAMP_TZ");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TZ_OFFSET", "Ljava/lang/String;", null, "TZ_OFFSET");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRANSACTION_SIZE", "Ljava/lang/String;", null, "TRANSACTION_SIZE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRANSACTION_ID", "Ljava/lang/String;", null, "TRANSACTION_ID");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRUNC", "Ljava/lang/String;", null, "TRUNC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TODAY", "Ljava/lang/String;", null, "TODAY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_UCASE", "Ljava/lang/String;", null, "UCASE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_UUID", "Ljava/lang/String;", null, "UUID");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_UNIX_MILLIS", "Ljava/lang/String;", null, "UNIX_MILLIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_UNIX_TIMESTAMP", "Ljava/lang/String;", null, "UNIX_TIMESTAMP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_ISOLATION_LEVEL", "Ljava/lang/String;", null, "ISOLATION_LEVEL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SESSION_ISOLATION_LEVEL", "Ljava/lang/String;", null, "SESSION_ISOLATION_LEVEL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DATABASE_ISOLATION_LEVEL", "Ljava/lang/String;", null, "DATABASE_ISOLATION_LEVEL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TRANSACTION_CONTROL", "Ljava/lang/String;", null, "TRANSACTION_CONTROL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_TIMEZONE", "Ljava/lang/String;", null, "TIMEZONE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SESSION_TIMEZONE", "Ljava/lang/String;", null, "SESSION_TIMEZONE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DATABASE_TIMEZONE", "Ljava/lang/String;", null, "DATABASE_TIMEZONE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_DATABASE_VERSION", "Ljava/lang/String;", null, "DATABASE_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SESSION_ID", "Ljava/lang/String;", null, "SESSION_ID");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_LOB_ID", "Ljava/lang/String;", null, "LOB_ID");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "T_SEQUENCE_ARRAY", "Ljava/lang/String;", null, "SEQUENCE_ARRAY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ABS", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALL", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALLOCATE", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALTER", "I", null, new Integer(4));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AND", "I", null, new Integer(5));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANY", "I", null, new Integer(6));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ARE", "I", null, new Integer(7));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ARRAY", "I", null, new Integer(8));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ARRAY_AGG", "I", null, new Integer(9));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AS", "I", null, new Integer(10));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ASENSITIVE", "I", null, new Integer(11));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ASYMMETRIC", "I", null, new Integer(12));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AT", "I", null, new Integer(13));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATOMIC", "I", null, new Integer(14));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTHORIZATION", "I", null, new Integer(15));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AVG", "I", null, new Integer(16));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BEGIN", "I", null, new Integer(17));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BETWEEN", "I", null, new Integer(18));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BIGINT", "I", null, new Integer(19));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BINARY", "I", null, new Integer(20));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BLOB", "I", null, new Integer(21));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BOOLEAN", "I", null, new Integer(22));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BOTH", "I", null, new Integer(23));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BY", "I", null, new Integer(24));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CALL", "I", null, new Integer(25));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CALLED", "I", null, new Integer(26));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CARDINALITY", "I", null, new Integer(27));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CASCADED", "I", null, new Integer(28));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CASE", "I", null, new Integer(29));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CAST", "I", null, new Integer(30));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CEIL", "I", null, new Integer(31));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CEILING", "I", null, new Integer(32));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHAR", "I", null, new Integer(33));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHAR_LENGTH", "I", null, new Integer(34));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHARACTER", "I", null, new Integer(35));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHARACTER_LENGTH", "I", null, new Integer(36));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHECK", "I", null, new Integer(37));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLOB", "I", null, new Integer(38));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLOSE", "I", null, new Integer(39));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COALESCE", "I", null, new Integer(40));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COLLATE", "I", null, new Integer(41));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COLLECT", "I", null, new Integer(42));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COLUMN", "I", null, new Integer(43));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMIT", "I", null, new Integer(44));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPARABLE", "I", null, new Integer(45));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONDITION", "I", null, new Integer(46));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECT", "I", null, new Integer(47));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONSTRAINT", "I", null, new Integer(48));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONVERT", "I", null, new Integer(49));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CORR", "I", null, new Integer(50));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CORRESPONDING", "I", null, new Integer(51));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COUNT", "I", null, new Integer(52));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COVAR_POP", "I", null, new Integer(53));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COVAR_SAMP", "I", null, new Integer(54));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CREATE", "I", null, new Integer(55));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CROSS", "I", null, new Integer(56));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CUBE", "I", null, new Integer(57));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CUME_DIST", "I", null, new Integer(58));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURRENT", "I", null, new Integer(59));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURRENT_CATALOG", "I", null, new Integer(60));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURRENT_DATE", "I", null, new Integer(61));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURRENT_DEFAULT_TRANSFORM_GROUP", "I", null, new Integer(62));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURRENT_PATH", "I", null, new Integer(63));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURRENT_ROLE", "I", null, new Integer(64));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURRENT_SCHEMA", "I", null, new Integer(65));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURRENT_TIME", "I", null, new Integer(66));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURRENT_TIMESTAMP", "I", null, new Integer(67));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURRENT_TRANSFORM_GROUP_FOR_TYPE", "I", null, new Integer(68));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURRENT_USER", "I", null, new Integer(69));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURSOR", "I", null, new Integer(70));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CYCLE", "I", null, new Integer(71));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DATE", "I", null, new Integer(72));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DAY", "I", null, new Integer(73));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEALLOCATE", "I", null, new Integer(74));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEC", "I", null, new Integer(75));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DECIMAL", "I", null, new Integer(76));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DECLARE", "I", null, new Integer(77));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT", "I", null, new Integer(78));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE", "I", null, new Integer(79));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DENSE_RANK", "I", null, new Integer(80));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEREF", "I", null, new Integer(81));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DESCRIBE", "I", null, new Integer(82));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DETERMINISTIC", "I", null, new Integer(83));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DISCONNECT", "I", null, new Integer(84));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DISTINCT", "I", null, new Integer(85));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DO", "I", null, new Integer(86));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOUBLE", "I", null, new Integer(87));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DROP", "I", null, new Integer(88));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DYNAMIC", "I", null, new Integer(89));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EACH", "I", null, new Integer(90));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ELEMENT", "I", null, new Integer(91));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ELSE", "I", null, new Integer(92));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ELSEIF", "I", null, new Integer(93));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "END", "I", null, new Integer(94));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "END_EXEC", "I", null, new Integer(95));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ESCAPE", "I", null, new Integer(96));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EVERY", "I", null, new Integer(97));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXCEPT", "I", null, new Integer(98));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXEC", "I", null, new Integer(99));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXECUTE", "I", null, new Integer(100));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXISTS", "I", null, new Integer(101));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXIT", "I", null, new Integer(102));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXP", "I", null, new Integer(103));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXTERNAL", "I", null, new Integer(104));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXTRACT", "I", null, new Integer(105));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FALSE", "I", null, new Integer(106));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FETCH", "I", null, new Integer(107));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FILTER", "I", null, new Integer(108));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FIRST_VALUE", "I", null, new Integer(109));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLOAT", "I", null, new Integer(110));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLOOR", "I", null, new Integer(111));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FOR", "I", null, new Integer(112));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FOREIGN", "I", null, new Integer(113));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FREE", "I", null, new Integer(114));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FROM", "I", null, new Integer(115));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FULL", "I", null, new Integer(116));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNCTION", "I", null, new Integer(117));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUSION", "I", null, new Integer(118));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GET", "I", null, new Integer(119));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GLOBAL", "I", null, new Integer(120));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GRANT", "I", null, new Integer(121));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GROUP", "I", null, new Integer(122));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GROUPING", "I", null, new Integer(123));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HANDLER", "I", null, new Integer(124));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HAVING", "I", null, new Integer(125));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HOLD", "I", null, new Integer(126));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HOUR", "I", null, new Integer(127));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IDENTITY", "I", null, new Integer(128));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IMPORT", "I", null, new Integer(129));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IN", "I", null, new Integer(130));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INDICATOR", "I", null, new Integer(131));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INNER", "I", null, new Integer(132));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INOUT", "I", null, new Integer(133));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSENSITIVE", "I", null, new Integer(134));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSERT", "I", null, new Integer(135));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INT", "I", null, new Integer(136));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INTEGER", "I", null, new Integer(137));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INTERSECT", "I", null, new Integer(138));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INTERSECTION", "I", null, new Integer(139));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INTERVAL", "I", null, new Integer(140));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INTO", "I", null, new Integer(141));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS", "I", null, new Integer(142));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ITERATE", "I", null, new Integer(143));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JOIN", "I", null, new Integer(144));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LAG", "I", null, new Integer(145));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LANGUAGE", "I", null, new Integer(146));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LARGE", "I", null, new Integer(147));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LAST_VALUE", "I", null, new Integer(148));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LATERAL", "I", null, new Integer(149));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LEAD", "I", null, new Integer(150));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LEADING", "I", null, new Integer(151));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LEAVE", "I", null, new Integer(152));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LEFT", "I", null, new Integer(153));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LIKE", "I", null, new Integer(154));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LIKE_REGEX", "I", null, new Integer(155));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LN", "I", null, new Integer(156));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOCAL", "I", null, new Integer(157));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOCALTIME", "I", null, new Integer(158));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOCALTIMESTAMP", "I", null, new Integer(159));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOOP", "I", null, new Integer(160));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOWER", "I", null, new Integer(161));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MATCH", "I", null, new Integer(162));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MAX", "I", null, new Integer(163));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MAX_CARDINALITY", "I", null, new Integer(164));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MEMBER", "I", null, new Integer(165));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MERGE", "I", null, new Integer(166));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "METHOD", "I", null, new Integer(167));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MIN", "I", null, new Integer(168));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MINUTE", "I", null, new Integer(169));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MOD", "I", null, new Integer(170));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MODIFIES", "I", null, new Integer(171));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MODULE", "I", null, new Integer(172));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MONTH", "I", null, new Integer(173));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MULTISET", "I", null, new Integer(174));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NATIONAL", "I", null, new Integer(175));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NATURAL", "I", null, new Integer(176));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NCHAR", "I", null, new Integer(177));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NCLOB", "I", null, new Integer(178));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NEW", "I", null, new Integer(179));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO", "I", null, new Integer(180));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NONE", "I", null, new Integer(181));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NORMALIZE", "I", null, new Integer(182));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NOT", "I", null, new Integer(183));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NTH_VALUE", "I", null, new Integer(184));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NTILE", "I", null, new Integer(185));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL", "I", null, new Integer(186));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULLIF", "I", null, new Integer(187));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NUMERIC", "I", null, new Integer(188));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OCCURRENCES_REGEX", "I", null, new Integer(189));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OCTET_LENGTH", "I", null, new Integer(190));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OF", "I", null, new Integer(191));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OFFSET", "I", null, new Integer(192));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OLD", "I", null, new Integer(193));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ON", "I", null, new Integer(194));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONLY", "I", null, new Integer(195));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPEN", "I", null, new Integer(196));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OR", "I", null, new Integer(197));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORDER", "I", null, new Integer(198));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OUT", "I", null, new Integer(199));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OUTER", "I", null, new Integer(200));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OVER", "I", null, new Integer(201));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OVERLAPS", "I", null, new Integer(202));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OVERLAY", "I", null, new Integer(203));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARAMETER", "I", null, new Integer(204));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARTITION", "I", null, new Integer(205));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PERCENT_RANK", "I", null, new Integer(206));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PERCENTILE_CONT", "I", null, new Integer(207));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PERCENTILE_DISC", "I", null, new Integer(208));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "POSITION", "I", null, new Integer(209));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "POSITION_REGEX", "I", null, new Integer(210));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "POWER", "I", null, new Integer(211));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PRECISION", "I", null, new Integer(212));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PREPARE", "I", null, new Integer(213));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PRIMARY", "I", null, new Integer(214));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROCEDURE", "I", null, new Integer(215));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RANGE", "I", null, new Integer(216));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RANK", "I", null, new Integer(217));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "READS", "I", null, new Integer(218));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REAL", "I", null, new Integer(219));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RECURSIVE", "I", null, new Integer(220));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REF", "I", null, new Integer(221));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFERENCES", "I", null, new Integer(222));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFERENCING", "I", null, new Integer(223));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REGR_AVGX", "I", null, new Integer(224));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REGR_AVGY", "I", null, new Integer(225));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REGR_COUNT", "I", null, new Integer(226));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REGR_INTERCEPT", "I", null, new Integer(227));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REGR_R2", "I", null, new Integer(228));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REGR_SLOPE", "I", null, new Integer(229));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REGR_SXX", "I", null, new Integer(230));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REGR_SXY", "I", null, new Integer(231));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REGR_SYY", "I", null, new Integer(232));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RELEASE", "I", null, new Integer(233));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REPEAT", "I", null, new Integer(234));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESIGNAL", "I", null, new Integer(235));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESULT", "I", null, new Integer(236));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURN", "I", null, new Integer(237));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURNS", "I", null, new Integer(238));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REVOKE", "I", null, new Integer(239));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RIGHT", "I", null, new Integer(240));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ROLLBACK", "I", null, new Integer(241));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ROLLUP", "I", null, new Integer(242));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ROW", "I", null, new Integer(243));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ROW_NUMBER", "I", null, new Integer(244));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ROWS", "I", null, new Integer(245));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAVEPOINT", "I", null, new Integer(246));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCOPE", "I", null, new Integer(247));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCROLL", "I", null, new Integer(248));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SEARCH", "I", null, new Integer(249));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECOND", "I", null, new Integer(250));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT", "I", null, new Integer(251));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SENSITIVE", "I", null, new Integer(252));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SESSION_USER", "I", null, new Integer(253));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SET", "I", null, new Integer(254));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNAL", "I", null, new Integer(255));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIMILAR", "I", null, new Integer(256));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SMALLINT", "I", null, new Integer(257));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOME", "I", null, new Integer(258));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SPECIFIC", "I", null, new Integer(259));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SPECIFICTYPE", "I", null, new Integer(260));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL", "I", null, new Integer(261));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQLEXCEPTION", "I", null, new Integer(262));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQLSTATE", "I", null, new Integer(263));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQLWARNING", "I", null, new Integer(264));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQRT", "I", null, new Integer(265));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STACKED", "I", null, new Integer(266));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "START", "I", null, new Integer(267));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STATIC", "I", null, new Integer(268));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STDDEV_POP", "I", null, new Integer(269));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STDDEV_SAMP", "I", null, new Integer(270));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBMULTISET", "I", null, new Integer(271));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBSTRING", "I", null, new Integer(272));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBSTRING_REGEX", "I", null, new Integer(273));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUM", "I", null, new Integer(274));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SYMMETRIC", "I", null, new Integer(275));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SYSTEM", "I", null, new Integer(276));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SYSTEM_USER", "I", null, new Integer(277));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE", "I", null, new Integer(278));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLESAMPLE", "I", null, new Integer(279));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "THEN", "I", null, new Integer(280));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIME", "I", null, new Integer(281));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIMESTAMP", "I", null, new Integer(282));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIMEZONE_HOUR", "I", null, new Integer(283));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIMEZONE_MINUTE", "I", null, new Integer(284));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TO", "I", null, new Integer(285));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRAILING", "I", null, new Integer(286));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSLATE", "I", null, new Integer(287));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSLATE_REGEX", "I", null, new Integer(288));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSLATION", "I", null, new Integer(289));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TREAT", "I", null, new Integer(290));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRIGGER", "I", null, new Integer(291));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRIM", "I", null, new Integer(292));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRIM_ARRAY", "I", null, new Integer(293));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRUE", "I", null, new Integer(294));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRUNCATE", "I", null, new Integer(295));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UESCAPE", "I", null, new Integer(296));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNDO", "I", null, new Integer(297));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNION", "I", null, new Integer(298));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNIQUE", "I", null, new Integer(299));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNKNOWN", "I", null, new Integer(300));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNNEST", "I", null, new Integer(301));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNTIL", "I", null, new Integer(302));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE", "I", null, new Integer(303));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPPER", "I", null, new Integer(304));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USER", "I", null, new Integer(305));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USING", "I", null, new Integer(306));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALUE", "I", null, new Integer(307));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALUES", "I", null, new Integer(308));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VAR_POP", "I", null, new Integer(309));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VAR_SAMP", "I", null, new Integer(310));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VARBINARY", "I", null, new Integer(311));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VARCHAR", "I", null, new Integer(312));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VARYING", "I", null, new Integer(313));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WHEN", "I", null, new Integer(314));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WHENEVER", "I", null, new Integer(315));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WHERE", "I", null, new Integer(316));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WIDTH_BUCKET", "I", null, new Integer(317));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WINDOW", "I", null, new Integer(318));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WITH", "I", null, new Integer(319));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WITHIN", "I", null, new Integer(320));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WITHOUT", "I", null, new Integer(321));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WHILE", "I", null, new Integer(322));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "YEAR", "I", null, new Integer(323));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "A", "I", null, new Integer(330));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ABSOLUTE", "I", null, new Integer(331));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACTION", "I", null, new Integer(332));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ADA", "I", null, new Integer(333));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ADD", "I", null, new Integer(334));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ADMIN", "I", null, new Integer(335));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AFTER", "I", null, new Integer(336));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALWAYS", "I", null, new Integer(337));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ASC", "I", null, new Integer(338));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ASSERTION", "I", null, new Integer(339));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ASSIGNMENT", "I", null, new Integer(340));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTRIBUTE", "I", null, new Integer(341));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTRIBUTES", "I", null, new Integer(342));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BEFORE", "I", null, new Integer(343));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BERNOULLI", "I", null, new Integer(344));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BREADTH", "I", null, new Integer(345));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "C", "I", null, new Integer(346));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CASCADE", "I", null, new Integer(347));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CATALOG", "I", null, new Integer(348));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CATALOG_NAME", "I", null, new Integer(349));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHAIN", "I", null, new Integer(350));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHARACTER_SET_CATALOG", "I", null, new Integer(351));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHARACTER_SET_NAME", "I", null, new Integer(352));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHARACTER_SET_SCHEMA", "I", null, new Integer(353));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHARACTERISTICS", "I", null, new Integer(354));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHARACTERS", "I", null, new Integer(355));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLASS_ORIGIN", "I", null, new Integer(356));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COBOL", "I", null, new Integer(357));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COLLATION", "I", null, new Integer(358));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COLLATION_CATALOG", "I", null, new Integer(359));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COLLATION_NAME", "I", null, new Integer(360));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COLLATION_SCHEMA", "I", null, new Integer(361));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COLUMN_NAME", "I", null, new Integer(362));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMAND_FUNCTION", "I", null, new Integer(363));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMAND_FUNCTION_CODE", "I", null, new Integer(364));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMITTED", "I", null, new Integer(365));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONDITION_IDENTIFIER", "I", null, new Integer(366));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONDITION_NUMBER", "I", null, new Integer(367));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION", "I", null, new Integer(368));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION_NAME", "I", null, new Integer(369));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONSTRAINT_CATALOG", "I", null, new Integer(370));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONSTRAINT_NAME", "I", null, new Integer(371));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONSTRAINT_SCHEMA", "I", null, new Integer(372));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONSTRAINTS", "I", null, new Integer(373));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONSTRUCTOR", "I", null, new Integer(374));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONTAINS", "I", null, new Integer(375));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONTINUE", "I", null, new Integer(376));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURSOR_NAME", "I", null, new Integer(377));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DATA", "I", null, new Integer(378));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DATETIME_INTERVAL_CODE", "I", null, new Integer(379));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DATETIME_INTERVAL_PRECISION", "I", null, new Integer(380));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULTS", "I", null, new Integer(381));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFERRABLE", "I", null, new Integer(382));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFERRED", "I", null, new Integer(383));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFINED", "I", null, new Integer(384));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFINER", "I", null, new Integer(385));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEGREE", "I", null, new Integer(386));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEPTH", "I", null, new Integer(387));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DERIVED", "I", null, new Integer(388));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DESC", "I", null, new Integer(389));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DESCRIPTOR", "I", null, new Integer(390));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DIAGNOSTICS", "I", null, new Integer(391));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DISPATCH", "I", null, new Integer(392));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOMAIN", "I", null, new Integer(393));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DYNAMIC_FUNCTION", "I", null, new Integer(394));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DYNAMIC_FUNCTION_CODE", "I", null, new Integer(395));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EQUALS", "I", null, new Integer(396));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXCEPTION", "I", null, new Integer(397));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXCLUDE", "I", null, new Integer(398));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXCLUDING", "I", null, new Integer(399));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FINAL", "I", null, new Integer(400));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FIRST", "I", null, new Integer(401));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FOLLOWING", "I", null, new Integer(402));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FORTRAN", "I", null, new Integer(403));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FOUND", "I", null, new Integer(404));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "G", "I", null, new Integer(405));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GENERAL", "I", null, new Integer(406));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GENERATED", "I", null, new Integer(407));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GO", "I", null, new Integer(408));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GOTO", "I", null, new Integer(409));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GRANTED", "I", null, new Integer(410));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HIERARCHY", "I", null, new Integer(411));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IF", "I", null, new Integer(412));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IGNORE", "I", null, new Integer(413));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IMMEDIATE", "I", null, new Integer(414));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IMPLEMENTATION", "I", null, new Integer(415));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCLUDING", "I", null, new Integer(416));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCREMENT", "I", null, new Integer(417));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INITIALLY", "I", null, new Integer(418));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT", "I", null, new Integer(419));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSTANCE", "I", null, new Integer(420));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSTANTIABLE", "I", null, new Integer(421));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSTEAD", "I", null, new Integer(422));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVOKER", "I", null, new Integer(423));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ISOLATION", "I", null, new Integer(424));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA", "I", null, new Integer(425));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "K", "I", null, new Integer(426));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY", "I", null, new Integer(427));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_MEMBER", "I", null, new Integer(428));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_TYPE", "I", null, new Integer(429));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LAST", "I", null, new Integer(430));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LENGTH", "I", null, new Integer(431));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LEVEL", "I", null, new Integer(432));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LIBRARY", "I", null, new Integer(433));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOCATOR", "I", null, new Integer(434));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "M", "I", null, new Integer(435));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MAP", "I", null, new Integer(436));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MATCHED", "I", null, new Integer(437));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MAXVALUE", "I", null, new Integer(438));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MESSAGE_LENGTH", "I", null, new Integer(439));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MESSAGE_OCTET_LENGTH", "I", null, new Integer(440));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MESSAGE_TEXT", "I", null, new Integer(441));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MINVALUE", "I", null, new Integer(442));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MORE", "I", null, new Integer(443));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MUMPS", "I", null, new Integer(444));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAME", "I", null, new Integer(445));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMES", "I", null, new Integer(446));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NESTING", "I", null, new Integer(447));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NEXT", "I", null, new Integer(448));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NORMALIZED", "I", null, new Integer(449));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULLABLE", "I", null, new Integer(450));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULLS", "I", null, new Integer(451));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NUMBER", "I", null, new Integer(452));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OBJECT", "I", null, new Integer(453));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OCTETS", "I", null, new Integer(454));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPTION", "I", null, new Integer(455));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPTIONS", "I", null, new Integer(456));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORDERING", "I", null, new Integer(457));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORDINALITY", "I", null, new Integer(458));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OTHERS", "I", null, new Integer(459));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OUTPUT", "I", null, new Integer(460));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OVERRIDING", "I", null, new Integer(461));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P", "I", null, new Integer(462));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PAD", "I", null, new Integer(463));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARAMETER_MODE", "I", null, new Integer(464));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARAMETER_NAME", "I", null, new Integer(465));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARAMETER_ORDINAL_POSITION", "I", null, new Integer(466));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARAMETER_SPECIFIC_CATALOG", "I", null, new Integer(467));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARAMETER_SPECIFIC_NAME", "I", null, new Integer(468));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARAMETER_SPECIFIC_SCHEMA", "I", null, new Integer(469));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARTIAL", "I", null, new Integer(470));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PASCAL", "I", null, new Integer(471));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PATH", "I", null, new Integer(472));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PLACING", "I", null, new Integer(473));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PLI", "I", null, new Integer(474));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PRECEDING", "I", null, new Integer(475));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PRESERVE", "I", null, new Integer(476));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PRIOR", "I", null, new Integer(477));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PRIVILEGES", "I", null, new Integer(478));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PUBLIC", "I", null, new Integer(479));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "READ", "I", null, new Integer(480));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RELATIVE", "I", null, new Integer(481));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REPEATABLE", "I", null, new Integer(482));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESPECT", "I", null, new Integer(483));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESTART", "I", null, new Integer(484));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESTRICT", "I", null, new Integer(485));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURNED_CARDINALITY", "I", null, new Integer(486));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURNED_LENGTH", "I", null, new Integer(487));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURNED_OCTET_LENGTH", "I", null, new Integer(488));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURNED_SQLSTATE", "I", null, new Integer(489));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ROLE", "I", null, new Integer(490));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ROUTINE", "I", null, new Integer(491));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ROUTINE_CATALOG", "I", null, new Integer(492));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ROUTINE_NAME", "I", null, new Integer(493));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ROUTINE_SCHEMA", "I", null, new Integer(494));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ROW_COUNT", "I", null, new Integer(495));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCALE", "I", null, new Integer(496));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA", "I", null, new Integer(497));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_NAME", "I", null, new Integer(498));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCOPE_CATALOG", "I", null, new Integer(499));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCOPE_NAME", "I", null, new Integer(500));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCOPE_SCHEMA", "I", null, new Integer(501));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECTION", "I", null, new Integer(502));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECURITY", "I", null, new Integer(503));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELF", "I", null, new Integer(504));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SEQUENCE", "I", null, new Integer(505));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERIALIZABLE", "I", null, new Integer(506));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVER_NAME", "I", null, new Integer(507));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SESSION", "I", null, new Integer(508));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVER", "I", null, new Integer(509));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SETS", "I", null, new Integer(510));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIMPLE", "I", null, new Integer(511));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIZE", "I", null, new Integer(512));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOURCE", "I", null, new Integer(513));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SPACE", "I", null, new Integer(514));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SPECIFIC_NAME", "I", null, new Integer(515));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STATE", "I", null, new Integer(516));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STATEMENT", "I", null, new Integer(517));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STRUCTURE", "I", null, new Integer(518));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STYLE", "I", null, new Integer(519));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBCLASS_ORIGIN", "I", null, new Integer(520));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "T", "I", null, new Integer(521));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_NAME", "I", null, new Integer(522));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TEMPORARY", "I", null, new Integer(523));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIES", "I", null, new Integer(524));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOP_LEVEL_COUNT", "I", null, new Integer(525));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSACTION", "I", null, new Integer(526));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSACTION_ACTIVE", "I", null, new Integer(527));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSACTIONS_COMMITTED", "I", null, new Integer(528));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSACTIONS_ROLLED_BACK", "I", null, new Integer(529));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSFORM", "I", null, new Integer(530));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSFORMS", "I", null, new Integer(531));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRIGGER_CATALOG", "I", null, new Integer(532));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRIGGER_NAME", "I", null, new Integer(533));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRIGGER_SCHEMA", "I", null, new Integer(534));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE", "I", null, new Integer(535));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNBOUNDED", "I", null, new Integer(536));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNCOMMITTED", "I", null, new Integer(537));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNDER", "I", null, new Integer(538));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNNAMED", "I", null, new Integer(539));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USAGE", "I", null, new Integer(540));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USER_DEFINED_TYPE_CATALOG", "I", null, new Integer(541));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USER_DEFINED_TYPE_CODE", "I", null, new Integer(542));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USER_DEFINED_TYPE_NAME", "I", null, new Integer(543));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USER_DEFINED_TYPE_SCHEMA", "I", null, new Integer(544));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VIEW", "I", null, new Integer(545));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WORK", "I", null, new Integer(546));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WRITE", "I", null, new Integer(547));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WRAPPER", "I", null, new Integer(548));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ZONE", "I", null, new Integer(549));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ALIAS", "I", null, new Integer(558));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "AGGREGATE", "I", null, new Integer(559));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "AUTOCOMMIT", "I", null, new Integer(560));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "AUTHENTICATION", "I", null, new Integer(561));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "BACKUP", "I", null, new Integer(562));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "BINARY_FLOAT", "I", null, new Integer(563));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "BINARY_DOUBLE", "I", null, new Integer(564));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "BIT", "I", null, new Integer(565));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "BLOCKING", "I", null, new Integer(566));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "BODY", "I", null, new Integer(567));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "BYTE", "I", null, new Integer(568));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CACHE", "I", null, new Integer(569));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CACHED", "I", null, new Integer(570));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CASEWHEN", "I", null, new Integer(571));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CHECKPOINT", "I", null, new Integer(572));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CITEXT", "I", null, new Integer(573));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CLASS", "I", null, new Integer(574));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CLUSTERED", "I", null, new Integer(575));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "COMMENT", "I", null, new Integer(576));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "COMPACT", "I", null, new Integer(577));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "COMPRESSED", "I", null, new Integer(578));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CONFLICT", "I", null, new Integer(579));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CONTROL", "I", null, new Integer(580));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CURRVAL", "I", null, new Integer(581));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DATABASE", "I", null, new Integer(582));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DEADLOCK", "I", null, new Integer(583));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DEFRAG", "I", null, new Integer(584));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DELAY", "I", null, new Integer(585));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DIGEST", "I", null, new Integer(586));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "EVENT", "I", null, new Integer(587));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "EXPLAIN", "I", null, new Integer(588));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "FILE", "I", null, new Integer(589));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "FILES", "I", null, new Integer(590));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "FORMAT", "I", null, new Integer(591));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "GC", "I", null, new Integer(592));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "HEADER", "I", null, new Integer(593));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "IGNORECASE", "I", null, new Integer(594));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "IMMEDIATELY", "I", null, new Integer(595));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "INTEGRITY", "I", null, new Integer(596));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "INDEX", "I", null, new Integer(597));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "INITIAL", "I", null, new Integer(598));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LASTVAL", "I", null, new Integer(599));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LIMIT", "I", null, new Integer(600));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LOCK", "I", null, new Integer(601));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LOCKS", "I", null, new Integer(602));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LONG", "I", null, new Integer(603));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LONGVAR", "I", null, new Integer(604));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MAXROWS", "I", null, new Integer(605));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MEDIAN", "I", null, new Integer(606));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MEMORY", "I", null, new Integer(607));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MILLIS", "I", null, new Integer(608));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MINUS_EXCEPT", "I", null, new Integer(609));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "NAN", "I", null, new Integer(610));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "NEXTVAL", "I", null, new Integer(611));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "NVARCHAR2", "I", null, new Integer(612));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "NVL2", "I", null, new Integer(613));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "OFF", "I", null, new Integer(614));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PASSWORD", "I", null, new Integer(615));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PLAN", "I", null, new Integer(616));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PREVVAL", "I", null, new Integer(617));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROPERTY", "I", null, new Integer(618));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "RAW", "I", null, new Integer(619));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "READONLY", "I", null, new Integer(620));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "REFERENTIAL", "I", null, new Integer(621));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "REGULAR", "I", null, new Integer(622));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "RENAME", "I", null, new Integer(623));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "RESET", "I", null, new Integer(624));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ROWNUM", "I", null, new Integer(625));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SCRIPT", "I", null, new Integer(626));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SEPARATOR", "I", null, new Integer(627));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SHUTDOWN", "I", null, new Integer(628));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SYNTAX", "I", null, new Integer(629));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TDC", "I", null, new Integer(630));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TEMP", "I", null, new Integer(631));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TEXT", "I", null, new Integer(632));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TTI", "I", null, new Integer(633));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TYPES", "I", null, new Integer(634));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "VARCHAR2", "I", null, new Integer(635));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "WRITE_DELAY", "I", null, new Integer(636));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "INDEXER", "I", null, new Integer(637));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ACOS", "I", null, new Integer(640));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ACTION_ID", "I", null, new Integer(641));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARRAY_SORT", "I", null, new Integer(642));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ASCII", "I", null, new Integer(643));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ADD_MONTHS", "I", null, new Integer(644));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ASIN", "I", null, new Integer(645));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ATAN", "I", null, new Integer(646));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ATAN2", "I", null, new Integer(647));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "BIT_LENGTH", "I", null, new Integer(648));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "BITAND", "I", null, new Integer(649));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "BITANDNOT", "I", null, new Integer(650));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "BITLENGTH", "I", null, new Integer(651));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "BITNOT", "I", null, new Integer(652));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "BITOR", "I", null, new Integer(653));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "BITXOR", "I", null, new Integer(654));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CHR", "I", null, new Integer(655));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CONCAT_WORD", "I", null, new Integer(656));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CONCAT_WS", "I", null, new Integer(657));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "COS", "I", null, new Integer(658));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "COT", "I", null, new Integer(659));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CRYPT_KEY", "I", null, new Integer(660));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CURDATE", "I", null, new Integer(661));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CURTIME", "I", null, new Integer(662));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DATABASE_ISOLATION_LEVEL", "I", null, new Integer(663));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DATABASE_NAME", "I", null, new Integer(664));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DATABASE_TIMEZONE", "I", null, new Integer(665));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DATABASE_VERSION", "I", null, new Integer(666));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DATE_ADD", "I", null, new Integer(667));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DATE_SUB", "I", null, new Integer(668));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DATEADD", "I", null, new Integer(669));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DATEDIFF", "I", null, new Integer(670));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DAY_NAME", "I", null, new Integer(671));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DAY_OF_MONTH", "I", null, new Integer(672));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DAY_OF_WEEK", "I", null, new Integer(673));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DAY_OF_YEAR", "I", null, new Integer(674));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DAYNAME", "I", null, new Integer(675));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DAYOFMONTH", "I", null, new Integer(676));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DAYOFWEEK", "I", null, new Integer(677));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DAYOFYEAR", "I", null, new Integer(678));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DAYS", "I", null, new Integer(679));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DBTIMEZONE", "I", null, new Integer(680));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DECODE", "I", null, new Integer(681));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DEGREES", "I", null, new Integer(682));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DIFFERENCE", "I", null, new Integer(683));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DMOD", "I", null, new Integer(684));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "FROM_TZ", "I", null, new Integer(685));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "HEXTORAW", "I", null, new Integer(686));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "GREATEST", "I", null, new Integer(687));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "GROUP_CONCAT", "I", null, new Integer(688));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "IFNULL", "I", null, new Integer(689));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "INSTR", "I", null, new Integer(690));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "IS_AUTOCOMMIT", "I", null, new Integer(691));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "IS_READONLY_DATABASE", "I", null, new Integer(692));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "IS_READONLY_DATABASE_FILES", "I", null, new Integer(693));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "IS_READONLY_SESSION", "I", null, new Integer(694));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ISOLATION_LEVEL", "I", null, new Integer(695));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ISNULL", "I", null, new Integer(696));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LAST_DAY", "I", null, new Integer(697));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LCASE", "I", null, new Integer(698));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LEAST", "I", null, new Integer(699));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LOAD_FILE", "I", null, new Integer(700));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LOCATE", "I", null, new Integer(701));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LOB", "I", null, new Integer(702));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LOG", "I", null, new Integer(703));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LOG10", "I", null, new Integer(704));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LPAD", "I", null, new Integer(705));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LTRIM", "I", null, new Integer(706));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LOB_ID", "I", null, new Integer(707));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MONTH_NAME", "I", null, new Integer(708));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MONTHNAME", "I", null, new Integer(709));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MONTHS_BETWEEN", "I", null, new Integer(710));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MVCC", "I", null, new Integer(711));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MVLOCKS", "I", null, new Integer(712));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "NEW_TIME", "I", null, new Integer(713));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "NEXT_DAY", "I", null, new Integer(714));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "NIO", "I", null, new Integer(715));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "NOW", "I", null, new Integer(716));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "NUMTODSINTERVAL", "I", null, new Integer(717));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "NUMTOYMINTERVAL", "I", null, new Integer(718));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "OCTETLENGTH", "I", null, new Integer(719));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PI", "I", null, new Integer(720));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "POSITION_ARRAY", "I", null, new Integer(721));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUARTER", "I", null, new Integer(722));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "RADIANS", "I", null, new Integer(723));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "RAND", "I", null, new Integer(724));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "RAWTOHEX", "I", null, new Integer(725));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "REGEXP_MATCHES", "I", null, new Integer(726));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "REGEXP_SUBSTRING", "I", null, new Integer(727));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "REGEXP_SUBSTRING_ARRAY", "I", null, new Integer(728));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "REPLACE", "I", null, new Integer(729));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "REVERSE", "I", null, new Integer(730));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ROUND", "I", null, new Integer(731));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ROUNDMAGIC", "I", null, new Integer(732));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "RTRIM", "I", null, new Integer(733));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "RPAD", "I", null, new Integer(734));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECONDS_MIDNIGHT", "I", null, new Integer(735));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SEQUENCE_ARRAY", "I", null, new Integer(736));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SESSION_ID", "I", null, new Integer(737));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SESSION_ISOLATION_LEVEL", "I", null, new Integer(738));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SESSION_TIMEZONE", "I", null, new Integer(739));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SESSIONTIMEZONE", "I", null, new Integer(740));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SIGN", "I", null, new Integer(741));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SIN", "I", null, new Integer(742));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SORT_ARRAY", "I", null, new Integer(743));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SOUNDEX", "I", null, new Integer(744));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SPACE_WORD", "I", null, new Integer(755));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SUBSTR", "I", null, new Integer(756));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SYS_EXTRACT_UTC", "I", null, new Integer(757));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SYSDATE", "I", null, new Integer(758));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SYSTIMESTAMP", "I", null, new Integer(759));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TAN", "I", null, new Integer(760));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TIMESTAMP_WITH_ZONE", "I", null, new Integer(761));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TIMESTAMPADD", "I", null, new Integer(762));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TIMESTAMPDIFF", "I", null, new Integer(763));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TIMEZONE", "I", null, new Integer(764));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TO_CHAR", "I", null, new Integer(765));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TO_DATE", "I", null, new Integer(766));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TO_DSINTERVAL", "I", null, new Integer(767));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TO_YMINTERVAL", "I", null, new Integer(768));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TO_NUMBER", "I", null, new Integer(769));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TO_TIMESTAMP", "I", null, new Integer(770));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TO_TIMESTAMP_TZ", "I", null, new Integer(771));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TODAY", "I", null, new Integer(772));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TOP", "I", null, new Integer(773));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TRANSACTION_CONTROL", "I", null, new Integer(774));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TRANSACTION_ID", "I", null, new Integer(775));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TRANSACTION_SIZE", "I", null, new Integer(776));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TRUNC", "I", null, new Integer(777));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TZ_OFFSET", "I", null, new Integer(778));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "UCASE", "I", null, new Integer(779));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "UNIX_MILLIS", "I", null, new Integer(780));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "UNIX_TIMESTAMP", "I", null, new Integer(781));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "UUID", "I", null, new Integer(782));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "WEEK", "I", null, new Integer(790));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEEK_OF_YEAR", "I", null, new Integer(791));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LONGBLOB", "I", null, new Integer(792));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LONGTEXT", "I", null, new Integer(793));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MEDIUMBLOB", "I", null, new Integer(794));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MEDIUMTEXT", "I", null, new Integer(795));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TINYBLOB", "I", null, new Integer(796));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "TINYTEXT", "I", null, new Integer(797));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ASTERISK", "I", null, new Integer(801));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CLOSEBRACKET", "I", null, new Integer(802));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "COLON", "I", null, new Integer(803));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "COMMA", "I", null, new Integer(804));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CONCAT", "I", null, new Integer(805));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DIVIDE", "I", null, new Integer(806));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DOUBLE_COLON_OP", "I", null, new Integer(807));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DOUBLE_PERIOD_OP", "I", null, new Integer(808));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "GREATER", "I", null, new Integer(809));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "GREATER_EQUALS", "I", null, new Integer(810));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LEFTBRACKET", "I", null, new Integer(811));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LESS", "I", null, new Integer(812));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LESS_EQUALS", "I", null, new Integer(813));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MINUS", "I", null, new Integer(814));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "NOT_EQUALS", "I", null, new Integer(815));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "OPENBRACKET", "I", null, new Integer(816));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PLUS", "I", null, new Integer(817));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "QUESTION", "I", null, new Integer(818));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "RIGHT_ARROW_OP", "I", null, new Integer(819));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "RIGHTBRACKET", "I", null, new Integer(820));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SEMICOLON", "I", null, new Integer(821));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_BIGINT", "I", null, new Integer(822));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_BINARY", "I", null, new Integer(823));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_BIT", "I", null, new Integer(824));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_BLOB", "I", null, new Integer(825));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_BOOLEAN", "I", null, new Integer(826));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_CHAR", "I", null, new Integer(827));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_CLOB", "I", null, new Integer(828));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_DATE", "I", null, new Integer(829));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_DECIMAL", "I", null, new Integer(831));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_DATALINK", "I", null, new Integer(832));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_DOUBLE", "I", null, new Integer(833));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_FLOAT", "I", null, new Integer(834));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTEGER", "I", null, new Integer(835));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_LONGVARBINARY", "I", null, new Integer(836));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_LONGNVARCHAR", "I", null, new Integer(837));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_LONGVARCHAR", "I", null, new Integer(838));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_NCHAR", "I", null, new Integer(839));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_NCLOB", "I", null, new Integer(840));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_NUMERIC", "I", null, new Integer(841));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_NVARCHAR", "I", null, new Integer(842));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_REAL", "I", null, new Integer(843));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_ROWID", "I", null, new Integer(844));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_SQLXML", "I", null, new Integer(845));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_SMALLINT", "I", null, new Integer(846));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_TIME", "I", null, new Integer(847));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_TIMESTAMP", "I", null, new Integer(848));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_TINYINT", "I", null, new Integer(849));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_VARBINARY", "I", null, new Integer(850));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_VARCHAR", "I", null, new Integer(851));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SQL_TSI_FRAC_SECOND", "I", null, new Integer(852));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SQL_TSI_MILLI_SECOND", "I", null, new Integer(853));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SQL_TSI_SECOND", "I", null, new Integer(854));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SQL_TSI_MINUTE", "I", null, new Integer(855));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SQL_TSI_HOUR", "I", null, new Integer(856));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SQL_TSI_DAY", "I", null, new Integer(857));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SQL_TSI_WEEK", "I", null, new Integer(858));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SQL_TSI_MONTH", "I", null, new Integer(859));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SQL_TSI_QUARTER", "I", null, new Integer(860));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SQL_TSI_YEAR", "I", null, new Integer(861));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "X_KEYSET", "I", null, new Integer(863));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "X_OPTION", "I", null, new Integer(864));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "X_REPEAT", "I", null, new Integer(865));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "X_POS_INTEGER", "I", null, new Integer(866));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_VALUE", "I", null, new Integer(869));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_IDENTIFIER", "I", null, new Integer(870));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_DELIMITED_IDENTIFIER", "I", null, new Integer(871));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_ENDPARSE", "I", null, new Integer(872));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_STARTPARSE", "I", null, new Integer(873));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_REMARK", "I", null, new Integer(874));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_NULL", "I", null, new Integer(875));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_LOB_SIZE", "I", null, new Integer(876));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_MALFORMED_STRING", "I", null, new Integer(877));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_MALFORMED_NUMERIC", "I", null, new Integer(878));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_MALFORMED_BIT_STRING", "I", null, new Integer(879));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_MALFORMED_BINARY_STRING", "I", null, new Integer(880));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_MALFORMED_UNICODE_STRING", "I", null, new Integer(881));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_MALFORMED_COMMENT", "I", null, new Integer(882));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_MALFORMED_IDENTIFIER", "I", null, new Integer(883));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_MALFORMED_UNICODE_ESCAPE", "I", null, new Integer(884));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X_UNKNOWN_TOKEN", "I", null, new Integer(-1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "coreReservedWords", "Lorg/hsqldb/lib/OrderedIntHashSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_FIELD_CODES", "[S", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_FIELD_NAMES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "sqlTSILookup", "Lorg/hsqldb/lib/IntKeyHashMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "get", "(Ljava/lang/String;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "get", "(Ljava/lang/Object;I)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "get", "(Ljava/lang/Object;I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isCoreKeyword", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "coreReservedWords", "Lorg/hsqldb/lib/OrderedIntHashSet;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/OrderedIntHashSet", "contains", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isKeyword", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "containsKey", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getKeywordID", "(Ljava/lang/String;I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "get", "(Ljava/lang/Object;I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getNonKeywordID", "(Ljava/lang/String;I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "get", "(Ljava/lang/Object;I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getKeyword", "(I)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "getKey", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "getKey", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getSQLTSIString", "(I)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "sqlTSILookup", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "get", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/IntValueHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 351);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/IntValueHashMap", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ABS");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("AGGREGATE");
methodVisitor.visitIntInsn(SIPUSH, 559);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ALL");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ALLOCATE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ALTER");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("AND");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ANY");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ARE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ARRAY");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ARRAY_AGG");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("AS");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ASENSITIVE");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ASYMMETRIC");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("AT");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ATOMIC");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("AUTHORIZATION");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("AVG");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BEGIN");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BETWEEN");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BIGINT");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BINARY");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BIT_LENGTH");
methodVisitor.visitIntInsn(SIPUSH, 648);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BLOB");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BOOLEAN");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BOTH");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BY");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CALL");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CALLED");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CARDINALITY");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CASCADED");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CASE");
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CAST");
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CEIL");
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CEILING");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CHAR");
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CHAR_LENGTH");
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CHARACTER");
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CHARACTER_LENGTH");
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CHECK");
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CLOB");
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CLOSE");
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COALESCE");
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COLLATE");
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COLLECT");
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COLUMN");
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COMMIT");
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COMPARABLE");
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CONDIITON");
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CONNECT");
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CONSTRAINT");
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CONVERT");
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CORR");
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CORRESPONDING");
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COUNT");
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COVAR_POP");
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COVAR_SAMP");
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CREATE");
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CROSS");
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CUBE");
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CUME_DIST");
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CURRENT");
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CURRENT_CATALOG");
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CURRENT_DATE");
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CURRENT_DEFAULT_TRANSFORM_GROUP");
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CURRENT_PATH");
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CURRENT_ROLE");
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CURRENT_SCHEMA");
methodVisitor.visitIntInsn(BIPUSH, 65);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CURRENT_TIME");
methodVisitor.visitIntInsn(BIPUSH, 66);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CURRENT_TIMESTAMP");
methodVisitor.visitIntInsn(BIPUSH, 67);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DO");
methodVisitor.visitIntInsn(BIPUSH, 86);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CURRENT_TRANSFORM_GROUP_FOR_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 68);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CURRENT_USER");
methodVisitor.visitIntInsn(BIPUSH, 69);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CURSOR");
methodVisitor.visitIntInsn(BIPUSH, 70);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CYCLE");
methodVisitor.visitIntInsn(BIPUSH, 71);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DATE");
methodVisitor.visitIntInsn(BIPUSH, 72);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DAY");
methodVisitor.visitIntInsn(BIPUSH, 73);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DEALLOCATE");
methodVisitor.visitIntInsn(BIPUSH, 74);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DEC");
methodVisitor.visitIntInsn(BIPUSH, 75);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DECIMAL");
methodVisitor.visitIntInsn(BIPUSH, 76);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DECLARE");
methodVisitor.visitIntInsn(BIPUSH, 77);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DEFAULT");
methodVisitor.visitIntInsn(BIPUSH, 78);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DELETE");
methodVisitor.visitIntInsn(BIPUSH, 79);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DENSE_RANK");
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DEREF");
methodVisitor.visitIntInsn(BIPUSH, 81);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DESCRIBE");
methodVisitor.visitIntInsn(BIPUSH, 82);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DETERMINISTIC");
methodVisitor.visitIntInsn(BIPUSH, 83);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DISCONNECT");
methodVisitor.visitIntInsn(BIPUSH, 84);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DISTINCT");
methodVisitor.visitIntInsn(BIPUSH, 85);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DOUBLE");
methodVisitor.visitIntInsn(BIPUSH, 87);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DROP");
methodVisitor.visitIntInsn(BIPUSH, 88);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DYNAMIC");
methodVisitor.visitIntInsn(BIPUSH, 89);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("EACH");
methodVisitor.visitIntInsn(BIPUSH, 90);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ELEMENT");
methodVisitor.visitIntInsn(BIPUSH, 91);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ELSE");
methodVisitor.visitIntInsn(BIPUSH, 92);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ELSEIF");
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("END");
methodVisitor.visitIntInsn(BIPUSH, 94);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("END_EXEC");
methodVisitor.visitIntInsn(BIPUSH, 95);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ESCAPE");
methodVisitor.visitIntInsn(BIPUSH, 96);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("EVERY");
methodVisitor.visitIntInsn(BIPUSH, 97);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("EXCEPT");
methodVisitor.visitIntInsn(BIPUSH, 98);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("EXEC");
methodVisitor.visitIntInsn(BIPUSH, 99);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("EXECUTE");
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("EXISTS");
methodVisitor.visitIntInsn(BIPUSH, 101);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("EXIT");
methodVisitor.visitIntInsn(BIPUSH, 102);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("EXP");
methodVisitor.visitIntInsn(BIPUSH, 103);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("EXTERNAL");
methodVisitor.visitIntInsn(BIPUSH, 104);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("EXTRACT");
methodVisitor.visitIntInsn(BIPUSH, 105);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FALSE");
methodVisitor.visitIntInsn(BIPUSH, 106);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FETCH");
methodVisitor.visitIntInsn(BIPUSH, 107);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FILTER");
methodVisitor.visitIntInsn(BIPUSH, 108);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FIRST_VALUE");
methodVisitor.visitIntInsn(BIPUSH, 109);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FLOAT");
methodVisitor.visitIntInsn(BIPUSH, 110);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FLOOR");
methodVisitor.visitIntInsn(BIPUSH, 111);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FOR");
methodVisitor.visitIntInsn(BIPUSH, 112);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FOREIGN");
methodVisitor.visitIntInsn(BIPUSH, 113);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FREE");
methodVisitor.visitIntInsn(BIPUSH, 114);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FROM");
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FULL");
methodVisitor.visitIntInsn(BIPUSH, 116);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FUNCTION");
methodVisitor.visitIntInsn(BIPUSH, 117);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FUSION");
methodVisitor.visitIntInsn(BIPUSH, 118);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("GET");
methodVisitor.visitIntInsn(BIPUSH, 119);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("GLOBAL");
methodVisitor.visitIntInsn(BIPUSH, 120);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("GRANT");
methodVisitor.visitIntInsn(BIPUSH, 121);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("GROUP");
methodVisitor.visitIntInsn(BIPUSH, 122);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("GROUPING");
methodVisitor.visitIntInsn(BIPUSH, 123);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("HANDLER");
methodVisitor.visitIntInsn(BIPUSH, 124);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("HAVING");
methodVisitor.visitIntInsn(BIPUSH, 125);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("HOLD");
methodVisitor.visitIntInsn(BIPUSH, 126);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("HOUR");
methodVisitor.visitIntInsn(BIPUSH, 127);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("IDENTITY");
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("IF");
methodVisitor.visitIntInsn(SIPUSH, 412);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("IMPORT");
methodVisitor.visitIntInsn(SIPUSH, 129);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("IN");
methodVisitor.visitIntInsn(SIPUSH, 130);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INDICATOR");
methodVisitor.visitIntInsn(SIPUSH, 131);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INNER");
methodVisitor.visitIntInsn(SIPUSH, 132);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INOUT");
methodVisitor.visitIntInsn(SIPUSH, 133);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INSENSITIVE");
methodVisitor.visitIntInsn(SIPUSH, 134);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INSERT");
methodVisitor.visitIntInsn(SIPUSH, 135);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INT");
methodVisitor.visitIntInsn(SIPUSH, 136);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INTEGER");
methodVisitor.visitIntInsn(SIPUSH, 137);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INTERSECT");
methodVisitor.visitIntInsn(SIPUSH, 138);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INTERSECTION");
methodVisitor.visitIntInsn(SIPUSH, 139);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INTERVAL");
methodVisitor.visitIntInsn(SIPUSH, 140);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INTO");
methodVisitor.visitIntInsn(SIPUSH, 141);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("IS");
methodVisitor.visitIntInsn(SIPUSH, 142);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ITERATE");
methodVisitor.visitIntInsn(SIPUSH, 143);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("JOIN");
methodVisitor.visitIntInsn(SIPUSH, 144);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LAG");
methodVisitor.visitIntInsn(SIPUSH, 145);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LANGUAGE");
methodVisitor.visitIntInsn(SIPUSH, 146);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LARGE");
methodVisitor.visitIntInsn(SIPUSH, 147);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LAST_VALUE");
methodVisitor.visitIntInsn(SIPUSH, 148);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LATERAL");
methodVisitor.visitIntInsn(SIPUSH, 149);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LEAD");
methodVisitor.visitIntInsn(SIPUSH, 150);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LEADING");
methodVisitor.visitIntInsn(SIPUSH, 151);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LEAVE");
methodVisitor.visitIntInsn(SIPUSH, 152);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LEFT");
methodVisitor.visitIntInsn(SIPUSH, 153);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LIKE");
methodVisitor.visitIntInsn(SIPUSH, 154);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LIKE_REGX");
methodVisitor.visitIntInsn(SIPUSH, 155);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LN");
methodVisitor.visitIntInsn(SIPUSH, 156);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LOCAL");
methodVisitor.visitIntInsn(SIPUSH, 157);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LOCALTIME");
methodVisitor.visitIntInsn(SIPUSH, 158);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LOCALTIMESTAMP");
methodVisitor.visitIntInsn(SIPUSH, 159);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LOOP");
methodVisitor.visitIntInsn(SIPUSH, 160);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LOWER");
methodVisitor.visitIntInsn(SIPUSH, 161);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MATCH");
methodVisitor.visitIntInsn(SIPUSH, 162);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MAX");
methodVisitor.visitIntInsn(SIPUSH, 163);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MAX_CARDINALITY");
methodVisitor.visitIntInsn(SIPUSH, 164);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MEMBER");
methodVisitor.visitIntInsn(SIPUSH, 165);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MERGE");
methodVisitor.visitIntInsn(SIPUSH, 166);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("METHOD");
methodVisitor.visitIntInsn(SIPUSH, 167);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MIN");
methodVisitor.visitIntInsn(SIPUSH, 168);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MINUTE");
methodVisitor.visitIntInsn(SIPUSH, 169);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MOD");
methodVisitor.visitIntInsn(SIPUSH, 170);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MODIFIES");
methodVisitor.visitIntInsn(SIPUSH, 171);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MODULE");
methodVisitor.visitIntInsn(SIPUSH, 172);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MONTH");
methodVisitor.visitIntInsn(SIPUSH, 173);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MULTISET");
methodVisitor.visitIntInsn(SIPUSH, 174);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NATIONAL");
methodVisitor.visitIntInsn(SIPUSH, 175);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NATURAL");
methodVisitor.visitIntInsn(SIPUSH, 176);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NCHAR");
methodVisitor.visitIntInsn(SIPUSH, 177);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NCLOB");
methodVisitor.visitIntInsn(SIPUSH, 178);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NEW");
methodVisitor.visitIntInsn(SIPUSH, 179);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NO");
methodVisitor.visitIntInsn(SIPUSH, 180);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NONE");
methodVisitor.visitIntInsn(SIPUSH, 181);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NORMALIZE");
methodVisitor.visitIntInsn(SIPUSH, 182);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NOT");
methodVisitor.visitIntInsn(SIPUSH, 183);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NTH_VALUE");
methodVisitor.visitIntInsn(SIPUSH, 184);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NTILE");
methodVisitor.visitIntInsn(SIPUSH, 185);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NULL");
methodVisitor.visitIntInsn(SIPUSH, 186);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NULLIF");
methodVisitor.visitIntInsn(SIPUSH, 187);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NUMERIC");
methodVisitor.visitIntInsn(SIPUSH, 188);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OCCURRENCES_REGEX");
methodVisitor.visitIntInsn(SIPUSH, 189);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OCTET_LENGTH");
methodVisitor.visitIntInsn(SIPUSH, 190);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OF");
methodVisitor.visitIntInsn(SIPUSH, 191);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OFFSET");
methodVisitor.visitIntInsn(SIPUSH, 192);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OLD");
methodVisitor.visitIntInsn(SIPUSH, 193);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ON");
methodVisitor.visitIntInsn(SIPUSH, 194);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ONLY");
methodVisitor.visitIntInsn(SIPUSH, 195);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OPEN");
methodVisitor.visitIntInsn(SIPUSH, 196);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OR");
methodVisitor.visitIntInsn(SIPUSH, 197);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ORDER");
methodVisitor.visitIntInsn(SIPUSH, 198);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OUT");
methodVisitor.visitIntInsn(SIPUSH, 199);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OUTER");
methodVisitor.visitIntInsn(SIPUSH, 200);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OVER");
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OVERLAPS");
methodVisitor.visitIntInsn(SIPUSH, 202);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OVERLAY");
methodVisitor.visitIntInsn(SIPUSH, 203);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PARAMETER");
methodVisitor.visitIntInsn(SIPUSH, 204);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PARTITION");
methodVisitor.visitIntInsn(SIPUSH, 205);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PERCENT_RANK");
methodVisitor.visitIntInsn(SIPUSH, 206);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PERCENTILE_CONT");
methodVisitor.visitIntInsn(SIPUSH, 207);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PERCENTILE_DISC");
methodVisitor.visitIntInsn(SIPUSH, 208);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("POSITION");
methodVisitor.visitIntInsn(SIPUSH, 209);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("POSITION_REGEX");
methodVisitor.visitIntInsn(SIPUSH, 210);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("POWER");
methodVisitor.visitIntInsn(SIPUSH, 211);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PRECISION");
methodVisitor.visitIntInsn(SIPUSH, 212);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PREPARE");
methodVisitor.visitIntInsn(SIPUSH, 213);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PRIMARY");
methodVisitor.visitIntInsn(SIPUSH, 214);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PROCEDURE");
methodVisitor.visitIntInsn(SIPUSH, 215);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RANGE");
methodVisitor.visitIntInsn(SIPUSH, 216);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RANK");
methodVisitor.visitIntInsn(SIPUSH, 217);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("READS");
methodVisitor.visitIntInsn(SIPUSH, 218);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REAL");
methodVisitor.visitIntInsn(SIPUSH, 219);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RECURSIVE");
methodVisitor.visitIntInsn(SIPUSH, 220);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REF");
methodVisitor.visitIntInsn(SIPUSH, 221);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REFERENCES");
methodVisitor.visitIntInsn(SIPUSH, 222);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REFERENCING");
methodVisitor.visitIntInsn(SIPUSH, 223);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REGR_AVGX");
methodVisitor.visitIntInsn(SIPUSH, 224);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REGR_AVGY");
methodVisitor.visitIntInsn(SIPUSH, 225);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REGR_COUNT");
methodVisitor.visitIntInsn(SIPUSH, 226);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REGR_INTERCEPT");
methodVisitor.visitIntInsn(SIPUSH, 227);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REGR_R2");
methodVisitor.visitIntInsn(SIPUSH, 228);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REGR_SLOPE");
methodVisitor.visitIntInsn(SIPUSH, 229);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REGR_SXX");
methodVisitor.visitIntInsn(SIPUSH, 230);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REGR_SXY");
methodVisitor.visitIntInsn(SIPUSH, 231);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REGR_SYY");
methodVisitor.visitIntInsn(SIPUSH, 232);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RELEASE");
methodVisitor.visitIntInsn(SIPUSH, 233);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REPEAT");
methodVisitor.visitIntInsn(SIPUSH, 234);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RESIGNAL");
methodVisitor.visitIntInsn(SIPUSH, 235);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RETURN");
methodVisitor.visitIntInsn(SIPUSH, 237);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RETURNS");
methodVisitor.visitIntInsn(SIPUSH, 238);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REVOKE");
methodVisitor.visitIntInsn(SIPUSH, 239);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RIGHT");
methodVisitor.visitIntInsn(SIPUSH, 240);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ROLLBACK");
methodVisitor.visitIntInsn(SIPUSH, 241);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ROLLUP");
methodVisitor.visitIntInsn(SIPUSH, 242);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ROW");
methodVisitor.visitIntInsn(SIPUSH, 243);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ROW_NUMBER");
methodVisitor.visitIntInsn(SIPUSH, 244);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ROWS");
methodVisitor.visitIntInsn(SIPUSH, 245);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SAVEPOINT");
methodVisitor.visitIntInsn(SIPUSH, 246);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SCOPE");
methodVisitor.visitIntInsn(SIPUSH, 247);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SCROLL");
methodVisitor.visitIntInsn(SIPUSH, 248);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SEARCH");
methodVisitor.visitIntInsn(SIPUSH, 249);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SECOND");
methodVisitor.visitIntInsn(SIPUSH, 250);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SELECT");
methodVisitor.visitIntInsn(SIPUSH, 251);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SENSITIVE");
methodVisitor.visitIntInsn(SIPUSH, 252);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SESSION_USER");
methodVisitor.visitIntInsn(SIPUSH, 253);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SET");
methodVisitor.visitIntInsn(SIPUSH, 254);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SIGNAL");
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SIMILAR");
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SMALLINT");
methodVisitor.visitIntInsn(SIPUSH, 257);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SOME");
methodVisitor.visitIntInsn(SIPUSH, 258);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SPECIFIC");
methodVisitor.visitIntInsn(SIPUSH, 259);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SPECIFICTYPE");
methodVisitor.visitIntInsn(SIPUSH, 260);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL");
methodVisitor.visitIntInsn(SIPUSH, 261);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQLEXCEPTION");
methodVisitor.visitIntInsn(SIPUSH, 262);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQLSTATE");
methodVisitor.visitIntInsn(SIPUSH, 263);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQLWARNING");
methodVisitor.visitIntInsn(SIPUSH, 264);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQRT");
methodVisitor.visitIntInsn(SIPUSH, 265);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("STACKED");
methodVisitor.visitIntInsn(SIPUSH, 266);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("START");
methodVisitor.visitIntInsn(SIPUSH, 267);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("STATIC");
methodVisitor.visitIntInsn(SIPUSH, 268);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("STDDEV_POP");
methodVisitor.visitIntInsn(SIPUSH, 269);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("STDDEV_SAMP");
methodVisitor.visitIntInsn(SIPUSH, 270);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SUBMULTISET");
methodVisitor.visitIntInsn(SIPUSH, 271);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SUBSTRING");
methodVisitor.visitIntInsn(SIPUSH, 272);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SUBSTRING_REGEX");
methodVisitor.visitIntInsn(SIPUSH, 273);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SUM");
methodVisitor.visitIntInsn(SIPUSH, 274);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SYMMETRIC");
methodVisitor.visitIntInsn(SIPUSH, 275);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SYSTEM");
methodVisitor.visitIntInsn(SIPUSH, 276);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SYSTEM_USER");
methodVisitor.visitIntInsn(SIPUSH, 277);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TABLE");
methodVisitor.visitIntInsn(SIPUSH, 278);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TABLESAMPLE");
methodVisitor.visitIntInsn(SIPUSH, 279);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("THEN");
methodVisitor.visitIntInsn(SIPUSH, 280);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TIME");
methodVisitor.visitIntInsn(SIPUSH, 281);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TIMESTAMP");
methodVisitor.visitIntInsn(SIPUSH, 282);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TIMEZONE_HOUR");
methodVisitor.visitIntInsn(SIPUSH, 283);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TIMEZONE_MINUTE");
methodVisitor.visitIntInsn(SIPUSH, 284);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TO");
methodVisitor.visitIntInsn(SIPUSH, 285);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRAILING");
methodVisitor.visitIntInsn(SIPUSH, 286);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRANSLATE");
methodVisitor.visitIntInsn(SIPUSH, 287);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRANSLATE_REGEX");
methodVisitor.visitIntInsn(SIPUSH, 288);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRANSLATION");
methodVisitor.visitIntInsn(SIPUSH, 289);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TREAT");
methodVisitor.visitIntInsn(SIPUSH, 290);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRIGGER");
methodVisitor.visitIntInsn(SIPUSH, 291);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRIM");
methodVisitor.visitIntInsn(SIPUSH, 292);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRIM_ARRAY");
methodVisitor.visitIntInsn(SIPUSH, 293);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRUE");
methodVisitor.visitIntInsn(SIPUSH, 294);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRUNCATE");
methodVisitor.visitIntInsn(SIPUSH, 295);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("UESCAPE");
methodVisitor.visitIntInsn(SIPUSH, 296);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("UNDO");
methodVisitor.visitIntInsn(SIPUSH, 297);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("UNION");
methodVisitor.visitIntInsn(SIPUSH, 298);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("UNIQUE");
methodVisitor.visitIntInsn(SIPUSH, 299);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("UNKNOWN");
methodVisitor.visitIntInsn(SIPUSH, 300);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("UNNEST");
methodVisitor.visitIntInsn(SIPUSH, 301);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("UNTIL");
methodVisitor.visitIntInsn(SIPUSH, 302);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("UPDATE");
methodVisitor.visitIntInsn(SIPUSH, 303);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("UPPER");
methodVisitor.visitIntInsn(SIPUSH, 304);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("USER");
methodVisitor.visitIntInsn(SIPUSH, 305);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("USING");
methodVisitor.visitIntInsn(SIPUSH, 306);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("VALUE");
methodVisitor.visitIntInsn(SIPUSH, 307);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("VALUES");
methodVisitor.visitIntInsn(SIPUSH, 308);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("VAR_POP");
methodVisitor.visitIntInsn(SIPUSH, 309);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("VAR_SAMP");
methodVisitor.visitIntInsn(SIPUSH, 310);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("VARBINARY");
methodVisitor.visitIntInsn(SIPUSH, 311);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("VARCHAR");
methodVisitor.visitIntInsn(SIPUSH, 312);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("VARYING");
methodVisitor.visitIntInsn(SIPUSH, 313);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("WHEN");
methodVisitor.visitIntInsn(SIPUSH, 314);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("WHENEVER");
methodVisitor.visitIntInsn(SIPUSH, 315);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("WHERE");
methodVisitor.visitIntInsn(SIPUSH, 316);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("WIDTH_BUCKET");
methodVisitor.visitIntInsn(SIPUSH, 317);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("WINDOW");
methodVisitor.visitIntInsn(SIPUSH, 318);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("WITH");
methodVisitor.visitIntInsn(SIPUSH, 319);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("WITHIN");
methodVisitor.visitIntInsn(SIPUSH, 320);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("WITHOUT");
methodVisitor.visitIntInsn(SIPUSH, 321);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("WHILE");
methodVisitor.visitIntInsn(SIPUSH, 322);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "reservedKeys", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("YEAR");
methodVisitor.visitIntInsn(SIPUSH, 323);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/IntValueHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 299);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/IntValueHashMap", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ACTION");
methodVisitor.visitIntInsn(SIPUSH, 332);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ADD");
methodVisitor.visitIntInsn(SIPUSH, 334);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ADMIN");
methodVisitor.visitIntInsn(SIPUSH, 335);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("AFTER");
methodVisitor.visitIntInsn(SIPUSH, 336);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ALIAS");
methodVisitor.visitIntInsn(SIPUSH, 558);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ALWAYS");
methodVisitor.visitIntInsn(SIPUSH, 337);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ASC");
methodVisitor.visitIntInsn(SIPUSH, 338);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("AUTHENTICATION");
methodVisitor.visitIntInsn(SIPUSH, 561);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("AUTOCOMMIT");
methodVisitor.visitIntInsn(SIPUSH, 560);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BACKUP");
methodVisitor.visitIntInsn(SIPUSH, 562);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BEFORE");
methodVisitor.visitIntInsn(SIPUSH, 343);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BINARY_DOUBLE");
methodVisitor.visitIntInsn(SIPUSH, 564);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BINARY_FLOAT");
methodVisitor.visitIntInsn(SIPUSH, 563);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BIT");
methodVisitor.visitIntInsn(SIPUSH, 565);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BYTE");
methodVisitor.visitIntInsn(SIPUSH, 568);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BLOCKING");
methodVisitor.visitIntInsn(SIPUSH, 566);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BODY");
methodVisitor.visitIntInsn(SIPUSH, 567);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CACHE");
methodVisitor.visitIntInsn(SIPUSH, 569);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CACHED");
methodVisitor.visitIntInsn(SIPUSH, 570);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CASCADE");
methodVisitor.visitIntInsn(SIPUSH, 347);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CATALOG");
methodVisitor.visitIntInsn(SIPUSH, 348);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CHARACTERISTICS");
methodVisitor.visitIntInsn(SIPUSH, 354);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CHARACTERS");
methodVisitor.visitIntInsn(SIPUSH, 355);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CHECKPOINT");
methodVisitor.visitIntInsn(SIPUSH, 572);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CITEXT");
methodVisitor.visitIntInsn(SIPUSH, 573);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CRYPT_KEY");
methodVisitor.visitIntInsn(SIPUSH, 660);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CLASS");
methodVisitor.visitIntInsn(SIPUSH, 574);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CLUSTERED");
methodVisitor.visitIntInsn(SIPUSH, 575);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COLLATE");
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COLLATION");
methodVisitor.visitIntInsn(SIPUSH, 358);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COMMENT");
methodVisitor.visitIntInsn(SIPUSH, 576);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COMMITTED");
methodVisitor.visitIntInsn(SIPUSH, 365);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COMPACT");
methodVisitor.visitIntInsn(SIPUSH, 577);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COMPRESSED");
methodVisitor.visitIntInsn(SIPUSH, 578);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CONDIITON_IDENTIFIER");
methodVisitor.visitIntInsn(SIPUSH, 366);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CONFLICT");
methodVisitor.visitIntInsn(SIPUSH, 579);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CONSTRAINTS");
methodVisitor.visitIntInsn(SIPUSH, 373);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CONTAINS");
methodVisitor.visitIntInsn(SIPUSH, 375);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CONTINUE");
methodVisitor.visitIntInsn(SIPUSH, 376);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CONTROL");
methodVisitor.visitIntInsn(SIPUSH, 580);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CURDATE");
methodVisitor.visitIntInsn(SIPUSH, 661);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CURRVAL");
methodVisitor.visitIntInsn(SIPUSH, 581);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CURTIME");
methodVisitor.visitIntInsn(SIPUSH, 662);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DATA");
methodVisitor.visitIntInsn(SIPUSH, 378);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DATABASE");
methodVisitor.visitIntInsn(SIPUSH, 582);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DEADLOCK");
methodVisitor.visitIntInsn(SIPUSH, 583);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DEFAULTS");
methodVisitor.visitIntInsn(SIPUSH, 381);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DEFRAG");
methodVisitor.visitIntInsn(SIPUSH, 584);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DELAY");
methodVisitor.visitIntInsn(SIPUSH, 585);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DESC");
methodVisitor.visitIntInsn(SIPUSH, 389);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DIAGNOSTICS");
methodVisitor.visitIntInsn(SIPUSH, 391);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DIGEST");
methodVisitor.visitIntInsn(SIPUSH, 586);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DOMAIN");
methodVisitor.visitIntInsn(SIPUSH, 393);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("EVENT");
methodVisitor.visitIntInsn(SIPUSH, 587);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("EXCLUDING");
methodVisitor.visitIntInsn(SIPUSH, 399);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("EXPLAIN");
methodVisitor.visitIntInsn(SIPUSH, 588);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FILE");
methodVisitor.visitIntInsn(SIPUSH, 589);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FILES");
methodVisitor.visitIntInsn(SIPUSH, 590);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FINAL");
methodVisitor.visitIntInsn(SIPUSH, 400);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FIRST");
methodVisitor.visitIntInsn(SIPUSH, 401);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FORMAT");
methodVisitor.visitIntInsn(SIPUSH, 591);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FOUND");
methodVisitor.visitIntInsn(SIPUSH, 404);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("G");
methodVisitor.visitIntInsn(SIPUSH, 405);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("GC");
methodVisitor.visitIntInsn(SIPUSH, 592);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("GENERATED");
methodVisitor.visitIntInsn(SIPUSH, 407);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("GRANTED");
methodVisitor.visitIntInsn(SIPUSH, 410);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("GROUP_CONCAT");
methodVisitor.visitIntInsn(SIPUSH, 688);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("HEADER");
methodVisitor.visitIntInsn(SIPUSH, 593);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("IF");
methodVisitor.visitIntInsn(SIPUSH, 412);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("IGNORECASE");
methodVisitor.visitIntInsn(SIPUSH, 594);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("IMMEDIATELY");
methodVisitor.visitIntInsn(SIPUSH, 595);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INCLUDING");
methodVisitor.visitIntInsn(SIPUSH, 416);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INCREMENT");
methodVisitor.visitIntInsn(SIPUSH, 417);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INDEX");
methodVisitor.visitIntInsn(SIPUSH, 597);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INDEXER");
methodVisitor.visitIntInsn(SIPUSH, 637);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INITIAL");
methodVisitor.visitIntInsn(SIPUSH, 598);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INPUT");
methodVisitor.visitIntInsn(SIPUSH, 419);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INSTEAD");
methodVisitor.visitIntInsn(SIPUSH, 422);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INTEGRITY");
methodVisitor.visitIntInsn(SIPUSH, 596);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("IS_AUTOCOMMIT");
methodVisitor.visitIntInsn(SIPUSH, 691);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ISOLATION");
methodVisitor.visitIntInsn(SIPUSH, 424);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("IS_READONLY_DATABASE");
methodVisitor.visitIntInsn(SIPUSH, 692);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("IS_READONLY_DATABASE_FILES");
methodVisitor.visitIntInsn(SIPUSH, 693);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("IS_READONLY_SESSION");
methodVisitor.visitIntInsn(SIPUSH, 694);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("JAVA");
methodVisitor.visitIntInsn(SIPUSH, 425);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("K");
methodVisitor.visitIntInsn(SIPUSH, 426);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("KEY");
methodVisitor.visitIntInsn(SIPUSH, 427);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LAST");
methodVisitor.visitIntInsn(SIPUSH, 430);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LASTVAL");
methodVisitor.visitIntInsn(SIPUSH, 599);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LENGTH");
methodVisitor.visitIntInsn(SIPUSH, 431);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LEVEL");
methodVisitor.visitIntInsn(SIPUSH, 432);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LIBRARY");
methodVisitor.visitIntInsn(SIPUSH, 433);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LIMIT");
methodVisitor.visitIntInsn(SIPUSH, 600);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LOB");
methodVisitor.visitIntInsn(SIPUSH, 702);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LOCK");
methodVisitor.visitIntInsn(SIPUSH, 601);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LOCKS");
methodVisitor.visitIntInsn(SIPUSH, 602);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LONG");
methodVisitor.visitIntInsn(SIPUSH, 603);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LONGBLOB");
methodVisitor.visitIntInsn(SIPUSH, 792);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LONGTEXT");
methodVisitor.visitIntInsn(SIPUSH, 793);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LONGVAR");
methodVisitor.visitIntInsn(SIPUSH, 604);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("M");
methodVisitor.visitIntInsn(SIPUSH, 435);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MATCHED");
methodVisitor.visitIntInsn(SIPUSH, 437);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MAXROWS");
methodVisitor.visitIntInsn(SIPUSH, 605);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MAXVALUE");
methodVisitor.visitIntInsn(SIPUSH, 438);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MEDIAN");
methodVisitor.visitIntInsn(SIPUSH, 606);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MEDIUMBLOB");
methodVisitor.visitIntInsn(SIPUSH, 794);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MEDIUMTEXT");
methodVisitor.visitIntInsn(SIPUSH, 795);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MEMORY");
methodVisitor.visitIntInsn(SIPUSH, 607);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MESSAGE_TEXT");
methodVisitor.visitIntInsn(SIPUSH, 441);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MILLIS");
methodVisitor.visitIntInsn(SIPUSH, 608);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MINUS");
methodVisitor.visitIntInsn(SIPUSH, 609);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MINVALUE");
methodVisitor.visitIntInsn(SIPUSH, 442);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MORE");
methodVisitor.visitIntInsn(SIPUSH, 443);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MVCC");
methodVisitor.visitIntInsn(SIPUSH, 711);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MVLOCKS");
methodVisitor.visitIntInsn(SIPUSH, 712);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NAME");
methodVisitor.visitIntInsn(SIPUSH, 445);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NEXT");
methodVisitor.visitIntInsn(SIPUSH, 448);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NEXTVAL");
methodVisitor.visitIntInsn(SIPUSH, 611);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NAN");
methodVisitor.visitIntInsn(SIPUSH, 610);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NIO");
methodVisitor.visitIntInsn(SIPUSH, 715);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NOW");
methodVisitor.visitIntInsn(SIPUSH, 716);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NULLS");
methodVisitor.visitIntInsn(SIPUSH, 451);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NUMBER");
methodVisitor.visitIntInsn(SIPUSH, 452);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NVARCHAR2");
methodVisitor.visitIntInsn(SIPUSH, 612);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NVL2");
methodVisitor.visitIntInsn(SIPUSH, 613);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OBJECT");
methodVisitor.visitIntInsn(SIPUSH, 453);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OCTETS");
methodVisitor.visitIntInsn(SIPUSH, 454);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OFF");
methodVisitor.visitIntInsn(SIPUSH, 614);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OPTION");
methodVisitor.visitIntInsn(SIPUSH, 455);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ORDINALITY");
methodVisitor.visitIntInsn(SIPUSH, 458);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OVERRIDING");
methodVisitor.visitIntInsn(SIPUSH, 461);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("P");
methodVisitor.visitIntInsn(SIPUSH, 462);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PAD");
methodVisitor.visitIntInsn(SIPUSH, 463);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PARTIAL");
methodVisitor.visitIntInsn(SIPUSH, 470);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PASSWORD");
methodVisitor.visitIntInsn(SIPUSH, 615);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PLACING");
methodVisitor.visitIntInsn(SIPUSH, 473);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PLAN");
methodVisitor.visitIntInsn(SIPUSH, 616);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PRESERVE");
methodVisitor.visitIntInsn(SIPUSH, 476);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PREVVAL");
methodVisitor.visitIntInsn(SIPUSH, 617);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PRIVILEGES");
methodVisitor.visitIntInsn(SIPUSH, 478);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PROPERTY");
methodVisitor.visitIntInsn(SIPUSH, 618);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RAW");
methodVisitor.visitIntInsn(SIPUSH, 619);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("READ");
methodVisitor.visitIntInsn(SIPUSH, 480);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("READONLY");
methodVisitor.visitIntInsn(SIPUSH, 620);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REFERENTIAL");
methodVisitor.visitIntInsn(SIPUSH, 621);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REGULAR");
methodVisitor.visitIntInsn(SIPUSH, 622);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RENAME");
methodVisitor.visitIntInsn(SIPUSH, 623);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REPEATABLE");
methodVisitor.visitIntInsn(SIPUSH, 482);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RESET");
methodVisitor.visitIntInsn(SIPUSH, 624);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RESTART");
methodVisitor.visitIntInsn(SIPUSH, 484);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RESTRICT");
methodVisitor.visitIntInsn(SIPUSH, 485);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RESULT");
methodVisitor.visitIntInsn(SIPUSH, 236);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ROLE");
methodVisitor.visitIntInsn(SIPUSH, 490);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ROUTINE");
methodVisitor.visitIntInsn(SIPUSH, 491);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ROW_COUNT");
methodVisitor.visitIntInsn(SIPUSH, 495);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ROWNUM");
methodVisitor.visitIntInsn(SIPUSH, 625);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SCALE");
methodVisitor.visitIntInsn(SIPUSH, 496);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SCHEMA");
methodVisitor.visitIntInsn(SIPUSH, 497);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SCRIPT");
methodVisitor.visitIntInsn(SIPUSH, 626);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SEQUENCE");
methodVisitor.visitIntInsn(SIPUSH, 505);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SEPARATOR");
methodVisitor.visitIntInsn(SIPUSH, 627);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SERIALIZABLE");
methodVisitor.visitIntInsn(SIPUSH, 506);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SERVER");
methodVisitor.visitIntInsn(SIPUSH, 509);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SESSION");
methodVisitor.visitIntInsn(SIPUSH, 508);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SETS");
methodVisitor.visitIntInsn(SIPUSH, 510);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SHUTDOWN");
methodVisitor.visitIntInsn(SIPUSH, 628);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SIMPLE");
methodVisitor.visitIntInsn(SIPUSH, 511);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SIZE");
methodVisitor.visitIntInsn(SIPUSH, 512);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SOURCE");
methodVisitor.visitIntInsn(SIPUSH, 513);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_BIGINT");
methodVisitor.visitIntInsn(SIPUSH, 822);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_BINARY");
methodVisitor.visitIntInsn(SIPUSH, 823);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_BIT");
methodVisitor.visitIntInsn(SIPUSH, 824);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_BLOB");
methodVisitor.visitIntInsn(SIPUSH, 825);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_BOOLEAN");
methodVisitor.visitIntInsn(SIPUSH, 826);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_CHAR");
methodVisitor.visitIntInsn(SIPUSH, 827);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_CLOB");
methodVisitor.visitIntInsn(SIPUSH, 828);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_DATALINK");
methodVisitor.visitIntInsn(SIPUSH, 832);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_DATE");
methodVisitor.visitIntInsn(SIPUSH, 829);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_DECIMAL");
methodVisitor.visitIntInsn(SIPUSH, 831);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_DOUBLE");
methodVisitor.visitIntInsn(SIPUSH, 833);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_FLOAT");
methodVisitor.visitIntInsn(SIPUSH, 834);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_INTEGER");
methodVisitor.visitIntInsn(SIPUSH, 835);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_LONGNVARCHAR");
methodVisitor.visitIntInsn(SIPUSH, 837);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_LONGVARBINARY");
methodVisitor.visitIntInsn(SIPUSH, 836);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_LONGVARCHAR");
methodVisitor.visitIntInsn(SIPUSH, 838);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_NCHAR");
methodVisitor.visitIntInsn(SIPUSH, 839);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_NCLOB");
methodVisitor.visitIntInsn(SIPUSH, 840);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_NUMERIC");
methodVisitor.visitIntInsn(SIPUSH, 841);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_NVARCHAR");
methodVisitor.visitIntInsn(SIPUSH, 842);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_REAL");
methodVisitor.visitIntInsn(SIPUSH, 843);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_ROWID");
methodVisitor.visitIntInsn(SIPUSH, 844);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_SMALLINT");
methodVisitor.visitIntInsn(SIPUSH, 846);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_SQLXML");
methodVisitor.visitIntInsn(SIPUSH, 845);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_TIME");
methodVisitor.visitIntInsn(SIPUSH, 847);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_TIMESTAMP");
methodVisitor.visitIntInsn(SIPUSH, 848);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_TINYINT");
methodVisitor.visitIntInsn(SIPUSH, 849);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_VARBINARY");
methodVisitor.visitIntInsn(SIPUSH, 850);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_VARCHAR");
methodVisitor.visitIntInsn(SIPUSH, 851);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_TSI_DAY");
methodVisitor.visitIntInsn(SIPUSH, 857);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_TSI_FRAC_SECOND");
methodVisitor.visitIntInsn(SIPUSH, 852);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_TSI_MILLI_SECOND");
methodVisitor.visitIntInsn(SIPUSH, 853);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_TSI_HOUR");
methodVisitor.visitIntInsn(SIPUSH, 856);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_TSI_MINUTE");
methodVisitor.visitIntInsn(SIPUSH, 855);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_TSI_MONTH");
methodVisitor.visitIntInsn(SIPUSH, 859);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_TSI_QUARTER");
methodVisitor.visitIntInsn(SIPUSH, 860);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_TSI_SECOND");
methodVisitor.visitIntInsn(SIPUSH, 854);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_TSI_WEEK");
methodVisitor.visitIntInsn(SIPUSH, 858);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SQL_TSI_YEAR");
methodVisitor.visitIntInsn(SIPUSH, 861);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("STATEMENT");
methodVisitor.visitIntInsn(SIPUSH, 517);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("STYLE");
methodVisitor.visitIntInsn(SIPUSH, 519);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SYNTAX");
methodVisitor.visitIntInsn(SIPUSH, 629);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("T");
methodVisitor.visitIntInsn(SIPUSH, 521);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TDC");
methodVisitor.visitIntInsn(SIPUSH, 630);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TEMP");
methodVisitor.visitIntInsn(SIPUSH, 631);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TEMPORARY");
methodVisitor.visitIntInsn(SIPUSH, 523);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TEXT");
methodVisitor.visitIntInsn(SIPUSH, 632);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TYPES");
methodVisitor.visitIntInsn(SIPUSH, 634);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TIMESTAMP_WITH_ZONE");
methodVisitor.visitIntInsn(SIPUSH, 761);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TIMESTAMPADD");
methodVisitor.visitIntInsn(SIPUSH, 762);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TIMESTAMPDIFF");
methodVisitor.visitIntInsn(SIPUSH, 763);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TINYBLOB");
methodVisitor.visitIntInsn(SIPUSH, 796);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TINYTEXT");
methodVisitor.visitIntInsn(SIPUSH, 797);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TOP");
methodVisitor.visitIntInsn(SIPUSH, 773);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRANSACTION");
methodVisitor.visitIntInsn(SIPUSH, 526);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRANSACTION_ACTIVE");
methodVisitor.visitIntInsn(SIPUSH, 527);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRANSACTIONS_COMMITTED");
methodVisitor.visitIntInsn(SIPUSH, 528);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRANSACTIONS_ROLLED_BACK");
methodVisitor.visitIntInsn(SIPUSH, 529);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TTI");
methodVisitor.visitIntInsn(SIPUSH, 633);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TYPE");
methodVisitor.visitIntInsn(SIPUSH, 535);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("UNCOMMITTED");
methodVisitor.visitIntInsn(SIPUSH, 537);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("USAGE");
methodVisitor.visitIntInsn(SIPUSH, 540);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("VIEW");
methodVisitor.visitIntInsn(SIPUSH, 545);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("VARCHAR2");
methodVisitor.visitIntInsn(SIPUSH, 635);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("WORK");
methodVisitor.visitIntInsn(SIPUSH, 546);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("WRAPPER");
methodVisitor.visitIntInsn(SIPUSH, 548);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("WRITE");
methodVisitor.visitIntInsn(SIPUSH, 547);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("WRITE_DELAY");
methodVisitor.visitIntInsn(SIPUSH, 636);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ZONE");
methodVisitor.visitIntInsn(SIPUSH, 549);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ACOS");
methodVisitor.visitIntInsn(SIPUSH, 640);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ACTION_ID");
methodVisitor.visitIntInsn(SIPUSH, 641);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ADD_MONTHS");
methodVisitor.visitIntInsn(SIPUSH, 644);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ARRAY_SORT");
methodVisitor.visitIntInsn(SIPUSH, 642);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ASCII");
methodVisitor.visitIntInsn(SIPUSH, 643);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ASIN");
methodVisitor.visitIntInsn(SIPUSH, 645);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ATAN");
methodVisitor.visitIntInsn(SIPUSH, 646);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ATAN2");
methodVisitor.visitIntInsn(SIPUSH, 647);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BITAND");
methodVisitor.visitIntInsn(SIPUSH, 649);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BITANDNOT");
methodVisitor.visitIntInsn(SIPUSH, 650);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BITLENGTH");
methodVisitor.visitIntInsn(SIPUSH, 651);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BITNOT");
methodVisitor.visitIntInsn(SIPUSH, 652);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BITOR");
methodVisitor.visitIntInsn(SIPUSH, 653);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BITXOR");
methodVisitor.visitIntInsn(SIPUSH, 654);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CASEWHEN");
methodVisitor.visitIntInsn(SIPUSH, 571);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CONCAT");
methodVisitor.visitIntInsn(SIPUSH, 656);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CONCAT_WS");
methodVisitor.visitIntInsn(SIPUSH, 657);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CHR");
methodVisitor.visitIntInsn(SIPUSH, 655);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COS");
methodVisitor.visitIntInsn(SIPUSH, 658);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("COT");
methodVisitor.visitIntInsn(SIPUSH, 659);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DATABASE_NAME");
methodVisitor.visitIntInsn(SIPUSH, 664);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DATE_ADD");
methodVisitor.visitIntInsn(SIPUSH, 667);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DATE_SUB");
methodVisitor.visitIntInsn(SIPUSH, 668);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DATEADD");
methodVisitor.visitIntInsn(SIPUSH, 669);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DATEDIFF");
methodVisitor.visitIntInsn(SIPUSH, 670);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DAY_NAME");
methodVisitor.visitIntInsn(SIPUSH, 671);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DAY_OF_MONTH");
methodVisitor.visitIntInsn(SIPUSH, 672);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DAY_OF_WEEK");
methodVisitor.visitIntInsn(SIPUSH, 673);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DAY_OF_YEAR");
methodVisitor.visitIntInsn(SIPUSH, 674);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DAYNAME");
methodVisitor.visitIntInsn(SIPUSH, 675);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DAYOFMONTH");
methodVisitor.visitIntInsn(SIPUSH, 676);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DAYOFWEEK");
methodVisitor.visitIntInsn(SIPUSH, 677);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DAYOFYEAR");
methodVisitor.visitIntInsn(SIPUSH, 678);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DAYS");
methodVisitor.visitIntInsn(SIPUSH, 679);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DBTIMEZONE");
methodVisitor.visitIntInsn(SIPUSH, 680);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DECODE");
methodVisitor.visitIntInsn(SIPUSH, 681);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DEGREES");
methodVisitor.visitIntInsn(SIPUSH, 682);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DIFFERENCE");
methodVisitor.visitIntInsn(SIPUSH, 683);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DMOD");
methodVisitor.visitIntInsn(SIPUSH, 684);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FROM_TZ");
methodVisitor.visitIntInsn(SIPUSH, 685);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("GREATEST");
methodVisitor.visitIntInsn(SIPUSH, 687);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("HEXTORAW");
methodVisitor.visitIntInsn(SIPUSH, 686);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INSTR");
methodVisitor.visitIntInsn(SIPUSH, 690);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("IFNULL");
methodVisitor.visitIntInsn(SIPUSH, 689);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ISNULL");
methodVisitor.visitIntInsn(SIPUSH, 696);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LAST_DAY");
methodVisitor.visitIntInsn(SIPUSH, 697);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LCASE");
methodVisitor.visitIntInsn(SIPUSH, 698);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LEAST");
methodVisitor.visitIntInsn(SIPUSH, 699);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LOAD_FILE");
methodVisitor.visitIntInsn(SIPUSH, 700);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LOCATE");
methodVisitor.visitIntInsn(SIPUSH, 701);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LOG");
methodVisitor.visitIntInsn(SIPUSH, 703);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LOG10");
methodVisitor.visitIntInsn(SIPUSH, 704);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LPAD");
methodVisitor.visitIntInsn(SIPUSH, 705);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LTRIM");
methodVisitor.visitIntInsn(SIPUSH, 706);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MONTH_NAME");
methodVisitor.visitIntInsn(SIPUSH, 708);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MONTHNAME");
methodVisitor.visitIntInsn(SIPUSH, 709);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("MONTHS_BETWEEN");
methodVisitor.visitIntInsn(SIPUSH, 710);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NAMES");
methodVisitor.visitIntInsn(SIPUSH, 446);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NEW_TIME");
methodVisitor.visitIntInsn(SIPUSH, 713);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NEXT_DAY");
methodVisitor.visitIntInsn(SIPUSH, 714);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NUMTODSINTERVAL");
methodVisitor.visitIntInsn(SIPUSH, 717);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NUMTOYMINTERVAL");
methodVisitor.visitIntInsn(SIPUSH, 718);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NVL");
methodVisitor.visitIntInsn(SIPUSH, 689);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OCTETLENGTH");
methodVisitor.visitIntInsn(SIPUSH, 719);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("PI");
methodVisitor.visitIntInsn(SIPUSH, 720);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("POSITION_ARRAY");
methodVisitor.visitIntInsn(SIPUSH, 721);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("QUARTER");
methodVisitor.visitIntInsn(SIPUSH, 722);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RADIANS");
methodVisitor.visitIntInsn(SIPUSH, 723);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RAND");
methodVisitor.visitIntInsn(SIPUSH, 724);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RAWTOHEX");
methodVisitor.visitIntInsn(SIPUSH, 725);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REGEXP_MATCHES");
methodVisitor.visitIntInsn(SIPUSH, 726);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REGEXP_SUBSTRING");
methodVisitor.visitIntInsn(SIPUSH, 727);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REGEXP_SUBSTRING_ARRAY");
methodVisitor.visitIntInsn(SIPUSH, 728);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REPLACE");
methodVisitor.visitIntInsn(SIPUSH, 729);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REVERSE");
methodVisitor.visitIntInsn(SIPUSH, 730);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ROUND");
methodVisitor.visitIntInsn(SIPUSH, 731);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ROUNDMAGIC");
methodVisitor.visitIntInsn(SIPUSH, 732);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RPAD");
methodVisitor.visitIntInsn(SIPUSH, 734);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("RTRIM");
methodVisitor.visitIntInsn(SIPUSH, 733);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SECONDS_SINCE_MIDNIGHT");
methodVisitor.visitIntInsn(SIPUSH, 735);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SESSION_ID");
methodVisitor.visitIntInsn(SIPUSH, 737);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SESSIONTIMEZONE");
methodVisitor.visitIntInsn(SIPUSH, 740);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SIGN");
methodVisitor.visitIntInsn(SIPUSH, 741);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SIN");
methodVisitor.visitIntInsn(SIPUSH, 742);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SORT_ARRAY");
methodVisitor.visitIntInsn(SIPUSH, 743);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SOUNDEX");
methodVisitor.visitIntInsn(SIPUSH, 744);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SPACE");
methodVisitor.visitIntInsn(SIPUSH, 514);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SUBSTR");
methodVisitor.visitIntInsn(SIPUSH, 756);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SYS_EXTRACT_UTC");
methodVisitor.visitIntInsn(SIPUSH, 757);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SYSDATE");
methodVisitor.visitIntInsn(SIPUSH, 758);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SYSTIMESTAMP");
methodVisitor.visitIntInsn(SIPUSH, 759);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TAN");
methodVisitor.visitIntInsn(SIPUSH, 760);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TO_CHAR");
methodVisitor.visitIntInsn(SIPUSH, 765);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TO_DATE");
methodVisitor.visitIntInsn(SIPUSH, 766);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TO_DSINTERVAL");
methodVisitor.visitIntInsn(SIPUSH, 767);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TO_YMINTERVAL");
methodVisitor.visitIntInsn(SIPUSH, 768);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TO_NUMBER");
methodVisitor.visitIntInsn(SIPUSH, 769);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TO_TIMESTAMP");
methodVisitor.visitIntInsn(SIPUSH, 770);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TO_TIMESTAMP_TZ");
methodVisitor.visitIntInsn(SIPUSH, 771);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TODAY");
methodVisitor.visitIntInsn(SIPUSH, 772);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRUNC");
methodVisitor.visitIntInsn(SIPUSH, 777);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("UCASE");
methodVisitor.visitIntInsn(SIPUSH, 779);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRANSACTION_ID");
methodVisitor.visitIntInsn(SIPUSH, 775);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRANSACTION_SIZE");
methodVisitor.visitIntInsn(SIPUSH, 776);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TZ_OFFSET");
methodVisitor.visitIntInsn(SIPUSH, 778);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("UUID");
methodVisitor.visitIntInsn(SIPUSH, 782);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("UNIX_MILLIS");
methodVisitor.visitIntInsn(SIPUSH, 780);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("UNIX_TIMESTAMP");
methodVisitor.visitIntInsn(SIPUSH, 781);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("WEEK");
methodVisitor.visitIntInsn(SIPUSH, 790);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("WEEK_OF_YEAR");
methodVisitor.visitIntInsn(SIPUSH, 791);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("ISOLATION_LEVEL");
methodVisitor.visitIntInsn(SIPUSH, 695);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SESSION_ISOLATION_LEVEL");
methodVisitor.visitIntInsn(SIPUSH, 738);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DATABASE_ISOLATION_LEVEL");
methodVisitor.visitIntInsn(SIPUSH, 663);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TRANSACTION_CONTROL");
methodVisitor.visitIntInsn(SIPUSH, 774);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TIMEZONE");
methodVisitor.visitIntInsn(SIPUSH, 764);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SESSION_TIMEZONE");
methodVisitor.visitIntInsn(SIPUSH, 739);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DATABASE_TIMEZONE");
methodVisitor.visitIntInsn(SIPUSH, 665);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DATABASE_VERSION");
methodVisitor.visitIntInsn(SIPUSH, 666);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LOB_ID");
methodVisitor.visitIntInsn(SIPUSH, 707);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SEQUENCE_ARRAY");
methodVisitor.visitIntInsn(SIPUSH, 736);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("*");
methodVisitor.visitIntInsn(SIPUSH, 801);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn(")");
methodVisitor.visitIntInsn(SIPUSH, 802);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn(":");
methodVisitor.visitIntInsn(SIPUSH, 803);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn(",");
methodVisitor.visitIntInsn(SIPUSH, 804);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("||");
methodVisitor.visitIntInsn(SIPUSH, 805);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("/");
methodVisitor.visitIntInsn(SIPUSH, 806);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("=");
methodVisitor.visitIntInsn(SIPUSH, 396);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn(">");
methodVisitor.visitIntInsn(SIPUSH, 809);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn(">=");
methodVisitor.visitIntInsn(SIPUSH, 810);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("[");
methodVisitor.visitIntInsn(SIPUSH, 811);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("<");
methodVisitor.visitIntInsn(SIPUSH, 812);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("<=");
methodVisitor.visitIntInsn(SIPUSH, 813);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("-");
methodVisitor.visitIntInsn(SIPUSH, 814);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("<>");
methodVisitor.visitIntInsn(SIPUSH, 815);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("!=");
methodVisitor.visitIntInsn(SIPUSH, 815);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("(");
methodVisitor.visitIntInsn(SIPUSH, 816);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("+");
methodVisitor.visitIntInsn(SIPUSH, 817);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("?");
methodVisitor.visitIntInsn(SIPUSH, 818);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("]");
methodVisitor.visitIntInsn(SIPUSH, 820);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "commandSet", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn(";");
methodVisitor.visitIntInsn(SIPUSH, 821);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/OrderedIntHashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/OrderedIntHashSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/Tokens", "coreReservedWords", "Lorg/hsqldb/lib/OrderedIntHashSet;");
methodVisitor.visitIntInsn(BIPUSH, 73);
methodVisitor.visitIntInsn(NEWARRAY, T_SHORT);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitIntInsn(BIPUSH, 78);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitIntInsn(BIPUSH, 85);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitIntInsn(BIPUSH, 86);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitIntInsn(BIPUSH, 88);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitIntInsn(BIPUSH, 92);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitIntInsn(BIPUSH, 97);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitIntInsn(BIPUSH, 101);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitIntInsn(BIPUSH, 98);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitIntInsn(BIPUSH, 112);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitIntInsn(BIPUSH, 116);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitIntInsn(BIPUSH, 121);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitIntInsn(BIPUSH, 122);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitIntInsn(BIPUSH, 125);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitIntInsn(SIPUSH, 141);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitIntInsn(SIPUSH, 142);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitIntInsn(SIPUSH, 130);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitIntInsn(SIPUSH, 138);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitIntInsn(SIPUSH, 144);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitIntInsn(SIPUSH, 132);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitIntInsn(SIPUSH, 153);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitIntInsn(SIPUSH, 151);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitIntInsn(SIPUSH, 154);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitIntInsn(SIPUSH, 163);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitIntInsn(SIPUSH, 168);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitIntInsn(SIPUSH, 176);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitIntInsn(SIPUSH, 187);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitIntInsn(SIPUSH, 183);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitIntInsn(SIPUSH, 194);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitIntInsn(SIPUSH, 198);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitIntInsn(SIPUSH, 197);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitIntInsn(SIPUSH, 200);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitIntInsn(SIPUSH, 214);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitIntInsn(SIPUSH, 222);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitIntInsn(SIPUSH, 240);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitIntInsn(SIPUSH, 251);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitIntInsn(SIPUSH, 254);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitIntInsn(SIPUSH, 258);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitIntInsn(SIPUSH, 269);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitIntInsn(SIPUSH, 270);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitIntInsn(SIPUSH, 274);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitIntInsn(SIPUSH, 278);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitIntInsn(SIPUSH, 280);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitIntInsn(SIPUSH, 285);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitIntInsn(SIPUSH, 286);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitIntInsn(SIPUSH, 291);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitIntInsn(SIPUSH, 298);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 65);
methodVisitor.visitIntInsn(SIPUSH, 299);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 66);
methodVisitor.visitIntInsn(SIPUSH, 306);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 67);
methodVisitor.visitIntInsn(SIPUSH, 308);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 68);
methodVisitor.visitIntInsn(SIPUSH, 309);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 69);
methodVisitor.visitIntInsn(SIPUSH, 310);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 70);
methodVisitor.visitIntInsn(SIPUSH, 314);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 71);
methodVisitor.visitIntInsn(SIPUSH, 316);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 72);
methodVisitor.visitIntInsn(SIPUSH, 319);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[S", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "coreReservedWords", "Lorg/hsqldb/lib/OrderedIntHashSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(SALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/OrderedIntHashSet", "add", "(I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(1, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(NEWARRAY, T_SHORT);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(SIPUSH, 323);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(SIPUSH, 173);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, 73);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 127);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(SIPUSH, 169);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(SIPUSH, 250);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/Tokens", "SQL_INTERVAL_FIELD_CODES", "[S");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("YEAR");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("MONTH");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("DAY");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("HOUR");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("MINUTE");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("SECOND");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/Tokens", "SQL_INTERVAL_FIELD_NAMES", "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/IntKeyHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/IntKeyHashMap", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/Tokens", "sqlTSILookup", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "sqlTSILookup", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 857);
methodVisitor.visitLdcInsn("SQL_TSI_DAY");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "sqlTSILookup", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 852);
methodVisitor.visitLdcInsn("SQL_TSI_FRAC_SECOND");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "sqlTSILookup", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 853);
methodVisitor.visitLdcInsn("SQL_TSI_MILLI_SECOND");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "sqlTSILookup", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 856);
methodVisitor.visitLdcInsn("SQL_TSI_HOUR");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "sqlTSILookup", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 855);
methodVisitor.visitLdcInsn("SQL_TSI_MINUTE");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "sqlTSILookup", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 859);
methodVisitor.visitLdcInsn("SQL_TSI_MONTH");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "sqlTSILookup", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 860);
methodVisitor.visitLdcInsn("SQL_TSI_QUARTER");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "sqlTSILookup", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 854);
methodVisitor.visitLdcInsn("SQL_TSI_SECOND");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "sqlTSILookup", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 858);
methodVisitor.visitLdcInsn("SQL_TSI_WEEK");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/Tokens", "sqlTSILookup", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 861);
methodVisitor.visitLdcInsn("SQL_TSI_YEAR");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
