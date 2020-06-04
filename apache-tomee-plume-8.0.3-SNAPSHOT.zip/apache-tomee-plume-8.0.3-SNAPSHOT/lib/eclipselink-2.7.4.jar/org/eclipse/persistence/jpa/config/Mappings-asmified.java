package asm.org.eclipse.persistence.jpa.config;
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
public class MappingsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/jpa/config/Mappings", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addConverter", "()Lorg/eclipse/persistence/jpa/config/Converter;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addConverterClass", "()Lorg/eclipse/persistence/jpa/config/ConverterClass;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addEmbeddable", "()Lorg/eclipse/persistence/jpa/config/Embeddable;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addEntity", "()Lorg/eclipse/persistence/jpa/config/Entity;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addHashPartitioning", "()Lorg/eclipse/persistence/jpa/config/HashPartitioning;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addMappedSuperclass", "()Lorg/eclipse/persistence/jpa/config/MappedSuperclass;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addNamedNativeQuery", "()Lorg/eclipse/persistence/jpa/config/NamedNativeQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addNamedPlsqlStoredFunctionQuery", "()Lorg/eclipse/persistence/jpa/config/NamedPlsqlStoredFunctionQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addNamedPlsqlStoredProcedureQuery", "()Lorg/eclipse/persistence/jpa/config/NamedPlsqlStoredProcedureQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addNamedQuery", "()Lorg/eclipse/persistence/jpa/config/NamedQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addNamedStoredFunctionQuery", "()Lorg/eclipse/persistence/jpa/config/NamedStoredFunctionQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addNamedStoredProcedureQuery", "()Lorg/eclipse/persistence/jpa/config/NamedStoredProcedureQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addObjectTypeConverter", "()Lorg/eclipse/persistence/jpa/config/ObjectTypeConverter;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addOracleArray", "()Lorg/eclipse/persistence/jpa/config/OracleArray;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addOracleObject", "()Lorg/eclipse/persistence/jpa/config/OracleObject;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addPartitioning", "()Lorg/eclipse/persistence/jpa/config/Partitioning;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addPinnedPartitioning", "()Lorg/eclipse/persistence/jpa/config/PinnedPartitioning;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addPlsqlRecord", "()Lorg/eclipse/persistence/jpa/config/PlsqlRecord;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addPlsqlTable", "()Lorg/eclipse/persistence/jpa/config/PlsqlTable;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addRangePartitioning", "()Lorg/eclipse/persistence/jpa/config/RangePartitioning;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addReplicationPartititioning", "()Lorg/eclipse/persistence/jpa/config/ReplicationPartitioning;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addRoundRobinPartitioning", "()Lorg/eclipse/persistence/jpa/config/RoundRobinPartitioning;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addSequenceGenerator", "()Lorg/eclipse/persistence/jpa/config/SequenceGenerator;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addSqlResultSetMapping", "()Lorg/eclipse/persistence/jpa/config/SqlResultSetMapping;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addStructConverter", "()Lorg/eclipse/persistence/jpa/config/StructConverter;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addTableGenerator", "()Lorg/eclipse/persistence/jpa/config/TableGenerator;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addTenantDiscriminatorColumn", "()Lorg/eclipse/persistence/jpa/config/TenantDiscriminatorColumn;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addTypeConverter", "()Lorg/eclipse/persistence/jpa/config/TypeConverter;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addUnionPartitioning", "()Lorg/eclipse/persistence/jpa/config/UnionPartitioning;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addUuidGenerator", "()Lorg/eclipse/persistence/jpa/config/UuidGenerator;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addValuePartitioning", "()Lorg/eclipse/persistence/jpa/config/ValuePartitioning;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAccess", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/Mappings;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAccessMethods", "()Lorg/eclipse/persistence/jpa/config/AccessMethods;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setCatalog", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/Mappings;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setPackage", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/Mappings;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setPersistenceUnitMetadata", "()Lorg/eclipse/persistence/jpa/config/PersistenceUnitMetadata;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setSchema", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/Mappings;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setVersion", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/Mappings;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
