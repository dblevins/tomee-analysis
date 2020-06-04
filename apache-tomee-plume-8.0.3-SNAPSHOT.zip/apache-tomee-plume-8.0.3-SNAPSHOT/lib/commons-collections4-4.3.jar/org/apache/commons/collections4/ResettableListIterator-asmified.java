package asm.org.apache.commons.collections4;
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
public class ResettableListIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/commons/collections4/ResettableListIterator", "<E:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/ListIterator<TE;>;Lorg/apache/commons/collections4/ResettableIterator<TE;>;Lorg/apache/commons/collections4/OrderedIterator<TE;>;", "java/lang/Object", new String[] { "java/util/ListIterator", "org/apache/commons/collections4/ResettableIterator", "org/apache/commons/collections4/OrderedIterator" });

classWriter.visitEnd();

return classWriter.toByteArray();
}
}
