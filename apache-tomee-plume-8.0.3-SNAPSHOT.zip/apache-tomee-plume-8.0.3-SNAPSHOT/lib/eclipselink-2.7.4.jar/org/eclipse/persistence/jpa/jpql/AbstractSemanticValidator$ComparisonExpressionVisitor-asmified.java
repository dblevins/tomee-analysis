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
public class AbstractSemanticValidator$ComparisonExpressionVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", null, "org/eclipse/persistence/jpa/jpql/parser/AnonymousExpressionVisitor", null);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator", "ComparisonExpressionVisitor", ACC_PROTECTED | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator", "PathType", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "leftIdentificationVariable", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "leftIdentificationVariableValid", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "leftStateFieldPathExpression", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "leftStateFieldPathExpressionValid", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "rightIdentificationVariable", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "rightIdentificationVariableValid", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "rightStateFieldPathExpression", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "rightStateFieldPathExpressionValid", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "validatingLeftExpression", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/AnonymousExpressionVisitor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "dispose", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "leftIdentificationVariable", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "leftIdentificationVariableValid", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "leftStateFieldPathExpression", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "leftStateFieldPathExpressionValid", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "rightIdentificationVariable", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "rightIdentificationVariableValid", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "rightStateFieldPathExpression", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "rightStateFieldPathExpressionValid", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/parser/Expression", "accept", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionVisitor;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/IdentificationVariable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator", "helper", "Lorg/eclipse/persistence/jpa/jpql/SemanticValidatorHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/IdentificationVariable", "getVariableName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/SemanticValidatorHelper", "isResultVariable", "(Ljava/lang/String;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "validatingLeftExpression", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/IdentificationVariable", "isVirtual", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitInsn(ICONST_0);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor"});
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "org/eclipse/persistence/jpa/jpql/parser/IdentificationVariable"}, 2, new Object[] {"org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "leftIdentificationVariable", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator", "validateIdentificationVariable", "(Lorg/eclipse/persistence/jpa/jpql/parser/IdentificationVariable;)Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "leftIdentificationVariableValid", "Z");
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/IdentificationVariable", "isVirtual", "()Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitInsn(ICONST_0);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor"});
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "org/eclipse/persistence/jpa/jpql/parser/IdentificationVariable"}, 2, new Object[] {"org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "rightIdentificationVariable", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator", "validateIdentificationVariable", "(Lorg/eclipse/persistence/jpa/jpql/parser/IdentificationVariable;)Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "rightIdentificationVariableValid", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/StateFieldPathExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "validatingLeftExpression", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "leftStateFieldPathExpression", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "ANY_FIELD_INCLUDING_COLLECTION", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator", "validateStateFieldPathExpression", "(Lorg/eclipse/persistence/jpa/jpql/parser/StateFieldPathExpression;Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;)Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "leftStateFieldPathExpressionValid", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "rightStateFieldPathExpression", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "ANY_FIELD_INCLUDING_COLLECTION", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator", "validateStateFieldPathExpression", "(Lorg/eclipse/persistence/jpa/jpql/parser/StateFieldPathExpression;Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;)Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "rightStateFieldPathExpressionValid", "Z");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator;Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1", "(Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$ComparisonExpressionVisitor", "dispose", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
