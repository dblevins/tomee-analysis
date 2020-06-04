package asm.org.apache.openejb.core.interceptor;
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
public class ReflectionInvocationContext$LifecycleInvocationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/core/interceptor/ReflectionInvocationContext$LifecycleInvocation", null, "org/apache/openejb/core/interceptor/ReflectionInvocationContext$Invocation", null);

classWriter.visitInnerClass("org/apache/openejb/core/interceptor/ReflectionInvocationContext$LifecycleInvocation", "org/apache/openejb/core/interceptor/ReflectionInvocationContext", "LifecycleInvocation", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/core/interceptor/ReflectionInvocationContext$Invocation", "org/apache/openejb/core/interceptor/ReflectionInvocationContext", "Invocation", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "invocationContext", "Ljavax/interceptor/InvocationContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljavax/interceptor/InvocationContext;[Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/interceptor/ReflectionInvocationContext$Invocation", "<init>", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/interceptor/ReflectionInvocationContext$LifecycleInvocation", "invocationContext", "Ljavax/interceptor/InvocationContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/interceptor/ReflectionInvocationContext$Invocation", "invoke", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/interceptor/ReflectionInvocationContext$LifecycleInvocation", "invocationContext", "Ljavax/interceptor/InvocationContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/interceptor/InvocationContext", "proceed", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
