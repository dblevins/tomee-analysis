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
public class EventBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/component/EventBean", "<T:Ljava/lang/Object;>Lorg/apache/webbeans/component/BuiltInOwbBean<Ljavax/enterprise/event/Event<TT;>;>;", "org/apache/webbeans/component/BuiltInOwbBean", null);

classWriter.visitInnerClass("org/apache/webbeans/component/EventBean$2", null, null, 0);

classWriter.visitInnerClass("org/apache/webbeans/component/EventBean$1", null, null, 0);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "OBSERVABLE", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/BeanAttributesImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/reflect/Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/EventBean$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/EventBean$1", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/EventBean$1", "getRawType", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/util/CollectionUtil", "unmodifiableSet", "([Ljava/lang/Object;)Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/BeanAttributesImpl", "<init>", "(Ljava/util/Set;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/EventBean$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/EventBean$2", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/EventBean$2", "getRawType", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/SimpleProducerFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/portable/EventProducer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/EventProducer", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/SimpleProducerFactory", "<init>", "(Ljavax/enterprise/inject/spi/Producer;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/BuiltInOwbBean", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/webbeans/component/WebBeansType;Lorg/apache/webbeans/component/BeanAttributesImpl;Ljava/lang/Class;ZLjavax/enterprise/inject/spi/ProducerFactory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(11, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPassivationCapable", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "proxyableType", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/webbeans/event/EventImpl;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
