package asm.org.eclipse.persistence.platform.database.oracle.plsql;
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
public class OraclePLSQLTypesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ENUM, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Ljava/lang/Enum<Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;>;Lorg/eclipse/persistence/internal/helper/SimpleDatabaseType;Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLType;", "java/lang/Enum", new String[] { "org/eclipse/persistence/internal/helper/SimpleDatabaseType", "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLType" });

classWriter.visitInnerClass("org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "org/eclipse/persistence/internal/helper/DatabaseType", "DatabaseTypeHelper", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes$1", null, null, ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes$2", null, null, ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes$3", null, null, ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes$4", null, null, ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BinaryInteger", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Dec", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Int", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Natural", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NaturalN", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PLSQLBoolean", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PLSQLInteger", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Positive", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PositiveN", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SignType", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XMLType", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "typeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BinaryInteger");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("BINARY_INTEGER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "BinaryInteger", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Dec");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("DEC");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Dec", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Int");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("INT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Int", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Natural");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("NATURAL");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Natural", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NaturalN");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("NATURALN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes$1", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "NaturalN", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PLSQLBoolean");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("BOOLEAN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes$2", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "PLSQLBoolean", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PLSQLInteger");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("PLS_INTEGER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "PLSQLInteger", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Positive");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("POSITIVE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Positive", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PositiveN");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("POSITIVEN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes$3", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "PositiveN", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SignType");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("SIGNTYPE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "SignType", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XMLType");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("XMLTYPE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes$4", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "XMLType", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "BinaryInteger", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Dec", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Int", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Natural", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "NaturalN", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "PLSQLBoolean", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "PLSQLInteger", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Positive", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "PositiveN", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "SignType", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "XMLType", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "ENUM$VALUES", "[Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "typeName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isComplexDatabaseType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSqlCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 1111);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConversionCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "NUMERIC_TYPE", "Lorg/eclipse/persistence/platform/database/jdbc/JDBCTypes;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/database/jdbc/JDBCTypes", "getConversionCode", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "typeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isJDBCType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "computeInIndex", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;ILjava/util/ListIterator;)I", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;ILjava/util/ListIterator<Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;>;)I", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "databaseTypeHelper", "Lorg/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "computeInIndex", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "computeOutIndex", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;ILjava/util/ListIterator;)I", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;ILjava/util/ListIterator<Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;>;)I", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "databaseTypeHelper", "Lorg/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "computeOutIndex", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildInDeclare", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "databaseTypeHelper", "Lorg/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "declareTarget", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/helper/DatabaseType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(" := :");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument", "inIndex", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(";");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("\n");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildOutDeclare", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "databaseTypeHelper", "Lorg/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "declareTarget", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/helper/DatabaseType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(";");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("\n");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildBeginBlock", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLStoredProcedureCall;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildOutAssignment", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLStoredProcedureCall;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "databaseTypeHelper", "Lorg/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "buildOutAssignment", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLStoredProcedureCall;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "translate", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lorg/eclipse/persistence/queries/StoredProcedureCall;)V", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Ljava/util/List<Lorg/eclipse/persistence/internal/helper/DatabaseField;>;Ljava/util/List<Lorg/eclipse/persistence/internal/helper/DatabaseField;>;Ljava/util/List;Lorg/eclipse/persistence/queries/StoredProcedureCall;)V", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "databaseTypeHelper", "Lorg/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "translate", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lorg/eclipse/persistence/queries/StoredProcedureCall;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildOutputRow", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/sessions/DatabaseRecord;Ljava/util/List;Ljava/util/List;)V", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/sessions/DatabaseRecord;Ljava/util/List<Lorg/eclipse/persistence/internal/helper/DatabaseField;>;Ljava/util/List;)V", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "databaseTypeHelper", "Lorg/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "buildOutputRow", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/sessions/DatabaseRecord;Ljava/util/List;Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "logParameter", "(Ljava/lang/StringBuilder;Ljava/lang/Integer;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/platform/database/DatabasePlatform;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "databaseTypeHelper", "Lorg/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "logParameter", "(Ljava/lang/StringBuilder;Ljava/lang/Integer;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/platform/database/DatabasePlatform;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDatabaseTypeForCode", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/helper/DatabaseType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "BinaryInteger", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "typeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "BinaryInteger", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/helper/DatabaseType"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Dec", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "typeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Dec", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Int", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "typeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Int", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Natural", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "typeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Natural", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "NaturalN", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "typeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "NaturalN", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "PLSQLBoolean", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "typeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitLdcInsn("BOOLEAN");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "PLSQLBoolean", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "PLSQLInteger", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "typeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "PLSQLInteger", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Positive", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "typeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "Positive", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "PositiveN", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "typeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "PositiveN", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "SignType", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "typeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "SignType", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "XMLType", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "typeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "XMLType", "Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "ENUM$VALUES", "[Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/oracle/plsql/OraclePLSQLTypes", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
