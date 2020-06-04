package asm.org.apache.webbeans.corespi.security;
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
public class ManagedSecurityServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/corespi/security/ManagedSecurityService", null, "java/lang/Object", new String[] { "org/apache/webbeans/spi/SecurityService" });

classWriter.visitInnerClass("org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForObjectCreation", "org/apache/webbeans/corespi/security/ManagedSecurityService", "PrivilegedActionForObjectCreation", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionGetSystemProperties", "org/apache/webbeans/corespi/security/ManagedSecurityService", "PrivilegedActionGetSystemProperties", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForSetProperty", "org/apache/webbeans/corespi/security/ManagedSecurityService", "PrivilegedActionForSetProperty", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForProperty", "org/apache/webbeans/corespi/security/ManagedSecurityService", "PrivilegedActionForProperty", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForIsAccessible", "org/apache/webbeans/corespi/security/ManagedSecurityService", "PrivilegedActionForIsAccessible", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForSetAccessible", "org/apache/webbeans/corespi/security/ManagedSecurityService", "PrivilegedActionForSetAccessible", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForClass", "org/apache/webbeans/corespi/security/ManagedSecurityService", "PrivilegedActionForClass", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "METHOD_CLASS_GETDECLAREDCONSTRUCTOR", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "METHOD_CLASS_GETDECLAREDCONSTRUCTORS", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "METHOD_CLASS_GETDECLAREDMETHOD", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "METHOD_CLASS_GETDECLAREDMETHODS", "I", null, new Integer(4));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "METHOD_CLASS_GETDECLAREDFIELD", "I", null, new Integer(5));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "METHOD_CLASS_GETDECLAREDFIELDS", "I", null, new Integer(6));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "METHOD_CLASS_GETCONSTRUCTOR", "I", null, new Integer(7));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SYSTEM_PROPERTY_ACTION", "Lorg/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionGetSystemProperties;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getStackTrace", "()[Ljava/lang/StackTraceElement;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/webbeans/corespi/security/ManagedSecurityService", "[Ljava/lang/StackTraceElement;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 20);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StackTraceElement", "getClassName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StackTraceElement", "getMethodName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/webbeans/config/WebBeansContext;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("<init>");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitTypeInsn(NEW, "java/lang/SecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ManagedSecurityService must directly get created by WebBeansContext!");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/SecurityException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/webbeans/corespi/security/ManagedSecurityService;"));
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label4);
methodVisitor.visitTypeInsn(NEW, "java/lang/SecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ManagedSecurityService must not get subclassed!");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/SecurityException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCurrentPrincipal", "()Ljava/security/Principal;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "doPrivilegedGetDeclaredConstructor", "(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;[Ljava/lang/Class<*>;)Ljava/lang/reflect/Constructor<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForClass");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Object;I)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/NoSuchMethodException");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Constructor");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "doPrivilegedGetConstructor", "(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;[Ljava/lang/Class<*>;)Ljava/lang/reflect/Constructor<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForClass");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Object;I)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/NoSuchMethodException");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Constructor");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doPrivilegedGetDeclaredConstructors", "(Ljava/lang/Class;)[Ljava/lang/reflect/Constructor;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)[Ljava/lang/reflect/Constructor<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForClass");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Object;I)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/reflect/Constructor;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/reflect/Constructor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "doPrivilegedGetDeclaredMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/String;[Ljava/lang/Class<*>;)Ljava/lang/reflect/Method;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForClass");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Object;I)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/NoSuchMethodException");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Method");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doPrivilegedGetDeclaredMethods", "(Ljava/lang/Class;)[Ljava/lang/reflect/Method;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)[Ljava/lang/reflect/Method;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForClass");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Object;I)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/reflect/Method;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/reflect/Method;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doPrivilegedGetDeclaredField", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/String;)Ljava/lang/reflect/Field;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForClass");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Object;I)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/NoSuchFieldException");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Field");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doPrivilegedGetDeclaredFields", "(Ljava/lang/Class;)[Ljava/lang/reflect/Field;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)[Ljava/lang/reflect/Field;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForClass");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Object;I)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/reflect/Field;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/reflect/Field;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doPrivilegedSetAccessible", "(Ljava/lang/reflect/AccessibleObject;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForSetAccessible");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForSetAccessible", "<init>", "(Ljava/lang/reflect/AccessibleObject;Z)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doPrivilegedIsAccessible", "(Ljava/lang/reflect/AccessibleObject;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForIsAccessible");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForIsAccessible", "<init>", "(Ljava/lang/reflect/AccessibleObject;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doPrivilegedObjectCreate", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", new String[] { "java/security/PrivilegedActionException", "java/lang/IllegalAccessException", "java/lang/InstantiationException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForObjectCreation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForObjectCreation", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doPrivilegedSetSystemProperty", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForSetProperty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForSetProperty", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doPrivilegedGetSystemProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForProperty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionForProperty", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doPrivilegedGetSystemProperties", "()Ljava/util/Properties;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/corespi/security/ManagedSecurityService", "SYSTEM_PROPERTY_ACTION", "Lorg/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionGetSystemProperties;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Properties");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionGetSystemProperties");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionGetSystemProperties", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/corespi/security/ManagedSecurityService", "SYSTEM_PROPERTY_ACTION", "Lorg/apache/webbeans/corespi/security/ManagedSecurityService$PrivilegedActionGetSystemProperties;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
