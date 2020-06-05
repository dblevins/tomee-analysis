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
public class StatementResultUpdateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/hsqldb/StatementResultUpdate", null, "org/hsqldb/StatementDML", null);

classWriter.visitInnerClass("org/hsqldb/HsqlNameManager$HsqlName", "org/hsqldb/HsqlNameManager", "HsqlName", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "actionType", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "types", "[Lorg/hsqldb/types/Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "result", "Lorg/hsqldb/result/Result;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/StatementDML", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/hsqldb/HsqlNameManager$HsqlName");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/StatementResultUpdate", "writeTableNames", "[Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(9223372036854775807L));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/StatementResultUpdate", "setCompileTimestamp", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "describe", "(Lorg/hsqldb/Session;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Lorg/hsqldb/Session;)Lorg/hsqldb/result/Result;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/StatementResultUpdate", "getResult", "(Lorg/hsqldb/Session;)Lorg/hsqldb/result/Result;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/StatementResultUpdate", "clearStructures", "(Lorg/hsqldb/Session;)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/StatementResultUpdate", "clearStructures", "(Lorg/hsqldb/Session;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/result/Result", "newErrorResult", "(Ljava/lang/Throwable;Ljava/lang/String;)Lorg/hsqldb/result/Result;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/hsqldb/result/Result"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getResult", "(Lorg/hsqldb/Session;)Lorg/hsqldb/result/Result;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/StatementResultUpdate", "checkAccessRights", "(Lorg/hsqldb/Session;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Session", "sessionContext", "Lorg/hsqldb/SessionContext;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "dynamicArguments", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "baseTable", "Lorg/hsqldb/Table;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getRowStore", "(Lorg/hsqldb/Session;)Lorg/hsqldb/persist/PersistentStore;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "actionType", "I");
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
methodVisitor.visitLookupSwitchInsn(label3, new int[] { 18, 50, 81 }, new Label[] { label0, label1, label2 });
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljava/lang/Object;", Opcodes.TOP, "org/hsqldb/persist/PersistentStore"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/StatementResultUpdate", "getRow", "(Lorg/hsqldb/Session;[Ljava/lang/Object;)Lorg/hsqldb/Row;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Row", "isDeleted", "(Lorg/hsqldb/Session;Lorg/hsqldb/persist/PersistentStore;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/hsqldb/StatementResultUpdate", "org/hsqldb/Session", "[Ljava/lang/Object;", "org/hsqldb/Row", "org/hsqldb/persist/PersistentStore"}, 0, new Object[] {});
methodVisitor.visitIntInsn(SIPUSH, 3621);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "error", "(I)Lorg/hsqldb/HsqlException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Session", "sessionContext", "Lorg/hsqldb/SessionContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/SessionContext", "getRowSetDataChange", "()Lorg/hsqldb/navigator/RowSetNavigatorDataChange;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Row", "getData", "()[Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/lib/ArrayUtil", "duplicateArray", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "baseTable", "Lorg/hsqldb/Table;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getNewColumnCheckList", "()[Z", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 8);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/hsqldb/StatementResultUpdate", "org/hsqldb/Session", "[Ljava/lang/Object;", "org/hsqldb/Row", "org/hsqldb/persist/PersistentStore", "org/hsqldb/navigator/RowSetNavigatorDataChange", "[Ljava/lang/Object;", "[Z", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "baseColumnMap", "[I");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "types", "[Lorg/hsqldb/types/Type;");
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_ALL_TYPES", "Lorg/hsqldb/types/Type;");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label8);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "baseColumnMap", "[I");
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "baseColumnMap", "[I");
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(8, 1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/lib/ArrayUtil", "booleanArrayToIntIndexes", "([Z)[I", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "baseTable", "Lorg/hsqldb/Table;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getColumnTypes", "()[Lorg/hsqldb/types/Type;", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/navigator/RowSetNavigatorDataChange", "addRow", "(Lorg/hsqldb/Session;Lorg/hsqldb/Row;[Ljava/lang/Object;[Lorg/hsqldb/types/Type;[I)[Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/navigator/RowSetNavigatorDataChange", "endMainDataSet", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "baseTable", "Lorg/hsqldb/Table;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/StatementResultUpdate", "update", "(Lorg/hsqldb/Session;Lorg/hsqldb/Table;Lorg/hsqldb/navigator/RowSetNavigatorDataChange;Lorg/hsqldb/navigator/RowSetNavigator;)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/hsqldb/StatementResultUpdate", "org/hsqldb/Session", "[Ljava/lang/Object;", Opcodes.TOP, "org/hsqldb/persist/PersistentStore"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/StatementResultUpdate", "getRow", "(Lorg/hsqldb/Session;[Ljava/lang/Object;)Lorg/hsqldb/Row;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Row", "isDeleted", "(Lorg/hsqldb/Session;Lorg/hsqldb/persist/PersistentStore;)Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/hsqldb/StatementResultUpdate", "org/hsqldb/Session", "[Ljava/lang/Object;", "org/hsqldb/Row", "org/hsqldb/persist/PersistentStore"}, 0, new Object[] {});
methodVisitor.visitIntInsn(SIPUSH, 3621);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "error", "(I)Lorg/hsqldb/HsqlException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Session", "sessionContext", "Lorg/hsqldb/SessionContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/SessionContext", "getRowSetDataChange", "()Lorg/hsqldb/navigator/RowSetNavigatorDataChange;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/navigator/RowSetNavigatorDataChange", "addRow", "(Lorg/hsqldb/Row;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/navigator/RowSetNavigatorDataChange", "endMainDataSet", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "baseTable", "Lorg/hsqldb/Table;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/StatementResultUpdate", "delete", "(Lorg/hsqldb/Session;Lorg/hsqldb/Table;Lorg/hsqldb/navigator/RowSetNavigatorDataChange;)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/hsqldb/StatementResultUpdate", "org/hsqldb/Session", "[Ljava/lang/Object;", Opcodes.TOP, "org/hsqldb/persist/PersistentStore"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "baseTable", "Lorg/hsqldb/Table;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getNewRowData", "(Lorg/hsqldb/Session;)[Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label12 = new Label();
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[Ljava/lang/Object;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "baseColumnMap", "[I");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label13);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "baseColumnMap", "[I");
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/StatementResultUpdate", "insertSingleRow", "(Lorg/hsqldb/Session;Lorg/hsqldb/persist/PersistentStore;[Ljava/lang/Object;)Lorg/hsqldb/result/Result;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/result/Result", "updateOneResult", "Lorg/hsqldb/result/Result;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getRow", "(Lorg/hsqldb/Session;[Ljava/lang/Object;)Lorg/hsqldb/Row;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "result", "Lorg/hsqldb/result/Result;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/result/Result", "metaData", "Lorg/hsqldb/result/ResultMetaData;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/result/ResultMetaData", "getColumnCount", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Long");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "baseTable", "Lorg/hsqldb/Table;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getRowStore", "(Lorg/hsqldb/Session;)Lorg/hsqldb/persist/PersistentStore;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "result", "Lorg/hsqldb/result/Result;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/result/Result", "metaData", "Lorg/hsqldb/result/ResultMetaData;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/result/ResultMetaData", "getExtendedColumnCount", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "result", "Lorg/hsqldb/result/Result;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/result/Result", "getNavigator", "()Lorg/hsqldb/navigator/RowSetNavigator;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/navigator/RowSetNavigatorData");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/navigator/RowSetNavigatorData", "getData", "(J)[Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/Row");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/hsqldb/StatementResultUpdate", "org/hsqldb/Session", "[Ljava/lang/Object;", Opcodes.INTEGER, "java/lang/Long", "org/hsqldb/persist/PersistentStore", "org/hsqldb/Row"}, 0, new Object[] {});
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
methodVisitor.visitInsn(L2I);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/PersistentStore", "get", "(JZ)Lorg/hsqldb/persist/CachedObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/Row");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/StatementResultUpdate", "result", "Lorg/hsqldb/result/Result;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "setRowActionProperties", "(Lorg/hsqldb/result/Result;ILorg/hsqldb/StatementQuery;[Lorg/hsqldb/types/Type;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementQuery", "queryExpression", "Lorg/hsqldb/QueryExpression;");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/StatementResultUpdate", "result", "Lorg/hsqldb/result/Result;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/StatementResultUpdate", "actionType", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/QueryExpression", "getBaseTable", "()Lorg/hsqldb/Table;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/StatementResultUpdate", "baseTable", "Lorg/hsqldb/Table;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/StatementResultUpdate", "types", "[Lorg/hsqldb/types/Type;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/QueryExpression", "getBaseTableColumnMap", "()[I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/StatementResultUpdate", "baseColumnMap", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "writeTableNames", "[Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "baseTable", "Lorg/hsqldb/Table;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/StatementQuery", "getSQL", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/StatementResultUpdate", "sql", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/QueryExpression", "getMetaData", "()Lorg/hsqldb/result/ResultMetaData;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/StatementResultUpdate", "parameterMetaData", "Lorg/hsqldb/result/ResultMetaData;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "checkAccessRights", "(Lorg/hsqldb/Session;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "type", "I");
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitLookupSwitchInsn(label6, new int[] { 7, 19, 50, 82, 85, 128 }, new Label[] { label0, label1, label2, label3, label4, label5 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Session", "getGrantee", "()Lorg/hsqldb/rights/Grantee;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "targetTable", "Lorg/hsqldb/Table;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "insertCheckColumns", "[Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rights/Grantee", "checkInsert", "(Lorg/hsqldb/SchemaObject;[Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Session", "getGrantee", "()Lorg/hsqldb/rights/Grantee;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "targetTable", "Lorg/hsqldb/Table;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rights/Grantee", "checkDelete", "(Lorg/hsqldb/SchemaObject;)V", false);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Session", "getGrantee", "()Lorg/hsqldb/rights/Grantee;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "targetTable", "Lorg/hsqldb/Table;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "updateCheckColumns", "[Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rights/Grantee", "checkUpdate", "(Lorg/hsqldb/SchemaObject;[Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Session", "getGrantee", "()Lorg/hsqldb/rights/Grantee;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "targetTable", "Lorg/hsqldb/Table;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "insertCheckColumns", "[Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rights/Grantee", "checkInsert", "(Lorg/hsqldb/SchemaObject;[Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Session", "getGrantee", "()Lorg/hsqldb/rights/Grantee;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "targetTable", "Lorg/hsqldb/Table;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementResultUpdate", "updateCheckColumns", "[Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rights/Grantee", "checkUpdate", "(Lorg/hsqldb/SchemaObject;[Z)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}