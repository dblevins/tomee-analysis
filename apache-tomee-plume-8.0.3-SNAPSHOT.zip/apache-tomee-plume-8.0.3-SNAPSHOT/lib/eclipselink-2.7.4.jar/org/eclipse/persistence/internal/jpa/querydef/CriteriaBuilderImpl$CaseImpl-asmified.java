package asm.org.eclipse.persistence.internal.jpa.querydef;
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
public class CriteriaBuilderImpl$CaseImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CaseImpl", "<R:Ljava/lang/Object;>Lorg/eclipse/persistence/internal/jpa/querydef/FunctionExpressionImpl<TR;>;Ljavax/persistence/criteria/CriteriaBuilder$Case<TR;>;", "org/eclipse/persistence/internal/jpa/querydef/FunctionExpressionImpl", new String[] { "javax/persistence/criteria/CriteriaBuilder$Case" });

classWriter.visitInnerClass("javax/persistence/criteria/CriteriaBuilder$Case", "javax/persistence/criteria/CriteriaBuilder", "Case", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CaseImpl", "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl", "CaseImpl", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljava/util/List;)V", "<T:Ljava/lang/Object;>(Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class<TR;>;Lorg/eclipse/persistence/expressions/Expression;Ljava/util/List<Ljavax/persistence/criteria/Expression<*>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/FunctionExpressionImpl", "<init>", "(Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljava/util/List;Ljava/lang/String;)V", "<T:Ljava/lang/Object;>(Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class<TR;>;Lorg/eclipse/persistence/expressions/Expression;Ljava/util/List<Ljavax/persistence/criteria/Expression<*>;>;Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/FunctionExpressionImpl", "<init>", "(Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljava/util/List;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "when", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)Ljavax/persistence/criteria/CriteriaBuilder$Case;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;TR;)Ljavax/persistence/criteria/CriteriaBuilder$Case<TR;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/querydef/InternalSelection");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/jpa/querydef/InternalSelection", "getCurrentNode", "()Lorg/eclipse/persistence/expressions/Expression;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CaseImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/Expression", "from", "(Ljava/lang/Object;Lorg/eclipse/persistence/expressions/Expression;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CaseImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/expressions/FunctionExpression");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/FunctionExpression", "addChild", "(Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/expressions/ExpressionBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/expressions/ExpressionBuilder", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/Expression", "from", "(Ljava/lang/Object;Lorg/eclipse/persistence/expressions/Expression;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CaseImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/expressions/FunctionExpression");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/FunctionExpression", "addChild", "(Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "when", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/CriteriaBuilder$Case;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;Ljavax/persistence/criteria/Expression<+TR;>;)Ljavax/persistence/criteria/CriteriaBuilder$Case<TR;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/querydef/InternalSelection");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/jpa/querydef/InternalSelection", "getCurrentNode", "()Lorg/eclipse/persistence/expressions/Expression;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CaseImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/Expression", "from", "(Ljava/lang/Object;Lorg/eclipse/persistence/expressions/Expression;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CaseImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/expressions/FunctionExpression");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/FunctionExpression", "addChild", "(Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/querydef/InternalSelection");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/jpa/querydef/InternalSelection", "getCurrentNode", "()Lorg/eclipse/persistence/expressions/Expression;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CaseImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/Expression", "from", "(Ljava/lang/Object;Lorg/eclipse/persistence/expressions/Expression;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CaseImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/expressions/FunctionExpression");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/FunctionExpression", "addChild", "(Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "otherwise", "(Ljava/lang/Object;)Ljavax/persistence/criteria/Expression;", "(TR;)Ljavax/persistence/criteria/Expression<TR;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/expressions/ExpressionBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/expressions/ExpressionBuilder", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/Expression", "from", "(Ljava/lang/Object;Lorg/eclipse/persistence/expressions/Expression;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CaseImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/expressions/ArgumentListFunctionExpression");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/ArgumentListFunctionExpression", "addRightMostChild", "(Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "otherwise", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+TR;>;)Ljavax/persistence/criteria/Expression<TR;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/querydef/InternalSelection");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/jpa/querydef/InternalSelection", "getCurrentNode", "()Lorg/eclipse/persistence/expressions/Expression;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CaseImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/Expression", "from", "(Ljava/lang/Object;Lorg/eclipse/persistence/expressions/Expression;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CaseImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/expressions/ArgumentListFunctionExpression");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/ArgumentListFunctionExpression", "addRightMostChild", "(Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
