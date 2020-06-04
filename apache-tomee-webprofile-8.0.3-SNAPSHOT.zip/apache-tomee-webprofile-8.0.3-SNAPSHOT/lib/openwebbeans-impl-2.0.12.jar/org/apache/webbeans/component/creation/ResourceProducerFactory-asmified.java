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
public class ResourceProducerFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/component/creation/ResourceProducerFactory", "<P:Ljava/lang/Object;>Lorg/apache/webbeans/portable/ProviderBasedProducerFactory<TP;>;", "org/apache/webbeans/portable/ProviderBasedProducerFactory", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "member", "Ljakarta/enterprise/inject/spi/AnnotatedField;", "Ljakarta/enterprise/inject/spi/AnnotatedField<-TP;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "owner", "Ljakarta/enterprise/inject/spi/Bean;", "Ljakarta/enterprise/inject/spi/Bean<TP;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ref", "Lorg/apache/webbeans/spi/api/ResourceReference;", "Lorg/apache/webbeans/spi/api/ResourceReference<**>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(ZLjakarta/enterprise/inject/spi/Bean;Lorg/apache/webbeans/component/ResourceProvider;Ljava/lang/Class;Lorg/apache/webbeans/config/WebBeansContext;Ljakarta/enterprise/inject/spi/AnnotatedField;Lorg/apache/webbeans/spi/api/ResourceReference;)V", "(ZLjakarta/enterprise/inject/spi/Bean<TP;>;Lorg/apache/webbeans/component/ResourceProvider<TP;>;Ljava/lang/Class<TP;>;Lorg/apache/webbeans/config/WebBeansContext;Ljakarta/enterprise/inject/spi/AnnotatedField<-TP;>;Lorg/apache/webbeans/spi/api/ResourceReference<**>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/ProviderBasedProducerFactory", "<init>", "(ZLjakarta/inject/Provider;Ljava/lang/Class;Lorg/apache/webbeans/config/WebBeansContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/component/creation/ResourceProducerFactory", "member", "Ljakarta/enterprise/inject/spi/AnnotatedField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/component/creation/ResourceProducerFactory", "owner", "Ljakarta/enterprise/inject/spi/Bean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/component/creation/ResourceProducerFactory", "ref", "Lorg/apache/webbeans/spi/api/ResourceReference;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createProducer", "(Ljakarta/enterprise/inject/spi/Bean;)Ljakarta/enterprise/inject/spi/Producer;", "<T:Ljava/lang/Object;>(Ljakarta/enterprise/inject/spi/Bean<TT;>;)Ljakarta/enterprise/inject/spi/Producer<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ResourceProducerFactory", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getWebBeansUtil", "()Lorg/apache/webbeans/util/WebBeansUtil;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/portable/ResourceProducer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ResourceProducerFactory", "owner", "Ljakarta/enterprise/inject/spi/Bean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ResourceProducerFactory", "member", "Ljakarta/enterprise/inject/spi/AnnotatedField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ResourceProducerFactory", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ResourceProducerFactory", "ref", "Lorg/apache/webbeans/spi/api/ResourceReference;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/ResourceProducer", "<init>", "(Ljakarta/enterprise/inject/spi/Bean;Ljakarta/enterprise/inject/spi/AnnotatedField;Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/webbeans/spi/api/ResourceReference;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ResourceProducerFactory", "member", "Ljakarta/enterprise/inject/spi/AnnotatedField;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/util/WebBeansUtil", "fireProcessProducerEvent", "(Ljakarta/enterprise/inject/spi/Producer;Ljakarta/enterprise/inject/spi/AnnotatedMember;)Ljakarta/enterprise/inject/spi/Producer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
