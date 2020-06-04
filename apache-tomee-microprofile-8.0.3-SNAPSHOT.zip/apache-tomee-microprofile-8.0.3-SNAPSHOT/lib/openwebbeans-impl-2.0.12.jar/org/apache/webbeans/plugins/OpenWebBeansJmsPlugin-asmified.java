package asm.org.apache.webbeans.plugins;
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
public class OpenWebBeansJmsPluginDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/webbeans/plugins/OpenWebBeansJmsPlugin", null, "java/lang/Object", new String[] { "org/apache/webbeans/spi/plugins/OpenWebBeansPlugin" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJmsBean", "(Lorg/apache/webbeans/jms/JMSModel;)Ljakarta/enterprise/inject/spi/Bean;", "(Lorg/apache/webbeans/jms/JMSModel;)Ljakarta/enterprise/inject/spi/Bean<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJmsBeanProxy", "(Ljakarta/enterprise/inject/spi/Bean;Ljava/lang/Class;)Ljava/lang/Object;", "(Ljakarta/enterprise/inject/spi/Bean<*>;Ljava/lang/Class<*>;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
