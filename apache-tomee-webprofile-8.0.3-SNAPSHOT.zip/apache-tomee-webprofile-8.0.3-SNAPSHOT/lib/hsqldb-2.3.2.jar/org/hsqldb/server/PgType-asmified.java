package asm.org.hsqldb.server;
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
public class PgTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/hsqldb/server/PgType", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "oid", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "typeWidth", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lpConstraint", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "hType", "Lorg/hsqldb/types/Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_BOOL", "I", null, new Integer(16));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_BYTEA", "I", null, new Integer(17));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_CHAR", "I", null, new Integer(18));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_NAME", "I", null, new Integer(19));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_INT8", "I", null, new Integer(20));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_INT2", "I", null, new Integer(21));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_INT2VECTOR", "I", null, new Integer(22));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_INT4", "I", null, new Integer(23));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_REGPROC", "I", null, new Integer(24));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_TEXT", "I", null, new Integer(25));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_OID", "I", null, new Integer(26));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_TID", "I", null, new Integer(27));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_XID", "I", null, new Integer(28));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_CID", "I", null, new Integer(29));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_OIDVECTOR", "I", null, new Integer(30));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_SET", "I", null, new Integer(32));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_XML", "I", null, new Integer(142));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_XMLARRAY", "I", null, new Integer(143));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_CHAR2", "I", null, new Integer(409));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_CHAR4", "I", null, new Integer(410));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_CHAR8", "I", null, new Integer(411));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_POINT", "I", null, new Integer(600));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_LSEG", "I", null, new Integer(601));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_PATH", "I", null, new Integer(602));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_BOX", "I", null, new Integer(603));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_POLYGON", "I", null, new Integer(604));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_FILENAME", "I", null, new Integer(605));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_CIDR", "I", null, new Integer(650));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_FLOAT4", "I", null, new Integer(700));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_FLOAT8", "I", null, new Integer(701));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_ABSTIME", "I", null, new Integer(702));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_RELTIME", "I", null, new Integer(703));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_TINTERVAL", "I", null, new Integer(704));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_UNKNOWN", "I", null, new Integer(705));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_MONEY", "I", null, new Integer(790));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_OIDINT2", "I", null, new Integer(810));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_MACADDR", "I", null, new Integer(829));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_INET", "I", null, new Integer(869));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_OIDINT4", "I", null, new Integer(910));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_OIDNAME", "I", null, new Integer(911));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_TEXTARRAY", "I", null, new Integer(1009));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_BPCHARARRAY", "I", null, new Integer(1014));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_VARCHARARRAY", "I", null, new Integer(1015));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_BPCHAR", "I", null, new Integer(1042));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_VARCHAR", "I", null, new Integer(1043));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_DATE", "I", null, new Integer(1082));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_TIME", "I", null, new Integer(1083));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_TIMESTAMP_NO_TMZONE", "I", null, new Integer(1114));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_DATETIME", "I", null, new Integer(1184));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_TIME_WITH_TMZONE", "I", null, new Integer(1266));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_TIMESTAMP", "I", null, new Integer(1296));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_NUMERIC", "I", null, new Integer(1700));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_RECORD", "I", null, new Integer(2249));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_VOID", "I", null, new Integer(2278));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_UUID", "I", null, new Integer(2950));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_BLOB", "I", null, new Integer(9998));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_TINYINT", "I", null, new Integer(9999));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_BIT", "I", null, new Integer(1560));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_VARBIT", "I", null, new Integer(1562));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "tinyIntSingleton", "Lorg/hsqldb/server/PgType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "int2singleton", "Lorg/hsqldb/server/PgType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "int4singleton", "Lorg/hsqldb/server/PgType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "int8singleton", "Lorg/hsqldb/server/PgType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "doubleSingleton", "Lorg/hsqldb/server/PgType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "boolSingleton", "Lorg/hsqldb/server/PgType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "textSingleton", "Lorg/hsqldb/server/PgType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "dateSingleton", "Lorg/hsqldb/server/PgType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "unknownSingleton", "Lorg/hsqldb/server/PgType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "bitSingleton", "Lorg/hsqldb/server/PgType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "bitVaryingSingleton", "Lorg/hsqldb/server/PgType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "daySecIntervalSingleton", "Lorg/hsqldb/server/PgType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "hourSecIntervalSingleton", "Lorg/hsqldb/server/PgType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "minSecIntervalSingleton", "Lorg/hsqldb/server/PgType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "secIntervalSingleton", "Lorg/hsqldb/server/PgType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOid", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/PgType", "oid", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypeWidth", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/PgType", "typeWidth", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLPConstraint", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/PgType", "lpConstraint", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/hsqldb/types/Type;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;ILjava/lang/Integer;Ljava/lang/Integer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/hsqldb/types/Type;II)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Integer", "<init>", "(I)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;ILjava/lang/Integer;Ljava/lang/Integer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/hsqldb/types/Type;ILjava/lang/Integer;J)V", null, new String[] { "org/hsqldb/server/RecoverableOdbcFailure" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "java/lang/Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(L2I);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Integer", "<init>", "(I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;ILjava/lang/Integer;Ljava/lang/Integer;)V", false);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/RecoverableOdbcFailure");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Length/Precision value is below minimum value of 0");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/RecoverableOdbcFailure", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/hsqldb/server/PgType", "org/hsqldb/types/Type", Opcodes.INTEGER, "java/lang/Integer", Opcodes.LONG}, 0, new Object[] {});
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitLdcInsn(new Long(2147483647L));
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/RecoverableOdbcFailure");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Length/Precision value is above maximum value of 2147483647");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/RecoverableOdbcFailure", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/hsqldb/types/Type;ILjava/lang/Integer;Ljava/lang/Integer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/server/PgType", "typeWidth", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/server/PgType", "lpConstraint", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/server/PgType", "hType", "Lorg/hsqldb/types/Type;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/server/PgType", "oid", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_M1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/hsqldb/server/PgType", "org/hsqldb/types/Type", Opcodes.INTEGER, "java/lang/Integer", "java/lang/Integer"}, 1, new Object[] {"org/hsqldb/server/PgType"});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/hsqldb/server/PgType", "org/hsqldb/types/Type", Opcodes.INTEGER, "java/lang/Integer", "java/lang/Integer"}, 2, new Object[] {"org/hsqldb/server/PgType", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/server/PgType", "typeWidth", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitInsn(ICONST_M1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/hsqldb/server/PgType"});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/hsqldb/server/PgType", "org/hsqldb/types/Type", Opcodes.INTEGER, "java/lang/Integer", "java/lang/Integer"}, 2, new Object[] {"org/hsqldb/server/PgType", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/server/PgType", "lpConstraint", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPgType", "(Lorg/hsqldb/types/Type;Z)Lorg/hsqldb/server/PgType;", null, new String[] { "org/hsqldb/server/RecoverableOdbcFailure" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
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
methodVisitor.visitLookupSwitchInsn(label26, new int[] { -6, 1, 2, 3, 4, 5, 6, 7, 8, 12, 14, 15, 16, 25, 30, 40, 60, 61, 91, 92, 93, 94, 95, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 1111 }, new Label[] { label0, label1, label2, label2, label3, label4, label5, label5, label5, label6, label7, label8, label9, label10, label11, label12, label13, label13, label14, label15, label16, label17, label18, label19, label19, label20, label20, label20, label21, label19, label20, label20, label22, label20, label23, label24, label25 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/server/PgType", "tinyIntSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/server/PgType", "int2singleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/server/PgType", "int4singleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/server/PgType", "int8singleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1700);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "scale", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LADD);
methodVisitor.visitLdcInsn(new Long(4L));
methodVisitor.visitInsn(LADD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;ILjava/lang/Integer;J)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/server/PgType", "doubleSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/server/PgType", "boolSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label27 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label27);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1042);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitLdcInsn(new Long(4L));
methodVisitor.visitInsn(LADD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;ILjava/lang/Integer;J)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label27);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/server/PgType", "unknownSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label28 = new Label();
methodVisitor.visitJumpInsn(IFGE, label28);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/RecoverableOdbcFailure");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Length/Precision value is below minimum value of 0");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/RecoverableOdbcFailure", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label28);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitLdcInsn(new Long(2147483647L));
methodVisitor.visitInsn(LCMP);
Label label29 = new Label();
methodVisitor.visitJumpInsn(IFLE, label29);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/RecoverableOdbcFailure");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Length/Precision value is above maximum value of 2147483647");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/RecoverableOdbcFailure", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label29);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label30 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label30);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitJumpInsn(IFEQ, label30);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1043);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitLdcInsn(new Long(4L));
methodVisitor.visitInsn(LADD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;ILjava/lang/Integer;J)V", false);
Label label31 = new Label();
methodVisitor.visitJumpInsn(GOTO, label31);
methodVisitor.visitLabel(label30);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/server/PgType", "textSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitLabel(label31);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/hsqldb/server/PgType"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/RecoverableOdbcFailure");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Driver doesn't support type 'CLOB' yet");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/RecoverableOdbcFailure", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 9998);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;ILjava/lang/Integer;J)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;ILjava/lang/Integer;J)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label25);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/RecoverableOdbcFailure");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Driver doesn't support type 'OTHER' yet");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/RecoverableOdbcFailure", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/server/PgType", "bitSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/server/PgType", "bitVaryingSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/server/PgType", "dateSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1083);
methodVisitor.visitTypeInsn(NEW, "java/lang/Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Integer", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;ILjava/lang/Integer;J)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1266);
methodVisitor.visitTypeInsn(NEW, "java/lang/Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Integer", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;ILjava/lang/Integer;J)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1114);
methodVisitor.visitTypeInsn(NEW, "java/lang/Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Integer", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;ILjava/lang/Integer;J)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1296);
methodVisitor.visitTypeInsn(NEW, "java/lang/Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Integer", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;ILjava/lang/Integer;J)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/RecoverableOdbcFailure");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Driver doesn't support month-resolution 'INTERVAL's yet");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/RecoverableOdbcFailure", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/RecoverableOdbcFailure");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Driver doesn't support non-second-resolution 'INTERVAL's yet");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/RecoverableOdbcFailure", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/server/PgType", "ignoredConstraintWarning", "(Lorg/hsqldb/types/Type;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/server/PgType", "daySecIntervalSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/server/PgType", "ignoredConstraintWarning", "(Lorg/hsqldb/types/Type;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/server/PgType", "hourSecIntervalSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/server/PgType", "ignoredConstraintWarning", "(Lorg/hsqldb/types/Type;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/server/PgType", "minSecIntervalSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/server/PgType", "ignoredConstraintWarning", "(Lorg/hsqldb/types/Type;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/server/PgType", "secIntervalSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label26);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/RecoverableOdbcFailure");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Unsupported type: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "getNameString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/RecoverableOdbcFailure", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(9, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParameter", "(Ljava/lang/String;Lorg/hsqldb/Session;)Ljava/lang/Object;", null, new String[] { "java/sql/SQLException", "org/hsqldb/server/RecoverableOdbcFailure" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/hsqldb/HsqlException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "org/hsqldb/HsqlException");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "org/hsqldb/HsqlException");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label9);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/PgType", "hType", "Lorg/hsqldb/types/Type;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
methodVisitor.visitLookupSwitchInsn(label6, new int[] { -6, 2, 3, 4, 5, 6, 7, 8, 16, 25, 30, 40, 60, 61, 91, 92, 93, 94, 95, 1111 }, new Label[] { label3, label3, label3, label3, label3, label3, label3, label3, label10, label3, label11, label12, label11, label11, label0, label0, label0, label0, label0, label12 });
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitInsn(ICONST_1);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label13);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C", false);
Label label14 = new Label();
Label label15 = new Label();
methodVisitor.visitLookupSwitchInsn(label15, new int[] { 49, 84, 89, 116, 121 }, new Label[] { label14, label14, label14, label14, label14 });
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Ljava/lang/String;)Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/RecoverableOdbcFailure");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("This data type should be transmitted to server in binary format: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/PgType", "hType", "Lorg/hsqldb/types/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "getNameString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/RecoverableOdbcFailure", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/RecoverableOdbcFailure");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Type not supported yet: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/PgType", "hType", "Lorg/hsqldb/types/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "getNameString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/RecoverableOdbcFailure", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/PgType", "hType", "Lorg/hsqldb/types/Type;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_VARCHAR", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "convertToType", "(Lorg/hsqldb/SessionInterface;Ljava/lang/Object;Lorg/hsqldb/types/Type;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
Label label16 = new Label();
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/hsqldb/HsqlException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/server/PgType", "throwError", "(Lorg/hsqldb/HsqlException;)V", false);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/PgType", "hType", "Lorg/hsqldb/types/Type;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_VARCHAR", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "convertToType", "(Lorg/hsqldb/SessionInterface;Ljava/lang/Object;Lorg/hsqldb/types/Type;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/hsqldb/HsqlException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/server/PgType", "throwError", "(Lorg/hsqldb/HsqlException;)V", false);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/PgType", "hType", "Lorg/hsqldb/types/Type;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "convertToDefaultType", "(Lorg/hsqldb/SessionInterface;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label7);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/hsqldb/HsqlException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/server/PgType", "throwError", "(Lorg/hsqldb/HsqlException;)V", false);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "valueString", "(Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/PgType", "hType", "Lorg/hsqldb/types/Type;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "convertToString", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/PgType", "hType", "Lorg/hsqldb/types/Type;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitLookupSwitchInsn(label2, new int[] { 16, 60, 61 }, new Label[] { label0, label1, label1 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitIntInsn(BIPUSH, 116);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 102);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(C)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/server/OdbcUtil", "hexCharsToOctalOctets", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL | ACC_STATIC, "throwError", "(Lorg/hsqldb/HsqlException;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/HsqlException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/HsqlException", "getSQLState", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/HsqlException", "getErrorCode", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/jdbc/JDBCUtil", "sqlException", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Throwable;)Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "ignoredConstraintWarning", "(Lorg/hsqldb/types/Type;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "precision", "J");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "scale", "I");
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "TINYINT", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitIntInsn(SIPUSH, 9999);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/server/PgType", "tinyIntSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_SMALLINT", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/server/PgType", "int2singleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTEGER", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/server/PgType", "int4singleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BIGINT", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/server/PgType", "int8singleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_DOUBLE", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitIntInsn(SIPUSH, 701);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/server/PgType", "doubleSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BOOLEAN", "Lorg/hsqldb/types/BooleanType;");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/server/PgType", "boolSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_VARCHAR", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/server/PgType", "textSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_DATE", "Lorg/hsqldb/types/DateTimeType;");
methodVisitor.visitIntInsn(SIPUSH, 1082);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/server/PgType", "dateSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_CHAR_DEFAULT", "Lorg/hsqldb/types/CharacterType;");
methodVisitor.visitIntInsn(SIPUSH, 705);
methodVisitor.visitIntInsn(BIPUSH, -2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/server/PgType", "unknownSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BIT", "Lorg/hsqldb/types/BitType;");
methodVisitor.visitIntInsn(SIPUSH, 1560);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/server/PgType", "bitSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_BIT_VARYING", "Lorg/hsqldb/types/BitType;");
methodVisitor.visitIntInsn(SIPUSH, 1562);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/server/PgType", "bitVaryingSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_DAY_TO_SECOND", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(SIPUSH, 704);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/server/PgType", "daySecIntervalSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_HOUR_TO_SECOND", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(SIPUSH, 704);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/server/PgType", "hourSecIntervalSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_MINUTE_TO_SECOND", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(SIPUSH, 704);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/server/PgType", "minSecIntervalSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/PgType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTERVAL_SECOND", "Lorg/hsqldb/types/IntervalType;");
methodVisitor.visitIntInsn(SIPUSH, 704);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/PgType", "<init>", "(Lorg/hsqldb/types/Type;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/server/PgType", "secIntervalSingleton", "Lorg/hsqldb/server/PgType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
