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
public class AbstractThreadSafeAttributeMap$ValuesIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap$ValuesIterator", "Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap<TV;>.AbstractAttributeIterator<TV;>;", "org/apache/myfaces/util/AbstractThreadSafeAttributeMap$AbstractAttributeIterator", null);

classWriter.visitInnerClass("org/apache/myfaces/util/AbstractThreadSafeAttributeMap$ValuesIterator", "org/apache/myfaces/util/AbstractThreadSafeAttributeMap", "ValuesIterator", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/myfaces/util/AbstractThreadSafeAttributeMap$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/myfaces/util/AbstractThreadSafeAttributeMap$AbstractAttributeIterator", "org/apache/myfaces/util/AbstractThreadSafeAttributeMap", "AbstractAttributeIterator", ACC_PRIVATE | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap$ValuesIterator", "this$0", "Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap$AbstractAttributeIterator", "<init>", "(Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getValue", "(Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/String;)TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap$ValuesIterator", "this$0", "Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap$ValuesIterator", "<init>", "(Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
