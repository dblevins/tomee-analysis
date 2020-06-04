package asm.org.apache.webbeans.component;
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
public class BuiltInOwbBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/webbeans/component/BuiltInOwbBean", "<T:Ljava/lang/Object;>Lorg/apache/webbeans/component/AbstractOwbBean<TT;>;", "org/apache/webbeans/component/AbstractOwbBean", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "producer", "Ljavax/enterprise/inject/spi/Producer;", "Ljavax/enterprise/inject/spi/Producer<TT;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/webbeans/component/WebBeansType;Ljava/lang/Class;Ljavax/enterprise/inject/spi/ProducerFactory;)V", "(Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/webbeans/component/WebBeansType;Ljava/lang/Class<TT;>;Ljavax/enterprise/inject/spi/ProducerFactory<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/BeanAttributesImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/reflect/Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/util/CollectionUtil", "unmodifiableSet", "([Ljava/lang/Object;)Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/BeanAttributesImpl", "<init>", "(Ljava/util/Set;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/BuiltInOwbBean", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/webbeans/component/WebBeansType;Lorg/apache/webbeans/component/BeanAttributesImpl;Ljava/lang/Class;ZLjavax/enterprise/inject/spi/ProducerFactory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/webbeans/component/WebBeansType;Lorg/apache/webbeans/component/BeanAttributesImpl;Ljava/lang/Class;ZLjavax/enterprise/inject/spi/ProducerFactory;)V", "(Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/webbeans/component/WebBeansType;Lorg/apache/webbeans/component/BeanAttributesImpl<TT;>;Ljava/lang/Class<TT;>;ZLjavax/enterprise/inject/spi/ProducerFactory<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/AbstractOwbBean", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/webbeans/component/WebBeansType;Ljavax/enterprise/inject/spi/BeanAttributes;Ljava/lang/Class;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("ProducerFactory");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/util/Asserts", "assertNotNull", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProducerFactory", "createProducer", "(Ljavax/enterprise/inject/spi/Bean;)Ljavax/enterprise/inject/spi/Producer;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/component/BuiltInOwbBean", "producer", "Ljavax/enterprise/inject/spi/Producer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProducer", "()Ljavax/enterprise/inject/spi/Producer;", "()Ljavax/enterprise/inject/spi/Producer<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/BuiltInOwbBean", "producer", "Ljavax/enterprise/inject/spi/Producer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "proxyableType", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
