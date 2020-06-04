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
public class UnmanagedDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/enterprise/inject/spi/Unmanaged", "<T:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/enterprise/inject/spi/Unmanaged$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "jakarta/enterprise/inject/spi/Unmanaged", "UnmanagedInstance", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "beanManager", "Ljakarta/enterprise/inject/spi/BeanManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "injectionTarget", "Ljakarta/enterprise/inject/spi/InjectionTarget;", "Ljakarta/enterprise/inject/spi/InjectionTarget<TT;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Class;)V", "(Ljava/lang/Class<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/enterprise/inject/spi/CDI", "current", "()Ljakarta/enterprise/inject/spi/CDI;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/enterprise/inject/spi/CDI", "getBeanManager", "()Ljakarta/enterprise/inject/spi/BeanManager;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/inject/spi/Unmanaged", "<init>", "(Ljakarta/enterprise/inject/spi/BeanManager;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/enterprise/inject/spi/BeanManager;Ljava/lang/Class;)V", "(Ljakarta/enterprise/inject/spi/BeanManager;Ljava/lang/Class<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/enterprise/inject/spi/Unmanaged", "beanManager", "Ljakarta/enterprise/inject/spi/BeanManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/BeanManager", "createAnnotatedType", "(Ljava/lang/Class;)Ljakarta/enterprise/inject/spi/AnnotatedType;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/BeanManager", "createInjectionTarget", "(Ljakarta/enterprise/inject/spi/AnnotatedType;)Ljakarta/enterprise/inject/spi/InjectionTarget;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/enterprise/inject/spi/Unmanaged", "injectionTarget", "Ljakarta/enterprise/inject/spi/InjectionTarget;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newInstance", "()Ljakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance;", "()Ljakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged", "beanManager", "Ljakarta/enterprise/inject/spi/BeanManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/inject/spi/Unmanaged", "injectionTarget", "Ljakarta/enterprise/inject/spi/InjectionTarget;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/inject/spi/Unmanaged$UnmanagedInstance", "<init>", "(Ljakarta/enterprise/inject/spi/BeanManager;Ljakarta/enterprise/inject/spi/InjectionTarget;Ljakarta/enterprise/inject/spi/Unmanaged$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
