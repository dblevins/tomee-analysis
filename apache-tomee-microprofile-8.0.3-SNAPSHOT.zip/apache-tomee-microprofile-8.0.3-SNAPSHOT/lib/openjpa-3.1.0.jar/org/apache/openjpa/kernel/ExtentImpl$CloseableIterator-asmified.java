package asm.org.apache.openjpa.kernel;
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
public class ExtentImpl$CloseableIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/kernel/ExtentImpl$CloseableIterator", "<T:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/openjpa/lib/util/Closeable;Ljava/util/Iterator<TT;>;", "java/lang/Object", new String[] { "org/apache/openjpa/lib/util/Closeable", "java/util/Iterator" });

classWriter.visitInnerClass("org/apache/openjpa/kernel/ExtentImpl$CloseableIterator", "org/apache/openjpa/kernel/ExtentImpl", "CloseableIterator", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setRemoveOnClose", "(Lorg/apache/openjpa/kernel/ExtentImpl;)V", "(Lorg/apache/openjpa/kernel/ExtentImpl<TT;>;)V", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
