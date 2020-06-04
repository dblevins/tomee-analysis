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
public class AbstractEclipseLinkSemanticValidator$TableExpressionVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TableExpressionVisitor", null, "org/eclipse/persistence/jpa/jpql/parser/AbstractEclipseLinkExpressionVisitor", null);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TableExpressionVisitor", "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator", "TableExpressionVisitor", ACC_PROTECTED | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "expression", "Lorg/eclipse/persistence/jpa/jpql/parser/Expression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "valid", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractEclipseLinkExpressionVisitor", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/TableExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TableExpressionVisitor", "expression", "Lorg/eclipse/persistence/jpa/jpql/parser/Expression;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TableExpressionVisitor"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TableExpressionVisitor", "org/eclipse/persistence/jpa/jpql/parser/TableExpression"}, 2, new Object[] {"org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TableExpressionVisitor", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TableExpressionVisitor", "valid", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
