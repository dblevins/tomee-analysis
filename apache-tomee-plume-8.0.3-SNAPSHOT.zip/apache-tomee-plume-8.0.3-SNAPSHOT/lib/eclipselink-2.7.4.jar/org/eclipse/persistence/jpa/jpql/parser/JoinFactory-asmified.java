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
public class JoinFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/jpa/jpql/parser/JoinFactory", null, "org/eclipse/persistence/jpa/jpql/parser/ExpressionFactory", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ID", "Ljava/lang/String;", null, "JOIN");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("JOIN");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("LEFT");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("INNER");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("JOIN");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("OUTER");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("FETCH");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/ExpressionFactory", "<init>", "(Ljava/lang/String;[Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "buildExpression", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Lorg/eclipse/persistence/jpa/jpql/WordParser;Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Z)Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "position", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("JOIN");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitIincInsn(7, 4);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "whitespaceCount", "(I)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("FETCH");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("JOIN FETCH");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("JOIN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("LEFT");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitIincInsn(7, 4);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "whitespaceCount", "(I)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("OUTER");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitIincInsn(7, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "whitespaceCount", "(I)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("JOIN");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitIincInsn(7, 4);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "whitespaceCount", "(I)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("FETCH");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("LEFT OUTER JOIN FETCH");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("LEFT OUTER JOIN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("INNER");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitIincInsn(7, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "whitespaceCount", "(I)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("JOIN");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitIincInsn(7, 4);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "whitespaceCount", "(I)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("FETCH");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("LEFT OUTER INNER JOIN FETCH");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("LEFT OUTER INNER JOIN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("LEFT OUTER INNER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("LEFT OUTER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("JOIN");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitIincInsn(7, 4);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "whitespaceCount", "(I)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("FETCH");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("LEFT JOIN FETCH");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("LEFT JOIN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("INNER");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitIincInsn(7, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "whitespaceCount", "(I)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("JOIN");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitIincInsn(7, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "whitespaceCount", "(I)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("FETCH");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("LEFT INNER JOIN FETCH");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("LEFT INNER JOIN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("LEFT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("INNER");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label14);
methodVisitor.visitIincInsn(7, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "whitespaceCount", "(I)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("JOIN");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label15);
methodVisitor.visitIincInsn(7, 4);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "whitespaceCount", "(I)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("FETCH");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label16);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("INNER JOIN FETCH");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("INNER JOIN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("INNER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("OUTER");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label17);
methodVisitor.visitIincInsn(7, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "whitespaceCount", "(I)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("JOIN");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label18);
methodVisitor.visitIincInsn(7, 4);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "whitespaceCount", "(I)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("FETCH");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label19);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("OUTER JOIN FETCH");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("OUTER JOIN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("INNER");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label20 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label20);
methodVisitor.visitIincInsn(7, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "whitespaceCount", "(I)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("JOIN");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitIincInsn(7, 4);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "whitespaceCount", "(I)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("FETCH");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/WordParser", "startsWithIdentifier", "(Ljava/lang/CharSequence;I)Z", false);
Label label21 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label21);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("OUTER INNER JOIN FETCH");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("OUTER INNER JOIN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/Join");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("OUTER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/Join", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractExpression;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractExpression", "parse", "(Lorg/eclipse/persistence/jpa/jpql/WordParser;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
