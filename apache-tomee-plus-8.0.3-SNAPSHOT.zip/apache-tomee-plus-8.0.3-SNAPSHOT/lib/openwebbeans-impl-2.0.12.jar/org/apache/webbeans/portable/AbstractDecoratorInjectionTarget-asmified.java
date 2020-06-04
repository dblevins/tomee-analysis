package asm.org.apache.webbeans.portable;
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
public class AbstractDecoratorInjectionTargetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "<T:Ljava/lang/Object;>Lorg/apache/webbeans/portable/InjectionTargetImpl<TT;>;", "org/apache/webbeans/portable/InjectionTargetImpl", null);

classWriter.visitInnerClass("org/apache/webbeans/portable/AbstractDecoratorInjectionTarget$AbstractDecoratorInjectableConstructor", "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "AbstractDecoratorInjectableConstructor", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl", "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "SubClassAnnotatedConstructorImpl", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "proxySubClass", "Ljava/lang/Class;", "Ljava/lang/Class<TT;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/enterprise/inject/spi/AnnotatedType;Ljava/util/Set;Lorg/apache/webbeans/config/WebBeansContext;Ljava/util/List;Ljava/util/List;)V", "(Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;Ljava/util/Set<Ljavax/enterprise/inject/spi/InjectionPoint;>;Lorg/apache/webbeans/config/WebBeansContext;Ljava/util/List<Ljavax/enterprise/inject/spi/AnnotatedMethod<*>;>;Ljava/util/List<Ljavax/enterprise/inject/spi/AnnotatedMethod<*>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/InjectionTargetImpl", "<init>", "(Ljavax/enterprise/inject/spi/AnnotatedType;Ljava/util/Set;Lorg/apache/webbeans/config/WebBeansContext;Ljava/util/List;Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createConstructor", "()Ljavax/enterprise/inject/spi/AnnotatedConstructor;", "()Ljavax/enterprise/inject/spi/AnnotatedConstructor<TT;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchMethodException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "annotatedType", "Ljavax/enterprise/inject/spi/AnnotatedType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getJavaClass", "()Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getApplicationBoundaryService", "()Lorg/apache/webbeans/spi/ApplicationBoundaryService;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ApplicationBoundaryService", "getBoundaryClassLoader", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Class", "java/lang/ClassLoader"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getSubclassProxyFactory", "()Lorg/apache/webbeans/proxy/SubclassProxyFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "annotatedType", "Ljavax/enterprise/inject/spi/AnnotatedType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/proxy/SubclassProxyFactory", "createImplementedSubclass", "(Ljava/lang/ClassLoader;Ljavax/enterprise/inject/spi/AnnotatedType;)Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "proxySubClass", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getSecurityService", "()Lorg/apache/webbeans/spi/SecurityService;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "proxySubClass", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/SecurityService", "doPrivilegedGetDeclaredConstructors", "(Ljava/lang/Class;)[Ljava/lang/reflect/Constructor;", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "getParameterTypes", "()[Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getConstructor", "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "java/lang/Class", "java/lang/ClassLoader", "java/lang/reflect/Constructor"}, 1, new Object[] {"java/lang/NoSuchMethodException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/reflect/Constructor"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "annotatedType", "Ljavax/enterprise/inject/spi/AnnotatedType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;Ljavax/enterprise/inject/spi/AnnotatedType;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getConstructor", "()Lorg/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl;", "()Lorg/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "constructor", "Ljavax/enterprise/inject/spi/AnnotatedConstructor;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "createConstructor", "()Ljavax/enterprise/inject/spi/AnnotatedConstructor;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "constructor", "Ljavax/enterprise/inject/spi/AnnotatedConstructor;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "constructor", "Ljavax/enterprise/inject/spi/AnnotatedConstructor;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newInstance", "(Lorg/apache/webbeans/context/creational/CreationalContextImpl;)Ljava/lang/Object;", "(Lorg/apache/webbeans/context/creational/CreationalContextImpl<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget$AbstractDecoratorInjectableConstructor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "getConstructor", "()Lorg/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl", "access$000", "(Lorg/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl;)Ljava/lang/reflect/Constructor;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "getConstructor", "()Lorg/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl", "getJavaMember", "()Ljava/lang/reflect/Constructor;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget$AbstractDecoratorInjectableConstructor", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;Ljavax/enterprise/inject/spi/InjectionTarget;Lorg/apache/webbeans/context/creational/CreationalContextImpl;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget$AbstractDecoratorInjectableConstructor", "doInjection", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "getConstructor", "()Ljavax/enterprise/inject/spi/AnnotatedConstructor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "getConstructor", "()Lorg/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
