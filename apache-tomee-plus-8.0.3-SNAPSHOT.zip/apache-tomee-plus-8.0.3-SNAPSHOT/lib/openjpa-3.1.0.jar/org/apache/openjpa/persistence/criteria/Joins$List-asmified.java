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
public class Joins$ListDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/persistence/criteria/Joins$List", "<Z:Ljava/lang/Object;E:Ljava/lang/Object;>Lorg/apache/openjpa/persistence/criteria/Joins$AbstractCollection<TZ;Ljava/util/List<TE;>;TE;>;Ljavax/persistence/criteria/ListJoin<TZ;TE;>;", "org/apache/openjpa/persistence/criteria/Joins$AbstractCollection", new String[] { "javax/persistence/criteria/ListJoin" });

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$ListAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "ListAttributeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$List", "org/apache/openjpa/persistence/criteria/Joins", "List", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$AbstractCollection", "org/apache/openjpa/persistence/criteria/Joins", "AbstractCollection", ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Index", "org/apache/openjpa/persistence/criteria/Expressions", "Index", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$PluralAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "PluralAttributeImpl", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$Member", "org/apache/openjpa/persistence/meta/Members", "Member", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$ListAttributeImpl;Ljavax/persistence/criteria/JoinType;)V", "(Lorg/apache/openjpa/persistence/criteria/FromImpl<*TZ;>;Lorg/apache/openjpa/persistence/meta/Members$ListAttributeImpl<-TZ;TE;>;Ljavax/persistence/criteria/JoinType;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Joins$AbstractCollection", "<init>", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$PluralAttributeImpl;Ljavax/persistence/criteria/JoinType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "on", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/ListJoin;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/ListJoin<TZ;TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JPA 2.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "on", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/ListJoin;", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/ListJoin<TZ;TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JPA 2.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOn", "()Ljavax/persistence/criteria/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JPA 2.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getModel", "()Ljavax/persistence/metamodel/ListAttribute;", "()Ljavax/persistence/metamodel/ListAttribute<-TZ;TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Joins$List", "_member", "Lorg/apache/openjpa/persistence/meta/Members$Member;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/persistence/metamodel/ListAttribute");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "index", "()Ljavax/persistence/criteria/Expression;", "()Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Index");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Index", "<init>", "(Lorg/apache/openjpa/persistence/criteria/Joins$List;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getModel", "()Ljavax/persistence/metamodel/PluralAttribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Joins$List", "getModel", "()Ljavax/persistence/metamodel/ListAttribute;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "on", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/Join;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Joins$List", "on", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/ListJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "on", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Join;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Joins$List", "on", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/ListJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getModel", "()Ljavax/persistence/metamodel/Bindable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Joins$List", "getModel", "()Ljavax/persistence/metamodel/ListAttribute;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
