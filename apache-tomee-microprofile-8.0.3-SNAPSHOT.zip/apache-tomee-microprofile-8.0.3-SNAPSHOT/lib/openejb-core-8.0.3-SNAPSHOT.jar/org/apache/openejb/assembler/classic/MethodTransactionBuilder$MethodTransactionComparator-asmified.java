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
public class MethodTransactionBuilder$MethodTransactionComparatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/assembler/classic/MethodTransactionBuilder$MethodTransactionComparator", "Lorg/apache/openejb/assembler/classic/MethodInfoUtil$BaseComparator<Lorg/apache/openejb/assembler/classic/MethodTransactionInfo;>;", "org/apache/openejb/assembler/classic/MethodInfoUtil$BaseComparator", null);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/MethodTransactionBuilder$MethodTransactionComparator", "org/apache/openejb/assembler/classic/MethodTransactionBuilder", "MethodTransactionComparator", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/MethodInfoUtil$BaseComparator", "org/apache/openejb/assembler/classic/MethodInfoUtil", "BaseComparator", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/MethodInfoUtil$BaseComparator", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compare", "(Lorg/apache/openejb/assembler/classic/MethodTransactionInfo;Lorg/apache/openejb/assembler/classic/MethodTransactionInfo;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/MethodTransactionInfo", "methods", "Ljava/util/List;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/MethodInfo");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/MethodTransactionInfo", "methods", "Ljava/util/List;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/MethodInfo");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/MethodTransactionBuilder$MethodTransactionComparator", "compare", "(Lorg/apache/openejb/assembler/classic/MethodInfo;Lorg/apache/openejb/assembler/classic/MethodInfo;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/MethodTransactionInfo");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/MethodTransactionInfo");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/MethodTransactionBuilder$MethodTransactionComparator", "compare", "(Lorg/apache/openejb/assembler/classic/MethodTransactionInfo;Lorg/apache/openejb/assembler/classic/MethodTransactionInfo;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
