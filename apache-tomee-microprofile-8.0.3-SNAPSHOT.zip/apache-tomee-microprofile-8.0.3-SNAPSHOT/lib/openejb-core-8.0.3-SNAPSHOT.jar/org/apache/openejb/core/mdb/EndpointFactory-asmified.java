package asm.org.apache.openejb.core.mdb;
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
public class EndpointFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/core/mdb/EndpointFactory", null, "java/lang/Object", new String[] { "jakarta/resource/spi/endpoint/MessageEndpointFactory" });

classWriter.visitInnerClass("org/apache/openejb/BeanContext$ProxyClass", "org/apache/openejb/BeanContext", "ProxyClass", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "activationSpec", "Ljakarta/resource/spi/ActivationSpec;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "container", "Lorg/apache/openejb/core/mdb/BaseMdbContainer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "beanContext", "Lorg/apache/openejb/BeanContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "instanceFactory", "Lorg/apache/openejb/core/mdb/MdbInstanceFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "instanceManager", "Lorg/apache/openejb/core/mdb/MdbInstanceManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "classLoader", "Ljava/lang/ClassLoader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "interfaces", "[Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "xaResourceWrapper", "Lorg/apache/openejb/resource/XAResourceWrapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "jmxNames", "Ljava/util/List;", "Ljava/util/List<Ljavax/management/ObjectName;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "proxy", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "usePool", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/resource/spi/ActivationSpec;Lorg/apache/openejb/core/mdb/BaseMdbContainer;Lorg/apache/openejb/BeanContext;Lorg/apache/openejb/core/mdb/MdbInstanceFactory;Lorg/apache/openejb/core/mdb/MdbInstanceManager;Lorg/apache/openejb/resource/XAResourceWrapper;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "jmxNames", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "activationSpec", "Ljakarta/resource/spi/ActivationSpec;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "container", "Lorg/apache/openejb/core/mdb/BaseMdbContainer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "beanContext", "Lorg/apache/openejb/BeanContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "instanceFactory", "Lorg/apache/openejb/core/mdb/MdbInstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "instanceManager", "Lorg/apache/openejb/core/mdb/MdbInstanceManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/mdb/BaseMdbContainer", "getMessageListenerInterface", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "classLoader", "Ljava/lang/ClassLoader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/mdb/BaseMdbContainer", "getMessageListenerInterface", "()Ljava/lang/Class;", true);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/resource/spi/endpoint/MessageEndpoint;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "interfaces", "[Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "xaResourceWrapper", "Lorg/apache/openejb/resource/XAResourceWrapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "usePool", "Z");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/BeanContext$ProxyClass;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext", "get", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/BeanContext$ProxyClass");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext", "getBeanClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "interfaces", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/proxy/LocalBeanProxyFactory", "createProxy", "(Ljava/lang/Class;Ljava/lang/ClassLoader;[Ljava/lang/Class;)Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "proxy", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/BeanContext$ProxyClass;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/BeanContext$ProxyClass");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "interfaces", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/BeanContext$ProxyClass", "<init>", "(Lorg/apache/openejb/BeanContext;[Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext", "set", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/openejb/core/mdb/EndpointFactory", "jakarta/resource/spi/ActivationSpec", "org/apache/openejb/core/mdb/BaseMdbContainer", "org/apache/openejb/BeanContext", "org/apache/openejb/core/mdb/MdbInstanceFactory", "org/apache/openejb/core/mdb/MdbInstanceManager", "org/apache/openejb/resource/XAResourceWrapper", Opcodes.INTEGER, "org/apache/openejb/BeanContext$ProxyClass"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext$ProxyClass", "getProxy", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "proxy", "Ljava/lang/Class;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getActivationSpec", "()Ljakarta/resource/spi/ActivationSpec;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "activationSpec", "Ljakarta/resource/spi/ActivationSpec;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInstanceFactory", "()Lorg/apache/openejb/core/mdb/MdbInstanceFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "instanceFactory", "Lorg/apache/openejb/core/mdb/MdbInstanceFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEndpoint", "(Ljavax/transaction/xa/XAResource;)Ljakarta/resource/spi/endpoint/MessageEndpoint;", null, new String[] { "jakarta/resource/spi/UnavailableException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/InternalError");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/InternalError");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "java/lang/InternalError");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "xaResourceWrapper", "Lorg/apache/openejb/resource/XAResourceWrapper;");
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "xaResourceWrapper", "Lorg/apache/openejb/resource/XAResourceWrapper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "container", "Lorg/apache/openejb/core/mdb/BaseMdbContainer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/mdb/BaseMdbContainer", "getContainerID", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/resource/XAResourceWrapper", "wrap", "(Ljavax/transaction/xa/XAResource;Ljava/lang/String;)Ljavax/transaction/xa/XAResource;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "usePool", "Z");
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/mdb/PoolEndpointHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "container", "Lorg/apache/openejb/core/mdb/BaseMdbContainer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "beanContext", "Lorg/apache/openejb/BeanContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "instanceManager", "Lorg/apache/openejb/core/mdb/MdbInstanceManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/mdb/PoolEndpointHandler", "<init>", "(Lorg/apache/openejb/core/mdb/BaseMdbContainer;Lorg/apache/openejb/BeanContext;Lorg/apache/openejb/core/mdb/MdbInstanceManager;Ljavax/transaction/xa/XAResource;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/reflect/InvocationHandler"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/mdb/EndpointHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "container", "Lorg/apache/openejb/core/mdb/BaseMdbContainer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "beanContext", "Lorg/apache/openejb/BeanContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "instanceFactory", "Lorg/apache/openejb/core/mdb/MdbInstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/mdb/EndpointHandler", "<init>", "(Lorg/apache/openejb/core/mdb/BaseMdbContainer;Lorg/apache/openejb/BeanContext;Lorg/apache/openejb/core/mdb/MdbInstanceFactory;Ljavax/transaction/xa/XAResource;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "proxy", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/proxy/LocalBeanProxyFactory", "constructProxy", "(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/resource/spi/endpoint/MessageEndpoint");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InternalError"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/resource/spi/endpoint/MessageEndpoint;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "beanContext", "Lorg/apache/openejb/BeanContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext", "getBeanClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "interfaces", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/proxy/LocalBeanProxyFactory", "newProxyInstance", "(Ljava/lang/ClassLoader;Ljava/lang/reflect/InvocationHandler;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/resource/spi/endpoint/MessageEndpoint");
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/openejb/core/mdb/EndpointFactory", "javax/transaction/xa/XAResource", "java/lang/reflect/InvocationHandler", "java/lang/InternalError"}, 1, new Object[] {"java/lang/InternalError"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label6);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/resource/spi/endpoint/MessageEndpoint;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "classLoader", "Ljava/lang/ClassLoader;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "beanContext", "Lorg/apache/openejb/BeanContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext", "getBeanClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "interfaces", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/proxy/LocalBeanProxyFactory", "newProxyInstance", "(Ljava/lang/ClassLoader;Ljava/lang/reflect/InvocationHandler;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/resource/spi/endpoint/MessageEndpoint");
methodVisitor.visitLabel(label7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/openejb/core/mdb/EndpointFactory", "javax/transaction/xa/XAResource", "java/lang/reflect/InvocationHandler", "java/lang/InternalError", "java/lang/InternalError"}, 1, new Object[] {"java/lang/InternalError"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEndpoint", "(Ljavax/transaction/xa/XAResource;J)Ljakarta/resource/spi/endpoint/MessageEndpoint;", null, new String[] { "jakarta/resource/spi/UnavailableException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFGT, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/mdb/EndpointFactory", "createEndpoint", "(Ljavax/transaction/xa/XAResource;)Ljakarta/resource/spi/endpoint/MessageEndpoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.LONG, "jakarta/resource/spi/endpoint/MessageEndpoint"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LCMP);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFGT, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/mdb/EndpointFactory", "createEndpoint", "(Ljavax/transaction/xa/XAResource;)Ljakarta/resource/spi/endpoint/MessageEndpoint;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "jakarta/resource/spi/UnavailableException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Unable to create end point within the specified timeout ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/resource/spi/UnavailableException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDeliveryTransacted", "(Ljava/lang/reflect/Method;)Z", null, new String[] { "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/EndpointFactory", "beanContext", "Lorg/apache/openejb/BeanContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext", "getTransactionType", "(Ljava/lang/reflect/Method;)Lorg/apache/openejb/core/transaction/TransactionType;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/transaction/TransactionType", "Required", "Lorg/apache/openejb/core/transaction/TransactionType;");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/core/transaction/TransactionType"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
