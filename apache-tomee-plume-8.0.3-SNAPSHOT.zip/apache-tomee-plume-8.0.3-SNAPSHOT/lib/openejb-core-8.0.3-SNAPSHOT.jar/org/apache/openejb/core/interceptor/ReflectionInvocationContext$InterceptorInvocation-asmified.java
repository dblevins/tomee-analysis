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
public class ReflectionInvocationContext$InterceptorInvocationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/core/interceptor/ReflectionInvocationContext$InterceptorInvocation", null, "org/apache/openejb/core/interceptor/ReflectionInvocationContext$Invocation", null);

classWriter.visitInnerClass("org/apache/openejb/core/interceptor/ReflectionInvocationContext$InterceptorInvocation", "org/apache/openejb/core/interceptor/ReflectionInvocationContext", "InterceptorInvocation", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/core/interceptor/ReflectionInvocationContext$Invocation", "org/apache/openejb/core/interceptor/ReflectionInvocationContext", "Invocation", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljakarta/interceptor/InvocationContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/interceptor/ReflectionInvocationContext$Invocation", "<init>", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
