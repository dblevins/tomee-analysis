package asm.org.apache.openejb.cdi;
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
public class CdiBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/cdi/CdiBuilder", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "logger", "Lorg/apache/openejb/util/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SINGLETON_SERVICE", "Lorg/apache/openejb/cdi/ThreadSingletonService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "REQUEST_SCOPED_THREAD_CONTEXT_LISTENER", "Lorg/apache/openejb/cdi/RequestScopedThreadContextListener;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "(Lorg/apache/openejb/assembler/classic/AppInfo;Lorg/apache/openejb/AppContext;Ljava/util/List;)V", "(Lorg/apache/openejb/assembler/classic/AppInfo;Lorg/apache/openejb/AppContext;Ljava/util/List<Lorg/apache/openejb/BeanContext;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/cdi/CdiBuilder", "initSingleton", "()Lorg/apache/openejb/cdi/ThreadSingletonService;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/cdi/StartupObject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/cdi/StartupObject", "<init>", "(Lorg/apache/openejb/AppContext;Lorg/apache/openejb/assembler/classic/AppInfo;Ljava/util/List;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/cdi/ThreadSingletonService", "initialize", "(Lorg/apache/openejb/cdi/StartupObject;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "initSingleton", "()Lorg/apache/openejb/cdi/ThreadSingletonService;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/cdi/CdiBuilder", "REQUEST_SCOPED_THREAD_CONTEXT_LISTENER", "Lorg/apache/openejb/cdi/RequestScopedThreadContextListener;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ThreadContext", "addThreadContextListener", "(Lorg/apache/openejb/core/ThreadContextListener;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/cdi/ThreadSingletonService;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "getComponent", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/cdi/ThreadSingletonService");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/cdi/CdiBuilder", "initializeOWB", "()Lorg/apache/openejb/cdi/ThreadSingletonService;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/cdi/ThreadSingletonService"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/cdi/CdiBuilder", "logger", "Lorg/apache/openejb/util/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Existing thread singleton service in SystemInstance(): ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "info", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "(Lorg/apache/openejb/assembler/classic/AppInfo;Lorg/apache/openejb/AppContext;Ljava/util/List;Lorg/apache/openejb/core/WebContext;)V", "(Lorg/apache/openejb/assembler/classic/AppInfo;Lorg/apache/openejb/AppContext;Ljava/util/List<Lorg/apache/openejb/BeanContext;>;Lorg/apache/openejb/core/WebContext;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/cdi/CdiBuilder", "initSingleton", "()Lorg/apache/openejb/cdi/ThreadSingletonService;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/cdi/StartupObject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/cdi/StartupObject", "<init>", "(Lorg/apache/openejb/AppContext;Lorg/apache/openejb/assembler/classic/AppInfo;Ljava/util/List;Lorg/apache/openejb/core/WebContext;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/cdi/ThreadSingletonService", "initialize", "(Lorg/apache/openejb/cdi/StartupObject;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_SYNCHRONIZED, "initializeOWB", "()Lorg/apache/openejb/cdi/ThreadSingletonService;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/cdi/CdiBuilder", "logger", "Lorg/apache/openejb/util/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Created new singletonService ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/cdi/CdiBuilder", "SINGLETON_SERVICE", "Lorg/apache/openejb/cdi/ThreadSingletonService;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "info", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/cdi/CdiBuilder", "SINGLETON_SERVICE", "Lorg/apache/openejb/cdi/ThreadSingletonService;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "addObserver", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/cdi/ThreadSingletonService;"));
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/cdi/CdiBuilder", "SINGLETON_SERVICE", "Lorg/apache/openejb/cdi/ThreadSingletonService;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "setComponent", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/cdi/CdiBuilder", "SINGLETON_SERVICE", "Lorg/apache/openejb/cdi/ThreadSingletonService;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/config/WebBeansFinder", "setSingletonService", "(Lorg/apache/webbeans/spi/SingletonService;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/cdi/CdiBuilder", "logger", "Lorg/apache/openejb/util/Logger;");
methodVisitor.visitLdcInsn("Succeeded in installing singleton service");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "info", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/cdi/CdiBuilder", "logger", "Lorg/apache/openejb/util/Logger;");
methodVisitor.visitLdcInsn("Could not install our singleton service");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "debug", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/cdi/CdiBuilder", "SINGLETON_SERVICE", "Lorg/apache/openejb/cdi/ThreadSingletonService;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_CDI", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/cdi/CdiBuilder;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Logger", "getInstance", "(Lorg/apache/openejb/util/LogCategory;Ljava/lang/Class;)Lorg/apache/openejb/util/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/cdi/CdiBuilder", "logger", "Lorg/apache/openejb/util/Logger;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/cdi/ThreadSingletonServiceImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/cdi/ThreadSingletonServiceImpl", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/cdi/CdiBuilder", "SINGLETON_SERVICE", "Lorg/apache/openejb/cdi/ThreadSingletonService;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/cdi/RequestScopedThreadContextListener");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/cdi/RequestScopedThreadContextListener", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/cdi/CdiBuilder", "REQUEST_SCOPED_THREAD_CONTEXT_LISTENER", "Lorg/apache/openejb/cdi/RequestScopedThreadContextListener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
