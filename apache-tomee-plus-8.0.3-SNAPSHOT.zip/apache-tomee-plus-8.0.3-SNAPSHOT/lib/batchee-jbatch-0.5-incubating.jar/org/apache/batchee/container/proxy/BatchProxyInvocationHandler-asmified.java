package asm.org.apache.batchee.container.proxy;
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
public class BatchProxyInvocationHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/proxy/BatchProxyInvocationHandler", null, "java/lang/Object", new String[] { "java/lang/reflect/InvocationHandler" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "injectionRefs", "Lorg/apache/batchee/container/proxy/InjectionReferences;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "nonExceptionHandlingMethods", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "<init>", "(Ljava/lang/Object;Lorg/apache/batchee/container/proxy/InjectionReferences;[Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/proxy/BatchProxyInvocationHandler", "delegate", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/proxy/BatchProxyInvocationHandler", "injectionRefs", "Lorg/apache/batchee/container/proxy/InjectionReferences;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/proxy/BatchProxyInvocationHandler", "nonExceptionHandlingMethods", "[Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "java/lang/Throwable" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, null);
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label2, label4, label3, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/proxy/BatchProxyInvocationHandler", "injectionRefs", "Lorg/apache/batchee/container/proxy/InjectionReferences;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/proxy/ProxyFactory", "setInjectionReferences", "(Lorg/apache/batchee/container/proxy/InjectionReferences;)Lorg/apache/batchee/container/proxy/InjectionReferences;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/proxy/BatchProxyInvocationHandler", "delegate", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/proxy/ProxyFactory", "setInjectionReferences", "(Lorg/apache/batchee/container/proxy/InjectionReferences;)Lorg/apache/batchee/container/proxy/InjectionReferences;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/batchee/container/proxy/BatchProxyInvocationHandler", "java/lang/Object", "java/lang/reflect/Method", "[Ljava/lang/Object;", "org/apache/batchee/container/proxy/InjectionReferences"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/reflect/InvocationTargetException");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/proxy/BatchProxyInvocationHandler", "nonExceptionHandlingMethods", "[Ljava/lang/String;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/proxy/BatchProxyInvocationHandler", "nonExceptionHandlingMethods", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "binarySearch", "([Ljava/lang/Object;Ljava/lang/Object;)I", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFGE, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Exception");
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/proxy/BatchProxyInvocationHandler", "injectionRefs", "Lorg/apache/batchee/container/proxy/InjectionReferences;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/proxy/InjectionReferences", "getStepContext", "()Lorg/apache/batchee/container/impl/StepContextImpl;", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/proxy/BatchProxyInvocationHandler", "injectionRefs", "Lorg/apache/batchee/container/proxy/InjectionReferences;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/proxy/InjectionReferences", "getStepContext", "()Lorg/apache/batchee/container/impl/StepContextImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Exception");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/StepContextImpl", "setException", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/exception/BatchContainerRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/exception/BatchContainerRuntimeException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/batchee/container/proxy/BatchProxyInvocationHandler", "java/lang/Object", "java/lang/reflect/Method", "[Ljava/lang/Object;", "org/apache/batchee/container/proxy/InjectionReferences"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/proxy/ProxyFactory", "setInjectionReferences", "(Lorg/apache/batchee/container/proxy/InjectionReferences;)Lorg/apache/batchee/container/proxy/InjectionReferences;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
