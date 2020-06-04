package asm.org.apache.openjpa.persistence.criteria;
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
public class PredicateImpl$OrDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/persistence/criteria/PredicateImpl$Or", null, "org/apache/openjpa/persistence/criteria/PredicateImpl", null);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/PredicateImpl$Or", "org/apache/openjpa/persistence/criteria/PredicateImpl", "Or", ACC_STATIC);

classWriter.visitInnerClass("javax/persistence/criteria/Predicate$BooleanOperator", "javax/persistence/criteria/Predicate", "BooleanOperator", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/criteria/Predicate$BooleanOperator", "OR", "Ljavax/persistence/criteria/Predicate$BooleanOperator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PredicateImpl", "<init>", "(Ljavax/persistence/criteria/Predicate$BooleanOperator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/PredicateImpl$Or", "add", "(Ljavax/persistence/criteria/Expression;)Lorg/apache/openjpa/persistence/criteria/PredicateImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/PredicateImpl", "add", "(Ljavax/persistence/criteria/Expression;)Lorg/apache/openjpa/persistence/criteria/PredicateImpl;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "<init>", "([Ljavax/persistence/criteria/Predicate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/criteria/Predicate$BooleanOperator", "OR", "Ljavax/persistence/criteria/Predicate$BooleanOperator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PredicateImpl", "<init>", "(Ljavax/persistence/criteria/Predicate$BooleanOperator;[Ljavax/persistence/criteria/Predicate;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "not", "()Ljavax/persistence/criteria/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PredicateImpl", "not", "()Lorg/apache/openjpa/persistence/criteria/PredicateImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
