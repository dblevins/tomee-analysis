package asm.org.apache.openjpa.persistence.criteria;
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
public class Expressions$SimpleCaseDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "<C:Ljava/lang/Object;R:Ljava/lang/Object;>Lorg/apache/openjpa/persistence/criteria/ExpressionImpl<TR;>;Ljakarta/persistence/criteria/CriteriaBuilder$SimpleCase<TC;TR;>;", "org/apache/openjpa/persistence/criteria/ExpressionImpl", new String[] { "jakarta/persistence/criteria/CriteriaBuilder$SimpleCase" });

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "org/apache/openjpa/persistence/criteria/Expressions", "SimpleCase", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("jakarta/persistence/criteria/CriteriaBuilder$SimpleCase", "jakarta/persistence/criteria/CriteriaBuilder", "SimpleCase", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Constant", "org/apache/openjpa/persistence/criteria/Expressions", "Constant", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "thens", "Ljava/util/List;", "Ljava/util/List<Ljakarta/persistence/criteria/Expression<+TR;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "whens", "Ljava/util/List;", "Ljava/util/List<Ljakarta/persistence/criteria/Expression<TC;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "otherwise", "Ljakarta/persistence/criteria/Expression;", "Ljakarta/persistence/criteria/Expression<+TR;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "caseOperand", "Ljakarta/persistence/criteria/Expression;", "Ljakarta/persistence/criteria/Expression<TC;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Class;)V", "(Ljava/lang/Class<TR;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ExpressionImpl", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "thens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "whens", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/persistence/criteria/Expression;)V", "(Ljakarta/persistence/criteria/Expression<TC;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ExpressionImpl", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "thens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "whens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "caseOperand", "Ljakarta/persistence/criteria/Expression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExpression", "()Ljakarta/persistence/criteria/Expression;", "()Ljakarta/persistence/criteria/Expression<TC;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "caseOperand", "Ljakarta/persistence/criteria/Expression;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "when", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase;", "(Ljakarta/persistence/criteria/Expression<TC;>;Ljakarta/persistence/criteria/Expression<+TR;>;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase<TC;TR;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "whens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "thens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "when", "(Ljava/lang/Object;Ljakarta/persistence/criteria/Expression;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase;", "(TC;Ljakarta/persistence/criteria/Expression<+TR;>;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase<TC;TR;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Constant");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Constant", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "when", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "when", "(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase;", "(TC;TR;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase<TC;TR;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Constant");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Constant", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "when", "(Ljava/lang/Object;Ljakarta/persistence/criteria/Expression;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "otherwise", "(Ljakarta/persistence/criteria/Expression;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase;", "(Ljakarta/persistence/criteria/Expression<+TR;>;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase<TC;TR;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "otherwise", "Ljakarta/persistence/criteria/Expression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "otherwise", "(Ljava/lang/Object;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase;", "(TR;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase<TC;TR;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Constant");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Constant", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "otherwise", "(Ljakarta/persistence/criteria/Expression;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toValue", "(Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl;)Lorg/apache/openjpa/kernel/exps/Value;", "(Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl<*>;)Lorg/apache/openjpa/kernel/exps/Value;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "caseOperand", "Ljakarta/persistence/criteria/Expression;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/criteria/ExpressionImpl");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Expressions", "toValue", "(Lorg/apache/openjpa/persistence/criteria/ExpressionImpl;Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl;)Lorg/apache/openjpa/kernel/exps/Value;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "whens", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/kernel/exps/Expression");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "org/apache/openjpa/kernel/exps/ExpressionFactory", "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "org/apache/openjpa/kernel/exps/Value", Opcodes.INTEGER, "[Lorg/apache/openjpa/kernel/exps/Expression;", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "whens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/criteria/ExpressionImpl");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Expressions", "toValue", "(Lorg/apache/openjpa/persistence/criteria/ExpressionImpl;Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl;)Lorg/apache/openjpa/kernel/exps/Value;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "thens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/criteria/ExpressionImpl");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Expressions", "toValue", "(Lorg/apache/openjpa/persistence/criteria/ExpressionImpl;Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl;)Lorg/apache/openjpa/kernel/exps/Value;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/ExpressionFactory", "whenScalar", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", true);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "otherwise", "Ljakarta/persistence/criteria/Expression;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/criteria/ExpressionImpl");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Expressions", "toValue", "(Lorg/apache/openjpa/persistence/criteria/ExpressionImpl;Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl;)Lorg/apache/openjpa/kernel/exps/Value;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/ExpressionFactory", "simpleCaseExpression", "(Lorg/apache/openjpa/kernel/exps/Value;[Lorg/apache/openjpa/kernel/exps/Expression;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "acceptVisit", "(Lorg/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor", "enter", "(Lorg/apache/openjpa/persistence/criteria/CriteriaExpression;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/persistence/criteria/Expression");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "caseOperand", "Ljakarta/persistence/criteria/Expression;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Expressions", "visitChildren", "(Lorg/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor;[Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "whens", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/persistence/criteria/Expression");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "whens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/criteria/Expression");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Expressions", "visitChildren", "(Lorg/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor;[Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/persistence/criteria/Expression");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "thens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/criteria/Expression");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Expressions", "visitChildren", "(Lorg/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor;[Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/persistence/criteria/Expression");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "otherwise", "Ljakarta/persistence/criteria/Expression;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Expressions", "visitChildren", "(Lorg/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor;[Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor", "exit", "(Lorg/apache/openjpa/persistence/criteria/CriteriaExpression;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asValue", "(Lorg/apache/openjpa/persistence/criteria/AliasContext;)Ljava/lang/StringBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CASE ");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "whens", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/StringBuilder", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(" WHEN ");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "whens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn(" THEN ");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "thens", "Ljava/util/List;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Expressions", "asValue", "(Lorg/apache/openjpa/persistence/criteria/AliasContext;[Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(" ELSE ");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "otherwise", "Ljakarta/persistence/criteria/Expression;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn(" END");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Expressions", "asValue", "(Lorg/apache/openjpa/persistence/criteria/AliasContext;[Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "isNull", "()Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ExpressionImpl", "isNull", "()Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "isNotNull", "()Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ExpressionImpl", "isNotNull", "()Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "in", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ExpressionImpl", "in", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "in", "(Ljava/util/Collection;)Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ExpressionImpl", "in", "(Ljava/util/Collection;)Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "in", "([Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ExpressionImpl", "in", "([Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "in", "([Ljava/lang/Object;)Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ExpressionImpl", "in", "([Ljava/lang/Object;)Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "as", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/Expression;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ExpressionImpl", "as", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/Expression;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "asProjection", "(Lorg/apache/openjpa/persistence/criteria/AliasContext;)Ljava/lang/StringBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ExpressionImpl", "asProjection", "(Lorg/apache/openjpa/persistence/criteria/AliasContext;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "asVariable", "(Lorg/apache/openjpa/persistence/criteria/AliasContext;)Ljava/lang/StringBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ExpressionImpl", "asVariable", "(Lorg/apache/openjpa/persistence/criteria/AliasContext;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "isCompoundSelection", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ExpressionImpl", "isCompoundSelection", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getCompoundSelectionItems", "()Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ExpressionImpl", "getCompoundSelectionItems", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "alias", "(Ljava/lang/String;)Ljakarta/persistence/criteria/Selection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ExpressionImpl", "alias", "(Ljava/lang/String;)Ljakarta/persistence/criteria/Selection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getAlias", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ExpressionImpl", "getAlias", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getJavaType", "()Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ExpressionImpl", "getJavaType", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "otherwise", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "otherwise", "(Ljakarta/persistence/criteria/Expression;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "otherwise", "(Ljava/lang/Object;)Ljakarta/persistence/criteria/Expression;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "otherwise", "(Ljava/lang/Object;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "when", "(Ljava/lang/Object;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/CriteriaBuilder$SimpleCase;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "when", "(Ljava/lang/Object;Ljakarta/persistence/criteria/Expression;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "when", "(Ljava/lang/Object;Ljava/lang/Object;)Ljakarta/persistence/criteria/CriteriaBuilder$SimpleCase;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "when", "(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/openjpa/persistence/criteria/Expressions$SimpleCase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
