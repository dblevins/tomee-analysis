package asm.org.apache.webbeans.portable;
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
public class AbstractEjbInjectionTargetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/webbeans/portable/AbstractEjbInjectionTarget", "<T:Ljava/lang/Object;>Lorg/apache/webbeans/portable/InjectionTargetImpl<TT;>;", "org/apache/webbeans/portable/InjectionTargetImpl", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/enterprise/inject/spi/AnnotatedType;Ljava/util/Set;Lorg/apache/webbeans/config/WebBeansContext;)V", "(Ljakarta/enterprise/inject/spi/AnnotatedType<TT;>;Ljava/util/Set<Ljakarta/enterprise/inject/spi/InjectionPoint;>;Lorg/apache/webbeans/config/WebBeansContext;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/InjectionTargetImpl", "<init>", "(Ljakarta/enterprise/inject/spi/AnnotatedType;Ljava/util/Set;Lorg/apache/webbeans/config/WebBeansContext;Ljava/util/List;Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "produce", "(Ljakarta/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", "(Ljakarta/enterprise/context/spi/CreationalContext<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
