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
public class RangeVariable$RangeIteratorRightDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/hsqldb/RangeVariable$RangeIteratorRight", null, "org/hsqldb/RangeVariable$RangeIteratorMain", null);

classWriter.visitInnerClass("org/hsqldb/RangeVariable$RangeIteratorMain", "org/hsqldb/RangeVariable", "RangeIteratorMain", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/hsqldb/RangeVariable$1", "org/hsqldb/RangeVariable", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/hsqldb/RangeVariable$RangeIteratorRight", "org/hsqldb/RangeVariable", "RangeIteratorRight", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/hsqldb/RangeVariable$RangeVariableConditions", "org/hsqldb/RangeVariable", "RangeVariableConditions", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "isOnRightOuterRows", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/hsqldb/Session;Lorg/hsqldb/RangeVariable;Lorg/hsqldb/RangeVariable$RangeIteratorMain;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/RangeVariable$RangeIteratorMain", "<init>", "(Lorg/hsqldb/Session;Lorg/hsqldb/RangeVariable;Lorg/hsqldb/RangeVariable$1;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "isFullIterator", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnOuterRows", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "rangeVar", "Lorg/hsqldb/RangeVariable;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable", "whereConditions", "[Lorg/hsqldb/RangeVariable$RangeVariableConditions;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "conditions", "[Lorg/hsqldb/RangeVariable$RangeVariableConditions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "isOnRightOuterRows", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "hasLeftOuterRow", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "condIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/RangeVariable$RangeIteratorRight", "initialiseIterator", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "isOnRightOuterRows", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "it", "Lorg/hsqldb/navigator/RowIterator;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/RangeVariable$RangeIteratorRight", "findNextRight", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/RangeVariable$RangeIteratorMain", "next", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "findNextRight", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "it", "Lorg/hsqldb/navigator/RowIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/navigator/RowIterator", "getNextRow", "()Lorg/hsqldb/Row;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "currentRow", "Lorg/hsqldb/Row;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "currentRow", "Lorg/hsqldb/Row;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "currentRow", "Lorg/hsqldb/Row;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Row", "getData", "()[Ljava/lang/Object;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "currentData", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "conditions", "[Lorg/hsqldb/RangeVariable$RangeVariableConditions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "condIndex", "I");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeVariableConditions", "indexEndCondition", "Lorg/hsqldb/Expression;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "conditions", "[Lorg/hsqldb/RangeVariable$RangeVariableConditions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "condIndex", "I");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeVariableConditions", "indexEndCondition", "Lorg/hsqldb/Expression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "session", "Lorg/hsqldb/Session;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Expression", "testCondition", "(Lorg/hsqldb/Session;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "conditions", "[Lorg/hsqldb/RangeVariable$RangeVariableConditions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "condIndex", "I");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeVariableConditions", "nonIndexCondition", "Lorg/hsqldb/Expression;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "conditions", "[Lorg/hsqldb/RangeVariable$RangeVariableConditions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "condIndex", "I");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeVariableConditions", "nonIndexCondition", "Lorg/hsqldb/Expression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "session", "Lorg/hsqldb/Session;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Expression", "testCondition", "(Lorg/hsqldb/Session;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/RangeVariable$RangeIteratorRight", "lookupAndTest", "()Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "it", "Lorg/hsqldb/navigator/RowIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/navigator/RowIterator", "release", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "currentRow", "Lorg/hsqldb/Row;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "rangeVar", "Lorg/hsqldb/RangeVariable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/RangeVariable", "access$500", "(Lorg/hsqldb/RangeVariable;)[Ljava/lang/Object;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "currentData", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "lookupAndTest", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "lookup", "Lorg/hsqldb/lib/OrderedLongHashSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "currentRow", "Lorg/hsqldb/Row;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Row", "getPos", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/OrderedLongHashSet", "contains", "(J)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "currentRow", "Lorg/hsqldb/Row;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Row", "getData", "()[Ljava/lang/Object;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "currentData", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "conditions", "[Lorg/hsqldb/RangeVariable$RangeVariableConditions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "condIndex", "I");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeVariableConditions", "nonIndexCondition", "Lorg/hsqldb/Expression;");
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "conditions", "[Lorg/hsqldb/RangeVariable$RangeVariableConditions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "condIndex", "I");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeVariableConditions", "nonIndexCondition", "Lorg/hsqldb/Expression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/RangeVariable$RangeIteratorRight", "session", "Lorg/hsqldb/Session;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Expression", "testCondition", "(Lorg/hsqldb/Session;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/hsqldb/Session;Lorg/hsqldb/RangeVariable;Lorg/hsqldb/RangeVariable$RangeIteratorMain;Lorg/hsqldb/RangeVariable$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/RangeVariable$RangeIteratorRight", "<init>", "(Lorg/hsqldb/Session;Lorg/hsqldb/RangeVariable;Lorg/hsqldb/RangeVariable$RangeIteratorMain;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
