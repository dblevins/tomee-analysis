package asm.org.eclipse.persistence.internal.helper;
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
public class DatabaseTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/internal/helper/DatabaseType", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/helper/DatabaseType$DatabaseTypeHelper", "org/eclipse/persistence/internal/helper/DatabaseType", "DatabaseTypeHelper", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_SHORT_PREFIX", "Ljava/lang/String;", null, "T_");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_SUFFIX", "Ljava/lang/String;", null, "TARGET");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPAT_SHORT_PREFIX", "Ljava/lang/String;", null, "C_");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPAT_SUFFIX", "Ljava/lang/String;", null, "COMPAT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ARGNAME_SIZE_LIMIT", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitLdcInsn("TARGET");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/DatabaseType", "ARGNAME_SIZE_LIMIT", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isComplexDatabaseType", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isJDBCType", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSqlCode", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getConversionCode", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTypeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "computeInIndex", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;ILjava/util/ListIterator;)I", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;ILjava/util/ListIterator<Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;>;)I", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "computeOutIndex", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;ILjava/util/ListIterator;)I", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;ILjava/util/ListIterator<Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;>;)I", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildInDeclare", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildOutDeclare", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildBeginBlock", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLStoredProcedureCall;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildOutAssignment", "(Ljava/lang/StringBuilder;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLStoredProcedureCall;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "translate", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lorg/eclipse/persistence/queries/StoredProcedureCall;)V", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Ljava/util/List<Lorg/eclipse/persistence/internal/helper/DatabaseField;>;Ljava/util/List<Lorg/eclipse/persistence/internal/helper/DatabaseField;>;Ljava/util/List;Lorg/eclipse/persistence/queries/StoredProcedureCall;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildOutputRow", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/sessions/DatabaseRecord;Ljava/util/List;Ljava/util/List;)V", "(Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/sessions/DatabaseRecord;Ljava/util/List<Lorg/eclipse/persistence/internal/helper/DatabaseField;>;Ljava/util/List;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "logParameter", "(Ljava/lang/StringBuilder;Ljava/lang/Integer;Lorg/eclipse/persistence/platform/database/oracle/plsql/PLSQLargument;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/platform/database/DatabasePlatform;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
