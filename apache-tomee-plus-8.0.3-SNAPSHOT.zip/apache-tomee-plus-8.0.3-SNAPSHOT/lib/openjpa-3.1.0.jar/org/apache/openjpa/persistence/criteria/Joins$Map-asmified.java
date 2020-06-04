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
public class Joins$MapDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/persistence/criteria/Joins$Map", "<Z:Ljava/lang/Object;K:Ljava/lang/Object;V:Ljava/lang/Object;>Lorg/apache/openjpa/persistence/criteria/Joins$AbstractCollection<TZ;Ljava/util/Map<TK;TV;>;TV;>;Ljavax/persistence/criteria/MapJoin<TZ;TK;TV;>;", "org/apache/openjpa/persistence/criteria/Joins$AbstractCollection", new String[] { "javax/persistence/criteria/MapJoin" });

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$KeyJoin", "org/apache/openjpa/persistence/criteria/Joins", "KeyJoin", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$MapAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "MapAttributeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$Map", "org/apache/openjpa/persistence/criteria/Joins", "Map", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$KeyAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "KeyAttributeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$AbstractCollection", "org/apache/openjpa/persistence/criteria/Joins", "AbstractCollection", ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$MapEntry", "org/apache/openjpa/persistence/criteria/Joins", "MapEntry", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$MapKey", "org/apache/openjpa/persistence/criteria/Joins", "MapKey", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$PluralAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "PluralAttributeImpl", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$Member", "org/apache/openjpa/persistence/meta/Members", "Member", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_keyJoin", "Lorg/apache/openjpa/persistence/criteria/Joins$KeyJoin;", "Lorg/apache/openjpa/persistence/criteria/Joins$KeyJoin<TK;TV;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$MapAttributeImpl;Ljavax/persistence/criteria/JoinType;)V", "(Lorg/apache/openjpa/persistence/criteria/FromImpl<*TZ;>;Lorg/apache/openjpa/persistence/meta/Members$MapAttributeImpl<-TZ;TK;TV;>;Ljavax/persistence/criteria/JoinType;)V", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "on", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/MapJoin;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/MapJoin<TZ;TK;TV;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "on", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/MapJoin;", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/MapJoin<TZ;TK;TV;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getModel", "()Ljavax/persistence/metamodel/MapAttribute;", "()Ljavax/persistence/metamodel/MapAttribute<-TZ;TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Joins$Map", "_member", "Lorg/apache/openjpa/persistence/meta/Members$Member;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/persistence/metamodel/MapAttribute");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinKey", "()Ljavax/persistence/criteria/Join;", "()Ljavax/persistence/criteria/Join<Ljava/util/Map<TK;TV;>;TK;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/criteria/JoinType", "INNER", "Ljavax/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Joins$Map", "joinKey", "(Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinKey", "(Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join;", "(Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join<Ljava/util/Map<TK;TV;>;TK;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Joins$Map", "_member", "Lorg/apache/openjpa/persistence/meta/Members$Member;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/meta/Members$Member", "owner", "Lorg/apache/openjpa/persistence/meta/AbstractManagedType;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/meta/AbstractManagedType", "model", "Lorg/apache/openjpa/persistence/meta/MetamodelImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Joins$Map", "getModel", "()Ljavax/persistence/metamodel/MapAttribute;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/metamodel/MapAttribute", "getJavaType", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/MetamodelImpl", "getType", "(Ljava/lang/Class;)Ljavax/persistence/metamodel/Type;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/meta/AbstractManagedType");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/meta/Members$KeyAttributeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Joins$Map", "_member", "Lorg/apache/openjpa/persistence/meta/Members$Member;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/meta/Members$Member", "fmd", "Lorg/apache/openjpa/meta/FieldMetaData;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/meta/Members$KeyAttributeImpl", "<init>", "(Lorg/apache/openjpa/persistence/meta/AbstractManagedType;Lorg/apache/openjpa/meta/FieldMetaData;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Joins$KeyJoin");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Joins$KeyJoin", "<init>", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$KeyAttributeImpl;Ljavax/persistence/criteria/JoinType;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/criteria/Joins$Map", "_keyJoin", "Lorg/apache/openjpa/persistence/criteria/Joins$KeyJoin;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Joins$Map", "_keyJoin", "Lorg/apache/openjpa/persistence/criteria/Joins$KeyJoin;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "entry", "()Ljavax/persistence/criteria/Expression;", "()Ljavax/persistence/criteria/Expression<Ljava/util/Map$Entry<TK;TV;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Joins$MapEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Joins$MapEntry", "<init>", "(Lorg/apache/openjpa/persistence/criteria/Joins$Map;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "key", "()Ljavax/persistence/criteria/Path;", "()Ljavax/persistence/criteria/Path<TK;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Joins$MapKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Joins$MapKey", "<init>", "(Lorg/apache/openjpa/persistence/criteria/Joins$Map;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "value", "()Ljavax/persistence/criteria/Path;", "()Ljavax/persistence/criteria/Path<TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toKernelExpression", "(Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl;)Lorg/apache/openjpa/kernel/exps/Expression;", "(Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl<*>;)Lorg/apache/openjpa/kernel/exps/Expression;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Joins$Map", "_keyJoin", "Lorg/apache/openjpa/persistence/criteria/Joins$KeyJoin;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Joins$AbstractCollection", "toKernelExpression", "(Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl;)Lorg/apache/openjpa/kernel/exps/Expression;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/Joins$Map", "_keyJoin", "Lorg/apache/openjpa/persistence/criteria/Joins$KeyJoin;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Joins$KeyJoin", "toKernelExpression", "(Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl;)Lorg/apache/openjpa/kernel/exps/Expression;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openjpa/kernel/exps/Expression"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getModel", "()Ljavax/persistence/metamodel/PluralAttribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Joins$Map", "getModel", "()Ljavax/persistence/metamodel/MapAttribute;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "on", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/Join;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Joins$Map", "on", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/MapJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "on", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Join;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Joins$Map", "on", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/MapJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getModel", "()Ljavax/persistence/metamodel/Bindable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Joins$Map", "getModel", "()Ljavax/persistence/metamodel/MapAttribute;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
