package asm.org.apache.commons.collections4.map;
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
public class Flat3Map$KeySetIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/commons/collections4/map/Flat3Map$KeySetIterator", "<K:Ljava/lang/Object;>Lorg/apache/commons/collections4/map/Flat3Map$EntryIterator<TK;Ljava/lang/Object;>;Ljava/util/Iterator<TK;>;", "org/apache/commons/collections4/map/Flat3Map$EntryIterator", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("org/apache/commons/collections4/map/Flat3Map$KeySetIterator", "org/apache/commons/collections4/map/Flat3Map", "KeySetIterator", ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/map/Flat3Map$EntryIterator", "org/apache/commons/collections4/map/Flat3Map", "EntryIterator", ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections4/map/Flat3Map;)V", "(Lorg/apache/commons/collections4/map/Flat3Map<TK;*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/map/Flat3Map$EntryIterator", "<init>", "(Lorg/apache/commons/collections4/map/Flat3Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", "()TK;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/map/Flat3Map$KeySetIterator", "nextEntry", "()Ljava/util/Map$Entry;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
