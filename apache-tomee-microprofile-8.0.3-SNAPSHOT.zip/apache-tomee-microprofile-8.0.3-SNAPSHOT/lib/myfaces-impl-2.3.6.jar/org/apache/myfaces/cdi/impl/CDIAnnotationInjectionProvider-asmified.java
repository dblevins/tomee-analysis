package asm.org.apache.myfaces.cdi.impl;
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
public class CDIAnnotationInjectionProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/cdi/impl/CDIAnnotationInjectionProvider", null, "org/apache/myfaces/spi/InjectionProvider", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "beanManager", "Ljavax/enterprise/inject/spi/BeanManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/faces/context/ExternalContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/spi/InjectionProvider", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/cdi/util/CDIUtils", "getBeanManager", "(Ljavax/faces/context/ExternalContext;)Ljavax/enterprise/inject/spi/BeanManager;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/cdi/impl/CDIAnnotationInjectionProvider", "beanManager", "Ljavax/enterprise/inject/spi/BeanManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "inject", "(Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "org/apache/myfaces/spi/InjectionProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/cdi/impl/CDIAnnotationInjectionProvider", "beanManager", "Ljavax/enterprise/inject/spi/BeanManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "createAnnotatedType", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/AnnotatedType;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/cdi/impl/CDIAnnotationInjectionProvider", "beanManager", "Ljavax/enterprise/inject/spi/BeanManager;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "createInjectionTarget", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljavax/enterprise/inject/spi/InjectionTarget;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/cdi/impl/CDIAnnotationInjectionProvider", "beanManager", "Ljavax/enterprise/inject/spi/BeanManager;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "createCreationalContext", "(Ljavax/enterprise/context/spi/Contextual;)Ljavax/enterprise/context/spi/CreationalContext;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/InjectionTarget", "inject", "(Ljava/lang/Object;Ljavax/enterprise/context/spi/CreationalContext;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "postConstruct", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, new String[] { "org/apache/myfaces/spi/InjectionProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/cdi/impl/CDIAnnotationInjectionProvider", "beanManager", "Ljavax/enterprise/inject/spi/BeanManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "createAnnotatedType", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/AnnotatedType;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/cdi/impl/CDIAnnotationInjectionProvider", "beanManager", "Ljavax/enterprise/inject/spi/BeanManager;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "createInjectionTarget", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljavax/enterprise/inject/spi/InjectionTarget;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/InjectionTarget", "postConstruct", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "preDestroy", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, new String[] { "org/apache/myfaces/spi/InjectionProviderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/enterprise/context/spi/CreationalContext");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/cdi/impl/CDIAnnotationInjectionProvider", "beanManager", "Ljavax/enterprise/inject/spi/BeanManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "createAnnotatedType", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/AnnotatedType;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/cdi/impl/CDIAnnotationInjectionProvider", "beanManager", "Ljavax/enterprise/inject/spi/BeanManager;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "createInjectionTarget", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljavax/enterprise/inject/spi/InjectionTarget;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/InjectionTarget", "preDestroy", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/context/spi/CreationalContext");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/context/spi/CreationalContext", "release", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
