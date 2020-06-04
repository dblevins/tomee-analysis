package asm.org.apache.webbeans.spi.plugins;
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
public class OpenWebBeansEjbPluginDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/webbeans/spi/plugins/OpenWebBeansEjbPlugin", null, "java/lang/Object", new String[] { "org/apache/webbeans/spi/plugins/OpenWebBeansPlugin" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isSessionBean", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<*>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isNewSessionBean", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<*>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "defineSessionBean", "(Ljava/lang/Class;Ljavax/enterprise/inject/spi/BeanAttributes;Ljavax/enterprise/inject/spi/AnnotatedType;)Ljavax/enterprise/inject/spi/Bean;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljavax/enterprise/inject/spi/BeanAttributes<TT;>;Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;)Ljavax/enterprise/inject/spi/Bean<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "defineNewSessionBean", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/Bean;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljavax/enterprise/inject/spi/Bean<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isSingletonBean", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<*>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isStatelessBean", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<*>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isStatefulBean", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<*>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSessionBeanProxy", "(Ljavax/enterprise/inject/spi/Bean;Ljava/lang/Class;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", "(Ljavax/enterprise/inject/spi/Bean<*>;Ljava/lang/Class<*>;Ljavax/enterprise/context/spi/CreationalContext<*>;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveViewMethod", "(Ljavax/enterprise/inject/spi/Bean;Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;", "(Ljavax/enterprise/inject/spi/Bean<*>;Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createBeanAttributes", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljavax/enterprise/inject/spi/BeanAttributes;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;)Ljavax/enterprise/inject/spi/BeanAttributes<TT;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
