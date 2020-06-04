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
public class ProviderFactory$BindingPriorityComparatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/provider/ProviderFactory$BindingPriorityComparator", "Lorg/apache/cxf/jaxrs/provider/ProviderFactory$AbstractPriorityComparator;Ljava/util/Comparator<Lorg/apache/cxf/jaxrs/model/ProviderInfo<*>;>;", "org/apache/cxf/jaxrs/provider/ProviderFactory$AbstractPriorityComparator", new String[] { "java/util/Comparator" });

classWriter.visitInnerClass("org/apache/cxf/jaxrs/provider/ProviderFactory$BindingPriorityComparator", "org/apache/cxf/jaxrs/provider/ProviderFactory", "BindingPriorityComparator", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/provider/ProviderFactory$AbstractPriorityComparator", "org/apache/cxf/jaxrs/provider/ProviderFactory", "AbstractPriorityComparator", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "providerCls", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Class;Z)V", "(Ljava/lang/Class<*>;Z)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/provider/ProviderFactory$AbstractPriorityComparator", "<init>", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/provider/ProviderFactory$BindingPriorityComparator", "providerCls", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compare", "(Lorg/apache/cxf/jaxrs/model/ProviderInfo;Lorg/apache/cxf/jaxrs/model/ProviderInfo;)I", "(Lorg/apache/cxf/jaxrs/model/ProviderInfo<*>;Lorg/apache/cxf/jaxrs/model/ProviderInfo<*>;)I", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/provider/ProviderFactory$BindingPriorityComparator", "providerCls", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/provider/ProviderFactory", "getFilterPriority", "(Lorg/apache/cxf/jaxrs/model/ProviderInfo;Ljava/lang/Class;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/provider/ProviderFactory$BindingPriorityComparator", "providerCls", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/provider/ProviderFactory", "getFilterPriority", "(Lorg/apache/cxf/jaxrs/model/ProviderInfo;Ljava/lang/Class;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/provider/ProviderFactory$BindingPriorityComparator", "compare", "(Ljava/lang/Integer;Ljava/lang/Integer;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxrs/model/ProviderInfo");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxrs/model/ProviderInfo");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/provider/ProviderFactory$BindingPriorityComparator", "compare", "(Lorg/apache/cxf/jaxrs/model/ProviderInfo;Lorg/apache/cxf/jaxrs/model/ProviderInfo;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
