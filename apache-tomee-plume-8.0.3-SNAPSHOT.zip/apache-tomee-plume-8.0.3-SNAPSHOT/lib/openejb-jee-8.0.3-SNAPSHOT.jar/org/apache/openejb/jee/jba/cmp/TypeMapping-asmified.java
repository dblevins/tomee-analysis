package asm.org.apache.openejb.jee.jba.cmp;
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
public class TypeMappingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/jee/jba/cmp/TypeMapping", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlAccessorType;", true);
annotationVisitor0.visitEnum("value", "Ljavax/xml/bind/annotation/XmlAccessType;", "FIELD");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlType;", true);
annotationVisitor0.visit("name", "");
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("propOrder");
annotationVisitor1.visit(null, "name");
annotationVisitor1.visit(null, "rowLockingTemplate");
annotationVisitor1.visit(null, "pkConstraintTemplate");
annotationVisitor1.visit(null, "fkConstraintTemplate");
annotationVisitor1.visit(null, "autoIncrementTemplate");
annotationVisitor1.visit(null, "addColumnTemplate");
annotationVisitor1.visit(null, "alterColumnTemplate");
annotationVisitor1.visit(null, "dropColumnTemplate");
annotationVisitor1.visit(null, "aliasHeaderPrefix");
annotationVisitor1.visit(null, "aliasHeaderSuffix");
annotationVisitor1.visit(null, "aliasMaxLength");
annotationVisitor1.visit(null, "subquerySupported");
annotationVisitor1.visit(null, "trueMapping");
annotationVisitor1.visit(null, "falseMapping");
annotationVisitor1.visit(null, "functionMapping");
annotationVisitor1.visit(null, "mapping");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlRootElement;", true);
annotationVisitor0.visit("name", "type-mapping");
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "name", "Lorg/apache/openejb/jee/jba/cmp/Name;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "rowLockingTemplate", "Lorg/apache/openejb/jee/jba/cmp/RowLockingTemplate;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "row-locking-template");
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "pkConstraintTemplate", "Lorg/apache/openejb/jee/jba/cmp/PkConstraintTemplate;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "pk-constraint-template");
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "fkConstraintTemplate", "Lorg/apache/openejb/jee/jba/cmp/FkConstraintTemplate;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "fk-constraint-template");
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "autoIncrementTemplate", "Lorg/apache/openejb/jee/jba/cmp/AutoIncrementTemplate;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "auto-increment-template");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "addColumnTemplate", "Lorg/apache/openejb/jee/jba/cmp/AddColumnTemplate;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "add-column-template");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "alterColumnTemplate", "Lorg/apache/openejb/jee/jba/cmp/AlterColumnTemplate;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "alter-column-template");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "dropColumnTemplate", "Lorg/apache/openejb/jee/jba/cmp/DropColumnTemplate;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "drop-column-template");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "aliasHeaderPrefix", "Lorg/apache/openejb/jee/jba/cmp/AliasHeaderPrefix;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "alias-header-prefix");
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "aliasHeaderSuffix", "Lorg/apache/openejb/jee/jba/cmp/AliasHeaderSuffix;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "alias-header-suffix");
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "aliasMaxLength", "Lorg/apache/openejb/jee/jba/cmp/AliasMaxLength;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "alias-max-length");
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "subquerySupported", "Lorg/apache/openejb/jee/jba/cmp/SubquerySupported;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "subquery-supported");
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "trueMapping", "Lorg/apache/openejb/jee/jba/cmp/TrueMapping;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "true-mapping");
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "falseMapping", "Lorg/apache/openejb/jee/jba/cmp/FalseMapping;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "false-mapping");
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "functionMapping", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/openejb/jee/jba/cmp/FunctionMapping;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "function-mapping");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mapping", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/openejb/jee/jba/cmp/Mapping;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Lorg/apache/openejb/jee/jba/cmp/Name;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "name", "Lorg/apache/openejb/jee/jba/cmp/Name;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setName", "(Lorg/apache/openejb/jee/jba/cmp/Name;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "name", "Lorg/apache/openejb/jee/jba/cmp/Name;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRowLockingTemplate", "()Lorg/apache/openejb/jee/jba/cmp/RowLockingTemplate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "rowLockingTemplate", "Lorg/apache/openejb/jee/jba/cmp/RowLockingTemplate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRowLockingTemplate", "(Lorg/apache/openejb/jee/jba/cmp/RowLockingTemplate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "rowLockingTemplate", "Lorg/apache/openejb/jee/jba/cmp/RowLockingTemplate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPkConstraintTemplate", "()Lorg/apache/openejb/jee/jba/cmp/PkConstraintTemplate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "pkConstraintTemplate", "Lorg/apache/openejb/jee/jba/cmp/PkConstraintTemplate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPkConstraintTemplate", "(Lorg/apache/openejb/jee/jba/cmp/PkConstraintTemplate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "pkConstraintTemplate", "Lorg/apache/openejb/jee/jba/cmp/PkConstraintTemplate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFkConstraintTemplate", "()Lorg/apache/openejb/jee/jba/cmp/FkConstraintTemplate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "fkConstraintTemplate", "Lorg/apache/openejb/jee/jba/cmp/FkConstraintTemplate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFkConstraintTemplate", "(Lorg/apache/openejb/jee/jba/cmp/FkConstraintTemplate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "fkConstraintTemplate", "Lorg/apache/openejb/jee/jba/cmp/FkConstraintTemplate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAutoIncrementTemplate", "()Lorg/apache/openejb/jee/jba/cmp/AutoIncrementTemplate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "autoIncrementTemplate", "Lorg/apache/openejb/jee/jba/cmp/AutoIncrementTemplate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAutoIncrementTemplate", "(Lorg/apache/openejb/jee/jba/cmp/AutoIncrementTemplate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "autoIncrementTemplate", "Lorg/apache/openejb/jee/jba/cmp/AutoIncrementTemplate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAddColumnTemplate", "()Lorg/apache/openejb/jee/jba/cmp/AddColumnTemplate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "addColumnTemplate", "Lorg/apache/openejb/jee/jba/cmp/AddColumnTemplate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAddColumnTemplate", "(Lorg/apache/openejb/jee/jba/cmp/AddColumnTemplate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "addColumnTemplate", "Lorg/apache/openejb/jee/jba/cmp/AddColumnTemplate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAlterColumnTemplate", "()Lorg/apache/openejb/jee/jba/cmp/AlterColumnTemplate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "alterColumnTemplate", "Lorg/apache/openejb/jee/jba/cmp/AlterColumnTemplate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAlterColumnTemplate", "(Lorg/apache/openejb/jee/jba/cmp/AlterColumnTemplate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "alterColumnTemplate", "Lorg/apache/openejb/jee/jba/cmp/AlterColumnTemplate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDropColumnTemplate", "()Lorg/apache/openejb/jee/jba/cmp/DropColumnTemplate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "dropColumnTemplate", "Lorg/apache/openejb/jee/jba/cmp/DropColumnTemplate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDropColumnTemplate", "(Lorg/apache/openejb/jee/jba/cmp/DropColumnTemplate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "dropColumnTemplate", "Lorg/apache/openejb/jee/jba/cmp/DropColumnTemplate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAliasHeaderPrefix", "()Lorg/apache/openejb/jee/jba/cmp/AliasHeaderPrefix;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "aliasHeaderPrefix", "Lorg/apache/openejb/jee/jba/cmp/AliasHeaderPrefix;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAliasHeaderPrefix", "(Lorg/apache/openejb/jee/jba/cmp/AliasHeaderPrefix;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "aliasHeaderPrefix", "Lorg/apache/openejb/jee/jba/cmp/AliasHeaderPrefix;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAliasHeaderSuffix", "()Lorg/apache/openejb/jee/jba/cmp/AliasHeaderSuffix;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "aliasHeaderSuffix", "Lorg/apache/openejb/jee/jba/cmp/AliasHeaderSuffix;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAliasHeaderSuffix", "(Lorg/apache/openejb/jee/jba/cmp/AliasHeaderSuffix;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "aliasHeaderSuffix", "Lorg/apache/openejb/jee/jba/cmp/AliasHeaderSuffix;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAliasMaxLength", "()Lorg/apache/openejb/jee/jba/cmp/AliasMaxLength;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "aliasMaxLength", "Lorg/apache/openejb/jee/jba/cmp/AliasMaxLength;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAliasMaxLength", "(Lorg/apache/openejb/jee/jba/cmp/AliasMaxLength;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "aliasMaxLength", "Lorg/apache/openejb/jee/jba/cmp/AliasMaxLength;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSubquerySupported", "()Lorg/apache/openejb/jee/jba/cmp/SubquerySupported;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "subquerySupported", "Lorg/apache/openejb/jee/jba/cmp/SubquerySupported;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSubquerySupported", "(Lorg/apache/openejb/jee/jba/cmp/SubquerySupported;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "subquerySupported", "Lorg/apache/openejb/jee/jba/cmp/SubquerySupported;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTrueMapping", "()Lorg/apache/openejb/jee/jba/cmp/TrueMapping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "trueMapping", "Lorg/apache/openejb/jee/jba/cmp/TrueMapping;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTrueMapping", "(Lorg/apache/openejb/jee/jba/cmp/TrueMapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "trueMapping", "Lorg/apache/openejb/jee/jba/cmp/TrueMapping;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFalseMapping", "()Lorg/apache/openejb/jee/jba/cmp/FalseMapping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "falseMapping", "Lorg/apache/openejb/jee/jba/cmp/FalseMapping;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFalseMapping", "(Lorg/apache/openejb/jee/jba/cmp/FalseMapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "falseMapping", "Lorg/apache/openejb/jee/jba/cmp/FalseMapping;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFunctionMapping", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/openejb/jee/jba/cmp/FunctionMapping;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "functionMapping", "Ljava/util/List;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "functionMapping", "Ljava/util/List;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "functionMapping", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMapping", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/openejb/jee/jba/cmp/Mapping;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "mapping", "Ljava/util/List;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "mapping", "Ljava/util/List;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/TypeMapping", "mapping", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
