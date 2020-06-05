package asm.org.apache.commons.jcs.jcache.cdi;
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
public class CacheRemoveAllInterceptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/jcache/cdi/CacheRemoveAllInterceptor", null, "java/lang/Object", new String[] { "java/io/Serializable" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/cache/annotation/CacheRemoveAll;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/interceptor/Interceptor;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/annotation/Priority;", true);
annotationVisitor0.visit("value", new Integer(1000));
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "helper", "Lorg/apache/commons/jcs/jcache/cdi/CDIJCacheHelper;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/inject/Inject;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cache", "(Ljakarta/interceptor/InvocationContext;)Ljava/lang/Object;", null, new String[] { "java/lang/Throwable" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/interceptor/AroundInvoke;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheRemoveAllInterceptor", "helper", "Lorg/apache/commons/jcs/jcache/cdi/CDIJCacheHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/jcache/cdi/CDIJCacheHelper", "findDefaults", "(Ljakarta/interceptor/InvocationContext;)Ljavax/cache/annotation/CacheDefaults;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/interceptor/InvocationContext", "getMethod", "()Ljava/lang/reflect/Method;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/cache/annotation/CacheRemoveAll;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/cache/annotation/CacheRemoveAll");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheRemoveAllInterceptor", "helper", "Lorg/apache/commons/jcs/jcache/cdi/CDIJCacheHelper;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/annotation/CacheRemoveAll", "cacheName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/jcache/cdi/CDIJCacheHelper", "defaultName", "(Ljava/lang/reflect/Method;Ljavax/cache/annotation/CacheDefaults;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/annotation/CacheRemoveAll", "afterInvocation", "()Z", true);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/jcache/cdi/CacheKeyInvocationContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheRemoveAllInterceptor", "helper", "Lorg/apache/commons/jcs/jcache/cdi/CDIJCacheHelper;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/jcache/cdi/CDIJCacheHelper", "keyParameterIndexes", "(Ljava/lang/reflect/Method;)[Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/cdi/CacheKeyInvocationContextImpl", "<init>", "(Ljakarta/interceptor/InvocationContext;Ljava/lang/annotation/Annotation;Ljava/lang/String;[Ljava/lang/Integer;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/cdi/CacheRemoveAllInterceptor", "removeAll", "(Ljavax/cache/annotation/CacheKeyInvocationContext;Ljavax/cache/annotation/CacheDefaults;Ljavax/cache/annotation/CacheRemoveAll;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/commons/jcs/jcache/cdi/CacheRemoveAllInterceptor", "jakarta/interceptor/InvocationContext", "javax/cache/annotation/CacheDefaults", "java/lang/reflect/Method", "javax/cache/annotation/CacheRemoveAll", "java/lang/String", Opcodes.INTEGER, "javax/cache/annotation/CacheKeyInvocationContext"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/interceptor/InvocationContext", "proceed", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ILOAD, 6);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheRemoveAllInterceptor", "helper", "Lorg/apache/commons/jcs/jcache/cdi/CDIJCacheHelper;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/annotation/CacheRemoveAll", "evictFor", "()[Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/annotation/CacheRemoveAll", "noEvictFor", "()[Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/jcache/cdi/CDIJCacheHelper", "isIncluded", "(Ljava/lang/Class;[Ljava/lang/Class;[Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/cdi/CacheRemoveAllInterceptor", "removeAll", "(Ljavax/cache/annotation/CacheKeyInvocationContext;Ljavax/cache/annotation/CacheDefaults;Ljavax/cache/annotation/CacheRemoveAll;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, "java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/commons/jcs/jcache/cdi/CacheRemoveAllInterceptor", "jakarta/interceptor/InvocationContext", "javax/cache/annotation/CacheDefaults", "java/lang/reflect/Method", "javax/cache/annotation/CacheRemoveAll", "java/lang/String", Opcodes.INTEGER, "javax/cache/annotation/CacheKeyInvocationContext", "java/lang/Object"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 6);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/cdi/CacheRemoveAllInterceptor", "removeAll", "(Ljavax/cache/annotation/CacheKeyInvocationContext;Ljavax/cache/annotation/CacheDefaults;Ljavax/cache/annotation/CacheRemoveAll;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "removeAll", "(Ljavax/cache/annotation/CacheKeyInvocationContext;Ljavax/cache/annotation/CacheDefaults;Ljavax/cache/annotation/CacheRemoveAll;)V", "(Ljavax/cache/annotation/CacheKeyInvocationContext<Ljavax/cache/annotation/CacheRemoveAll;>;Ljavax/cache/annotation/CacheDefaults;Ljavax/cache/annotation/CacheRemoveAll;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheRemoveAllInterceptor", "helper", "Lorg/apache/commons/jcs/jcache/cdi/CDIJCacheHelper;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/annotation/CacheRemoveAll", "cacheResolverFactory", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/jcache/cdi/CDIJCacheHelper", "cacheResolverFactoryFor", "(Ljavax/cache/annotation/CacheDefaults;Ljava/lang/Class;)Ljavax/cache/annotation/CacheResolverFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/annotation/CacheResolverFactory", "getCacheResolver", "(Ljavax/cache/annotation/CacheMethodDetails;)Ljavax/cache/annotation/CacheResolver;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/annotation/CacheResolver", "resolveCache", "(Ljavax/cache/annotation/CacheInvocationContext;)Ljavax/cache/Cache;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/Cache", "removeAll", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
