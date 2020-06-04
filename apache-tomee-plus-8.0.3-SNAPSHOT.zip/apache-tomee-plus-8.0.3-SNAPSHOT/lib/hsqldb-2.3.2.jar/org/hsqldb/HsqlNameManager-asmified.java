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
public class HsqlNameManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/hsqldb/HsqlNameManager", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/hsqldb/HsqlNameManager$1", "org/hsqldb/HsqlNameManager", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/hsqldb/HsqlNameManager$HsqlName", "org/hsqldb/HsqlNameManager", "HsqlName", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/hsqldb/HsqlNameManager$SimpleName", "org/hsqldb/HsqlNameManager", "SimpleName", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "staticManager", "Lorg/hsqldb/HsqlNameManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "autoColumnNames", "[Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "autoNoNameColumnNames", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "serialNumber", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sysNumber", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "catalogName", "Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sqlRegularNames", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "subqueryTableName", "Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager", "serialNumber", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 10000);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager", "sysNumber", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager", "sqlRegularNames", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/hsqldb/Database;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager", "serialNumber", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 10000);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager", "sysNumber", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("PUBLIC");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$HsqlName", "<init>", "(Lorg/hsqldb/HsqlNameManager;Ljava/lang/String;IZLorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager", "catalogName", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Database", "sqlRegularNames", "Z");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager", "sqlRegularNames", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SYSTEM_SUBQUERY");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$HsqlName", "<init>", "(Lorg/hsqldb/HsqlNameManager;Ljava/lang/String;ZILorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager", "subqueryTableName", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager", "subqueryTableName", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/SqlInvariants", "SYSTEM_SCHEMA_HSQLNAME", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCatalogName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager", "catalogName", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSqlRegularNames", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager", "sqlRegularNames", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newSystemObjectName", "(Ljava/lang/String;I)Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "staticManager", "Lorg/hsqldb/HsqlNameManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$HsqlName", "<init>", "(Lorg/hsqldb/HsqlNameManager;Ljava/lang/String;IZLorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newInfoSchemaColumnName", "(Ljava/lang/String;Lorg/hsqldb/HsqlNameManager$HsqlName;)Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "staticManager", "Lorg/hsqldb/HsqlNameManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$HsqlName", "<init>", "(Lorg/hsqldb/HsqlNameManager;Ljava/lang/String;ZILorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/SqlInvariants", "INFORMATION_SCHEMA_HSQLNAME", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "parent", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newInfoSchemaTableName", "(Ljava/lang/String;)Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "staticManager", "Lorg/hsqldb/HsqlNameManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$HsqlName", "<init>", "(Lorg/hsqldb/HsqlNameManager;Ljava/lang/String;IZLorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/SqlInvariants", "INFORMATION_SCHEMA_HSQLNAME", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newInfoSchemaObjectName", "(Ljava/lang/String;ZI)Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "staticManager", "Lorg/hsqldb/HsqlNameManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$HsqlName", "<init>", "(Lorg/hsqldb/HsqlNameManager;Ljava/lang/String;IZLorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/SqlInvariants", "INFORMATION_SCHEMA_HSQLNAME", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newHsqlName", "(Lorg/hsqldb/HsqlNameManager$HsqlName;Ljava/lang/String;I)Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$HsqlName", "<init>", "(Lorg/hsqldb/HsqlNameManager;Ljava/lang/String;IZLorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newHsqlName", "(Ljava/lang/String;ZI)Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$HsqlName", "<init>", "(Lorg/hsqldb/HsqlNameManager;Ljava/lang/String;ZILorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newHsqlName", "(Lorg/hsqldb/HsqlNameManager$HsqlName;Ljava/lang/String;ZI)Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$HsqlName", "<init>", "(Lorg/hsqldb/HsqlNameManager;Ljava/lang/String;ZILorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newHsqlName", "(Lorg/hsqldb/HsqlNameManager$HsqlName;Ljava/lang/String;ZILorg/hsqldb/HsqlNameManager$HsqlName;)Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$HsqlName", "<init>", "(Lorg/hsqldb/HsqlNameManager;Ljava/lang/String;ZILorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "parent", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newColumnSchemaHsqlName", "(Lorg/hsqldb/HsqlNameManager$HsqlName;Lorg/hsqldb/HsqlNameManager$SimpleName;)Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$SimpleName", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$SimpleName", "isNameQuoted", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/HsqlNameManager", "newColumnHsqlName", "(Lorg/hsqldb/HsqlNameManager$HsqlName;Ljava/lang/String;Z)Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newColumnHsqlName", "(Lorg/hsqldb/HsqlNameManager$HsqlName;Ljava/lang/String;Z)Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$HsqlName", "<init>", "(Lorg/hsqldb/HsqlNameManager;Ljava/lang/String;ZILorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "parent", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSubqueryTableName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager", "subqueryTableName", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newAutoName", "(Ljava/lang/String;Lorg/hsqldb/HsqlNameManager$HsqlName;Lorg/hsqldb/HsqlNameManager$HsqlName;I)Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/HsqlNameManager", "newAutoName", "(Ljava/lang/String;Ljava/lang/String;Lorg/hsqldb/HsqlNameManager$HsqlName;Lorg/hsqldb/HsqlNameManager$HsqlName;I)Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newSpecificRoutineName", "(Lorg/hsqldb/HsqlNameManager$HsqlName;)Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitIntInsn(BIPUSH, 95);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager", "sysNumber", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager", "sysNumber", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(I)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "isNameQuoted", "Z");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$HsqlName", "<init>", "(Lorg/hsqldb/HsqlNameManager;Ljava/lang/String;IZLorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "parent", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getColumnName", "(Lorg/hsqldb/HsqlNameManager$SimpleName;)Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "staticManager", "Lorg/hsqldb/HsqlNameManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$SimpleName", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$SimpleName", "isNameQuoted", "Z");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$HsqlName", "<init>", "(Lorg/hsqldb/HsqlNameManager;Ljava/lang/String;ZILorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getAutoColumnName", "(I)Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "autoColumnNames", "[Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "autoColumnNames", "[Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "staticManager", "Lorg/hsqldb/HsqlNameManager;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("C_");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$HsqlName", "<init>", "(Lorg/hsqldb/HsqlNameManager;Ljava/lang/String;IZLorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getAutoColumnNameString", "(I)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "autoColumnNames", "[Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "autoColumnNames", "[Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("C");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getAutoNoNameColumnString", "(I)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "autoColumnNames", "[Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "autoNoNameColumnNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getAutoSavepointNameString", "(JI)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("S");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(J)Ljava/lang/StringBuffer;", false);
methodVisitor.visitIntInsn(BIPUSH, 95);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(I)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newAutoName", "(Ljava/lang/String;Ljava/lang/String;Lorg/hsqldb/HsqlNameManager$HsqlName;Lorg/hsqldb/HsqlNameManager$HsqlName;I)Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("SYS_");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 95);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 95);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/StringBuffer"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager", "sysNumber", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager", "sysNumber", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(I)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$HsqlName", "<init>", "(Lorg/hsqldb/HsqlNameManager;Ljava/lang/String;IZLorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "parent", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getSimpleName", "(Ljava/lang/String;Z)Lorg/hsqldb/HsqlNameManager$SimpleName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$SimpleName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$SimpleName", "<init>", "(Ljava/lang/String;ZLorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$408", "(Lorg/hsqldb/HsqlNameManager;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager", "serialNumber", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager", "serialNumber", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lorg/hsqldb/HsqlNameManager;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager", "sqlRegularNames", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lorg/hsqldb/HsqlNameManager;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager", "sysNumber", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$602", "(Lorg/hsqldb/HsqlNameManager;I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager", "sysNumber", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/HsqlNameManager", "staticManager", "Lorg/hsqldb/HsqlNameManager;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "staticManager", "Lorg/hsqldb/HsqlNameManager;");
methodVisitor.visitLdcInsn(new Integer(-2147483648));
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/HsqlNameManager", "serialNumber", "I");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/HsqlNameManager", "autoColumnNames", "[Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/HsqlNameManager", "autoNoNameColumnNames", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 0);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "autoColumnNames", "[Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "autoColumnNames", "[Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "staticManager", "Lorg/hsqldb/HsqlNameManager;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("C");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/HsqlNameManager$HsqlName", "<init>", "(Lorg/hsqldb/HsqlNameManager;Ljava/lang/String;IZLorg/hsqldb/HsqlNameManager$1;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/HsqlNameManager", "autoNoNameColumnNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(0, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
