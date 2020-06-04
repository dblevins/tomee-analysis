package asm.org.apache.commons.collections4;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections4/PredicateUtils", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "exceptionPredicate", "()Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>()Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/ExceptionPredicate", "exceptionPredicate", "()Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "truePredicate", "()Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>()Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/TruePredicate", "truePredicate", "()Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "falsePredicate", "()Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>()Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/FalsePredicate", "falsePredicate", "()Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullPredicate", "()Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>()Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/NullPredicate", "nullPredicate", "()Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "notNullPredicate", "()Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>()Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/NotNullPredicate", "notNullPredicate", "()Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "equalPredicate", "(Ljava/lang/Object;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(TT;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/EqualPredicate", "equalPredicate", "(Ljava/lang/Object;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "identityPredicate", "(Ljava/lang/Object;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(TT;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/IdentityPredicate", "identityPredicate", "(Ljava/lang/Object;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "instanceofPredicate", "(Ljava/lang/Class;)Lorg/apache/commons/collections4/Predicate;", "(Ljava/lang/Class<*>;)Lorg/apache/commons/collections4/Predicate<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/InstanceofPredicate", "instanceOfPredicate", "(Ljava/lang/Class;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "uniquePredicate", "()Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>()Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/UniquePredicate", "uniquePredicate", "()Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invokerPredicate", "(Ljava/lang/String;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(Ljava/lang/String;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/InvokerTransformer", "invokerTransformer", "(Ljava/lang/String;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/PredicateUtils", "asPredicate", "(Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invokerPredicate", "(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(Ljava/lang/String;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/InvokerTransformer", "invokerTransformer", "(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Lorg/apache/commons/collections4/Transformer;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/PredicateUtils", "asPredicate", "(Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "andPredicate", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Predicate<-TT;>;Lorg/apache/commons/collections4/Predicate<-TT;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/AndPredicate", "andPredicate", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "allPredicate", "([Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>([Lorg/apache/commons/collections4/Predicate<-TT;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/AllPredicate", "allPredicate", "([Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "allPredicate", "(Ljava/util/Collection;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(Ljava/util/Collection<+Lorg/apache/commons/collections4/Predicate<-TT;>;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/AllPredicate", "allPredicate", "(Ljava/util/Collection;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "orPredicate", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Predicate<-TT;>;Lorg/apache/commons/collections4/Predicate<-TT;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/OrPredicate", "orPredicate", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "anyPredicate", "([Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>([Lorg/apache/commons/collections4/Predicate<-TT;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/AnyPredicate", "anyPredicate", "([Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "anyPredicate", "(Ljava/util/Collection;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(Ljava/util/Collection<+Lorg/apache/commons/collections4/Predicate<-TT;>;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/AnyPredicate", "anyPredicate", "(Ljava/util/Collection;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "eitherPredicate", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Predicate<-TT;>;Lorg/apache/commons/collections4/Predicate<-TT;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/collections4/Predicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/PredicateUtils", "onePredicate", "([Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "onePredicate", "([Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>([Lorg/apache/commons/collections4/Predicate<-TT;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/OnePredicate", "onePredicate", "([Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "onePredicate", "(Ljava/util/Collection;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(Ljava/util/Collection<+Lorg/apache/commons/collections4/Predicate<-TT;>;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/OnePredicate", "onePredicate", "(Ljava/util/Collection;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "neitherPredicate", "(Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Predicate<-TT;>;Lorg/apache/commons/collections4/Predicate<-TT;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/collections4/Predicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/PredicateUtils", "nonePredicate", "([Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "nonePredicate", "([Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>([Lorg/apache/commons/collections4/Predicate<-TT;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/NonePredicate", "nonePredicate", "([Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nonePredicate", "(Ljava/util/Collection;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(Ljava/util/Collection<+Lorg/apache/commons/collections4/Predicate<-TT;>;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/NonePredicate", "nonePredicate", "(Ljava/util/Collection;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "notPredicate", "(Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Predicate<-TT;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/NotPredicate", "notPredicate", "(Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "asPredicate", "(Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Transformer<-TT;Ljava/lang/Boolean;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/TransformerPredicate", "transformerPredicate", "(Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullIsExceptionPredicate", "(Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Predicate<-TT;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/NullIsExceptionPredicate", "nullIsExceptionPredicate", "(Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullIsFalsePredicate", "(Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Predicate<-TT;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/NullIsFalsePredicate", "nullIsFalsePredicate", "(Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullIsTruePredicate", "(Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Predicate<-TT;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/NullIsTruePredicate", "nullIsTruePredicate", "(Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "transformedPredicate", "(Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", "<T:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Transformer<-TT;+TT;>;Lorg/apache/commons/collections4/Predicate<-TT;>;)Lorg/apache/commons/collections4/Predicate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/TransformedPredicate", "transformedPredicate", "(Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
