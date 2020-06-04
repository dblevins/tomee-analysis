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
public class AbstractGrammarValidator$22Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$22", "Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractTripleEncapsulatedExpressionHelper<Lorg/eclipse/persistence/jpa/jpql/parser/SubstringExpression;>;", "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractTripleEncapsulatedExpressionHelper", null);

classWriter.visitOuterClass("org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator", "buildSubstringExpressionHelper", "()Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractTripleEncapsulatedExpressionHelper;");

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$22", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractTripleEncapsulatedExpressionHelper", "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator", "AbstractTripleEncapsulatedExpressionHelper", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$22", "this$0", "Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractTripleEncapsulatedExpressionHelper", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "firstCommaMissingKey", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("SUBSTRING_EXPRESSION_MISSING_FIRST_COMMA");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "firstExpressionInvalidKey", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("SUBSTRING_EXPRESSION_INVALID_FIRST_EXPRESSION");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "firstExpressionMissingKey", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("SUBSTRING_EXPRESSION_MISSING_FIRST_EXPRESSION");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "identifier", "(Lorg/eclipse/persistence/jpa/jpql/parser/SubstringExpression;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("SUBSTRING");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "leftParenthesisMissingKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/SubstringExpression;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("SUBSTRING_EXPRESSION_MISSING_LEFT_PARENTHESIS");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rightParenthesisMissingKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/SubstringExpression;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("SUBSTRING_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "secondCommaMissingKey", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("SUBSTRING_EXPRESSION_MISSING_SECOND_COMMA");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "secondExpressionInvalidKey", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("SUBSTRING_EXPRESSION_INVALID_SECOND_EXPRESSION");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "secondExpressionMissingKey", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("SUBSTRING_EXPRESSION_MISSING_SECOND_EXPRESSION");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "thirdExpressionInvalidKey", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("SUBSTRING_EXPRESSION_INVALID_THIRD_EXPRESSION");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "thirdExpressionMissingKey", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("SUBSTRING_EXPRESSION_MISSING_THIRD_EXPRESSION");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "identifier", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractEncapsulatedExpression;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/parser/SubstringExpression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$22", "identifier", "(Lorg/eclipse/persistence/jpa/jpql/parser/SubstringExpression;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "rightParenthesisMissingKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractEncapsulatedExpression;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/parser/SubstringExpression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$22", "rightParenthesisMissingKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/SubstringExpression;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "leftParenthesisMissingKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractEncapsulatedExpression;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/parser/SubstringExpression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$22", "leftParenthesisMissingKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/SubstringExpression;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
