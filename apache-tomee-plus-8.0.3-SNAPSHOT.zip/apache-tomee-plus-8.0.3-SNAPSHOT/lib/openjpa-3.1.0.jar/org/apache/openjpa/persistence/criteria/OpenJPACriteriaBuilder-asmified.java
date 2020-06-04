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
public class OpenJPACriteriaBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/persistence/criteria/OpenJPACriteriaBuilder", null, "java/lang/Object", new String[] { "jakarta/persistence/criteria/CriteriaBuilder" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LANG_CRITERIA", "Ljava/lang/String;", null, "jakarta.persistence.criteria");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "qbe", "(Ljakarta/persistence/criteria/From;Ljava/lang/Object;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;[Ljakarta/persistence/metamodel/Attribute;)Ljakarta/persistence/criteria/Predicate;", "<T:Ljava/lang/Object;>(Ljakarta/persistence/criteria/From<*TT;>;TT;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;[Ljakarta/persistence/metamodel/Attribute<**>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "qbe", "(Ljakarta/persistence/criteria/From;Ljava/lang/Object;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;)Ljakarta/persistence/criteria/Predicate;", "<T:Ljava/lang/Object;>(Ljakarta/persistence/criteria/From<*TT;>;TT;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "qbe", "(Ljakarta/persistence/criteria/From;Ljava/lang/Object;[Ljakarta/persistence/metamodel/Attribute;)Ljakarta/persistence/criteria/Predicate;", "<T:Ljava/lang/Object;>(Ljakarta/persistence/criteria/From<*TT;>;TT;[Ljakarta/persistence/metamodel/Attribute<**>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "qbe", "(Ljakarta/persistence/criteria/From;Ljava/lang/Object;)Ljakarta/persistence/criteria/Predicate;", "<T:Ljava/lang/Object;>(Ljakarta/persistence/criteria/From<*TT;>;TT;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "qbeStyle", "()Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMetamodel", "()Ljakarta/persistence/metamodel/Metamodel;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createQuery", "()Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery;", "()Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery<Ljava/lang/Object;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createQuery", "(Ljava/lang/Class;)Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createTupleQuery", "()Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery;", "()Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery<Ljakarta/persistence/Tuple;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "createTupleQuery", "()Ljakarta/persistence/criteria/CriteriaQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/criteria/OpenJPACriteriaBuilder", "createTupleQuery", "()Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "createQuery", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/CriteriaQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/criteria/OpenJPACriteriaBuilder", "createQuery", "(Ljava/lang/Class;)Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "createQuery", "()Ljakarta/persistence/criteria/CriteriaQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/criteria/OpenJPACriteriaBuilder", "createQuery", "()Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
