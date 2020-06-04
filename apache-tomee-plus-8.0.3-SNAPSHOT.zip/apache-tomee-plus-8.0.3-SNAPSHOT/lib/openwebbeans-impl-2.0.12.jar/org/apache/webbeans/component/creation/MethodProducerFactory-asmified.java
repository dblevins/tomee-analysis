package asm.org.apache.webbeans.component.creation;
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
public class MethodProducerFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/component/creation/MethodProducerFactory", "<P:Ljava/lang/Object;>Lorg/apache/webbeans/component/creation/BaseProducerFactory<TP;>;", "org/apache/webbeans/component/creation/BaseProducerFactory", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "producerMethod", "Ljavax/enterprise/inject/spi/AnnotatedMethod;", "Ljavax/enterprise/inject/spi/AnnotatedMethod<-TP;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/enterprise/inject/spi/AnnotatedMethod;Ljavax/enterprise/inject/spi/Bean;Lorg/apache/webbeans/config/WebBeansContext;)V", "(Ljavax/enterprise/inject/spi/AnnotatedMethod<-TP;>;Ljavax/enterprise/inject/spi/Bean<TP;>;Lorg/apache/webbeans/config/WebBeansContext;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/creation/BaseProducerFactory", "<init>", "(Ljavax/enterprise/inject/spi/Bean;Lorg/apache/webbeans/config/WebBeansContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("producer method");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/util/Asserts", "assertNotNull", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/component/creation/MethodProducerFactory", "producerMethod", "Ljavax/enterprise/inject/spi/AnnotatedMethod;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/MethodProducerFactory", "defineDisposalMethod", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "producerType", "()Ljavax/enterprise/inject/spi/AnnotatedMember;", "()Ljavax/enterprise/inject/spi/AnnotatedMember<-TP;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/MethodProducerFactory", "producerMethod", "Ljavax/enterprise/inject/spi/AnnotatedMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReturnType", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/MethodProducerFactory", "producerMethod", "Ljavax/enterprise/inject/spi/AnnotatedMethod;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedMethod", "getJavaMember", "()Ljava/lang/reflect/Method;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getReturnType", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createProducer", "(Ljavax/enterprise/inject/spi/Bean;)Ljavax/enterprise/inject/spi/Producer;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/Bean<TT;>;)Ljavax/enterprise/inject/spi/Producer<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/MethodProducerFactory", "getInjectionPoints", "(Ljavax/enterprise/inject/spi/Bean;)Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/portable/ProducerMethodProducer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/MethodProducerFactory", "parent", "Ljavax/enterprise/inject/spi/Bean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/MethodProducerFactory", "producerMethod", "Ljavax/enterprise/inject/spi/AnnotatedMethod;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/MethodProducerFactory", "disposalMethod", "Ljavax/enterprise/inject/spi/AnnotatedMethod;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/MethodProducerFactory", "createInjectionPoints", "(Ljavax/enterprise/inject/spi/Bean;)Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/MethodProducerFactory", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/ProducerMethodProducer", "<init>", "(Ljavax/enterprise/inject/spi/Bean;Ljavax/enterprise/inject/spi/AnnotatedMethod;Ljavax/enterprise/inject/spi/AnnotatedMethod;Ljava/util/Set;Ljava/util/Set;Lorg/apache/webbeans/config/WebBeansContext;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/MethodProducerFactory", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getWebBeansUtil", "()Lorg/apache/webbeans/util/WebBeansUtil;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/MethodProducerFactory", "producerMethod", "Ljavax/enterprise/inject/spi/AnnotatedMethod;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/util/WebBeansUtil", "fireProcessProducerEvent", "(Ljavax/enterprise/inject/spi/Producer;Ljavax/enterprise/inject/spi/AnnotatedMember;)Ljavax/enterprise/inject/spi/Producer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createInjectionPoints", "(Ljavax/enterprise/inject/spi/Bean;)Ljava/util/Set;", "(Ljavax/enterprise/inject/spi/Bean<*>;)Ljava/util/Set<Ljavax/enterprise/inject/spi/InjectionPoint;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/MethodProducerFactory", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getInjectionPointFactory", "()Lorg/apache/webbeans/inject/impl/InjectionPointFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/MethodProducerFactory", "producerMethod", "Ljavax/enterprise/inject/spi/AnnotatedMethod;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/inject/impl/InjectionPointFactory", "buildInjectionPoints", "(Ljavax/enterprise/inject/spi/Bean;Ljavax/enterprise/inject/spi/AnnotatedCallable;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "(Ljava/util/Collection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
