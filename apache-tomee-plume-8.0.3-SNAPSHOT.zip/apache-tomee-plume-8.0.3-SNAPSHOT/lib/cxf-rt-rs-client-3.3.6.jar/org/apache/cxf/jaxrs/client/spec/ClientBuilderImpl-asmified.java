package asm.org.apache.cxf.jaxrs.client.spec;
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
public class ClientBuilderImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", null, "jakarta/ws/rs/client/ClientBuilder", null);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl<Ljakarta/ws/rs/client/ClientBuilder;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/client/ClientBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "<init>", "(Ljakarta/ws/rs/core/Configurable;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConfiguration", "()Ljakarta/ws/rs/core/Configuration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "getConfiguration", "()Ljakarta/ws/rs/core/Configuration;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "property", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/client/ClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "property", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/Configurable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ws/rs/client/ClientBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "register", "(Ljava/lang/Class;)Ljakarta/ws/rs/client/ClientBuilder;", "(Ljava/lang/Class<*>;)Ljakarta/ws/rs/client/ClientBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "register", "(Ljava/lang/Class;)Ljakarta/ws/rs/core/Configurable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ws/rs/client/ClientBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "register", "(Ljava/lang/Object;)Ljakarta/ws/rs/client/ClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "register", "(Ljava/lang/Object;)Ljakarta/ws/rs/core/Configurable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ws/rs/client/ClientBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "register", "(Ljava/lang/Class;I)Ljakarta/ws/rs/client/ClientBuilder;", "(Ljava/lang/Class<*>;I)Ljakarta/ws/rs/client/ClientBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "register", "(Ljava/lang/Class;I)Ljakarta/ws/rs/core/Configurable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ws/rs/client/ClientBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "register", "(Ljava/lang/Class;[Ljava/lang/Class;)Ljakarta/ws/rs/client/ClientBuilder;", "(Ljava/lang/Class<*>;[Ljava/lang/Class<*>;)Ljakarta/ws/rs/client/ClientBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "register", "(Ljava/lang/Class;[Ljava/lang/Class;)Ljakarta/ws/rs/core/Configurable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ws/rs/client/ClientBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "register", "(Ljava/lang/Class;Ljava/util/Map;)Ljakarta/ws/rs/client/ClientBuilder;", "(Ljava/lang/Class<*>;Ljava/util/Map<Ljava/lang/Class<*>;Ljava/lang/Integer;>;)Ljakarta/ws/rs/client/ClientBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "register", "(Ljava/lang/Class;Ljava/util/Map;)Ljakarta/ws/rs/core/Configurable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ws/rs/client/ClientBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "register", "(Ljava/lang/Object;I)Ljakarta/ws/rs/client/ClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "register", "(Ljava/lang/Object;I)Ljakarta/ws/rs/core/Configurable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ws/rs/client/ClientBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "register", "(Ljava/lang/Object;[Ljava/lang/Class;)Ljakarta/ws/rs/client/ClientBuilder;", "(Ljava/lang/Object;[Ljava/lang/Class<*>;)Ljakarta/ws/rs/client/ClientBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "register", "(Ljava/lang/Object;[Ljava/lang/Class;)Ljakarta/ws/rs/core/Configurable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ws/rs/client/ClientBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "register", "(Ljava/lang/Object;Ljava/util/Map;)Ljakarta/ws/rs/client/ClientBuilder;", "(Ljava/lang/Object;Ljava/util/Map<Ljava/lang/Class<*>;Ljava/lang/Integer;>;)Ljakarta/ws/rs/client/ClientBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "register", "(Ljava/lang/Object;Ljava/util/Map;)Ljakarta/ws/rs/core/Configurable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ws/rs/client/ClientBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "()Ljakarta/ws/rs/client/Client;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "getConfiguration", "()Ljakarta/ws/rs/core/Configuration;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl$1", "<init>", "(Lorg/apache/cxf/jaxrs/client/spec/ClientBuilderImpl;Ljakarta/ws/rs/core/Configuration;Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)Ljakarta/ws/rs/client/ClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration", "getTlsClientParams", "()Lorg/apache/cxf/configuration/jsse/TLSClientParameters;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/jsse/TLSClientParameters", "setHostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sslContext", "(Ljavax/net/ssl/SSLContext;)Ljakarta/ws/rs/client/ClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration", "getTlsClientParams", "()Lorg/apache/cxf/configuration/jsse/TLSClientParameters;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/jsse/TLSClientParameters", "setKeyManagers", "([Ljavax/net/ssl/KeyManager;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration", "getTlsClientParams", "()Lorg/apache/cxf/configuration/jsse/TLSClientParameters;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/jsse/TLSClientParameters", "setTrustManagers", "([Ljavax/net/ssl/TrustManager;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration", "setSslContext", "(Ljavax/net/ssl/SSLContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "keyStore", "(Ljava/security/KeyStore;[C)Ljakarta/ws/rs/client/ClientBuilder;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration", "setSslContext", "(Ljavax/net/ssl/SSLContext;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/net/ssl/KeyManagerFactory", "getDefaultAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/net/ssl/KeyManagerFactory", "getInstance", "(Ljava/lang/String;)Ljavax/net/ssl/KeyManagerFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/KeyManagerFactory", "init", "(Ljava/security/KeyStore;[C)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration", "getTlsClientParams", "()Lorg/apache/cxf/configuration/jsse/TLSClientParameters;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/KeyManagerFactory", "getKeyManagers", "()[Ljavax/net/ssl/KeyManager;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/jsse/TLSClientParameters", "setKeyManagers", "([Ljavax/net/ssl/KeyManager;)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/ProcessingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ProcessingException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trustStore", "(Ljava/security/KeyStore;)Ljakarta/ws/rs/client/ClientBuilder;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration", "setSslContext", "(Ljavax/net/ssl/SSLContext;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/net/ssl/TrustManagerFactory", "getDefaultAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/net/ssl/TrustManagerFactory", "getInstance", "(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/TrustManagerFactory", "init", "(Ljava/security/KeyStore;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration", "getTlsClientParams", "()Lorg/apache/cxf/configuration/jsse/TLSClientParameters;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/TrustManagerFactory", "getTrustManagers", "()[Ljavax/net/ssl/TrustManager;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/jsse/TLSClientParameters", "setTrustManagers", "([Ljavax/net/ssl/TrustManager;)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/ProcessingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ProcessingException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withConfig", "(Ljakarta/ws/rs/core/Configuration;)Ljakarta/ws/rs/client/ClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/core/Configuration", "getRuntimeType", "()Ljakarta/ws/rs/RuntimeType;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/RuntimeType", "CLIENT", "Ljakarta/ws/rs/RuntimeType;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "<init>", "(Ljakarta/ws/rs/core/Configurable;Ljakarta/ws/rs/core/Configuration;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "executorService", "(Ljava/util/concurrent/ExecutorService;)Ljakarta/ws/rs/client/ClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;");
methodVisitor.visitLdcInsn("executorService");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "property", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/Configurable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ws/rs/client/ClientBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scheduledExecutorService", "(Ljava/util/concurrent/ScheduledExecutorService;)Ljakarta/ws/rs/client/ClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;");
methodVisitor.visitLdcInsn("scheduledExecutorService");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "property", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/Configurable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ws/rs/client/ClientBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "connectTimeout", "(JLjava/util/concurrent/TimeUnit;)Ljakarta/ws/rs/client/ClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "validateTimeout", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http.connection.timeout");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/TimeUnit", "toMillis", "(J)J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "property", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/client/ClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readTimeout", "(JLjava/util/concurrent/TimeUnit;)Ljakarta/ws/rs/client/ClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "validateTimeout", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http.receive.timeout");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/TimeUnit", "toMillis", "(J)J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "property", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/client/ClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "validateTimeout", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Negative timeout is not allowed.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "register", "(Ljava/lang/Object;Ljava/util/Map;)Ljakarta/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "register", "(Ljava/lang/Object;Ljava/util/Map;)Ljakarta/ws/rs/client/ClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "register", "(Ljava/lang/Object;[Ljava/lang/Class;)Ljakarta/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "register", "(Ljava/lang/Object;[Ljava/lang/Class;)Ljakarta/ws/rs/client/ClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "register", "(Ljava/lang/Object;I)Ljakarta/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "register", "(Ljava/lang/Object;I)Ljakarta/ws/rs/client/ClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "register", "(Ljava/lang/Object;)Ljakarta/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "register", "(Ljava/lang/Object;)Ljakarta/ws/rs/client/ClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "register", "(Ljava/lang/Class;Ljava/util/Map;)Ljakarta/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "register", "(Ljava/lang/Class;Ljava/util/Map;)Ljakarta/ws/rs/client/ClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "register", "(Ljava/lang/Class;[Ljava/lang/Class;)Ljakarta/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "register", "(Ljava/lang/Class;[Ljava/lang/Class;)Ljakarta/ws/rs/client/ClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "register", "(Ljava/lang/Class;I)Ljakarta/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "register", "(Ljava/lang/Class;I)Ljakarta/ws/rs/client/ClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "register", "(Ljava/lang/Class;)Ljakarta/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "register", "(Ljava/lang/Class;)Ljakarta/ws/rs/client/ClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "property", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "property", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/client/ClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/cxf/jaxrs/client/spec/ClientBuilderImpl;)Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "configImpl", "Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
