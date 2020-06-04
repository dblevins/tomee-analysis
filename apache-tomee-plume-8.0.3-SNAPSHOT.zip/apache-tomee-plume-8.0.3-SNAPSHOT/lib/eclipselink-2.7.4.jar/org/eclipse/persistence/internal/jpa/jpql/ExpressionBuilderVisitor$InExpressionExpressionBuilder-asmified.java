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
public class ExpressionBuilderVisitor$InExpressionExpressionBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionExpressionBuilder", null, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkAnonymousExpressionVisitor", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionExpressionBuilder", "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "InExpressionExpressionBuilder", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkAnonymousExpressionVisitor", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/CollectionExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/CollectionExpression", "children", "()Lorg/eclipse/persistence/jpa/jpql/utility/iterable/ListIterable;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/utility/iterable/ListIterable", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionExpressionBuilder", "org/eclipse/persistence/jpa/jpql/parser/CollectionExpression", "java/util/List", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/parser/Expression");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/parser/Expression", "accept", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionVisitor;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$3", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/expressions/CollectionExpression");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$0", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "getBaseExpression", "()Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/expressions/CollectionExpression", "<init>", "(Ljava/lang/Object;Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$2", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/parser/Expression", "accept", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionVisitor;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/SubExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/SubExpression", "getExpression", "()Lorg/eclipse/persistence/jpa/jpql/parser/Expression;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/parser/Expression", "accept", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionVisitor;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionExpressionBuilder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionExpressionBuilder", "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
