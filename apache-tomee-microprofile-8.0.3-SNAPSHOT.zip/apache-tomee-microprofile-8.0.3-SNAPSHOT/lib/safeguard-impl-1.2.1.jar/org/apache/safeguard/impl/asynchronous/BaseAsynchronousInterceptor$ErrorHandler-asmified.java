package asm.org.apache.safeguard.impl.asynchronous;
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
public class BaseAsynchronousInterceptor$ErrorHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/safeguard/impl/asynchronous/BaseAsynchronousInterceptor$ErrorHandler", "<A:Ljava/lang/Object;B:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/FunctionalInterface;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/safeguard/impl/asynchronous/BaseAsynchronousInterceptor$ErrorHandler", "org/apache/safeguard/impl/asynchronous/BaseAsynchronousInterceptor", "ErrorHandler", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TA;)TB;", new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
