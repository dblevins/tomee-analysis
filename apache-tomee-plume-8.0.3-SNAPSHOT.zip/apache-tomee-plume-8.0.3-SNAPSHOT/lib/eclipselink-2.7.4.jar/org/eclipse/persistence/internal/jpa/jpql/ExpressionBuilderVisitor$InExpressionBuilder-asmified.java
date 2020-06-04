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
public class ExpressionBuilderVisitor$InExpressionBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", null, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkAnonymousExpressionVisitor", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "InExpressionBuilder", ACC_PRIVATE);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder$InItemExpressionVisitor", "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "InItemExpressionVisitor", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "hasNot", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "leftExpression", "Lorg/eclipse/persistence/expressions/Expression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "singleInputParameter", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkAnonymousExpressionVisitor", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/CollectionExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder$InItemExpressionVisitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder$InItemExpressionVisitor", "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder;Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder$InItemExpressionVisitor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/CollectionExpression", "children", "()Lorg/eclipse/persistence/jpa/jpql/utility/iterable/ListIterable;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/utility/iterable/ListIterable", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "org/eclipse/persistence/jpa/jpql/parser/CollectionExpression", "java/util/Collection", "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder$InItemExpressionVisitor", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/parser/Expression");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/parser/Expression", "accept", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionVisitor;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$3", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "hasNot", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "leftExpression", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "notIn", "(Ljava/util/Collection;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$2", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;Lorg/eclipse/persistence/expressions/Expression;)V", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "org/eclipse/persistence/jpa/jpql/parser/CollectionExpression", "java/util/Collection", "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder$InItemExpressionVisitor"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "leftExpression", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "in", "(Ljava/util/Collection;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$2", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
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
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$0", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/IdentificationVariable", "getText", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "getDescriptor", "(Ljava/lang/String;)Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$1", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)[Ljava/lang/Class;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/expressions/ConstantExpression");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$1", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)[Ljava/lang/Class;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/IdentificationVariable", "accept", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionVisitor;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/InputParameter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "singleInputParameter", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/InputParameter", "getParameter", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$0", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "getBaseExpression", "()Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$2", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$3", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Collection;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "getParameter", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$2", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$0", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$3", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "addInputParameter", "(Lorg/eclipse/persistence/jpa/jpql/parser/InputParameter;Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "hasNot", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "leftExpression", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$3", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "notIn", "(Lorg/eclipse/persistence/expressions/Expression;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$2", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;Lorg/eclipse/persistence/expressions/Expression;)V", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "leftExpression", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$3", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "in", "(Lorg/eclipse/persistence/expressions/Expression;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$2", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/parser/Expression", "accept", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionVisitor;)V", true);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$3", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "hasNot", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "leftExpression", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "notIn", "(Ljava/util/Collection;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$2", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;Lorg/eclipse/persistence/expressions/Expression;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Collection"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "leftExpression", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "in", "(Ljava/util/Collection;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$2", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/SimpleSelectStatement;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "buildSubquery", "(Lorg/eclipse/persistence/jpa/jpql/parser/SimpleSelectStatement;)Lorg/eclipse/persistence/queries/ReportQuery;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "hasNot", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "leftExpression", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "notIn", "(Lorg/eclipse/persistence/queries/ReportQuery;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$2", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;Lorg/eclipse/persistence/expressions/Expression;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/queries/ReportQuery"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "leftExpression", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "in", "(Lorg/eclipse/persistence/queries/ReportQuery;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor", "access$2", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$0", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "hasNot", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "singleInputParameter", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$2", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder;Lorg/eclipse/persistence/expressions/Expression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "leftExpression", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$3", "(Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder;)Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor$InExpressionBuilder", "this$0", "Lorg/eclipse/persistence/internal/jpa/jpql/ExpressionBuilderVisitor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
