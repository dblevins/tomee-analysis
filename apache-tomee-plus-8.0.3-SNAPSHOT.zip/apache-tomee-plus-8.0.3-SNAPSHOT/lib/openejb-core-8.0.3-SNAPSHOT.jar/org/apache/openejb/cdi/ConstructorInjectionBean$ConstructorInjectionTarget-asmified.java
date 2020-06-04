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
public class ConstructorInjectionBean$ConstructorInjectionTargetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/cdi/ConstructorInjectionBean$ConstructorInjectionTarget", "<T:Ljava/lang/Object;>Lorg/apache/webbeans/portable/InjectionTargetImpl<TT;>;", "org/apache/webbeans/portable/InjectionTargetImpl", null);

classWriter.visitInnerClass("org/apache/openejb/cdi/ConstructorInjectionBean$ConstructorInjectionTarget", "org/apache/openejb/cdi/ConstructorInjectionBean", "ConstructorInjectionTarget", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/enterprise/inject/spi/AnnotatedType;Ljava/util/Set;Lorg/apache/webbeans/config/WebBeansContext;)V", "(Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;Ljava/util/Set<Ljavax/enterprise/inject/spi/InjectionPoint;>;Lorg/apache/webbeans/config/WebBeansContext;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/InjectionTargetImpl", "<init>", "(Ljavax/enterprise/inject/spi/AnnotatedType;Ljava/util/Set;Lorg/apache/webbeans/config/WebBeansContext;Ljava/util/List;Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
