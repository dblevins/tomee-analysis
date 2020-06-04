package asm.org.apache.tomee.catalina;
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
public class OpenEJBContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomee/catalina/OpenEJBContext", null, "java/lang/Object", new String[] { "javax/naming/Context" });

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lookup", "(Ljavax/naming/Name;)Ljava/lang/Object;", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "lookup", "(Ljavax/naming/Name;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lookup", "(Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "lookup", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "bind", "(Ljavax/naming/Name;Ljava/lang/Object;)V", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "bind", "(Ljavax/naming/Name;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "bind", "(Ljava/lang/String;Ljava/lang/Object;)V", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "bind", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rebind", "(Ljavax/naming/Name;Ljava/lang/Object;)V", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "rebind", "(Ljavax/naming/Name;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rebind", "(Ljava/lang/String;Ljava/lang/Object;)V", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "rebind", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unbind", "(Ljavax/naming/Name;)V", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "unbind", "(Ljavax/naming/Name;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unbind", "(Ljava/lang/String;)V", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "unbind", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rename", "(Ljavax/naming/Name;Ljavax/naming/Name;)V", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "rename", "(Ljavax/naming/Name;Ljavax/naming/Name;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rename", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "rename", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "list", "(Ljavax/naming/Name;)Ljavax/naming/NamingEnumeration;", "(Ljavax/naming/Name;)Ljavax/naming/NamingEnumeration<Ljavax/naming/NameClassPair;>;", new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "list", "(Ljavax/naming/Name;)Ljavax/naming/NamingEnumeration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "list", "(Ljava/lang/String;)Ljavax/naming/NamingEnumeration;", "(Ljava/lang/String;)Ljavax/naming/NamingEnumeration<Ljavax/naming/NameClassPair;>;", new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "list", "(Ljava/lang/String;)Ljavax/naming/NamingEnumeration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "listBindings", "(Ljavax/naming/Name;)Ljavax/naming/NamingEnumeration;", "(Ljavax/naming/Name;)Ljavax/naming/NamingEnumeration<Ljavax/naming/Binding;>;", new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "listBindings", "(Ljavax/naming/Name;)Ljavax/naming/NamingEnumeration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "listBindings", "(Ljava/lang/String;)Ljavax/naming/NamingEnumeration;", "(Ljava/lang/String;)Ljavax/naming/NamingEnumeration<Ljavax/naming/Binding;>;", new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "listBindings", "(Ljava/lang/String;)Ljavax/naming/NamingEnumeration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "destroySubcontext", "(Ljavax/naming/Name;)V", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "destroySubcontext", "(Ljavax/naming/Name;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "destroySubcontext", "(Ljava/lang/String;)V", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "destroySubcontext", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSubcontext", "(Ljavax/naming/Name;)Ljavax/naming/Context;", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "createSubcontext", "(Ljavax/naming/Name;)Ljavax/naming/Context;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSubcontext", "(Ljava/lang/String;)Ljavax/naming/Context;", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "createSubcontext", "(Ljava/lang/String;)Ljavax/naming/Context;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lookupLink", "(Ljavax/naming/Name;)Ljava/lang/Object;", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "lookupLink", "(Ljavax/naming/Name;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lookupLink", "(Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "lookupLink", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNameParser", "(Ljavax/naming/Name;)Ljavax/naming/NameParser;", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "getNameParser", "(Ljavax/naming/Name;)Ljavax/naming/NameParser;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNameParser", "(Ljava/lang/String;)Ljavax/naming/NameParser;", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "getNameParser", "(Ljava/lang/String;)Ljavax/naming/NameParser;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "composeName", "(Ljavax/naming/Name;Ljavax/naming/Name;)Ljavax/naming/Name;", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "composeName", "(Ljavax/naming/Name;Ljavax/naming/Name;)Ljavax/naming/Name;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "composeName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "composeName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addToEnvironment", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "addToEnvironment", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeFromEnvironment", "(Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "removeFromEnvironment", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEnvironment", "()Ljava/util/Hashtable;", "()Ljava/util/Hashtable<**>;", new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "getEnvironment", "()Ljava/util/Hashtable;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "getThreadContext", "()Ljavax/naming/Context;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "close", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNameInNamespace", "()Ljava/lang/String;", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getThreadContext", "()Ljavax/naming/Context;", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ThreadContext", "getThreadContext", "()Lorg/apache/openejb/core/ThreadContext;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/catalina/OpenEJBContext", "skipEjbContext", "(Lorg/apache/openejb/core/ThreadContext;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/naming/ContextBindings", "getClassLoader", "()Ljavax/naming/Context;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/core/ThreadContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ThreadContext", "getBeanContext", "()Lorg/apache/openejb/BeanContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext", "getJndiEnc", "()Ljavax/naming/Context;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "skipEjbContext", "(Lorg/apache/openejb/core/ThreadContext;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/assembler/DeployerEjb;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ThreadContext", "getBeanContext", "()Lorg/apache/openejb/BeanContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/BeanContext", "getBeanClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
