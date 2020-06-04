package asm.org.apache.openejb.client.proxy;
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
public class ProxyManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/client/proxy/ProxyManager", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/client/proxy/ProxyManager$1", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "defaultFactory", "Lorg/apache/openejb/client/proxy/ProxyFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "defaultFactoryName", "Ljava/lang/String;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDefaultFactory", "()Lorg/apache/openejb/client/proxy/ProxyFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/proxy/ProxyManager", "defaultFactory", "Lorg/apache/openejb/client/proxy/ProxyFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDefaultFactoryName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/proxy/ProxyManager", "defaultFactoryName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInvocationHandler", "(Ljava/lang/Object;)Lorg/apache/openejb/client/proxy/InvocationHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/proxy/ProxyManager", "defaultFactory", "Lorg/apache/openejb/client/proxy/ProxyFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/client/proxy/ProxyFactory", "getInvocationHandler", "(Ljava/lang/Object;)Lorg/apache/openejb/client/proxy/InvocationHandler;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setInvocationHandler", "(Ljava/lang/Object;Lorg/apache/openejb/client/proxy/InvocationHandler;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/proxy/ProxyManager", "defaultFactory", "Lorg/apache/openejb/client/proxy/ProxyFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/client/proxy/ProxyFactory", "setInvocationHandler", "(Ljava/lang/Object;Lorg/apache/openejb/client/proxy/InvocationHandler;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getProxyClass", "(Ljava/lang/Class;)Ljava/lang/Class;", null, new String[] { "java/lang/IllegalAccessException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/proxy/ProxyManager", "getProxyClass", "([Ljava/lang/Class;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getProxyClass", "([Ljava/lang/Class;)Ljava/lang/Class;", null, new String[] { "java/lang/IllegalAccessException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/proxy/ProxyManager", "defaultFactory", "Lorg/apache/openejb/client/proxy/ProxyFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/client/proxy/ProxyFactory", "getProxyClass", "([Ljava/lang/Class;)Ljava/lang/Class;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newProxyInstance", "(Ljava/lang/Class;Lorg/apache/openejb/client/proxy/InvocationHandler;)Ljava/lang/Object;", null, new String[] { "java/lang/IllegalAccessException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/proxy/ProxyManager", "newProxyInstance", "([Ljava/lang/Class;Lorg/apache/openejb/client/proxy/InvocationHandler;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newProxyInstance", "([Ljava/lang/Class;Lorg/apache/openejb/client/proxy/InvocationHandler;)Ljava/lang/Object;", null, new String[] { "java/lang/IllegalAccessException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/proxy/ProxyManager", "defaultFactory", "Lorg/apache/openejb/client/proxy/ProxyFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/client/proxy/ProxyFactory", "newProxyInstance", "([Ljava/lang/Class;Lorg/apache/openejb/client/proxy/InvocationHandler;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isProxyClass", "(Ljava/lang/Class;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/proxy/ProxyManager", "defaultFactory", "Lorg/apache/openejb/client/proxy/ProxyFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/client/proxy/ProxyFactory", "isProxyClass", "(Ljava/lang/Class;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newProxyInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", null, new String[] { "java/lang/IllegalAccessException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/proxy/ProxyManager", "defaultFactory", "Lorg/apache/openejb/client/proxy/ProxyFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/client/proxy/ProxyFactory", "newProxyInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getContextClassLoader", "()Ljava/lang/ClassLoader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/proxy/ProxyManager$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/proxy/ProxyManager$1", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/ClassLoader");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Exception");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "java/lang/Exception");
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label9, label10, label11, "java/lang/Exception");
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
methodVisitor.visitTryCatchBlock(label12, label13, label14, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("java.vm.version");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label1);
Label label15 = new Label();
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/ClientRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to determine the version of your VM.  No ProxyFactory Can be installed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/ClientRuntimeException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/proxy/ProxyManager", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("1.1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label16);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/ClientRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("This VM version is not supported: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/ClientRuntimeException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, "java/lang/ClassLoader"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("1.2");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label17);
methodVisitor.visitLdcInsn("JDK 1.2 ProxyFactory");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/proxy/ProxyManager", "defaultFactoryName", "Ljava/lang/String;");
methodVisitor.visitLabel(label3);
methodVisitor.visitLdcInsn("org.opentools.proxies.Proxy");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/ClientRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No ProxyFactory Can be installed. Unable to load the class org.opentools.proxies.Proxy.  This class is needed for generating proxies in JDK 1.2 VMs.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/ClientRuntimeException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("org.apache.openejb.client.proxy.Jdk12ProxyFactory");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label7);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/ClientRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No ProxyFactory Can be installed. Unable to load the class org.apache.openejb.client.proxy.Jdk12ProxyFactory.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/ClientRuntimeException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("JDK 1.3 ProxyFactory");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/proxy/ProxyManager", "defaultFactoryName", "Ljava/lang/String;");
methodVisitor.visitLabel(label9);
methodVisitor.visitLdcInsn("org.apache.openejb.client.proxy.Jdk13ProxyFactory");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label10);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/ClientRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No ProxyFactory Can be installed. Unable to load the class org.apache.openejb.client.proxy.Jdk13ProxyFactory.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/ClientRuntimeException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"java/lang/String", "java/lang/Class", "java/lang/ClassLoader"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "newInstance", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/client/proxy/ProxyFactory");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/proxy/ProxyManager", "defaultFactory", "Lorg/apache/openejb/client/proxy/ProxyFactory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/proxy/ProxyManager", "defaultFactory", "Lorg/apache/openejb/client/proxy/ProxyFactory;");
methodVisitor.visitTypeInsn(NEW, "java/util/Properties");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Properties", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/client/proxy/ProxyFactory", "init", "(Ljava/util/Properties;)V", true);
methodVisitor.visitLabel(label13);
Label label18 = new Label();
methodVisitor.visitJumpInsn(GOTO, label18);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/ClientRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No ProxyFactory Can be installed. Unable to load the class org.apache.openejb.client.proxy.Jdk13ProxyFactory.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/ClientRuntimeException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
