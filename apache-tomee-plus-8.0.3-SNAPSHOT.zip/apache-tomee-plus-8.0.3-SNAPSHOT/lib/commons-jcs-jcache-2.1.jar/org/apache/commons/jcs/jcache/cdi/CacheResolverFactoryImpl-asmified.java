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
public class CacheResolverFactoryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/jcache/cdi/CacheResolverFactoryImpl", null, "java/lang/Object", new String[] { "javax/cache/annotation/CacheResolverFactory" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "cacheManager", "Ljavax/cache/CacheManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "provider", "Ljavax/cache/spi/CachingProvider;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/cache/Caching", "getCachingProvider", "()Ljavax/cache/spi/CachingProvider;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/jcache/cdi/CacheResolverFactoryImpl", "provider", "Ljavax/cache/spi/CachingProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheResolverFactoryImpl", "provider", "Ljavax/cache/spi/CachingProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheResolverFactoryImpl", "provider", "Ljavax/cache/spi/CachingProvider;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/spi/CachingProvider", "getDefaultURI", "()Ljava/net/URI;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheResolverFactoryImpl", "provider", "Ljavax/cache/spi/CachingProvider;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/spi/CachingProvider", "getDefaultClassLoader", "()Ljava/lang/ClassLoader;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/spi/CachingProvider", "getCacheManager", "(Ljava/net/URI;Ljava/lang/ClassLoader;)Ljavax/cache/CacheManager;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/jcache/cdi/CacheResolverFactoryImpl", "cacheManager", "Ljavax/cache/CacheManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCacheResolver", "(Ljavax/cache/annotation/CacheMethodDetails;)Ljavax/cache/annotation/CacheResolver;", "(Ljavax/cache/annotation/CacheMethodDetails<+Ljava/lang/annotation/Annotation;>;)Ljavax/cache/annotation/CacheResolver;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/annotation/CacheMethodDetails", "getCacheName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/cdi/CacheResolverFactoryImpl", "findCacheResolver", "(Ljava/lang/String;)Ljavax/cache/annotation/CacheResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExceptionCacheResolver", "(Ljavax/cache/annotation/CacheMethodDetails;)Ljavax/cache/annotation/CacheResolver;", "(Ljavax/cache/annotation/CacheMethodDetails<Ljavax/cache/annotation/CacheResult;>;)Ljavax/cache/annotation/CacheResolver;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/annotation/CacheMethodDetails", "getCacheAnnotation", "()Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/cache/annotation/CacheResult");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/annotation/CacheResult", "exceptionCacheName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "isEmpty", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CacheResult.exceptionCacheName() not specified");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/cdi/CacheResolverFactoryImpl", "findCacheResolver", "(Ljava/lang/String;)Ljavax/cache/annotation/CacheResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "findCacheResolver", "(Ljava/lang/String;)Ljavax/cache/annotation/CacheResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheResolverFactoryImpl", "cacheManager", "Ljavax/cache/CacheManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/CacheManager", "getCache", "(Ljava/lang/String;)Ljavax/cache/Cache;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/cdi/CacheResolverFactoryImpl", "createCache", "(Ljava/lang/String;)Ljavax/cache/Cache;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/cache/Cache"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/jcache/cdi/CacheResolverImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/cdi/CacheResolverImpl", "<init>", "(Ljavax/cache/Cache;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createCache", "(Ljava/lang/String;)Ljavax/cache/Cache;", "(Ljava/lang/String;)Ljavax/cache/Cache<**>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheResolverFactoryImpl", "cacheManager", "Ljavax/cache/CacheManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "javax/cache/configuration/MutableConfiguration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/cache/configuration/MutableConfiguration", "<init>", "()V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/cache/configuration/MutableConfiguration", "setStoreByValue", "(Z)Ljavax/cache/configuration/MutableConfiguration;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/CacheManager", "createCache", "(Ljava/lang/String;Ljavax/cache/configuration/Configuration;)Ljavax/cache/Cache;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheResolverFactoryImpl", "cacheManager", "Ljavax/cache/CacheManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/CacheManager", "getCache", "(Ljava/lang/String;)Ljavax/cache/Cache;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "release", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheResolverFactoryImpl", "cacheManager", "Ljavax/cache/CacheManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/CacheManager", "close", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheResolverFactoryImpl", "provider", "Ljavax/cache/spi/CachingProvider;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/spi/CachingProvider", "close", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
