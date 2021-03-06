package asm.org.eclipse.persistence.platform.server;
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
public class ServerPlatformUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/platform/server/ServerPlatformUtils", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/platform/server/ServerPlatformUtils$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PLATFORMS", "Ljava/util/List;", "Ljava/util/List<Lorg/eclipse/persistence/platform/server/ServerPlatformDetector;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "UNKNOWN_MARKER", "Ljava/lang/String;", null, "UNKNOWN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "SERVER_PLATFORM_CLS", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/server/ServerPlatformUtils$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/server/ServerPlatformUtils$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/server/ServerPlatformUtils", "PLATFORMS", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "detectServerPlatform", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/server/ServerPlatformUtils", "SERVER_PLATFORM_CLS", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/server/ServerPlatformUtils", "PLATFORMS", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/internal/sessions/AbstractSession", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/platform/server/ServerPlatformDetector");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/platform/server/ServerPlatformDetector", "checkPlatform", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitLdcInsn("eclipselink.target-server");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/PropertiesHandler", "getPropertyValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/server/ServerPlatformUtils", "SERVER_PLATFORM_CLS", "Ljava/lang/String;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/eclipse/persistence/internal/sessions/AbstractSession"}, 0, new Object[] {});
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/server/ServerPlatformUtils", "SERVER_PLATFORM_CLS", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("UNKNOWN");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/server/ServerPlatformUtils", "SERVER_PLATFORM_CLS", "Ljava/lang/String;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/server/ServerPlatformUtils", "SERVER_PLATFORM_CLS", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("UNKNOWN");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("server");
methodVisitor.visitLdcInsn("detect_server_platform");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/server/ServerPlatformUtils", "SERVER_PLATFORM_CLS", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "log", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/logging/AbstractSessionLog", "getLog", "()Lorg/eclipse/persistence/logging/SessionLog;", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("server");
methodVisitor.visitLdcInsn("detect_server_platform");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/server/ServerPlatformUtils", "SERVER_PLATFORM_CLS", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/logging/SessionLog", "log", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/server/ServerPlatformUtils", "SERVER_PLATFORM_CLS", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createServerPlatform", "(Lorg/eclipse/persistence/sessions/DatabaseSession;Ljava/lang/String;Ljava/lang/ClassLoader;)Lorg/eclipse/persistence/platform/server/ServerPlatform;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/PrivilegedActionException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/ClassNotFoundException");
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/security/PrivilegedActionException");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "java/security/PrivilegedActionException");
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label9, label10, label11, "java/lang/NoSuchMethodException");
methodVisitor.visitTryCatchBlock(label9, label10, label11, "java/lang/IllegalAccessException");
methodVisitor.visitTryCatchBlock(label9, label10, label11, "java/lang/reflect/InvocationTargetException");
methodVisitor.visitTryCatchBlock(label9, label10, label11, "java/lang/InstantiationException");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label12);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ServerPlatformException", "invalidServerPlatformClass", "(Ljava/lang/String;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/ServerPlatformException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/platform/server/ServerPlatformUtils", "findClass", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
Label label13 = new Label();
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/persistence/sessions/DatabaseSession", "java/lang/String", "java/lang/ClassLoader", "java/lang/Class"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/platform/server/ServerPlatformUtils;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label14);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/platform/server/ServerPlatformUtils", "findClass", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/persistence/sessions/DatabaseSession", "java/lang/String", "java/lang/ClassLoader", "java/lang/Class", "java/lang/Exception", "java/lang/ClassLoader"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ServerPlatformException", "serverPlatformClassNotFound", "(Ljava/lang/String;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/ServerPlatformException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ServerPlatformException", "serverPlatformClassNotFound", "(Ljava/lang/String;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/ServerPlatformException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/sessions/DatabaseSession;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "shouldUsePrivilegedAccess", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitLabel(label6);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/security/PrivilegedGetConstructorFor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/security/PrivilegedGetConstructorFor", "<init>", "(Ljava/lang/Class;[Ljava/lang/Class;Z)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Constructor");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/security/PrivilegedInvokeConstructor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/security/PrivilegedInvokeConstructor", "<init>", "(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/platform/server/ServerPlatform");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label7);
Label label15 = new Label();
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/eclipse/persistence/sessions/DatabaseSession", "java/lang/String", "java/lang/ClassLoader", "java/lang/Class", "[Ljava/lang/Class;", "[Ljava/lang/Object;", "org/eclipse/persistence/platform/server/ServerPlatform"}, 1, new Object[] {"java/security/PrivilegedActionException"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ServerPlatformException", "invalidServerPlatformClass", "(Ljava/lang/String;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/ServerPlatformException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getConstructorFor", "(Ljava/lang/Class;[Ljava/lang/Class;Z)Ljava/lang/reflect/Constructor;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "invokeConstructor", "(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/platform/server/ServerPlatform");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label10);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ReflectiveOperationException"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ServerPlatformException", "invalidServerPlatformClass", "(Ljava/lang/String;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/ServerPlatformException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "findClass", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;", null, new String[] { "java/lang/ClassNotFoundException", "java/security/PrivilegedActionException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "shouldUsePrivilegedAccess", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/security/PrivilegedClassForName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/security/PrivilegedClassForName", "<init>", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getClassForName", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
