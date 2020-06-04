package asm.org.apache.webbeans.service;
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
public class ClassLoaderProxyServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/service/ClassLoaderProxyService", null, "java/lang/Object", new String[] { "org/apache/webbeans/spi/DefiningClassService" });

classWriter.visitInnerClass("org/apache/webbeans/service/ClassLoaderProxyService$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/webbeans/service/ClassLoaderProxyService$ProxiesClassLoader", "org/apache/webbeans/service/ClassLoaderProxyService", "ProxiesClassLoader", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "loader", "Lorg/apache/webbeans/service/ClassLoaderProxyService$ProxiesClassLoader;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/service/ClassLoaderProxyService$ProxiesClassLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getApplicationBoundaryService", "()Lorg/apache/webbeans/spi/ApplicationBoundaryService;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ApplicationBoundaryService", "getApplicationClassLoader", "()Ljava/lang/ClassLoader;", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/service/ClassLoaderProxyService$ProxiesClassLoader", "<init>", "(Ljava/lang/ClassLoader;Lorg/apache/webbeans/service/ClassLoaderProxyService$1;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/service/ClassLoaderProxyService", "loader", "Lorg/apache/webbeans/service/ClassLoaderProxyService$ProxiesClassLoader;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProxyClassLoader", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", "(Ljava/lang/Class<*>;)Ljava/lang/ClassLoader;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/service/ClassLoaderProxyService", "loader", "Lorg/apache/webbeans/service/ClassLoaderProxyService$ProxiesClassLoader;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "defineAndLoad", "(Ljava/lang/String;[BLjava/lang/Class;)Ljava/lang/Class;", "<T:Ljava/lang/Object;>(Ljava/lang/String;[BLjava/lang/Class<TT;>;)Ljava/lang/Class<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/service/ClassLoaderProxyService", "loader", "Lorg/apache/webbeans/service/ClassLoaderProxyService$ProxiesClassLoader;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getPackage", "()Ljava/lang/Package;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getProtectionDomain", "()Ljava/security/ProtectionDomain;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/service/ClassLoaderProxyService$ProxiesClassLoader", "access$100", "(Lorg/apache/webbeans/service/ClassLoaderProxyService$ProxiesClassLoader;Ljava/lang/String;[BLjava/lang/Package;Ljava/security/ProtectionDomain;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
