package asm.org.eclipse.persistence.internal.jpa.metadata.accessors.mappings;
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
public class MappedKeyMapAccessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/internal/jpa/metadata/accessors/mappings/MappedKeyMapAccessor", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMapKeyAssociationOverrides", "()Ljava/util/List;", "()Ljava/util/List<Lorg/eclipse/persistence/internal/jpa/metadata/columns/AssociationOverrideMetadata;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMapKeyAttributeOverrides", "()Ljava/util/List;", "()Ljava/util/List<Lorg/eclipse/persistence/internal/jpa/metadata/columns/AttributeOverrideMetadata;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMapKey", "()Lorg/eclipse/persistence/internal/jpa/metadata/mappings/MapKeyMetadata;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMapKeyClass", "()Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataClass;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMapKeyClassWithGenerics", "()Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataClass;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMapKeyConvert", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMapKeyConverts", "()Ljava/util/List;", "()Ljava/util/List<Lorg/eclipse/persistence/internal/jpa/metadata/converters/ConvertMetadata;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMapKeyColumn", "()Lorg/eclipse/persistence/internal/jpa/metadata/columns/ColumnMetadata;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMapKeyForeignKey", "()Lorg/eclipse/persistence/internal/jpa/metadata/columns/ForeignKeyMetadata;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMapKeyJoinColumns", "()Ljava/util/List;", "()Ljava/util/List<Lorg/eclipse/persistence/internal/jpa/metadata/columns/JoinColumnMetadata;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMapKeyClass", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataClass;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
