package asm.org.apache.webbeans.boot;
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
public class BootstrapDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/boot/Bootstrap", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/webbeans/boot/Bootstrap$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "latch", "Ljava/util/concurrent/CountDownLatch;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "containerLifecycle", "Lorg/apache/webbeans/spi/ContainerLifecycle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "properties", "Ljava/util/Properties;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/CountDownLatch");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/CountDownLatch", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/boot/Bootstrap", "latch", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(Ljava/util/Properties;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/boot/Bootstrap", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("INFO_0006");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "info", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/config/WebBeansContext", "getInstance", "()Lorg/apache/webbeans/config/WebBeansContext;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/webbeans/spi/ContainerLifecycle;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getService", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/spi/ContainerLifecycle");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/boot/Bootstrap", "containerLifecycle", "Lorg/apache/webbeans/spi/ContainerLifecycle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/boot/Bootstrap", "properties", "Ljava/util/Properties;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "start", "()V", null, new String[] { "java/lang/InterruptedException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/boot/Bootstrap", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("INFO_0005");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "info", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/boot/Bootstrap", "containerLifecycle", "Lorg/apache/webbeans/spi/ContainerLifecycle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/boot/Bootstrap", "properties", "Ljava/util/Properties;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContainerLifecycle", "startApplication", "(Ljava/lang/Object;)V", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Runtime", "getRuntime", "()Ljava/lang/Runtime;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/boot/Bootstrap$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/boot/Bootstrap$1", "<init>", "(Lorg/apache/webbeans/boot/Bootstrap;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Runtime", "addShutdownHook", "(Ljava/lang/Thread;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/boot/Bootstrap", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "INFO", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("INFO_0001");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "toString", "(J)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/boot/Bootstrap", "latch", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "await", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/boot/Bootstrap", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("INFO_0008");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "info", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/boot/Bootstrap", "containerLifecycle", "Lorg/apache/webbeans/spi/ContainerLifecycle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/boot/Bootstrap", "properties", "Ljava/util/Properties;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContainerLifecycle", "stopApplication", "(Ljava/lang/Object;)V", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/boot/Bootstrap", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("INFO_0009");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "info", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/boot/Bootstrap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/boot/Bootstrap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperties", "()Ljava/util/Properties;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/boot/Bootstrap", "init", "(Ljava/util/Properties;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/webbeans/boot/Bootstrap;)Ljava/util/concurrent/CountDownLatch;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/boot/Bootstrap", "latch", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/webbeans/boot/Bootstrap;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/logger/WebBeansLoggerFacade", "getLogger", "(Ljava/lang/Class;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/boot/Bootstrap", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
