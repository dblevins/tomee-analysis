package asm.org.apache.webbeans.spi;
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
public class ResourceInjectionServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/webbeans/spi/ResourceInjectionService", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "injectJavaEEResources", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getResourceReference", "(Lorg/apache/webbeans/spi/api/ResourceReference;)Ljava/lang/Object;", "<X:Ljava/lang/Object;T::Ljava/lang/annotation/Annotation;>(Lorg/apache/webbeans/spi/api/ResourceReference<TX;TT;>;)TX;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "clear", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "writeExternal", "(Ljakarta/enterprise/inject/spi/Bean;Ljava/lang/Object;Ljava/io/ObjectOutput;)V", "<T:Ljava/lang/Object;>(Ljakarta/enterprise/inject/spi/Bean<TT;>;TT;Ljava/io/ObjectOutput;)V", new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "readExternal", "(Ljakarta/enterprise/inject/spi/Bean;Ljava/io/ObjectInput;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljakarta/enterprise/inject/spi/Bean<TT;>;Ljava/io/ObjectInput;)TT;", new String[] { "java/io/IOException", "java/lang/ClassNotFoundException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
