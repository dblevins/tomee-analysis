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
public class AbstractGrammarValidator$27Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$27", "Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractSingleEncapsulatedExpressionHelper<Lorg/eclipse/persistence/jpa/jpql/parser/ValueExpression;>;", "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractSingleEncapsulatedExpressionHelper", null);

classWriter.visitOuterClass("org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator", "buildValueExpressionHelper", "()Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractSingleEncapsulatedExpressionHelper;");

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$27", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractSingleEncapsulatedExpressionHelper", "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator", "AbstractSingleEncapsulatedExpressionHelper", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$27", "this$0", "Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$AbstractSingleEncapsulatedExpressionHelper", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "encapsulatedExpressionInvalidKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/ValueExpression;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("VALUE_EXPRESSION_INVALID_EXPRESSION");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "encapsulatedExpressionMissingKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/ValueExpression;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("VALUE_EXPRESSION_MISSING_EXPRESSION");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "isEncapsulatedExpressionValid", "(Lorg/eclipse/persistence/jpa/jpql/parser/ValueExpression;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$27", "this$0", "Lorg/eclipse/persistence/jpa/jpql/AbstractGrammarValidator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/ValueExpression", "getExpression", "()Lorg/eclipse/persistence/jpa/jpql/parser/Expression;", false);
methodVisitor.visitLdcInsn("identification_variable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator", "isValid", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "leftParenthesisMissingKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/ValueExpression;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("VALUE_EXPRESSION_MISSING_LEFT_PARENTHESIS");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rightParenthesisMissingKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/ValueExpression;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("VALUE_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "isEncapsulatedExpressionValid", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractSingleEncapsulatedExpression;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/parser/ValueExpression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$27", "isEncapsulatedExpressionValid", "(Lorg/eclipse/persistence/jpa/jpql/parser/ValueExpression;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "encapsulatedExpressionInvalidKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractSingleEncapsulatedExpression;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/parser/ValueExpression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$27", "encapsulatedExpressionInvalidKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/ValueExpression;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "rightParenthesisMissingKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractEncapsulatedExpression;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/parser/ValueExpression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$27", "rightParenthesisMissingKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/ValueExpression;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "encapsulatedExpressionMissingKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractSingleEncapsulatedExpression;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/parser/ValueExpression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$27", "encapsulatedExpressionMissingKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/ValueExpression;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "leftParenthesisMissingKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractEncapsulatedExpression;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/parser/ValueExpression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractGrammarValidator$27", "leftParenthesisMissingKey", "(Lorg/eclipse/persistence/jpa/jpql/parser/ValueExpression;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
