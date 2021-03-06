package asm.org.eclipse.persistence.internal.jaxb;
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
public class MultiArgInstantiationPolicyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", null, "org/eclipse/persistence/internal/descriptors/InstantiationPolicy", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parameterTypeNames", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parameterTypes", "[Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "defaultValues", "[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/descriptors/InstantiationPolicy", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setParameterTypeNames", "([Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "parameterTypeNames", "[Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setParameterTypes", "([Ljava/lang/Class;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "parameterTypes", "[Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultValues", "([Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "defaultValues", "[Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "convertClassNamesToClasses", "(Ljava/lang/ClassLoader;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/PrivilegedActionException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/ClassNotFoundException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/descriptors/InstantiationPolicy", "convertClassNamesToClasses", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "parameterTypes", "[Ljava/lang/Class;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "parameterTypeNames", "[Ljava/lang/String;");
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "parameterTypeNames", "[Ljava/lang/String;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[Ljava/lang/Class;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "shouldUsePrivilegedAccess", "()Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/security/PrivilegedClassForName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "parameterTypeNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/security/PrivilegedClassForName", "<init>", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label1);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/PrivilegedActionException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "parameterTypeNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getException", "()Ljava/lang/Exception;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "classNotFoundWhileConvertingClassNames", "(Ljava/lang/String;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "parameterTypeNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getClassForName", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "factoryClassName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "classNotFoundWhileConvertingClassNames", "(Ljava/lang/String;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPLT, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "parameterTypes", "[Ljava/lang/Class;");
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initializeMethod", "()V", null, new String[] { "org/eclipse/persistence/exceptions/DescriptorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getFactory", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getFactory", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getFactoryClass", "()Ljava/lang/Class;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getFactoryClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "parameterTypes", "[Ljava/lang/Class;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getMethodName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "buildMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "setMethod", "(Ljava/lang/reflect/Method;)V", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getMethodName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "parameterTypes", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "buildMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "setMethod", "(Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "buildNewInstanceUsingFactory", "()Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/DescriptorException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/PrivilegedActionException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label1, label4, "java/lang/IllegalAccessException");
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label2, label5, label4, "java/lang/IllegalAccessException");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label3, label1, label6, "java/lang/reflect/InvocationTargetException");
methodVisitor.visitTryCatchBlock(label2, label5, label6, "java/lang/reflect/InvocationTargetException");
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label3, label1, label7, "java/lang/NullPointerException");
methodVisitor.visitTryCatchBlock(label2, label5, label7, "java/lang/NullPointerException");
methodVisitor.visitLabel(label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "shouldUsePrivilegedAccess", "()Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/security/PrivilegedMethodInvoker");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getFactory", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "defaultValues", "[Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/security/PrivilegedMethodInvoker", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/PrivilegedActionException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getException", "()Ljava/lang/Exception;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/IllegalAccessException");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "illegalAccessWhileMethodInstantiation", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/security/PrivilegedActionException", "java/lang/Exception"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "targetInvocationWhileMethodInstantiation", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getFactory", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "defaultValues", "[Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "invokeMethod", "(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/IllegalAccessException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "illegalAccessWhileMethodInstantiation", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/reflect/InvocationTargetException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "targetInvocationWhileMethodInstantiation", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NullPointerException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jaxb/MultiArgInstantiationPolicy", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "nullPointerWhileMethodInstantiation", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
