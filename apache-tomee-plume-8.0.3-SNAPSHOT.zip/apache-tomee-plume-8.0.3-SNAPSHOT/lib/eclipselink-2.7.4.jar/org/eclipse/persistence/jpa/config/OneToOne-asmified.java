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
public class OneToOneDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/jpa/config/OneToOne", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addJoinColumn", "()Lorg/eclipse/persistence/jpa/config/JoinColumn;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addJoinField", "()Lorg/eclipse/persistence/jpa/config/JoinField;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addPrimaryKeyJoinColumn", "()Lorg/eclipse/persistence/jpa/config/PrimaryKeyJoinColumn;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addProperty", "()Lorg/eclipse/persistence/jpa/config/Property;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAccess", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/OneToOne;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAccessMethods", "()Lorg/eclipse/persistence/jpa/config/AccessMethods;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setBatchFetch", "()Lorg/eclipse/persistence/jpa/config/BatchFetch;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setCascade", "()Lorg/eclipse/persistence/jpa/config/Cascade;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setCascadeOnDelete", "(Ljava/lang/Boolean;)Lorg/eclipse/persistence/jpa/config/OneToOne;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setFetch", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/OneToOne;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setForeignKey", "()Lorg/eclipse/persistence/jpa/config/ForeignKey;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setHashPartitioning", "()Lorg/eclipse/persistence/jpa/config/HashPartitioning;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setId", "(Ljava/lang/Boolean;)Lorg/eclipse/persistence/jpa/config/OneToOne;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setJoinFetch", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/OneToOne;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setJoinTable", "()Lorg/eclipse/persistence/jpa/config/JoinTable;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMappedBy", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/OneToOne;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMapsId", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/OneToOne;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setName", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/OneToOne;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setNonCacheable", "(Ljava/lang/Boolean;)Lorg/eclipse/persistence/jpa/config/OneToOne;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setOptional", "(Ljava/lang/Boolean;)Lorg/eclipse/persistence/jpa/config/OneToOne;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setOrphanRemoval", "(Ljava/lang/Boolean;)Lorg/eclipse/persistence/jpa/config/OneToOne;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setPartitioned", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/OneToOne;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setPartitioning", "()Lorg/eclipse/persistence/jpa/config/Partitioning;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setPinnedPartitioning", "()Lorg/eclipse/persistence/jpa/config/PinnedPartitioning;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setPrimaryKeyForeignKey", "()Lorg/eclipse/persistence/jpa/config/ForeignKey;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setPrivateOwned", "(Ljava/lang/Boolean;)Lorg/eclipse/persistence/jpa/config/OneToOne;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setRangePartitioning", "()Lorg/eclipse/persistence/jpa/config/RangePartitioning;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setReplicationPartitioning", "()Lorg/eclipse/persistence/jpa/config/ReplicationPartitioning;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setRoundRobinPartitioning", "()Lorg/eclipse/persistence/jpa/config/RoundRobinPartitioning;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setTargetEntity", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/OneToOne;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setUnionPartitioning", "()Lorg/eclipse/persistence/jpa/config/UnionPartitioning;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setValuePartitioning", "()Lorg/eclipse/persistence/jpa/config/ValuePartitioning;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
