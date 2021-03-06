package asm.org.apache.myfaces.el.unified;
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
public class CustomLastELResolverComparatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/el/unified/CustomLastELResolverComparator", "Ljava/lang/Object;Ljava/util/Comparator<Ljakarta/el/ELResolver;>;", "java/lang/Object", new String[] { "java/util/Comparator" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_inverseResolver", "Lorg/apache/myfaces/el/unified/CustomFirstELResolverComparator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/el/unified/CustomFirstELResolverComparator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/el/unified/CustomFirstELResolverComparator", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/el/unified/CustomLastELResolverComparator", "_inverseResolver", "Lorg/apache/myfaces/el/unified/CustomFirstELResolverComparator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compare", "(Ljakarta/el/ELResolver;Ljakarta/el/ELResolver;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/el/unified/CustomLastELResolverComparator", "_inverseResolver", "Lorg/apache/myfaces/el/unified/CustomFirstELResolverComparator;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/el/unified/CustomFirstELResolverComparator", "compare", "(Ljakarta/el/ELResolver;Ljakarta/el/ELResolver;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/el/ELResolver");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/el/ELResolver");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/el/unified/CustomLastELResolverComparator", "compare", "(Ljakarta/el/ELResolver;Ljakarta/el/ELResolver;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
