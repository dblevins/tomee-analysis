package asm.org.apache.myfaces.util;
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
public class AbstractAttributeMap$EntryIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/myfaces/util/AbstractAttributeMap$EntryIterator", "Lorg/apache/myfaces/util/AbstractAttributeMap<TV;>.AbstractAttributeIterator<Ljava/util/Map$Entry<Ljava/lang/String;TV;>;>;", "org/apache/myfaces/util/AbstractAttributeMap$AbstractAttributeIterator", null);

classWriter.visitInnerClass("org/apache/myfaces/util/AbstractAttributeMap$EntryIterator", "org/apache/myfaces/util/AbstractAttributeMap", "EntryIterator", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/myfaces/util/AbstractAttributeMap$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/myfaces/util/AbstractAttributeMap$AbstractAttributeIterator", "org/apache/myfaces/util/AbstractAttributeMap", "AbstractAttributeIterator", ACC_PRIVATE | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/myfaces/util/AbstractAttributeMap$EntrySetEntry", "org/apache/myfaces/util/AbstractAttributeMap", "EntrySetEntry", ACC_PRIVATE | ACC_FINAL);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/myfaces/util/AbstractAttributeMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/myfaces/util/AbstractAttributeMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/util/AbstractAttributeMap$EntryIterator", "this$0", "Lorg/apache/myfaces/util/AbstractAttributeMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/util/AbstractAttributeMap$AbstractAttributeIterator", "<init>", "(Lorg/apache/myfaces/util/AbstractAttributeMap;Lorg/apache/myfaces/util/AbstractAttributeMap$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getValue", "(Ljava/lang/String;)Ljava/util/Map$Entry;", "(Ljava/lang/String;)Ljava/util/Map$Entry<Ljava/lang/String;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/util/AbstractAttributeMap$EntrySetEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/util/AbstractAttributeMap$EntryIterator", "this$0", "Lorg/apache/myfaces/util/AbstractAttributeMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/util/AbstractAttributeMap$EntrySetEntry", "<init>", "(Lorg/apache/myfaces/util/AbstractAttributeMap;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "getValue", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/util/AbstractAttributeMap$EntryIterator", "getValue", "(Ljava/lang/String;)Ljava/util/Map$Entry;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/myfaces/util/AbstractAttributeMap;Lorg/apache/myfaces/util/AbstractAttributeMap$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/util/AbstractAttributeMap$EntryIterator", "<init>", "(Lorg/apache/myfaces/util/AbstractAttributeMap;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
