package asm.com.sun.faces.ext.component;
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
public class ValueExpressionAnalyzerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/ext/component/ValueExpressionAnalyzer", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/faces/ext/component/ValueExpressionAnalyzer$InterceptingResolver", "com/sun/faces/ext/component/ValueExpressionAnalyzer", "InterceptingResolver", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/ext/component/ValueExpressionAnalyzer$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "expression", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/ext/component/ValueExpressionAnalyzer", "expression", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReference", "(Ljavax/el/ELContext;)Lcom/sun/faces/ext/component/ValueReference;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/el/ELException");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/ext/component/ValueExpressionAnalyzer$InterceptingResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ELContext", "getELResolver", "()Ljavax/el/ELResolver;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/ext/component/ValueExpressionAnalyzer$InterceptingResolver", "<init>", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/ext/component/ValueExpressionAnalyzer", "expression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/ext/component/ValueExpressionAnalyzer", "decorateELContext", "(Ljavax/el/ELContext;Ljavax/el/ELResolver;)Ljavax/el/ELContext;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "setValue", "(Ljavax/el/ELContext;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"com/sun/faces/ext/component/ValueExpressionAnalyzer", "javax/el/ELContext", "com/sun/faces/ext/component/ValueExpressionAnalyzer$InterceptingResolver"}, 1, new Object[] {"javax/el/ELException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/ext/component/ValueExpressionAnalyzer$InterceptingResolver", "getValueReference", "()Lcom/sun/faces/ext/component/ValueReference;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/ext/component/ValueReference", "getBase", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/faces/el/CompositeComponentExpressionHolder");
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/el/CompositeComponentExpressionHolder");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/ext/component/ValueReference", "getProperty", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/el/CompositeComponentExpressionHolder", "getExpression", "(Ljava/lang/String;)Ljavax/el/ValueExpression;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/ext/component/ValueExpressionAnalyzer", "expression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/ext/component/ValueExpressionAnalyzer", "getReference", "(Ljavax/el/ELContext;)Lcom/sun/faces/ext/component/ValueReference;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/faces/ext/component/ValueReference"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "decorateELContext", "(Ljavax/el/ELContext;Ljavax/el/ELResolver;)Ljavax/el/ELContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/ext/component/ValueExpressionAnalyzer$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/ext/component/ValueExpressionAnalyzer$1", "<init>", "(Lcom/sun/faces/ext/component/ValueExpressionAnalyzer;Ljavax/el/ELResolver;Ljavax/el/ELContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
