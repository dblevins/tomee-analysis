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
public class ELContextImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/jasper/el/ELContextImpl", null, "jakarta/el/ELContext", null);

classWriter.visitInnerClass("org/apache/jasper/el/ELContextImpl$VariableMapperImpl", "org/apache/jasper/el/ELContextImpl", "VariableMapperImpl", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/el/ELContextImpl$1", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "NullFunctionMapper", "Ljakarta/el/FunctionMapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DefaultResolver", "Ljakarta/el/ELResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "resolver", "Ljakarta/el/ELResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "functionMapper", "Ljakarta/el/FunctionMapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "variableMapper", "Ljakarta/el/VariableMapper;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/el/ExpressionFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/el/ELContextImpl", "getDefaultResolver", "(Ljakarta/el/ExpressionFactory;)Ljakarta/el/ELResolver;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/el/ELContextImpl", "<init>", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/el/ELResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/ELContext", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/jasper/el/ELContextImpl", "NullFunctionMapper", "Ljakarta/el/FunctionMapper;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/el/ELContextImpl", "functionMapper", "Ljakarta/el/FunctionMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/el/ELContextImpl", "resolver", "Ljakarta/el/ELResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getELResolver", "()Ljakarta/el/ELResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/el/ELContextImpl", "resolver", "Ljakarta/el/ELResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFunctionMapper", "()Ljakarta/el/FunctionMapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/el/ELContextImpl", "functionMapper", "Ljakarta/el/FunctionMapper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getVariableMapper", "()Ljakarta/el/VariableMapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/el/ELContextImpl", "variableMapper", "Ljakarta/el/VariableMapper;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/jasper/el/ELContextImpl$VariableMapperImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/el/ELContextImpl$VariableMapperImpl", "<init>", "(Lorg/apache/jasper/el/ELContextImpl$1;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/el/ELContextImpl", "variableMapper", "Ljakarta/el/VariableMapper;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/el/ELContextImpl", "variableMapper", "Ljakarta/el/VariableMapper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFunctionMapper", "(Ljakarta/el/FunctionMapper;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/el/ELContextImpl", "functionMapper", "Ljakarta/el/FunctionMapper;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setVariableMapper", "(Ljakarta/el/VariableMapper;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/el/ELContextImpl", "variableMapper", "Ljakarta/el/VariableMapper;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDefaultResolver", "(Ljakarta/el/ExpressionFactory;)Ljakarta/el/ELResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/jasper/Constants", "IS_SECURITY_ENABLED", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "jakarta/el/CompositeELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/CompositeELResolver", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ExpressionFactory", "getStreamELResolver", "()Ljakarta/el/ELResolver;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "jakarta/el/StaticFieldELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/StaticFieldELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "jakarta/el/MapELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/MapELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "jakarta/el/ResourceBundleELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/ResourceBundleELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "jakarta/el/ListELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/ListELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "jakarta/el/ArrayELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/ArrayELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "jakarta/el/BeanELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/BeanELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/jasper/el/ELContextImpl", "DefaultResolver", "Ljakarta/el/ELResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/jasper/el/ELContextImpl$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/el/ELContextImpl$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/jasper/el/ELContextImpl", "NullFunctionMapper", "Ljakarta/el/FunctionMapper;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/jasper/Constants", "IS_SECURITY_ENABLED", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/jasper/el/ELContextImpl", "DefaultResolver", "Ljakarta/el/ELResolver;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "jakarta/el/CompositeELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/CompositeELResolver", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/jasper/el/ELContextImpl", "DefaultResolver", "Ljakarta/el/ELResolver;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/jasper/el/ELContextImpl", "DefaultResolver", "Ljakarta/el/ELResolver;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/el/CompositeELResolver");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/el/ELManager", "getExpressionFactory", "()Ljakarta/el/ExpressionFactory;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ExpressionFactory", "getStreamELResolver", "()Ljakarta/el/ELResolver;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/jasper/el/ELContextImpl", "DefaultResolver", "Ljakarta/el/ELResolver;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/el/CompositeELResolver");
methodVisitor.visitTypeInsn(NEW, "jakarta/el/StaticFieldELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/StaticFieldELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/jasper/el/ELContextImpl", "DefaultResolver", "Ljakarta/el/ELResolver;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/el/CompositeELResolver");
methodVisitor.visitTypeInsn(NEW, "jakarta/el/MapELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/MapELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/jasper/el/ELContextImpl", "DefaultResolver", "Ljakarta/el/ELResolver;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/el/CompositeELResolver");
methodVisitor.visitTypeInsn(NEW, "jakarta/el/ResourceBundleELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/ResourceBundleELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/jasper/el/ELContextImpl", "DefaultResolver", "Ljakarta/el/ELResolver;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/el/CompositeELResolver");
methodVisitor.visitTypeInsn(NEW, "jakarta/el/ListELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/ListELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/jasper/el/ELContextImpl", "DefaultResolver", "Ljakarta/el/ELResolver;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/el/CompositeELResolver");
methodVisitor.visitTypeInsn(NEW, "jakarta/el/ArrayELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/ArrayELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/jasper/el/ELContextImpl", "DefaultResolver", "Ljakarta/el/ELResolver;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/el/CompositeELResolver");
methodVisitor.visitTypeInsn(NEW, "jakarta/el/BeanELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/BeanELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
