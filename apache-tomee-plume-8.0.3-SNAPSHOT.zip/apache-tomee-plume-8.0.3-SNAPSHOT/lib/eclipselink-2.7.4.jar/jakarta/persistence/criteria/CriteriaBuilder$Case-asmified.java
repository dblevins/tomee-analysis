package asm.jakarta.persistence.criteria;
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
public class CriteriaBuilder$CaseDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/persistence/criteria/CriteriaBuilder$Case", "<R:Ljava/lang/Object;>Ljava/lang/Object;Ljakarta/persistence/criteria/Expression<TR;>;", "java/lang/Object", new String[] { "jakarta/persistence/criteria/Expression" });

classWriter.visitInnerClass("jakarta/persistence/criteria/CriteriaBuilder$Case", "jakarta/persistence/criteria/CriteriaBuilder", "Case", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "when", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)Ljakarta/persistence/criteria/CriteriaBuilder$Case;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;TR;)Ljakarta/persistence/criteria/CriteriaBuilder$Case<TR;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "when", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/CriteriaBuilder$Case;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;Ljakarta/persistence/criteria/Expression<+TR;>;)Ljakarta/persistence/criteria/CriteriaBuilder$Case<TR;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "otherwise", "(Ljava/lang/Object;)Ljakarta/persistence/criteria/Expression;", "(TR;)Ljakarta/persistence/criteria/Expression<TR;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "otherwise", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+TR;>;)Ljakarta/persistence/criteria/Expression<TR;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
