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
public class CriteriaBuilderImpl$CoalesceImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CoalesceImpl", "<X:Ljava/lang/Object;>Lorg/eclipse/persistence/internal/jpa/querydef/FunctionExpressionImpl<TX;>;Ljavax/persistence/criteria/CriteriaBuilder$Coalesce<TX;>;", "org/eclipse/persistence/internal/jpa/querydef/FunctionExpressionImpl", new String[] { "javax/persistence/criteria/CriteriaBuilder$Coalesce" });

classWriter.visitInnerClass("javax/persistence/criteria/CriteriaBuilder$Coalesce", "javax/persistence/criteria/CriteriaBuilder", "Coalesce", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CoalesceImpl", "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl", "CoalesceImpl", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljava/util/List;)V", "<T:Ljava/lang/Object;>(Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class<TX;>;Lorg/eclipse/persistence/expressions/Expression;Ljava/util/List<Ljavax/persistence/criteria/Expression<*>;>;)V", null);
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
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljava/util/List;Ljava/lang/String;)V", "<T:Ljava/lang/Object;>(Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class<TX;>;Lorg/eclipse/persistence/expressions/Expression;Ljava/util/List<Ljavax/persistence/criteria/Expression<*>;>;Ljava/lang/String;)V", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "value", "(Ljava/lang/Object;)Ljavax/persistence/criteria/CriteriaBuilder$Coalesce;", "(TX;)Ljavax/persistence/criteria/CriteriaBuilder$Coalesce<TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/expressions/ExpressionBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/expressions/ExpressionBuilder", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/Expression", "from", "(Ljava/lang/Object;Lorg/eclipse/persistence/expressions/Expression;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CoalesceImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/expressions/FunctionExpression");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/FunctionExpression", "addChild", "(Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "value", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/CriteriaBuilder$Coalesce;", "(Ljavax/persistence/criteria/Expression<+TX;>;)Ljavax/persistence/criteria/CriteriaBuilder$Coalesce<TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/querydef/InternalSelection");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/jpa/querydef/InternalSelection", "getCurrentNode", "()Lorg/eclipse/persistence/expressions/Expression;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CoalesceImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/Expression", "from", "(Ljava/lang/Object;Lorg/eclipse/persistence/expressions/Expression;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/CriteriaBuilderImpl$CoalesceImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/expressions/FunctionExpression");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/FunctionExpression", "addChild", "(Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
