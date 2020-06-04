package asm.org.apache.openejb.assembler.classic;
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
public class InterceptorBindingBuilder$IntercpetorBindingComparatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$IntercpetorBindingComparator", "Ljava/lang/Object;Ljava/util/Comparator<Lorg/apache/openejb/assembler/classic/InterceptorBindingInfo;>;", "java/lang/Object", new String[] { "java/util/Comparator" });

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/InterceptorBindingBuilder$IntercpetorBindingComparator", "org/apache/openejb/assembler/classic/InterceptorBindingBuilder", "IntercpetorBindingComparator", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Level", "org/apache/openejb/assembler/classic/InterceptorBindingBuilder", "Level", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "org/apache/openejb/assembler/classic/InterceptorBindingBuilder", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compare", "(Lorg/apache/openejb/assembler/classic/InterceptorBindingInfo;Lorg/apache/openejb/assembler/classic/InterceptorBindingInfo;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder", "access$000", "(Lorg/apache/openejb/assembler/classic/InterceptorBindingInfo;)Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Level;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder", "access$000", "(Lorg/apache/openejb/assembler/classic/InterceptorBindingInfo;)Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Level;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Level", "ordinal", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Level", "ordinal", "()I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Level", "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Level"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder", "access$100", "(Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Level;Lorg/apache/openejb/assembler/classic/InterceptorBindingInfo;)Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "ordinal", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder", "access$100", "(Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Level;Lorg/apache/openejb/assembler/classic/InterceptorBindingInfo;)Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "ordinal", "()I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/InterceptorBindingInfo");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/InterceptorBindingInfo");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$IntercpetorBindingComparator", "compare", "(Lorg/apache/openejb/assembler/classic/InterceptorBindingInfo;Lorg/apache/openejb/assembler/classic/InterceptorBindingInfo;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
