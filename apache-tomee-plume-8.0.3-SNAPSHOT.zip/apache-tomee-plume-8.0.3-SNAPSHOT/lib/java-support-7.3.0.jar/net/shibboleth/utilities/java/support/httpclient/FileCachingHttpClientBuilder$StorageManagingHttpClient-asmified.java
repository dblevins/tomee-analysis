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
public class FileCachingHttpClientBuilder$StorageManagingHttpClientDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", null, "org/apache/http/impl/client/CloseableHttpClient", new String[] { "net/shibboleth/utilities/java/support/component/InitializableComponent", "net/shibboleth/utilities/java/support/component/DestructableComponent" });

classWriter.visitInnerClass("net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder", "StorageManagingHttpClient", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageMaintenanceTask", "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder", "StorageMaintenanceTask", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "log", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "httpClient", "Lorg/apache/http/impl/client/CloseableHttpClient;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "storage", "Lorg/apache/http/impl/client/cache/ManagedHttpCacheStorage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "maintenanceTaskInterval", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "initialized", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "destroyed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "timer", "Ljava/util/Timer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "maintenanceTask", "Ljava/util/TimerTask;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/http/impl/client/CloseableHttpClient;Lorg/apache/http/impl/client/cache/ManagedHttpCacheStorage;J)V", null, null);
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/http/impl/client/CloseableHttpClient", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lnet/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("HttpClient was null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/http/impl/client/CloseableHttpClient");
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "httpClient", "Lorg/apache/http/impl/client/CloseableHttpClient;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("ManagedHttpCacheStorage was null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/http/impl/client/cache/ManagedHttpCacheStorage");
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "storage", "Lorg/apache/http/impl/client/cache/ManagedHttpCacheStorage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "maintenanceTaskInterval", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doExecute", "(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/client/methods/CloseableHttpResponse;", null, new String[] { "java/io/IOException", "org/apache/http/client/ClientProtocolException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifNotInitializedThrowUninitializedComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "httpClient", "Lorg/apache/http/impl/client/CloseableHttpClient;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/impl/client/CloseableHttpClient", "execute", "(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/client/methods/CloseableHttpResponse;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "getParams", "()Lorg/apache/http/params/HttpParams;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifNotInitializedThrowUninitializedComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "httpClient", "Lorg/apache/http/impl/client/CloseableHttpClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/impl/client/CloseableHttpClient", "getParams", "()Lorg/apache/http/params/HttpParams;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "getConnectionManager", "()Lorg/apache/http/conn/ClientConnectionManager;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifNotInitializedThrowUninitializedComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "httpClient", "Lorg/apache/http/impl/client/CloseableHttpClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/impl/client/CloseableHttpClient", "getConnectionManager", "()Lorg/apache/http/conn/ClientConnectionManager;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifNotInitializedThrowUninitializedComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "httpClient", "Lorg/apache/http/impl/client/CloseableHttpClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/impl/client/CloseableHttpClient", "close", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isInitialized", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "initialized", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDestroyed", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "destroyed", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "()V", null, new String[] { "net/shibboleth/utilities/java/support/component/ComponentInitializationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/Timer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Timer", "<init>", "(Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "timer", "Ljava/util/Timer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageMaintenanceTask");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "storage", "Lorg/apache/http/impl/client/cache/ManagedHttpCacheStorage;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageMaintenanceTask", "<init>", "(Lorg/apache/http/impl/client/cache/ManagedHttpCacheStorage;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "maintenanceTask", "Ljava/util/TimerTask;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "timer", "Ljava/util/Timer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "maintenanceTask", "Ljava/util/TimerTask;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "maintenanceTaskInterval", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "maintenanceTaskInterval", "J");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Timer", "schedule", "(Ljava/util/TimerTask;JJ)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "initialized", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "destroy", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "maintenanceTask", "Ljava/util/TimerTask;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/TimerTask", "cancel", "()Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "timer", "Ljava/util/Timer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Timer", "cancel", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "maintenanceTask", "Ljava/util/TimerTask;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "timer", "Ljava/util/Timer;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Executing ManagedHttpCacheStorage shutdown()");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "storage", "Lorg/apache/http/impl/client/cache/ManagedHttpCacheStorage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/impl/client/cache/ManagedHttpCacheStorage", "shutdown", "()V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error invoking ManagedHttpCacheStorage shutdown()");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "storage", "Lorg/apache/http/impl/client/cache/ManagedHttpCacheStorage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "httpClient", "Lorg/apache/http/impl/client/CloseableHttpClient;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/httpclient/FileCachingHttpClientBuilder$StorageManagingHttpClient", "destroyed", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
