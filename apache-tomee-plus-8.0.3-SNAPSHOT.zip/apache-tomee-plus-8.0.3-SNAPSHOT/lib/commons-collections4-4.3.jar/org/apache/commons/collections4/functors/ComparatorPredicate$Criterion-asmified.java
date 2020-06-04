package asm.org.apache.commons.collections4.functors;
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
public class ComparatorPredicate$CriterionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "Ljava/lang/Enum<Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "org/apache/commons/collections4/functors/ComparatorPredicate", "Criterion", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EQUAL", "Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GREATER", "Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LESS", "Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GREATER_OR_EQUAL", "Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LESS_OR_EQUAL", "Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "$VALUES", "[Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EQUAL");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "EQUAL", "Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GREATER");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "GREATER", "Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LESS");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "LESS", "Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GREATER_OR_EQUAL");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "GREATER_OR_EQUAL", "Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LESS_OR_EQUAL");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "LESS_OR_EQUAL", "Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "EQUAL", "Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "GREATER", "Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "LESS", "Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "GREATER_OR_EQUAL", "Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "LESS_OR_EQUAL", "Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections4/functors/ComparatorPredicate$Criterion", "$VALUES", "[Lorg/apache/commons/collections4/functors/ComparatorPredicate$Criterion;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
