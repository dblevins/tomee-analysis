package asm.org.apache.cxf.microprofile.client;
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
public class CxfTypeSafeClientBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "Ljava/lang/Object;Lorg/eclipse/microprofile/rest/client/RestClientBuilder;Ljavax/ws/rs/core/Configurable<Lorg/eclipse/microprofile/rest/client/RestClientBuilder;>;", "java/lang/Object", new String[] { "org/eclipse/microprofile/rest/client/RestClientBuilder", "javax/ws/rs/core/Configurable" });

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "REST_CLIENT_LISTENERS", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/ClassLoader;Ljava/util/Collection<Lorg/eclipse/microprofile/rest/client/spi/RestClientListener;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "baseUri", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "executorService", "Ljava/util/concurrent/ExecutorService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "configImpl", "Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl;", "Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl<Lorg/eclipse/microprofile/rest/client/RestClientBuilder;>;", null);
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl", "<init>", "(Ljavax/ws/rs/core/Configurable;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "configImpl", "Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "listeners", "()Ljava/util/Collection;", "()Ljava/util/Collection<Lorg/eclipse/microprofile/rest/client/spi/RestClientListener;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getSecurityManager", "()Ljava/lang/SecurityManager;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInvokeDynamicInsn("run", "()Ljava/security/PrivilegedAction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "lambda$listeners$0", "()Ljava/lang/ClassLoader;", false), Type.getType("()Ljava/lang/ClassLoader;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/ClassLoader");
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/ClassLoader"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "REST_CLIENT_LISTENERS", "Ljava/util/Map;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "REST_CLIENT_LISTENERS", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "lambda$listeners$1", "(Ljava/lang/ClassLoader;)Ljava/util/Collection;", false), Type.getType("(Ljava/lang/ClassLoader;)Ljava/util/Collection;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "computeIfAbsent", "(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Collection");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"java/lang/ClassLoader", "java/lang/Object"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "baseUrl", "(Ljava/net/URL;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "requireNonNull", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/URL");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "toExternalForm", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "baseUri", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "baseUri", "(Ljava/net/URI;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "requireNonNull", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/URI");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "baseUri", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "executorService", "(Ljava/util/concurrent/ExecutorService;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("executor must not be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "executorService", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "connectTimeout", "(JLjava/util/concurrent/TimeUnit;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("time unit must not be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFGE, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("timeout must be non-negative");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http.connection.timeout");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/TimeUnit", "toMillis", "(J)J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "property", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readTimeout", "(JLjava/util/concurrent/TimeUnit;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("time unit must not be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFGE, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("timeout must be non-negative");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http.receive.timeout");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/TimeUnit", "toMillis", "(J)J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "property", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "baseUri", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("baseUrl not set");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/microprofile/client/Validator", "checkValid", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/rest/client/annotation/RegisterProvider;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getAnnotationsByType", "(Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/eclipse/microprofile/rest/client/annotation/RegisterProvider;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "configImpl", "Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl", "getConfiguration", "()Ljavax/ws/rs/core/Configuration;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "java/lang/Class", "[Lorg/eclipse/microprofile/rest/client/annotation/RegisterProvider;", "javax/ws/rs/core/Configuration", "[Lorg/eclipse/microprofile/rest/client/annotation/RegisterProvider;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/rest/client/annotation/RegisterProvider", "value", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/Configuration", "isRegistered", "(Ljava/lang/Class;)Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/rest/client/annotation/RegisterProvider", "priority", "()I", true);
methodVisitor.visitInsn(ICONST_M1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/rest/client/annotation/RegisterProvider", "value", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "register", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/microprofile/rest/client/annotation/RegisterProvider"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/rest/client/annotation/RegisterProvider", "value", "()Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/rest/client/annotation/RegisterProvider", "priority", "()I", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "register", "(Ljava/lang/Class;I)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "listeners", "()Ljava/util/Collection;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder;Ljava/lang/Class;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "lambda$build$2", "(Ljava/lang/Class;Lorg/eclipse/microprofile/rest/client/spi/RestClientListener;)V", false), Type.getType("(Lorg/eclipse/microprofile/rest/client/spi/RestClientListener;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "forEach", "(Ljava/util/function/Consumer;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "configImpl", "Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "baseUri", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "executorService", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "<init>", "(Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl;Ljava/lang/String;Ljava/lang/Class;Ljava/util/concurrent/ExecutorService;Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientFactoryBean", "create", "(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConfiguration", "()Ljavax/ws/rs/core/Configuration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "configImpl", "Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl", "getConfiguration", "()Ljavax/ws/rs/core/Configuration;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "property", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "configImpl", "Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl", "property", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/ws/rs/core/Configurable;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "register", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", "(Ljava/lang/Class<*>;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "configImpl", "Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl", "register", "(Ljava/lang/Class;)Ljavax/ws/rs/core/Configurable;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "register", "(Ljava/lang/Object;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "configImpl", "Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl", "register", "(Ljava/lang/Object;)Ljavax/ws/rs/core/Configurable;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "register", "(Ljava/lang/Class;I)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", "(Ljava/lang/Class<*>;I)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "configImpl", "Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl", "register", "(Ljava/lang/Class;I)Ljavax/ws/rs/core/Configurable;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "register", "(Ljava/lang/Class;[Ljava/lang/Class;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", "(Ljava/lang/Class<*>;[Ljava/lang/Class<*>;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "configImpl", "Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl", "register", "(Ljava/lang/Class;[Ljava/lang/Class;)Ljavax/ws/rs/core/Configurable;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "register", "(Ljava/lang/Class;Ljava/util/Map;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", "(Ljava/lang/Class<*>;Ljava/util/Map<Ljava/lang/Class<*>;Ljava/lang/Integer;>;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "configImpl", "Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl", "register", "(Ljava/lang/Class;Ljava/util/Map;)Ljavax/ws/rs/core/Configurable;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "register", "(Ljava/lang/Object;I)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "configImpl", "Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl", "register", "(Ljava/lang/Object;I)Ljavax/ws/rs/core/Configurable;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "register", "(Ljava/lang/Object;[Ljava/lang/Class;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", "(Ljava/lang/Object;[Ljava/lang/Class<*>;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "configImpl", "Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl", "register", "(Ljava/lang/Object;[Ljava/lang/Class;)Ljavax/ws/rs/core/Configurable;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "register", "(Ljava/lang/Object;Ljava/util/Map;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", "(Ljava/lang/Object;Ljava/util/Map<Ljava/lang/Class<*>;Ljava/lang/Integer;>;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "configImpl", "Lorg/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientConfigurableImpl", "register", "(Ljava/lang/Object;Ljava/util/Map;)Ljavax/ws/rs/core/Configurable;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sslContext", "(Ljavax/net/ssl/SSLContext;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration", "getTlsClientParams", "()Lorg/apache/cxf/configuration/jsse/TLSClientParameters;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/jsse/TLSClientParameters", "setKeyManagers", "([Ljavax/net/ssl/KeyManager;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration", "getTlsClientParams", "()Lorg/apache/cxf/configuration/jsse/TLSClientParameters;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/jsse/TLSClientParameters", "setTrustManagers", "([Ljavax/net/ssl/TrustManager;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration", "setSslContext", "(Ljavax/net/ssl/SSLContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "keyStore", "(Ljava/security/KeyStore;Ljava/lang/String;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration", "setSslContext", "(Ljavax/net/ssl/SSLContext;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/net/ssl/KeyManagerFactory", "getDefaultAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/net/ssl/KeyManagerFactory", "getInstance", "(Ljava/lang/String;)Ljavax/net/ssl/KeyManagerFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/KeyManagerFactory", "init", "(Ljava/security/KeyStore;[C)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
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
methodVisitor.visitTypeInsn(NEW, "javax/ws/rs/ProcessingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/ProcessingException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trustStore", "(Ljava/security/KeyStore;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
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
methodVisitor.visitTypeInsn(NEW, "javax/ws/rs/ProcessingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/ProcessingException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "secConfig", "Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/TLSConfiguration", "getTlsClientParams", "()Lorg/apache/cxf/configuration/jsse/TLSClientParameters;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/jsse/TLSClientParameters", "setHostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "register", "(Ljava/lang/Object;Ljava/util/Map;)Ljavax/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "register", "(Ljava/lang/Object;Ljava/util/Map;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "register", "(Ljava/lang/Object;[Ljava/lang/Class;)Ljavax/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "register", "(Ljava/lang/Object;[Ljava/lang/Class;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "register", "(Ljava/lang/Object;I)Ljavax/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "register", "(Ljava/lang/Object;I)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "register", "(Ljava/lang/Object;)Ljavax/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "register", "(Ljava/lang/Object;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "register", "(Ljava/lang/Class;Ljava/util/Map;)Ljavax/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "register", "(Ljava/lang/Class;Ljava/util/Map;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "register", "(Ljava/lang/Class;[Ljava/lang/Class;)Ljavax/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "register", "(Ljava/lang/Class;[Ljava/lang/Class;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "register", "(Ljava/lang/Class;I)Ljavax/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "register", "(Ljava/lang/Class;I)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "register", "(Ljava/lang/Class;)Ljavax/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "register", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "property", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/ws/rs/core/Configurable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "property", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/eclipse/microprofile/rest/client/RestClientBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$build$2", "(Ljava/lang/Class;Lorg/eclipse/microprofile/rest/client/spi/RestClientListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/rest/client/spi/RestClientListener", "onNewClient", "(Ljava/lang/Class;Lorg/eclipse/microprofile/rest/client/RestClientBuilder;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$listeners$1", "(Ljava/lang/ClassLoader;)Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/rest/client/spi/RestClientListener;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/ServiceLoader", "load", "(Ljava/lang/Class;)Ljava/util/ServiceLoader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ServiceLoader", "spliterator", "()Ljava/util/Spliterator;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/StreamSupport", "stream", "(Ljava/util/Spliterator;Z)Ljava/util/stream/Stream;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collectors", "toList", "()Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$listeners$0", "()Ljava/lang/ClassLoader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/WeakHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/WeakHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/microprofile/client/CxfTypeSafeClientBuilder", "REST_CLIENT_LISTENERS", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
