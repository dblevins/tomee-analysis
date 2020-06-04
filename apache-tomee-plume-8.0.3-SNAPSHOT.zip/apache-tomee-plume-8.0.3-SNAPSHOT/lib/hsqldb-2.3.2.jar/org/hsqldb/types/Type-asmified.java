package asm.org.hsqldb.types;
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
public class TypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/hsqldb/types/Type", null, "java/lang/Object", new String[] { "org/hsqldb/SchemaObject", "java/lang/Cloneable" });

classWriter.visitInnerClass("org/hsqldb/types/Type$TypedComparator", "org/hsqldb/types/Type", "TypedComparator", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/hsqldb/HsqlNameManager$HsqlName", "org/hsqldb/HsqlNameManager", "HsqlName", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "emptyArray", "[Lorg/hsqldb/types/Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "typeComparisonGroup", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "typeDataGroup", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "typeCode", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "precision", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "scale", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_ALL_TYPES", "Lorg/hsqldb/types/Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_CHAR", "Lorg/hsqldb/types/CharacterType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_CHAR_16", "Lorg/hsqldb/types/CharacterType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_CHAR_DEFAULT", "Lorg/hsqldb/types/CharacterType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_VARCHAR", "Lorg/hsqldb/types/CharacterType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_VARCHAR_DEFAULT", "Lorg/hsqldb/types/CharacterType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_CLOB", "Lorg/hsqldb/types/ClobType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_BIT", "Lorg/hsqldb/types/BitType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_BIT_VARYING", "Lorg/hsqldb/types/BitType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_BIT_VARYING_MAX_LENGTH", "Lorg/hsqldb/types/BitType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_BINARY", "Lorg/hsqldb/types/BinaryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_BINARY_16", "Lorg/hsqldb/types/BinaryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_BINARY_DEFAULT", "Lorg/hsqldb/types/BinaryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_VARBINARY", "Lorg/hsqldb/types/BinaryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_VARBINARY_DEFAULT", "Lorg/hsqldb/types/BinaryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_BLOB", "Lorg/hsqldb/types/BlobType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OTHER", "Lorg/hsqldb/types/OtherType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_BOOLEAN", "Lorg/hsqldb/types/BooleanType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_NUMERIC", "Lorg/hsqldb/types/NumberType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_DECIMAL", "Lorg/hsqldb/types/NumberType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_DECIMAL_DEFAULT", "Lorg/hsqldb/types/NumberType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_DECIMAL_BIGINT_SQR", "Lorg/hsqldb/types/NumberType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_DOUBLE", "Lorg/hsqldb/types/NumberType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TINYINT", "Lorg/hsqldb/types/NumberType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_SMALLINT", "Lorg/hsqldb/types/NumberType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTEGER", "Lorg/hsqldb/types/NumberType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_BIGINT", "Lorg/hsqldb/types/NumberType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_DATE", "Lorg/hsqldb/types/DateTimeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_TIME", "Lorg/hsqldb/types/DateTimeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_TIME_WITH_TIME_ZONE", "Lorg/hsqldb/types/DateTimeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_TIMESTAMP", "Lorg/hsqldb/types/DateTimeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_TIMESTAMP_WITH_TIME_ZONE", "Lorg/hsqldb/types/DateTimeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_TIMESTAMP_NO_FRACTION", "Lorg/hsqldb/types/DateTimeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_YEAR", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_MONTH", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_DAY", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_HOUR", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_MINUTE", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_SECOND", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_SECOND_MAX_FRACTION", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_YEAR_TO_MONTH", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_DAY_TO_HOUR", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_DAY_TO_MINUTE", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_DAY_TO_SECOND", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_HOUR_TO_MINUTE", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_HOUR_TO_SECOND", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_MINUTE_TO_SECOND", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_YEAR_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_MONTH_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_DAY_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_HOUR_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_MINUTE_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_SECOND_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_SECOND_MAX_FRACTION_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_YEAR_TO_MONTH_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_INTERVAL_DAY_TO_SECOND_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_ARRAY_ALL_TYPES", "Lorg/hsqldb/types/ArrayType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "typeAliases", "Lorg/hsqldb/lib/IntValueHashMap;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(IIJI)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/types/Type", "typeComparisonGroup", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/types/Type", "typeCode", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/types/Type", "scale", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitIntInsn(BIPUSH, 12);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/hsqldb/types/Type", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.LONG, Opcodes.INTEGER}, 1, new Object[] {"org/hsqldb/types/Type"});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/hsqldb/types/Type", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.LONG, Opcodes.INTEGER}, 2, new Object[] {"org/hsqldb/types/Type", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/types/Type", "typeDataGroup", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getType", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/UserTypeModifier", "getType", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/UserTypeModifier", "getName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getCatalogName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/UserTypeModifier", "getSchemaName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "schema", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getSchemaName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/UserTypeModifier", "getSchemaName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getOwner", "()Lorg/hsqldb/rights/Grantee;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/UserTypeModifier", "getOwner", "()Lorg/hsqldb/rights/Grantee;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getReferences", "()Lorg/hsqldb/lib/OrderedHashSet;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/UserTypeModifier", "getReferences", "()Lorg/hsqldb/lib/OrderedHashSet;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getComponents", "()Lorg/hsqldb/lib/OrderedHashSet;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/UserTypeModifier", "getComponents", "()Lorg/hsqldb/lib/OrderedHashSet;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "compile", "(Lorg/hsqldb/Session;Lorg/hsqldb/SchemaObject;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/UserTypeModifier", "compile", "(Lorg/hsqldb/Session;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSQL", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/UserTypeModifier", "getSQL", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getChangeTimestamp", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "duplicate", "()Lorg/hsqldb/types/Type;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/CloneNotSupportedException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/types/Type");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/CloneNotSupportedException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "displaySize", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJDBCTypeCode", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJDBCClassName", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJDBCClass", "()Ljava/lang/Class;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJDBCScale", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "scale", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJDBCPrecision", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitLdcInsn(new Long(2147483647L));
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitLdcInsn(new Integer(2147483647));
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitInsn(L2I);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSQLGenericTypeCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNameString", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFullNameString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "getNameString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDefinition", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCollation", "()Lorg/hsqldb/types/Collation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCharacterSet", "()Lorg/hsqldb/types/Charset;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getTypeDefinition", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "getDefinition", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "getName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/HsqlNameManager$HsqlName", "getSchemaQualifiedStatementName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "compare", "(Lorg/hsqldb/Session;Ljava/lang/Object;Ljava/lang/Object;)I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compare", "(Lorg/hsqldb/Session;Ljava/lang/Object;Ljava/lang/Object;I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "compare", "(Lorg/hsqldb/Session;Ljava/lang/Object;Ljava/lang/Object;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compare", "(Lorg/hsqldb/Session;Ljava/lang/Object;Ljava/lang/Object;Lorg/hsqldb/SortAndSlice;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SortAndSlice", "sortNullsLast", "[Z");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BALOAD);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SortAndSlice", "sortNullsLast", "[Z");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BALOAD);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitInsn(ICONST_M1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "compare", "(Lorg/hsqldb/Session;Ljava/lang/Object;Ljava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SortAndSlice", "sortDescending", "[Z");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BALOAD);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(INEG);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "convertToTypeLimits", "(Lorg/hsqldb/SessionInterface;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "castToType", "(Lorg/hsqldb/SessionInterface;Ljava/lang/Object;Lorg/hsqldb/types/Type;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "convertToType", "(Lorg/hsqldb/SessionInterface;Ljava/lang/Object;Lorg/hsqldb/types/Type;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "convertToType", "(Lorg/hsqldb/SessionInterface;Ljava/lang/Object;Lorg/hsqldb/types/Type;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "convertToTypeJDBC", "(Lorg/hsqldb/SessionInterface;Ljava/lang/Object;Lorg/hsqldb/types/Type;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "isLobType", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitIntInsn(SIPUSH, 5561);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "error", "(I)Lorg/hsqldb/HsqlException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "convertToType", "(Lorg/hsqldb/SessionInterface;Ljava/lang/Object;Lorg/hsqldb/types/Type;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "convertJavaToSQL", "(Lorg/hsqldb/SessionInterface;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "convertSQLToJava", "(Lorg/hsqldb/SessionInterface;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "convertToDefaultType", "(Lorg/hsqldb/SessionInterface;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "convertToString", "(Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "convertToSQLString", "(Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "canConvertFrom", "(Lorg/hsqldb/types/Type;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "canMoveFrom", "(Lorg/hsqldb/types/Type;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "canBeAssignedFrom", "(Lorg/hsqldb/types/Type;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeComparisonGroup", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeComparisonGroup", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "arrayLimitCardinality", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "collectionBaseType", "()Lorg/hsqldb/types/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isArrayType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isMultisetType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isRowType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isStructuredType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isCharacterType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNumberType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isIntegralType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isExactNumberType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDecimalType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDateTimeType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDateTimeTypeWithZone", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDateOrTimestampType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isIntervalType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isBinaryType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isBooleanType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isLobType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isBitType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isObjectType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDistinctType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/UserTypeModifier", "schemaObjectType", "I");
methodVisitor.visitIntInsn(BIPUSH, 12);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDomainType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/UserTypeModifier", "schemaObjectType", "I");
methodVisitor.visitIntInsn(BIPUSH, 13);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "acceptsPrecision", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "requiresPrecision", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxPrecision", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxScale", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrecisionRadix", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "acceptsFractionalPrecision", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "acceptsScale", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "precedenceDegree", "(Lorg/hsqldb/types/Type;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
methodVisitor.visitIntInsn(BIPUSH, 50);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "collectionBaseType", "()Lorg/hsqldb/types/Type;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "collectionBaseType", "()Lorg/hsqldb/types/Type;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "precedenceDegree", "(Lorg/hsqldb/types/Type;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(new Integer(-2147483648));
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAggregateType", "(Lorg/hsqldb/types/Type;)Lorg/hsqldb/types/Type;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCombinedType", "(Lorg/hsqldb/Session;Lorg/hsqldb/types/Type;I)Lorg/hsqldb/types/Type;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compareToTypeRange", "(Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "absolute", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "negate", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Lorg/hsqldb/Session;Ljava/lang/Object;Ljava/lang/Object;Lorg/hsqldb/types/Type;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "subtract", "(Lorg/hsqldb/Session;Ljava/lang/Object;Ljava/lang/Object;Lorg/hsqldb/types/Type;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "multiply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "divide", "(Lorg/hsqldb/Session;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "concat", "(Lorg/hsqldb/Session;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cardinality", "(Lorg/hsqldb/Session;Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "hashCode", "(Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/hsqldb/types/Type");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/types/Type");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
methodVisitor.visitIntInsn(BIPUSH, 50);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/types/Type");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
methodVisitor.visitIntInsn(BIPUSH, 19);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/types/Type");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/types/Type");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/types/Type");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "scale", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "scale", "I");
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/types/Type");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitInsn(ICONST_1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(IADD);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "scale", "I");
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newComparator", "(Lorg/hsqldb/Session;)Lorg/hsqldb/types/Type$TypedComparator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/Type$TypedComparator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/Type$TypedComparator", "<init>", "(Lorg/hsqldb/Session;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDefaultArrayType", "(I)Lorg/hsqldb/types/ArrayType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/ArrayType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/Type", "getDefaultType", "(I)Lorg/hsqldb/types/Type;", false);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/ArrayType", "<init>", "(Lorg/hsqldb/types/Type;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDefaultType", "(I)Lorg/hsqldb/types/Type;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_VARCHAR", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/CharacterType", "getCharacterSet", "()Lorg/hsqldb/types/Charset;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_VARCHAR", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/CharacterType", "getCollation", "()Lorg/hsqldb/types/Collation;", false);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/Type", "getType", "(ILorg/hsqldb/types/Charset;Lorg/hsqldb/types/Collation;JI)Lorg/hsqldb/types/Type;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDefaultTypeWithSize", "(I)Lorg/hsqldb/types/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
Label label16 = new Label();
Label label17 = new Label();
Label label18 = new Label();
Label label19 = new Label();
Label label20 = new Label();
Label label21 = new Label();
Label label22 = new Label();
Label label23 = new Label();
Label label24 = new Label();
Label label25 = new Label();
Label label26 = new Label();
Label label27 = new Label();
Label label28 = new Label();
Label label29 = new Label();
Label label30 = new Label();
Label label31 = new Label();
Label label32 = new Label();
Label label33 = new Label();
Label label34 = new Label();
Label label35 = new Label();
Label label36 = new Label();
Label label37 = new Label();
methodVisitor.visitLookupSwitchInsn(label37, new int[] { -6, 0, 1, 2, 3, 4, 5, 6, 7, 8, 12, 14, 15, 16, 25, 30, 40, 50, 60, 61, 91, 92, 93, 94, 95, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 1111 }, new Label[] { label0, label1, label2, label3, label4, label5, label6, label7, label7, label7, label8, label9, label10, label11, label12, label13, label14, label15, label16, label17, label18, label19, label20, label21, label22, label23, label24, label25, label26, label27, label28, label29, label30, label31, label32, label33, label34, label35, label36 });
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_ALL_TYPES", "Lorg/hsqldb/types/Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_ARRAY_ALL_TYPES", "Lorg/hsqldb/types/ArrayType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_CHAR_DEFAULT", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_VARCHAR_DEFAULT", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_CLOB", "Lorg/hsqldb/types/ClobType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTEGER", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_SMALLINT", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BIGINT", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "TINYINT", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_DOUBLE", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_NUMERIC", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_DECIMAL", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BOOLEAN", "Lorg/hsqldb/types/BooleanType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BINARY_DEFAULT", "Lorg/hsqldb/types/BinaryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_VARBINARY_DEFAULT", "Lorg/hsqldb/types/BinaryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BLOB", "Lorg/hsqldb/types/BlobType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BIT", "Lorg/hsqldb/types/BitType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BIT_VARYING", "Lorg/hsqldb/types/BitType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_DATE", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_TIME", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_TIME_WITH_TIME_ZONE", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_TIMESTAMP", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_TIMESTAMP_WITH_TIME_ZONE", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_YEAR", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label29);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_YEAR_TO_MONTH", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_MONTH", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label25);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_DAY", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label30);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_DAY_TO_HOUR", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label31);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_DAY_TO_MINUTE", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label32);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_DAY_TO_SECOND", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label26);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_HOUR", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label33);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_HOUR_TO_MINUTE", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label34);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_HOUR_TO_SECOND", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label27);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_MINUTE", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label35);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_MINUTE_TO_SECOND", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label28);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_SECOND", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label36);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "OTHER", "Lorg/hsqldb/types/OtherType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label37);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getHSQLDBTypeCode", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitLookupSwitchInsn(label8, new int[] { -7, -5, -4, -3, -2, -1, 2003, 2004, 2005 }, new Label[] { label0, label1, label2, label2, label3, label4, label5, label6, label7 });
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getJDBCTypeCode", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitLookupSwitchInsn(label7, new int[] { 14, 15, 25, 30, 40, 50, 60, 61 }, new Label[] { label0, label0, label1, label2, label3, label4, label5, label6 });
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(SIPUSH, 2004);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(SIPUSH, 2005);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, -5);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, -2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, -3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, -7);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(SIPUSH, 2003);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getType", "(Lorg/hsqldb/types/Type;Lorg/hsqldb/types/Collation;)Lorg/hsqldb/types/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "getCollation", "()Lorg/hsqldb/types/Collation;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "isCharacterType", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "duplicate", "()Lorg/hsqldb/types/Type;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/types/CharacterType");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/types/CharacterType", "collation", "Lorg/hsqldb/types/Collation;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getType", "(ILorg/hsqldb/types/Charset;Lorg/hsqldb/types/Collation;JI)Lorg/hsqldb/types/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
methodVisitor.visitLookupSwitchInsn(label15, new int[] { -6, 0, 1, 2, 3, 4, 5, 6, 7, 8, 12, 14, 15, 16, 25, 30, 40, 60, 61, 91, 92, 93, 94, 95, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 1111 }, new Label[] { label0, label1, label2, label3, label3, label4, label5, label6, label7, label7, label2, label8, label8, label9, label10, label11, label2, label11, label11, label12, label12, label12, label12, label12, label13, label13, label13, label13, label13, label13, label13, label13, label13, label13, label13, label13, label13, label14 });
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_ALL_TYPES", "Lorg/hsqldb/types/Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/CharacterType", "getCharacterType", "(IJLorg/hsqldb/types/Collation;)Lorg/hsqldb/types/CharacterType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTEGER", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_SMALLINT", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BIGINT", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "TINYINT", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitLdcInsn(new Long(53L));
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLE, label7);
methodVisitor.visitIntInsn(SIPUSH, 5592);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "error", "(ILjava/lang/String;)Lorg/hsqldb/HsqlException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_DOUBLE", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFNE, label16);
methodVisitor.visitLdcInsn(new Long(128L));
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/NumberType", "getNumberType", "(IJI)Lorg/hsqldb/types/NumberType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BOOLEAN", "Lorg/hsqldb/types/BooleanType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/BinaryType", "getBinaryType", "(IJ)Lorg/hsqldb/types/BinaryType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/BitType", "getBitType", "(IJ)Lorg/hsqldb/types/BinaryType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/DateTimeType", "getDateTimeType", "(II)Lorg/hsqldb/types/DateTimeType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "getIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "OTHER", "Lorg/hsqldb/types/OtherType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "runtimeError", "(ILjava/lang/String;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getAggregateType", "(Lorg/hsqldb/types/Type;Lorg/hsqldb/types/Type;)Lorg/hsqldb/types/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "getAggregateType", "(Lorg/hsqldb/types/Type;)Lorg/hsqldb/types/Type;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getTypeNr", "(Ljava/lang/String;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(-2147483648));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "get", "(Ljava/lang/Object;I)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitLdcInsn(new Integer(-2147483648));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeAliases", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(-2147483648));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "get", "(Ljava/lang/Object;I)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getTypeForJDBCConvertToken", "(I)Lorg/hsqldb/types/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "get", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/types/Type");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isSupportedSQLType", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/Type", "getDefaultType", "(I)Lorg/hsqldb/types/Type;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "matches", "([Lorg/hsqldb/types/Type;[Lorg/hsqldb/types/Type;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/hsqldb/types/Type");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "emptyArray", "[Lorg/hsqldb/types/Type;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/NullType", "getNullType", "()Lorg/hsqldb/types/Type;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_ALL_TYPES", "Lorg/hsqldb/types/Type;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/CharacterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/CharacterType", "<init>", "(IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_CHAR", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/CharacterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(new Long(16L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/CharacterType", "<init>", "(IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_CHAR_16", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/CharacterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(new Long(256L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/CharacterType", "<init>", "(IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_CHAR_DEFAULT", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/CharacterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/CharacterType", "<init>", "(IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_VARCHAR", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/CharacterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn(new Long(32768L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/CharacterType", "<init>", "(IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_VARCHAR_DEFAULT", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/ClobType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Long(1073741824L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/ClobType", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_CLOB", "Lorg/hsqldb/types/ClobType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/BitType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/BitType", "<init>", "(IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_BIT", "Lorg/hsqldb/types/BitType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/BitType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/BitType", "<init>", "(IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_BIT_VARYING", "Lorg/hsqldb/types/BitType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/BitType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitLdcInsn(new Long(1024L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/BitType", "<init>", "(IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_BIT_VARYING_MAX_LENGTH", "Lorg/hsqldb/types/BitType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/BinaryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/BinaryType", "<init>", "(IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_BINARY", "Lorg/hsqldb/types/BinaryType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/BinaryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitLdcInsn(new Long(16L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/BinaryType", "<init>", "(IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_BINARY_16", "Lorg/hsqldb/types/BinaryType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/BinaryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitLdcInsn(new Long(32768L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/BinaryType", "<init>", "(IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_BINARY_DEFAULT", "Lorg/hsqldb/types/BinaryType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/BinaryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/BinaryType", "<init>", "(IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_VARBINARY", "Lorg/hsqldb/types/BinaryType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/BinaryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitLdcInsn(new Long(32768L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/BinaryType", "<init>", "(IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_VARBINARY_DEFAULT", "Lorg/hsqldb/types/BinaryType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/BlobType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Long(1073741824L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/BlobType", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_BLOB", "Lorg/hsqldb/types/BlobType;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/OtherType", "getOtherType", "()Lorg/hsqldb/types/OtherType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "OTHER", "Lorg/hsqldb/types/OtherType;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/BooleanType", "getBooleanType", "()Lorg/hsqldb/types/BooleanType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_BOOLEAN", "Lorg/hsqldb/types/BooleanType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/NumberType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn(new Long(128L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/NumberType", "<init>", "(IJI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_NUMERIC", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/NumberType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn(new Long(128L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/NumberType", "<init>", "(IJI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_DECIMAL", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/NumberType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn(new Long(128L));
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/NumberType", "<init>", "(IJI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_DECIMAL_DEFAULT", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/NumberType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn(new Long(40L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/NumberType", "<init>", "(IJI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_DECIMAL_BIGINT_SQR", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/NumberType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/NumberType", "<init>", "(IJI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_DOUBLE", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/NumberType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, -6);
methodVisitor.visitLdcInsn(new Long(3L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/NumberType", "<init>", "(IJI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "TINYINT", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/NumberType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn(new Long(5L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/NumberType", "<init>", "(IJI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_SMALLINT", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/NumberType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn(new Long(10L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/NumberType", "<init>", "(IJI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTEGER", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/NumberType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitLdcInsn(new Long(19L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/NumberType", "<init>", "(IJI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_BIGINT", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/DateTimeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitIntInsn(BIPUSH, 91);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/DateTimeType", "<init>", "(III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_DATE", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/DateTimeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 92);
methodVisitor.visitIntInsn(BIPUSH, 92);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/DateTimeType", "<init>", "(III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_TIME", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/DateTimeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 92);
methodVisitor.visitIntInsn(BIPUSH, 94);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/DateTimeType", "<init>", "(III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_TIME_WITH_TIME_ZONE", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/DateTimeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/DateTimeType", "<init>", "(III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_TIMESTAMP", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/DateTimeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitIntInsn(BIPUSH, 95);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/DateTimeType", "<init>", "(III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_TIMESTAMP_WITH_TIME_ZONE", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/DateTimeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/DateTimeType", "<init>", "(III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_TIMESTAMP_NO_FRACTION", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitIntInsn(BIPUSH, 101);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_YEAR", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 102);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_MONTH", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 103);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_DAY", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 104);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_HOUR", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 105);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_MINUTE", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 106);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_SECOND", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 106);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_SECOND_MAX_FRACTION", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 107);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_YEAR_TO_MONTH", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 108);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_DAY_TO_HOUR", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 109);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_DAY_TO_MINUTE", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 110);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_DAY_TO_SECOND", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 111);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_HOUR_TO_MINUTE", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 112);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_HOUR_TO_SECOND", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 113);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_MINUTE_TO_SECOND", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 101);
methodVisitor.visitLdcInsn(new Long(9L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_YEAR_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 102);
methodVisitor.visitLdcInsn(new Long(9L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_MONTH_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 103);
methodVisitor.visitLdcInsn(new Long(9L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_DAY_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 104);
methodVisitor.visitLdcInsn(new Long(9L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_HOUR_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 105);
methodVisitor.visitLdcInsn(new Long(9L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_MINUTE_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 106);
methodVisitor.visitLdcInsn(new Long(9L));
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_SECOND_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 106);
methodVisitor.visitLdcInsn(new Long(9L));
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_SECOND_MAX_FRACTION_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 107);
methodVisitor.visitLdcInsn(new Long(9L));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_YEAR_TO_MONTH_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(BIPUSH, 110);
methodVisitor.visitLdcInsn(new Long(9L));
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/types/IntervalType", "newIntervalType", "(IJI)Lorg/hsqldb/types/IntervalType;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_DAY_TO_SECOND_MAX_PRECISION", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/ArrayType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_ALL_TYPES", "Lorg/hsqldb/types/Type;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/ArrayType", "<init>", "(Lorg/hsqldb/types/Type;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "SQL_ARRAY_ALL_TYPES", "Lorg/hsqldb/types/ArrayType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/IntValueHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/IntValueHashMap", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CHARACTER");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("VARCHAR");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("VARCHAR_IGNORECASE");
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NVARCHAR");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DATE");
methodVisitor.visitIntInsn(BIPUSH, 91);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TIME");
methodVisitor.visitIntInsn(BIPUSH, 92);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TIMESTAMP");
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INTERVAL");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("TINYINT");
methodVisitor.visitIntInsn(BIPUSH, -6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("SMALLINT");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INTEGER");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BIGINT");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("REAL");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("FLOAT");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DOUBLE");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("NUMERIC");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DECIMAL");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BOOLEAN");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BINARY");
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("VARBINARY");
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CLOB");
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BLOB");
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("BIT");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeNames", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OTHER");
methodVisitor.visitIntInsn(SIPUSH, 1111);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/IntValueHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/IntValueHashMap", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "typeAliases", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeAliases", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("CHAR");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeAliases", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("INT");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeAliases", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DEC");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeAliases", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LONGVARCHAR");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeAliases", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("DATETIME");
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeAliases", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("LONGVARBINARY");
methodVisitor.visitIntInsn(BIPUSH, -4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "typeAliases", "Lorg/hsqldb/lib/IntValueHashMap;");
methodVisitor.visitLdcInsn("OBJECT");
methodVisitor.visitIntInsn(SIPUSH, 1111);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntValueHashMap", "put", "(Ljava/lang/Object;I)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/IntKeyHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/IntKeyHashMap", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 827);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_CHAR_DEFAULT", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 851);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_VARCHAR_DEFAULT", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 838);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_VARCHAR_DEFAULT", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 842);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_VARCHAR_DEFAULT", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 829);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_DATE", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 847);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_TIME", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 848);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_TIMESTAMP", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 849);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "TINYINT", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 846);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_SMALLINT", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 835);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTEGER", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 822);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BIGINT", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 843);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_DOUBLE", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 834);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_DOUBLE", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 833);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_DOUBLE", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 841);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_NUMERIC", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 831);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_DECIMAL", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 826);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BOOLEAN", "Lorg/hsqldb/types/BooleanType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 823);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BINARY_DEFAULT", "Lorg/hsqldb/types/BinaryType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 850);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_VARBINARY_DEFAULT", "Lorg/hsqldb/types/BinaryType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 836);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_VARBINARY_DEFAULT", "Lorg/hsqldb/types/BinaryType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 828);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_CLOB", "Lorg/hsqldb/types/ClobType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 825);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BLOB", "Lorg/hsqldb/types/BlobType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "jdbcConvertTypes", "Lorg/hsqldb/lib/IntKeyHashMap;");
methodVisitor.visitIntInsn(SIPUSH, 824);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BIT", "Lorg/hsqldb/types/BitType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/IntKeyHashMap", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
