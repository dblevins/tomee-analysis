package asm.jakarta.cache;
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

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "jakarta/cache/Caching", null, "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/cache/Caching$CachingProviderRegistry", "jakarta/cache/Caching", "CachingProviderRegistry", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVAX_CACHE_CACHING_PROVIDER", "Ljava/lang/String;", null, "jakarta.cache.spi.CachingProvider");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CACHING_PROVIDERS", "Ljakarta/cache/Caching$CachingProviderRegistry;", null, null);
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
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/cache/Caching", "CACHING_PROVIDERS", "Ljakarta/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/cache/Caching$CachingProviderRegistry", "getDefaultClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setDefaultClassLoader", "(Ljava/lang/ClassLoader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/cache/Caching", "CACHING_PROVIDERS", "Ljakarta/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/cache/Caching$CachingProviderRegistry", "setDefaultClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCachingProvider", "()Ljakarta/cache/spi/CachingProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/cache/Caching", "CACHING_PROVIDERS", "Ljakarta/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/cache/Caching$CachingProviderRegistry", "getCachingProvider", "()Ljakarta/cache/spi/CachingProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCachingProvider", "(Ljava/lang/ClassLoader;)Ljakarta/cache/spi/CachingProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/cache/Caching", "CACHING_PROVIDERS", "Ljakarta/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/cache/Caching$CachingProviderRegistry", "getCachingProvider", "(Ljava/lang/ClassLoader;)Ljakarta/cache/spi/CachingProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCachingProviders", "()Ljava/lang/Iterable;", "()Ljava/lang/Iterable<Ljakarta/cache/spi/CachingProvider;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/cache/Caching", "CACHING_PROVIDERS", "Ljakarta/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/cache/Caching$CachingProviderRegistry", "getCachingProviders", "()Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCachingProviders", "(Ljava/lang/ClassLoader;)Ljava/lang/Iterable;", "(Ljava/lang/ClassLoader;)Ljava/lang/Iterable<Ljakarta/cache/spi/CachingProvider;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/cache/Caching", "CACHING_PROVIDERS", "Ljakarta/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/cache/Caching$CachingProviderRegistry", "getCachingProviders", "(Ljava/lang/ClassLoader;)Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCachingProvider", "(Ljava/lang/String;)Ljakarta/cache/spi/CachingProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/cache/Caching", "CACHING_PROVIDERS", "Ljakarta/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/cache/Caching$CachingProviderRegistry", "getCachingProvider", "(Ljava/lang/String;)Ljakarta/cache/spi/CachingProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCachingProvider", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljakarta/cache/spi/CachingProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/cache/Caching", "CACHING_PROVIDERS", "Ljakarta/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/cache/Caching$CachingProviderRegistry", "getCachingProvider", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljakarta/cache/spi/CachingProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCache", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljakarta/cache/Cache;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TK;>;Ljava/lang/Class<TV;>;)Ljakarta/cache/Cache<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/cache/Caching", "getCachingProvider", "()Ljakarta/cache/spi/CachingProvider;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/cache/spi/CachingProvider", "getCacheManager", "()Ljakarta/cache/CacheManager;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/cache/CacheManager", "getCache", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljakarta/cache/Cache;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/cache/Caching$CachingProviderRegistry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/cache/Caching$CachingProviderRegistry", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/cache/Caching", "CACHING_PROVIDERS", "Ljakarta/cache/Caching$CachingProviderRegistry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
