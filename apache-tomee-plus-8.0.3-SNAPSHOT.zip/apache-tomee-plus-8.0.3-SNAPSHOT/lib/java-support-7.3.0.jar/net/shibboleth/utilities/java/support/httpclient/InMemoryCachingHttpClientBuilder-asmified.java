package asm.net.shibboleth.utilities.java.support.httpclient;
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
public class InMemoryCachingHttpClientBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "net/shibboleth/utilities/java/support/httpclient/InMemoryCachingHttpClientBuilder", null, "net/shibboleth/utilities/java/support/httpclient/HttpClientBuilder", null);

classWriter.visitInnerClass("org/apache/http/impl/client/cache/CacheConfig$Builder", "org/apache/http/impl/client/cache/CacheConfig", "Builder", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "maxCacheEntries", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "maxCacheEntrySize", "J", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/http/impl/client/cache/CachingHttpClientBuilder", "create", "()Lorg/apache/http/impl/client/cache/CachingHttpClientBuilder;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/httpclient/InMemoryCachingHttpClientBuilder", "<init>", "(Lorg/apache/http/impl/client/cache/CachingHttpClientBuilder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/http/impl/client/cache/CachingHttpClientBuilder;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/httpclient/HttpClientBuilder", "<init>", "(Lorg/apache/http/impl/client/HttpClientBuilder;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/httpclient/InMemoryCachingHttpClientBuilder", "maxCacheEntries", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(1048576L));
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/httpclient/InMemoryCachingHttpClientBuilder", "maxCacheEntrySize", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxCacheEntries", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/InMemoryCachingHttpClientBuilder", "maxCacheEntries", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxCacheEntries", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2L);
methodVisitor.visitLdcInsn("Maximum number of cache entries must be greater than 0");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isGreaterThan", "(JJLjava/lang/String;)J", false);
methodVisitor.visitInsn(L2I);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/httpclient/InMemoryCachingHttpClientBuilder", "maxCacheEntries", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxCacheEntrySize", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/InMemoryCachingHttpClientBuilder", "maxCacheEntrySize", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxCacheEntrySize", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitLdcInsn("Maximum cache entry size must be greater than 0");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isGreaterThan", "(JJLjava/lang/String;)J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/httpclient/InMemoryCachingHttpClientBuilder", "maxCacheEntrySize", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "decorateApacheBuilder", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/httpclient/HttpClientBuilder", "decorateApacheBuilder", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/httpclient/InMemoryCachingHttpClientBuilder", "getApacheBuilder", "()Lorg/apache/http/impl/client/HttpClientBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/http/impl/client/cache/CachingHttpClientBuilder");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/http/impl/client/cache/CacheConfig", "custom", "()Lorg/apache/http/impl/client/cache/CacheConfig$Builder;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/InMemoryCachingHttpClientBuilder", "maxCacheEntries", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/impl/client/cache/CacheConfig$Builder", "setMaxCacheEntries", "(I)Lorg/apache/http/impl/client/cache/CacheConfig$Builder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/InMemoryCachingHttpClientBuilder", "maxCacheEntrySize", "J");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/impl/client/cache/CacheConfig$Builder", "setMaxObjectSize", "(J)Lorg/apache/http/impl/client/cache/CacheConfig$Builder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/impl/client/cache/CacheConfig$Builder", "setHeuristicCachingEnabled", "(Z)Lorg/apache/http/impl/client/cache/CacheConfig$Builder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/impl/client/cache/CacheConfig$Builder", "setSharedCache", "(Z)Lorg/apache/http/impl/client/cache/CacheConfig$Builder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/impl/client/cache/CacheConfig$Builder", "build", "()Lorg/apache/http/impl/client/cache/CacheConfig;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/impl/client/cache/CachingHttpClientBuilder", "setCacheConfig", "(Lorg/apache/http/impl/client/cache/CacheConfig;)Lorg/apache/http/impl/client/cache/CachingHttpClientBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/http/impl/client/cache/HeapResourceFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/http/impl/client/cache/HeapResourceFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/impl/client/cache/CachingHttpClientBuilder", "setResourceFactory", "(Lorg/apache/http/client/cache/ResourceFactory;)Lorg/apache/http/impl/client/cache/CachingHttpClientBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/http/impl/client/cache/BasicHttpCacheStorage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/http/impl/client/cache/BasicHttpCacheStorage", "<init>", "(Lorg/apache/http/impl/client/cache/CacheConfig;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/impl/client/cache/CachingHttpClientBuilder", "setHttpCacheStorage", "(Lorg/apache/http/client/cache/HttpCacheStorage;)Lorg/apache/http/impl/client/cache/CachingHttpClientBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
