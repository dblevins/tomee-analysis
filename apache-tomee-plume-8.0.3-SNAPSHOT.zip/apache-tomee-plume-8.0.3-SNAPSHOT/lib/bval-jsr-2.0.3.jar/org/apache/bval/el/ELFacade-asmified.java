package asm.org.apache.bval.el;
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
public class ELFacadeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/bval/el/ELFacade", null, "java/lang/Object", new String[] { "org/apache/bval/el/MessageEvaluator" });

classWriter.visitInnerClass("org/apache/bval/el/ELFacade$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/bval/el/ELFacade$BValFormatter", "org/apache/bval/el/ELFacade", "BValFormatter", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/el/ELFacade$BValVariableMapper", "org/apache/bval/el/ELFacade", "BValVariableMapper", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/el/ELFacade$BValFunctionMapper", "org/apache/bval/el/ELFacade", "BValFunctionMapper", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/el/ELFacade$BValELContext", "org/apache/bval/el/ELFacade", "BValELContext", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/el/ELFacade$EvaluationType", "org/apache/bval/el/ELFacade", "EvaluationType", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "RESOLVER", "Ljavax/el/ELResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "expressionFactory", "Ljavax/el/ExpressionFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/el/ExpressionFactory", "newInstance", "()Ljavax/el/ExpressionFactory;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/el/ELFacade", "expressionFactory", "Ljavax/el/ExpressionFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "interpolate", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/Object;)Ljava/lang/String;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("${");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "contains", "(Ljava/lang/CharSequence;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/el/ELFacade$BValELContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/el/ELFacade$BValELContext", "<init>", "(Lorg/apache/bval/el/ELFacade;Lorg/apache/bval/el/ELFacade$1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/el/ELFacade$BValELContext", "getVariableMapper", "()Ljavax/el/VariableMapper;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/el/ELFacade;Ljavax/el/VariableMapper;)Ljava/util/function/BiConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/el/ELFacade", "lambda$interpolate$0", "(Ljavax/el/VariableMapper;Ljava/lang/String;Ljava/lang/Object;)V", false), Type.getType("(Ljava/lang/String;Ljava/lang/Object;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "forEach", "(Ljava/util/function/BiConsumer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("validatedValue");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/el/ELFacade", "expressionFactory", "Ljavax/el/ExpressionFactory;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ExpressionFactory", "createValueExpression", "(Ljava/lang/Object;Ljava/lang/Class;)Ljavax/el/ValueExpression;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/VariableMapper", "setVariable", "(Ljava/lang/String;Ljavax/el/ValueExpression;)Ljavax/el/ValueExpression;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/el/ELFacade", "expressionFactory", "Ljavax/el/ExpressionFactory;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/el/ELFacade$EvaluationType", "DEFERRED", "Lorg/apache/bval/el/ELFacade$EvaluationType;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/el/ELFacade$EvaluationType", "access$100", "(Lorg/apache/bval/el/ELFacade$EvaluationType;)Lorg/apache/bval/jsr/util/LookBehindRegexHolder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/LookBehindRegexHolder", "matcher", "(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;", false);
methodVisitor.visitLdcInsn("\\$0");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "replaceAll", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ExpressionFactory", "createValueExpression", "(Ljavax/el/ELContext;Ljava/lang/String;Ljava/lang/Class;)Ljavax/el/ValueExpression;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "getValue", "(Ljavax/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "initResolver", "()Ljavax/el/ELResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/el/CompositeELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/CompositeELResolver", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/el/MapELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/MapELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/el/ListELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/ListELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/el/ArrayELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/ArrayELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/el/ResourceBundleELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/ResourceBundleELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/el/BeanELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/BeanELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$interpolate$0", "(Ljavax/el/VariableMapper;Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/el/ELFacade", "expressionFactory", "Ljavax/el/ExpressionFactory;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ExpressionFactory", "createValueExpression", "(Ljava/lang/Object;Ljava/lang/Class;)Ljavax/el/ValueExpression;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/VariableMapper", "setVariable", "(Ljava/lang/String;Ljavax/el/ValueExpression;)Ljavax/el/ValueExpression;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "()Ljavax/el/ELResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/el/ELFacade", "RESOLVER", "Ljavax/el/ELResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lorg/apache/bval/el/ELFacade;)Ljavax/el/ExpressionFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/el/ELFacade", "expressionFactory", "Ljavax/el/ExpressionFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/el/ELFacade", "initResolver", "()Ljavax/el/ELResolver;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/el/ELFacade", "RESOLVER", "Ljavax/el/ELResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
