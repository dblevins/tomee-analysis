package asm.org.apache.openjpa.jdbc.meta;
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
public class MappingDefaultsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/jdbc/meta/MappingDefaults", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "defaultMissingInfo", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "useClassCriteria", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStrategy", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;Z)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStrategy", "(Lorg/apache/openjpa/jdbc/meta/Version;Z)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStrategy", "(Lorg/apache/openjpa/jdbc/meta/Discriminator;Z)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStrategy", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Ljava/lang/Class;Z)Ljava/lang/Object;", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Ljava/lang/Class<*>;Z)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDiscriminatorValue", "(Lorg/apache/openjpa/jdbc/meta/Discriminator;Z)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "getTableName", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/schema/Schema;)Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTableIdentifier", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/schema/Schema;)Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "getTableName", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;Lorg/apache/openjpa/jdbc/schema/Schema;)Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTableIdentifier", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;Lorg/apache/openjpa/jdbc/schema/Schema;)Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "populateDataStoreIdColumns", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/schema/Table;[Lorg/apache/openjpa/jdbc/schema/Column;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "populateColumns", "(Lorg/apache/openjpa/jdbc/meta/Version;Lorg/apache/openjpa/jdbc/schema/Table;[Lorg/apache/openjpa/jdbc/schema/Column;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "populateColumns", "(Lorg/apache/openjpa/jdbc/meta/Discriminator;Lorg/apache/openjpa/jdbc/schema/Table;[Lorg/apache/openjpa/jdbc/schema/Column;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "populateJoinColumn", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/Object;II)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "populateJoinColumn", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/Object;II)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "populateForeignKeyColumn", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Ljava/lang/String;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/Object;ZII)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "populateForeignKeyColumn", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/Object;ZII)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "populateColumns", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Ljava/lang/String;Lorg/apache/openjpa/jdbc/schema/Table;[Lorg/apache/openjpa/jdbc/schema/Column;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "populateColumns", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;Lorg/apache/openjpa/jdbc/schema/Table;[Lorg/apache/openjpa/jdbc/schema/Column;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "populateOrderColumns", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;Lorg/apache/openjpa/jdbc/schema/Table;[Lorg/apache/openjpa/jdbc/schema/Column;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "populateNullIndicatorColumns", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Ljava/lang/String;Lorg/apache/openjpa/jdbc/schema/Table;[Lorg/apache/openjpa/jdbc/schema/Column;)Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "populateNullIndicatorColumns", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;Lorg/apache/openjpa/jdbc/schema/Table;[Lorg/apache/openjpa/jdbc/schema/Column;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJoinForeignKey", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Table;)Lorg/apache/openjpa/jdbc/schema/ForeignKey;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJoinForeignKey", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Table;)Lorg/apache/openjpa/jdbc/schema/ForeignKey;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "getForeignKey", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Ljava/lang/String;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Table;Z)Lorg/apache/openjpa/jdbc/schema/ForeignKey;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getForeignKey", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Table;Z)Lorg/apache/openjpa/jdbc/schema/ForeignKey;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJoinIndex", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;Lorg/apache/openjpa/jdbc/schema/Table;[Lorg/apache/openjpa/jdbc/schema/Column;)Lorg/apache/openjpa/jdbc/schema/Index;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "getIndex", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Ljava/lang/String;Lorg/apache/openjpa/jdbc/schema/Table;[Lorg/apache/openjpa/jdbc/schema/Column;)Lorg/apache/openjpa/jdbc/schema/Index;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getIndex", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;Lorg/apache/openjpa/jdbc/schema/Table;[Lorg/apache/openjpa/jdbc/schema/Column;)Lorg/apache/openjpa/jdbc/schema/Index;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getIndex", "(Lorg/apache/openjpa/jdbc/meta/Version;Lorg/apache/openjpa/jdbc/schema/Table;[Lorg/apache/openjpa/jdbc/schema/Column;)Lorg/apache/openjpa/jdbc/schema/Index;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getIndex", "(Lorg/apache/openjpa/jdbc/meta/Discriminator;Lorg/apache/openjpa/jdbc/schema/Table;[Lorg/apache/openjpa/jdbc/schema/Column;)Lorg/apache/openjpa/jdbc/schema/Index;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJoinUnique", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;Lorg/apache/openjpa/jdbc/schema/Table;[Lorg/apache/openjpa/jdbc/schema/Column;)Lorg/apache/openjpa/jdbc/schema/Unique;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "getUnique", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Ljava/lang/String;Lorg/apache/openjpa/jdbc/schema/Table;[Lorg/apache/openjpa/jdbc/schema/Column;)Lorg/apache/openjpa/jdbc/schema/Unique;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUnique", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;Lorg/apache/openjpa/jdbc/schema/Table;[Lorg/apache/openjpa/jdbc/schema/Column;)Lorg/apache/openjpa/jdbc/schema/Unique;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "getPrimaryKeyName", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/schema/Table;)Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPrimaryKeyIdentifier", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/schema/Table;)Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "installPrimaryKey", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;Lorg/apache/openjpa/jdbc/schema/Table;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
