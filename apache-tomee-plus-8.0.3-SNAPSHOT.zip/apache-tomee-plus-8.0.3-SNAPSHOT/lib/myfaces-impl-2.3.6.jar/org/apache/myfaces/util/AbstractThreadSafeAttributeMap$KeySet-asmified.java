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
public class AbstractThreadSafeAttributeMap$KeySetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap$KeySet", "Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap<TV;>.AbstractAttributeSet<Ljava/lang/String;>;", "org/apache/myfaces/util/AbstractThreadSafeAttributeMap$AbstractAttributeSet", null);

classWriter.visitInnerClass("org/apache/myfaces/util/AbstractThreadSafeAttributeMap$KeySet", "org/apache/myfaces/util/AbstractThreadSafeAttributeMap", "KeySet", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/myfaces/util/AbstractThreadSafeAttributeMap$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/myfaces/util/AbstractThreadSafeAttributeMap$AbstractAttributeSet", "org/apache/myfaces/util/AbstractThreadSafeAttributeMap", "AbstractAttributeSet", ACC_PRIVATE | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/myfaces/util/AbstractThreadSafeAttributeMap$KeyIterator", "org/apache/myfaces/util/AbstractThreadSafeAttributeMap", "KeyIterator", ACC_PRIVATE | ACC_FINAL);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap$KeySet", "this$0", "Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap$AbstractAttributeSet", "<init>", "(Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap$KeyIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap$KeySet", "this$0", "Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap$KeyIterator", "<init>", "(Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "contains", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap$KeySet", "this$0", "Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap", "containsKey", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap$KeySet", "this$0", "Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/util/AbstractThreadSafeAttributeMap$KeySet", "<init>", "(Lorg/apache/myfaces/util/AbstractThreadSafeAttributeMap;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
