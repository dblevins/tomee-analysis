package asm.org.eclipse.persistence.jpa.jpql.parser;
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
public class FunctionExpressionFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory", null, "org/eclipse/persistence/jpa/jpql/parser/ExpressionFactory", null);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory$ParameterCount", "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory", "ParameterCount", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parameterCount", "Lorg/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory$ParameterCount;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parameterQueryBNFId", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ID", "Ljava/lang/String;", null, "FUNCTION");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory$ParameterCount;Ljava/lang/String;[Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/ExpressionFactory", "<init>", "(Ljava/lang/String;[Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory", "setParameterCount", "(Lorg/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory$ParameterCount;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory", "setParameterQueryBNFId", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "<init>", "(Ljava/lang/String;[Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory$ParameterCount", "ZERO_OR_MANY", "Lorg/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory$ParameterCount;");
methodVisitor.visitLdcInsn("function_item");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory$ParameterCount;Ljava/lang/String;[Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "buildExpression", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Lorg/eclipse/persistence/jpa/jpql/WordParser;Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Z)Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory", "identifiers", "()[Ljava/lang/String;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 9);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory", "org/eclipse/persistence/jpa/jpql/parser/AbstractExpression", "org/eclipse/persistence/jpa/jpql/WordParser", "java/lang/String", "org/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF", "org/eclipse/persistence/jpa/jpql/parser/AbstractExpression", Opcodes.INTEGER, "java/lang/String", Opcodes.TOP, Opcodes.INTEGER, Opcodes.INTEGER, "[Ljava/lang/String;"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory", "org/eclipse/persistence/jpa/jpql/parser/AbstractExpression", "org/eclipse/persistence/jpa/jpql/WordParser", "java/lang/String", "org/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF", "org/eclipse/persistence/jpa/jpql/parser/AbstractExpression", Opcodes.INTEGER, "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 7);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jpa/jpql/ExpressionTools", "isFunctionExpression", "(Lorg/eclipse/persistence/jpa/jpql/WordParser;Ljava/lang/String;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpression");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory", "parameterCount", "Lorg/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory$ParameterCount;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory", "parameterQueryBNFId", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpression", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory$ParameterCount;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractExpression", "parse", "(Lorg/eclipse/persistence/jpa/jpql/WordParser;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setParameterCount", "(Lorg/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory$ParameterCount;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("The ParameterCount cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jpa/jpql/Assert", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory", "parameterCount", "Lorg/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory$ParameterCount;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setParameterQueryBNFId", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("The JPQLQueryBNF for the parameters cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jpa/jpql/Assert", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory", "parameterQueryBNFId", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
