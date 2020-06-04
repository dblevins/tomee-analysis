package asm.org.apache.openjpa.lib.util;
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
public class J2DoPrivHelperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/openjpa/lib/util/J2DoPrivHelper", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$63", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$62", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$61", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$60", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$59", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$58", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$57", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$56", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$55", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$54", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$53", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$52", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$51", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$50", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$49", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$48", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$47", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$46", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$45", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$44", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$43", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$42", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$41", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$40", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$39", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$38", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$37", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$36", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$35", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$34", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$33", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$32", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$31", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$30", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$29", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$28", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$27", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$26", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$25", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$24", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$23", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$22", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$21", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$20", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$19", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$18", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$17", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$16", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$15", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$14", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$13", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$12", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$11", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$10", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$9", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$8", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$7", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$6", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$5", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$4", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$3", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$2", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/J2DoPrivHelper$1", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "lineSeparator", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "pathSeparator", "Ljava/lang/String;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getLineSeparator", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/util/J2DoPrivHelper", "lineSeparator", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$1", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/lib/util/J2DoPrivHelper", "lineSeparator", "Ljava/lang/String;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/util/J2DoPrivHelper", "lineSeparator", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPathSeparator", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/util/J2DoPrivHelper", "pathSeparator", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$2", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/lib/util/J2DoPrivHelper", "pathSeparator", "Ljava/lang/String;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/util/J2DoPrivHelper", "pathSeparator", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setAccessibleAction", "(Ljava/lang/reflect/AccessibleObject;Z)Ljava/security/PrivilegedAction;", "(Ljava/lang/reflect/AccessibleObject;Z)Ljava/security/PrivilegedAction<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$3", "<init>", "(Ljava/lang/reflect/AccessibleObject;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getForNameAction", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/security/PrivilegedExceptionAction<Ljava/lang/Class<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$4", "<init>", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getClassLoaderAction", "(Ljava/lang/Class;)Ljava/security/PrivilegedAction;", "(Ljava/lang/Class<*>;)Ljava/security/PrivilegedAction<Ljava/lang/ClassLoader;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$5");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$5", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDeclaredFieldAction", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/lang/Class<*>;Ljava/lang/String;)Ljava/security/PrivilegedExceptionAction<Ljava/lang/reflect/Field;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$6");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$6", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDeclaredFieldsAction", "(Ljava/lang/Class;)Ljava/security/PrivilegedAction;", "(Ljava/lang/Class<*>;)Ljava/security/PrivilegedAction<[Ljava/lang/reflect/Field;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$7");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$7", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDeclaredMethodAction", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/lang/Class<*>;Ljava/lang/String;[Ljava/lang/Class<*>;)Ljava/security/PrivilegedExceptionAction<Ljava/lang/reflect/Method;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$8");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$8", "<init>", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDeclaredMethodsAction", "(Ljava/lang/Class;)Ljava/security/PrivilegedAction;", "(Ljava/lang/Class<*>;)Ljava/security/PrivilegedAction<[Ljava/lang/reflect/Method;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$9");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$9", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getResourceAction", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/security/PrivilegedAction;", "(Ljava/lang/Class<*>;Ljava/lang/String;)Ljava/security/PrivilegedAction<Ljava/net/URL;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$10");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$10", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newInstanceAction", "(Ljava/lang/Class;)Ljava/security/PrivilegedExceptionAction;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/security/PrivilegedExceptionAction<TT;>;", new String[] { "java/lang/IllegalAccessException", "java/lang/InstantiationException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$11");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$11", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getProtectionDomainAction", "(Ljava/lang/Class;)Ljava/security/PrivilegedAction;", "(Ljava/lang/Class<*>;)Ljava/security/PrivilegedAction<Ljava/security/ProtectionDomain;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$12");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$12", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getParentAction", "(Ljava/lang/ClassLoader;)Ljava/security/PrivilegedAction;", "(Ljava/lang/ClassLoader;)Ljava/security/PrivilegedAction<Ljava/lang/ClassLoader;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$13");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$13", "<init>", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getResourceAction", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/security/PrivilegedAction;", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/security/PrivilegedAction<Ljava/net/URL;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$14");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$14", "<init>", "(Ljava/lang/ClassLoader;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getResourcesAction", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/security/PrivilegedExceptionAction<Ljava/util/Enumeration<Ljava/net/URL;>;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$15");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$15", "<init>", "(Ljava/lang/ClassLoader;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getSystemClassLoaderAction", "()Ljava/security/PrivilegedAction;", "()Ljava/security/PrivilegedAction<Ljava/lang/ClassLoader;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$16");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$16", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "deleteAction", "(Ljava/io/File;)Ljava/security/PrivilegedAction;", "(Ljava/io/File;)Ljava/security/PrivilegedAction<Ljava/lang/Boolean;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$17");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$17", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "existsAction", "(Ljava/io/File;)Ljava/security/PrivilegedAction;", "(Ljava/io/File;)Ljava/security/PrivilegedAction<Ljava/lang/Boolean;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$18");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$18", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "deleteOnExitAction", "(Ljava/io/File;)Ljava/security/PrivilegedAction;", "(Ljava/io/File;)Ljava/security/PrivilegedAction<Ljava/lang/Boolean;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$19");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$19", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getAbsoluteFileAction", "(Ljava/io/File;)Ljava/security/PrivilegedAction;", "(Ljava/io/File;)Ljava/security/PrivilegedAction<Ljava/io/File;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$20");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$20", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getAbsolutePathAction", "(Ljava/io/File;)Ljava/security/PrivilegedAction;", "(Ljava/io/File;)Ljava/security/PrivilegedAction<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$21");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$21", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCanonicalPathAction", "(Ljava/io/File;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/io/File;)Ljava/security/PrivilegedExceptionAction<Ljava/lang/String;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$22");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$22", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isDirectoryAction", "(Ljava/io/File;)Ljava/security/PrivilegedAction;", "(Ljava/io/File;)Ljava/security/PrivilegedAction<Ljava/lang/Boolean;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$23");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$23", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isFileAction", "(Ljava/io/File;)Ljava/security/PrivilegedAction;", "(Ljava/io/File;)Ljava/security/PrivilegedAction<Ljava/lang/Boolean;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$24");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$24", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "lengthAction", "(Ljava/io/File;)Ljava/security/PrivilegedAction;", "(Ljava/io/File;)Ljava/security/PrivilegedAction<Ljava/lang/Long;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$25");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$25", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "listFilesAction", "(Ljava/io/File;)Ljava/security/PrivilegedAction;", "(Ljava/io/File;)Ljava/security/PrivilegedAction<[Ljava/io/File;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$26");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$26", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "mkdirsAction", "(Ljava/io/File;)Ljava/security/PrivilegedAction;", "(Ljava/io/File;)Ljava/security/PrivilegedAction<Ljava/lang/Boolean;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$27");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$27", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "renameToAction", "(Ljava/io/File;Ljava/io/File;)Ljava/security/PrivilegedAction;", "(Ljava/io/File;Ljava/io/File;)Ljava/security/PrivilegedAction<Ljava/lang/Boolean;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$28");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$28", "<init>", "(Ljava/io/File;Ljava/io/File;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "toURLAction", "(Ljava/io/File;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/io/File;)Ljava/security/PrivilegedExceptionAction<Ljava/net/URL;>;", new String[] { "java/net/MalformedURLException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$29");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$29", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newFileInputStreamAction", "(Ljava/io/File;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/io/File;)Ljava/security/PrivilegedExceptionAction<Ljava/io/FileInputStream;>;", new String[] { "java/io/FileNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$30");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$30", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newFileOutputStreamAction", "(Ljava/io/File;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/io/File;)Ljava/security/PrivilegedExceptionAction<Ljava/io/FileOutputStream;>;", new String[] { "java/io/FileNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$31");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$31", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newFileOutputStreamAction", "(Ljava/lang/String;Z)Ljava/security/PrivilegedExceptionAction;", "(Ljava/lang/String;Z)Ljava/security/PrivilegedExceptionAction<Ljava/io/FileOutputStream;>;", new String[] { "java/io/FileNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$32");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$32", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getByNameAction", "(Ljava/lang/String;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/lang/String;)Ljava/security/PrivilegedExceptionAction<Ljava/net/InetAddress;>;", new String[] { "java/net/UnknownHostException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$33");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$33", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newSocketAction", "(Ljava/net/InetAddress;I)Ljava/security/PrivilegedExceptionAction;", "(Ljava/net/InetAddress;I)Ljava/security/PrivilegedExceptionAction<Ljava/net/Socket;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$34");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$34", "<init>", "(Ljava/net/InetAddress;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newServerSocketAction", "(I)Ljava/security/PrivilegedExceptionAction;", "(I)Ljava/security/PrivilegedExceptionAction<Ljava/net/ServerSocket;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$35");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$35", "<init>", "(I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "acceptAction", "(Ljava/net/ServerSocket;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/net/ServerSocket;)Ljava/security/PrivilegedExceptionAction<Ljava/net/Socket;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$36");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$36", "<init>", "(Ljava/net/ServerSocket;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPropertiesAction", "()Ljava/security/PrivilegedAction;", "()Ljava/security/PrivilegedAction<Ljava/util/Properties;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$37");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$37", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPropertyAction", "(Ljava/lang/String;)Ljava/security/PrivilegedAction;", "(Ljava/lang/String;)Ljava/security/PrivilegedAction<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$38");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$38", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPropertyAction", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/PrivilegedAction;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/PrivilegedAction<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$39");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$39", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getContextClassLoaderAction", "()Ljava/security/PrivilegedAction;", "()Ljava/security/PrivilegedAction<Ljava/lang/ClassLoader;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$40");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$40", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setContextClassLoaderAction", "(Ljava/lang/ClassLoader;)Ljava/security/PrivilegedAction;", "(Ljava/lang/ClassLoader;)Ljava/security/PrivilegedAction<Ljava/lang/Boolean;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$41");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$41", "<init>", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newDaemonThreadAction", "(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/security/PrivilegedAction;", "(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/security/PrivilegedAction<Ljava/lang/Thread;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$42");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$42", "<init>", "(Ljava/lang/Runnable;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "openStreamAction", "(Ljava/net/URL;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/net/URL;)Ljava/security/PrivilegedExceptionAction<Ljava/io/InputStream;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$43");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$43", "<init>", "(Ljava/net/URL;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getContentAction", "(Ljava/net/URLConnection;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/net/URLConnection;)Ljava/security/PrivilegedExceptionAction<Ljava/lang/Object;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$44");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$44", "<init>", "(Ljava/net/URLConnection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newZipFileAction", "(Ljava/io/File;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/io/File;)Ljava/security/PrivilegedExceptionAction<Ljava/util/zip/ZipFile;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$45");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$45", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getJarFileAction", "(Ljava/net/JarURLConnection;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/net/JarURLConnection;)Ljava/security/PrivilegedExceptionAction<Ljava/util/jar/JarFile;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$46");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$46", "<init>", "(Ljava/net/JarURLConnection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getJarEntryAction", "(Ljava/net/JarURLConnection;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/net/JarURLConnection;)Ljava/security/PrivilegedExceptionAction<Ljava/util/jar/JarEntry;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$47");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$47", "<init>", "(Ljava/net/JarURLConnection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newCodeAction", "()Ljava/security/PrivilegedAction;", "()Ljava/security/PrivilegedAction<Lserp/bytecode/Code;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$48");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$48", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newTemporaryClassLoaderAction", "(Ljava/lang/ClassLoader;)Ljava/security/PrivilegedAction;", "(Ljava/lang/ClassLoader;)Ljava/security/PrivilegedAction<Lorg/apache/openjpa/lib/util/TemporaryClassLoader;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$49");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$49", "<init>", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newMultiClassLoaderAction", "()Ljava/security/PrivilegedAction;", "()Ljava/security/PrivilegedAction<Lorg/apache/openjpa/lib/util/MultiClassLoader;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$50");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$50", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newBCClassLoaderAction", "(Lserp/bytecode/Project;Ljava/lang/ClassLoader;)Ljava/security/PrivilegedAction;", "(Lserp/bytecode/Project;Ljava/lang/ClassLoader;)Ljava/security/PrivilegedAction<Lserp/bytecode/BCClassLoader;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$51");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$51", "<init>", "(Lserp/bytecode/Project;Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newBCClassLoaderAction", "(Lserp/bytecode/Project;)Ljava/security/PrivilegedAction;", "(Lserp/bytecode/Project;)Ljava/security/PrivilegedAction<Lserp/bytecode/BCClassLoader;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$52");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$52", "<init>", "(Lserp/bytecode/Project;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getBCClassFieldsAction", "(Lserp/bytecode/BCClass;Ljava/lang/String;)Ljava/security/PrivilegedAction;", "(Lserp/bytecode/BCClass;Ljava/lang/String;)Ljava/security/PrivilegedAction<[Lserp/bytecode/BCField;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$53");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$53", "<init>", "(Lserp/bytecode/BCClass;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getFieldInstructionFieldAction", "(Lserp/bytecode/FieldInstruction;)Ljava/security/PrivilegedAction;", "(Lserp/bytecode/FieldInstruction;)Ljava/security/PrivilegedAction<Lserp/bytecode/BCField;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$54");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$54", "<init>", "(Lserp/bytecode/FieldInstruction;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "loadProjectClassAction", "(Lserp/bytecode/Project;Ljava/lang/Class;)Ljava/security/PrivilegedAction;", "(Lserp/bytecode/Project;Ljava/lang/Class<*>;)Ljava/security/PrivilegedAction<Lserp/bytecode/BCClass;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$55");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$55", "<init>", "(Lserp/bytecode/Project;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "loadProjectClassAction", "(Lserp/bytecode/Project;Ljava/lang/String;)Ljava/security/PrivilegedAction;", "(Lserp/bytecode/Project;Ljava/lang/String;)Ljava/security/PrivilegedAction<Lserp/bytecode/BCClass;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$56");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$56", "<init>", "(Lserp/bytecode/Project;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getAnnotationsAction", "(Ljava/lang/reflect/AnnotatedElement;)Ljava/security/PrivilegedAction;", "(Ljava/lang/reflect/AnnotatedElement;)Ljava/security/PrivilegedAction<[Ljava/lang/annotation/Annotation;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$57");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$57", "<init>", "(Ljava/lang/reflect/AnnotatedElement;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDeclaredAnnotationsAction", "(Ljava/lang/reflect/AnnotatedElement;)Ljava/security/PrivilegedAction;", "(Ljava/lang/reflect/AnnotatedElement;)Ljava/security/PrivilegedAction<[Ljava/lang/annotation/Annotation;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$58");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$58", "<init>", "(Ljava/lang/reflect/AnnotatedElement;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isAnnotationPresentAction", "(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Ljava/security/PrivilegedAction;", "(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/security/PrivilegedAction<Ljava/lang/Boolean;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$59");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$59", "<init>", "(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getAnnotationAction", "(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Ljava/security/PrivilegedAction;", "<T::Ljava/lang/annotation/Annotation;>(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class<TT;>;)Ljava/security/PrivilegedAction<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$60");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$60", "<init>", "(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "validateAction", "(Ljakarta/validation/Validator;Ljava/lang/Object;[Ljava/lang/Class;)Ljava/security/PrivilegedAction;", "<T:Ljava/lang/Object;>(Ljakarta/validation/Validator;TT;[Ljava/lang/Class<*>;)Ljava/security/PrivilegedAction<Ljava/util/Set<Ljakarta/validation/ConstraintViolation<TT;>;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$61");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$61", "<init>", "(Ljakarta/validation/Validator;Ljava/lang/Object;[Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "buildDefaultValidatorFactoryAction", "()Ljava/security/PrivilegedAction;", "<T:Ljava/lang/Object;>()Ljava/security/PrivilegedAction<Ljakarta/validation/ValidatorFactory;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$62");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$62", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createURL", "(Ljava/lang/String;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/lang/String;)Ljava/security/PrivilegedExceptionAction<Ljava/net/URL;>;", new String[] { "java/net/MalformedURLException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/J2DoPrivHelper$63");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/J2DoPrivHelper$63", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/lib/util/J2DoPrivHelper", "lineSeparator", "Ljava/lang/String;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/lib/util/J2DoPrivHelper", "pathSeparator", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
