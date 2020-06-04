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
public class MapUtils$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/commons/collections4/MapUtils$2", "Lorg/apache/commons/collections4/map/AbstractSortedMapDecorator<TK;TV;>;", "org/apache/commons/collections4/map/AbstractSortedMapDecorator", null);

classWriter.visitOuterClass("org/apache/commons/collections4/MapUtils", "iterableSortedMap", "(Ljava/util/SortedMap;)Lorg/apache/commons/collections4/IterableSortedMap;");

classWriter.visitInnerClass("org/apache/commons/collections4/MapUtils$2", null, null, ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/util/SortedMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/map/AbstractSortedMapDecorator", "<init>", "(Ljava/util/SortedMap;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
