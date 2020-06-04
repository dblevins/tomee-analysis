package asm.org.apache.openejb.core.singleton;
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
public class SingletonInstanceManager$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/core/singleton/SingletonInstanceManager$1", "Ljava/lang/Object;Ljava/util/concurrent/Callable<Lorg/apache/openejb/core/singleton/Instance;>;", "java/lang/Object", new String[] { "java/util/concurrent/Callable" });

classWriter.visitOuterClass("org/apache/openejb/core/singleton/SingletonInstanceManager", "getInstance", "(Lorg/apache/openejb/core/ThreadContext;)Lorg/apache/openejb/core/singleton/Instance;");

classWriter.visitInnerClass("org/apache/openejb/core/singleton/SingletonInstanceManager$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$callContext", "Lorg/apache/openejb/core/ThreadContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$beanContext", "Lorg/apache/openejb/BeanContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/core/singleton/SingletonInstanceManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/core/singleton/SingletonInstanceManager;Lorg/apache/openejb/core/ThreadContext;Lorg/apache/openejb/BeanContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/singleton/SingletonInstanceManager$1", "this$0", "Lorg/apache/openejb/core/singleton/SingletonInstanceManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/singleton/SingletonInstanceManager$1", "val$callContext", "Lorg/apache/openejb/core/ThreadContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/singleton/SingletonInstanceManager$1", "val$beanContext", "Lorg/apache/openejb/BeanContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "call", "()Lorg/apache/openejb/core/singleton/Instance;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/singleton/SingletonInstanceManager$1", "this$0", "Lorg/apache/openejb/core/singleton/SingletonInstanceManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/singleton/SingletonInstanceManager$1", "val$callContext", "Lorg/apache/openejb/core/ThreadContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/singleton/SingletonInstanceManager$1", "val$beanContext", "Lorg/apache/openejb/BeanContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/singleton/SingletonInstanceManager", "access$100", "(Lorg/apache/openejb/core/singleton/SingletonInstanceManager;Lorg/apache/openejb/core/ThreadContext;Lorg/apache/openejb/BeanContext;)Lorg/apache/openejb/core/singleton/Instance;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "call", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/singleton/SingletonInstanceManager$1", "call", "()Lorg/apache/openejb/core/singleton/Instance;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
