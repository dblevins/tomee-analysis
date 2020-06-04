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
public class SingletonInstanceManager$BeanManagedLockDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/core/singleton/SingletonInstanceManager$BeanManagedLock", null, "java/lang/Object", new String[] { "java/util/concurrent/locks/ReadWriteLock" });

classWriter.visitInnerClass("org/apache/openejb/core/singleton/SingletonInstanceManager$BeanManagedLock", "org/apache/openejb/core/singleton/SingletonInstanceManager", "BeanManagedLock", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/core/singleton/SingletonInstanceManager$BeanManagedLock$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/core/singleton/SingletonInstanceManager$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "lock", "Ljava/util/concurrent/locks/Lock;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/singleton/SingletonInstanceManager$BeanManagedLock$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/singleton/SingletonInstanceManager$BeanManagedLock$1", "<init>", "(Lorg/apache/openejb/core/singleton/SingletonInstanceManager$BeanManagedLock;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/singleton/SingletonInstanceManager$BeanManagedLock", "lock", "Ljava/util/concurrent/locks/Lock;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readLock", "()Ljava/util/concurrent/locks/Lock;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/singleton/SingletonInstanceManager$BeanManagedLock", "lock", "Ljava/util/concurrent/locks/Lock;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeLock", "()Ljava/util/concurrent/locks/Lock;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/singleton/SingletonInstanceManager$BeanManagedLock", "lock", "Ljava/util/concurrent/locks/Lock;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/core/singleton/SingletonInstanceManager$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/singleton/SingletonInstanceManager$BeanManagedLock", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
