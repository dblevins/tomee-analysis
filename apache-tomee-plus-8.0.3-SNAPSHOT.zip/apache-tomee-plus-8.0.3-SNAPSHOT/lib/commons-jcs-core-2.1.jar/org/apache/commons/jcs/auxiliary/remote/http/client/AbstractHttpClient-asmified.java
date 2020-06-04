package asm.org.apache.commons.jcs.auxiliary.remote.http.client;
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
public class AbstractHttpClientDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "connectionManager", "Lorg/apache/commons/httpclient/MultiThreadedHttpConnectionManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "httpClient", "Lorg/apache/commons/httpclient/HttpClient;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "remoteHttpCacheAttributes", "Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/commons/logging/Log;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "remoteHttpCacheAttributes", "Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/httpclient/MultiThreadedHttpConnectionManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/httpclient/MultiThreadedHttpConnectionManager", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "connectionManager", "Lorg/apache/commons/httpclient/MultiThreadedHttpConnectionManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/httpclient/HttpClient");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "connectionManager", "Lorg/apache/commons/httpclient/MultiThreadedHttpConnectionManager;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/httpclient/HttpClient", "<init>", "(Lorg/apache/commons/httpclient/HttpConnectionManager;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "httpClient", "Lorg/apache/commons/httpclient/HttpClient;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "configureClient", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "configureClient", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "getRemoteHttpCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes", "getMaxConnectionsPerHost", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "connectionManager", "Lorg/apache/commons/httpclient/MultiThreadedHttpConnectionManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/httpclient/MultiThreadedHttpConnectionManager", "getParams", "()Lorg/apache/commons/httpclient/params/HttpConnectionManagerParams;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "getRemoteHttpCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes", "getMaxConnectionsPerHost", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/httpclient/params/HttpConnectionManagerParams", "setMaxTotalConnections", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "connectionManager", "Lorg/apache/commons/httpclient/MultiThreadedHttpConnectionManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/httpclient/MultiThreadedHttpConnectionManager", "getParams", "()Lorg/apache/commons/httpclient/params/HttpConnectionManagerParams;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "getRemoteHttpCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes", "getMaxConnectionsPerHost", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/httpclient/params/HttpConnectionManagerParams", "setDefaultMaxConnectionsPerHost", "(I)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "connectionManager", "Lorg/apache/commons/httpclient/MultiThreadedHttpConnectionManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/httpclient/MultiThreadedHttpConnectionManager", "getParams", "()Lorg/apache/commons/httpclient/params/HttpConnectionManagerParams;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "getRemoteHttpCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes", "getSocketTimeoutMillis", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/httpclient/params/HttpConnectionManagerParams", "setSoTimeout", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "getRemoteHttpCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes", "getHttpVersion", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitLdcInsn("1.1");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "httpClient", "Lorg/apache/commons/httpclient/HttpClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/httpclient/HttpClient", "getParams", "()Lorg/apache/commons/httpclient/params/HttpClientParams;", false);
methodVisitor.visitLdcInsn("http.protocol.version");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/httpclient/HttpVersion", "HTTP_1_1", "Lorg/apache/commons/httpclient/HttpVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/httpclient/params/HttpClientParams", "setParameter", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitLdcInsn("1.0");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "httpClient", "Lorg/apache/commons/httpclient/HttpClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/httpclient/HttpClient", "getParams", "()Lorg/apache/commons/httpclient/params/HttpClientParams;", false);
methodVisitor.visitLdcInsn("http.protocol.version");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/httpclient/HttpVersion", "HTTP_1_0", "Lorg/apache/commons/httpclient/HttpVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/httpclient/params/HttpClientParams", "setParameter", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Unrecognized value for 'httpVersion': [");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "warn", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "connectionManager", "Lorg/apache/commons/httpclient/MultiThreadedHttpConnectionManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/httpclient/MultiThreadedHttpConnectionManager", "getParams", "()Lorg/apache/commons/httpclient/params/HttpConnectionManagerParams;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "getRemoteHttpCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes", "getConnectionTimeoutMillis", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/httpclient/params/HttpConnectionManagerParams", "setConnectionTimeout", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "httpClient", "Lorg/apache/commons/httpclient/HttpClient;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/httpclient/HttpClient", "getParams", "()Lorg/apache/commons/httpclient/params/HttpClientParams;", false);
methodVisitor.visitLdcInsn("ignoreCookies");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/httpclient/params/HttpClientParams", "setCookiePolicy", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "doWebserviceCall", "(Lorg/apache/commons/httpclient/HttpMethod;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "preProcessWebserviceCall", "(Lorg/apache/commons/httpclient/HttpMethod;)Lorg/apache/commons/httpclient/HttpState;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "httpClient", "Lorg/apache/commons/httpclient/HttpClient;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/httpclient/HttpClient", "executeMethod", "(Lorg/apache/commons/httpclient/HostConfiguration;Lorg/apache/commons/httpclient/HttpMethod;Lorg/apache/commons/httpclient/HttpState;)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "postProcessWebserviceCall", "(Lorg/apache/commons/httpclient/HttpMethod;Lorg/apache/commons/httpclient/HttpState;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "preProcessWebserviceCall", "(Lorg/apache/commons/httpclient/HttpMethod;)Lorg/apache/commons/httpclient/HttpState;", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "postProcessWebserviceCall", "(Lorg/apache/commons/httpclient/HttpMethod;Lorg/apache/commons/httpclient/HttpState;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getRemoteHttpCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "remoteHttpCacheAttributes", "Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/auxiliary/remote/http/client/AbstractHttpClient", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
