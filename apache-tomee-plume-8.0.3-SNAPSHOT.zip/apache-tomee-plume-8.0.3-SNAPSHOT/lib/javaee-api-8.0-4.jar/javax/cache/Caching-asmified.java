package asm.javax.cache;
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
public class CachingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "javax/cache/Caching", null, "java/lang/Object", null);

classWriter.visitInnerClass("javax/cache/Caching$CachingProviderRegistry", "javax/cache/Caching", "CachingProviderRegistry", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVAX_CACHE_CACHING_PROVIDER", "Ljava/lang/String;", null, "javax.cache.spi.CachingProvider");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CACHING_PROVIDERS", "Ljavax/cache/Caching$CachingProviderRegistry;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDefaultClassLoader", "()Ljava/lang/ClassLoader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/cache/Caching", "CACHING_PROVIDERS", "Ljavax/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/cache/Caching$CachingProviderRegistry", "getDefaultClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setDefaultClassLoader", "(Ljava/lang/ClassLoader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/cache/Caching", "CACHING_PROVIDERS", "Ljavax/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/cache/Caching$CachingProviderRegistry", "setDefaultClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCachingProvider", "()Ljavax/cache/spi/CachingProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/cache/Caching", "CACHING_PROVIDERS", "Ljavax/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/cache/Caching$CachingProviderRegistry", "getCachingProvider", "()Ljavax/cache/spi/CachingProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCachingProvider", "(Ljava/lang/ClassLoader;)Ljavax/cache/spi/CachingProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/cache/Caching", "CACHING_PROVIDERS", "Ljavax/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/cache/Caching$CachingProviderRegistry", "getCachingProvider", "(Ljava/lang/ClassLoader;)Ljavax/cache/spi/CachingProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCachingProviders", "()Ljava/lang/Iterable;", "()Ljava/lang/Iterable<Ljavax/cache/spi/CachingProvider;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/cache/Caching", "CACHING_PROVIDERS", "Ljavax/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/cache/Caching$CachingProviderRegistry", "getCachingProviders", "()Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCachingProviders", "(Ljava/lang/ClassLoader;)Ljava/lang/Iterable;", "(Ljava/lang/ClassLoader;)Ljava/lang/Iterable<Ljavax/cache/spi/CachingProvider;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/cache/Caching", "CACHING_PROVIDERS", "Ljavax/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/cache/Caching$CachingProviderRegistry", "getCachingProviders", "(Ljava/lang/ClassLoader;)Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCachingProvider", "(Ljava/lang/String;)Ljavax/cache/spi/CachingProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/cache/Caching", "CACHING_PROVIDERS", "Ljavax/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/cache/Caching$CachingProviderRegistry", "getCachingProvider", "(Ljava/lang/String;)Ljavax/cache/spi/CachingProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCachingProvider", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljavax/cache/spi/CachingProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/cache/Caching", "CACHING_PROVIDERS", "Ljavax/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/cache/Caching$CachingProviderRegistry", "getCachingProvider", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljavax/cache/spi/CachingProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCache", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljavax/cache/Cache;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TK;>;Ljava/lang/Class<TV;>;)Ljavax/cache/Cache<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/cache/Caching", "getCachingProvider", "()Ljavax/cache/spi/CachingProvider;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/spi/CachingProvider", "getCacheManager", "()Ljavax/cache/CacheManager;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/CacheManager", "getCache", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljavax/cache/Cache;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/cache/Caching$CachingProviderRegistry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/cache/Caching$CachingProviderRegistry", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/cache/Caching", "CACHING_PROVIDERS", "Ljavax/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
