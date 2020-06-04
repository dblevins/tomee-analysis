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
public class BdaScannerServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/webbeans/spi/BdaScannerService", null, "java/lang/Object", new String[] { "org/apache/webbeans/spi/ScannerService" });

classWriter.visitInnerClass("org/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation", "org/apache/webbeans/spi/BeanArchiveService", "BeanArchiveInformation", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBeanClassesPerBda", "()Ljava/util/Map;", "()Ljava/util/Map<Lorg/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation;Ljava/util/Set<Ljava/lang/Class<*>;>;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
