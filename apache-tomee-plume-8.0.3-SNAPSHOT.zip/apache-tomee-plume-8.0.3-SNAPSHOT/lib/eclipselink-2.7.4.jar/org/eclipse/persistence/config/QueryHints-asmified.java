package asm.org.eclipse.persistence.config;
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
public class QueryHintsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/config/QueryHints", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BIND_PARAMETERS", "Ljava/lang/String;", null, "eclipselink.jdbc.bind-parameters");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARAMETER_DELIMITER", "Ljava/lang/String;", null, "eclipselink.jdbc.parameter-delimiter");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CACHE_RETRIEVE_MODE", "Ljava/lang/String;", null, "javax.persistence.cache.retrieveMode");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CACHE_STORE_MODE", "Ljava/lang/String;", null, "javax.persistence.cache.storeMode");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CACHE_USAGE", "Ljava/lang/String;", null, "eclipselink.cache-usage");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUERY_RESULTS_CACHE", "Ljava/lang/String;", null, "eclipselink.query-results-cache");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUERY_RESULTS_CACHE_SIZE", "Ljava/lang/String;", null, "eclipselink.query-results-cache.size");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUERY_RESULTS_CACHE_EXPIRY", "Ljava/lang/String;", null, "eclipselink.query-results-cache.expiry");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUERY_RESULTS_CACHE_RANDOMIZE_EXPIRY", "Ljava/lang/String;", null, "eclipselink.query-results-cache.randomize-expiry");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUERY_RESULTS_CACHE_IGNORE_NULL", "Ljava/lang/String;", null, "eclipselink.query-results-cache.ignore-null");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUERY_RESULTS_CACHE_INVALIDATE", "Ljava/lang/String;", null, "eclipselink.query-results-cache.invalidate-on-change");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUERY_RESULTS_CACHE_TYPE", "Ljava/lang/String;", null, "eclipselink.query-results-cache.type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUERY_RESULTS_CACHE_EXPIRY_TIME_OF_DAY", "Ljava/lang/String;", null, "eclipselink.query-results-cache.expiry-time-of-day");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUERY_REDIRECTOR", "Ljava/lang/String;", null, "eclipselink.query.redirector");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARTITIONING", "Ljava/lang/String;", null, "eclipselink.partitioning");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUERY_TYPE", "Ljava/lang/String;", null, "eclipselink.query-type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PESSIMISTIC_LOCK", "Ljava/lang/String;", null, "eclipselink.pessimistic-lock");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PESSIMISTIC_LOCK_TIMEOUT", "Ljava/lang/String;", null, "javax.persistence.lock.timeout");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFRESH", "Ljava/lang/String;", null, "eclipselink.refresh");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BATCH", "Ljava/lang/String;", null, "eclipselink.batch");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BATCH_TYPE", "Ljava/lang/String;", null, "eclipselink.batch.type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BATCH_SIZE", "Ljava/lang/String;", null, "eclipselink.batch.size");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FETCH", "Ljava/lang/String;", null, "eclipselink.join-fetch");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LEFT_FETCH", "Ljava/lang/String;", null, "eclipselink.left-join-fetch");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "READ_ONLY", "Ljava/lang/String;", null, "eclipselink.read-only");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JDBC_TIMEOUT", "Ljava/lang/String;", null, "eclipselink.jdbc.timeout");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUERY_TIMEOUT", "Ljava/lang/String;", null, "javax.persistence.query.timeout");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUERY_TIMEOUT_UNIT", "Ljava/lang/String;", null, "eclipselink.query.timeout.unit");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JDBC_FETCH_SIZE", "Ljava/lang/String;", null, "eclipselink.jdbc.fetch-size");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JDBC_MAX_ROWS", "Ljava/lang/String;", null, "eclipselink.jdbc.max-rows");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JDBC_FIRST_RESULT", "Ljava/lang/String;", null, "eclipselink.jdbc.first-result");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESULT_COLLECTION_TYPE", "Ljava/lang/String;", null, "eclipselink.result-collection-type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFRESH_CASCADE", "Ljava/lang/String;", null, "eclipselink.refresh.cascade");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MAINTAIN_CACHE", "Ljava/lang/String;", null, "eclipselink.maintain-cache");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PREPARE", "Ljava/lang/String;", null, "eclipselink.prepare");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CACHE_STATMENT", "Ljava/lang/String;", null, "eclipselink.jdbc.cache-statement");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLUSH", "Ljava/lang/String;", null, "eclipselink.flush");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HINT", "Ljava/lang/String;", null, "eclipselink.sql.hint");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NATIVE_CONNECTION", "Ljava/lang/String;", null, "eclipselink.jdbc.native-connection");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURSOR", "Ljava/lang/String;", null, "eclipselink.cursor");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURSOR_INITIAL_SIZE", "Ljava/lang/String;", null, "eclipselink.cursor.initial-size");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURSOR_PAGE_SIZE", "Ljava/lang/String;", null, "eclipselink.cursor.page-size");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURSOR_SIZE", "Ljava/lang/String;", null, "eclipselink.cursor.size-sql");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCROLLABLE_CURSOR", "Ljava/lang/String;", null, "eclipselink.cursor.scrollable");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESULT_SET_TYPE", "Ljava/lang/String;", null, "eclipselink.cursor.scrollable.result-set-type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESULT_SET_CONCURRENCY", "Ljava/lang/String;", null, "eclipselink.cursor.scrollable.result-set-concurrency");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FETCH_GROUP", "Ljava/lang/String;", null, "eclipselink.fetch-group");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FETCH_GROUP_NAME", "Ljava/lang/String;", null, "eclipselink.fetch-group.name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FETCH_GROUP_ATTRIBUTE", "Ljava/lang/String;", null, "eclipselink.fetch-group.attribute");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FETCH_GROUP_LOAD", "Ljava/lang/String;", null, "eclipselink.fetch-group.load");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_FETCH_GRAPH", "Ljava/lang/String;", null, "javax.persistence.fetchgraph");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FETCH_GROUP_DEFAULT", "Ljava/lang/String;", null, "eclipselink.fetch-group.default");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOAD_GROUP", "Ljava/lang/String;", null, "eclipselink.load-group");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_LOAD_GRAPH", "Ljava/lang/String;", null, "javax.persistence.loadgraph");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOAD_GROUP_ATTRIBUTE", "Ljava/lang/String;", null, "eclipselink.load-group.attribute");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXCLUSIVE_CONNECTION", "Ljava/lang/String;", null, "eclipselink.exclusive-connection");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INHERITANCE_OUTER_JOIN", "Ljava/lang/String;", null, "eclipselink.inheritance.outer-join");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALLOW_NATIVE_SQL_QUERY", "Ljava/lang/String;", null, "eclipselink.jdbc.allow-native-sql-query");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AS_OF", "Ljava/lang/String;", null, "eclipselink.history.as-of");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AS_OF_SCN", "Ljava/lang/String;", null, "eclipselink.history.as-of.scn");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESULT_TYPE", "Ljava/lang/String;", null, "eclipselink.result-type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INDIRECTION_POLICY", "Ljava/lang/String;", null, "eclipselink.cache-usage.indirection-policy");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PESSIMISTIC_LOCK_SCOPE", "Ljava/lang/String;", null, "javax.persistence.lock.scope");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPOSITE_UNIT_MEMBER", "Ljava/lang/String;", null, "eclipselink.composite-unit.member");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BATCH_WRITING", "Ljava/lang/String;", null, "eclipselink.jdbc.batch-writing");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESULT_SET_ACCESS", "Ljava/lang/String;", null, "eclipselink.result-set-access");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERIALIZED_OBJECT", "Ljava/lang/String;", null, "eclipselink.serialized-object");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURN_NAME_VALUE_PAIRS", "Ljava/lang/String;", null, "eclipselink.query-return-name-value-pairs");
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
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
