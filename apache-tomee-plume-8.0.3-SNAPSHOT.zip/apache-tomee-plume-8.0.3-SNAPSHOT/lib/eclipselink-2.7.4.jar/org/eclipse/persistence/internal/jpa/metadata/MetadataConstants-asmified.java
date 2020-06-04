package asm.org.eclipse.persistence.internal.jpa.metadata;
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
public class MetadataConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/metadata/MetadataConstants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ACCESS", "Ljava/lang/String;", null, "jakarta.persistence.Access");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ASSOCIATION_OVERRIDE", "Ljava/lang/String;", null, "jakarta.persistence.AssociationOverride");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ASSOCIATION_OVERRIDES", "Ljava/lang/String;", null, "jakarta.persistence.AssociationOverrides");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ATTRIBUTE_OVERRIDE", "Ljava/lang/String;", null, "jakarta.persistence.AttributeOverride");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ATTRIBUTE_OVERRIDES", "Ljava/lang/String;", null, "jakarta.persistence.AttributeOverrides");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_BASIC", "Ljava/lang/String;", null, "jakarta.persistence.Basic");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_CACHE", "Ljava/lang/String;", null, "jakarta.persistence.Cache");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_CACHEABLE", "Ljava/lang/String;", null, "jakarta.persistence.Cacheable");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_CACHE_RETRIEVE_MODE", "Ljava/lang/String;", null, "jakarta.persistence.CacheRetrieveMode");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_CACHE_STORE_MODE", "Ljava/lang/String;", null, "jakarta.persistence.CacheStoreMode");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_COLLECTION_TABLE", "Ljava/lang/String;", null, "jakarta.persistence.CollectionTable");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_COLUMN", "Ljava/lang/String;", null, "jakarta.persistence.Column");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_COLUMN_RESULT", "Ljava/lang/String;", null, "jakarta.persistence.ColumnResult");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_CONVERT", "Ljava/lang/String;", null, "jakarta.persistence.Convert");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_CONVERTS", "Ljava/lang/String;", null, "jakarta.persistence.Converts");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_CONVERTER", "Ljava/lang/String;", null, "jakarta.persistence.Converter");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_DISCRIMINATOR_COLUMN", "Ljava/lang/String;", null, "jakarta.persistence.DiscriminatorColumn");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_DISCRIMINATOR_VALUE", "Ljava/lang/String;", null, "jakarta.persistence.DiscriminatorValue");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ELEMENT_COLLECTION", "Ljava/lang/String;", null, "jakarta.persistence.ElementCollection");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_EMBEDDABLE", "Ljava/lang/String;", null, "jakarta.persistence.Embeddable");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_EMBEDDED", "Ljava/lang/String;", null, "jakarta.persistence.Embedded");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_EMBEDDED_ID", "Ljava/lang/String;", null, "jakarta.persistence.EmbeddedId");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ENTITY", "Ljava/lang/String;", null, "jakarta.persistence.Entity");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ENTITY_GRAPH", "Ljava/lang/String;", null, "jakarta.persistence.NamedEntityGraph");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ENTITY_GRAPHS", "Ljava/lang/String;", null, "jakarta.persistence.NamedEntityGraphs");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ENTITY_LISTENERS", "Ljava/lang/String;", null, "jakarta.persistence.EntityListeners");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ENTITY_RESULT", "Ljava/lang/String;", null, "jakarta.persistence.EntityResult");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ENUMERATED", "Ljava/lang/String;", null, "jakarta.persistence.Enumerated");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_EXCLUDE_DEFAULT_LISTENERS", "Ljava/lang/String;", null, "jakarta.persistence.ExcludeDefaultListeners");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_EXCLUDE_SUPERCLASS_LISTENERS", "Ljava/lang/String;", null, "jakarta.persistence.ExcludeSuperclassListeners");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_FIELD_RESULT", "Ljava/lang/String;", null, "jakarta.persistence.FieldResult");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_GENERATED_VALUE", "Ljava/lang/String;", null, "jakarta.persistence.GeneratedValue");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ID", "Ljava/lang/String;", null, "jakarta.persistence.Id");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ID_CLASS", "Ljava/lang/String;", null, "jakarta.persistence.IdClass");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_INHERITANCE", "Ljava/lang/String;", null, "jakarta.persistence.Inheritance");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_JOIN_COLUMN", "Ljava/lang/String;", null, "jakarta.persistence.JoinColumn");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_JOIN_COLUMNS", "Ljava/lang/String;", null, "jakarta.persistence.JoinColumns");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_JOIN_TABLE", "Ljava/lang/String;", null, "jakarta.persistence.JoinTable");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_LOB", "Ljava/lang/String;", null, "jakarta.persistence.Lob");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_MANY_TO_MANY", "Ljava/lang/String;", null, "jakarta.persistence.ManyToMany");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_MANY_TO_ONE", "Ljava/lang/String;", null, "jakarta.persistence.ManyToOne");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_MAP_KEY", "Ljava/lang/String;", null, "jakarta.persistence.MapKey");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_MAP_KEY_CLASS", "Ljava/lang/String;", null, "jakarta.persistence.MapKeyClass");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_MAP_KEY_COLUMN", "Ljava/lang/String;", null, "jakarta.persistence.MapKeyColumn");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_MAP_KEY_ENUMERATED", "Ljava/lang/String;", null, "jakarta.persistence.MapKeyEnumerated");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_MAP_KEY_JOIN_COLUMN", "Ljava/lang/String;", null, "jakarta.persistence.MapKeyJoinColumn");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_MAP_KEY_JOIN_COLUMNS", "Ljava/lang/String;", null, "jakarta.persistence.MapKeyJoinColumns");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_MAP_KEY_TEMPORAL", "Ljava/lang/String;", null, "jakarta.persistence.MapKeyTemporal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_MAPPED_SUPERCLASS", "Ljava/lang/String;", null, "jakarta.persistence.MappedSuperclass");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_MAPS_ID", "Ljava/lang/String;", null, "jakarta.persistence.MapsId");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_NAMED_NATIVE_QUERY", "Ljava/lang/String;", null, "jakarta.persistence.NamedNativeQuery");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_NAMED_NATIVE_QUERIES", "Ljava/lang/String;", null, "jakarta.persistence.NamedNativeQueries");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_NAMED_QUERY", "Ljava/lang/String;", null, "jakarta.persistence.NamedQuery");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_NAMED_QUERIES", "Ljava/lang/String;", null, "jakarta.persistence.NamedQueries");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_NAMED_STORED_PROCEDURE_QUERY", "Ljava/lang/String;", null, "jakarta.persistence.NamedStoredProcedureQuery");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_NAMED_STORED_PROCEDURE_QUERIES", "Ljava/lang/String;", null, "jakarta.persistence.NamedStoredProcedureQueries");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ONE_TO_MANY", "Ljava/lang/String;", null, "jakarta.persistence.OneToMany");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ONE_TO_ONE", "Ljava/lang/String;", null, "jakarta.persistence.OneToOne");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ORDER_BY", "Ljava/lang/String;", null, "jakarta.persistence.OrderBy");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ORDER_COLUMN", "Ljava/lang/String;", null, "jakarta.persistence.OrderColumn");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_PARAMETER", "Ljava/lang/String;", null, "jakarta.persistence.Parameter");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_POST_LOAD", "Ljava/lang/String;", null, "jakarta.persistence.PostLoad");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_POST_PERSIST", "Ljava/lang/String;", null, "jakarta.persistence.PostPersist");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_POST_REMOVE", "Ljava/lang/String;", null, "jakarta.persistence.PostRemove");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_POST_UPDATE", "Ljava/lang/String;", null, "jakarta.persistence.PostUpdate");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_PRE_PERSIST", "Ljava/lang/String;", null, "jakarta.persistence.PrePersist");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_PRE_REMOVE", "Ljava/lang/String;", null, "jakarta.persistence.PreRemove");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_PRE_UPDATE", "Ljava/lang/String;", null, "jakarta.persistence.PreUpdate");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_PRIMARY_KEY_JOIN_COLUMN", "Ljava/lang/String;", null, "jakarta.persistence.PrimaryKeyJoinColumn");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_PRIMARY_KEY_JOIN_COLUMNS", "Ljava/lang/String;", null, "jakarta.persistence.PrimaryKeyJoinColumns");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_SECONDARY_TABLE", "Ljava/lang/String;", null, "jakarta.persistence.SecondaryTable");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_SECONDARY_TABLES", "Ljava/lang/String;", null, "jakarta.persistence.SecondaryTables");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_SEQUENCE_GENERATOR", "Ljava/lang/String;", null, "jakarta.persistence.SequenceGenerator");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_SEQUENCE_GENERATORS", "Ljava/lang/String;", null, "jakarta.persistence.SequenceGenerators");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_SQL_RESULT_SET_MAPPING", "Ljava/lang/String;", null, "jakarta.persistence.SqlResultSetMapping");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_SQL_RESULT_SET_MAPPINGS", "Ljava/lang/String;", null, "jakarta.persistence.SqlResultSetMappings");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_STORED_PROCEDURE_PARAMETER", "Ljava/lang/String;", null, "jakarta.persistence.StoredProcedureParameter");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_TABLE", "Ljava/lang/String;", null, "jakarta.persistence.Table");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_TABLE_GENERATOR", "Ljava/lang/String;", null, "jakarta.persistence.TableGenerator");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_TABLE_GENERATORS", "Ljava/lang/String;", null, "jakarta.persistence.TableGenerators");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_TEMPORAL", "Ljava/lang/String;", null, "jakarta.persistence.Temporal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_TRANSIENT", "Ljava/lang/String;", null, "jakarta.persistence.Transient");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_UNIQUE_CONSTRAINT", "Ljava/lang/String;", null, "jakarta.persistence.UniqueConstraint");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_VERSION", "Ljava/lang/String;", null, "jakarta.persistence.Version");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_STATIC_METAMODEL", "Ljava/lang/String;", null, "jakarta.persistence.metamodel.StaticMetamodel");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ACCESS_FIELD", "Ljava/lang/String;", null, "FIELD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ACCESS_PROPERTY", "Ljava/lang/String;", null, "PROPERTY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EL_ACCESS_VIRTUAL", "Ljava/lang/String;", null, "VIRTUAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_CONSTRAINT_MODE_CONSTRAINT", "Ljava/lang/String;", null, "CONSTRAINT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_CONSTRAINT_MODE_NO_CONSTRAINT", "Ljava/lang/String;", null, "NO_CONSTRAINT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_CONSTRAINT_MODE_PROVIDER_DEFAULT", "Ljava/lang/String;", null, "PROVIDER_DEFAULT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_FETCH_EAGER", "Ljava/lang/String;", null, "EAGER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_FETCH_LAZY", "Ljava/lang/String;", null, "LAZY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_DISCRIMINATOR_STRING", "Ljava/lang/String;", null, "STRING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_DISCRIMINATOR_CHAR", "Ljava/lang/String;", null, "CHAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_DISCRIMINATOR_INTEGER", "Ljava/lang/String;", null, "INTEGER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ENUM_ORDINAL", "Ljava/lang/String;", null, "ORDINAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_ENUM_STRING", "Ljava/lang/String;", null, "STRING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_TEMPORAL_DATE", "Ljava/lang/String;", null, "DATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_TEMPORAL_TIME", "Ljava/lang/String;", null, "TIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_TEMPORAL_TIMESTAMP", "Ljava/lang/String;", null, "TIMESTAMP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_INHERITANCE_SINGLE_TABLE", "Ljava/lang/String;", null, "SINGLE_TABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_INHERITANCE_TABLE_PER_CLASS", "Ljava/lang/String;", null, "TABLE_PER_CLASS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_INHERITANCE_JOINED", "Ljava/lang/String;", null, "JOINED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_CASCADE_ALL", "Ljava/lang/String;", null, "ALL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_CASCADE_PERSIST", "Ljava/lang/String;", null, "PERSIST");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_CASCADE_MERGE", "Ljava/lang/String;", null, "MERGE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_CASCADE_REMOVE", "Ljava/lang/String;", null, "REMOVE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_CASCADE_REFRESH", "Ljava/lang/String;", null, "REFRESH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_CASCADE_DETACH", "Ljava/lang/String;", null, "DETACH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_PARAMETER_IN", "Ljava/lang/String;", null, "IN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_PARAMETER_INOUT", "Ljava/lang/String;", null, "INOUT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_PARAMETER_OUT", "Ljava/lang/String;", null, "OUT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_PARAMETER_REF_CURSOR", "Ljava/lang/String;", null, "REF_CURSOR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_GENERATION_TABLE", "Ljava/lang/String;", null, "TABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_GENERATION_SEQUENCE", "Ljava/lang/String;", null, "SEQUENCE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_GENERATION_IDENTITY", "Ljava/lang/String;", null, "IDENTITY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_GENERATION_AUTO", "Ljava/lang/String;", null, "AUTO");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MAPPED_SUPERCLASS_RESERVED_PK_NAME", "Ljava/lang/String;", null, "__PK_METAMODEL_RESERVED_IN_MEM_ONLY_FIELD_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MAPPED_SUPERCLASS_RESERVED_TABLE_NAME", "Ljava/lang/String;", null, "__METAMODEL_RESERVED_IN_MEM_ONLY_TABLE_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPA_PERSISTENCE_PACKAGE_PREFIX", "Ljava/lang/String;", null, "jakarta.persistence");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ECLIPSELINK_PERSISTENCE_PACKAGE_PREFIX", "Ljava/lang/String;", null, "org.eclipse.persistence");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ECLIPSELINK_OXM_PACKAGE_PREFIX", "Ljava/lang/String;", null, "org.eclipse.persistence.oxm");
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
