package asm.org.apache.openejb.resource;
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
public class AutoConnectionTracker$ProxyPhantomReferenceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/resource/AutoConnectionTracker$ProxyPhantomReference", "Ljava/lang/ref/PhantomReference<Lorg/apache/openejb/resource/AutoConnectionTracker$ConnectionInvocationHandler;>;", "java/lang/ref/PhantomReference", null);

classWriter.visitInnerClass("org/apache/openejb/resource/AutoConnectionTracker$ConnectionInvocationHandler", "org/apache/openejb/resource/AutoConnectionTracker", "ConnectionInvocationHandler", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/AutoConnectionTracker$ProxyPhantomReference", "org/apache/openejb/resource/AutoConnectionTracker", "ProxyPhantomReference", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "interceptor", "Lorg/apache/geronimo/connector/outbound/ConnectionTrackingInterceptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "managedConnectionInfo", "Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "stackTrace", "[Ljava/lang/StackTraceElement;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/geronimo/connector/outbound/ConnectionTrackingInterceptor;Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;Lorg/apache/openejb/resource/AutoConnectionTracker$ConnectionInvocationHandler;Ljava/lang/ref/ReferenceQueue;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ref/PhantomReference", "<init>", "(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/AutoConnectionTracker$ProxyPhantomReference", "interceptor", "Lorg/apache/geronimo/connector/outbound/ConnectionTrackingInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/AutoConnectionTracker$ProxyPhantomReference", "managedConnectionInfo", "Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getStackTrace", "()[Ljava/lang/StackTraceElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/AutoConnectionTracker$ProxyPhantomReference", "stackTrace", "[Ljava/lang/StackTraceElement;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/openejb/resource/AutoConnectionTracker$ProxyPhantomReference;)Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/AutoConnectionTracker$ProxyPhantomReference", "managedConnectionInfo", "Lorg/apache/geronimo/connector/outbound/ManagedConnectionInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/openejb/resource/AutoConnectionTracker$ProxyPhantomReference;)Lorg/apache/geronimo/connector/outbound/ConnectionTrackingInterceptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/AutoConnectionTracker$ProxyPhantomReference", "interceptor", "Lorg/apache/geronimo/connector/outbound/ConnectionTrackingInterceptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/openejb/resource/AutoConnectionTracker$ProxyPhantomReference;)[Ljava/lang/StackTraceElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/AutoConnectionTracker$ProxyPhantomReference", "stackTrace", "[Ljava/lang/StackTraceElement;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
