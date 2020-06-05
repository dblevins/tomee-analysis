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
public class ExpressionAccessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/hsqldb/ExpressionAccessor", null, "org/hsqldb/Expression", null);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/hsqldb/Expression;Lorg/hsqldb/Expression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 99);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/Expression", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/hsqldb/Expression");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getColumn", "()Lorg/hsqldb/ColumnSchema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Expression", "getColumn", "()Lorg/hsqldb/ColumnSchema;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resolveColumnReferences", "(Lorg/hsqldb/Session;Lorg/hsqldb/RangeGroup;I[Lorg/hsqldb/RangeGroup;Lorg/hsqldb/lib/HsqlList;Z)Lorg/hsqldb/lib/HsqlList;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(AALOAD);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Expression", "resolveColumnReferences", "(Lorg/hsqldb/Session;Lorg/hsqldb/RangeGroup;I[Lorg/hsqldb/RangeGroup;Lorg/hsqldb/lib/HsqlList;Z)Lorg/hsqldb/lib/HsqlList;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resolveTypes", "(Lorg/hsqldb/Session;Lorg/hsqldb/Expression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Expression", "resolveTypes", "(Lorg/hsqldb/Session;Lorg/hsqldb/Expression;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Expression", "dataType", "Lorg/hsqldb/types/Type;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitIntInsn(SIPUSH, 5567);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "error", "(I)Lorg/hsqldb/HsqlException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Expression", "dataType", "Lorg/hsqldb/types/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "isArrayType", "()Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitIntInsn(SIPUSH, 5563);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "error", "(I)Lorg/hsqldb/HsqlException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Expression", "dataType", "Lorg/hsqldb/types/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "collectionBaseType", "()Lorg/hsqldb/types/Type;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/ExpressionAccessor", "dataType", "Lorg/hsqldb/types/Type;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Expression", "opType", "I");
methodVisitor.visitIntInsn(BIPUSH, 8);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/types/Type", "SQL_INTEGER", "Lorg/hsqldb/types/NumberType;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/Expression", "dataType", "Lorg/hsqldb/types/Type;");
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "(Lorg/hsqldb/Session;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Expression", "getValue", "(Lorg/hsqldb/Session;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Ljava/lang/Object;"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Expression", "getValue", "(Lorg/hsqldb/Session;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Number");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Number"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Number", "intValue", "()I", false);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Number", "intValue", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(SIPUSH, 3490);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "error", "(I)Lorg/hsqldb/HsqlException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Number", "intValue", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUpdatedArray", "(Lorg/hsqldb/Session;[Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitIntInsn(SIPUSH, 3413);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "error", "(I)Lorg/hsqldb/HsqlException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Expression", "getValue", "(Lorg/hsqldb/Session;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Number");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitIntInsn(SIPUSH, 3490);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "error", "(I)Lorg/hsqldb/HsqlException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Number"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Number", "intValue", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 6);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFGE, label2);
methodVisitor.visitIntInsn(SIPUSH, 3490);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "error", "(I)Lorg/hsqldb/HsqlException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Expression", "dataType", "Lorg/hsqldb/types/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/Type", "arrayLimitCardinality", "()I", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label3);
methodVisitor.visitIntInsn(SIPUSH, 3490);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/error/Error", "error", "(I)Lorg/hsqldb/HsqlException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Ljava/lang/Object;"}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSQL", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/ExpressionAccessor", "getContextSQL", "(Lorg/hsqldb/Expression;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitIntInsn(BIPUSH, 91);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Expression", "getSQL", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "describe", "(Lorg/hsqldb/Session;I)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/StringBuffer", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("ARRAY ACCESS");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/ExpressionAccessor", "getLeftNode", "()Lorg/hsqldb/Expression;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(" array=[");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Expression", "describe", "(Lorg/hsqldb/Session;I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/ExpressionAccessor", "getRightNode", "()Lorg/hsqldb/Expression;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(" array_index=[");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ExpressionAccessor", "nodes", "[Lorg/hsqldb/Expression;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Expression", "describe", "(Lorg/hsqldb/Session;I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}