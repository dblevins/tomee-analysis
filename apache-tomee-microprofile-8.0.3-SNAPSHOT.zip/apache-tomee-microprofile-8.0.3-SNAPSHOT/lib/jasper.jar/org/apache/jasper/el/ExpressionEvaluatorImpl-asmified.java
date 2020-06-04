package asm.org.apache.jasper.el;
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
public class ExpressionEvaluatorImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_DEPRECATED, "org/apache/jasper/el/ExpressionEvaluatorImpl", null, "javax/servlet/jsp/el/ExpressionEvaluator", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "factory", "Ljavax/el/ExpressionFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/el/ExpressionFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/el/ExpressionEvaluator", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/el/ExpressionEvaluatorImpl", "factory", "Ljavax/el/ExpressionFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parseExpression", "(Ljava/lang/String;Ljava/lang/Class;Ljavax/servlet/jsp/el/FunctionMapper;)Ljavax/servlet/jsp/el/Expression;", null, new String[] { "javax/servlet/jsp/el/ELException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/el/ELException");
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/jasper/el/ELContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/el/ExpressionEvaluatorImpl", "factory", "Ljavax/el/ExpressionFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/el/ELContextImpl", "getDefaultResolver", "(Ljavax/el/ExpressionFactory;)Ljavax/el/ELResolver;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/el/ELContextImpl", "<init>", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/jasper/el/FunctionMapperImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/el/FunctionMapperImpl", "<init>", "(Ljavax/servlet/jsp/el/FunctionMapper;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/el/ELContextImpl", "setFunctionMapper", "(Ljavax/el/FunctionMapper;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/jasper/el/ELContextImpl"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/el/ExpressionEvaluatorImpl", "factory", "Ljavax/el/ExpressionFactory;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ExpressionFactory", "createValueExpression", "(Ljavax/el/ELContext;Ljava/lang/String;Ljava/lang/Class;)Ljavax/el/ValueExpression;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/jasper/el/ExpressionImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/el/ExpressionEvaluatorImpl", "factory", "Ljavax/el/ExpressionFactory;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/el/ExpressionImpl", "<init>", "(Ljavax/el/ValueExpression;Ljavax/el/ExpressionFactory;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/jasper/el/ExpressionEvaluatorImpl", "java/lang/String", "java/lang/Class", "javax/servlet/jsp/el/FunctionMapper"}, 1, new Object[] {"javax/el/ELException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/el/ELParseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ELException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/el/ELParseException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "(Ljava/lang/String;Ljava/lang/Class;Ljavax/servlet/jsp/el/VariableResolver;Ljavax/servlet/jsp/el/FunctionMapper;)Ljava/lang/Object;", null, new String[] { "javax/servlet/jsp/el/ELException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/el/ExpressionEvaluatorImpl", "parseExpression", "(Ljava/lang/String;Ljava/lang/Class;Ljavax/servlet/jsp/el/FunctionMapper;)Ljavax/servlet/jsp/el/Expression;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/el/Expression", "evaluate", "(Ljavax/servlet/jsp/el/VariableResolver;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
