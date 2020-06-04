package asm.org.apache.tomee.catalina.cdi;
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
public class WebBeansThreadBindingListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomee/catalina/cdi/WebBeansThreadBindingListener", null, "java/lang/Object", new String[] { "org/apache/catalina/ThreadBindingListener" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "contextsService", "Lorg/apache/webbeans/spi/ContextsService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Lorg/apache/catalina/ThreadBindingListener;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/catalina/ThreadBindingListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getContextsService", "()Lorg/apache/webbeans/spi/ContextsService;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/catalina/cdi/WebBeansThreadBindingListener", "contextsService", "Lorg/apache/webbeans/spi/ContextsService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/catalina/cdi/WebBeansThreadBindingListener", "delegate", "Lorg/apache/catalina/ThreadBindingListener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "bind", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/catalina/cdi/WebBeansThreadBindingListener", "delegate", "Lorg/apache/catalina/ThreadBindingListener;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/ThreadBindingListener", "bind", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unbind", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/catalina/cdi/WebBeansThreadBindingListener", "contextsService", "Lorg/apache/webbeans/spi/ContextsService;");
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/context/RequestScoped;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContextsService", "endContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/catalina/cdi/WebBeansThreadBindingListener", "delegate", "Lorg/apache/catalina/ThreadBindingListener;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/ThreadBindingListener", "unbind", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
