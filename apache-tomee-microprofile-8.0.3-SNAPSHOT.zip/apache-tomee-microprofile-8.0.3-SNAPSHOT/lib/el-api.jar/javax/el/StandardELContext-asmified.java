package asm.javax.el;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "javax/el/StandardELContext", null, "javax/el/ELContext", null);

classWriter.visitInnerClass("javax/el/StandardELContext$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("javax/el/StandardELContext$StandardFunctionMapper", "javax/el/StandardELContext", "StandardFunctionMapper", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("javax/el/StandardELContext$StandardBeanNameResolver", "javax/el/StandardELContext", "StandardBeanNameResolver", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("javax/el/StandardELContext$StandardVariableMapper", "javax/el/StandardELContext", "StandardVariableMapper", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "wrappedContext", "Ljavax/el/ELContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "variableMapper", "Ljavax/el/VariableMapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "functionMapper", "Ljavax/el/FunctionMapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "standardResolver", "Ljavax/el/CompositeELResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "customResolvers", "Ljavax/el/CompositeELResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "localBeans", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/el/ExpressionFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/ELContext", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/el/StandardELContext", "localBeans", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/el/StandardELContext", "wrappedContext", "Ljavax/el/ELContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/el/StandardELContext$StandardVariableMapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/StandardELContext$StandardVariableMapper", "<init>", "(Ljavax/el/StandardELContext$1;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/el/StandardELContext", "variableMapper", "Ljavax/el/VariableMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/el/StandardELContext$StandardFunctionMapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ExpressionFactory", "getInitFunctionMap", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/StandardELContext$StandardFunctionMapper", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/el/StandardELContext", "functionMapper", "Ljavax/el/FunctionMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/el/CompositeELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/CompositeELResolver", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/el/StandardELContext", "standardResolver", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/el/CompositeELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/CompositeELResolver", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/el/StandardELContext", "customResolvers", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ExpressionFactory", "getStreamELResolver", "()Ljavax/el/ELResolver;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "standardResolver", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitTypeInsn(NEW, "javax/el/BeanNameELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "javax/el/StandardELContext$StandardBeanNameResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "localBeans", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/StandardELContext$StandardBeanNameResolver", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/BeanNameELResolver", "<init>", "(Ljavax/el/BeanNameResolver;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "standardResolver", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "customResolvers", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "standardResolver", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"javax/el/StandardELContext", "javax/el/ExpressionFactory", "javax/el/ELResolver"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "standardResolver", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitTypeInsn(NEW, "javax/el/StaticFieldELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/StaticFieldELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "standardResolver", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitTypeInsn(NEW, "javax/el/MapELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/MapELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "standardResolver", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitTypeInsn(NEW, "javax/el/ResourceBundleELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/ResourceBundleELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "standardResolver", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitTypeInsn(NEW, "javax/el/ListELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/ListELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "standardResolver", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitTypeInsn(NEW, "javax/el/ArrayELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/ArrayELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "standardResolver", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitTypeInsn(NEW, "javax/el/BeanELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/BeanELResolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/el/ELContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/ELContext", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/el/StandardELContext", "localBeans", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/el/StandardELContext", "wrappedContext", "Ljavax/el/ELContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ELContext", "getVariableMapper", "()Ljavax/el/VariableMapper;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/el/StandardELContext", "variableMapper", "Ljavax/el/VariableMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ELContext", "getFunctionMapper", "()Ljavax/el/FunctionMapper;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/el/StandardELContext", "functionMapper", "Ljavax/el/FunctionMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/el/CompositeELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/CompositeELResolver", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/el/StandardELContext", "standardResolver", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/el/CompositeELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/CompositeELResolver", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/el/StandardELContext", "customResolvers", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "standardResolver", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitTypeInsn(NEW, "javax/el/BeanNameELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "javax/el/StandardELContext$StandardBeanNameResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "localBeans", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/StandardELContext$StandardBeanNameResolver", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/BeanNameELResolver", "<init>", "(Ljavax/el/BeanNameResolver;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "standardResolver", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "customResolvers", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "standardResolver", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ELContext", "getELResolver", "()Ljavax/el/ELResolver;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "putContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "wrappedContext", "Ljavax/el/ELContext;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/ELContext", "putContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "wrappedContext", "Ljavax/el/ELContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ELContext", "putContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", false);
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
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "wrappedContext", "Ljavax/el/ELContext;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/el/ELContext", "getContext", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "wrappedContext", "Ljavax/el/ELContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ELContext", "getContext", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getELResolver", "()Ljavax/el/ELResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "standardResolver", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addELResolver", "(Ljavax/el/ELResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "customResolvers", "Ljavax/el/CompositeELResolver;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/CompositeELResolver", "add", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFunctionMapper", "()Ljavax/el/FunctionMapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "functionMapper", "Ljavax/el/FunctionMapper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getVariableMapper", "()Ljavax/el/VariableMapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "variableMapper", "Ljavax/el/VariableMapper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getLocalBeans", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/el/StandardELContext", "localBeans", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
