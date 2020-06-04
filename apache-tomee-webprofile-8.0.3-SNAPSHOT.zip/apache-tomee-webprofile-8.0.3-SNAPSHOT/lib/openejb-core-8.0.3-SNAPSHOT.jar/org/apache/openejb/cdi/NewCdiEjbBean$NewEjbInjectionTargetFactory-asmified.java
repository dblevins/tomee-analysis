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
public class NewCdiEjbBean$NewEjbInjectionTargetFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/cdi/NewCdiEjbBean$NewEjbInjectionTargetFactory", "<T:Ljava/lang/Object;>Lorg/apache/webbeans/container/InjectionTargetFactoryImpl<TT;>;", "org/apache/webbeans/container/InjectionTargetFactoryImpl", null);

classWriter.visitInnerClass("org/apache/openejb/cdi/NewCdiEjbBean$NewEjbInjectionTargetFactory", "org/apache/openejb/cdi/NewCdiEjbBean", "NewEjbInjectionTargetFactory", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "injectionTarget", "Ljakarta/enterprise/inject/spi/InjectionTarget;", "Ljakarta/enterprise/inject/spi/InjectionTarget<TT;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/enterprise/inject/spi/AnnotatedType;Lorg/apache/webbeans/config/WebBeansContext;Ljakarta/enterprise/inject/spi/InjectionTarget;)V", "(Ljakarta/enterprise/inject/spi/AnnotatedType<TT;>;Lorg/apache/webbeans/config/WebBeansContext;Ljakarta/enterprise/inject/spi/InjectionTarget<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/InjectionTargetFactoryImpl", "<init>", "(Ljakarta/enterprise/inject/spi/AnnotatedType;Lorg/apache/webbeans/config/WebBeansContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/cdi/NewCdiEjbBean$NewEjbInjectionTargetFactory", "injectionTarget", "Ljakarta/enterprise/inject/spi/InjectionTarget;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createInjectionTarget", "(Ljakarta/enterprise/inject/spi/Bean;)Ljakarta/enterprise/inject/spi/InjectionTarget;", "(Ljakarta/enterprise/inject/spi/Bean<TT;>;)Ljakarta/enterprise/inject/spi/InjectionTarget<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/cdi/NewCdiEjbBean$NewEjbInjectionTargetFactory", "injectionTarget", "Ljakarta/enterprise/inject/spi/InjectionTarget;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
