package asm.org.apache.catalina.ssi;
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
public class ExpressionParseTreeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/catalina/ssi/ExpressionParseTree", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$LessThanNode", "org/apache/catalina/ssi/ExpressionParseTree", "LessThanNode", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$GreaterThanNode", "org/apache/catalina/ssi/ExpressionParseTree", "GreaterThanNode", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$EqualNode", "org/apache/catalina/ssi/ExpressionParseTree", "EqualNode", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$CompareNode", "org/apache/catalina/ssi/ExpressionParseTree", "CompareNode", ACC_PRIVATE | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$OrNode", "org/apache/catalina/ssi/ExpressionParseTree", "OrNode", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$AndNode", "org/apache/catalina/ssi/ExpressionParseTree", "AndNode", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$NotNode", "org/apache/catalina/ssi/ExpressionParseTree", "NotNode", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$OppNode", "org/apache/catalina/ssi/ExpressionParseTree", "OppNode", ACC_PRIVATE | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$StringNode", "org/apache/catalina/ssi/ExpressionParseTree", "StringNode", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$Node", "org/apache/catalina/ssi/ExpressionParseTree", "Node", ACC_PRIVATE | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "sm", "Lorg/apache/tomcat/util/res/StringManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "nodeStack", "Ljava/util/LinkedList;", "Ljava/util/LinkedList<Lorg/apache/catalina/ssi/ExpressionParseTree$Node;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "oppStack", "Ljava/util/LinkedList;", "Ljava/util/LinkedList<Lorg/apache/catalina/ssi/ExpressionParseTree$OppNode;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "root", "Lorg/apache/catalina/ssi/ExpressionParseTree$Node;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ssiMediator", "Lorg/apache/catalina/ssi/SSIMediator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PRECEDENCE_NOT", "I", null, new Integer(5));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PRECEDENCE_COMPARE", "I", null, new Integer(4));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PRECEDENCE_LOGICAL", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Lorg/apache/catalina/ssi/SSIMediator;)V", null, new String[] { "java/text/ParseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "nodeStack", "Ljava/util/LinkedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "oppStack", "Ljava/util/LinkedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "ssiMediator", "Lorg/apache/catalina/ssi/SSIMediator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree", "parseExpression", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluateTree", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "root", "Lorg/apache/catalina/ssi/ExpressionParseTree$Node;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/ExpressionParseTree$Node", "evaluate", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "pushOpp", "(Lorg/apache/catalina/ssi/ExpressionParseTree$OppNode;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "oppStack", "Ljava/util/LinkedList;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "add", "(ILjava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "oppStack", "Ljava/util/LinkedList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "size", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "oppStack", "Ljava/util/LinkedList;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "get", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/ssi/ExpressionParseTree$OppNode");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/catalina/ssi/ExpressionParseTree$OppNode"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/ExpressionParseTree$OppNode", "getPrecedence", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/ExpressionParseTree$OppNode", "getPrecedence", "()I", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label4);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "oppStack", "Ljava/util/LinkedList;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "nodeStack", "Ljava/util/LinkedList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/ExpressionParseTree$OppNode", "popValues", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "nodeStack", "Ljava/util/LinkedList;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "add", "(ILjava/lang/Object;)V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "oppStack", "Ljava/util/LinkedList;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "add", "(ILjava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "resolveGroup", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/catalina/ssi/ExpressionParseTree$OppNode"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "oppStack", "Ljava/util/LinkedList;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/ssi/ExpressionParseTree$OppNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "nodeStack", "Ljava/util/LinkedList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/ExpressionParseTree$OppNode", "popValues", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "nodeStack", "Ljava/util/LinkedList;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "add", "(ILjava/lang/Object;)V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "parseExpression", "(Ljava/lang/String;)V", null, new String[] { "java/text/ParseException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree", "pushOpp", "(Lorg/apache/catalina/ssi/ExpressionParseTree$OppNode;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/ssi/ExpressionTokenizer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionTokenizer", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/catalina/ssi/ExpressionParseTree$StringNode", "org/apache/catalina/ssi/ExpressionTokenizer"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/ExpressionTokenizer", "hasMoreTokens", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/ExpressionTokenizer", "nextToken", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
methodVisitor.visitTableSwitchInsn(0, 12, label15, new Label[] { label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15 });
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label16);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/ssi/ExpressionParseTree$StringNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/ExpressionTokenizer", "getTokenValue", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$StringNode", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "nodeStack", "Ljava/util/LinkedList;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "add", "(ILjava/lang/Object;)V", false);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree$StringNode", "value", "Ljava/lang/StringBuilder;");
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree$StringNode", "value", "Ljava/lang/StringBuilder;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/ExpressionTokenizer", "getTokenValue", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/ssi/ExpressionParseTree$AndNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$AndNode", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Lorg/apache/catalina/ssi/ExpressionParseTree$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree", "pushOpp", "(Lorg/apache/catalina/ssi/ExpressionParseTree$OppNode;)V", false);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/ssi/ExpressionParseTree$OrNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$OrNode", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Lorg/apache/catalina/ssi/ExpressionParseTree$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree", "pushOpp", "(Lorg/apache/catalina/ssi/ExpressionParseTree$OppNode;)V", false);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/ssi/ExpressionParseTree$NotNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$NotNode", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Lorg/apache/catalina/ssi/ExpressionParseTree$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree", "pushOpp", "(Lorg/apache/catalina/ssi/ExpressionParseTree$OppNode;)V", false);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/ssi/ExpressionParseTree$EqualNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$EqualNode", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Lorg/apache/catalina/ssi/ExpressionParseTree$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree", "pushOpp", "(Lorg/apache/catalina/ssi/ExpressionParseTree$OppNode;)V", false);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/ssi/ExpressionParseTree$NotNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$NotNode", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Lorg/apache/catalina/ssi/ExpressionParseTree$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree", "pushOpp", "(Lorg/apache/catalina/ssi/ExpressionParseTree$OppNode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "oppStack", "Ljava/util/LinkedList;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/ssi/ExpressionParseTree$EqualNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$EqualNode", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Lorg/apache/catalina/ssi/ExpressionParseTree$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "add", "(ILjava/lang/Object;)V", false);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree", "resolveGroup", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree", "pushOpp", "(Lorg/apache/catalina/ssi/ExpressionParseTree$OppNode;)V", false);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/ssi/ExpressionParseTree$NotNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$NotNode", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Lorg/apache/catalina/ssi/ExpressionParseTree$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree", "pushOpp", "(Lorg/apache/catalina/ssi/ExpressionParseTree$OppNode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "oppStack", "Ljava/util/LinkedList;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/ssi/ExpressionParseTree$LessThanNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$LessThanNode", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Lorg/apache/catalina/ssi/ExpressionParseTree$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "add", "(ILjava/lang/Object;)V", false);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/ssi/ExpressionParseTree$NotNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$NotNode", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Lorg/apache/catalina/ssi/ExpressionParseTree$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree", "pushOpp", "(Lorg/apache/catalina/ssi/ExpressionParseTree$OppNode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "oppStack", "Ljava/util/LinkedList;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/ssi/ExpressionParseTree$GreaterThanNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$GreaterThanNode", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Lorg/apache/catalina/ssi/ExpressionParseTree$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "add", "(ILjava/lang/Object;)V", false);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/ssi/ExpressionParseTree$GreaterThanNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$GreaterThanNode", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Lorg/apache/catalina/ssi/ExpressionParseTree$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree", "pushOpp", "(Lorg/apache/catalina/ssi/ExpressionParseTree$OppNode;)V", false);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/ssi/ExpressionParseTree$LessThanNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$LessThanNode", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Lorg/apache/catalina/ssi/ExpressionParseTree$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree", "pushOpp", "(Lorg/apache/catalina/ssi/ExpressionParseTree$OppNode;)V", false);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree", "resolveGroup", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "nodeStack", "Ljava/util/LinkedList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "size", "()I", false);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFNE, label17);
methodVisitor.visitTypeInsn(NEW, "java/text/ParseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/ssi/ExpressionParseTree", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("expressionParseTree.noNodes");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/ExpressionTokenizer", "getIndex", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/text/ParseException", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "nodeStack", "Ljava/util/LinkedList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
Label label18 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label18);
methodVisitor.visitTypeInsn(NEW, "java/text/ParseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/ssi/ExpressionParseTree", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("expressionParseTree.extraNodes");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/ExpressionTokenizer", "getIndex", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/text/ParseException", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "oppStack", "Ljava/util/LinkedList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "size", "()I", false);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label19);
methodVisitor.visitTypeInsn(NEW, "java/text/ParseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/ssi/ExpressionParseTree", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("expressionParseTree.unusedOpCodes");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/ExpressionTokenizer", "getIndex", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/text/ParseException", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "nodeStack", "Ljava/util/LinkedList;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "get", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/ssi/ExpressionParseTree$Node");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "root", "Lorg/apache/catalina/ssi/ExpressionParseTree$Node;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lorg/apache/catalina/ssi/ExpressionParseTree;)Lorg/apache/catalina/ssi/SSIMediator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree", "ssiMediator", "Lorg/apache/catalina/ssi/SSIMediator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$900", "()Lorg/apache/tomcat/util/res/StringManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/ssi/ExpressionParseTree", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/ssi/ExpressionParseTree;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/res/StringManager", "getManager", "(Ljava/lang/Class;)Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/ssi/ExpressionParseTree", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
