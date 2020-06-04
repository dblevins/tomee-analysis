package asm.org.eclipse.persistence.jpa.jpql;
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
public class AbstractGrammarValidator$AbstractDoubleEncapsulatedExpressionHelperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractDoubleEncapsulatedExpressionHelper", "<T:Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;>Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractValidator;Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractEncapsulatedExpressionHelper<TT;>;", "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractValidator", new String[] { "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractEncapsulatedExpressionHelper" });

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractDoubleEncapsulatedExpressionHelper", "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator", "AbstractDoubleEncapsulatedExpressionHelper", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractEncapsulatedExpressionHelper", "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator", "AbstractEncapsulatedExpressionHelper", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractValidator", "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator", "AbstractValidator", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractValidator", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "arguments", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;)[Ljava/lang/String;", "(TT;)[Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/ExpressionTools", "EMPTY_STRING_ARRAY", "[Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "firstExpressionInvalidKey", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "firstExpressionLength", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;)I", "(TT;)I", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractDoubleEncapsulatedExpressionHelper", "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression", "getFirstExpression", "()Lorg/eclipse/persistence/jpa/jpql/parser/Expression;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator", "length", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "firstExpressionMissingKey", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "hasComma", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;)Z", "(TT;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractDoubleEncapsulatedExpressionHelper", "hasFirstExpression", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression", "hasComma", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "hasFirstExpression", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;)Z", "(TT;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression", "hasFirstExpression", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasLeftParenthesis", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;)Z", "(TT;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression", "hasLeftParenthesis", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasRightParenthesis", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;)Z", "(TT;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression", "hasSecondExpression", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression", "hasRightParenthesis", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "hasSecondExpression", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;)Z", "(TT;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression", "hasComma", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression", "hasSecondExpression", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "identifier", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;)Ljava/lang/String;", "(TT;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression", "getIdentifier", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "isFirstExpressionValid", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;)Z", "(TT;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractDoubleEncapsulatedExpressionHelper", "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression", "getFirstExpression", "()Lorg/eclipse/persistence/jpa/jpql/parser/Expression;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression", "parameterExpressionBNF", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator", "isValid", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "isSecondExpressionValid", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;)Z", "(TT;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractDoubleEncapsulatedExpressionHelper", "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression", "getSecondExpression", "()Lorg/eclipse/persistence/jpa/jpql/parser/Expression;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression", "parameterExpressionBNF", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator", "isValid", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "missingCommaKey", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "secondExpressionInvalidKey", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "secondExpressionLength", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;)I", "(TT;)I", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractDoubleEncapsulatedExpressionHelper", "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression", "getSecondExpression", "()Lorg/eclipse/persistence/jpa/jpql/parser/Expression;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator", "length", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "secondExpressionMissingKey", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "identifier", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractEncapsulatedExpression;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractDoubleEncapsulatedExpressionHelper", "identifier", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "arguments", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractEncapsulatedExpression;)[Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractDoubleEncapsulatedExpressionHelper", "arguments", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;)[Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "hasLeftParenthesis", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractEncapsulatedExpression;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractDoubleEncapsulatedExpressionHelper", "hasLeftParenthesis", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "hasRightParenthesis", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractEncapsulatedExpression;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractDoubleEncapsulatedExpressionHelper", "hasRightParenthesis", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractDoubleEncapsulatedExpression;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
