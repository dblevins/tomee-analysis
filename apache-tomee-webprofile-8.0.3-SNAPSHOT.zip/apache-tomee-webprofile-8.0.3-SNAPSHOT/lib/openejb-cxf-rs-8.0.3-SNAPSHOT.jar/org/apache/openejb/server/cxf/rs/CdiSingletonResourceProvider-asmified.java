package asm.org.apache.openejb.server.cxf.rs;
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
public class CdiSingletonResourceProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/server/cxf/rs/CdiSingletonResourceProvider", null, "org/apache/openejb/server/cxf/rs/CdiResourceProvider", null);

classWriter.visitInnerClass("org/apache/openejb/server/cxf/rs/CdiSingletonResourceProvider$SingletonBeanCreator", "org/apache/openejb/server/cxf/rs/CdiSingletonResourceProvider", "SingletonBeanCreator", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/server/cxf/rs/CdiResourceProvider$BeanCreator", "org/apache/openejb/server/cxf/rs/CdiResourceProvider", "BeanCreator", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "creator", "Lorg/apache/openejb/server/cxf/rs/CdiResourceProvider$BeanCreator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/ClassLoader;Ljava/lang/Class;Ljava/lang/Object;Ljava/util/Collection;Ljavax/naming/Context;Lorg/apache/webbeans/config/WebBeansContext;)V", "(Ljava/lang/ClassLoader;Ljava/lang/Class<*>;Ljava/lang/Object;Ljava/util/Collection<Lorg/apache/openejb/Injection;>;Ljavax/naming/Context;Lorg/apache/webbeans/config/WebBeansContext;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/rs/CdiResourceProvider", "<init>", "(Ljava/lang/ClassLoader;Ljava/lang/Class;Ljava/util/Collection;Ljavax/naming/Context;Lorg/apache/webbeans/config/WebBeansContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiSingletonResourceProvider", "normalScopeCreator", "Lorg/apache/openejb/server/cxf/rs/CdiResourceProvider$BeanCreator;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiSingletonResourceProvider", "normalScopeCreator", "Lorg/apache/openejb/server/cxf/rs/CdiResourceProvider$BeanCreator;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/rs/CdiSingletonResourceProvider", "creator", "Lorg/apache/openejb/server/cxf/rs/CdiResourceProvider$BeanCreator;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/openejb/server/cxf/rs/CdiSingletonResourceProvider", "java/lang/ClassLoader", "java/lang/Class", "java/lang/Object", "java/util/Collection", "javax/naming/Context", "org/apache/webbeans/config/WebBeansContext"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/cxf/rs/CdiSingletonResourceProvider$SingletonBeanCreator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/rs/CdiSingletonResourceProvider$SingletonBeanCreator", "<init>", "(Lorg/apache/openejb/server/cxf/rs/CdiSingletonResourceProvider;Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/rs/CdiSingletonResourceProvider", "creator", "Lorg/apache/openejb/server/cxf/rs/CdiResourceProvider$BeanCreator;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSingleton", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInstance", "(Lorg/apache/cxf/message/Message;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiSingletonResourceProvider", "creator", "Lorg/apache/openejb/server/cxf/rs/CdiResourceProvider$BeanCreator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/server/cxf/rs/CdiResourceProvider$BeanCreator", "create", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "releaseInstance", "(Lorg/apache/cxf/message/Message;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "release", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiSingletonResourceProvider", "creator", "Lorg/apache/openejb/server/cxf/rs/CdiResourceProvider$BeanCreator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/server/cxf/rs/CdiResourceProvider$BeanCreator", "release", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
