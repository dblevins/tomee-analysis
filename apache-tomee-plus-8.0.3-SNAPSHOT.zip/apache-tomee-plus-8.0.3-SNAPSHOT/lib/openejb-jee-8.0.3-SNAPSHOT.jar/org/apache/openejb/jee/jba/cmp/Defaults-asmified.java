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
public class DefaultsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/jee/jba/cmp/Defaults", null, "java/lang/Object", null);

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
annotationVisitor1.visit(null, "datasource");
annotationVisitor1.visit(null, "datasourceMapping");
annotationVisitor1.visit(null, "createTable");
annotationVisitor1.visit(null, "alterTable");
annotationVisitor1.visit(null, "removeTable");
annotationVisitor1.visit(null, "postTableCreate");
annotationVisitor1.visit(null, "readOnly");
annotationVisitor1.visit(null, "readTimeOut");
annotationVisitor1.visit(null, "rowLocking");
annotationVisitor1.visit(null, "pkConstraint");
annotationVisitor1.visit(null, "fkConstraint");
annotationVisitor1.visit(null, "preferredRelationMapping");
annotationVisitor1.visit(null, "readAhead");
annotationVisitor1.visit(null, "listCacheMax");
annotationVisitor1.visit(null, "cleanReadAheadOnLoad");
annotationVisitor1.visit(null, "fetchSize");
annotationVisitor1.visit(null, "unknownPk");
annotationVisitor1.visit(null, "entityCommand");
annotationVisitor1.visit(null, "qlCompiler");
annotationVisitor1.visit(null, "throwRuntimeExceptions");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlRootElement;", true);
annotationVisitor0.visit("name", "defaults");
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "datasource", "Lorg/apache/openejb/jee/jba/cmp/Datasource;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "datasourceMapping", "Lorg/apache/openejb/jee/jba/cmp/DatasourceMapping;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "datasource-mapping");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "createTable", "Lorg/apache/openejb/jee/jba/cmp/CreateTable;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "create-table");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "alterTable", "Lorg/apache/openejb/jee/jba/cmp/AlterTable;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "alter-table");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "removeTable", "Lorg/apache/openejb/jee/jba/cmp/RemoveTable;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "remove-table");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "postTableCreate", "Lorg/apache/openejb/jee/jba/cmp/PostTableCreate;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "post-table-create");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "readOnly", "Lorg/apache/openejb/jee/jba/cmp/ReadOnly;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "read-only");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "readTimeOut", "Lorg/apache/openejb/jee/jba/cmp/ReadTimeOut;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "read-time-out");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "rowLocking", "Lorg/apache/openejb/jee/jba/cmp/RowLocking;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "row-locking");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "pkConstraint", "Lorg/apache/openejb/jee/jba/cmp/PkConstraint;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "pk-constraint");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "fkConstraint", "Lorg/apache/openejb/jee/jba/cmp/FkConstraint;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "fk-constraint");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "preferredRelationMapping", "Lorg/apache/openejb/jee/jba/cmp/PreferredRelationMapping;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "preferred-relation-mapping");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "readAhead", "Lorg/apache/openejb/jee/jba/cmp/ReadAhead;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "read-ahead");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "listCacheMax", "Lorg/apache/openejb/jee/jba/cmp/ListCacheMax;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "list-cache-max");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "cleanReadAheadOnLoad", "Lorg/apache/openejb/jee/jba/cmp/CleanReadAheadOnLoad;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "clean-read-ahead-on-load");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "fetchSize", "Lorg/apache/openejb/jee/jba/cmp/FetchSize;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "fetch-size");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "unknownPk", "Lorg/apache/openejb/jee/jba/cmp/UnknownPk;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "unknown-pk");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "entityCommand", "Lorg/apache/openejb/jee/jba/cmp/EntityCommand;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "entity-command");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "qlCompiler", "Lorg/apache/openejb/jee/jba/cmp/QlCompiler;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "ql-compiler");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "throwRuntimeExceptions", "Lorg/apache/openejb/jee/jba/cmp/ThrowRuntimeExceptions;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "throw-runtime-exceptions");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDatasource", "()Lorg/apache/openejb/jee/jba/cmp/Datasource;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "datasource", "Lorg/apache/openejb/jee/jba/cmp/Datasource;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDatasource", "(Lorg/apache/openejb/jee/jba/cmp/Datasource;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "datasource", "Lorg/apache/openejb/jee/jba/cmp/Datasource;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDatasourceMapping", "()Lorg/apache/openejb/jee/jba/cmp/DatasourceMapping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "datasourceMapping", "Lorg/apache/openejb/jee/jba/cmp/DatasourceMapping;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDatasourceMapping", "(Lorg/apache/openejb/jee/jba/cmp/DatasourceMapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "datasourceMapping", "Lorg/apache/openejb/jee/jba/cmp/DatasourceMapping;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCreateTable", "()Lorg/apache/openejb/jee/jba/cmp/CreateTable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "createTable", "Lorg/apache/openejb/jee/jba/cmp/CreateTable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCreateTable", "(Lorg/apache/openejb/jee/jba/cmp/CreateTable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "createTable", "Lorg/apache/openejb/jee/jba/cmp/CreateTable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAlterTable", "()Lorg/apache/openejb/jee/jba/cmp/AlterTable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "alterTable", "Lorg/apache/openejb/jee/jba/cmp/AlterTable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAlterTable", "(Lorg/apache/openejb/jee/jba/cmp/AlterTable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "alterTable", "Lorg/apache/openejb/jee/jba/cmp/AlterTable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRemoveTable", "()Lorg/apache/openejb/jee/jba/cmp/RemoveTable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "removeTable", "Lorg/apache/openejb/jee/jba/cmp/RemoveTable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRemoveTable", "(Lorg/apache/openejb/jee/jba/cmp/RemoveTable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "removeTable", "Lorg/apache/openejb/jee/jba/cmp/RemoveTable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPostTableCreate", "()Lorg/apache/openejb/jee/jba/cmp/PostTableCreate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "postTableCreate", "Lorg/apache/openejb/jee/jba/cmp/PostTableCreate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPostTableCreate", "(Lorg/apache/openejb/jee/jba/cmp/PostTableCreate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "postTableCreate", "Lorg/apache/openejb/jee/jba/cmp/PostTableCreate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReadOnly", "()Lorg/apache/openejb/jee/jba/cmp/ReadOnly;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "readOnly", "Lorg/apache/openejb/jee/jba/cmp/ReadOnly;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReadOnly", "(Lorg/apache/openejb/jee/jba/cmp/ReadOnly;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "readOnly", "Lorg/apache/openejb/jee/jba/cmp/ReadOnly;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReadTimeOut", "()Lorg/apache/openejb/jee/jba/cmp/ReadTimeOut;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "readTimeOut", "Lorg/apache/openejb/jee/jba/cmp/ReadTimeOut;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReadTimeOut", "(Lorg/apache/openejb/jee/jba/cmp/ReadTimeOut;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "readTimeOut", "Lorg/apache/openejb/jee/jba/cmp/ReadTimeOut;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRowLocking", "()Lorg/apache/openejb/jee/jba/cmp/RowLocking;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "rowLocking", "Lorg/apache/openejb/jee/jba/cmp/RowLocking;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRowLocking", "(Lorg/apache/openejb/jee/jba/cmp/RowLocking;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "rowLocking", "Lorg/apache/openejb/jee/jba/cmp/RowLocking;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPkConstraint", "()Lorg/apache/openejb/jee/jba/cmp/PkConstraint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "pkConstraint", "Lorg/apache/openejb/jee/jba/cmp/PkConstraint;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPkConstraint", "(Lorg/apache/openejb/jee/jba/cmp/PkConstraint;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "pkConstraint", "Lorg/apache/openejb/jee/jba/cmp/PkConstraint;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFkConstraint", "()Lorg/apache/openejb/jee/jba/cmp/FkConstraint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "fkConstraint", "Lorg/apache/openejb/jee/jba/cmp/FkConstraint;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFkConstraint", "(Lorg/apache/openejb/jee/jba/cmp/FkConstraint;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "fkConstraint", "Lorg/apache/openejb/jee/jba/cmp/FkConstraint;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPreferredRelationMapping", "()Lorg/apache/openejb/jee/jba/cmp/PreferredRelationMapping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "preferredRelationMapping", "Lorg/apache/openejb/jee/jba/cmp/PreferredRelationMapping;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPreferredRelationMapping", "(Lorg/apache/openejb/jee/jba/cmp/PreferredRelationMapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "preferredRelationMapping", "Lorg/apache/openejb/jee/jba/cmp/PreferredRelationMapping;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReadAhead", "()Lorg/apache/openejb/jee/jba/cmp/ReadAhead;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "readAhead", "Lorg/apache/openejb/jee/jba/cmp/ReadAhead;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReadAhead", "(Lorg/apache/openejb/jee/jba/cmp/ReadAhead;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "readAhead", "Lorg/apache/openejb/jee/jba/cmp/ReadAhead;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getListCacheMax", "()Lorg/apache/openejb/jee/jba/cmp/ListCacheMax;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "listCacheMax", "Lorg/apache/openejb/jee/jba/cmp/ListCacheMax;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setListCacheMax", "(Lorg/apache/openejb/jee/jba/cmp/ListCacheMax;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "listCacheMax", "Lorg/apache/openejb/jee/jba/cmp/ListCacheMax;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCleanReadAheadOnLoad", "()Lorg/apache/openejb/jee/jba/cmp/CleanReadAheadOnLoad;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "cleanReadAheadOnLoad", "Lorg/apache/openejb/jee/jba/cmp/CleanReadAheadOnLoad;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCleanReadAheadOnLoad", "(Lorg/apache/openejb/jee/jba/cmp/CleanReadAheadOnLoad;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "cleanReadAheadOnLoad", "Lorg/apache/openejb/jee/jba/cmp/CleanReadAheadOnLoad;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFetchSize", "()Lorg/apache/openejb/jee/jba/cmp/FetchSize;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "fetchSize", "Lorg/apache/openejb/jee/jba/cmp/FetchSize;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFetchSize", "(Lorg/apache/openejb/jee/jba/cmp/FetchSize;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "fetchSize", "Lorg/apache/openejb/jee/jba/cmp/FetchSize;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUnknownPk", "()Lorg/apache/openejb/jee/jba/cmp/UnknownPk;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "unknownPk", "Lorg/apache/openejb/jee/jba/cmp/UnknownPk;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUnknownPk", "(Lorg/apache/openejb/jee/jba/cmp/UnknownPk;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "unknownPk", "Lorg/apache/openejb/jee/jba/cmp/UnknownPk;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntityCommand", "()Lorg/apache/openejb/jee/jba/cmp/EntityCommand;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "entityCommand", "Lorg/apache/openejb/jee/jba/cmp/EntityCommand;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEntityCommand", "(Lorg/apache/openejb/jee/jba/cmp/EntityCommand;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "entityCommand", "Lorg/apache/openejb/jee/jba/cmp/EntityCommand;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQlCompiler", "()Lorg/apache/openejb/jee/jba/cmp/QlCompiler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "qlCompiler", "Lorg/apache/openejb/jee/jba/cmp/QlCompiler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setQlCompiler", "(Lorg/apache/openejb/jee/jba/cmp/QlCompiler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "qlCompiler", "Lorg/apache/openejb/jee/jba/cmp/QlCompiler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getThrowRuntimeExceptions", "()Lorg/apache/openejb/jee/jba/cmp/ThrowRuntimeExceptions;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "throwRuntimeExceptions", "Lorg/apache/openejb/jee/jba/cmp/ThrowRuntimeExceptions;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setThrowRuntimeExceptions", "(Lorg/apache/openejb/jee/jba/cmp/ThrowRuntimeExceptions;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/jba/cmp/Defaults", "throwRuntimeExceptions", "Lorg/apache/openejb/jee/jba/cmp/ThrowRuntimeExceptions;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
