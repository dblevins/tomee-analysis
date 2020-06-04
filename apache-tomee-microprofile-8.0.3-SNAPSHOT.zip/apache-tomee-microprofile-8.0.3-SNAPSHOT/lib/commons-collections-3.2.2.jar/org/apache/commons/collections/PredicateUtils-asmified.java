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
public class PredicateUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections/PredicateUtils", null, "java/lang/Object", null);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "exceptionPredicate", "()Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections/functors/ExceptionPredicate", "INSTANCE", "Lorg/apache/commons/collections/Predicate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "truePredicate", "()Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections/functors/TruePredicate", "INSTANCE", "Lorg/apache/commons/collections/Predicate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "falsePredicate", "()Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections/functors/FalsePredicate", "INSTANCE", "Lorg/apache/commons/collections/Predicate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullPredicate", "()Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections/functors/NullPredicate", "INSTANCE", "Lorg/apache/commons/collections/Predicate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "notNullPredicate", "()Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections/functors/NotNullPredicate", "INSTANCE", "Lorg/apache/commons/collections/Predicate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "equalPredicate", "(Ljava/lang/Object;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/EqualPredicate", "getInstance", "(Ljava/lang/Object;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "identityPredicate", "(Ljava/lang/Object;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/IdentityPredicate", "getInstance", "(Ljava/lang/Object;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "instanceofPredicate", "(Ljava/lang/Class;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/InstanceofPredicate", "getInstance", "(Ljava/lang/Class;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "uniquePredicate", "()Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/UniquePredicate", "getInstance", "()Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invokerPredicate", "(Ljava/lang/String;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/InvokerTransformer", "getInstance", "(Ljava/lang/String;)Lorg/apache/commons/collections/Transformer;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/PredicateUtils", "asPredicate", "(Lorg/apache/commons/collections/Transformer;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invokerPredicate", "(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/InvokerTransformer", "getInstance", "(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Lorg/apache/commons/collections/Transformer;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/PredicateUtils", "asPredicate", "(Lorg/apache/commons/collections/Transformer;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "andPredicate", "(Lorg/apache/commons/collections/Predicate;Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/AndPredicate", "getInstance", "(Lorg/apache/commons/collections/Predicate;Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "allPredicate", "([Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/AllPredicate", "getInstance", "([Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "allPredicate", "(Ljava/util/Collection;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/AllPredicate", "getInstance", "(Ljava/util/Collection;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "orPredicate", "(Lorg/apache/commons/collections/Predicate;Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/OrPredicate", "getInstance", "(Lorg/apache/commons/collections/Predicate;Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "anyPredicate", "([Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/AnyPredicate", "getInstance", "([Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "anyPredicate", "(Ljava/util/Collection;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/AnyPredicate", "getInstance", "(Ljava/util/Collection;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "eitherPredicate", "(Lorg/apache/commons/collections/Predicate;Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/collections/Predicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/PredicateUtils", "onePredicate", "([Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "onePredicate", "([Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/OnePredicate", "getInstance", "([Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "onePredicate", "(Ljava/util/Collection;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/OnePredicate", "getInstance", "(Ljava/util/Collection;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "neitherPredicate", "(Lorg/apache/commons/collections/Predicate;Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/collections/Predicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/PredicateUtils", "nonePredicate", "([Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nonePredicate", "([Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/NonePredicate", "getInstance", "([Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nonePredicate", "(Ljava/util/Collection;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/NonePredicate", "getInstance", "(Ljava/util/Collection;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "notPredicate", "(Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/NotPredicate", "getInstance", "(Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "asPredicate", "(Lorg/apache/commons/collections/Transformer;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/TransformerPredicate", "getInstance", "(Lorg/apache/commons/collections/Transformer;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullIsExceptionPredicate", "(Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/NullIsExceptionPredicate", "getInstance", "(Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullIsFalsePredicate", "(Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/NullIsFalsePredicate", "getInstance", "(Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullIsTruePredicate", "(Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/NullIsTruePredicate", "getInstance", "(Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "transformedPredicate", "(Lorg/apache/commons/collections/Transformer;Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/TransformedPredicate", "getInstance", "(Lorg/apache/commons/collections/Transformer;Lorg/apache/commons/collections/Predicate;)Lorg/apache/commons/collections/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
