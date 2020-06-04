package asm.org.apache.openjpa.persistence.jdbc;
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
public class MappingTagDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openjpa/persistence/jdbc/MappingTag", "Ljava/lang/Enum<Lorg/apache/openjpa/persistence/jdbc/MappingTag;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASSOC_OVERRIDE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASSOC_OVERRIDES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ATTR_OVERRIDE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ATTR_OVERRIDES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COLLECTION_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COLUMN_NAME", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COLUMN_RESULT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DELIMITED_IDS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DISCRIM_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DISCRIM_VAL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENTITY_RESULT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENUMERATED", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FIELD_RESULT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GEN_ID_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INHERITANCE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JOIN_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAP_KEY_ENUMERATED", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ORDER_COLUMN", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PK_JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PK_JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SECONDARY_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SECONDARY_TABLES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SQL_RESULT_SET_MAPPING", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SQL_RESULT_SET_MAPPINGS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TABLE_GEN", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TEMPORAL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLASS_CRIT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONTAINER_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DATASTORE_ID_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DISCRIM_STRAT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EAGER_FETCH_MODE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ELEM_CLASS_CRIT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ELEM_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ELEM_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ELEM_EMBEDDED_MAPPING", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ELEM_FK", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ELEM_INDEX", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ELEM_JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ELEM_JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ELEM_NONPOLY", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ELEM_STRAT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EMBEDDED_MAPPING", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FK", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FK_COL_NAMES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FK_COL_NAME", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INDEX", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KEY_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KEY_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KEY_CLASS_CRIT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KEY_EMBEDDED_MAPPING", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KEY_FK", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KEY_INDEX", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KEY_JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KEY_JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KEY_NONPOLY", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KEY_STRAT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAP_KEY_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAP_KEY_JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAP_KEY_JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAP_KEY_TEMPORAL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAPPING_OVERRIDE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAPPING_OVERRIDES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NAME", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NONPOLY", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ORDER_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STRAT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SUBCLASS_FETCH_MODE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNIQUE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VERSION_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VERSION_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VERSION_STRAT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "X_EMBEDDED_MAPPING", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "X_JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "X_JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "X_MAPPING_OVERRIDE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "X_MAPPING_OVERRIDES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "X_SECONDARY_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "X_SECONDARY_TABLES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "X_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "$VALUES", "[Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openjpa/persistence/jdbc/MappingTag;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/MappingTag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/persistence/jdbc/MappingTag;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASSOC_OVERRIDE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ASSOC_OVERRIDE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASSOC_OVERRIDES");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ASSOC_OVERRIDES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ATTR_OVERRIDE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ATTR_OVERRIDE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ATTR_OVERRIDES");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ATTR_OVERRIDES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COL");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COLLECTION_TABLE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "COLLECTION_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COLUMN_NAME");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "COLUMN_NAME", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COLUMN_RESULT");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "COLUMN_RESULT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DELIMITED_IDS");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "DELIMITED_IDS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DISCRIM_COL");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "DISCRIM_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DISCRIM_VAL");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "DISCRIM_VAL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENTITY_RESULT");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ENTITY_RESULT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENUMERATED");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ENUMERATED", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FIELD_RESULT");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "FIELD_RESULT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GEN_ID_TABLE");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "GEN_ID_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INHERITANCE");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "INHERITANCE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JOIN_COL");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JOIN_COLS");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JOIN_TABLE");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "JOIN_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAP_KEY_ENUMERATED");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "MAP_KEY_ENUMERATED", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ORDER_COLUMN");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ORDER_COLUMN", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PK_JOIN_COL");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "PK_JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PK_JOIN_COLS");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "PK_JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SECONDARY_TABLE");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "SECONDARY_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SECONDARY_TABLES");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "SECONDARY_TABLES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SQL_RESULT_SET_MAPPING");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "SQL_RESULT_SET_MAPPING", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SQL_RESULT_SET_MAPPINGS");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "SQL_RESULT_SET_MAPPINGS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TABLE");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TABLE_GEN");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "TABLE_GEN", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TEMPORAL");
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "TEMPORAL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLASS_CRIT");
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "CLASS_CRIT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COLS");
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONTAINER_TABLE");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "CONTAINER_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DATASTORE_ID_COL");
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "DATASTORE_ID_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DISCRIM_STRAT");
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "DISCRIM_STRAT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EAGER_FETCH_MODE");
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "EAGER_FETCH_MODE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ELEM_CLASS_CRIT");
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_CLASS_CRIT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ELEM_COL");
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ELEM_COLS");
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ELEM_EMBEDDED_MAPPING");
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_EMBEDDED_MAPPING", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ELEM_FK");
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_FK", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ELEM_INDEX");
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_INDEX", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ELEM_JOIN_COL");
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ELEM_JOIN_COLS");
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ELEM_NONPOLY");
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_NONPOLY", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ELEM_STRAT");
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_STRAT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EMBEDDED_MAPPING");
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "EMBEDDED_MAPPING", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FK");
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "FK", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FK_COL_NAMES");
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "FK_COL_NAMES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FK_COL_NAME");
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "FK_COL_NAME", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INDEX");
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "INDEX", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KEY_COL");
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KEY_COLS");
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KEY_CLASS_CRIT");
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_CLASS_CRIT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KEY_EMBEDDED_MAPPING");
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_EMBEDDED_MAPPING", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KEY_FK");
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_FK", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KEY_INDEX");
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_INDEX", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KEY_JOIN_COL");
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KEY_JOIN_COLS");
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KEY_NONPOLY");
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_NONPOLY", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KEY_STRAT");
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_STRAT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAP_KEY_COL");
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "MAP_KEY_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAP_KEY_JOIN_COL");
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "MAP_KEY_JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAP_KEY_JOIN_COLS");
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "MAP_KEY_JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAP_KEY_TEMPORAL");
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "MAP_KEY_TEMPORAL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAPPING_OVERRIDE");
methodVisitor.visitIntInsn(BIPUSH, 65);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "MAPPING_OVERRIDE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAPPING_OVERRIDES");
methodVisitor.visitIntInsn(BIPUSH, 66);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "MAPPING_OVERRIDES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NAME");
methodVisitor.visitIntInsn(BIPUSH, 67);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "NAME", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NONPOLY");
methodVisitor.visitIntInsn(BIPUSH, 68);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "NONPOLY", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ORDER_COL");
methodVisitor.visitIntInsn(BIPUSH, 69);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ORDER_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STRAT");
methodVisitor.visitIntInsn(BIPUSH, 70);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "STRAT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUBCLASS_FETCH_MODE");
methodVisitor.visitIntInsn(BIPUSH, 71);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "SUBCLASS_FETCH_MODE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNIQUE");
methodVisitor.visitIntInsn(BIPUSH, 72);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "UNIQUE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VERSION_COL");
methodVisitor.visitIntInsn(BIPUSH, 73);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "VERSION_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VERSION_COLS");
methodVisitor.visitIntInsn(BIPUSH, 74);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "VERSION_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VERSION_STRAT");
methodVisitor.visitIntInsn(BIPUSH, 75);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "VERSION_STRAT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("X_EMBEDDED_MAPPING");
methodVisitor.visitIntInsn(BIPUSH, 76);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "X_EMBEDDED_MAPPING", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("X_JOIN_COL");
methodVisitor.visitIntInsn(BIPUSH, 77);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "X_JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("X_JOIN_COLS");
methodVisitor.visitIntInsn(BIPUSH, 78);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "X_JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("X_MAPPING_OVERRIDE");
methodVisitor.visitIntInsn(BIPUSH, 79);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "X_MAPPING_OVERRIDE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("X_MAPPING_OVERRIDES");
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "X_MAPPING_OVERRIDES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("X_SECONDARY_TABLE");
methodVisitor.visitIntInsn(BIPUSH, 81);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "X_SECONDARY_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("X_SECONDARY_TABLES");
methodVisitor.visitIntInsn(BIPUSH, 82);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "X_SECONDARY_TABLES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("X_TABLE");
methodVisitor.visitIntInsn(BIPUSH, 83);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/MappingTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "X_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitIntInsn(BIPUSH, 84);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/jdbc/MappingTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ASSOC_OVERRIDE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ASSOC_OVERRIDES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ATTR_OVERRIDE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ATTR_OVERRIDES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "COLLECTION_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "COLUMN_NAME", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "COLUMN_RESULT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "DELIMITED_IDS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "DISCRIM_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "DISCRIM_VAL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ENTITY_RESULT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ENUMERATED", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "FIELD_RESULT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "GEN_ID_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "INHERITANCE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "JOIN_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "MAP_KEY_ENUMERATED", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ORDER_COLUMN", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "PK_JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "PK_JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "SECONDARY_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "SECONDARY_TABLES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "SQL_RESULT_SET_MAPPING", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "SQL_RESULT_SET_MAPPINGS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "TABLE_GEN", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "TEMPORAL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "CLASS_CRIT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "CONTAINER_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "DATASTORE_ID_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "DISCRIM_STRAT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "EAGER_FETCH_MODE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_CLASS_CRIT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_EMBEDDED_MAPPING", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_FK", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_INDEX", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_NONPOLY", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ELEM_STRAT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "EMBEDDED_MAPPING", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "FK", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "FK_COL_NAMES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "FK_COL_NAME", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "INDEX", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_CLASS_CRIT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_EMBEDDED_MAPPING", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_FK", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_INDEX", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_NONPOLY", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "KEY_STRAT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "MAP_KEY_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "MAP_KEY_JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "MAP_KEY_JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "MAP_KEY_TEMPORAL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 65);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "MAPPING_OVERRIDE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 66);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "MAPPING_OVERRIDES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 67);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "NAME", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 68);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "NONPOLY", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 69);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "ORDER_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 70);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "STRAT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 71);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "SUBCLASS_FETCH_MODE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 72);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "UNIQUE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 73);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "VERSION_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 74);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "VERSION_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 75);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "VERSION_STRAT", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 76);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "X_EMBEDDED_MAPPING", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 77);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "X_JOIN_COL", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 78);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "X_JOIN_COLS", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 79);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "X_MAPPING_OVERRIDE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "X_MAPPING_OVERRIDES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 81);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "X_SECONDARY_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 82);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "X_SECONDARY_TABLES", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 83);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "X_TABLE", "Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/MappingTag", "$VALUES", "[Lorg/apache/openjpa/persistence/jdbc/MappingTag;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
