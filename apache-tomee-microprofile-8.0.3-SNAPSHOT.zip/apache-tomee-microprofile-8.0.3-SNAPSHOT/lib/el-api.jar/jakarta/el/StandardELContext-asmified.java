package asm.jakarta.el;
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
public class StandardELContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/el/StandardELContext", null, "jakarta/el/ELContext", null);

classWriter.visitInnerClass("jakarta/el/StandardELContext$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("jakarta/el/StandardELContext$StandardFunctionMapper", "jakarta/el/StandardELContext", "StandardFunctionMapper", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("jakarta/el/StandardELContext$StandardBeanNameResolver", "jakarta/el/StandardELContext", "StandardBeanNameResolver", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("jakarta/el/StandardELContext$StandardVariableMapper", "jakarta/el/StandardELContext", "StandardVariableMapper", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "wrappedContext", "Ljakarta/el/ELContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "variableMapper", "Ljakarta/el/VariableMapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "functionMapper", "Ljakarta/el/FunctionMapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "standardResolver", "Ljakarta/el/CompositeELResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "customResolvers", "Ljakarta/el/CompositeELResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "localBeans", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/el/ExpressionFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/ELContext", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/el/StandardELContext", "localBeans", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/el/StandardELContext", "wrappedContext", "Ljakarta/el/ELContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "jakarta/el/StandardELContext$StandardVariableMapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/StandardELContext$StandardVariableMapper", "<init>", "(Ljakarta/el/StandardELContext$1;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/el/StandardELContext", "variableMapper", "Ljakarta/el/VariableMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "jakarta/el/StandardELContext$StandardFunctionMapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ExpressionFactory", "getInitFunctionMap", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/StandardELContext$StandardFunctionMapper", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/el/StandardELContext", "functionMapper", "Ljakarta/el/FunctionMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "jakarta/el/CompositeELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/CompositeELResolver", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/el/StandardELContext", "standardResolver", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "jakarta/el/CompositeELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/CompositeELResolver", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/el/StandardELContext", "customResolvers", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ExpressionFactory", "getStreamELResolver", "()Ljakarta/el/ELResolver;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "standardResolver", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitTypeInsn(NEW, "jakarta/el/BeanNameELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "jakarta/el/StandardELContext$StandardBeanNameResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "localBeans", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/StandardELContext$StandardBeanNameResolver", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/BeanNameELResolver", "<init>", "(Ljakarta/el/BeanNameResolver;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "standardResolver", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "customResolvers", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "standardResolver", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"jakarta/el/StandardELContext", "jakarta/el/ExpressionFactory", "jakarta/el/ELResolver"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "standardResolver", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitTypeInsn(NEW, "jakarta/el/StaticFieldELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/StaticFieldELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "standardResolver", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitTypeInsn(NEW, "jakarta/el/MapELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/MapELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "standardResolver", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitTypeInsn(NEW, "jakarta/el/ResourceBundleELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/ResourceBundleELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "standardResolver", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitTypeInsn(NEW, "jakarta/el/ListELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/ListELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "standardResolver", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitTypeInsn(NEW, "jakarta/el/ArrayELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/ArrayELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "standardResolver", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitTypeInsn(NEW, "jakarta/el/BeanELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/BeanELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/el/ELContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/ELContext", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/el/StandardELContext", "localBeans", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/el/StandardELContext", "wrappedContext", "Ljakarta/el/ELContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "getVariableMapper", "()Ljakarta/el/VariableMapper;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/el/StandardELContext", "variableMapper", "Ljakarta/el/VariableMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "getFunctionMapper", "()Ljakarta/el/FunctionMapper;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/el/StandardELContext", "functionMapper", "Ljakarta/el/FunctionMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "jakarta/el/CompositeELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/CompositeELResolver", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/el/StandardELContext", "standardResolver", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "jakarta/el/CompositeELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/CompositeELResolver", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/el/StandardELContext", "customResolvers", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "standardResolver", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitTypeInsn(NEW, "jakarta/el/BeanNameELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "jakarta/el/StandardELContext$StandardBeanNameResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "localBeans", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/StandardELContext$StandardBeanNameResolver", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/BeanNameELResolver", "<init>", "(Ljakarta/el/BeanNameResolver;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "standardResolver", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "customResolvers", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "standardResolver", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "getELResolver", "()Ljakarta/el/ELResolver;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "putContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "wrappedContext", "Ljakarta/el/ELContext;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/ELContext", "putContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "wrappedContext", "Ljakarta/el/ELContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "putContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContext", "(Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "wrappedContext", "Ljakarta/el/ELContext;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/ELContext", "getContext", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "wrappedContext", "Ljakarta/el/ELContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "getContext", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getELResolver", "()Ljakarta/el/ELResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "standardResolver", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addELResolver", "(Ljakarta/el/ELResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "customResolvers", "Ljakarta/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/CompositeELResolver", "add", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFunctionMapper", "()Ljakarta/el/FunctionMapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "functionMapper", "Ljakarta/el/FunctionMapper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getVariableMapper", "()Ljakarta/el/VariableMapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "variableMapper", "Ljakarta/el/VariableMapper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getLocalBeans", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/el/StandardELContext", "localBeans", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
