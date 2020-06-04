package asm.org.apache.commons.pool2.proxy;
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
public class ProxiedObjectPoolDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/pool2/proxy/ProxiedObjectPool", "<T:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/commons/pool2/ObjectPool<TT;>;", "java/lang/Object", new String[] { "org/apache/commons/pool2/ObjectPool" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "pool", "Lorg/apache/commons/pool2/ObjectPool;", "Lorg/apache/commons/pool2/ObjectPool<TT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "proxySource", "Lorg/apache/commons/pool2/proxy/ProxySource;", "Lorg/apache/commons/pool2/proxy/ProxySource<TT;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/pool2/ObjectPool;Lorg/apache/commons/pool2/proxy/ProxySource;)V", "(Lorg/apache/commons/pool2/ObjectPool<TT;>;Lorg/apache/commons/pool2/proxy/ProxySource<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/proxy/ProxiedObjectPool", "pool", "Lorg/apache/commons/pool2/ObjectPool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/proxy/ProxiedObjectPool", "proxySource", "Lorg/apache/commons/pool2/proxy/ProxySource;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "borrowObject", "()Ljava/lang/Object;", "()TT;", new String[] { "java/lang/Exception", "java/util/NoSuchElementException", "java/lang/IllegalStateException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/proxy/ProxiedObjectPool", "pool", "Lorg/apache/commons/pool2/ObjectPool;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/commons/pool2/UsageTracking");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/proxy/ProxiedObjectPool", "pool", "Lorg/apache/commons/pool2/ObjectPool;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/pool2/UsageTracking");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/commons/pool2/UsageTracking"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/proxy/ProxiedObjectPool", "pool", "Lorg/apache/commons/pool2/ObjectPool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/pool2/ObjectPool", "borrowObject", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/proxy/ProxiedObjectPool", "proxySource", "Lorg/apache/commons/pool2/proxy/ProxySource;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/pool2/proxy/ProxySource", "createProxy", "(Ljava/lang/Object;Lorg/apache/commons/pool2/UsageTracking;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "returnObject", "(Ljava/lang/Object;)V", "(TT;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/proxy/ProxiedObjectPool", "proxySource", "Lorg/apache/commons/pool2/proxy/ProxySource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/pool2/proxy/ProxySource", "resolveProxy", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/proxy/ProxiedObjectPool", "pool", "Lorg/apache/commons/pool2/ObjectPool;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/pool2/ObjectPool", "returnObject", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invalidateObject", "(Ljava/lang/Object;)V", "(TT;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/proxy/ProxiedObjectPool", "proxySource", "Lorg/apache/commons/pool2/proxy/ProxySource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/pool2/proxy/ProxySource", "resolveProxy", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/proxy/ProxiedObjectPool", "pool", "Lorg/apache/commons/pool2/ObjectPool;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/pool2/ObjectPool", "invalidateObject", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addObject", "()V", null, new String[] { "java/lang/Exception", "java/lang/IllegalStateException", "java/lang/UnsupportedOperationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/proxy/ProxiedObjectPool", "pool", "Lorg/apache/commons/pool2/ObjectPool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/pool2/ObjectPool", "addObject", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNumIdle", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/proxy/ProxiedObjectPool", "pool", "Lorg/apache/commons/pool2/ObjectPool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/pool2/ObjectPool", "getNumIdle", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNumActive", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/proxy/ProxiedObjectPool", "pool", "Lorg/apache/commons/pool2/ObjectPool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/pool2/ObjectPool", "getNumActive", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, new String[] { "java/lang/Exception", "java/lang/UnsupportedOperationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/proxy/ProxiedObjectPool", "pool", "Lorg/apache/commons/pool2/ObjectPool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/pool2/ObjectPool", "clear", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/proxy/ProxiedObjectPool", "pool", "Lorg/apache/commons/pool2/ObjectPool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/pool2/ObjectPool", "close", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
