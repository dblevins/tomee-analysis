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
public class PersistenceUnitPropertiesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/config/PersistenceUnitProperties", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/config/PersistenceUnitProperties$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSACTION_TYPE", "Ljava/lang/String;", null, "javax.persistence.transactionType");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JTA_DATASOURCE", "Ljava/lang/String;", null, "javax.persistence.jtaDataSource");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NON_JTA_DATASOURCE", "Ljava/lang/String;", null, "javax.persistence.nonJtaDataSource");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JDBC_DRIVER", "Ljava/lang/String;", null, "javax.persistence.jdbc.driver");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JDBC_URL", "Ljava/lang/String;", null, "javax.persistence.jdbc.url");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JDBC_USER", "Ljava/lang/String;", null, "javax.persistence.jdbc.user");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JDBC_PASSWORD", "Ljava/lang/String;", null, "javax.persistence.jdbc.password");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NATIVE_SQL", "Ljava/lang/String;", null, "eclipselink.jdbc.native-sql");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_CAST", "Ljava/lang/String;", null, "eclipselink.jdbc.sql-cast");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPQL_PARSER", "Ljava/lang/String;", null, "eclipselink.jpql.parser");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPQL_VALIDATION", "Ljava/lang/String;", null, "eclipselink.jpql.validation");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION_POOL_WAIT", "Ljava/lang/String;", null, "wait");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION_POOL_MAX", "Ljava/lang/String;", null, "max");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION_POOL_MIN", "Ljava/lang/String;", null, "min");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION_POOL_INITIAL", "Ljava/lang/String;", null, "initial");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION_POOL_SHARED", "Ljava/lang/String;", null, "shared");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION_POOL_URL", "Ljava/lang/String;", null, "url");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION_POOL_JTA_DATA_SOURCE", "Ljava/lang/String;", null, "jtaDataSource");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION_POOL_NON_JTA_DATA_SOURCE", "Ljava/lang/String;", null, "nonJtaDataSource");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION_POOL_USER", "Ljava/lang/String;", null, "user");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION_POOL_PASSWORD", "Ljava/lang/String;", null, "password");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION_POOL_FAILOVER", "Ljava/lang/String;", null, "failover");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION_POOL", "Ljava/lang/String;", null, "eclipselink.connection-pool.");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION_POOL_READ", "Ljava/lang/String;", null, "eclipselink.connection-pool.read.");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION_POOL_SEQUENCE", "Ljava/lang/String;", null, "eclipselink.connection-pool.sequence.");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION_POOL_INTERNALLY_POOL_DATASOURCE", "Ljava/lang/String;", null, "eclipselink.connection-pool.force-internal-pool");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "JDBC_CONNECTIONS_WAIT", "Ljava/lang/String;", null, "eclipselink.jdbc.connections.wait-timeout");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "JDBC_CONNECTIONS_MAX", "Ljava/lang/String;", null, "eclipselink.jdbc.connections.max");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "JDBC_CONNECTIONS_MIN", "Ljava/lang/String;", null, "eclipselink.jdbc.connections.min");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "JDBC_CONNECTIONS_INITIAL", "Ljava/lang/String;", null, "eclipselink.jdbc.connections.initial");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "JDBC_WRITE_CONNECTIONS_MAX", "Ljava/lang/String;", null, "eclipselink.jdbc.write-connections.max");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "JDBC_WRITE_CONNECTIONS_MIN", "Ljava/lang/String;", null, "eclipselink.jdbc.write-connections.min");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "JDBC_WRITE_CONNECTIONS_INITIAL", "Ljava/lang/String;", null, "eclipselink.jdbc.write-connections.initial");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "JDBC_READ_CONNECTIONS_MAX", "Ljava/lang/String;", null, "eclipselink.jdbc.read-connections.max");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "JDBC_READ_CONNECTIONS_MIN", "Ljava/lang/String;", null, "eclipselink.jdbc.read-connections.min");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "JDBC_READ_CONNECTIONS_INITIAL", "Ljava/lang/String;", null, "eclipselink.jdbc.read-connections.initial");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "JDBC_READ_CONNECTIONS_SHARED", "Ljava/lang/String;", null, "eclipselink.jdbc.read-connections.shared");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "JDBC_SEQUENCE_CONNECTION_POOL_MAX", "Ljava/lang/String;", null, "eclipselink.jdbc.sequence-connection-pool.max");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "JDBC_SEQUENCE_CONNECTION_POOL_MIN", "Ljava/lang/String;", null, "eclipselink.jdbc.sequence-connection-pool.min");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "JDBC_SEQUENCE_CONNECTION_POOL_INITIAL", "Ljava/lang/String;", null, "eclipselink.jdbc.sequence-connection-pool.initial");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "JDBC_SEQUENCE_CONNECTION_POOL", "Ljava/lang/String;", null, "eclipselink.jdbc.sequence-connection-pool");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "JDBC_SEQUENCE_CONNECTION_POOL_DATASOURCE", "Ljava/lang/String;", null, "eclipselink.jdbc.sequence-connection-pool.non-jta-data-source");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARTITIONING", "Ljava/lang/String;", null, "eclipselink.partitioning");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARTITIONING_CALLBACK", "Ljava/lang/String;", null, "eclipselink.partitioning.callback");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JDBC_BIND_PARAMETERS", "Ljava/lang/String;", null, "eclipselink.jdbc.bind-parameters");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JDBC_FORCE_BIND_PARAMETERS", "Ljava/lang/String;", null, "eclipselink.jdbc.force-bind-parameters");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXCLUSIVE_CONNECTION_MODE", "Ljava/lang/String;", null, "eclipselink.jdbc.exclusive-connection.mode");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXCLUSIVE_CONNECTION_IS_LAZY", "Ljava/lang/String;", null, "eclipselink.jdbc.exclusive-connection.is-lazy");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CACHE_STATEMENTS_SIZE", "Ljava/lang/String;", null, "eclipselink.jdbc.cache-statements.size");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CACHE_STATEMENTS", "Ljava/lang/String;", null, "eclipselink.jdbc.cache-statements");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALIDATOR_FACTORY", "Ljava/lang/String;", null, "javax.persistence.validation.factory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALIDATION_MODE", "Ljava/lang/String;", null, "javax.persistence.validation.mode");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALIDATION_GROUP_PRE_PERSIST", "Ljava/lang/String;", null, "javax.persistence.validation.group.pre-persist");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALIDATION_GROUP_PRE_UPDATE", "Ljava/lang/String;", null, "javax.persistence.validation.group.pre-update");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALIDATION_GROUP_PRE_REMOVE", "Ljava/lang/String;", null, "javax.persistence.validation.group.pre-remove");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BEAN_VALIDATION_NO_OPTIMISATION", "Ljava/lang/String;", null, "eclipselink.beanvalidation.no-optimisation");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT", "Ljava/lang/String;", null, "default");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CACHE_SIZE_", "Ljava/lang/String;", null, "eclipselink.cache.size.");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CACHE_TYPE_", "Ljava/lang/String;", null, "eclipselink.cache.type.");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CACHE_SHARED_", "Ljava/lang/String;", null, "eclipselink.cache.shared.");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SHARED_CACHE_MODE", "Ljava/lang/String;", null, "javax.persistence.sharedCache.mode");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CACHE_SIZE_DEFAULT", "Ljava/lang/String;", null, "eclipselink.cache.size.default");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CACHE_TYPE_DEFAULT", "Ljava/lang/String;", null, "eclipselink.cache.type.default");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANONICAL_MODEL_PREFIX", "Ljava/lang/String;", null, "eclipselink.canonicalmodel.prefix");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "CANONICAL_MODEL_PREFIX_DEFAULT", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANONICAL_MODEL_SUFFIX", "Ljava/lang/String;", null, "eclipselink.canonicalmodel.suffix");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "CANONICAL_MODEL_SUFFIX_DEFAULT", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANONICAL_MODEL_SUB_PACKAGE", "Ljava/lang/String;", null, "eclipselink.canonicalmodel.subpackage");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "CANONICAL_MODEL_SUB_PACKAGE_DEFAULT", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANONICAL_MODEL_LOAD_XML", "Ljava/lang/String;", null, "eclipselink.canonicalmodel.load_xml");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANONICAL_MODEL_LOAD_XML_DEFAULT", "Ljava/lang/String;", null, "true");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANONICAL_MODEL_USE_STATIC_FACTORY", "Ljava/lang/String;", null, "eclipselink.canonicalmodel.use_static_factory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANONICAL_MODEL_USE_STATIC_FACTORY_DEFAULT", "Ljava/lang/String;", null, "true");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANONICAL_MODEL_GENERATE_TIMESTAMP", "Ljava/lang/String;", null, "eclipselink.canonicalmodel.generate_timestamp");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANONICAL_MODEL_GENERATE_TIMESTAMP_DEFAULT", "Ljava/lang/String;", null, "true");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANONICAL_MODEL_GENERATE_COMMENTS", "Ljava/lang/String;", null, "eclipselink.canonicalmodel.generate_comments");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANONICAL_MODEL_GENERATE_COMMENTS_DEFAULT", "Ljava/lang/String;", null, "true");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CACHE_SHARED_DEFAULT", "Ljava/lang/String;", null, "eclipselink.cache.shared.default");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUERY_CACHE", "Ljava/lang/String;", null, "eclipselink.cache.query-results");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DATABASE_EVENT_LISTENER", "Ljava/lang/String;", null, "eclipselink.cache.database-event-listener");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOGGING_LOGGER", "Ljava/lang/String;", null, "eclipselink.logging.logger");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOGGING_LEVEL", "Ljava/lang/String;", null, "eclipselink.logging.level");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CATEGORY_LOGGING_LEVEL_", "Ljava/lang/String;", null, "eclipselink.logging.level.");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOGGING_PARAMETERS", "Ljava/lang/String;", null, "eclipselink.logging.parameters");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOGGING_TIMESTAMP", "Ljava/lang/String;", null, "eclipselink.logging.timestamp");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOGGING_THREAD", "Ljava/lang/String;", null, "eclipselink.logging.thread");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOGGING_SESSION", "Ljava/lang/String;", null, "eclipselink.logging.session");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOGGING_CONNECTION", "Ljava/lang/String;", null, "eclipselink.logging.connection");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOGGING_EXCEPTIONS", "Ljava/lang/String;", null, "eclipselink.logging.exceptions");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOGGING_FILE", "Ljava/lang/String;", null, "eclipselink.logging.file");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MULTITENANT_PROPERTY_DEFAULT", "Ljava/lang/String;", null, "eclipselink.tenant-id");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MULTITENANT_SCHEMA_PROPERTY_DEFAULT", "Ljava/lang/String;", null, "eclipselink.tenant-schema-id");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MULTITENANT_SHARED_CACHE", "Ljava/lang/String;", null, "eclipselink.multitenant.tenants-share-cache");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MULTITENANT_SHARED_EMF", "Ljava/lang/String;", null, "eclipselink.multitenant.tenants-share-emf");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MULTITENANT_STRATEGY", "Ljava/lang/String;", null, "eclipselink.multitenant.strategy");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_CREATION_SUFFIX", "Ljava/lang/String;", null, "eclipselink.ddl-generation.table-creation-suffix");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_DATABASE", "Ljava/lang/String;", null, "eclipselink.target-database");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_DATABASE_PROPERTIES", "Ljava/lang/String;", null, "eclipselink.target-database-properties");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXCLUDE_ECLIPSELINK_ORM_FILE", "Ljava/lang/String;", null, "eclipselink.exclude-eclipselink-orm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SESSION_NAME", "Ljava/lang/String;", null, "eclipselink.session-name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEAVING", "Ljava/lang/String;", null, "eclipselink.weaving");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEAVING_INTERNAL", "Ljava/lang/String;", null, "eclipselink.weaving.internal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEAVING_LAZY", "Ljava/lang/String;", null, "eclipselink.weaving.lazy");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEAVING_EAGER", "Ljava/lang/String;", null, "eclipselink.weaving.eager");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEAVING_CHANGE_TRACKING", "Ljava/lang/String;", null, "eclipselink.weaving.changetracking");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEAVING_FETCHGROUPS", "Ljava/lang/String;", null, "eclipselink.weaving.fetchgroups");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEAVING_MAPPEDSUPERCLASS", "Ljava/lang/String;", null, "eclipselink.weaving.mappedsuperclass");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEAVING_REST", "Ljava/lang/String;", null, "eclipselink.weaving.rest");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_SERVER", "Ljava/lang/String;", null, "eclipselink.target-server");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_DATABASE_ACTION", "Ljava/lang/String;", null, "javax.persistence.schema-generation.database.action");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_SCRIPTS_ACTION", "Ljava/lang/String;", null, "javax.persistence.schema-generation.scripts.action");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_CREATE_SOURCE", "Ljava/lang/String;", null, "javax.persistence.schema-generation.create-source");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_DROP_SOURCE", "Ljava/lang/String;", null, "javax.persistence.schema-generation.drop-source");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_CREATE_DATABASE_SCHEMAS", "Ljava/lang/String;", null, "javax.persistence.schema-generation.create-database-schemas");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_SCRIPTS_CREATE_TARGET", "Ljava/lang/String;", null, "javax.persistence.schema-generation.scripts.create-target");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_SCRIPTS_DROP_TARGET", "Ljava/lang/String;", null, "javax.persistence.schema-generation.scripts.drop-target");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_DATABASE_PRODUCT_NAME", "Ljava/lang/String;", null, "javax.persistence.database-product-name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_DATABASE_MAJOR_VERSION", "Ljava/lang/String;", null, "javax.persistence.database-major-version");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_DATABASE_MINOR_VERSION", "Ljava/lang/String;", null, "javax.persistence.database-minor-version");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_CREATE_SCRIPT_SOURCE", "Ljava/lang/String;", null, "javax.persistence.schema-generation.create-script-source");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_DROP_SCRIPT_SOURCE", "Ljava/lang/String;", null, "javax.persistence.schema-generation.drop-script-source");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_CONNECTION", "Ljava/lang/String;", null, "javax.persistence.schema-generation.connection");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_SQL_LOAD_SCRIPT_SOURCE", "Ljava/lang/String;", null, "javax.persistence.sql-load-script-source");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_CREATE_ACTION", "Ljava/lang/String;", null, "create");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_DROP_AND_CREATE_ACTION", "Ljava/lang/String;", null, "drop-and-create");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_DROP_ACTION", "Ljava/lang/String;", null, "drop");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_NONE_ACTION", "Ljava/lang/String;", null, "none");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_METADATA_SOURCE", "Ljava/lang/String;", null, "metadata");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_SCRIPT_SOURCE", "Ljava/lang/String;", null, "script");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_METADATA_THEN_SCRIPT_SOURCE", "Ljava/lang/String;", null, "metadata-then-script");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_SCRIPT_THEN_METADATA_SOURCE", "Ljava/lang/String;", null, "script-then-metadata");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_GENERATION_SCRIPT_TERMINATE_STATEMENTS", "Ljava/lang/String;", null, "eclipselink.ddlgen-terminate-statements");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SEQUENCING_SEQUENCE_DEFAULT", "Ljava/lang/String;", null, "eclipselink.sequencing.default-sequence-to-table");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SEQUENCING_START_AT_NEXTVAL", "Ljava/lang/String;", null, "eclipselink.sequencing.start-sequence-at-nextval");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SESSION_CUSTOMIZER", "Ljava/lang/String;", null, "eclipselink.session.customizer");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DESCRIPTOR_CUSTOMIZER_", "Ljava/lang/String;", null, "eclipselink.descriptor.customizer.");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NATIVE_QUERY_UPPERCASE_COLUMNS", "Ljava/lang/String;", null, "eclipselink.jdbc.uppercase-columns");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPPERCASE_COLUMN_NAMES", "Ljava/lang/String;", null, "eclipselink.jpa.uppercase-column-names");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BATCH_WRITING", "Ljava/lang/String;", null, "eclipselink.jdbc.batch-writing");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BATCH_WRITING_SIZE", "Ljava/lang/String;", null, "eclipselink.jdbc.batch-writing.size");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CDI_BEANMANAGER", "Ljava/lang/String;", null, "javax.persistence.bean.manager");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ECLIPSELINK_PERSISTENCE_XML", "Ljava/lang/String;", null, "eclipselink.persistencexml");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ECLIPSELINK_SE_PUINFO", "Ljava/lang/String;", null, "eclipselink.se-puinfo");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ECLIPSELINK_PERSISTENCE_XML_DEFAULT", "Ljava/lang/String;", null, "META-INF/persistence.xml");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ECLIPSELINK_PERSISTENCE_UNITS", "Ljava/lang/String;", null, "eclipselink.persistenceunits");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXCEPTION_HANDLER_CLASS", "Ljava/lang/String;", null, "eclipselink.exception-handler");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCLUDE_DESCRIPTOR_QUERIES", "Ljava/lang/String;", null, "eclipselink.session.include.descriptor.queries");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SESSION_EVENT_LISTENER_CLASS", "Ljava/lang/String;", null, "eclipselink.session-event-listener");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SESSIONS_XML", "Ljava/lang/String;", null, "eclipselink.sessions-xml");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROJECT_CACHE", "Ljava/lang/String;", null, "eclipselink.project-cache");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROJECT_CACHE_FILE", "Ljava/lang/String;", null, "eclipselink.project-cache.java-serialization.file-location");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TEMPORAL_MUTABLE", "Ljava/lang/String;", null, "eclipselink.temporal.mutable");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALLOW_NATIVE_SQL_QUERIES", "Ljava/lang/String;", null, "eclipselink.jdbc.allow-native-sql-queries");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "ALLOW_ZERO_ID", "Ljava/lang/String;", null, "eclipselink.allow-zero-id");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ID_VALIDATION", "Ljava/lang/String;", null, "eclipselink.id-validation");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLUSH_CLEAR_CACHE", "Ljava/lang/String;", null, "eclipselink.flush-clear.cache");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLASSLOADER", "Ljava/lang/String;", null, "eclipselink.classloader");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "THROW_EXCEPTIONS", "Ljava/lang/String;", null, "eclipselink.orm.throw.exceptions");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORM_SCHEMA_VALIDATION", "Ljava/lang/String;", null, "eclipselink.orm.validate.schema");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEPLOY_ON_STARTUP", "Ljava/lang/String;", null, "eclipselink.deploy-on-startup");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALIDATION_ONLY_PROPERTY", "Ljava/lang/String;", null, "eclipselink.validation-only");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DDL_GENERATION", "Ljava/lang/String;", null, "eclipselink.ddl-generation");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CREATE_ONLY", "Ljava/lang/String;", null, "create-tables");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DROP_ONLY", "Ljava/lang/String;", null, "drop-tables");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DROP_AND_CREATE", "Ljava/lang/String;", null, "drop-and-create-tables");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CREATE_OR_EXTEND", "Ljava/lang/String;", null, "create-or-extend-tables");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NONE", "Ljava/lang/String;", null, "none");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "METADATA_SOURCE", "Ljava/lang/String;", null, "eclipselink.metadata-source");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "METADATA_SOURCE_RCM_COMMAND", "Ljava/lang/String;", null, "eclipselink.metadata-source.send-refresh-command");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "METADATA_SOURCE_XML_FILE", "Ljava/lang/String;", null, "eclipselink.metadata-source.xml.file");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "METADATA_SOURCE_XML_URL", "Ljava/lang/String;", null, "eclipselink.metadata-source.xml.url");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "METADATA_SOURCE_PROPERTIES_FILE", "Ljava/lang/String;", null, "eclipselink.metadata-source.properties.file");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APP_LOCATION", "Ljava/lang/String;", null, "eclipselink.application-location");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CREATE_JDBC_DDL_FILE", "Ljava/lang/String;", null, "eclipselink.create-ddl-jdbc-file-name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DROP_JDBC_DDL_FILE", "Ljava/lang/String;", null, "eclipselink.drop-ddl-jdbc-file-name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_APP_LOCATION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_CREATE_JDBC_FILE_NAME", "Ljava/lang/String;", null, "createDDL.jdbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_DROP_JDBC_FILE_NAME", "Ljava/lang/String;", null, "dropDDL.jdbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVASE_DB_INTERACTION", "Ljava/lang/String;", null, "INTERACT_WITH_DB");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DDL_GENERATION_MODE", "Ljava/lang/String;", null, "eclipselink.ddl-generation.output-mode");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DDL_GENERATION_INDEX_FOREIGN_KEYS", "Ljava/lang/String;", null, "eclipselink.ddl-generation.index-foreign-keys");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DDL_SQL_SCRIPT_GENERATION", "Ljava/lang/String;", null, "sql-script");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DDL_DATABASE_GENERATION", "Ljava/lang/String;", null, "database");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DDL_BOTH_GENERATION", "Ljava/lang/String;", null, "both");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_DDL_GENERATION_MODE", "Ljava/lang/String;", null, "database");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALIDATE_EXISTENCE", "Ljava/lang/String;", null, "eclipselink.validate-existence");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "ORDER_UPDATES", "Ljava/lang/String;", null, "eclipselink.order-updates");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PERSISTENCE_CONTEXT_COMMIT_ORDER", "Ljava/lang/String;", null, "eclipselink.persistence-context.commit-order");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROFILER", "Ljava/lang/String;", null, "eclipselink.profiler");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TUNING", "Ljava/lang/String;", null, "eclipselink.tuning");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FREE_METADATA", "Ljava/lang/String;", null, "eclipselink.memory.free-metadata");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JOIN_EXISTING_TRANSACTION", "Ljava/lang/String;", null, "eclipselink.transaction.join-existing");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PERSISTENCE_CONTEXT_REFERENCE_MODE", "Ljava/lang/String;", null, "eclipselink.persistence-context.reference-mode");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PESSIMISTIC_LOCK_TIMEOUT", "Ljava/lang/String;", null, "javax.persistence.lock.timeout");
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
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PERSISTENCE_CONTEXT_CLOSE_ON_COMMIT", "Ljava/lang/String;", null, "eclipselink.persistence-context.close-on-commit");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PERSISTENCE_CONTEXT_PERSIST_ON_COMMIT", "Ljava/lang/String;", null, "eclipselink.persistence-context.persist-on-commit");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PERSISTENCE_CONTEXT_COMMIT_WITHOUT_PERSIST_RULES", "Ljava/lang/String;", null, "eclipselink.persistence-context.commit-without-persist-rules");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PERSISTENCE_CONTEXT_FLUSH_MODE", "Ljava/lang/String;", null, "eclipselink.persistence-context.flush-mode");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORACLE_PROXY_TYPE", "Ljava/lang/String;", null, "eclipselink.oracle.proxy-type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_PROTOCOL", "Ljava/lang/String;", null, "eclipselink.cache.coordination.protocol");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_JGROUPS_CONFIG", "Ljava/lang/String;", null, "eclipselink.cache.coordination.jgroups.config");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_JMS_HOST", "Ljava/lang/String;", null, "eclipselink.cache.coordination.jms.host");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_JMS_TOPIC", "Ljava/lang/String;", null, "eclipselink.cache.coordination.jms.topic");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_JMS_FACTORY", "Ljava/lang/String;", null, "eclipselink.cache.coordination.jms.factory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_JMS_REUSE_PUBLISHER", "Ljava/lang/String;", null, "eclipselink.cache.coordination.jms.reuse-topic-publisher");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_RMI_ANNOUNCEMENT_DELAY", "Ljava/lang/String;", null, "eclipselink.cache.coordination.rmi.announcement-delay");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_RMI_MULTICAST_GROUP", "Ljava/lang/String;", null, "eclipselink.cache.coordination.rmi.multicast-group");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_RMI_MULTICAST_GROUP_PORT", "Ljava/lang/String;", null, "eclipselink.cache.coordination.rmi.multicast-group.port");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_RMI_PACKET_TIME_TO_LIVE", "Ljava/lang/String;", null, "eclipselink.cache.coordination.rmi.packet-time-to-live");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_RMI_URL", "Ljava/lang/String;", null, "eclipselink.cache.coordination.rmi.url");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_NAMING_SERVICE", "Ljava/lang/String;", null, "eclipselink.cache.coordination.naming-service");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_JNDI_USER", "Ljava/lang/String;", null, "eclipselink.cache.coordination.jndi.user");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_JNDI_PASSWORD", "Ljava/lang/String;", null, "eclipselink.cache.coordination.jndi.password");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_JNDI_CONTEXT", "Ljava/lang/String;", null, "eclipselink.cache.coordination.jndi.initial-context-factory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_REMOVE_CONNECTION", "Ljava/lang/String;", null, "eclipselink.cache.coordination.remove-connection-on-error");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_ASYNCH", "Ljava/lang/String;", null, "eclipselink.cache.coordination.propagate-asynchronously");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_THREAD_POOL_SIZE", "Ljava/lang/String;", null, "eclipselink.cache.coordination.thread.pool.size");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_SERIALIZER", "Ljava/lang/String;", null, "eclipselink.cache.coordination.serializer");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDINATION_CHANNEL", "Ljava/lang/String;", null, "eclipselink.cache.coordination.channel");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPOSITE_UNIT", "Ljava/lang/String;", null, "eclipselink.composite-unit");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPOSITE_UNIT_MEMBER", "Ljava/lang/String;", null, "eclipselink.composite-unit.member");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPOSITE_UNIT_PROPERTIES", "Ljava/lang/String;", null, "eclipselink.composite-unit.properties");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REMOTE_PROTOCOL", "Ljava/lang/String;", null, "eclipselink.remote.protocol");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REMOTE_URL", "Ljava/lang/String;", null, "eclipselink.remote.client.url");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REMOTE_SERVER_NAME", "Ljava/lang/String;", null, "eclipselink.remote.server.name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NOSQL_CONNECTION_SPEC", "Ljava/lang/String;", null, "eclipselink.nosql.connection-spec");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NOSQL_CONNECTION_FACTORY", "Ljava/lang/String;", null, "eclipselink.nosql.connection-factory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NOSQL_PROPERTY", "Ljava/lang/String;", null, "eclipselink.nosql.property.");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NOSQL_USER", "Ljava/lang/String;", null, "eclipselink.nosql.property.user");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NOSQL_PASSWORD", "Ljava/lang/String;", null, "eclipselink.nosql.property.password");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JDBC_CONNECTOR", "Ljava/lang/String;", null, "eclipselink.jdbc.connector");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JDBC_PROPERTY", "Ljava/lang/String;", null, "eclipselink.jdbc.property.");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JDBC_RESULT_SET_ACCESS_OPTIMIZATION", "Ljava/lang/String;", null, "eclipselink.jdbc.result-set-access-optimization");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERIALIZER", "Ljava/lang/String;", null, "eclipselink.serializer");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPQL_TOLERATE", "Ljava/lang/String;", null, "eclipselink.tolerate-invalid-jpql");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USE_LOCAL_TIMESTAMP", "Ljava/lang/String;", null, "eclipselink.locking.timestamp.local.default");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_CALL_DEFERRAL", "Ljava/lang/String;", null, "eclipselink.jpa.sql-call-deferral");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROPERTY_LOG_OVERRIDES", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "supportedNonServerSessionProperties", "Ljava/util/Set;", "Ljava/util/Set<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/config/PersistenceUnitProperties", "CANONICAL_MODEL_PREFIX_DEFAULT", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("_");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/config/PersistenceUnitProperties", "CANONICAL_MODEL_SUFFIX_DEFAULT", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/config/PersistenceUnitProperties", "CANONICAL_MODEL_SUB_PACKAGE_DEFAULT", "Ljava/lang/String;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(".");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/io/File", "separator", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/config/PersistenceUnitProperties", "DEFAULT_APP_LOCATION", "Ljava/lang/String;");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/config/PersistenceUnitProperties", "PROPERTY_LOG_OVERRIDES", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/config/PersistenceUnitProperties", "PROPERTY_LOG_OVERRIDES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("javax.persistence.jdbc.password");
methodVisitor.visitLdcInsn("xxxxxx");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/config/PersistenceUnitProperties$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/config/PersistenceUnitProperties$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/config/PersistenceUnitProperties", "supportedNonServerSessionProperties", "Ljava/util/Set;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getOverriddenLogStringForProperty", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/config/PersistenceUnitProperties", "PROPERTY_LOG_OVERRIDES", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getSupportedNonServerSessionProperties", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/config/PersistenceUnitProperties", "supportedNonServerSessionProperties", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableSet", "(Ljava/util/Set;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
