package asm.org.apache.cxf.jaxrs.provider;
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
public class ProviderFactory$NameKeyComparatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/provider/ProviderFactory$NameKeyComparator", "Lorg/apache/cxf/jaxrs/provider/ProviderFactory$AbstractPriorityComparator;Ljava/util/Comparator<Lorg/apache/cxf/jaxrs/provider/ProviderFactory$NameKey;>;", "org/apache/cxf/jaxrs/provider/ProviderFactory$AbstractPriorityComparator", new String[] { "java/util/Comparator" });

classWriter.visitInnerClass("org/apache/cxf/jaxrs/provider/ProviderFactory$NameKeyComparator", "org/apache/cxf/jaxrs/provider/ProviderFactory", "NameKeyComparator", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/provider/ProviderFactory$NameKey", "org/apache/cxf/jaxrs/provider/ProviderFactory", "NameKey", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/provider/ProviderFactory$AbstractPriorityComparator", "org/apache/cxf/jaxrs/provider/ProviderFactory", "AbstractPriorityComparator", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "comparator", "Ljava/util/Comparator;", "Ljava/util/Comparator<Lorg/apache/cxf/jaxrs/model/ProviderInfo<*>;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/provider/ProviderFactory$NameKeyComparator", "<init>", "(Ljava/util/Comparator;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/Comparator;Z)V", "(Ljava/util/Comparator<Lorg/apache/cxf/jaxrs/model/ProviderInfo<*>;>;Z)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/provider/ProviderFactory$AbstractPriorityComparator", "<init>", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/provider/ProviderFactory$NameKeyComparator", "comparator", "Ljava/util/Comparator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compare", "(Lorg/apache/cxf/jaxrs/provider/ProviderFactory$NameKey;Lorg/apache/cxf/jaxrs/provider/ProviderFactory$NameKey;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/provider/ProviderFactory$NameKey", "getPriority", "()Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/provider/ProviderFactory$NameKey", "getPriority", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/provider/ProviderFactory$NameKeyComparator", "compare", "(Ljava/lang/Integer;Ljava/lang/Integer;)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/provider/ProviderFactory$NameKeyComparator", "comparator", "Ljava/util/Comparator;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/provider/ProviderFactory$NameKeyComparator", "comparator", "Ljava/util/Comparator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/provider/ProviderFactory$NameKey", "getProviderInfo", "()Lorg/apache/cxf/jaxrs/model/ProviderInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/provider/ProviderFactory$NameKey", "getProviderInfo", "()Lorg/apache/cxf/jaxrs/model/ProviderInfo;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Comparator", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", true);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/provider/ProviderFactory$NameKey", "hashCode", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/provider/ProviderFactory$NameKey", "hashCode", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/provider/ProviderFactory$NameKeyComparator", "compare", "(Ljava/lang/Integer;Ljava/lang/Integer;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxrs/provider/ProviderFactory$NameKey");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxrs/provider/ProviderFactory$NameKey");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/provider/ProviderFactory$NameKeyComparator", "compare", "(Lorg/apache/cxf/jaxrs/provider/ProviderFactory$NameKey;Lorg/apache/cxf/jaxrs/provider/ProviderFactory$NameKey;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
