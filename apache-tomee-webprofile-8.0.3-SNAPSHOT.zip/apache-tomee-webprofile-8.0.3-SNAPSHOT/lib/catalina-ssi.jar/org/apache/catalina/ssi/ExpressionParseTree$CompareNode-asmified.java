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
public class ExpressionParseTree$CompareNodeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_ABSTRACT, "org/apache/catalina/ssi/ExpressionParseTree$CompareNode", null, "org/apache/catalina/ssi/ExpressionParseTree$OppNode", null);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$CompareNode", "org/apache/catalina/ssi/ExpressionParseTree", "CompareNode", ACC_PRIVATE | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$StringNode", "org/apache/catalina/ssi/ExpressionParseTree", "StringNode", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$OppNode", "org/apache/catalina/ssi/ExpressionParseTree", "OppNode", ACC_PRIVATE | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$Node", "org/apache/catalina/ssi/ExpressionParseTree", "Node", ACC_PRIVATE | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/catalina/ssi/ExpressionParseTree;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ssi/ExpressionParseTree$CompareNode", "this$0", "Lorg/apache/catalina/ssi/ExpressionParseTree;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$OppNode", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Lorg/apache/catalina/ssi/ExpressionParseTree$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "compareBranches", "()I", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/util/regex/PatternSyntaxException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/util/regex/PatternSyntaxException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree$CompareNode", "left", "Lorg/apache/catalina/ssi/ExpressionParseTree$Node;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/ssi/ExpressionParseTree$StringNode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/ExpressionParseTree$StringNode", "getValue", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree$CompareNode", "right", "Lorg/apache/catalina/ssi/ExpressionParseTree$Node;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/ssi/ExpressionParseTree$StringNode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/ExpressionParseTree$StringNode", "getValue", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C", false);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitJumpInsn(IF_ICMPNE, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C", false);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitJumpInsn(IF_ICMPNE, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree$CompareNode", "this$0", "Lorg/apache/catalina/ssi/ExpressionParseTree;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/ssi/ExpressionParseTree", "access$700", "(Lorg/apache/catalina/ssi/ExpressionParseTree;)Lorg/apache/catalina/ssi/SSIMediator;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/SSIMediator", "clearMatchGroups", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Pattern", "matcher", "(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "find", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree$CompareNode", "this$0", "Lorg/apache/catalina/ssi/ExpressionParseTree;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/ssi/ExpressionParseTree", "access$700", "(Lorg/apache/catalina/ssi/ExpressionParseTree;)Lorg/apache/catalina/ssi/SSIMediator;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/SSIMediator", "populateMatchGroups", "(Ljava/util/regex/Matcher;)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/catalina/ssi/ExpressionParseTree$CompareNode", "java/lang/String", "java/lang/String", Opcodes.INTEGER, "java/lang/String", "java/util/regex/Pattern", "java/util/regex/Matcher"}, 0, new Object[] {});
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/catalina/ssi/ExpressionParseTree$CompareNode", "java/lang/String", "java/lang/String", Opcodes.INTEGER, "java/lang/String"}, 1, new Object[] {"java/util/regex/PatternSyntaxException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ssi/ExpressionParseTree$CompareNode", "this$0", "Lorg/apache/catalina/ssi/ExpressionParseTree;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/ssi/ExpressionParseTree", "access$700", "(Lorg/apache/catalina/ssi/ExpressionParseTree;)Lorg/apache/catalina/ssi/SSIMediator;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/ssi/ExpressionParseTree", "access$900", "()Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitLdcInsn("expressionParseTree.invalidExpression");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ssi/SSIMediator", "log", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "compareTo", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Lorg/apache/catalina/ssi/ExpressionParseTree$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$CompareNode", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
