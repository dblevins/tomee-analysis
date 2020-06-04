package asm.org.apache.commons.collections;
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
public class ReferenceMap$KeyIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_SUPER, "org/apache/commons/collections/ReferenceMap$KeyIterator", null, "org/apache/commons/collections/ReferenceMap$EntryIterator", null);

classWriter.visitInnerClass("org/apache/commons/collections/ReferenceMap$KeyIterator", "org/apache/commons/collections/ReferenceMap", "KeyIterator", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/collections/ReferenceMap$1", null, null, 0);

classWriter.visitInnerClass("org/apache/commons/collections/ReferenceMap$EntryIterator", "org/apache/commons/collections/ReferenceMap", "EntryIterator", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/collections/ReferenceMap$Entry", "org/apache/commons/collections/ReferenceMap", "Entry", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/collections/ReferenceMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/commons/collections/ReferenceMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/ReferenceMap$EntryIterator", "<init>", "(Lorg/apache/commons/collections/ReferenceMap;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/ReferenceMap$KeyIterator", "this$0", "Lorg/apache/commons/collections/ReferenceMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/ReferenceMap$KeyIterator", "nextEntry", "()Lorg/apache/commons/collections/ReferenceMap$Entry;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/ReferenceMap$Entry", "getKey", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/commons/collections/ReferenceMap;Lorg/apache/commons/collections/ReferenceMap$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/ReferenceMap$KeyIterator", "<init>", "(Lorg/apache/commons/collections/ReferenceMap;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
