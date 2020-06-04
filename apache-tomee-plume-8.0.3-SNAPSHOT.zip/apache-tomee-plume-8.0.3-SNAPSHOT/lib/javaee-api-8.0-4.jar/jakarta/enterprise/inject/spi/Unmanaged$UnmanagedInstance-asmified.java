package asm.jakarta.enterprise.inject.spi;
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
public class Unmanaged$UnmanagedInstanceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "<T:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "jakarta/enterprise/inject/spi/Unmanaged", "UnmanagedInstance", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("jakarta/enterprise/inject/spi/Unmanaged$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "beanManager", "Ljakarta/enterprise/inject/spi/BeanManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "injectionTarget", "Ljakarta/enterprise/inject/spi/InjectionTarget;", "Ljakarta/enterprise/inject/spi/InjectionTarget<TT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "creationalContext", "Ljakarta/enterprise/context/spi/CreationalContext;", "Ljakarta/enterprise/context/spi/CreationalContext<TT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "instance", "Ljava/lang/Object;", "TT;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "injected", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "disposed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljakarta/enterprise/inject/spi/BeanManager;Ljakarta/enterprise/inject/spi/InjectionTarget;)V", "(Ljakarta/enterprise/inject/spi/BeanManager;Ljakarta/enterprise/inject/spi/InjectionTarget<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "injectionTarget", "Ljakarta/enterprise/inject/spi/InjectionTarget;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "beanManager", "Ljakarta/enterprise/inject/spi/BeanManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "produce", "()Ljakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance;", "()Ljakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "creationalContext", "Ljakarta/enterprise/context/spi/CreationalContext;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UnmanagedInstance is already produced");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "disposed", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UnmanagedInstance is already disposed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "beanManager", "Ljakarta/enterprise/inject/spi/BeanManager;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/BeanManager", "createCreationalContext", "(Ljakarta/enterprise/context/spi/Contextual;)Ljakarta/enterprise/context/spi/CreationalContext;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "creationalContext", "Ljakarta/enterprise/context/spi/CreationalContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "injectionTarget", "Ljakarta/enterprise/inject/spi/InjectionTarget;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "creationalContext", "Ljakarta/enterprise/context/spi/CreationalContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/InjectionTarget", "produce", "(Ljakarta/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "instance", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "inject", "()Ljakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance;", "()Ljakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "basicCheck", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "injected", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UnmanagedInstance is already injected");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "injectionTarget", "Ljakarta/enterprise/inject/spi/InjectionTarget;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "instance", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "creationalContext", "Ljakarta/enterprise/context/spi/CreationalContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/InjectionTarget", "inject", "(Ljava/lang/Object;Ljakarta/enterprise/context/spi/CreationalContext;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "injected", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "postConstruct", "()Ljakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance;", "()Ljakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "basicCheck", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "injectionTarget", "Ljakarta/enterprise/inject/spi/InjectionTarget;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "instance", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/InjectionTarget", "postConstruct", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "()Ljava/lang/Object;", "()TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "basicCheck", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "instance", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "preDestroy", "()Ljakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance;", "()Ljakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "basicCheck", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "injectionTarget", "Ljakarta/enterprise/inject/spi/InjectionTarget;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "instance", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/InjectionTarget", "preDestroy", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dispose", "()Ljakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance;", "()Ljakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "basicCheck", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "injectionTarget", "Ljakarta/enterprise/inject/spi/InjectionTarget;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "instance", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/InjectionTarget", "dispose", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "creationalContext", "Ljakarta/enterprise/context/spi/CreationalContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/context/spi/CreationalContext", "release", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "disposed", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "basicCheck", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "creationalContext", "Ljakarta/enterprise/context/spi/CreationalContext;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UnmanagedInstance is not yet initialized. Invoke #produce() first!");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "disposed", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UnmanagedInstance is already disposed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljakarta/enterprise/inject/spi/BeanManager;Ljakarta/enterprise/inject/spi/InjectionTarget;Ljakarta/enterprise/inject/spi/Unmanaged$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "<init>", "(Ljakarta/enterprise/inject/spi/BeanManager;Ljakarta/enterprise/inject/spi/InjectionTarget;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
