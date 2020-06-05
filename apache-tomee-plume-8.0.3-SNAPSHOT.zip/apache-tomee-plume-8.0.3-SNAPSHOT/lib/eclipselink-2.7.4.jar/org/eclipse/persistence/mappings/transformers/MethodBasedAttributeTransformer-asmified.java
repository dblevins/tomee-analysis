package asm.org.eclipse.persistence.mappings.transformers;
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
public class MethodBasedAttributeTransformerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", null, "java/lang/Object", new String[] { "org/eclipse/persistence/mappings/transformers/AttributeTransformer" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_TRANSIENT, "attributeTransformationMethod", "Ljava/lang/reflect/Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mapping", "Lorg/eclipse/persistence/mappings/foundation/AbstractTransformationMapping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "methodName", "Ljava/lang/String;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "methodName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMethodName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "methodName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMethodName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "methodName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeTransformationMethod", "()Ljava/lang/reflect/Method;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "attributeTransformationMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAttributeTransformationMethod", "(Ljava/lang/reflect/Method;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "attributeTransformationMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Lorg/eclipse/persistence/mappings/foundation/AbstractTransformationMapping;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchMethodException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/NoSuchMethodException");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "java/lang/NoSuchMethodException");
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label9, "java/lang/SecurityException");
Label label10 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label10, "java/lang/SecurityException");
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label11, "java/lang/SecurityException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "mapping", "Lorg/eclipse/persistence/mappings/foundation/AbstractTransformationMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "mapping", "Lorg/eclipse/persistence/mappings/foundation/AbstractTransformationMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/foundation/AbstractTransformationMapping", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "Record_Class", "Ljava/lang/Class;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "methodName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/Helper", "getDeclaredMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "attributeTransformationMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitLabel(label1);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "org/eclipse/persistence/mappings/foundation/AbstractTransformationMapping", "java/lang/Class"}, 1, new Object[] {"java/lang/NoSuchMethodException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "Record_Class", "Ljava/lang/Class;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PublicInterfaceSession_Class", "Ljava/lang/Class;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "methodName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/Helper", "getDeclaredMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "attributeTransformationMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "org/eclipse/persistence/mappings/foundation/AbstractTransformationMapping", "java/lang/Class", "java/lang/NoSuchMethodException"}, 1, new Object[] {"java/lang/NoSuchMethodException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label6);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "Record_Class", "Ljava/lang/Class;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "SessionsSession_Class", "Ljava/lang/Class;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "methodName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/Helper", "getDeclaredMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "attributeTransformationMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitLabel(label7);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "org/eclipse/persistence/mappings/foundation/AbstractTransformationMapping", "java/lang/Class", "java/lang/NoSuchMethodException", "java/lang/NoSuchMethodException"}, 1, new Object[] {"java/lang/NoSuchMethodException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "mapping", "Lorg/eclipse/persistence/mappings/foundation/AbstractTransformationMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/foundation/AbstractTransformationMapping", "getAttributeMethodName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "noSuchMethodOnInitializingAttributeMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/SecurityException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "mapping", "Lorg/eclipse/persistence/mappings/foundation/AbstractTransformationMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/foundation/AbstractTransformationMapping", "getAttributeMethodName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "securityOnInitializingAttributeMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "org/eclipse/persistence/mappings/foundation/AbstractTransformationMapping", "java/lang/Class", "java/lang/NoSuchMethodException"}, 1, new Object[] {"java/lang/SecurityException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "mapping", "Lorg/eclipse/persistence/mappings/foundation/AbstractTransformationMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/foundation/AbstractTransformationMapping", "getAttributeMethodName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "securityOnInitializingAttributeMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "org/eclipse/persistence/mappings/foundation/AbstractTransformationMapping", "java/lang/Class"}, 1, new Object[] {"java/lang/SecurityException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "mapping", "Lorg/eclipse/persistence/mappings/foundation/AbstractTransformationMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/foundation/AbstractTransformationMapping", "getAttributeMethodName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "securityOnInitializingAttributeMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "attributeTransformationMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getReturnType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "Void_Class", "Ljava/lang/Class;");
Label label13 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "methodName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "returnTypeInGetAttributeAccessor", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildAttributeValue", "(Lorg/eclipse/persistence/sessions/Record;Ljava/lang/Object;Lorg/eclipse/persistence/sessions/Session;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/PrivilegedActionException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/security/PrivilegedActionException");
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label6, label4, label7, "java/lang/IllegalAccessException");
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label5, label8, label7, "java/lang/IllegalAccessException");
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label6, label4, label9, "java/lang/IllegalArgumentException");
methodVisitor.visitTryCatchBlock(label5, label8, label9, "java/lang/IllegalArgumentException");
Label label10 = new Label();
methodVisitor.visitTryCatchBlock(label6, label4, label10, "java/lang/reflect/InvocationTargetException");
methodVisitor.visitTryCatchBlock(label5, label8, label10, "java/lang/reflect/InvocationTargetException");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "shouldUsePrivilegedAccess", "()Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/security/PrivilegedGetMethodParameterTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "attributeTransformationMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/security/PrivilegedGetMethodParameterTypes", "<init>", "(Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "org/eclipse/persistence/sessions/Record", "java/lang/Object", "org/eclipse/persistence/sessions/Session", "[Ljava/lang/Class;"}, 1, new Object[] {"java/security/PrivilegedActionException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/RuntimeException");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "attributeTransformationMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getMethodParameterTypes", "(Ljava/lang/reflect/Method;)[Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitJumpInsn(IF_ICMPNE, label6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Ljava/lang/Object;"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "shouldUsePrivilegedAccess", "()Z", false);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/security/PrivilegedMethodInvoker");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "attributeTransformationMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/security/PrivilegedMethodInvoker", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/PrivilegedActionException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/IllegalArgumentException");
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label14);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/security/PrivilegedActionException"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/reflect/InvocationTargetException");
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label15);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/InvocationTargetException");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/RuntimeException");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "attributeTransformationMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "invokeMethod", "(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/IllegalAccessException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "mapping", "Lorg/eclipse/persistence/mappings/foundation/AbstractTransformationMapping;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "illegalAccessWhileInvokingAttributeMethod", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/IllegalArgumentException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "mapping", "Lorg/eclipse/persistence/mappings/foundation/AbstractTransformationMapping;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "illegalArgumentWhileInvokingAttributeMethod", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/reflect/InvocationTargetException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/mappings/transformers/MethodBasedAttributeTransformer", "mapping", "Lorg/eclipse/persistence/mappings/foundation/AbstractTransformationMapping;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "targetInvocationWhileInvokingAttributeMethod", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}