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
public class AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl", "<T:Ljava/lang/Object;>Lorg/apache/webbeans/portable/AnnotatedConstructorImpl<TT;>;", "org/apache/webbeans/portable/AnnotatedConstructorImpl", null);

classWriter.visitInnerClass("org/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl", "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget", "SubClassAnnotatedConstructorImpl", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "parentConstructor", "Ljava/lang/reflect/Constructor;", "Ljava/lang/reflect/Constructor<TT;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;Ljavax/enterprise/inject/spi/AnnotatedType;)V", "(Lorg/apache/webbeans/config/WebBeansContext;Ljava/lang/reflect/Constructor<TT;>;Ljava/lang/reflect/Constructor<TT;>;Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/AnnotatedConstructorImpl", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljava/lang/reflect/Constructor;Ljavax/enterprise/inject/spi/AnnotatedType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl", "parentConstructor", "Ljava/lang/reflect/Constructor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl;)Ljava/lang/reflect/Constructor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/AbstractDecoratorInjectionTarget$SubClassAnnotatedConstructorImpl", "parentConstructor", "Ljava/lang/reflect/Constructor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
