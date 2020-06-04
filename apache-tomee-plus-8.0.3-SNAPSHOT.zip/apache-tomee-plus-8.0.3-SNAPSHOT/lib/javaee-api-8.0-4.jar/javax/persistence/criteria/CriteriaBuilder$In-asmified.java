package asm.javax.persistence.criteria;
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
public class CriteriaBuilder$InDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/persistence/criteria/CriteriaBuilder$In", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/persistence/criteria/Predicate;", "java/lang/Object", new String[] { "javax/persistence/criteria/Predicate" });

classWriter.visitInnerClass("javax/persistence/criteria/CriteriaBuilder$In", "javax/persistence/criteria/CriteriaBuilder", "In", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getExpression", "()Ljavax/persistence/criteria/Expression;", "()Ljavax/persistence/criteria/Expression<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "value", "(Ljava/lang/Object;)Ljavax/persistence/criteria/CriteriaBuilder$In;", "(TT;)Ljavax/persistence/criteria/CriteriaBuilder$In<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "value", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/CriteriaBuilder$In;", "(Ljavax/persistence/criteria/Expression<+TT;>;)Ljavax/persistence/criteria/CriteriaBuilder$In<TT;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
