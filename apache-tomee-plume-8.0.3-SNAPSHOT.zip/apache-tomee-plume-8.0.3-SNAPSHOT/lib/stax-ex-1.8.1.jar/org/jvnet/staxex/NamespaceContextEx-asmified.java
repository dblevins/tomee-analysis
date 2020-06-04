package asm.org.jvnet.staxex;
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
public class NamespaceContextExDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/jvnet/staxex/NamespaceContextEx", "Ljava/lang/Object;Ljavax/xml/namespace/NamespaceContext;Ljava/lang/Iterable<Lorg/jvnet/staxex/NamespaceContextEx$Binding;>;", "java/lang/Object", new String[] { "javax/xml/namespace/NamespaceContext", "java/lang/Iterable" });

classWriter.visitInnerClass("org/jvnet/staxex/NamespaceContextEx$Binding", "org/jvnet/staxex/NamespaceContextEx", "Binding", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Lorg/jvnet/staxex/NamespaceContextEx$Binding;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
