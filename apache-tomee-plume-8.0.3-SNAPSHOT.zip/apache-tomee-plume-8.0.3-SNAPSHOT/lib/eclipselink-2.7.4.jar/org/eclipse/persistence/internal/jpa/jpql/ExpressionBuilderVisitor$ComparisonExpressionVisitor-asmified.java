package asm.org.eclipse.persistence.internal.jpa.jpql;
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
public class ExpressionBuilderVisitor$ComparisonExpressionVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$ComparisonExpressionVisitor", null, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkAnonymousExpressionVisitor", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$ComparisonExpressionVisitor", "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "ComparisonExpressionVisitor", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$ComparisonExpressionVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkAnonymousExpressionVisitor", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/IdentificationVariable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/IdentificationVariable", "isVirtual", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$ComparisonExpressionVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$0", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/IdentificationVariable", "getText", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "getDescriptor", "(Ljava/lang/String;)Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$ComparisonExpressionVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$1", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)[Ljava/lang/Class;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$ComparisonExpressionVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/expressions/ConstantExpression");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$ComparisonExpressionVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$1", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)[Ljava/lang/Class;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$ComparisonExpressionVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$0", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "getBaseExpression", "()Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/expressions/ConstantExpression", "<init>", "(Ljava/lang/Object;Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$2", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$ComparisonExpressionVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/IdentificationVariable", "accept", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionVisitor;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$ComparisonExpressionVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/parser/Expression", "accept", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionVisitor;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$ComparisonExpressionVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$ComparisonExpressionVisitor", "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
