package asm.org.eclipse.persistence.internal.expressions;
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
public class FromAliasExpressionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/expressions/FromAliasExpression", null, "org/eclipse/persistence/internal/expressions/QueryKeyExpression", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "item", "Lorg/eclipse/persistence/internal/queries/ReportItem;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "containingDescriptor", "Lorg/eclipse/persistence/descriptors/ClassDescriptor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/expressions/QueryKeyExpression", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/expressions/Expression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/expressions/QueryKeyExpression", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "descriptionOfNodeType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("From Alias");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQueryKeyOrNull", "()Lorg/eclipse/persistence/mappings/querykeys/QueryKey;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "hasQueryKey", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "getContainingDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/mappings/querykeys/DirectQueryKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/mappings/querykeys/DirectQueryKey", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/DatabaseField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/DatabaseField", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/querykeys/DirectQueryKey", "setField", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "getBaseExpression", "()Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/expressions/FromSubSelectExpression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/FromSubSelectExpression", "getSubSelect", "()Lorg/eclipse/persistence/internal/expressions/SubSelectExpression;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/SubSelectExpression", "getSubQuery", "()Lorg/eclipse/persistence/queries/ReportQuery;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/ReportQuery", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/querykeys/DirectQueryKey", "setDescriptor", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "queryKey", "Lorg/eclipse/persistence/mappings/querykeys/QueryKey;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/expressions/QueryKeyExpression", "getQueryKeyOrNull", "()Lorg/eclipse/persistence/mappings/querykeys/QueryKey;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContainingDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "getBuilder", "()Lorg/eclipse/persistence/expressions/ExpressionBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/ExpressionBuilder", "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "containingDescriptor", "Lorg/eclipse/persistence/descriptors/ClassDescriptor;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "getItem", "()Lorg/eclipse/persistence/internal/queries/ReportItem;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/queries/ReportItem", "getAttributeExpression", "()Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "isQueryKeyExpression", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "getBuilder", "()Lorg/eclipse/persistence/expressions/ExpressionBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/ExpressionBuilder", "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "getBuilder", "()Lorg/eclipse/persistence/expressions/ExpressionBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/ExpressionBuilder", "setSession", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/eclipse/persistence/internal/sessions/AbstractSession", "org/eclipse/persistence/expressions/Expression"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/expressions/QueryKeyExpression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/QueryKeyExpression", "getContainingDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "containingDescriptor", "Lorg/eclipse/persistence/descriptors/ClassDescriptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "containingDescriptor", "Lorg/eclipse/persistence/descriptors/ClassDescriptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "containingDescriptor", "Lorg/eclipse/persistence/descriptors/ClassDescriptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getItem", "()Lorg/eclipse/persistence/internal/queries/ReportItem;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "item", "Lorg/eclipse/persistence/internal/queries/ReportItem;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "getBaseExpression", "()Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/expressions/FromSubSelectExpression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/FromSubSelectExpression", "getSubSelect", "()Lorg/eclipse/persistence/internal/expressions/SubSelectExpression;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/SubSelectExpression", "getSubQuery", "()Lorg/eclipse/persistence/queries/ReportQuery;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/ReportQuery", "getItem", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/queries/ReportItem;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "item", "Lorg/eclipse/persistence/internal/queries/ReportItem;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "item", "Lorg/eclipse/persistence/internal/queries/ReportItem;");
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/QueryException", "invalidQueryKeyInExpression", "(Ljava/lang/Object;)Lorg/eclipse/persistence/exceptions/QueryException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/expressions/FromAliasExpression", "item", "Lorg/eclipse/persistence/internal/queries/ReportItem;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
