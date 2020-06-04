package asm.org.apache.cxf.endpoint.dynamic;
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
public class DynamicClientFactory$DynamicClientImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/endpoint/dynamic/DynamicClientFactory$DynamicClientImpl", null, "org/apache/cxf/endpoint/ClientImpl", new String[] { "java/lang/AutoCloseable" });

classWriter.visitInnerClass("org/apache/cxf/endpoint/dynamic/DynamicClientFactory$DynamicClientImpl", "org/apache/cxf/endpoint/dynamic/DynamicClientFactory", "DynamicClientImpl", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "cl", "Ljava/lang/ClassLoader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "orig", "Ljava/lang/ClassLoader;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/Bus;Lorg/apache/cxf/service/Service;Ljavax/xml/namespace/QName;Lorg/apache/cxf/endpoint/EndpointImplFactory;Ljava/lang/ClassLoader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/endpoint/ClientImpl", "<init>", "(Lorg/apache/cxf/Bus;Lorg/apache/cxf/service/Service;Ljavax/xml/namespace/QName;Lorg/apache/cxf/endpoint/EndpointImplFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/endpoint/dynamic/DynamicClientFactory$DynamicClientImpl", "cl", "Ljava/lang/ClassLoader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/endpoint/dynamic/DynamicClientFactory$DynamicClientImpl", "orig", "Ljava/lang/ClassLoader;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/endpoint/dynamic/DynamicClientFactory$DynamicClientImpl", "destroy", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/endpoint/dynamic/DynamicClientFactory$DynamicClientImpl", "cl", "Ljava/lang/ClassLoader;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/endpoint/dynamic/DynamicClientFactory$DynamicClientImpl", "orig", "Ljava/lang/ClassLoader;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
