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
public class SessionContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/hsqldb/SessionContext", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/hsqldb/RangeVariable$RangeIteratorBase", "org/hsqldb/RangeVariable", "RangeIteratorBase", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/hsqldb/RangeGroup$RangeGroupSimple", "org/hsqldb/RangeGroup", "RangeGroupSimple", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/hsqldb/HsqlNameManager$SimpleName", "org/hsqldb/HsqlNameManager", "SimpleName", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/hsqldb/RangeVariable$RangeIteratorMain", "org/hsqldb/RangeVariable", "RangeIteratorMain", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/hsqldb/HsqlNameManager$HsqlName", "org/hsqldb/HsqlNameManager", "HsqlName", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "session", "Lorg/hsqldb/Session;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "isAutoCommit", "Ljava/lang/Boolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "isReadOnly", "Ljava/lang/Boolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "noSQL", "Ljava/lang/Boolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "currentMaxRows", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "sessionVariables", "Lorg/hsqldb/lib/HashMappedList;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "sessionVariablesRange", "[Lorg/hsqldb/RangeVariable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "sessionVariableRangeGroups", "[Lorg/hsqldb/RangeGroup;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "stack", "Lorg/hsqldb/lib/HsqlArrayList;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "diagnosticsVariables", "[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "routineArguments", "[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "routineVariables", "[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "dynamicArguments", "[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "triggerArguments", "[[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "depth", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "isInRoutine", "Ljava/lang/Boolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "lastIdentity", "Ljava/lang/Number;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "savepoints", "Lorg/hsqldb/lib/HashMappedList;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "savepointTimestamps", "Lorg/hsqldb/lib/LongDeque;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "sessionTables", "Lorg/hsqldb/lib/HashMappedList;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "popSessionTables", "Lorg/hsqldb/lib/HashMappedList;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "currentStatement", "Lorg/hsqldb/Statement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "rownum", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "constraintPath", "Lorg/hsqldb/lib/HashSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "rowUpdateStatement", "Lorg/hsqldb/StatementResultUpdate;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/hsqldb/Session;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/map/ValuePool", "emptyObjectArray", "[Ljava/lang/Object;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "diagnosticsVariables", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/map/ValuePool", "emptyObjectArray", "[Ljava/lang/Object;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "routineArguments", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/map/ValuePool", "emptyObjectArray", "[Ljava/lang/Object;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "routineVariables", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/map/ValuePool", "emptyObjectArray", "[Ljava/lang/Object;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "dynamicArguments", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "[[Ljava/lang/Object;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "triggerArguments", "[[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/map/ValuePool", "INTEGER_0", "Ljava/lang/Integer;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "lastIdentity", "Ljava/lang/Number;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/StatementResultUpdate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/StatementResultUpdate", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "rowUpdateStatement", "Lorg/hsqldb/StatementResultUpdate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "session", "Lorg/hsqldb/Session;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/ExpressionColumn", "diagnosticsVariableTokens", "[Ljava/lang/String;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "diagnosticsVariables", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/hsqldb/navigator/RangeIterator");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/HashMappedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/HashMappedList", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "savepoints", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/LongDeque");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/LongDeque", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "savepointTimestamps", "Lorg/hsqldb/lib/LongDeque;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/HashMappedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/HashMappedList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "sessionVariables", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/hsqldb/RangeVariable");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "sessionVariablesRange", "[Lorg/hsqldb/RangeVariable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "sessionVariablesRange", "[Lorg/hsqldb/RangeVariable;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/RangeVariable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "sessionVariables", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/RangeVariable", "<init>", "(Lorg/hsqldb/lib/HashMappedList;Lorg/hsqldb/HsqlNameManager$SimpleName;ZI)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/hsqldb/RangeGroup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/RangeGroup$RangeGroupSimple");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "sessionVariablesRange", "[Lorg/hsqldb/RangeVariable;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/RangeGroup$RangeGroupSimple", "<init>", "([Lorg/hsqldb/RangeVariable;Z)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "sessionVariableRangeGroups", "[Lorg/hsqldb/RangeGroup;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "isAutoCommit", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "isReadOnly", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "noSQL", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "isInRoutine", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "resetStack", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "depth", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "isInRoutine", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/SessionContext", "pop", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "push", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/SessionContext", "push", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "push", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "depth", "I");
methodVisitor.visitIntInsn(SIPUSH, 256);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitIntInsn(SIPUSH, 458);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "error", "(I)Lorg/hsqldb/HsqlException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "session", "Lorg/hsqldb/Session;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Session", "sessionData", "Lorg/hsqldb/SessionData;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionData", "persistentStoreCollection", "Lorg/hsqldb/persist/PersistentStoreCollectionSession;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/PersistentStoreCollectionSession", "push", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/HsqlArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/HsqlArrayList", "<init>", "(IZ)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "diagnosticsVariables", "[Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "dynamicArguments", "[Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "routineArguments", "[Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "triggerArguments", "[[Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "routineVariables", "[Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "savepoints", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "savepointTimestamps", "Lorg/hsqldb/lib/LongDeque;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "lastIdentity", "Ljava/lang/Number;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "isAutoCommit", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "isReadOnly", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "noSQL", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "isInRoutine", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "currentMaxRows", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/map/ValuePool", "getInt", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "rownum", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/map/ValuePool", "getInt", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/ExpressionColumn", "diagnosticsVariableTokens", "[Ljava/lang/String;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "diagnosticsVariables", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/hsqldb/navigator/RangeIterator");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/HashMappedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/HashMappedList", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "savepoints", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/LongDeque");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/LongDeque", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "savepointTimestamps", "Lorg/hsqldb/lib/LongDeque;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "isAutoCommit", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "currentMaxRows", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "isInRoutine", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "depth", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "depth", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pop", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/SessionContext", "pop", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "pop", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "session", "Lorg/hsqldb/Session;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Session", "sessionData", "Lorg/hsqldb/SessionData;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionData", "persistentStoreCollection", "Lorg/hsqldb/persist/PersistentStoreCollectionSession;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/PersistentStoreCollectionSession", "pop", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "rownum", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "currentMaxRows", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "isInRoutine", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "noSQL", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "isReadOnly", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "isAutoCommit", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Number");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "lastIdentity", "Ljava/lang/Number;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/lib/LongDeque");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "savepointTimestamps", "Lorg/hsqldb/lib/LongDeque;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/lib/HashMappedList");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "savepoints", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "routineVariables", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[[Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "[[Ljava/lang/Object;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "triggerArguments", "[[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "routineArguments", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "dynamicArguments", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "diagnosticsVariables", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "depth", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "depth", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pushRoutineInvocation", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/SessionContext", "push", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "popRoutineInvocation", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/SessionContext", "pop", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pushDynamicArguments", "([Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/SessionContext", "push", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "dynamicArguments", "[Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pushStatementState", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/HsqlArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/HsqlArrayList", "<init>", "(IZ)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "rownum", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/map/ValuePool", "getInt", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "popStatementState", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "stack", "Lorg/hsqldb/lib/HsqlArrayList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlArrayList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "rownum", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDynamicArguments", "([Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "dynamicArguments", "[Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getRowSetDataChange", "()Lorg/hsqldb/navigator/RowSetNavigatorDataChange;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/navigator/RowSetNavigatorDataChangeMemory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "session", "Lorg/hsqldb/Session;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/navigator/RowSetNavigatorDataChangeMemory", "<init>", "(Lorg/hsqldb/Session;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "clearStructures", "(Lorg/hsqldb/StatementDMQL;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/StatementDMQL", "rangeIteratorCount", "I");
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/navigator/RangeIterator", "release", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCheckIterator", "(Lorg/hsqldb/RangeVariable;)Lorg/hsqldb/RangeVariable$RangeIteratorBase;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "session", "Lorg/hsqldb/Session;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/RangeVariable", "getIterator", "(Lorg/hsqldb/Session;)Lorg/hsqldb/RangeVariable$RangeIteratorMain;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/hsqldb/navigator/RangeIterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/RangeVariable$RangeIteratorBase");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRangeIterator", "(Lorg/hsqldb/navigator/RangeIterator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/navigator/RangeIterator", "getRangePosition", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/lib/ArrayUtil", "resizeArray", "(Ljava/lang/Object;I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unsetRangeIterator", "(Lorg/hsqldb/navigator/RangeIterator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/navigator/RangeIterator", "getRangePosition", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "rangeIterators", "[Lorg/hsqldb/navigator/RangeIterator;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConstraintPath", "()Lorg/hsqldb/lib/HashSet;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "constraintPath", "Lorg/hsqldb/lib/HashSet;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/HashSet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "constraintPath", "Lorg/hsqldb/lib/HashSet;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "constraintPath", "Lorg/hsqldb/lib/HashSet;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HashSet", "clear", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "constraintPath", "Lorg/hsqldb/lib/HashSet;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addSessionVariable", "(Lorg/hsqldb/ColumnSchema;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "sessionVariables", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HashMappedList", "size", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "sessionVariables", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/ColumnSchema", "getName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HashMappedList", "add", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitIntInsn(SIPUSH, 5504);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "error", "(I)Lorg/hsqldb/HsqlException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "sessionVariables", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HashMappedList", "size", "()I", false);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "routineVariables", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "routineVariables", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/lib/ArrayUtil", "copyArray", "(Ljava/lang/Object;Ljava/lang/Object;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "routineVariables", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "routineVariables", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "session", "Lorg/hsqldb/Session;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/ColumnSchema", "getDefaultValue", "(Lorg/hsqldb/Session;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pushRoutineTables", "(Lorg/hsqldb/lib/HashMappedList;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "sessionTables", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "popSessionTables", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "sessionTables", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "popRoutineTables", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "popSessionTables", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "sessionTables", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addSessionTable", "(Lorg/hsqldb/Table;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "sessionTables", "Lorg/hsqldb/lib/HashMappedList;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/HashMappedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/HashMappedList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/SessionContext", "sessionTables", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "sessionTables", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HashMappedList", "containsKey", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitIntInsn(SIPUSH, 5504);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "error", "(I)Lorg/hsqldb/HsqlException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "sessionTables", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Table", "getName", "()Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/HsqlNameManager$HsqlName", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HashMappedList", "add", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSessionTables", "([Lorg/hsqldb/Table;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findSessionTable", "(Ljava/lang/String;)Lorg/hsqldb/Table;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "sessionTables", "Lorg/hsqldb/lib/HashMappedList;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "sessionTables", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HashMappedList", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/Table");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dropSessionTable", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/SessionContext", "sessionTables", "Lorg/hsqldb/lib/HashMappedList;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HashMappedList", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
