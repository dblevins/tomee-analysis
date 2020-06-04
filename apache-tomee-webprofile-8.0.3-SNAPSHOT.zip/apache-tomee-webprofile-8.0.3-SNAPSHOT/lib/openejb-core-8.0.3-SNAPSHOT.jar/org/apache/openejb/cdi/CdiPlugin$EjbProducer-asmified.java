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
public class CdiPlugin$EjbProducerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/cdi/CdiPlugin$EjbProducer", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljakarta/enterprise/inject/spi/Producer<TT;>;", "java/lang/Object", new String[] { "jakarta/enterprise/inject/spi/Producer" });

classWriter.visitInnerClass("org/apache/openejb/cdi/CdiPlugin$InstanceBean", "org/apache/openejb/cdi/CdiPlugin", "InstanceBean", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/cdi/CdiPlugin$EjbProducer", "org/apache/openejb/cdi/CdiPlugin", "EjbProducer", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ejb", "Lorg/apache/openejb/cdi/CdiEjbBean;", "Lorg/apache/openejb/cdi/CdiEjbBean<TT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "instance", "Lorg/apache/openejb/cdi/CdiPlugin$InstanceBean;", "Lorg/apache/openejb/cdi/CdiPlugin$InstanceBean<TT;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/cdi/CdiPlugin$InstanceBean;Lorg/apache/openejb/cdi/CdiEjbBean;)V", "(Lorg/apache/openejb/cdi/CdiPlugin$InstanceBean<TT;>;Lorg/apache/openejb/cdi/CdiEjbBean<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/cdi/CdiPlugin$EjbProducer", "instance", "Lorg/apache/openejb/cdi/CdiPlugin$InstanceBean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/cdi/CdiPlugin$EjbProducer", "ejb", "Lorg/apache/openejb/cdi/CdiEjbBean;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "produce", "(Ljakarta/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", "(Ljakarta/enterprise/context/spi/CreationalContext<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/cdi/CdiPlugin$EjbProducer", "instance", "Lorg/apache/openejb/cdi/CdiPlugin$InstanceBean;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/cdi/CdiPlugin$InstanceBean", "create", "(Ljakarta/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dispose", "(Ljava/lang/Object;)V", "(TT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/cdi/CdiPlugin$EjbProducer", "ejb", "Lorg/apache/openejb/cdi/CdiEjbBean;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/cdi/CdiEjbBean", "destroyComponentInstance", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInjectionPoints", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/enterprise/inject/spi/InjectionPoint;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
