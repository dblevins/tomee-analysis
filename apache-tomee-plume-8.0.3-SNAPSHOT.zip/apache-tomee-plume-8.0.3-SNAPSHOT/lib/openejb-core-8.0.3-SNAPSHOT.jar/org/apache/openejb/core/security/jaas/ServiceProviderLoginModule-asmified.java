package asm.org.apache.openejb.core.security.jaas;
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
public class ServiceProviderLoginModuleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", null, "java/lang/Object", new String[] { "javax/security/auth/spi/LoginModule" });

classWriter.visitInnerClass("org/apache/openejb/core/security/jaas/ServiceProviderLoginModule$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData", "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "UserData", ACC_PRIVATE | ACC_FINAL);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/openejb/util/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "subject", "Ljavax/security/auth/Subject;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "callbackHandler", "Ljavax/security/auth/callback/CallbackHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "loader", "Ljava/util/ServiceLoader;", "Ljava/util/ServiceLoader<Lorg/apache/openejb/core/security/jaas/LoginProvider;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "principals", "Ljava/util/Set;", "Ljava/util/Set<Ljava/security/Principal;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "userData", "Lorg/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedHashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashSet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "principals", "Ljava/util/Set;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Ljavax/security/auth/Subject;Ljavax/security/auth/callback/CallbackHandler;Ljava/util/Map;Ljava/util/Map;)V", "(Ljavax/security/auth/Subject;Ljavax/security/auth/callback/CallbackHandler;Ljava/util/Map<Ljava/lang/String;*>;Ljava/util/Map<Ljava/lang/String;*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "subject", "Ljavax/security/auth/Subject;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "callbackHandler", "Ljavax/security/auth/callback/CallbackHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/core/security/jaas/LoginProvider;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/ServiceLoader", "load", "(Ljava/lang/Class;)Ljava/util/ServiceLoader;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "loader", "Ljava/util/ServiceLoader;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getUserData", "()Lorg/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData;", null, new String[] { "javax/security/auth/login/LoginException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "javax/security/auth/callback/UnsupportedCallbackException");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/security/auth/callback/Callback");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "javax/security/auth/callback/NameCallback");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Username: ");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/security/auth/callback/NameCallback", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "javax/security/auth/callback/PasswordCallback");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Password: ");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/security/auth/callback/PasswordCallback", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "callbackHandler", "Ljavax/security/auth/callback/CallbackHandler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/auth/callback/CallbackHandler", "handle", "([Ljavax/security/auth/callback/Callback;)V", true);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "[Ljavax/security/auth/callback/Callback;"}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "javax/security/auth/login/LoginException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/IOException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/security/auth/login/LoginException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/security/auth/callback/UnsupportedCallbackException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "javax/security/auth/login/LoginException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/auth/callback/UnsupportedCallbackException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" not available to obtain information from user");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/security/auth/login/LoginException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/security/auth/callback/NameCallback");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/auth/callback/NameCallback", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/security/auth/callback/PasswordCallback");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/auth/callback/PasswordCallback", "getPassword", "()[C", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(NEWARRAY, T_CHAR);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "[C"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/String", "<init>", "([C)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData", "<init>", "(Lorg/apache/openejb/core/security/jaas/ServiceProviderLoginModule;Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/core/security/jaas/ServiceProviderLoginModule$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "login", "()Z", null, new String[] { "javax/security/auth/login/LoginException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "loader", "Ljava/util/ServiceLoader;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ServiceLoader", "iterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "javax/security/auth/login/FailedLoginException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No LoginProvider defined.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/security/auth/login/FailedLoginException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "getUserData", "()Lorg/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "userData", "Lorg/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData;");
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/core/security/jaas/LoginProvider");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "userData", "Lorg/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData", "user", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "userData", "Lorg/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData", "pass", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/security/jaas/LoginProvider", "authenticate", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "userData", "Lorg/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData", "groups", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commit", "()Z", null, new String[] { "javax/security/auth/login/LoginException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "principals", "Ljava/util/Set;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/security/jaas/UserPrincipal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "userData", "Lorg/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData", "user", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/security/jaas/UserPrincipal", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "userData", "Lorg/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData", "groups", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "principals", "Ljava/util/Set;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/security/jaas/GroupPrincipal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/security/jaas/GroupPrincipal", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "subject", "Ljavax/security/auth/Subject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/auth/Subject", "getPrincipals", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "principals", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "clear", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "log", "Lorg/apache/openejb/util/Logger;");
methodVisitor.visitLdcInsn("commit");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "debug", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "abort", "()Z", null, new String[] { "javax/security/auth/login/LoginException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "clear", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "log", "Lorg/apache/openejb/util/Logger;");
methodVisitor.visitLdcInsn("abort");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "debug", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "logout", "()Z", null, new String[] { "javax/security/auth/login/LoginException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "subject", "Ljavax/security/auth/Subject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/auth/Subject", "getPrincipals", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "principals", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "removeAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "principals", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "clear", "()V", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "log", "Lorg/apache/openejb/util/Logger;");
methodVisitor.visitLdcInsn("logout");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "debug", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "userData", "Lorg/apache/openejb/core/security/jaas/ServiceProviderLoginModule$UserData;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_SECURITY", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("org.apache.openejb.util.resources");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Logger", "getInstance", "(Lorg/apache/openejb/util/LogCategory;Ljava/lang/String;)Lorg/apache/openejb/util/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/security/jaas/ServiceProviderLoginModule", "log", "Lorg/apache/openejb/util/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
